package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class x {
    private final ArrayList<Fragment> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, w> f1375b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private q f1376c;

    x() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f1375b.values().removeAll(Collections.singleton(null));
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        for (w wVar : this.f1375b.values()) {
            if (wVar != null) {
                wVar.a(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.f1171m = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* access modifiers changed from: package-private */
    public void a(q qVar) {
        this.f1376c = qVar;
    }

    /* access modifiers changed from: package-private */
    public void a(w wVar) {
        Fragment k2 = wVar.k();
        if (!a(k2.f1165g)) {
            this.f1375b.put(k2.f1165g, wVar);
            if (k2.D) {
                if (k2.C) {
                    this.f1376c.a(k2);
                } else {
                    this.f1376c.e(k2);
                }
                k2.D = false;
            }
            if (n.d(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1375b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : this.f1375b.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    Fragment k2 = wVar.k();
                    printWriter.println(k2);
                    k2.a(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.a.get(i2).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<String> list) {
        this.a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment b2 = b(str);
                if (b2 != null) {
                    if (n.d(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + b2);
                    }
                    a(b2);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        return this.f1375b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public int b(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fragment);
        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.a.get(i2);
            if (fragment2.H == viewGroup && (view2 = fragment2.I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            Fragment fragment3 = this.a.get(indexOf);
            if (fragment3.H == viewGroup && (view = fragment3.I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment b(int i2) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.a.get(size);
            if (fragment != null && fragment.x == i2) {
                return fragment;
            }
        }
        for (w wVar : this.f1375b.values()) {
            if (wVar != null) {
                Fragment k2 = wVar.k();
                if (k2.x == i2) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Fragment b(String str) {
        w wVar = this.f1375b.get(str);
        if (wVar != null) {
            return wVar.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<w> b() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f1375b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void b(w wVar) {
        Fragment k2 = wVar.k();
        if (k2.C) {
            this.f1376c.e(k2);
        }
        if (this.f1375b.put(k2.f1165g, null) != null && n.d(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k2);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.a.get(size);
                if (fragment != null && str.equals(fragment.z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (w wVar : this.f1375b.values()) {
            if (wVar != null) {
                Fragment k2 = wVar.k();
                if (str.equals(k2.z)) {
                    return k2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<w> it = this.f1375b.values().iterator();
        while (it.hasNext()) {
            w next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.f1171m = false;
    }

    /* access modifiers changed from: package-private */
    public Fragment d(String str) {
        Fragment a2;
        for (w wVar : this.f1375b.values()) {
            if (!(wVar == null || (a2 = wVar.k().a(str)) == null)) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> d() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public q e() {
        return this.f1376c;
    }

    /* access modifiers changed from: package-private */
    public w e(String str) {
        return this.f1375b.get(str);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            w wVar = this.f1375b.get(it.next().f1165g);
            if (wVar != null) {
                wVar.l();
            }
        }
        for (w wVar2 : this.f1375b.values()) {
            if (wVar2 != null) {
                wVar2.l();
                Fragment k2 = wVar2.k();
                if (k2.n && !k2.R()) {
                    b(wVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f1375b.clear();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<v> h() {
        ArrayList<v> arrayList = new ArrayList<>(this.f1375b.size());
        for (w wVar : this.f1375b.values()) {
            if (wVar != null) {
                Fragment k2 = wVar.k();
                v o = wVar.o();
                arrayList.add(o);
                if (n.d(2)) {
                    Log.v("FragmentManager", "Saved state of " + k2 + ": " + o.n);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> i() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1165g);
                if (n.d(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1165g + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
