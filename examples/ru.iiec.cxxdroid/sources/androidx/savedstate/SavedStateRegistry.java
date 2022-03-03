package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {
    private c.b.a.b.b<String, b> a = new c.b.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1729b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1730c;

    /* renamed from: d  reason: collision with root package name */
    private Recreator.a f1731d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1732e = true;

    public interface a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (this.f1730c) {
            Bundle bundle = this.f1729b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1729b.remove(str);
            if (this.f1729b.isEmpty()) {
                this.f1729b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1729b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        c.b.a.b.b<K, V>.d c2 = this.a.c();
        while (c2.hasNext()) {
            Map.Entry entry = (Map.Entry) c2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: package-private */
    public void a(f fVar, Bundle bundle) {
        if (!this.f1730c) {
            if (bundle != null) {
                this.f1729b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            fVar.a(new d() {
                /* class androidx.savedstate.SavedStateRegistry.AnonymousClass1 */

                @Override // androidx.lifecycle.g
                public void a(i iVar, f.b bVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (bVar == f.b.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (bVar == f.b.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f1732e = z;
                }
            });
            this.f1730c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void a(Class<? extends a> cls) {
        if (this.f1732e) {
            if (this.f1731d == null) {
                this.f1731d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1731d.a(cls.getName());
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public void a(String str, b bVar) {
        if (this.a.b(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
