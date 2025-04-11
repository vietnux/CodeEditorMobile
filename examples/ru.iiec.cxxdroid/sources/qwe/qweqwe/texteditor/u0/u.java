package qwe.qweqwe.texteditor.u0;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import qwe.qweqwe.texteditor.q0;

public class u {
    public static void a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(Uri.parse("market://details?id=" + str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean a(String str, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void b(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(q0.go_to_gp_dialog_message);
        builder.setNegativeButton(q0.go_to_gp_dialog_cancel, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(q0.go_to_gp_dialog_ok, new a(context, str));
        builder.show();
    }
}
