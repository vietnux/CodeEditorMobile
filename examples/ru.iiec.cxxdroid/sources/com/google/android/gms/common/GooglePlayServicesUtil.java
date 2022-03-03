package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.i;

public final class GooglePlayServicesUtil extends n {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = n.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3) {
        return getErrorDialog(i2, activity, i3, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (n.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        return g.a().a(activity, i2, i3, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return n.getErrorPendingIntent(i2, context, i3);
    }

    @Deprecated
    public static String getErrorString(int i2) {
        return n.getErrorString(i2);
    }

    public static Context getRemoteContext(Context context) {
        return n.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return n.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return n.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return n.isUserRecoverableError(i2);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3) {
        return showErrorDialogFragment(i2, activity, i3, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i2, activity, null, i3, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i2, Activity activity, Fragment fragment, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (n.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        g a = g.a();
        if (fragment == null) {
            return a.b(activity, i2, i3, onCancelListener);
        }
        Dialog a2 = g.a(activity, i2, i.a(fragment, g.a().a(activity, i2, "d"), i3), onCancelListener);
        if (a2 == null) {
            return false;
        }
        g.a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i2, Context context) {
        g a = g.a();
        if (n.isPlayServicesPossiblyUpdating(context, i2) || n.isPlayStorePossiblyUpdating(context, i2)) {
            a.c(context);
        } else {
            a.b(context, i2);
        }
    }
}
