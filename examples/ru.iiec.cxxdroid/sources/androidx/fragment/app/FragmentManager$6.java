package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;

class FragmentManager$6 implements g {
    final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f1187b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f1188c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f1189d;

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        Bundle bundle;
        if (bVar == f.b.ON_START && (bundle = (Bundle) this.f1189d.f1320j.get(this.a)) != null) {
            this.f1187b.a(this.a, bundle);
            this.f1189d.a(this.a);
        }
        if (bVar == f.b.ON_DESTROY) {
            this.f1188c.b(this);
            this.f1189d.f1321k.remove(this.a);
        }
    }
}
