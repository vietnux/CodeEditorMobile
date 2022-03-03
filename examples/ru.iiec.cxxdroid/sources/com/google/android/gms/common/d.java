package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.y;

public class d extends DialogFragment {

    /* renamed from: b  reason: collision with root package name */
    private Dialog f3585b = null;

    /* renamed from: c  reason: collision with root package name */
    private DialogInterface.OnCancelListener f3586c = null;

    public static d a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        d dVar = new d();
        y.a(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dVar.f3585b = dialog2;
        if (onCancelListener != null) {
            dVar.f3586c = onCancelListener;
        }
        return dVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3586c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3585b == null) {
            setShowsDialog(false);
        }
        return this.f3585b;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
