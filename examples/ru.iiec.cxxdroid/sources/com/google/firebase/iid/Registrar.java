package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements e {

    /* access modifiers changed from: private */
    public static class a implements com.google.firebase.iid.a.a {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Override // com.google.firebase.components.e
    @Keep
    public final List<com.google.firebase.components.a<?>> getComponents() {
        a.C0092a a2 = com.google.firebase.components.a.a(FirebaseInstanceId.class);
        a2.a(f.a(e.b.c.a.class));
        a2.a(h.a);
        a2.a();
        com.google.firebase.components.a b2 = a2.b();
        a.C0092a a3 = com.google.firebase.components.a.a(com.google.firebase.iid.a.a.class);
        a3.a(f.a(FirebaseInstanceId.class));
        a3.a(i.a);
        return Arrays.asList(b2, a3.b());
    }
}
