package com.tglt.code.editor.utils;

import android.Manifest;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileUtils;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.blankj.utilcode.util.ActivityUtils;
import com.tglt.code.editor.BuildConfig;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.R;
import com.tglt.code.editor.client.Client;
import com.tglt.code.editor.client.ClientInfo;
import io.github.rosemoe.sora.interfaces.EditorLanguage;
import io.github.rosemoe.sora.langs.EmptyLanguage;
import io.github.rosemoe.sora.langs.css3.CSS3Language;
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

public class UtilsFiles {
    public static boolean is_galaxy_samsung = false;
    private static final int MY_PERMISSIONS_REQUEST_WRITE_READ = 47;
    public static int OPEN_REQUEST_CODE = 1;
    public static int OPEN_SAVE_AS_CODE = 2;
    public static int REQUEST_SAVE_SUCCESS = 3;
    public static int OPEN_REQUEST_CLIENT = 4;
    public static int OPEN_RUN = 5;

    // General variables
    public static boolean refress = false;
    public static String[] lang = new String[]{"C", "C++", "Java", "JavaScript", "HTML", "Python", "PHP", "Dart", "Swift", "css3", "None"};

    public static List<String> appExtracts;
    public static List<String> languageJava = Arrays.asList(".java", ".jsp");
    public static List<String> languagePhp = Arrays.asList(".php", ".fphp", ".php4", ".php3");
    public static List<String> languageHtml = Arrays.asList(".html", ".htm", "shtml", ".xml", ".xsl", "scss", "smarty");
    public static List<String> languagePython = Arrays.asList(".py");

    public static List<String> languageDebug = Arrays.asList(".html", ".htm", "shtml", ".xml", ".xsl", ".java", ".c", ".cpp", ".py");

    public static List<Client> clients = new ArrayList<>();
    public static List<ClientInfo> clientsList = new ArrayList<>();

    /**
     * Default folder where APKs will be saved
     * @return File with the path
     */
    public static File getDefaultAppFolder() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            return MainActivity.getContext().getExternalFilesDir("../../../PKManager");
            new File(MainActivity.getContext().getFilesDir(), "CodeEditor");
//            new  Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        }
        return new File(Environment.getExternalStorageDirectory() + "/CoreEditor");
    }
    public static boolean pkMkdir(Context context) {
        Uri path = FileProvider.getUriForFile(context, BuildConfig.APPLICATION_ID, getDefaultAppFolder() );
        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

        try {
             context.startActivity(intent);
            return true;
        } catch (Exception e) {
//            Log.e("Extract",  "+pkMkdir: " +e.getMessage() );
        }
        return false;
    }


    public static Boolean save(Context context, Uri newPath, String data) {
        Boolean res = false;
        new ExportFile(context, data).execute(newPath);
        return res;
    }

    public static void CopyStream(InputStream is, OutputStream os) {
        final int buffer_size=1024;
        try
        {
            byte[] bytes=new byte[buffer_size];
            for(;;)
            {
                //Read byte from input stream

                int count=is.read(bytes, 0, buffer_size);
                if(count==-1)
                    break;

                //Write byte from output stream
                os.write(bytes, 0, count);
            }
        }
        catch(Exception ex){}
    }

    public static Boolean copyFile(InputStream f, String newPath, String newFilename) {
        Boolean res = false;
        try {
//        File initialFile = new File( f );
            InputStream in = f;
            File file = new File(newPath+'/'+newFilename);
            // Create parent folder:
            file.getParentFile().mkdirs();

            // FileOutputStream
            OutputStream os = new FileOutputStream(file);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                FileUtils.copy(in, os);
            } else {
                int line;
                while ((line = in.read()) != 0 ) {
                    os.write(line);
                }
            }
            os.close();
            res = true;
        } catch (IOException e) {
            e.printStackTrace();
//            Log.e("Extract", "initialFile: " +initialFile );
//            Log.e("Extract", "finalFile: " +finalFile );
        }

        return res;
    }

    /**
     * Opens Google Play if installed, if not opens browser
     * @param context Context
     */
    public static void goToGooglePlay(Context context) {
        if( is_galaxy_samsung ) {
            goToSamsungGalaxy(context);
        } else {
            final String appPackageName = context.getPackageName();
            try {
                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (ActivityNotFoundException e) {
                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
        }

    }
    public static void goToSamsungGalaxy(Context context) {
        final String appPackageName = context.getPackageName();
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://galaxystore.samsung.com/detail/" + appPackageName)));

    }
    public static void shared(Context context) {
        final String appPackageName = context.getPackageName();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.app_name) );

//        try {
////            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
//            intent.putExtra(Intent.EXTRA_TEXT, context.getString(R.string.about_description) + Uri.parse( "market://details?id=" + appPackageName ) );
//        } catch (ActivityNotFoundException e) {
        if( is_galaxy_samsung ) {
            intent.putExtra(Intent.EXTRA_TEXT, context.getString(R.string.about_description) + Uri.parse( "https://galaxystore.samsung.com/detail/" + appPackageName ) );
        } else {
            intent.putExtra(Intent.EXTRA_TEXT, context.getString(R.string.about_description) + Uri.parse( "https://play.google.com/store/apps/details?id=" + appPackageName ) );
        }
//        }

        context.startActivity(Intent.createChooser(intent,"Share using"));
    }

    /**
     * Opens Google Plus
     * @param context Context
     * @param id Name on Google Play
     */
    public static void goToGooglePlus(Context context, String id) {
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/" + id)));
    }

    /**
     * Retrieve your own app version
     * @param context Context
     * @return String with the app version
     */
    public static String getAppVersionName(Context context) {
        String res = "0.0.0.0";
        try {
            res = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    /**
     * Retrieve your own app version code
     * @param context Context
     * @return int with the app version code
     */
    public static int getAppVersionCode(Context context) {
        int res = 0;
        try {
            res = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    public static Intent getShareIntent(File file, Context context) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
            intent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", file));
        } else {
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
        }
        intent.setType("application/vnd.android.package-archive");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        return intent;
    }


//    @RequiresApi(api = Build.VERSION_CODES.R)
    public static Boolean checkPermissions(Activity activity) {
        Boolean res = false;

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.Q) {
//            Log.e("Permission", Build.VERSION_CODES.Q+"===="+ Environment.isExternalStorageManager() );
//            Environment.isExternalStorageManager();
            if (!Environment.isExternalStorageManager()) {
//                ActivityCompat.requestPermissions(activity, new String[]{
//                        Manifest.permission.READ_EXTERNAL_STORAGE,
//                        Manifest.permission.MANAGE_EXTERNAL_STORAGE,
//                        Manifest.permission.WRITE_EXTERNAL_STORAGE
//                }, 1);
//                Intent intent = new Intent();
//                intent.setAction(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
//                Uri uri = Uri.fromParts("package", activity.getPackageName(), null);
//                intent.setData(uri);
//                activity.startActivity(intent);
            }
        }
        if (ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ) {
            ActivityCompat.requestPermissions(activity, new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
//                    Manifest.permission.MANAGE_EXTERNAL_STORAGE
            }, MY_PERMISSIONS_REQUEST_WRITE_READ);
        } else {
            res = true;
        }

        return res;
    }

    public static EditorLanguage getLanguage(String filePath) {
        if( filePath==null ) {
            return null;
        }
        if( filePath.lastIndexOf('.') >=0 ) {
            String ext = filePath.substring( filePath.lastIndexOf('.') );
            if( ext.equals(".cpp") ) { return new UniversalLanguage(new CppDescription()); }
            else if( ext.equals(".c") ) { return new UniversalLanguage(new CDescription()); }
            else if( ext.equals(".js") || ext.equals(".ts") ) { return new UniversalLanguage(new JavaScriptDescription()); }
            else if( languagePhp.indexOf(ext) != -1 ) { return new UniversalLanguage(new PhpDescription() ); }
            else if( ext.equals(".dart") ) { return new UniversalLanguage(new DartDescription()); }
            else if( ext.equals(".swift") ) { return new UniversalLanguage(new SwiftDescription()); }
            else if( ext.equals(".css") ) { return new CSS3Language(); }
            else if( languageJava.indexOf(ext) != -1 ) {
                return new JavaLanguage();
            } else if( languageHtml.indexOf(ext) != -1 ) {
                return new HTMLLanguage();
            } else if( languagePython.indexOf(ext) != -1 ) {
                return new PythonLanguage();
            }
        }
        return new EmptyLanguage();
    }

    public static int getIcon(String filePath) {
        if( filePath==null ) {
            return R.drawable.default_file;
        }
        if( filePath.lastIndexOf('.') >=0 ) {
            String ext = filePath.substring( filePath.lastIndexOf('.') );
            String icon = null;
            Drawable d = null;
            if( ext.equals(".css") ) { return R.drawable.file_type_css;}
            else if( ext.equals(".cvs") ) { return R.drawable.file_type_cvs;}
            else if( ext.equals(".coffee") ) { return R.drawable.file_type_coffeescript;}
            else if( ext.equals(".db") ) { return R.drawable.file_type_db;}
            else if( ext.equals(".xls") || ext.equals(".xlsx") ) { return R.drawable.file_type_excel;}
            else if( ext.equals(".doc")  || ext.equals(".docx")  ) { return R.drawable.file_type_word;}
            else if( ext.equals(".c") ) { return R.drawable.file_type_c;}
            else if( ext.equals(".cpp") ) { return R.drawable.file_type_cpp;}
            else if( ext.equals(".firebase") ) { return R.drawable.file_type_firebase;}
            else if( ext.equals(".flutter") ) { return R.drawable.file_type_flutter;}
            else if( ext.equals(".dart") ) { return R.drawable.file_type_dartlang;}
            else if( ext.equals(".js") ) { return R.drawable.file_type_js;}
            else if( ext.equals(".json") ) { return R.drawable.file_type_json;}
            else if( ext.equals(".jsp") ) { return R.drawable.file_type_jsp;}
            else if( ext.equals(".kt") ) { return R.drawable.file_type_kotlin;}
            else if( ext.equals(".lua") ) { return R.drawable.file_type_lua;}
            else if( ext.equals(".pdf") ) { return R.drawable.file_type_pdf;}
            else if( ext.equals(".scss") ) { return R.drawable.file_type_scss;}
            else if( ext.equals(".smarty") ) { return R.drawable.file_type_smarty;}
            else if( ext.equals(".sql") ) { return R.drawable.file_type_sql;}
            else if( ext.equals(".sqlite") ) { return R.drawable.file_type_sqlite;}
            else if( ext.equals(".svg") ) { return R.drawable.file_type_svg;}
            else if( ext.equals(".swift") ) { return R.drawable.file_type_swift;}
            else if( ext.equals(".ts") ) { return R.drawable.file_type_typescript;}
            else if( ext.equals(".vscode") ) { return R.drawable.file_type_vscode;}
            else if( ext.equals(".wasm") ) { return R.drawable.file_type_wasm;}
            else if( ext.equals(".xcode") || ext.equals(".xcodeproj") || ext.equals(".xcworkspace") ) { return R.drawable.file_type_xcode;}
            else if( ext.equals(".xml") ) { return R.drawable.file_type_xml;}
            else if( ext.equals(".xsl") ) { return R.drawable.file_type_xsl;}
            else if( ext.equals(".zip") ) { return R.drawable.file_type_zip;}
            else if( languageJava.indexOf(ext) != -1 ) {
                return R.drawable.file_type_jar;
            } else if( languageHtml.indexOf(ext) != -1 ) {
                return R.drawable.file_type_html;
            } else if( languagePython.indexOf(ext) != -1 ) {
                return R.drawable.file_type_python;
            } else if( languagePhp.indexOf(ext) != -1 ) {
                return R.drawable.file_type_php;
            }
        }
        return R.drawable.default_file;
//        Resources res = context.getResources();
//        try {
//            // get input stream
//            InputStream ims = context.getAssets().open("icons\\"+icon);
//            // load image as Drawable
//            d = Drawable.createFromStream(ims, null);
////            d = new BitmapDrawable(res, ims);
////            img.setImageDrawable(d);
//            // set image to ImageView
////            mImage.setImageDrawable(d);
//            ims .close();
//        } catch(Exception ex) {
//            Log.e("Get Icon", icon+"= "+ex.getMessage() );
//        }
//        Log.e("Get Icon", icon+"= "+d );
//        return d;
    }

    //{"C", "C++", "Java", "JavaScript", "HTML", "Python", "None"};
    public static int getLangId(String filePath) {
        if( filePath==null ) {
            return 10;
        }
        if( filePath.lastIndexOf('.') >=0 ) {
            String ext = filePath.substring( filePath.lastIndexOf('.') );
            if( languageJava.indexOf(ext) != -1 ) {
                return 2;
            } else if( languageHtml.indexOf(ext) != -1 ) {
                return 4;
            } else if( languagePhp.indexOf(ext) != -1 ) {
                    return 6;
            } else if( languagePython.indexOf(ext) != -1 ) {
                return 5;
            }
            else if( ext.equals(".c") ){ return 0; }
            else if( ext.equals(".cpp") ){ return 1; }
            else if( ext.equals(".js") || ext.equals(".ts") ){ return 3; }
            else if( ext.equals(".dart") ){ return 7; }
            else if( ext.equals(".swift") ){ return 8; }
            else if( ext.equals(".css") ){ return 9; }
        }
        return 10;
    }

    public static boolean is_debug(String filePath) {
        if (filePath == null) {
            return false;
        }
        if (filePath.lastIndexOf('.') >= 0) {
            String ext = filePath.substring(filePath.lastIndexOf('.'));
            if (languageDebug.indexOf(ext) != -1) {
                return true;
            }
        }
        return false;
    }

    private static class ExportFile extends AsyncTask<Uri, Void, Boolean> {
        private final WeakReference<Context> context;
        private final String data;
        private Uri uri = null;

        ExportFile(Context c, String data) {
            context = new WeakReference<>(c);
            this.data = data;
        }

        @Override
        protected Boolean doInBackground(Uri... uris) {
            uri = uris[0];
            Context c = context.get();

            if( c == null ) {
                return false;
            }

            boolean success = false;

            try {
                ParcelFileDescriptor pfd = c.getContentResolver().openFileDescriptor(uri, "w");
                if( pfd != null ) {
                    FileOutputStream fileOutputStream = new FileOutputStream(pfd.getFileDescriptor());
                    fileOutputStream.write(data.getBytes());
                    fileOutputStream.close();
                    success = true;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return success;
        }

        @Override
        protected void onPostExecute(Boolean success) {
            super.onPostExecute(success);
            Context c = context.get();
            MainActivity.getActivity().setFilePath( uri );
            Toast.makeText(c, "The file was saved successfully!", Toast.LENGTH_SHORT).show();
        }
    }
}
