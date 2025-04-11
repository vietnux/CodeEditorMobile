package com.tglt.code.editor.task;

import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BackgroundTask<A, B, C> extends AsyncTask<A, B, C> {

    protected OnBeforeTask onBeforeTask;
    protected OnTaskStarted onTaskStarted;
    protected OnPostTask onPostTask;
    protected OnUpdateTask onUpdateTask;

    @Override
    protected C doInBackground(A... as) {
        return (C) onTaskStarted.onStart(as);
    }

    public void updateProgress(B... value) {
        this.publishProgress(value);
    }

    @Override
    protected void onPreExecute() {
        if (onBeforeTask != null)
            onBeforeTask.onBefore();
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(C c) {
        if (onPostTask != null)
            onPostTask.onPost(c);
    }

    @Override
    protected void onProgressUpdate(B... values) {
        if (onUpdateTask != null)
            onUpdateTask.onUpdate(values);
    }

    public void setOnBeforeTask(@Nullable OnBeforeTask onBeforeTask) {
        this.onBeforeTask = onBeforeTask;
    }

    public void setOnTaskStarted(@NonNull OnTaskStarted onTaskStarted) {
        this.onTaskStarted = onTaskStarted;
    }

    public void setOnPostTask(@Nullable OnPostTask onPostStartTask) {
        this.onPostTask = onPostStartTask;
    }

    public void setOnUpdateTask(@Nullable OnUpdateTask onUpdateTask) {
        this.onUpdateTask = onUpdateTask;
    }

    public interface OnTaskStarted {

        Object onStart(Object... a);

        default void update(BackgroundTask task, Object... b) {
            task.publishProgress(b);
        }
    }

    public interface OnBeforeTask {
        void onBefore();
    }

    public interface OnPostTask {
        void onPost(Object c);
    }

    public interface OnUpdateTask {
        void onUpdate(Object... b);
    }
}
