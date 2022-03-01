package com.tglt.code.editor.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.tglt.code.editor.BuildConfig;
import com.tglt.code.editor.R;
import com.tglt.code.editor.ads.AdmobLib;
import com.tglt.code.editor.utils.AppPreferences;
import com.tglt.code.editor.utils.UtilsFiles;

public class AboutActivity extends AppCompatActivity {
    // Load Settings
    AppPreferences appPreferences;

    // About variables
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.context = this;

        setInitialConfiguration();
        setScreenElements();

        new AdmobLib(this).nativeads( R.id.nativeads_template );
    }

    private void setInitialConfiguration() {
        getSupportActionBar().setTitle( "About" );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    private void setScreenElements() {
        TextView header = (TextView) findViewById(R.id.header);
        TextView appNameVersion = (TextView) findViewById(R.id.app_name);
        CardView about_googleplay = (CardView) findViewById(R.id.about_googleplay);
        appNameVersion.setText(getResources().getString(R.string.app_name) + " "+BuildConfig.VERSION_NAME );
        about_googleplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UtilsFiles.goToGooglePlay(context);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_forward, R.anim.slide_out_right);
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

}
