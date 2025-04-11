package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import androidx.savedstate.c;

/* access modifiers changed from: package-private */
public class c0 implements e, c, v {

    /* renamed from: b  reason: collision with root package name */
    private final u f1246b;

    /* renamed from: c  reason: collision with root package name */
    private j f1247c = null;

    /* renamed from: d  reason: collision with root package name */
    private b f1248d = null;

    c0(Fragment fragment, u uVar) {
        this.f1246b = uVar;
    }

    @Override // androidx.lifecycle.i
    public f a() {
        b();
        return this.f1247c;
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        this.f1248d.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public void a(f.b bVar) {
        this.f1247c.a(bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(f.c cVar) {
        this.f1247c.b(cVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1247c == null) {
            this.f1247c = new j(this);
            this.f1248d = b.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        this.f1248d.b(bundle);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f1247c != null;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry d() {
        b();
        return this.f1248d.a();
    }

    @Override // androidx.lifecycle.v
    public u e() {
        b();
        return this.f1246b;
    }
}
