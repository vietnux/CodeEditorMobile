package com.tglt.code.editor.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.tglt.code.editor.BuildConfig;
import com.tglt.code.editor.R;
import com.tglt.code.editor.utils.JsonParams;
import com.tglt.code.editor.utils.RemoteJSONSource;
//import com.extractor.apkmanager.utils.UtilsUI;

//Yeah, I know this is weird code.
public class SplashScreen extends AppCompatActivity {
    private static final String TAG = "SplashScreen";
    public static final boolean DEBUG = !BuildConfig.BUILD_TYPE.equals("release");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if( JsonParams.DATA == null ) {
            try {
                new RemoteJSONSource(this).execute("");
            } catch ( Exception e ) {
                if (DEBUG) Log.e(TAG, "Error ads..." + e.toString() );
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
            }
        } else {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Log.e(TAG, " start   " + JsonParams.getParamInt("openapp"));
//        if( JsonParams.getParamInt("openapp") == 1 ) {
////            AdmobLib.getInstance(this).fetchAd();
//            AdmobLib.getInstance(this).showAdIfAvailable();
//        }
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
//        FacebookAudienceAdsLibs.getInstance( this ).onDestroy();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        onDestroy();
    }
}