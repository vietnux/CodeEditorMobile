package com.tglt.code.editor.app;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.tglt.code.editor.R;
//import com.xiaoyv.ccompile.CCppEngine;
import com.tglt.code.editor.utils.BufferedLiveEvent;
import com.xiaoyv.javaengine.JavaEngine;
import com.xiaoyv.javaengine.compile.listener.ExecuteListener;
import com.xiaoyv.javaengine.console.JavaConsole;

import java.io.File;


/**
 * 控制台
 *
 * @author 王怀玉
 * @since 2020/2/8
 */
public class ConsoleActivity extends AppCompatActivity {
    public static final String CONSOLE_ACTIVITY_DEX_PATH = "CONSOLE_ACTIVITY_DEX_PATH";
    public static final String CONSOLE_ACTIVITY_CLASS_NAME = "CONSOLE_ACTIVITY_CLASS_NAME";
    public static final String CONSOLE_ACTIVITY_TYPE = "CONSOLE_ACTIVITY_TYPE";

    private String className;
    private String dexPath;
    private String lang_type;

    private AppCompatTextView consoleOutput;
    private TextInputEditText inputEditView;
    /**
     * Java控制台对象
     */
    private JavaConsole javaConsole;

    public static void start(String dexPath, String className) {
        Intent intent = new Intent(Utils.getApp().getApplicationContext(), ConsoleActivity.class);
        intent.putExtra(CONSOLE_ACTIVITY_DEX_PATH, dexPath);
        intent.putExtra(CONSOLE_ACTIVITY_CLASS_NAME, className);
        ActivityUtils.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console);
        setInitialConfiguration();

        inputEditView = findViewById(R.id.inputEdit);

        dexPath = getIntent().getStringExtra(CONSOLE_ACTIVITY_DEX_PATH);
        className = getIntent().getStringExtra(CONSOLE_ACTIVITY_CLASS_NAME);
        lang_type = getIntent().getStringExtra(CONSOLE_ACTIVITY_TYPE);

        consoleOutput = findViewById(R.id.console_output);
        if(lang_type == "c") {
            rungcc();
        } else {
            runjava();
        }

    }
    private void setInitialConfiguration() {
        getSupportActionBar().setTitle( className );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home) {
            super.onBackPressed();
            overridePendingTransition(R.anim.fade_forward, R.anim.slide_out_right);
//            Toast.makeText(this, "OnBAckPressed Works", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void rungcc() {
        File file = new File(dexPath);

//        CCppEngine.getCExecutor().exec(file, new com.xiaoyv.ccompile.compiler.listener.ExecuteListener() {
//
//            @Override
//            public void onExecuteStart(Process process) {
//                Log.e("开始>>>>>>>", " process start");
//            }
//
//            @Override
//            public void printStderr(Throwable error) {
//                Log.e("错误>>>>>>>", error.toString());
//                error.printStackTrace();
//                showStderr(error.toString());
//            }
//
//            @Override
//            public void printStdout(CharSequence out) {
//                Log.e("输出>>>>>>>", out.toString());
//                showStdout(out);
//            }
//
//            @Override
//            public void onExecuteFinish(int waitFor, int exitValue) {
//                Log.e("完成>>>>>>>", "====================" + waitFor + "================" + exitValue);
//            }
//        });
    }

    public void runjava() {
        javaConsole = new JavaConsole(new JavaConsole.AppendStdListener() {
            @Override
            public void printStderr(CharSequence err) {
                showStderr(err);
            }

            @Override
            public void printStdout(CharSequence out) {
                showStdout(out);
            }
        });
        runDexFile(new String[]{""});
    }

    public void runDexFile(String[] args) {
        javaConsole.start();
        ExecuteListener executeListener = new ExecuteListener() {
            @Override
            public void onExecuteFinish() {
                LogUtils.i("End of run");
                javaConsole.stop();
            }

            @Override
            public void onExecuteError(Throwable error) {
                LogUtils.e("Run error ：" + error);
                javaConsole.stop();
            }
        };

        if (!StringUtils.isEmpty(className)) {
            JavaEngine.getDexExecutor().exec(dexPath, className, args, executeListener);
        } else {
            JavaEngine.getDexExecutor().exec(dexPath, args, executeListener);
        }
    }


    public void showStderr(CharSequence err) {
        consoleOutput.append(Html.fromHtml("<font color=\"#F00\">" + err.toString() + "</font>"));

    }

    public void showStdout(CharSequence out) {
        consoleOutput.append(out);
    }

    /**
     * 向控制台发送数据
     */
    public void sendStr(View view) {
        String str = String.valueOf(inputEditView.getText());
        if (!com.xiaoyv.javaengine.utils.StringUtils.isEmpty(str)) {
            javaConsole.inputStdin(str);
        }
        // 清空
        inputEditView.setText(null);
    }

    public static Spannable span(CharSequence text, Object... spans) {
        Spannable spanText = new SpannableStringBuilder(text);
        for (Object span : spans) {
            spanText.setSpan(span, 0, text.length(), 0);
        }
        return spanText;
    }

    public int resId(String type, String name) {
        Resources resources = this.getResources();
        return resources.getIdentifier(name, type, this.getApplicationInfo().packageName);

    }

    // =============================================================================================

    public static abstract class Task extends AndroidViewModel {

        private Thread.State state = Thread.State.NEW;

        public void start() {
            new Thread(() -> {
                try {
                    Task.this.run();
                    output(spanColor("[Finished]", resId("color", "console_meta")));
                } finally {
                    inputEnabled.postValue(false);
                    state = Thread.State.TERMINATED;
                }
            }).start();
            state = Thread.State.RUNNABLE;
        }

        public Thread.State getState() { return state; }

        public MutableLiveData<Boolean> inputEnabled = new MutableLiveData<>();
        public BufferedLiveEvent<CharSequence> output = new BufferedLiveEvent<>();

        public Task(Application app) {
            super(app);
            inputEnabled.setValue(false);
        }

        /** Override this method to provide the task's implementation. It will be called on a
         *  background thread. */
        public abstract void run();

        /** Called on the UI thread each time the user enters some input, A trailing newline is
         * always included. The base class implementation does nothing. */
        public void onInput(String text) {}

        public void output(final CharSequence text) {
            if (text.length() == 0) return;
            output.postValue(text);
        }

        public void outputError(CharSequence text) {
            output(spanColor(text, resId("color", "console_error")));
        }

        public Spannable spanColor(CharSequence text, int colorId) {
            int color = ContextCompat.getColor(this.getApplication(), colorId);
            return span(text, new ForegroundColorSpan(color));
        }

        public int resId(String type, String name) {
//            return Utils.resId(getApplication(), type, name);

            Resources resources = getApplication().getResources();
            return resources.getIdentifier(name, type, getApplication().getApplicationInfo().packageName);

        }
    }
}
