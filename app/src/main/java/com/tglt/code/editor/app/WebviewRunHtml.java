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
package com.tglt.code.editor.app;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tglt.code.editor.R;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WebviewRunHtml extends AppCompatActivity
{
    private WebView webView;
    private static ValueCallback<Uri> mUploadMessage;
    private static ValueCallback<Uri[]> mUploadMessage5;
    private final static int FILECHOOSER_RESULTCODE=1;
    private Context myContext;
    private Activity myActivity;
    private FragmentEditor fragmentSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        myContext = this;
        myActivity = this;

//        showLowResDeviceMessage();

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().getDisplayZoomControls();
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        // Create database folder
//        String databasePath = webView.getContext().getDir("databases", Context.MODE_PRIVATE).getPath();
//        webView.getSettings().setDatabasePath(databasePath);//
//        webView.getContext().getPackageName() + "/databases/";
//        String cache_path = getApplicationContext().getFilesDir().getAbsolutePath() + "/cache";

        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setSaveFormData(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webView.setWebContentsDebuggingEnabled(true);
//        webView.getSettings().setAppCachePath(cache_path);

        fragmentSave = MainActivity.getActivity().getFragmentSave();
        setInitialConfiguration();

        // LOADING THE HTML DOCUMENT
        String resultHTML = fragmentSave.getTabEditor().getText().toString();//fragmentSave.getTabClientId() == -1 ? fragmentSave.getTabEditor().getText().toString() :"";//loadAssetTextAsString("3DObjectMaker.htm");
        String baseUrl = null;//fragmentSave.getTabClientId() == -1 ? null : fragmentSave.getTabUri().getPath();
        String js = loadAssetTextAsString("hnl.mobileConsole.js").toString();//loadAssetTextAsString("3DObjectMaker.htm");
        resultHTML +=
                "<script type='text/javascript'>"+js+ "</script>"+
                    "  <script>window.addEventListener('load', function() {" +
                    "if (!mobileConsole.status.initialized) { " +
                    "        mobileConsole.init(); " +
                    "    }; " +
                    "}, false); </script><style>button{padding: 0px 20px !important;}</style>";

//        Log.e("webview_run", resultHTML);
        // LOADING THE WEBVIEW
        // Create an unencoded HTML string
//// then convert the unencoded HTML string into bytes, encode
//// it with Base64, and load the data.
//        String encodedHtml = Base64.encodeToString(resultHTML.getBytes(),
//                Base64.NO_PADDING);
//        webView.loadData(encodedHtml, "text/html; charset=utf-8", "base64");
        webView.loadDataWithBaseURL(baseUrl, resultHTML, "text/html", "utf-8", null);
//        webView.loadDataWithBaseURL("https://code.hnldesign.nl/demo/hnl.MobileConsole.html", null, "text/html; charset=utf-8", "utf-8", null);
//        String url = "file:///android_asset/hnl.mobileConsole.js";
//        webView.loadUrl("javascript:"+url);
//        webView.loadUrl("javascript:window.addEventListener('load', function() {" +
//                "if (!mobileConsole.status.initialized) { " +
//                "        mobileConsole.init(); " +
//                "    }; " +
//                "}, false);");

        webView.setWebChromeClient(new WebChromeClient()  {
            @Override public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                String stringMessage = consoleMessage.message();

                Log.e("WebviewRun", stringMessage + " -- From line " +
                        consoleMessage.lineNumber() + " of " + consoleMessage.sourceId() +" ::: "+consoleMessage.messageLevel() );
                Toast.makeText(MainActivity.getActivity(), stringMessage + " -- From line " +
                        consoleMessage.lineNumber() + " of " + consoleMessage.sourceId(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        if (Build.VERSION.SDK_INT>=23) //MARSHMALLOW
        {
            try  {
                iniciarVerificacionMarshmallow();
            }  catch(Exception e)
            {
            }
        }
    }
    private void setInitialConfiguration() {
        getSupportActionBar().setTitle( fragmentSave.getTabName() );
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

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK) {
            if (requestCode == FILECHOOSER_RESULTCODE) {
                if (Build.VERSION.SDK_INT >= 21) //LOLLIPOP
                {
                    try {
                        Uri result = intent == null || resultCode != RESULT_OK ? null : intent.getData();
                        mUploadMessage5.onReceiveValue(new Uri[]{result});
                        mUploadMessage5 = null;
                    } catch (Exception e) {
                    }
                }
            } else {
                try {
                    if (null == mUploadMessage) return;
                    Uri result = intent == null || resultCode != RESULT_OK ? null : intent.getData();
                    mUploadMessage.onReceiveValue(result);
                    mUploadMessage = null;
                } catch (Exception e) {
                }
            }
        } else {
            try {
                if (mUploadMessage5 != null) {
                    mUploadMessage5.onReceiveValue(null);
                    mUploadMessage5 = null;
                }

                if (mUploadMessage != null) {
                    mUploadMessage.onReceiveValue(null);
                    mUploadMessage = null;
                }
            } catch (Exception e) {
            }
        }
    }

    @Override public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override public boolean onKeyUp(int keyCode, KeyEvent event)
    {
        try
        {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0)
            {
//                clickInExit();
                return false;
            }
        }
        catch(NullPointerException e)
        {
        }
        return super.onKeyUp(keyCode, event);
    }

    private String loadAssetTextAsString(String name)
    {
        BufferedReader in = null;
        try
        {
            StringBuilder buf = new StringBuilder();
            InputStream is = getAssets().open(name);
            in = new BufferedReader(new InputStreamReader(is));

            String str;
            boolean isFirst = true;
            while ((str=in.readLine())!=null)
            {
                if (isFirst)
                {
                    isFirst = false;
                }
                else
                {
                    buf.append("\n");
                }
                buf.append(str);
            }
            return buf.toString();
        }
        catch (IOException e)
        {
        }
        finally
        {
            if (in!=null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                }
            }
        }
        return null;
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void iniciarVerificacionMarshmallow()
    {
        if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
        {
            String[] PERMISSIONS_STORAGE = {Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE};
            requestPermissions(PERMISSIONS_STORAGE, 123);
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    @Override public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==123)
        {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
            }
        }
    }

    private String getImportantNoteShowed()
    {
        String result = "";
        DataInputStream in = null;
        try
        {
            in = new DataInputStream(openFileInput("note.cfg"));
            for (;;)
            {
                result = result + in.readUTF();
            }
        }
        catch (Exception e)
        {
        }
        try
        {
            in.close();
        }
        catch(Exception e)
        {
        }
        return result;
    }

    private void setImportantNoteShowed()
    {
        try
        {
            DataOutputStream out = new DataOutputStream(openFileOutput("note.cfg", Context.MODE_PRIVATE));
            out.writeUTF("123");
            out.close();
        }
        catch(Exception e)
        {
        }
    }
}