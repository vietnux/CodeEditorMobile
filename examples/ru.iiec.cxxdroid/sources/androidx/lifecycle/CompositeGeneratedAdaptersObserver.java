package androidx.lifecycle;

import androidx.lifecycle.f;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements g {
    private final c[] a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        m mVar = new m();
        for (c cVar : this.a) {
            cVar.a(iVar, bVar, false, mVar);
        }
        for (c cVar2 : this.a) {
            cVar2.a(iVar, bVar, true, mVar);
        }
    }
}
