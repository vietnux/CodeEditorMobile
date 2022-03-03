package androidx.activity.result;

import androidx.activity.result.e;
import androidx.activity.result.h.a;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;

class ActivityResultRegistry$1 implements g {
    final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f90b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f91c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e f92d;

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        if (f.b.ON_START.equals(bVar)) {
            this.f92d.f99f.put(this.a, new e.b<>(this.f90b, this.f91c));
            if (this.f92d.f100g.containsKey(this.a)) {
                Object obj = this.f92d.f100g.get(this.a);
                this.f92d.f100g.remove(this.a);
                this.f90b.a(obj);
            }
            a aVar = (a) this.f92d.f101h.getParcelable(this.a);
            if (aVar != null) {
                this.f92d.f101h.remove(this.a);
                this.f90b.a(this.f91c.a(aVar.b(), aVar.a()));
            }
        } else if (f.b.ON_STOP.equals(bVar)) {
            this.f92d.f99f.remove(this.a);
        } else if (f.b.ON_DESTROY.equals(bVar)) {
            this.f92d.a(this.a);
        }
    }
}
