package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class q extends s {

    /* renamed from: i  reason: collision with root package name */
    private static final t.a f1345i = new a();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Fragment> f1346b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, q> f1347c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, u> f1348d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1349e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1350f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1351g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1352h = false;

    class a implements t.a {
        a() {
        }

        @Override // androidx.lifecycle.t.a
        public <T extends s> T a(Class<T> cls) {
            return new q(true);
        }
    }

    q(boolean z) {
        this.f1349e = z;
    }

    static q a(u uVar) {
        return (q) new t(uVar, f1345i).a(q.class);
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (this.f1352h) {
            if (n.d(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f1346b.containsKey(fragment.f1165g)) {
            this.f1346b.put(fragment.f1165g, fragment);
            if (n.d(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1352h = z;
    }

    /* access modifiers changed from: package-private */
    public Fragment b(String str) {
        return this.f1346b.get(str);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.s
    public void b() {
        if (n.d(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1350f = true;
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment) {
        if (n.d(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f1347c.get(fragment.f1165g);
        if (qVar != null) {
            qVar.b();
            this.f1347c.remove(fragment.f1165g);
        }
        u uVar = this.f1348d.get(fragment.f1165g);
        if (uVar != null) {
            uVar.a();
            this.f1348d.remove(fragment.f1165g);
        }
    }

    /* access modifiers changed from: package-private */
    public q c(Fragment fragment) {
        q qVar = this.f1347c.get(fragment.f1165g);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f1349e);
        this.f1347c.put(fragment.f1165g, qVar2);
        return qVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> c() {
        return new ArrayList(this.f1346b.values());
    }

    /* access modifiers changed from: package-private */
    public u d(Fragment fragment) {
        u uVar = this.f1348d.get(fragment.f1165g);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        this.f1348d.put(fragment.f1165g, uVar2);
        return uVar2;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f1350f;
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (!this.f1352h) {
            if ((this.f1346b.remove(fragment.f1165g) != null) && n.d(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (n.d(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1346b.equals(qVar.f1346b) && this.f1347c.equals(qVar.f1347c) && this.f1348d.equals(qVar.f1348d);
    }

    /* access modifiers changed from: package-private */
    public boolean f(Fragment fragment) {
        if (!this.f1346b.containsKey(fragment.f1165g)) {
            return true;
        }
        return this.f1349e ? this.f1350f : !this.f1351g;
    }

    public int hashCode() {
        return (((this.f1346b.hashCode() * 31) + this.f1347c.hashCode()) * 31) + this.f1348d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1346b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1347c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1348d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
