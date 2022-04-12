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

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.blankj.utilcode.util.ArrayUtils;
import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import com.google.android.material.tabs.TabLayoutMediator;
import com.tglt.code.editor.BuildConfig;
import com.tglt.code.editor.R;
import com.tglt.code.editor.ads.AdmobLib;

import io.github.rosemoe.sora.langs.EmptyLanguage;
import io.github.rosemoe.sora.langs.desc.CDescription;
import io.github.rosemoe.sora.langs.desc.CppDescription;
import io.github.rosemoe.sora.langs.desc.JavaScriptDescription;
import io.github.rosemoe.sora.langs.html.HTMLLanguage;
import io.github.rosemoe.sora.langs.java.JavaLanguage;
import io.github.rosemoe.sora.langs.python.PythonLanguage;
import io.github.rosemoe.sora.langs.universal.UniversalLanguage;
import com.tglt.code.editor.language.DartDescription;
import com.tglt.code.editor.language.PhpDescription;
import com.tglt.code.editor.language.SwiftDescription;
import io.github.rosemoe.sora.data.NavigationItem;

//import com.tglt.code.editor.utils.CompileString;
//import com.tglt.code.editor.utils.CrashHandler;
import com.tglt.code.editor.task.Task;
import com.tglt.code.editor.utils.JavaCompile;
import com.tglt.code.editor.utils.JsonParams;
import com.tglt.code.editor.utils.PyCompile;
import com.tglt.code.editor.utils.UtilsFiles;
//import com.tglt.code.editor.utils.GccCompile;
import com.tglt.code.editor.utils.cCompile.GccCompiler;

import io.github.rosemoe.sora.langs.css3.CSS3Language;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.EditorColorScheme;

//import javax.tools.DiagnosticCollector;
//import javax.tools.JavaCompiler;
//import javax.tools.JavaFileObject;
//import javax.tools.StandardJavaFileManager;
//import javax.tools.ToolProvider;

import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static MainActivity activity;
    private static Context context;

    private CodeEditor editor;
    private LinearLayout panel;
    private EditText search, replace;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

//    TagView tagGroup;

    private TabLayout mTablayout;
    private ViewPager2 mViewPager;
    private PagerAdapter pagerAdapter;
    private FragmentEditor fragmentSave;

    private ContentLoadingProgressBar progressWheel;
    private Boolean doubleBackToExitPressedOnce = false;

    private FloatingActionMenu fab;
    private FloatingActionButton fab_run;

    public static Context getContext() {
        return context;
    }
    public static MainActivity getActivity() {
        return activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity = this;
        this.context = this;

//        CrashHandler.INSTANCE.init(this);
        setContentView(R.layout.activity_main);

        checkAndAddPermissions(activity);

        drawerLayout = findViewById(R.id.activity_main_drawer);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        progressWheel = (ContentLoadingProgressBar) findViewById(R.id.progress);

        mTablayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager2) findViewById(R.id.viewPager_layout);
        pagerAdapter = new PagerAdapter( this );
        setTabs();

        fab = (FloatingActionMenu) findViewById(R.id.fab);
        FloatingActionButton fab_new = (FloatingActionButton) findViewById(R.id.fab_new);
        fab_run = (FloatingActionButton) findViewById(R.id.fab_run);
        FloatingActionButton fab_save = (FloatingActionButton) findViewById(R.id.fab_save);
        FloatingActionButton fab_save_as = (FloatingActionButton) findViewById(R.id.fab_save_as);

        fab.setOnMenuToggleListener( new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                hideKeyboard();
                fragmentSave = pagerAdapter.createFragment(mViewPager.getCurrentItem());
//                Log.e("FAB", fragmentSave.toString() );
                if( fragmentSave==null ) {
//                    fab.close(true);
                    fab_run.setEnabled(false);
                    fab_save.setEnabled(false);
                    fab_save_as.setEnabled(false);
                } else if( !UtilsFiles.is_debug(fragmentSave.getTabPath()) ) {
//                    fab_run.setVisibility(View.GONE);
                    fab_run.setEnabled(false);
                    fab_save.setEnabled(true);
                    fab_save_as.setEnabled(true);
                } else {
                    fab_run.setEnabled(true);
                    fab_save.setEnabled(true);
                    fab_save_as.setEnabled(true);
                }
            }
        });
        fab_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newEditor();
                pagerAdapter.notifyDataSetChanged();
                setTab();
                if (drawerLayout != null && drawerLayout.isDrawerOpen(Gravity.RIGHT) ) {
                    drawerLayout.closeDrawer(Gravity.LEFT, true);
                }
            }
        });
        fab_run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run( mViewPager.getCurrentItem() );
            }
        });
        fab_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save( mViewPager.getCurrentItem() );
            }
        });
        fab_save_as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveas( mViewPager.getCurrentItem() );
            }
        });

        if( UtilsFiles.is_galaxy_samsung && JsonParams.getParamInt("is_galaxy_samsung") == 0 ) {
            fab_run.setVisibility(View.GONE);
        }
    }

    private void checkAndAddPermissions(Activity activity) {
        boolean res = UtilsFiles.checkPermissions(activity);
//        Log.e("Extract", "checkAndAddPermissions: " +res );
    }

    void open() {
        Intent filesIntent = new Intent();
        filesIntent.setType("*/*");
        filesIntent.setAction(Intent.ACTION_GET_CONTENT);
        filesIntent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(filesIntent, "Select file"), UtilsFiles.OPEN_REQUEST_CODE);
    }
    void openFile(Uri uri){
        int p = pagerAdapter.checkExits(uri.getPath() );
//        Log.e("openFile", pagerAdapter.getItemCount()+" openFile: " +p );
        if( p == 0 ) {
            progressWheel.show();
            new Thread(() -> {
                try {
                    // open the user-picked file for reading:
                    InputStream in = getActivity().getContentResolver().openInputStream(uri);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String line;
                    StringBuilder text = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        text.append(line).append('\n');
                    }

                    runOnUiThread(() -> {
//                    editor.setText(text);
//                        String filename = uri.getPath();
//                        int posfilename = filename.lastIndexOf('/');
//                        if (posfilename != -1) {
//                            filename = filename.substring(posfilename + 1);
//                        }
                        FragmentEditor f = new FragmentEditor(context, text, uri, in);
                        pagerAdapter.addFragment(f);
//                        int position = pagerAdapter.checkExits(uri.getPath() );
//                        pagerAdapter.notifyAll();
                        pagerAdapter.notifyDataSetChanged();
//                        mViewPager.setAdapter(pagerAdapter);
                        mViewPager.setCurrentItem( pagerAdapter.mFragmentList.size() );
                        setTab();
                    });

//                addTag(filename);
//                drawerToggle.setDrawerIndicatorEnabled(false);
                } catch (IOException e) {
//                Log.e("App", e.getMessage() );
                    e.printStackTrace();
                }
            }).start();
        } else {
            mViewPager.setCurrentItem(p);
        }
//        Log.e("App", "==="+ () );
        if (drawerLayout != null  ) {
            drawerLayout.closeDrawer(Gravity.LEFT, true);
        }
    }

    //change tab
    public void setFilePath(Uri uri) {
//        Log.e("Main", " ==== "+path);
        for(int i=0; i<pagerAdapter.getItemCount(); i++) {
            if( pagerAdapter.createFragment(i) == fragmentSave) {
                fragmentSave.setFilePath(uri);
                pagerAdapter.getPageTitle(i);
                pagerAdapter.notifyDataSetChanged();
                break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        Log.e("FTPclient Result", requestCode+" Error: " +resultCode );
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == UtilsFiles.OPEN_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Uri uri = data.getData();
                openFile(uri);
            } else if (resultCode == RESULT_CANCELED) {
//                Log.i("App", "CANCEL");
            }
        } else if( requestCode == UtilsFiles.OPEN_SAVE_AS_CODE ){
            if (resultCode == RESULT_OK) {
                Uri uri = data.getData();
//                Log.e("fragmentSave", " = "+fragmentSave.getTabName() );
                UtilsFiles.save(context, uri, fragmentSave.getTabEditor().getText().toString() );
            }
        } else if( requestCode == UtilsFiles.REQUEST_SAVE_SUCCESS ){
            if (resultCode == RESULT_OK) {

            }
        } else if( requestCode == UtilsFiles.OPEN_REQUEST_CLIENT ){
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                String remoteFile = data.getStringExtra("remoteFile");
                int client_id = data.getIntExtra("client_id", 0);
//                Log.e("FTPclient re", client_id +" = "+UtilsFiles.clients.get( client_id ).toString() );
                progressWheel.show();
                if (drawerLayout != null && drawerLayout.isDrawerOpen(Gravity.RIGHT) ) {
                    drawerLayout.closeDrawer(Gravity.LEFT, true);
                }
                new Thread(() -> {
                    try {
                        // open the user-picked file for reading:
                        InputStream in = UtilsFiles.clients.get( client_id ).inputFile(this, remoteFile);
                        if( in == null ) { return;  }
                        BufferedReader br = new BufferedReader(new InputStreamReader(in));
                        String line;
                        StringBuilder text = new StringBuilder();
                        while ((line = br.readLine()) != null) {
                            text.append(line).append('\n');
                        }
//                        Log.e("FTPclient re", "Error: 2" );
                        runOnUiThread(() -> {
//                    editor.setText(text);
//                        String filename = uri.getPath();
//                        int posfilename = filename.lastIndexOf('/');
//                        if (posfilename != -1) {
//                            filename = filename.substring(posfilename + 1);
//                        }
                            FragmentEditor f = new FragmentEditor(context, text, remoteFile, in, client_id);
                            pagerAdapter.addFragment(f);
//                        int position = pagerAdapter.checkExits(uri.getPath() );
                            pagerAdapter.notifyDataSetChanged();
                            mViewPager.setCurrentItem( pagerAdapter.mFragmentList.size() );
                            setTab();

                        });

//                addTag(filename);
//                drawerToggle.setDrawerIndicatorEnabled(false);
                    } catch (IOException e) {
//                Log.e("FTPclient re", e.getMessage() );
                        e.printStackTrace();
                    }


                }).start();
            }
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        Log.e("===", item.getItemId() + " === " + R.id.nav_list );
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {
            case R.id.nav_new: {
                newEditor();
                pagerAdapter.notifyDataSetChanged();
                setTab();
                if (drawerLayout != null  ) {
                    drawerLayout.closeDrawer(Gravity.LEFT, true);
                }
                break;
            } case R.id.nav_sample: {
                example();

                break;
            }
            case R.id.nav_list: {
                open();
                break;
            }
            case R.id.nav_fpt: {
                Intent intent = new Intent(context, ClientActivity.class);
                startActivityForResult(intent, UtilsFiles.OPEN_REQUEST_CLIENT);
                break;
            }
            case R.id.nav_rate: {
                UtilsFiles.goToGooglePlay(this);
                break;
            }
            case R.id.nav_share: {
                UtilsFiles.shared(this);
                break;
            }
            case R.id.nav_send: {
                String message = "";
                if( !UtilsFiles.is_galaxy_samsung ) {
                    message = context.getString(R.string.about_description) + Uri.parse("https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                } else {
                    message = context.getString(R.string.about_description) + Uri.parse("https://galaxystore.samsung.com/detail/" + BuildConfig.APPLICATION_ID);
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"));
                intent.putExtra("sms_body", message);
                startActivity(intent);
                break;
            }
//            case R.id.nav_licenses: {
//                Intent intent = new Intent(context, LicenseActivity.class);
//                startActivityForResult(intent, 0);
//                break;
//            }
            case R.id.nav_about: {
                Intent intent = new Intent(context, AboutActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;
            }
        }
        //close navigation drawer
//        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home ) {
            hideKeyboard();
        }
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        int mTab = mViewPager.getCurrentItem();
        editor = pagerAdapter.getTabEditor(mTab);
        panel = pagerAdapter.getTabPanel(mTab);
        search = pagerAdapter.getTabSearch(mTab);
        replace = pagerAdapter.getTabReplace(mTab);

//        Log.e("===1", item.getItemId() + " === " + R.id.nav_list );

        switch (item.getItemId()) {
            case R.id.text_undo:
                editor.undo();
                break;
            case R.id.text_redo:
                editor.redo();
                break;
            case R.id.goto_end:
                editor.setSelection(editor.getText().getLineCount() - 1, editor.getText().getColumnCount(editor.getText().getLineCount() - 1));
                break;
            case R.id.move_up:
                editor.moveSelectionUp();
                break;
            case R.id.move_down:
                editor.moveSelectionDown();
                break;
            case R.id.home:
                editor.moveSelectionHome();
                break;
            case R.id.end:
                editor.moveSelectionEnd();
                break;
            case R.id.move_left:
                editor.moveSelectionLeft();
                break;
            case R.id.move_right:
                editor.moveSelectionRight();
                break;
            case R.id.code_navigation: {
                final List<NavigationItem> labels = editor.getTextAnalyzeResult().getNavigation();
                if (labels == null) {
                    Toast.makeText(this, R.string.navi_err_msg, Toast.LENGTH_SHORT).show();
                } else {
                    CharSequence[] items = new CharSequence[labels.size()];
                    for (int i = 0; i < labels.size(); i++) {
                        items[i] = labels.get(i).label;
                    }
//                    Log.e("labels", "="+labels.size());
                    new AlertDialog.Builder(this) .setTitle(R.string.code_navi)
                            .setSingleChoiceItems(items, 0, (dialog, i) -> {
                                editor.jumpToLine(labels.get(i).line);
                                dialog.dismiss();
                            })
                            .setPositiveButton(android.R.string.cancel, null)
                            .show();
                }
                break;
            }
            case R.id.code_format:
                editor.formatCodeAsync();
                break;
            case R.id.switch_language:
                new AlertDialog.Builder(this)
                        .setTitle(R.string.switch_language)
                        .setSingleChoiceItems( UtilsFiles.lang, pagerAdapter.getLangId(mTab), (dialog, which) -> {
                            switch (which) {
                                case 0:
                                    editor.setEditorLanguage(new UniversalLanguage(new CDescription()));
                                    break;
                                case 1:
                                    editor.setEditorLanguage(new UniversalLanguage(new CppDescription()));
                                    break;
                                case 2:
                                    editor.setEditorLanguage(new JavaLanguage());
                                    break;
                                case 3:
                                    editor.setEditorLanguage(new UniversalLanguage(new JavaScriptDescription()));
                                    break;
                                case 4:
                                    editor.setEditorLanguage(new HTMLLanguage());
                                    break;
                                case 5:
                                    editor.setEditorLanguage(new PythonLanguage());
                                    break;
                                case 6:
                                    editor.setEditorLanguage(new UniversalLanguage(new PhpDescription() ));
                                    break;
                                case 7: editor.setEditorLanguage(new UniversalLanguage(new DartDescription())); break;
                                case 8: editor.setEditorLanguage(new UniversalLanguage(new SwiftDescription())); break;
                                case 9:
                                    editor.setEditorLanguage(new CSS3Language());
                                    break;
                                case 10:
                                    editor.setEditorLanguage(new EmptyLanguage());
                            }
                            pagerAdapter.setLangId(mTab, which);
                            dialog.dismiss();
                        })
                        .setNegativeButton(android.R.string.cancel, null)
                        .show();
                break;
            case R.id.search_panel_st:
                if (panel.getVisibility() == View.GONE) {
                    replace.setText("");
                    search.setText("");
                    editor.getSearcher().stopSearch();
                    panel.setVisibility(View.VISIBLE);
                } else {
                    panel.setVisibility(View.GONE);
                    editor.getSearcher().stopSearch();
                }
                break;
            case R.id.search_am:
                replace.setText("");
                search.setText("");
                editor.getSearcher().stopSearch();
                editor.beginSearchMode();
                break;
            case R.id.switch_colors:
                String[] themes = new String[]{"Default", "GitHub", "Eclipse", "Darcula", "VS2019", "NotepadXX", "HTML"};
                new AlertDialog.Builder(this)
                        .setTitle(R.string.color_scheme)
                        .setSingleChoiceItems(themes, -1, (dialog, which) -> {
                            switch (which) {
                                case 0:
                                    editor.setColorScheme(new EditorColorScheme());
                                    break;
                                case 1:
                                    editor.setColorScheme(new SchemeGitHub());
                                    break;
                                case 2:
                                    editor.setColorScheme(new SchemeEclipse());
                                    break;
                                case 3:
                                    editor.setColorScheme(new SchemeDarcula());
                                    break;
                                case 4:
                                    editor.setColorScheme(new SchemeVS2019());
                                    break;
                                case 5:
                                    editor.setColorScheme(new SchemeNotepadXX());
                                    break;
                                case 6:
                                    editor.setColorScheme(new HTMLScheme());
                                    break;
                            }
                            dialog.dismiss();
                        })
                        .setNegativeButton(android.R.string.cancel, null)
                        .show();
                break;
            case R.id.text_wordwrap:
                item.setChecked(!item.isChecked());
                editor.setWordwrap(item.isChecked());
                break;
            case R.id.open_logs: {
                FileInputStream fis = null;
                try {
                    fis = openFileInput("crash-journal.log");
                    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append('\n');
                    }
                    Toast.makeText(this, "Succeeded", Toast.LENGTH_SHORT).show();
                    editor.setText(sb);
                } catch (Exception e) {
                    Toast.makeText(this, "Failed:" + e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            }
            case R.id.clear_logs: {
                FileOutputStream fos = null;
                try {
                    fos = openFileOutput("crash-journal.log", MODE_PRIVATE);
                    Toast.makeText(this, "Succeeded", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(this, "Failed:" + e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                } finally {
                    if (fos != null) {
                        try {
                            fos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            }
            case R.id.open_debug_logs: {
//                editor.setText(Logs.getLogs());
                break;
            }
            case R.id.editor_line_number: {
                editor.setLineNumberEnabled(!editor.isLineNumberEnabled());
                item.setChecked(editor.isLineNumberEnabled());
                break;
            } case R.id.pin_line_number: {
                editor.setPinLineNumber(!editor.isLineNumberPinned());
                item.setChecked(editor.isLineNumberPinned());
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
//
    public void gotoNext(View view) {
        try {
            editor.getSearcher().gotoNext();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void gotoLast(View view) {
        try {
            editor.getSearcher().gotoLast();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void replace(View view) {
        try {
            editor.getSearcher().replaceThis(replace.getText().toString());
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void replaceAll(View view) {
        try {
            editor.getSearcher().replaceAll(replace.getText().toString());
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void saveas(int position) {
        if( JsonParams.getParamInt("save") == 1 ) {
            new AdmobLib(this).adsInterstitialRandom();
        }

        fragmentSave = pagerAdapter.createFragment(position);
        Intent filesIntent = new Intent();
        filesIntent.setType("*/*");
        filesIntent.setAction(Intent.ACTION_CREATE_DOCUMENT);
        filesIntent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(filesIntent, "Save as file"), UtilsFiles.OPEN_SAVE_AS_CODE);
    }

    public void example() {
        new Thread(() -> {
            try {
                InputStream in= getAssets().open("sample.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader( in ));
                String line;
                StringBuilder text = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    text.append(line).append('\n');
                }
                runOnUiThread(() -> {
                    String tabName = "sample.java";
                    FragmentEditor f = new FragmentEditor(context, text, tabName, in, -1 );
                    pagerAdapter.addFragment( f );

                    pagerAdapter.notifyDataSetChanged();
                    setTab();
                    if (drawerLayout != null  ) {
                        drawerLayout.closeDrawer(Gravity.LEFT, true);
                    }

                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
    public void newEditor() {
        StringBuilder text = new StringBuilder();
        text.append("-");
        String tabName = setTabName("New file", 1);
        if( JsonParams.getParamInt("newEditor") == 1 && !tabName.equals("New file") ) {
            new AdmobLib(this).adsInterstitialRandom();
        }

//        Log.e("Main", "tab name: "+tabName +" = "+pagerAdapter.getItemCount() );
        FragmentEditor f = new FragmentEditor(context, text, tabName );
        pagerAdapter.addFragment( f );

    }
    public String setTabName(String tabname, int ext) {
//        Log.e("Main", "tab name: "+tabname +" = "+pagerAdapter.getItemCount() );
        for(int i=0; i<pagerAdapter.getItemCount(); i++) {
            if( pagerAdapter.getPageTitle(i).equals(tabname) ) {
                return setTabName("New file ("+ext+")", ++ext);
            }
        }

        return tabname;
    }

    private void setTabs() {
//        mTablayout.removeAllTabs();
        if( mTablayout.getTabCount() == 0) {
            newEditor();
//            example();
        }

        mViewPager.setAdapter(pagerAdapter);
//        mViewPager.setCurrentItem(0);
//        mTablayout.setupWithViewPager(mViewPager);
        // attaching tab mediator
        new TabLayoutMediator(mTablayout, mViewPager,
                (tab, position) -> tab.setText( pagerAdapter.getPageTitle(position) )).attach();
//        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTablayout));
        pagerAdapter.notifyDataSetChanged();
//        mViewPager.getAdapter().notifyDataSetChanged();

//        mTablayout.addTab();
        setTab();
        mTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fab.close(true);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public void setTab() {
        for(int i=0; i<pagerAdapter.getItemCount(); i++) {
            TabLayout.Tab tab = mTablayout.getTabAt(i);
            tab.setIcon( pagerAdapter.getPageIcon(i) );
        }
        setTabClick();
        progressWheel.hide();
//        pagerAdapter.notifyDataSetChanged();
    }
    public void setTabClick() {
        mViewPager.setUserInputEnabled(false);//chặn không cho trượt trái phải để đổi tab
        LinearLayout tabStrip = ((LinearLayout)mTablayout.getChildAt(0 ));
        if( tabStrip != null )
            for(int i = 0; i < tabStrip.getChildCount(); i++) {
                final int position = i;
                tabStrip.getChildAt(position).setOnLongClickListener(new View.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        PopupMenu popupMenu = new PopupMenu(context, tabStrip.getChildAt(position));
                        popupMenu.inflate(R.menu.popupmenu);
                        if( pagerAdapter.getItemCount() <  position) {
                            return false;
                        }
                        fragmentSave = pagerAdapter.createFragment(position);
                        //0,1,2,4,5 ==>fragmentSave.getLangId();
                        int[] lang_debug = new int[]{0,1,2,4,5};
                        if( !UtilsFiles.is_debug(fragmentSave.getTabPath() )
                                && ArrayUtils.contains( lang_debug, fragmentSave.getLangId() )
                                && lang_debug[fragmentSave.getLangId()] >= 0 ) {
                            //int lang_id = fragmentSave.getLangId();
                            popupMenu.getMenu().findItem(R.id.action_run).setVisible(false);
                            fab_run.setLabelVisibility(View.GONE);
                        }
                        if( UtilsFiles.is_galaxy_samsung && JsonParams.getParamInt("is_galaxy_samsung") == 0 ) {
                            popupMenu.getMenu().findItem(R.id.action_run).setVisible(false);
                        }
                        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem menuItem) {
                                int item = menuItem.getItemId();
                                if( item == R.id.action_save){
                                    save(position);
                                } else if(item == R.id.action_save_as){
                                    saveas(position);
                                } else if(item == R.id.action_run){
                                    run(position);
                                } else if(item == R.id.action_close) {
//                                    mTablayout.removeTabAt(position);
//                                    mTablayout.removeViewAt(position);
//                                    mViewPager.removeViewAt( position );

//                                    mFragmentList.remove(pos);
//                                    mFragmentIdList.remove(pos);
//                                    Log.e("RM", mViewPager.getCurrentItem()+" == "+position );
//
//                                    if(mViewPager.getCurrentItem() ==  position ) {
//                                        Log.e("RM", mViewPager.getCurrentItem()+" == "+position );
//                                        mViewPager.setCurrentItem(position+1);
//                                    }
                                    pagerAdapter.removeFragment(position);
//                                    mTablayout.getTabAt(position).getCustomView().setVisibility(View.GONE);//TabLayout.TAB_LABEL_VISIBILITY_UNLABELED);
//                                    mViewPager.getChildAt(position).setVisibility(View.GONE);

//                                    mTablayout.removeAllTabs();
//                                    mViewPager.removeAllViewsInLayout();
//                                    mViewPager.removeAllViews();
//                                    mViewPager.setAdapter(null);
//
//                                    mViewPager.setAdapter(pagerAdapter);
//                                    mViewPager.invalidate();
//                                    mViewPager.requestLayout();

                                    pagerAdapter.notifyDataSetChanged();
                                    setTab();
                                }
                                return true;
                            }
                        });
                        popupMenu.show();
//                        tabStrip.getChildAt(position).showContextMenu();
                        return false;
                    }
                });
            }
    }

    class PagerAdapter extends FragmentStateAdapter implements ViewPager2.PageTransformer {
        private final List<FragmentEditor> mFragmentList = new ArrayList<>();
        public PagerAdapter(@NonNull FragmentActivity fm) {
            super(fm);
        }
//        @Override
//        public FragmentEditor getItem(int position) {
////            if(fragmentSave!=null) fragmentSave.getTabEditor().exitModeIfNeeded();
//            try {
//                return mFragmentList.size() > 0 ? mFragmentList.get(position) : null;//mFragmentList.get(position);//new FragmentEditor(context, position, toolbar, drawer, mViewPager, appPreferences);
//            }catch (Exception e) {
////                Log.e("---???", e.getMessage() );
//                return null;
//            }
//        }
        public void addFragment(FragmentEditor fragment) {
            mFragmentList.add(fragment);
        }
        public void removeFragment(int position) {
            mFragmentList.remove(position);
//            notifyItemRangeChanged(position, mFragmentList.size() );
//            notifyDataSetChanged();
        }
        public void clearFragment() {  mFragmentList.clear();  }

//        @Override
//        public int getCount() {
////            notifyDataSetChanged();
//            return mFragmentList.size();
//        }

//        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentList.get(position).getTabName();
        }

        public int getPageIcon(int position) {
            return mFragmentList.get(position).getTabIcon();
        }
        public CodeEditor getTabEditor  (int position) { return mFragmentList.get(position).getTabEditor();  }
        public LinearLayout getTabPanel (int position) { return mFragmentList.get(position).getTabPanel(); }
        public EditText getTabSearch    (int position) { return mFragmentList.get(position).getTabSearch(); }
        public EditText getTabReplace   (int position) { return mFragmentList.get(position).getTabReplace(); }
        public int getLangId            (int position) { return mFragmentList.get(position).getLangId(); }
        public void setLangId           (int position, int _lang_id) { mFragmentList.get(position).setLangId(_lang_id); }

//        @Override
//        public float getPageWidth(int position) {
//            return super.getPageWidth(position);
//        }

        public int checkExits(String path) {
            for(int x=0; x<mFragmentList.size(); x++ ) {
                if( mFragmentList.get(x).getTabPath()!=null && mFragmentList.get(x).getTabPath().equals(path) ) {
                    return x;
                }
            }
            return 0;
        }

        @NonNull
        @Override
        public FragmentEditor createFragment(int position) {
            try {
                return mFragmentList.size() > 0 ? mFragmentList.get(position) : null;//mFragmentList.get(position);//new FragmentEditor(context, position, toolbar, drawer, mViewPager, appPreferences);
            }catch (Exception e) {
//                Log.e("---???", e.getMessage() );
                return null;
            }
        }

        @Override
        public int getItemCount() {
            return mFragmentList.size();
        }

        @Override
        public void transformPage(@NonNull View page, float position) {
            page.setTranslationX(-position * page.getWidth());
            page.setCameraDistance(12000);

            if (position < 0.5 && position > -0.5) {
                page.setVisibility(View.VISIBLE);
            } else {
                page.setVisibility(View.INVISIBLE);
            }


            if (position < -1) {     // [-Infinity,-1)
                page.setAlpha(0);

            } else if (position <= 0) {    // [-1,0]
                page.setAlpha(1);
                page.setRotationY(180 * (1 - Math.abs(position) + 1));

            } else if (position <= 1) {    // (0,1]
                page.setAlpha(1);
                page.setRotationY(-180 * (1 - Math.abs(position) + 1));

            } else {
                page.setAlpha(0);
            }
        }

        /*This is the method I was taking about => hàm này gây lỗi: The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: 3, found: 2 Pager id */
//        @Override
//        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//            removeFragment(position);
////            registeredFragments.remove(position);
//            super.destroyItem(container, position, object);
//        }
    }

    @Override
    public void onBackPressed() {
//        Log.e("Back", " getVisibility "+recyclerView.getVisibility() + " = "+searchItem.isVisible());
        if (drawerLayout != null && drawerLayout.isDrawerOpen(Gravity.RIGHT) ) {
            drawerLayout.closeDrawer(Gravity.LEFT, true);
        } else {
//            System.exit(0);
//            fragmentSave.getTabEditor().
            if (this.doubleBackToExitPressedOnce) {
//                finish();
//                onDestroy();
                moveTaskToBack(true); //Thao tác này sẽ ẩn ứng dụng của bạn cho đến khi người dùng muốn sử dụng lại.
//                System.exit(0);
//                getParent().finish();
//                super.onBackPressed();
                return;
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, R.string.tap_exit, Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }
    }

    public void save(int position) {
        fragmentSave = pagerAdapter.createFragment(position);
//        Log.e("Start Upload Process",fragmentSave.getTabUri()+ " Start Uploat " + position );
//        return;
        if( fragmentSave.getTabUri() == null ) {
            if( fragmentSave.getTabClientId() > -1 ) {
//                                            Log.e("Start Upload Process", "Start Upload Process 111111");
                UtilsFiles.clients.get( fragmentSave.getTabClientId() ).UploadFile(context, fragmentSave );
            } else {
                saveas(position);
            }
        } else {
            UtilsFiles.save(context, fragmentSave.getTabUri(), fragmentSave.getTabEditor().getText().toString() );
        }
    }
    public FragmentEditor getFragmentSave() {
        return fragmentSave;
    }
    public void run(int position) {
        fragmentSave = pagerAdapter.createFragment(position);
        int lang_id = fragmentSave.getLangId();
        if( lang_id == 2) run_java(); //java
        if( lang_id == 0 || lang_id == 1) run_c(lang_id); //c
        else if( lang_id == 4 ) { //html
            Intent intent = new Intent(context, WebviewRunHtml.class);
            startActivityForResult(intent, UtilsFiles.OPEN_RUN);
        } //html
        else if( lang_id == 6 ) {} //php
        else if( lang_id == 5 ) { run_py(lang_id); } //Python
    }
    void run_browner() {
        try {
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, fragmentSave.getTabUri());
            launchBrowser.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(launchBrowser);
        } catch (Exception e) {
            Log.e("URI", e.getMessage() );
        }
    }

    void run_java() {
        JavaCompile jc = new JavaCompile();
        jc.compileJava( );
    }

//    public native int main();
//    static {
//        System.loadLibrary("Compiler");
//    }
//    public static native void main();

    void run_c(int lang_id) {
        try {
             /* Start compile project in background thread */
            GccCompiler compile = new GccCompiler(this);
            compile.run();

//            GccCompile gcc = new GccCompile();
//            gcc.run();
//            if(lang_id==0) {
//                gcc.compileC();
//            } else {
//                gcc.compileGcc();
//            }

        } catch (Exception e) {
            Log.e("URI", e.getMessage() );
        }

    }

    void run_py(int lang_id) {
        try {
             /* Start compile project in background thread */
            PyCompile pycompile = new PyCompile(this);
            pycompile.run();
        } catch (Exception e) {
            Log.e("URI", e.getMessage() );
        }

    }

    public static void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
