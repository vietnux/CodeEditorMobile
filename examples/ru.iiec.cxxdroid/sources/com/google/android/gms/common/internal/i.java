package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;

public abstract class i implements DialogInterface.OnClickListener {
    public static i a(Activity activity, Intent intent, int i2) {
        return new g0(intent, activity, i2);
    }

    public static i a(Fragment fragment, Intent intent, int i2) {
        return new h0(intent, fragment, i2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
