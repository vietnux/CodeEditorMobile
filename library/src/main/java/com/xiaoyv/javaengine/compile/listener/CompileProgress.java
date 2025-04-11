package com.xiaoyv.javaengine.compile.listener;


import android.util.Log;

import org.eclipse.jdt.core.compiler.CompilationProgress;

/**
 * java 文件编译进度类
 */
public abstract class CompileProgress extends CompilationProgress {
    /**
     * 编译总数目
     */
    private int allSize = 0;

    /**
     * 编译完成数目
     */
    private int index = 0;

    @Override
    public void begin(int i) {
        allSize = i;
        index = 0;
        Log.e("Compilation progress", "Number of files to be compiled ：" + i);
    }

    @Override
    public void done() {

    }

    @Override
    public boolean isCanceled() {
        return false;
    }

    @Override
    public void setTaskName(String s) {
        int progress = (int) ((index / (allSize * 1.0f) * 100));
        onProgress(s, progress);
        Log.e("Compilation progress", "Current compilation first " + index + " file：" + s + " Total progress：" + progress);
        index++;
    }

    @Override
    public void worked(int workIncrement, int remainingWork) {

    }

    protected abstract void onProgress(String task, int progress);
}
