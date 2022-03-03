package ru.iiec.cxxdroid.gui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class JumpActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent();
        Bundle extras = getIntent().getExtras();
        intent.setComponent(new ComponentName(extras.getString("JUMP_PACKAGE_NAME"), extras.getString("JUMP_CLASS_NAME")));
        extras.remove("JUMP_PACKAGE_NAME");
        extras.remove("JUMP_CLASS_NAME");
        intent.addFlags(65536);
        intent.putExtras(extras);
        startActivityForResult(intent, 12345);
        overridePendingTransition(0, 0);
    }
}
