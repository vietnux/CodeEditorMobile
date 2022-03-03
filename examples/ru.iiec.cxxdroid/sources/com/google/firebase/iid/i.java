package com.google.firebase.iid;

import com.google.firebase.components.c;
import com.google.firebase.components.d;
import com.google.firebase.iid.Registrar;

final /* synthetic */ class i implements d {
    static final d a = new i();

    private i() {
    }

    @Override // com.google.firebase.components.d
    public final Object a(c cVar) {
        return new Registrar.a((FirebaseInstanceId) cVar.a(FirebaseInstanceId.class));
    }
}
