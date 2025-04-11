package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.f;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements g {
    private final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0021a f1453b = a.f1456c.a(this.a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        this.f1453b.a(iVar, bVar, this.a);
    }
}
