package com.tglt.code.editor.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.text.LineBreaker;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.io.InputStream;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.SnackbarUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.tglt.code.editor.R;
import com.tglt.code.editor.utils.UtilsFiles;
import io.github.rosemoe.sora.widget.CodeEditor;
import com.tglt.code.editor.widget.SymbolInputView;

public class FragmentEditor extends Fragment  {
    private static final String TAG = "FragmentEditor";
    private CodeEditor editor;

    public static final String KEY_SEARCH_ENABLED = "SEARCH_ENABLED";
    private Context context;
    private StringBuilder text;
    private String tabname;
    private String filePath;
    private int client_id = -1;
    private int lang_id = -1;
    private InputStream in = null;
    private Uri uri = null;

    private LinearLayout panel;
    private EditText search, replace;
    View view;
    private View outputDialogLayout;

    private AlertDialog outputDialog;
    private AppCompatTextView outputConsole;
    private AppCompatImageView outputEditView;
    private AppCompatImageView outputCloseView;
    private ContentLoadingProgressBar outputProgressBar;

    public FragmentEditor() { }

    public FragmentEditor(Context context, StringBuilder text, String tabname) {
//        super(R.layout.activity_main_tab);
        this.text = text;
        this.tabname = tabname;
        this.context = context;
        this.filePath = null;
    }
    public FragmentEditor(Context context, StringBuilder text, Uri uri, InputStream in) {
        this.text = text;
        this.context = context;
        this.filePath = uri != null ? uri.getPath() : null;
        this.in = in;
        this.uri = uri;

        String filename=this.filePath;
        int posfilename = filename.lastIndexOf('/');
        filename = filename.substring(posfilename + 1);
        posfilename = filename.lastIndexOf(':');
        if (posfilename != -1) {
            filename = filename.substring(posfilename + 1);
        }
        this.tabname = filename;
    }
    public FragmentEditor(Context context, StringBuilder text, String remoteFile, InputStream in, int client_id) {
        this.text = text;
        this.context = context;
        this.filePath = remoteFile;
        this.in = in;
        this.client_id = client_id;

        String filename=this.filePath;
        int posfilename = filename.lastIndexOf('/');
        filename = filename.substring(posfilename + 1);
        posfilename = filename.lastIndexOf(':');
        if (posfilename != -1) {
            filename = filename.substring(posfilename + 1);
        }
        this.tabname = filename;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.activity_main_tab, container, false);

        panel = view.findViewById(R.id.search_panel);
        search = view.findViewById(R.id.search_editor);
        replace = view.findViewById(R.id.replace_editor);

        editor = view.findViewById(R.id.editor);
        editor.setTypefaceText(Typeface.MONOSPACE);
//        editor.setTypefaceText(Typeface.createFromAsset(context.getAssets(), "JetBrainsMono-Regular.ttf"));
        editor.setOverScrollEnabled(true);
        editor.setEditorLanguage( UtilsFiles.getLanguage( this.filePath) );
        editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
        editor.setLineNumberEnabled(true);
        editor.setPinLineNumber(true);

        editor.setText(text);
        editor.setTextSize(11);
        editor.setScrollBarEnabled(true);
//        editor.setWordwrap(true);
//        Log.e("openFile", " editorFile: " +text );
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void afterTextChanged(Editable editable) {
                editor.getSearcher().search(editable.toString());
            }
        });

        SymbolInputView inputView = view.findViewById(R.id.symbol_input);
        inputView.bindEditor(editor);
        inputView.addSymbols(new String[]{"->", "{", "}", "(", ")", ",", ".", ";", "\"", "?", "+", "-", "*", "/"},
                new String[]{"\t", "{}", "}", "(", ")", ",", ".", ";", "\"", "?", "+", "-", "*", "/"});

        outputDialogLayout  = LayoutInflater.from(MainActivity.getActivity() ).inflate(R.layout.fragment_editor_ouput, null);
        outputConsole       = outputDialogLayout.findViewById(R.id.editor_output_view);
        outputProgressBar   = outputDialogLayout.findViewById(R.id.editor_output_progress);
        outputEditView      = outputDialogLayout.findViewById(R.id.editor_output_edit);
        outputCloseView     = outputDialogLayout.findViewById(R.id.editor_output_close);
        return view;
    }

    public String getTabName() {
        return tabname;

    }
    public String getTabPath() {
        return filePath;
    }
    public int getTabClientId() {
        return client_id;
    }

    public int getTabIcon() {
        return UtilsFiles.getIcon(this.filePath);
    }

    public CodeEditor getTabEditor() { return editor; }
    public LinearLayout getTabPanel() { return panel; }
    public EditText getTabSearch() { return search; }
    public EditText getTabReplace() { return replace; }
    public InputStream getTabInputStream() { return in; }
    public Uri getTabUri() { return uri; }
    public int getLangId() {
        lang_id = lang_id < 0 ? UtilsFiles.getLangId(this.filePath) : lang_id;
        return lang_id;
    }
    public int setLangId(int _lang_id) { return lang_id = _lang_id; }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void setFilePath( Uri uri ) {
        this.uri = uri;
        this.filePath = uri.getPath();
        String filename=this.filePath;
        int posfilename = filename.lastIndexOf('/');
        filename = filename.substring(posfilename + 1);
        posfilename = filename.lastIndexOf(':');
        if (posfilename != -1) {
            filename = filename.substring(posfilename + 1);
        }
        this.tabname = filename;
    }

    public void showLog() {
        if (outputDialog == null) {
            outputCloseView.setOnClickListener(v ->
                    outputDialog.dismiss());
            outputEditView.setOnClickListener(v -> {
                outputConsole.setTextIsSelectable(true);
                outputConsole.requestFocus();
                Toast.makeText(context, R.string.editor_edit_log, Toast.LENGTH_SHORT).show();
            });
            outputDialog = new AlertDialog.Builder(MainActivity.getActivity(),  R.style.console_dialog )
                    .setView(outputDialogLayout)
                    .create();
            outputDialog.setCanceledOnTouchOutside(false);
        }

        outputDialog.show();
        outputConsole.setText(null);
        outputConsole.setTextIsSelectable(false);
//        outputConsole.setBreakStrategy(LineBreaker.BREAK_STRATEGY_SIMPLE);

        outputCloseView.setEnabled(false);
        outputProgressBar.setProgress(0);
        outputProgressBar.setIndeterminate(true);
        outputDialog.setCancelable(false);
        Window window = outputDialog.getWindow();
        if (window != null) {
            window.setGravity(Gravity.BOTTOM);
            window.getDecorView().setPadding(0, 0, 0, 0);
            Display display = MainActivity.getActivity().getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams lp = window.getAttributes();
            lp.width = display.getWidth(); // 设置满屏宽度
            lp.height = display.getHeight() / 2;// 设置半屏宽度
            window.setAttributes(lp);
        }
    }

    public void hideLog() {
        if (outputDialog.isShowing()) outputDialog.dismiss();
    }

    public void showProgress(String task, int progress) {
        if (!outputDialog.isShowing()) outputDialog.show();
        outputProgressBar.setIndeterminate(false);
        outputProgressBar.setProgress(progress);
        outputConsole.append(String.format(">>> Compilation progress：%s\n", FileUtils.getFileName(task)));
    }

    public void showErrorInfo(String err) {
        if (!outputDialog.isShowing()) outputDialog.show();
        outputCloseView.setEnabled(true);
        outputDialog.setOnDismissListener(null);
        outputConsole.append(Html.fromHtml("<br><font color=\"#FF0000\">" + err.replace("\n", "<br>") + "</font>"));
    }

    public void showNormalInfo(String out) {
        if (!outputDialog.isShowing()) outputDialog.show();
        outputConsole.append(out);
        outputConsole.append("\n");
    }

    public void showNormalResult(String out) {
        if (!outputDialog.isShowing()) outputDialog.show();
        outputConsole.append( Html.fromHtml("<br><font color=\"#fa7a18\">" + out.replace("\n", "<br>") + "</font>") );
        outputConsole.append("\n");
    }

    public void showLogDismissListener(String dexPath) {
        outputCloseView.setEnabled(true);
        System.gc();
//        outputDialog.setOnDismissListener(dialog -> {
//            // 运行Dex文件
//            Intent intent = new Intent(this.context, ConsoleActivity.class);
//            intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_DEX_PATH, dexPath);
////            intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_CLASS_NAME, null);
////            ConsoleActivity.start(dexPath, null);
//            startActivity(intent);
//        });
    }


}