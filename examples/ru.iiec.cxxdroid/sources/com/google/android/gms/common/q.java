package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import com.google.android.gms.common.internal.y;

public class q extends d {
    private Dialog p0 = null;
    private DialogInterface.OnCancelListener q0 = null;

    public static q a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        q qVar = new q();
        y.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        qVar.p0 = dialog2;
        if (onCancelListener != null) {
            qVar.q0 = onCancelListener;
        }
        return qVar;
    }

    @Override // androidx.fragment.app.d
    public void a(n nVar, String str) {
        super.a(nVar, str);
    }

    @Override // androidx.fragment.app.d
    public Dialog n(Bundle bundle) {
        if (this.p0 == null) {
            l(false);
        }
        return this.p0;
    }

    @Override // androidx.fragment.app.d
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
