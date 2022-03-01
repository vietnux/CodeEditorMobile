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
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.tglt.code.editor.R;
import com.tglt.code.editor.app.ConsoleActivity;
import com.tglt.code.editor.app.FragmentEditor;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.app.PythonConsoleActivity;
import com.xiaoyv.javaengine.JavaEngine;
import com.xiaoyv.javaengine.JavaEngineSetting;
import com.xiaoyv.javaengine.compile.listener.CompilerListener;
import com.xiaoyv.javaengine.compile.listener.ExecuteListener;
import com.xiaoyv.javaengine.console.JavaConsole;
import com.xiaoyv.javaengine.utils.FileIOUtils;
import com.xiaoyv.javaengine.utils.SPUtils;

public class PyCompile {

    private FragmentEditor fragmentSave;
    private JavaConsole javaConsole;
    private Activity context;

    public PyCompile(Activity context) {
        this.context = context;
    }
    public void run() {


        if (! Python.isStarted()) {
            Python.start( new AndroidPlatform( this.context ) );
        }

        Python py = Python.getInstance();
        PyObject pyobj = py.getModule("pyscript");

        fragmentSave = MainActivity.getActivity().getFragmentSave();
        fragmentSave.showLog();
        fragmentSave.showNormalInfo(MainActivity.getActivity().getString(R.string.editor_tips));

        PyObject obj = pyobj.callAttr("main", fragmentSave.getTabEditor().getText().toString() );

//        output.setText(obj.toString());

//            fragmentSave.showNormalInfo( obj.toString() );
//        fragmentSave.showLogDismissListener(null);
        if ( obj != null ) {
            ThreadUtils.runOnUiThread(() -> {
                fragmentSave.showNormalInfo( MainActivity.getActivity().getString(R.string.success_build_status));
                fragmentSave.showNormalResult( obj.toString() );
                fragmentSave.showLogDismissListener(null);
            } );

        } else {
            ThreadUtils.runOnUiThread(() -> fragmentSave.showErrorInfo( MainActivity.getActivity().getString(R.string.failed_build_status)) );

        }
        ThreadUtils.runOnUiThread(() -> fragmentSave.showNormalInfo( "\nTask ends! ") );

    }
}
