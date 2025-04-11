package com.tglt.code.editor.utils.cCompile;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.blankj.utilcode.util.ThreadUtils;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.tglt.code.editor.R;
import com.tglt.code.editor.app.ConsoleActivity;
import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.app.RunActivity;
import com.tglt.code.editor.project.Project;
import com.tglt.code.editor.project.ProjectManager;
import com.tglt.code.editor.task.BackgroundTask;
import com.tglt.code.editor.utils.UtilsFiles;
import com.xiaoyv.javaengine.utils.FileIOUtils;

import org.json.JSONException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


/*
 * Class for compiling source with GCC
 */
public class GccCompiler {
    private CompilerSetup compilerSetup;
    private Activity context;
    private File workspace;
    private String compileParams;
    private FragmentEditor fragmentSave;
    private Project selectedProject;
    private boolean compiled = false;

    /*
     * Check compiler in test it
     */
    public GccCompiler(Activity context) throws IOException {
        UtilsFiles.checkPermissions(context);
        this.compileParams = "";
        this.context = context;
        this.compilerSetup = new CompilerSetup(this.context);
        Log.d("CinA", "Checking compiler");
        if (!this.compilerSetup.checkCompiler()) {
            Log.d("CinA", "Compiler not found...");
            this.compilerSetup.copyCompiler("gcc.zip");
            this.compilerSetup.extractCompiler(this.compilerSetup.getCompilerZip());
            this.compilerSetup.getCompilerZip().delete();
        }
        this.workspace = this.compilerSetup.getCompilerZip().getParentFile();
        Log.d("CinA", "Compiler setup successfully");
    }
    public void run() {
        fragmentSave = MainActivity.getActivity().getFragmentSave();
        fragmentSave.showLog();
        fragmentSave.showNormalInfo(MainActivity.getActivity().getString(R.string.editor_tips));

        Task compileTask = new Task();
        compileTask.setOnTaskStarted((o) -> compileTask() );
        compileTask.setOnPostTask( this::compileTaskResult );
        compileTask.setOnUpdateTask( this::compileProgress );
        compileTask.execute();
    }

    /*
     * Compile with given source files and link it to project dir
     */
    public Object[] compile(Project project) throws IOException, InterruptedException {
        String compileParam = createCompileParam(project);
        Log.e("CinA", compileParam);
        //E/CinA: /data/user/0/ir.ashkanabd.cina/files/compiler/gcc/bin/aarch64-linux-android-gcc /storage/emulated/0/CinAProjects/abc/src/main.c -o abc -pie
        //E/CinA: /data/user/0/com.tglt.code.editor/files/compiler/gcc/bin/aarch64-linux-android-g++ /storage/emulated/0/CodeEditorProjects/main/src/main.cpp -o main -pie -std=c++11
        //E/CinA: /data/user/0/com.tglt.code.editor/files/compiler/gcc/bin/aarch64-linux-android-gcc /storage/emulated/0/CodeEditorProjects/main/src/main.c -o main -pie
        // W/System.err: java.io.IOException: Cannot run program "/storage/emulated/0/CodeEditorProjects/compiler/gcc/bin/aarch64-linux-android-gcc" (in directory "/storage/emulated/0/CodeEditorProjects/main/out"): error=13, Permission denied
//        Runtime.getRuntime().exec("chmod 0777 "+this.workspace.getAbsolutePath() );
//        Runtime.getRuntime().exec("chmod 0777 "+this.workspace.getAbsolutePath()+"/gcc/bin/aarch64-linux-android-gcc" );

//        Runtime.getRuntime().exec("su" );
//        p.wait();
//        String[] env = Environment.buildDefaultEnv(context);
//        String[] argv = new String[]{"/system/bin/sh"};
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Log.e("Permission", project.getOut() +": "+ Environment.isExternalStorageManager( new File(project.getOut()) ) );
//            Log.e("Permission", this.workspace.getAbsolutePath()+"/gcc/bin/aarch64-linux-android-gcc" +": "+ Environment.isExternalStorageManager( new File(this.workspace.getAbsolutePath()+"/gcc/bin/aarch64-linux-android-gcc") ) );
//            File ff = new File(context.getApplicationInfo().nativeLibraryDir);
//            Log.e("FILES", context.getApplicationInfo().nativeLibraryDir+" : "+Environment.isExternalStorageManager( ff )  );
////            ff = new File( ff.getParent() );
//
//            String[] fflist = ff.list();
////            Log.e("FILES", ff.getParent()+" : "+Environment.isExternalStorageManager( ff )  );
////
//            if (fflist != null)
//                for(int i = 0; i< fflist.length; i++)
//                    Log.e("Permission", "=="+fflist[i] ); ///lib/arm64

        }

        Process compileProcess = Runtime.getRuntime().exec(compileParam, null, new File(project.getOut()));
//        Process compileProcess = Runtime.getRuntime().exec(compileParam, null, new File(this.workspace.getAbsolutePath()+"/gcc/bin/" ));
//        Process compileProcess = new ProcessBuilder().command("sh", "-c", compileParam +" "+project.getOut() ).start();
//        compileProcess.wait();
        Scanner escn = new Scanner(compileProcess.getErrorStream());
        Scanner sscn = new Scanner(compileProcess.getInputStream());
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder eBuilder = new StringBuilder();
        while (sscn.hasNextLine()) {
            sBuilder.append(sscn.nextLine()).append("\n");
//            ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( sscn.nextLine() ));
        }
        while (escn.hasNextLine()) {
            eBuilder.append(escn.nextLine()).append("\n");
//            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( escn.nextLine() ));
        }
        return new Object[]{eBuilder.toString().isEmpty(), sBuilder.toString(), eBuilder.toString()};
    }

    public Object compileTask() {
        setCompileParams(compileParams); // compileParams = c || c++
//        compileTask.updateProgress("Linking source...\n");

        ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "Linking source..." ));

        long startTime = 0;
        StringBuilder builder = new StringBuilder();
        boolean success = false;
        try {
            Thread.sleep(500);
            ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "Starting created project..." ) );
            selectedProject = onCreateProject();

            ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "Starting compile..." ) );
//            compileTask.updateProgress("Starting compile...\n");

            Thread.sleep(500);
            startTime = System.currentTimeMillis();
            Object[] objs = compile(selectedProject);
            String stdout = (String) objs[1];
            String stderr = (String) objs[2];
            if ((boolean) objs[0]) {
                success = true;
                if (!stdout.isEmpty()) {
//                    builder.append("Compiled with warnings: ").append(stdout).append("\n");
                    ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "Compiled with warnings:\n"+stdout  ) );
                } else {
                    ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo("Compiled successfully.") );
                }
            } else {
                ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo("Compile error: \n"+stderr ));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String err = e.getMessage();
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo("Unknown error: \n"+err) );
        }
        long endTime = System.currentTimeMillis();
        return new Object[]{builder.toString(), (endTime - startTime) / 1000.0, success};
    }
//    public void createNewProject(View view) {
//
//        loadProjects();
//        setupListView();
//    }
    private Project onCreateProject() {
        Project project = null;
        try {
            ProjectManager projectManager = new ProjectManager();
            projectManager.readPreviousProjects();
            String ext = fragmentSave.getTabName().substring( fragmentSave.getTabName().lastIndexOf('.') );
            String projectName = fragmentSave.getTabName().substring( 0, fragmentSave.getTabName().lastIndexOf('.') );
            String projectDescription = fragmentSave.getTabEditor().getText().toString();
            boolean isC = ext.equals(".c") ;
            Log.e("project 0", "======= "+isC );
            project = projectManager.createNewProject(projectName, projectDescription, isC);

//            String gccFilePath = project.getDir()+"/"+fragmentSave.getTabName();
//            FileIOUtils.writeFileFromString(gccFilePath, fragmentSave.getTabEditor().getText().toString() );


//            if (project == null ) {
//                project = onProjectOpen( projectManager.getWorkspace(), projectName );
//            }
//            Log.e("project 0", "======= "+project );
            String project_src = project.getDir()+"/src";
            File main = isC ? new File(project_src, fragmentSave.getTabName() ) : new File(project_src, fragmentSave.getTabName());
            main.createNewFile();

            String fileInfo = Objects.requireNonNull( fragmentSave.getTabEditor().getText().toString() );
            ProjectManager.writeTargetFile(main, fileInfo);
            ArrayList<String> src = new ArrayList<>();
            src.add(main.getAbsolutePath());
            project.setSource(src);

            Log.e("project 1", fragmentSave.getTabPath() +" "+ projectName);
//            File cinaFile = project.getProjectFile();
//            boolean tmp = cinaFile.createNewFile();
//            if (!tmp) throw new IOException();
//            ProjectManager.writeFile(project.toJson().toString(), cinaFile);
        } catch (FileNotFoundException ignored) {
            /*
             * Ignore: a true will be selected...
             */
            Log.e("project err", ignored.getMessage() );
//        } catch (JSONException e) {
//            Log.e("project err", e.getMessage() );
//            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.invalid_project_file_selecting) ) );
        } catch (IOException e) {
            Log.e("project err IO", e.getMessage() );
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.invalid_project_file_selecting) ) );
        } catch (JSONException e) {
            e.printStackTrace();
            Log.e("project errJSON", e.getMessage() );
        }catch (Exception e) {
            e.printStackTrace();
            Log.e("project errFull", e.getMessage() );
        }
        return project;
    }

    /*
     * When a project selected to open
     */
    public Project onProjectOpen(File wspace, String projectName) {
        Project project = null;
        try {
            File file = new File(wspace, projectName);
//            if (file.isFile()) {
                project = new Project(ProjectManager.readFile(file));
//            }
        } catch (FileNotFoundException ignored) {
            /*
             * Ignore: a true will be selected...
             */
        } catch (JSONException e) {
            Log.e("project err IO", e.getMessage() );
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.invalid_project_file_selecting) ) );
        } catch (Exception e) {
            Log.e("project err read", e.getMessage() );
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.invalid_project_file_selecting) ) );
        }
        return project;
    }

    /*
     * Show compile result in UI thread
     */
    public void compileTaskResult(Object result) {
        Object[] objs = (Object[]) result;
        double endTime = (double) objs[1];
        String compileMsg = (String) objs[0];
//        String msg = MainActivity.getActivity().getString(R.string.success_build_status);
        if ((boolean) objs[2]) {
//            headerText = headerText.replace(this.getString(R.string.failed_build_status), this.getString(R.string.success_build_status));
            this.compiled = true;
            ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( MainActivity.getActivity().getString(R.string.success_build_status)) );
        } else {
//            headerText = headerText.replace(this.getString(R.string.success_build_status), this.getString(R.string.failed_build_status));
            this.compiled = false;
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.failed_build_status)) );
        }
        ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "\nTask ends in " + Double.toString(endTime) + "s") );
    }

    /*
     * Show GCC output while compiling in UI thread
     */
    public void compileProgress(Object... o) {
//        String msg = compilerOutput.getText().toString() + o[0];
//        compilerOutput.setText(msg);
//        ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( o[0] ) );
    }

    /*
     * Set compile params tp add in compile time
     */
    public void setCompileParams(String compileParams) {
        this.compileParams = compileParams;
    }

    /*
     * Create compile parameter from given source files
     */
    private String createCompileParam(Project project) {
        StringBuilder builder = new StringBuilder();
        if (project.getLang().equalsIgnoreCase("C++")) {
            builder.append(this.workspace.getAbsolutePath()).append("/gcc/bin/aarch64-linux-android-g++");
        } else {
            builder.append(this.workspace.getAbsolutePath()).append("/gcc/bin/aarch64-linux-android-gcc");
        }
//        if (project.getLang().equalsIgnoreCase("C++")) {
//            builder.append(context.getApplicationInfo().nativeLibraryDir).append("/bin/aarch64-linux-android-g++");
//        } else {
//            builder.append(context.getApplicationInfo().nativeLibraryDir).append("/bin/aarch64-linux-android-gcc");
//        }

        for (File file : project.getSourceAsFile()) {
            if (!file.isFile()) continue;
            builder.append(" ");
            builder.append(file.getAbsoluteFile());
        }
        builder.append(" -o ").append(project.getName()).append(" -pie ");
        if (project.getLang().equalsIgnoreCase("C++")) {
            builder.append("-std=c++11 ");
        }
        builder.append(compileParams);
        return builder.toString();
    }
//    private String createCompileParam(Project project) {
//        StringBuilder builder = new StringBuilder();
//        if (project.getLang().equalsIgnoreCase("C++")) {
//            builder.append(context.getApplicationInfo().nativeLibraryDir).append("/gcc/bin/aarch64-linux-android-g++");
//        } else {
//            builder.append(context.getApplicationInfo().nativeLibraryDir).append("/gcc/bin/aarch64-linux-android-gcc");
//        }
//    }

    public class Task extends BackgroundTask<Void, Object, Object> {

        protected MaterialAlertDialogBuilder loadingDialog;

        public Task() {
        }

        @Override
        protected Object doInBackground(Void... voids) {
            return super.doInBackground(voids);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Object str) {
            super.onPostExecute(str);
            fragmentSave.showLogDismissListener(null);
            if (compiled) {
                ThreadUtils.runOnUiThreadDelayed(() -> {
                Intent runIntent = new Intent(fragmentSave.getContext(), RunActivity.class);
                runIntent.putExtra("project", selectedProject);
                fragmentSave.getContext().startActivity(runIntent);

//
//                    Intent intent = new Intent(fragmentSave.getContext(), ConsoleActivity.class);
//                    intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_DEX_PATH, dexPath);
//                    //            intent.putExtra(ConsoleActivity.CONSOLE_ACTIVITY_CLASS_NAME, null);
//                    fragmentSave.getContext().startActivity(intent);
                }, 2000);
            } else {
//                Toasty.error(this, this.getString(R.string.not_compiled_project), Toasty.LENGTH_LONG, true).show();
            }
        }
    }

}
