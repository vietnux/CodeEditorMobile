/*
 *   Copyright 2020-2021 Rosemoe
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.tglt.code.editor.utils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.tglt.code.editor.R;
import com.tglt.code.editor.app.ConsoleActivity;
import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.app.MainActivity;
import com.xiaoyv.javaengine.JavaEngine;
import com.xiaoyv.javaengine.JavaEngineSetting;
import com.xiaoyv.javaengine.compile.listener.CompilerListener;
import com.xiaoyv.javaengine.compile.listener.ExecuteListener;
import com.xiaoyv.javaengine.console.JavaConsole;
import com.xiaoyv.javaengine.utils.FileIOUtils;
import com.xiaoyv.javaengine.utils.SPUtils;

public class JavaCompile  {
    /**
     * Java Console object
     */
    private JavaConsole javaConsole;

    private FragmentEditor fragmentSave;

//    public JavaCompile() {
//        run();
//    }
    public void run() {
        SPUtils.getInstance(JavaEngineSetting.KEY).put("compile_source", "1.8");
        SPUtils.getInstance(JavaEngineSetting.KEY).put("compile_target", "1.8");

        // 新建一个控制台对象，传入输出监听（回调为主线程）
        javaConsole = new JavaConsole(new JavaConsole.AppendStdListener() {
            @Override
            public void printStderr(CharSequence err) {
                Log.e("JavaConsole", "Err: "+err );
            }

            @Override
            public void printStdout(CharSequence out) {
                Log.e("JavaConsole", "Out: "+out );
            }
        });

    }

    /**
     * 开始编译
     */
    public void compileJava( ) {
        fragmentSave = MainActivity.getActivity().getFragmentSave();
        fragmentSave.showLog();
        fragmentSave.showNormalInfo(MainActivity.getActivity().getString(R.string.editor_tips));
//        view = fragmentSave.getView();
        // 创建Java文件，写入代码内容
        String javaFilePath = MainActivity.getContext().getExternalCacheDir() + "/Java/"+fragmentSave.getTabName();
//        String javaFilePath = MainActivity.getContext().getExternalCacheDir() + "/Java/Main.java";
        FileIOUtils.writeFileFromString(javaFilePath, fragmentSave.getTabEditor().getText().toString() );
//        FileIOUtils.writeFileFromString(javaFilePath, setInputSample() );
//        String javaFilePath = fragmentSave.getTabPath();
//        Log.e("W Tab", fragmentSave.getTabEditor().getText().toString() );

        // 保存 Class文件 的文件夹
        String saveClassFolder = MainActivity.getContext().getExternalCacheDir() + "/Class";

//        File saveClassFolder = new File(MainActivity.getContext().getExternalCacheDir() + "/class");
        // 编译 Java 文件
        JavaEngine.getClassCompiler().compile(javaFilePath, saveClassFolder, new CompilerListener() {
            @SuppressLint("StringFormatInvalid")
            @Override
            public void onSuccess(String path) {
                ThreadUtils.runOnUiThread(() ->
                        fragmentSave.showNormalInfo( MainActivity.getActivity().getString(R.string.editor_compilation_over  ,
                                fragmentSave.getTabName() )));
                // 编译成功 path 为class文件路径
                // 接下来将 class文件 转换为 Dex文件
                compileDex(path);
            }

            @Override
            public void onError(Throwable error) {
                // 编译失败
//                printView.setText(Html.fromHtml("<font color=\"#F00\">" + error.toString() + "</font>"));
                error.printStackTrace();
                ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo(error.getMessage()));
            }
            @Override
            public void onProgress(String task, int progress) {
//                view.showProgress(task.replace(PathUtils.getExternalAppDataPath(), ""), progress);
                fragmentSave.showProgress(task.replace(PathUtils.getExternalAppDataPath(), ""), progress);

            }
        });
    }

    /**
     * 将 Class文件 转换为 Dex文件
     *
     * @param classFilePath class文件路径
     */
    private void compileDex(String classFilePath) {
        // 先创建 Dex空白文件（不能创建在 classFilePath 的同级或子目录）
//        String dexFilePath = PathUtils.getExternalAppFilesPath() + "/SingleExample/Dex/Main.dex";
        String dexFilePath = MainActivity.getContext().getExternalCacheDir() + "/dex/temp.dex";

        JavaEngine.getDexCompiler().compile(classFilePath, dexFilePath, new CompilerListener() {
            @Override
            public void onSuccess(String dexPath) {
//                Log.e("compileDex", dexPath);
                ThreadUtils.runOnUiThread(() -> {
                    fragmentSave.showNormalInfo( MainActivity.getActivity().getString(R.string.editor_compilation_completed  ,
                            dexPath.replace(PathUtils.getExternalAppDataPath(), "")));
                    fragmentSave.showLogDismissListener(dexPath);
                });
                // 编译成功 path 为dex文件路径
                // 接下运行 dex文件
//                runDex(dexPath);

                ThreadUtils.runOnUiThreadDelayed(() -> {
                    Intent intent = new Intent(fragmentSave.getContext(), ConsoleActivity.class);
                    intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_DEX_PATH, dexPath);
                    intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_TYPE, "java");
    //            intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_CLASS_NAME, null);
                    fragmentSave.getContext().startActivity(intent);
                }, 2000);
            }

            @Override
            public void onError(Throwable error) {
                // 转换失败
//                printView.setText(Html.fromHtml("<font color=\"#F00\">" + error.toString() + "</font>"));
                error.printStackTrace();
//                Log.e("compileDex", "error: == "+error.getMessage() );

                ThreadUtils.runOnUiThread(() -> {
                    fragmentSave.showErrorInfo( error.getMessage() );
                    fragmentSave.showLogDismissListener("");
                });
            }
            @Override
            public void onProgress(String task, int progress) {
//                view.showProgress(task.replace(PathUtils.getExternalAppDataPath(), ""), progress);
            }
        });
    }


    /**
     * 运行 Dex文件
     *
     * @param dexPath Dex文件路径
     */
    private void runDex(String dexPath) {
        // 运行 Dex文件前，必须开启控制台
        // 运行 Dex文件前，必须开启控制台
        // 运行 Dex文件前，必须开启控制台
        javaConsole.start();

        // 第二个参数为运行时，传入 main(String[] args)方法 的参数 args
        String[] args = new String[]{};
        JavaEngine.getDexExecutor().exec(dexPath,  args, new ExecuteListener() {
            @Override
            public void onExecuteFinish() {
                // 运行完成，关闭控制台
                javaConsole.stop();
//                Log.e("JavaConsole", "onExecuteFinish : ");
            }

            @Override
            public void onExecuteError(Throwable error) {
                // 运行完成，关闭控制台
                javaConsole.stop();
//                Log.e("JavaConsole", "onExecuteError : " + error.getMessage());

                // 执行出错
//                printView.setText(Html.fromHtml("<font color=\"#F00\">" + error.toString() + "</font>"));
                error.printStackTrace();
            }
        });

    }

    /**
     * 向控制台发送数据
     */
    public void sendStr(View view) {
//        String str = String.valueOf(inputEditView.getText());
//        if (!StringUtils.isEmpty(str)) {
//            javaConsole.inputStdin(str);
//        }
//        // 清空
//        inputEditView.setText(null);
    }

    @SuppressLint("SetTextI18n")
    private String setOutputSample() {
        return ("public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello World\");\n" +
                "        System.out.println(\"This is a Java Compiler\");\n" +
                "        System.out.println(\"Countdown start\");\n" +
                "        for (int i = 5; i > 0; i--) {\n" +
                "            System.out.println(i);\n" +
                "            try {\n" +
                "                Thread.sleep(1000);\n" +
                "            } catch (InterruptedException e) {\n" +
                "                e.printStackTrace();\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.println(\"I am back again\");\n" +
                "    }\n" +
                "}\n");
    }

    @SuppressLint("SetTextI18n")
    private String setInputSample() {
        return ("import java.util.Scanner;\n\n" +
                "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello System.in\");\n" +
                "        System.out.println(\"Please enter something\");\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        String line = scanner.nextLine();\n" +
                "        System.out.println(\"The following is your input:\");\n" +
                "        System.out.println(line);\n" +
                "    }\n" +
                "}");
    }
}
