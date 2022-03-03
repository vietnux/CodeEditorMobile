package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class ha0 {
    private final WeakReference<lg> a;

    /* renamed from: b  reason: collision with root package name */
    private String f4505b;

    public ha0(lg lgVar) {
        this.a = new WeakReference<>(lgVar);
    }

    public final void a(o1 o1Var) {
        o1Var.b("/loadHtml", new ia0(this, o1Var));
        o1Var.b("/showOverlay", new ka0(this, o1Var));
        o1Var.b("/hideOverlay", new la0(this, o1Var));
        lg lgVar = this.a.get();
        if (lgVar != null) {
            lgVar.b("/sendMessageToSdk", new ma0(this, o1Var));
        }
    }
}
