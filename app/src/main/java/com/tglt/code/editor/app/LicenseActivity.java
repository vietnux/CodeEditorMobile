package com.tglt.code.editor.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mikepenz.aboutlibraries.Libs;
import com.tglt.code.editor.R;
import com.mikepenz.aboutlibraries.LibsBuilder;
import com.mikepenz.aboutlibraries.ui.LibsActivity;

public class LicenseActivity extends LibsActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        new LibsBuilder()
//                .start(this);
        setIntent(new LibsBuilder()
                .withActivityTitle(getResources().getString(R.string.settings_license))
//                .withActivityStyle(Libs.ActivityStyle.LIGHT_DARK_TOOLBAR)
//                        .withLibraryModification(
//                                getString(R.string.license_mylicense_licenseName),
//                                Libs.LibraryFields.LIBRARY_WEBSITE,
//                                getString(R.string.license_mylicense_licenseWebsite)
//                        )
                .withAutoDetect(true)
                        .withAboutIconShown(true)
                        .withAboutVersionShown(true)
                .intent(this)

        );

        super.onCreate(savedInstanceState);
//        setInitialConfiguration();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_forward, R.anim.slide_out_right);
    }
//    private void setInitialConfiguration() {
//        getSupportActionBar().setTitle( getResources().getString(R.string.settings_license) );
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);
//    }

}
