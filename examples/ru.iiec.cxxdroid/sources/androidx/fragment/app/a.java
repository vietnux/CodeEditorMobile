package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import androidx.lifecycle.f;
import java.io.PrintWriter;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class a extends y implements n.k, n.p {
    final n q;
    boolean r;
    int s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(n nVar) {
        super(nVar.s(), nVar.v() != null ? nVar.v().g().getClassLoader() : null);
        this.s = -1;
        this.q = nVar;
    }

    private static boolean b(y.a aVar) {
        Fragment fragment = aVar.f1389b;
        return fragment != null && fragment.f1171m && fragment.I != null && !fragment.B && !fragment.A && fragment.T();
    }

    @Override // androidx.fragment.app.y
    public int a() {
        return b(false);
    }

    /* access modifiers changed from: package-private */
    public Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.a.size()) {
            y.a aVar = this.a.get(i2);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f1389b;
                    int i4 = fragment3.y;
                    Fragment fragment4 = fragment2;
                    int i5 = i2;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.y == i4) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.a.add(i5, new y.a(9, fragment5));
                                    i5++;
                                    fragment4 = null;
                                }
                                y.a aVar2 = new y.a(3, fragment5);
                                aVar2.f1390c = aVar.f1390c;
                                aVar2.f1392e = aVar.f1392e;
                                aVar2.f1391d = aVar.f1391d;
                                aVar2.f1393f = aVar.f1393f;
                                this.a.add(i5, aVar2);
                                arrayList.remove(fragment5);
                                i5++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i5);
                        i5--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                    i2 = i5;
                    fragment2 = fragment4;
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f1389b);
                    Fragment fragment6 = aVar.f1389b;
                    if (fragment6 == fragment2) {
                        this.a.add(i2, new y.a(9, fragment6));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.a.add(i2, new y.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f1389b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f1389b);
            i2++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.y
    public y a(Fragment fragment, f.c cVar) {
        if (fragment.t != this.q) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.q);
        } else if (cVar == f.c.INITIALIZED && fragment.f1160b > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != f.c.DESTROYED) {
            super.a(fragment, cVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (this.f1382g) {
            if (n.d(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                y.a aVar = this.a.get(i3);
                Fragment fragment = aVar.f1389b;
                if (fragment != null) {
                    fragment.s += i2;
                    if (n.d(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1389b + " to " + aVar.f1389b.s);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.y
    public void a(int i2, Fragment fragment, String str, int i3) {
        super.a(i2, fragment, str, i3);
        fragment.t = this.q;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment.h hVar) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            y.a aVar = this.a.get(i2);
            if (b(aVar)) {
                aVar.f1389b.a(hVar);
            }
        }
    }

    public void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1383h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f1381f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1381f));
            }
            if (!(this.f1377b == 0 && this.f1378c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1377b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1378c));
            }
            if (!(this.f1379d == 0 && this.f1380e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1379d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1380e));
            }
            if (!(this.f1384i == 0 && this.f1385j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1384i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1385j);
            }
            if (!(this.f1386k == 0 && this.f1387l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1386k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1387l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                y.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1389b);
                if (z) {
                    if (!(aVar.f1390c == 0 && aVar.f1391d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1390c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1391d));
                    }
                    if (aVar.f1392e != 0 || aVar.f1393f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1392e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1393f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).f1389b;
            int i6 = fragment != null ? fragment.y : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).f1389b;
                        if ((fragment2 != null ? fragment2.y : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.n.p
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.d(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1382g) {
            return true;
        }
        this.q.a(this);
        return true;
    }

    @Override // androidx.fragment.app.y
    public int b() {
        return b(true);
    }

    /* access modifiers changed from: package-private */
    public int b(boolean z) {
        if (!this.r) {
            if (n.d(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new d0("FragmentManager"));
                a("  ", printWriter);
                printWriter.close();
            }
            this.r = true;
            this.s = this.f1382g ? this.q.a() : -1;
            this.q.a(this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: package-private */
    public Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            y.a aVar = this.a.get(size);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1389b;
                            break;
                        case 10:
                            aVar.f1395h = aVar.f1394g;
                            break;
                    }
                }
                arrayList.add(aVar.f1389b);
            }
            arrayList.remove(aVar.f1389b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.y
    public y b(Fragment fragment) {
        n nVar = fragment.t;
        if (nVar == null || nVar == this.q) {
            super.b(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).f1389b;
            int i4 = fragment != null ? fragment.y : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.y
    public y c(Fragment fragment) {
        n nVar = fragment.t;
        if (nVar == null || nVar == this.q) {
            super.c(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.y
    public void c() {
        e();
        this.q.b((n.p) this, false);
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            y.a aVar = this.a.get(size);
            Fragment fragment = aVar.f1389b;
            if (fragment != null) {
                fragment.j(true);
                fragment.b(n.e(this.f1381f));
                fragment.a(this.n, this.f1388m);
            }
            switch (aVar.a) {
                case 1:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, true);
                    this.q.m(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment);
                    break;
                case 4:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.o(fragment);
                    break;
                case 5:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, true);
                    this.q.g(fragment);
                    break;
                case 6:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.b(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, true);
                    this.q.d(fragment);
                    break;
                case 8:
                    this.q.n(null);
                    break;
                case 9:
                    this.q.n(fragment);
                    break;
                case 10:
                    this.q.a(fragment, aVar.f1394g);
                    break;
            }
            if (!this.o && aVar.a != 3 && fragment != null && !n.P) {
                this.q.k(fragment);
            }
        }
        if (!(this.o || !z || n.P)) {
            n nVar = this.q;
            nVar.a(nVar.q, true);
        }
    }

    @Override // androidx.fragment.app.y
    public y d(Fragment fragment) {
        n nVar = fragment.t;
        if (nVar == null || nVar == this.q) {
            super.d(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.y
    public void d() {
        e();
        this.q.b((n.p) this, true);
    }

    @Override // androidx.fragment.app.y
    public y e(Fragment fragment) {
        n nVar = fragment.t;
        if (nVar == null || nVar == this.q) {
            super.e(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            y.a aVar = this.a.get(i2);
            Fragment fragment = aVar.f1389b;
            if (fragment != null) {
                fragment.j(false);
                fragment.b(this.f1381f);
                fragment.a(this.f1388m, this.n);
            }
            switch (aVar.a) {
                case 1:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, false);
                    this.q.a(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.m(fragment);
                    break;
                case 4:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.g(fragment);
                    break;
                case 5:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, false);
                    this.q.o(fragment);
                    break;
                case 6:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.d(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f1390c, aVar.f1391d, aVar.f1392e, aVar.f1393f);
                    this.q.a(fragment, false);
                    this.q.b(fragment);
                    break;
                case 8:
                    this.q.n(fragment);
                    break;
                case 9:
                    this.q.n(null);
                    break;
                case 10:
                    this.q.a(fragment, aVar.f1395h);
                    break;
            }
            if (!this.o && aVar.a != 1 && fragment != null && !n.P) {
                this.q.k(fragment);
            }
        }
        if (!(this.o || n.P)) {
            n nVar = this.q;
            nVar.a(nVar.q, true);
        }
    }

    public String g() {
        return this.f1383h;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (b(this.a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                this.p.get(i2).run();
            }
            this.p = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f1383h != null) {
            sb.append(" ");
            sb.append(this.f1383h);
        }
        sb.append("}");
        return sb.toString();
    }
}
