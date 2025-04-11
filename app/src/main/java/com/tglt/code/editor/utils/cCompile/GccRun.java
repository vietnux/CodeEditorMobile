package com.tglt.code.editor.utils.cCompile;

import android.content.Context;
import android.widget.Toast;

import com.tglt.code.editor.project.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.tglt.code.editor.R;
//import ir.ashkanabd.cina.backgroundTasks.GccTask;
import com.tglt.code.editor.project.Project;
import com.tglt.code.editor.task.Task;

public class GccRun extends Task {

    private File externalFile;
    private Process runningProcess;
    private Scanner stdOut;
    private Scanner stdErr;
    private PrintWriter stdIn;
    private String userInput;
    private Context context;

    public GccRun(Context context, Project project) throws IOException {
        super();
        this.context = context;
        userInput = null;
        String internalPath = project.getOut() + "/" + project.getName();
        File internalFile = new File(internalPath);
        if (!internalFile.exists()) return;
        String externalPath = context.getFilesDir().getAbsolutePath() + "/projects/running_project";
        externalFile = new File(externalPath);
        externalFile.getParentFile().mkdirs();
        externalFile.createNewFile();
        externalFile.setExecutable(true, false);
        FileInputStream fileInStream = new FileInputStream(internalFile);
        FileOutputStream fileOutStream = new FileOutputStream(externalFile);
        byte[] buffer = new byte[4 * 1024];
        int count;
        while ((count = fileInStream.read(buffer)) != -1) {
            fileOutStream.write(buffer, 0, count);
        }
        fileInStream.close();
        fileOutStream.close();
    }

    @Override
    protected void onProgressUpdate(Object... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected Object doInBackground(Void... voids) {
        ExecutorService stdOutService = Executors.newSingleThreadExecutor();
        ExecutorService stdErrService = Executors.newSingleThreadExecutor();
        ExecutorService stdInService = Executors.newSingleThreadExecutor();
        Future<String> stdOutFuture = stdOutService.submit(stdOut::nextLine);
        Future<String> stdErrFuture = stdErrService.submit(stdErr::nextLine);
        Future<String> stdInFuture = stdInService.submit(this::readUserInput);
        String stdOutString, stdErrString, stdInString;
        int tolerance = 3;
        do {
            try {
                stdOutString = stdOutFuture.get(10, TimeUnit.MILLISECONDS);
                publishProgress(stdOutString);
                if (stdOutFuture.isDone()) {
                    stdOutFuture = stdOutService.submit(stdOut::nextLine);
                }
            } catch (Exception ignored) {
            }
            try {
                stdErrString = stdErrFuture.get(10, TimeUnit.MILLISECONDS);
                publishProgress(stdErrString);
                if (stdErrFuture.isDone()) {
                    stdErrFuture = stdErrService.submit(stdErr::nextLine);
                }
            } catch (Exception ignored) {
            }
            try {
                stdInString = stdInFuture.get(10, TimeUnit.MILLISECONDS);
                this.stdIn.print(stdInString);
                this.stdIn.flush();
                if (stdInFuture.isDone()) {
                    stdInFuture = stdInService.submit(this::readUserInput);
                }
            } catch (Exception ignored) {
            }
            if (!isAlive())
                tolerance--;
        } while (isAlive() || tolerance != 0);
        return runningProcess.exitValue();
    }

    @Override
    protected void onPreExecute() {
        try {
            runningProcess = Runtime.getRuntime().exec(externalFile.getAbsolutePath(), null, externalFile.getParentFile());
            stdOut = new Scanner(runningProcess.getInputStream());
            stdErr = new Scanner(runningProcess.getErrorStream());
            stdIn = new PrintWriter(runningProcess.getOutputStream(), true);
        } catch (IOException e) {
//            Toasty.error(context, context.getString(R.string.run_compiled_file_error), Toasty.LENGTH_SHORT, true).show();
            Toast.makeText(context, context.getString(R.string.run_compiled_file_error), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPostExecute(Object str) {
        super.onPostExecute(str);
    }

    private String readUserInput() {
        while (true) {
            if (userInput != null) {
                String str = userInput;
                userInput = null;
                return str;
            }
            try {
                Thread.sleep(10);
            } catch (Exception ignored) {
            }
        }
    }

    public void writeUserInput(String str) {
        userInput = str;
    }

    private boolean isAlive() {
        try {
            runningProcess.exitValue();
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}
