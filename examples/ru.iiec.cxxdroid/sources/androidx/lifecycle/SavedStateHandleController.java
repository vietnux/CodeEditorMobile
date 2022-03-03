package androidx.lifecycle;

import androidx.lifecycle.f;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;

final class SavedStateHandleController implements g {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private final r f1454b;

    /* access modifiers changed from: package-private */
    public static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(c cVar) {
            if (cVar instanceof v) {
                u e2 = ((v) cVar).e();
                SavedStateRegistry d2 = cVar.d();
                for (String str : e2.b()) {
                    SavedStateHandleController.a(e2.a(str), d2, cVar.a());
                }
                if (!e2.b().isEmpty()) {
                    d2.a(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    static void a(s sVar, SavedStateRegistry savedStateRegistry, f fVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) sVar.a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.a()) {
            savedStateHandleController.a(savedStateRegistry, fVar);
            b(savedStateRegistry, fVar);
        }
    }

    private static void b(final SavedStateRegistry savedStateRegistry, final f fVar) {
        f.c a2 = fVar.a();
        if (a2 == f.c.INITIALIZED || a2.a(f.c.STARTED)) {
            savedStateRegistry.a(a.class);
        } else {
            fVar.a(new g() {
                /* class androidx.lifecycle.SavedStateHandleController.AnonymousClass1 */

                @Override // androidx.lifecycle.g
                public void a(i iVar, f.b bVar) {
                    if (bVar == f.b.ON_START) {
                        f.this.b(this);
                        savedStateRegistry.a(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.b bVar) {
        if (bVar == f.b.ON_DESTROY) {
            this.a = false;
            iVar.a().b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(SavedStateRegistry savedStateRegistry, f fVar) {
        if (this.a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.a = true;
        fVar.a(this);
        this.f1454b.a();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.a;
    }
}
