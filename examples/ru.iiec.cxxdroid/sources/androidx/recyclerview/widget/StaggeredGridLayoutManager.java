package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.a {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new a();
    private int s = -1;
    f[] t;
    i u;
    i v;
    private int w;
    private int x;
    private final g y;
    boolean z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.F();
        }
    }

    /* access modifiers changed from: package-private */
    public class b {
        int a;

        /* renamed from: b  reason: collision with root package name */
        int f1599b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1600c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1601d;

        /* renamed from: e  reason: collision with root package name */
        boolean f1602e;

        /* renamed from: f  reason: collision with root package name */
        int[] f1603f;

        b() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1599b = this.f1600c ? StaggeredGridLayoutManager.this.u.b() : StaggeredGridLayoutManager.this.u.f();
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.f1599b = this.f1600c ? StaggeredGridLayoutManager.this.u.b() - i2 : StaggeredGridLayoutManager.this.u.f() + i2;
        }

        /* access modifiers changed from: package-private */
        public void a(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f1603f;
            if (iArr == null || iArr.length < length) {
                this.f1603f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f1603f[i2] = fVarArr[i2].b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.a = -1;
            this.f1599b = Integer.MIN_VALUE;
            this.f1600c = false;
            this.f1601d = false;
            this.f1602e = false;
            int[] iArr = this.f1603f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        f f1605e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1606f;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public boolean e() {
            return this.f1606f;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {
        int[] a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f1607b;

        /* access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0022a();

            /* renamed from: b  reason: collision with root package name */
            int f1608b;

            /* renamed from: c  reason: collision with root package name */
            int f1609c;

            /* renamed from: d  reason: collision with root package name */
            int[] f1610d;

            /* renamed from: e  reason: collision with root package name */
            boolean f1611e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            class C0022a implements Parcelable.Creator<a> {
                C0022a() {
                }

                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f1608b = parcel.readInt();
                this.f1609c = parcel.readInt();
                this.f1611e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f1610d = new int[readInt];
                    parcel.readIntArray(this.f1610d);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i2) {
                int[] iArr = this.f1610d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1608b + ", mGapDir=" + this.f1609c + ", mHasUnwantedGapAfter=" + this.f1611e + ", mGapPerSpan=" + Arrays.toString(this.f1610d) + '}';
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f1608b);
                parcel.writeInt(this.f1609c);
                parcel.writeInt(this.f1611e ? 1 : 0);
                int[] iArr = this.f1610d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1610d);
            }
        }

        d() {
        }

        private void c(int i2, int i3) {
            List<a> list = this.f1607b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f1607b.get(size);
                    int i4 = aVar.f1608b;
                    if (i4 >= i2) {
                        aVar.f1608b = i4 + i3;
                    }
                }
            }
        }

        private void d(int i2, int i3) {
            List<a> list = this.f1607b;
            if (list != null) {
                int i4 = i2 + i3;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f1607b.get(size);
                    int i5 = aVar.f1608b;
                    if (i5 >= i2) {
                        if (i5 < i4) {
                            this.f1607b.remove(size);
                        } else {
                            aVar.f1608b = i5 - i3;
                        }
                    }
                }
            }
        }

        private int g(int i2) {
            if (this.f1607b == null) {
                return -1;
            }
            a c2 = c(i2);
            if (c2 != null) {
                this.f1607b.remove(c2);
            }
            int size = this.f1607b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (this.f1607b.get(i3).f1608b >= i2) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return -1;
            }
            this.f1607b.remove(i3);
            return this.f1607b.get(i3).f1608b;
        }

        public a a(int i2, int i3, int i4, boolean z) {
            List<a> list = this.f1607b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f1607b.get(i5);
                int i6 = aVar.f1608b;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f1609c == i4 || (z && aVar.f1611e))) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1607b = null;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[(Math.max(i2, 10) + 1)];
                Arrays.fill(this.a, -1);
            } else if (i2 >= iArr.length) {
                this.a = new int[f(i2)];
                System.arraycopy(iArr, 0, this.a, 0, iArr.length);
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                a(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.a, i2, i4, -1);
                c(i2, i3);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, f fVar) {
            a(i2);
            this.a[i2] = fVar.f1625e;
        }

        public void a(a aVar) {
            if (this.f1607b == null) {
                this.f1607b = new ArrayList();
            }
            int size = this.f1607b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.f1607b.get(i2);
                if (aVar2.f1608b == aVar.f1608b) {
                    this.f1607b.remove(i2);
                }
                if (aVar2.f1608b >= aVar.f1608b) {
                    this.f1607b.add(i2, aVar);
                    return;
                }
            }
            this.f1607b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        public int b(int i2) {
            List<a> list = this.f1607b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1607b.get(size).f1608b >= i2) {
                        this.f1607b.remove(size);
                    }
                }
            }
            return e(i2);
        }

        /* access modifiers changed from: package-private */
        public void b(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                a(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                d(i2, i3);
            }
        }

        public a c(int i2) {
            List<a> list = this.f1607b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1607b.get(size);
                if (aVar.f1608b == i2) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int d(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        /* access modifiers changed from: package-private */
        public int e(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int g2 = g(i2);
            if (g2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.a.length;
            }
            int min = Math.min(g2 + 1, this.a.length);
            Arrays.fill(this.a, i2, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        public int f(int i2) {
            int length = this.a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        int f1612b;

        /* renamed from: c  reason: collision with root package name */
        int f1613c;

        /* renamed from: d  reason: collision with root package name */
        int f1614d;

        /* renamed from: e  reason: collision with root package name */
        int[] f1615e;

        /* renamed from: f  reason: collision with root package name */
        int f1616f;

        /* renamed from: g  reason: collision with root package name */
        int[] f1617g;

        /* renamed from: h  reason: collision with root package name */
        List<d.a> f1618h;

        /* renamed from: i  reason: collision with root package name */
        boolean f1619i;

        /* renamed from: j  reason: collision with root package name */
        boolean f1620j;

        /* renamed from: k  reason: collision with root package name */
        boolean f1621k;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f1612b = parcel.readInt();
            this.f1613c = parcel.readInt();
            this.f1614d = parcel.readInt();
            int i2 = this.f1614d;
            if (i2 > 0) {
                this.f1615e = new int[i2];
                parcel.readIntArray(this.f1615e);
            }
            this.f1616f = parcel.readInt();
            int i3 = this.f1616f;
            if (i3 > 0) {
                this.f1617g = new int[i3];
                parcel.readIntArray(this.f1617g);
            }
            boolean z = false;
            this.f1619i = parcel.readInt() == 1;
            this.f1620j = parcel.readInt() == 1;
            this.f1621k = parcel.readInt() == 1 ? true : z;
            this.f1618h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1614d = eVar.f1614d;
            this.f1612b = eVar.f1612b;
            this.f1613c = eVar.f1613c;
            this.f1615e = eVar.f1615e;
            this.f1616f = eVar.f1616f;
            this.f1617g = eVar.f1617g;
            this.f1619i = eVar.f1619i;
            this.f1620j = eVar.f1620j;
            this.f1621k = eVar.f1621k;
            this.f1618h = eVar.f1618h;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1615e = null;
            this.f1614d = 0;
            this.f1612b = -1;
            this.f1613c = -1;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1615e = null;
            this.f1614d = 0;
            this.f1616f = 0;
            this.f1617g = null;
            this.f1618h = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1612b);
            parcel.writeInt(this.f1613c);
            parcel.writeInt(this.f1614d);
            if (this.f1614d > 0) {
                parcel.writeIntArray(this.f1615e);
            }
            parcel.writeInt(this.f1616f);
            if (this.f1616f > 0) {
                parcel.writeIntArray(this.f1617g);
            }
            parcel.writeInt(this.f1619i ? 1 : 0);
            parcel.writeInt(this.f1620j ? 1 : 0);
            parcel.writeInt(this.f1621k ? 1 : 0);
            parcel.writeList(this.f1618h);
        }
    }

    /* access modifiers changed from: package-private */
    public class f {
        ArrayList<View> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f1622b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f1623c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f1624d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f1625e;

        f(int i2) {
            this.f1625e = i2;
        }

        /* access modifiers changed from: package-private */
        public int a(int i2) {
            int i3 = this.f1623c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            a();
            return this.f1623c;
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3, boolean z) {
            return a(i2, i3, false, false, z);
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d2 < b2 : d2 <= b2;
                if (!z3 ? a2 > f2 : a2 >= f2) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d2 >= f2 && a2 <= b2) {
                        }
                    } else if (d2 >= f2 && a2 <= b2) {
                    }
                    return StaggeredGridLayoutManager.this.l(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public View a(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a c2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c b2 = b(view);
            this.f1623c = StaggeredGridLayoutManager.this.u.a(view);
            if (b2.f1606f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f1609c == 1) {
                this.f1623c += c2.a(this.f1625e);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            c b2 = b(view);
            b2.f1605e = this;
            this.a.add(view);
            this.f1623c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.f1622b = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1624d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z, int i2) {
            int a2 = z ? a(Integer.MIN_VALUE) : b(Integer.MIN_VALUE);
            c();
            if (a2 != Integer.MIN_VALUE) {
                if (z && a2 < StaggeredGridLayoutManager.this.u.b()) {
                    return;
                }
                if (z || a2 <= StaggeredGridLayoutManager.this.u.f()) {
                    if (i2 != Integer.MIN_VALUE) {
                        a2 += i2;
                    }
                    this.f1623c = a2;
                    this.f1622b = a2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int b(int i2) {
            int i3 = this.f1622b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            b();
            return this.f1622b;
        }

        /* access modifiers changed from: package-private */
        public c b(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d.a c2;
            View view = this.a.get(0);
            c b2 = b(view);
            this.f1622b = StaggeredGridLayoutManager.this.u.d(view);
            if (b2.f1606f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f1609c == -1) {
                this.f1622b -= c2.a(this.f1625e);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.a.clear();
            i();
            this.f1624d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(int i2) {
            int i3 = this.f1622b;
            if (i3 != Integer.MIN_VALUE) {
                this.f1622b = i3 + i2;
            }
            int i4 = this.f1623c;
            if (i4 != Integer.MIN_VALUE) {
                this.f1623c = i4 + i2;
            }
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            c b2 = b(view);
            b2.f1605e = this;
            this.a.add(0, view);
            this.f1622b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.f1623c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1624d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        public int d() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.z) {
                i3 = this.a.size() - 1;
                i2 = -1;
            } else {
                i3 = 0;
                i2 = this.a.size();
            }
            return a(i3, i2, true);
        }

        /* access modifiers changed from: package-private */
        public void d(int i2) {
            this.f1622b = i2;
            this.f1623c = i2;
        }

        public int e() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.z) {
                i3 = 0;
                i2 = this.a.size();
            } else {
                i3 = this.a.size() - 1;
                i2 = -1;
            }
            return a(i3, i2, true);
        }

        public int f() {
            return this.f1624d;
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i2 = this.f1623c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            a();
            return this.f1623c;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            int i2 = this.f1622b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            b();
            return this.f1622b;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f1622b = Integer.MIN_VALUE;
            this.f1623c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void j() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c b2 = b(remove);
            b2.f1605e = null;
            if (b2.c() || b2.b()) {
                this.f1624d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.f1622b = Integer.MIN_VALUE;
            }
            this.f1623c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            View remove = this.a.remove(0);
            c b2 = b(remove);
            b2.f1605e = null;
            if (this.a.size() == 0) {
                this.f1623c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f1624d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.f1622b = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.p.d a2 = RecyclerView.p.a(context, attributeSet, i2, i3);
        h(a2.a);
        i(a2.f1579b);
        c(a2.f1580c);
        this.y = new g();
        M();
    }

    private void M() {
        this.u = i.a(this, this.w);
        this.v = i.a(this, 1 - this.w);
    }

    private void N() {
        if (this.v.d() != 1073741824) {
            int e2 = e();
            float f2 = 0.0f;
            for (int i2 = 0; i2 < e2; i2++) {
                View c2 = c(i2);
                float b2 = (float) this.v.b(c2);
                if (b2 >= f2) {
                    if (((c) c2.getLayoutParams()).e()) {
                        b2 = (b2 * 1.0f) / ((float) this.s);
                    }
                    f2 = Math.max(f2, b2);
                }
            }
            int i3 = this.x;
            int round = Math.round(f2 * ((float) this.s));
            if (this.v.d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.g());
            }
            j(round);
            if (this.x != i3) {
                for (int i4 = 0; i4 < e2; i4++) {
                    View c3 = c(i4);
                    c cVar = (c) c3.getLayoutParams();
                    if (!cVar.f1606f) {
                        if (!L() || this.w != 1) {
                            int i5 = cVar.f1605e.f1625e;
                            int i6 = this.w;
                            int i7 = (this.x * i5) - (i5 * i3);
                            if (i6 == 1) {
                                c3.offsetLeftAndRight(i7);
                            } else {
                                c3.offsetTopAndBottom(i7);
                            }
                        } else {
                            int i8 = this.s;
                            int i9 = cVar.f1605e.f1625e;
                            c3.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.x) - ((-((i8 - 1) - i9)) * i3));
                        }
                    }
                }
            }
        }
    }

    private void O() {
        this.A = (this.w == 1 || !L()) ? this.z : !this.z;
    }

    private int a(RecyclerView.w wVar, g gVar, RecyclerView.b0 b0Var) {
        int i2;
        f fVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z2 = false;
        this.B.set(0, this.s, true);
        if (this.y.f1712i) {
            i2 = gVar.f1708e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = gVar.f1708e == 1 ? gVar.f1710g + gVar.f1705b : gVar.f1709f - gVar.f1705b;
        }
        e(gVar.f1708e, i2);
        int b2 = this.A ? this.u.b() : this.u.f();
        boolean z3 = false;
        while (gVar.a(b0Var) && (this.y.f1712i || !this.B.isEmpty())) {
            View a2 = gVar.a(wVar);
            c cVar = (c) a2.getLayoutParams();
            int a3 = cVar.a();
            int d2 = this.E.d(a3);
            boolean z4 = d2 == -1;
            if (z4) {
                if (cVar.f1606f) {
                    f[] fVarArr = this.t;
                    char c2 = z2 ? 1 : 0;
                    char c3 = z2 ? 1 : 0;
                    char c4 = z2 ? 1 : 0;
                    fVar = fVarArr[c2];
                } else {
                    fVar = a(gVar);
                }
                this.E.a(a3, fVar);
            } else {
                fVar = this.t[d2];
            }
            cVar.f1605e = fVar;
            if (gVar.f1708e == 1) {
                b(a2);
            } else {
                int i9 = z2 ? 1 : 0;
                int i10 = z2 ? 1 : 0;
                int i11 = z2 ? 1 : 0;
                b(a2, i9);
            }
            a(a2, cVar, z2);
            if (gVar.f1708e == 1) {
                int q = cVar.f1606f ? q(b2) : fVar.a(b2);
                int b3 = this.u.b(a2) + q;
                if (z4 && cVar.f1606f) {
                    d.a m2 = m(q);
                    m2.f1609c = -1;
                    m2.f1608b = a3;
                    this.E.a(m2);
                }
                i3 = b3;
                i4 = q;
            } else {
                int t2 = cVar.f1606f ? t(b2) : fVar.b(b2);
                i4 = t2 - this.u.b(a2);
                if (z4 && cVar.f1606f) {
                    d.a n = n(t2);
                    n.f1609c = 1;
                    n.f1608b = a3;
                    this.E.a(n);
                }
                i3 = t2;
            }
            if (cVar.f1606f && gVar.f1707d == -1) {
                if (!z4) {
                    if (!(gVar.f1708e == 1 ? D() : E())) {
                        d.a c5 = this.E.c(a3);
                        if (c5 != null) {
                            c5.f1611e = true;
                        }
                    }
                }
                this.M = true;
            }
            a(a2, cVar, gVar);
            if (!L() || this.w != 1) {
                int f2 = cVar.f1606f ? this.v.f() : (fVar.f1625e * this.x) + this.v.f();
                i6 = f2;
                i5 = this.v.b(a2) + f2;
            } else {
                int b4 = cVar.f1606f ? this.v.b() : this.v.b() - (((this.s - 1) - fVar.f1625e) * this.x);
                i5 = b4;
                i6 = b4 - this.v.b(a2);
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = a2;
                i8 = i6;
                i6 = i4;
                i7 = i5;
            } else {
                staggeredGridLayoutManager = this;
                view = a2;
                i8 = i4;
                i7 = i3;
                i3 = i5;
            }
            staggeredGridLayoutManager.a(view, i8, i6, i7, i3);
            if (cVar.f1606f) {
                e(this.y.f1708e, i2);
            } else {
                a(fVar, this.y.f1708e, i2);
            }
            a(wVar, this.y);
            if (this.y.f1711h && a2.hasFocusable()) {
                if (cVar.f1606f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar.f1625e, false);
                    z3 = true;
                    z2 = false;
                }
            }
            z3 = true;
            z2 = false;
        }
        if (!z3) {
            a(wVar, this.y);
        }
        int f3 = this.y.f1708e == -1 ? this.u.f() - t(this.u.f()) : q(this.u.b()) - this.u.b();
        if (f3 > 0) {
            return Math.min(gVar.f1705b, f3);
        }
        return 0;
    }

    private f a(g gVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (u(gVar.f1708e)) {
            i3 = this.s - 1;
            i2 = -1;
        } else {
            i3 = 0;
            i4 = this.s;
            i2 = 1;
        }
        f fVar = null;
        if (gVar.f1708e == 1) {
            int i5 = Integer.MAX_VALUE;
            int f2 = this.u.f();
            while (i3 != i4) {
                f fVar2 = this.t[i3];
                int a2 = fVar2.a(f2);
                if (a2 < i5) {
                    fVar = fVar2;
                    i5 = a2;
                }
                i3 += i2;
            }
            return fVar;
        }
        int i6 = Integer.MIN_VALUE;
        int b2 = this.u.b();
        while (i3 != i4) {
            f fVar3 = this.t[i3];
            int b3 = fVar3.b(b2);
            if (b3 > i6) {
                fVar = fVar3;
                i6 = b3;
            }
            i3 += i2;
        }
        return fVar;
    }

    private void a(View view, int i2, int i3, boolean z2) {
        a(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int c2 = c(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int c3 = c(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z2 ? b(view, c2, c3, cVar) : a(view, c2, c3, cVar)) {
            view.measure(c2, c3);
        }
    }

    private void a(View view, c cVar, g gVar) {
        if (gVar.f1708e == 1) {
            if (cVar.f1606f) {
                p(view);
            } else {
                cVar.f1605e.a(view);
            }
        } else if (cVar.f1606f) {
            q(view);
        } else {
            cVar.f1605e.c(view);
        }
    }

    private void a(View view, c cVar, boolean z2) {
        int i2;
        int i3;
        if (cVar.f1606f) {
            if (this.w == 1) {
                i3 = this.J;
            } else {
                a(view, RecyclerView.p.a(q(), r(), n() + o(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z2);
                return;
            }
        } else if (this.w == 1) {
            i3 = RecyclerView.p.a(this.x, r(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        } else {
            i3 = RecyclerView.p.a(q(), r(), n() + o(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i2 = RecyclerView.p.a(this.x, i(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            a(view, i3, i2, z2);
        }
        i2 = RecyclerView.p.a(h(), i(), p() + m(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        a(view, i3, i2, z2);
    }

    private void a(RecyclerView.w wVar, int i2) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View c2 = c(e2);
            if (this.u.d(c2) >= i2 && this.u.f(c2) >= i2) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f1606f) {
                    for (int i3 = 0; i3 < this.s; i3++) {
                        if (this.t[i3].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].j();
                    }
                } else if (cVar.f1605e.a.size() != 1) {
                    cVar.f1605e.j();
                } else {
                    return;
                }
                a(c2, wVar);
            } else {
                return;
            }
        }
    }

    private void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z2) {
        int b2;
        int q = q(Integer.MIN_VALUE);
        if (q != Integer.MIN_VALUE && (b2 = this.u.b() - q) > 0) {
            int i2 = b2 - (-c(-b2, wVar, b0Var));
            if (z2 && i2 > 0) {
                this.u.a(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f1708e == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(androidx.recyclerview.widget.RecyclerView.w r3, androidx.recyclerview.widget.g r4) {
        /*
            r2 = this;
            boolean r0 = r4.a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f1712i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f1705b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f1708e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f1710g
        L_0x0014:
            r2.a(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f1709f
        L_0x001a:
            r2.b(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f1708e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f1709f
            int r1 = r2.r(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f1710g
            int r4 = r4.f1705b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f1710g
            int r0 = r2.s(r0)
            int r1 = r4.f1710g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f1709f
            int r4 = r4.f1705b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.g):void");
    }

    private void a(b bVar) {
        boolean z2;
        e eVar = this.I;
        int i2 = eVar.f1614d;
        if (i2 > 0) {
            if (i2 == this.s) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].c();
                    e eVar2 = this.I;
                    int i4 = eVar2.f1615e[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        i4 += eVar2.f1620j ? this.u.b() : this.u.f();
                    }
                    this.t[i3].d(i4);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.f1612b = eVar3.f1613c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.f1621k;
        c(eVar4.f1619i);
        O();
        e eVar5 = this.I;
        int i5 = eVar5.f1612b;
        if (i5 != -1) {
            this.C = i5;
            z2 = eVar5.f1620j;
        } else {
            z2 = this.A;
        }
        bVar.f1600c = z2;
        e eVar6 = this.I;
        if (eVar6.f1616f > 1) {
            d dVar = this.E;
            dVar.a = eVar6.f1617g;
            dVar.f1607b = eVar6.f1618h;
        }
    }

    private void a(f fVar, int i2, int i3) {
        int f2 = fVar.f();
        if (i2 == -1) {
            if (fVar.h() + f2 > i3) {
                return;
            }
        } else if (fVar.g() - f2 < i3) {
            return;
        }
        this.B.set(fVar.f1625e, false);
    }

    private boolean a(f fVar) {
        if (this.A) {
            if (fVar.g() < this.u.b()) {
                ArrayList<View> arrayList = fVar.a;
                return !fVar.b(arrayList.get(arrayList.size() - 1)).f1606f;
            }
        } else if (fVar.h() > this.u.f()) {
            return !fVar.b(fVar.a.get(0)).f1606f;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.I()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.H()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.H()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.I()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.y()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r5, androidx.recyclerview.widget.RecyclerView.b0 r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    private void b(RecyclerView.w wVar, int i2) {
        while (e() > 0) {
            View c2 = c(0);
            if (this.u.a(c2) <= i2 && this.u.e(c2) <= i2) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f1606f) {
                    for (int i3 = 0; i3 < this.s; i3++) {
                        if (this.t[i3].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].k();
                    }
                } else if (cVar.f1605e.a.size() != 1) {
                    cVar.f1605e.k();
                } else {
                    return;
                }
                a(c2, wVar);
            } else {
                return;
            }
        }
    }

    private void b(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z2) {
        int f2;
        int t2 = t(Integer.MAX_VALUE);
        if (t2 != Integer.MAX_VALUE && (f2 = t2 - this.u.f()) > 0) {
            int c2 = f2 - c(f2, wVar, b0Var);
            if (z2 && c2 > 0) {
                this.u.a(-c2);
            }
        }
    }

    private int c(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (F() != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    private boolean c(RecyclerView.b0 b0Var, b bVar) {
        boolean z2 = this.G;
        int a2 = b0Var.a();
        bVar.a = z2 ? p(a2) : o(a2);
        bVar.f1599b = Integer.MIN_VALUE;
        return true;
    }

    private void e(int i2, int i3) {
        for (int i4 = 0; i4 < this.s; i4++) {
            if (!this.t[i4].a.isEmpty()) {
                a(this.t[i4], i2, i3);
            }
        }
    }

    private int h(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        return k.a(b0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int i(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        return k.a(b0Var, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    private int j(RecyclerView.b0 b0Var) {
        if (e() == 0) {
            return 0;
        }
        return k.b(b0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int k(int i2) {
        if (e() == 0) {
            return this.A ? 1 : -1;
        }
        return (i2 < H()) != this.A ? -1 : 1;
    }

    private int l(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && L()) ? -1 : 1 : (this.w != 1 && L()) ? 1 : -1;
    }

    private d.a m(int i2) {
        d.a aVar = new d.a();
        aVar.f1610d = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f1610d[i3] = i2 - this.t[i3].a(i2);
        }
        return aVar;
    }

    private d.a n(int i2) {
        d.a aVar = new d.a();
        aVar.f1610d = new int[this.s];
        for (int i3 = 0; i3 < this.s; i3++) {
            aVar.f1610d[i3] = this.t[i3].b(i2) - i2;
        }
        return aVar;
    }

    private int o(int i2) {
        int e2 = e();
        for (int i3 = 0; i3 < e2; i3++) {
            int l2 = l(c(i3));
            if (l2 >= 0 && l2 < i2) {
                return l2;
            }
        }
        return 0;
    }

    private int p(int i2) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            int l2 = l(c(e2));
            if (l2 >= 0 && l2 < i2) {
                return l2;
            }
        }
        return 0;
    }

    private void p(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].a(view);
        }
    }

    private int q(int i2) {
        int a2 = this.t[0].a(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int a3 = this.t[i3].a(i2);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private void q(View view) {
        for (int i2 = this.s - 1; i2 >= 0; i2--) {
            this.t[i2].c(view);
        }
    }

    private int r(int i2) {
        int b2 = this.t[0].b(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int b3 = this.t[i3].b(i2);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int s(int i2) {
        int a2 = this.t[0].a(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int a3 = this.t[i3].a(i2);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int t(int i2) {
        int b2 = this.t[0].b(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int b3 = this.t[i3].b(i2);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private boolean u(int i2) {
        if (this.w == 0) {
            return (i2 == -1) != this.A;
        }
        return ((i2 == -1) == this.A) == L();
    }

    private void v(int i2) {
        g gVar = this.y;
        gVar.f1708e = i2;
        int i3 = 1;
        if (this.A != (i2 == -1)) {
            i3 = -1;
        }
        gVar.f1707d = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        return this.I == null;
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        int a2 = this.t[0].a(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].a(Integer.MIN_VALUE) != a2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        int b2 = this.t[0].b(Integer.MIN_VALUE);
        for (int i2 = 1; i2 < this.s; i2++) {
            if (this.t[i2].b(Integer.MIN_VALUE) != b2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        int i2;
        int i3;
        if (e() == 0 || this.F == 0 || !t()) {
            return false;
        }
        if (this.A) {
            i3 = I();
            i2 = H();
        } else {
            i3 = H();
            i2 = I();
        }
        if (i3 == 0 && J() != null) {
            this.E.a();
        } else if (!this.M) {
            return false;
        } else {
            int i4 = this.A ? -1 : 1;
            int i5 = i2 + 1;
            d.a a2 = this.E.a(i3, i5, i4, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i5);
                return false;
            }
            d.a a3 = this.E.a(i3, a2.f1608b, i4 * -1, true);
            if (a3 == null) {
                this.E.b(a2.f1608b);
            } else {
                this.E.b(a3.f1608b + 1);
            }
        }
        z();
        y();
        return true;
    }

    /* access modifiers changed from: package-private */
    public int G() {
        View a2 = this.A ? a(true) : b(true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    /* access modifiers changed from: package-private */
    public int H() {
        if (e() == 0) {
            return 0;
        }
        return l(c(0));
    }

    /* access modifiers changed from: package-private */
    public int I() {
        int e2 = e();
        if (e2 == 0) {
            return 0;
        }
        return l(c(e2 - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View J() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J():android.view.View");
    }

    public void K() {
        this.E.a();
        y();
    }

    /* access modifiers changed from: package-private */
    public boolean L() {
        return j() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return c(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a(RecyclerView.b0 b0Var) {
        return h(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View a(View view, int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View c2;
        View a2;
        if (e() == 0 || (c2 = c(view)) == null) {
            return null;
        }
        O();
        int l2 = l(i2);
        if (l2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) c2.getLayoutParams();
        boolean z2 = cVar.f1606f;
        f fVar = cVar.f1605e;
        int I2 = l2 == 1 ? I() : H();
        b(I2, b0Var);
        v(l2);
        g gVar = this.y;
        gVar.f1706c = gVar.f1707d + I2;
        gVar.f1705b = (int) (((float) this.u.g()) * 0.33333334f);
        g gVar2 = this.y;
        gVar2.f1711h = true;
        gVar2.a = false;
        a(wVar, gVar2, b0Var);
        this.G = this.A;
        if (!(z2 || (a2 = fVar.a(I2, l2)) == null || a2 == c2)) {
            return a2;
        }
        if (u(l2)) {
            for (int i3 = this.s - 1; i3 >= 0; i3--) {
                View a3 = this.t[i3].a(I2, l2);
                if (!(a3 == null || a3 == c2)) {
                    return a3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.s; i4++) {
                View a4 = this.t[i4].a(I2, l2);
                if (!(a4 == null || a4 == c2)) {
                    return a4;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (l2 == -1);
        if (!z2) {
            View b2 = b(z3 ? fVar.d() : fVar.e());
            if (!(b2 == null || b2 == c2)) {
                return b2;
            }
        }
        if (u(l2)) {
            for (int i5 = this.s - 1; i5 >= 0; i5--) {
                if (i5 != fVar.f1625e) {
                    f[] fVarArr = this.t;
                    View b3 = b(z3 ? fVarArr[i5].d() : fVarArr[i5].e());
                    if (!(b3 == null || b3 == c2)) {
                        return b3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.s; i6++) {
                f[] fVarArr2 = this.t;
                View b4 = b(z3 ? fVarArr2[i6].d() : fVarArr2[i6].e());
                if (!(b4 == null || b4 == c2)) {
                    return b4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View a(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View c2 = c(e2);
            int d2 = this.u.d(c2);
            int a2 = this.u.a(c2);
            if (a2 > f2 && d2 < b2) {
                if (a2 <= b2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(int i2, int i3, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int i4;
        int i5;
        if (this.w != 0) {
            i2 = i3;
        }
        if (!(e() == 0 || i2 == 0)) {
            a(i2, b0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.s; i7++) {
                g gVar = this.y;
                if (gVar.f1707d == -1) {
                    i5 = gVar.f1709f;
                    i4 = this.t[i7].b(i5);
                } else {
                    i5 = this.t[i7].a(gVar.f1710g);
                    i4 = this.y.f1710g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.O[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.O, 0, i6);
            for (int i9 = 0; i9 < i6 && this.y.a(b0Var); i9++) {
                cVar.a(this.y.f1706c, this.O[i9]);
                g gVar2 = this.y;
                gVar2.f1706c += gVar2.f1707d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, RecyclerView.b0 b0Var) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = I();
            i3 = 1;
        } else {
            i4 = H();
            i3 = -1;
        }
        this.y.a = true;
        b(i4, b0Var);
        v(i3);
        g gVar = this.y;
        gVar.f1706c = i4 + gVar.f1707d;
        gVar.f1705b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int n = n() + o();
        int p = p() + m();
        if (this.w == 1) {
            i5 = RecyclerView.p.a(i3, rect.height() + p, k());
            i4 = RecyclerView.p.a(i2, (this.x * this.s) + n, l());
        } else {
            i4 = RecyclerView.p.a(i2, rect.width() + n, l());
            i5 = RecyclerView.p.a(i3, (this.x * this.s) + p, k());
        }
        c(i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            if (this.C != -1) {
                this.I.a();
                this.I.b();
            }
            y();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 != null && a2 != null) {
                int l2 = l(b2);
                int l3 = l(a2);
                if (l2 < l3) {
                    accessibilityEvent.setFromIndex(l2);
                    accessibilityEvent.setToIndex(l3);
                    return;
                }
                accessibilityEvent.setFromIndex(l3);
                accessibilityEvent.setToIndex(l2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.a();
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3) {
        b(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        b(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        b(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(String str) {
        if (this.I == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a() {
        return this.w == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.b0 b0Var, b bVar) {
        int i2;
        int i3;
        int i4;
        boolean z2 = false;
        if (!b0Var.d() && (i2 = this.C) != -1) {
            if (i2 < 0 || i2 >= b0Var.a()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                e eVar = this.I;
                if (eVar == null || eVar.f1612b == -1 || eVar.f1614d < 1) {
                    View b2 = b(this.C);
                    if (b2 != null) {
                        bVar.a = this.A ? I() : H();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f1600c) {
                                i4 = this.u.b() - this.D;
                                i3 = this.u.a(b2);
                            } else {
                                i4 = this.u.f() + this.D;
                                i3 = this.u.d(b2);
                            }
                            bVar.f1599b = i4 - i3;
                            return true;
                        } else if (this.u.b(b2) > this.u.g()) {
                            bVar.f1599b = bVar.f1600c ? this.u.b() : this.u.f();
                            return true;
                        } else {
                            int d2 = this.u.d(b2) - this.u.f();
                            if (d2 < 0) {
                                bVar.f1599b = -d2;
                                return true;
                            }
                            int b3 = this.u.b() - this.u.a(b2);
                            if (b3 < 0) {
                                bVar.f1599b = b3;
                                return true;
                            }
                            bVar.f1599b = Integer.MIN_VALUE;
                        }
                    } else {
                        bVar.a = this.C;
                        int i5 = this.D;
                        if (i5 == Integer.MIN_VALUE) {
                            if (k(bVar.a) == 1) {
                                z2 = true;
                            }
                            bVar.f1600c = z2;
                            bVar.a();
                        } else {
                            bVar.a(i5);
                        }
                        bVar.f1601d = true;
                    }
                } else {
                    bVar.f1599b = Integer.MIN_VALUE;
                    bVar.a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean a(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int b(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return c(i2, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int b(RecyclerView.b0 b0Var) {
        return i(b0Var);
    }

    /* access modifiers changed from: package-private */
    public View b(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int e2 = e();
        View view = null;
        for (int i2 = 0; i2 < e2; i2++) {
            View c2 = c(i2);
            int d2 = this.u.d(c2);
            if (this.u.a(c2) > f2 && d2 < b2) {
                if (d2 >= f2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.b0 b0Var, b bVar) {
        if (!a(b0Var, bVar) && !c(b0Var, bVar)) {
            bVar.a();
            bVar.a = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, int i2, int i3) {
        b(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.b(recyclerView, wVar);
        a(this.P);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean b() {
        return this.w == 1;
    }

    /* access modifiers changed from: package-private */
    public int c(int i2, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (e() == 0 || i2 == 0) {
            return 0;
        }
        a(i2, b0Var);
        int a2 = a(wVar, this.y, b0Var);
        if (this.y.f1705b >= a2) {
            i2 = i2 < 0 ? -a2 : a2;
        }
        this.u.a(-i2);
        this.G = this.A;
        g gVar = this.y;
        gVar.f1705b = 0;
        a(wVar, gVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int c(RecyclerView.b0 b0Var) {
        return j(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q c() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void c(boolean z2) {
        a((String) null);
        e eVar = this.I;
        if (!(eVar == null || eVar.f1619i == z2)) {
            eVar.f1619i = z2;
        }
        this.z = z2;
        y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int d(RecyclerView.b0 b0Var) {
        return h(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(int i2) {
        super.d(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].c(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d(RecyclerView recyclerView) {
        this.E.a();
        y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int e(RecyclerView.b0 b0Var) {
        return i(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(int i2) {
        super.e(i2);
        for (int i3 = 0; i3 < this.s; i3++) {
            this.t[i3].c(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        c(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int f(RecyclerView.b0 b0Var) {
        return j(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f(int i2) {
        if (i2 == 0) {
            F();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(RecyclerView.b0 b0Var) {
        super.g(b0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.b();
    }

    public void h(int i2) {
        if (i2 == 0 || i2 == 1) {
            a((String) null);
            if (i2 != this.w) {
                this.w = i2;
                i iVar = this.u;
                this.u = this.v;
                this.v = iVar;
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void i(int i2) {
        a((String) null);
        if (i2 != this.s) {
            K();
            this.s = i2;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i3 = 0; i3 < this.s; i3++) {
                this.t[i3] = new f(i3);
            }
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(int i2) {
        this.x = i2 / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i2, this.v.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable x() {
        int i2;
        int i3;
        int[] iArr;
        e eVar = this.I;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f1619i = this.z;
        eVar2.f1620j = this.G;
        eVar2.f1621k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar2.f1616f = 0;
        } else {
            eVar2.f1617g = iArr;
            eVar2.f1616f = eVar2.f1617g.length;
            eVar2.f1618h = dVar.f1607b;
        }
        if (e() > 0) {
            eVar2.f1612b = this.G ? I() : H();
            eVar2.f1613c = G();
            int i4 = this.s;
            eVar2.f1614d = i4;
            eVar2.f1615e = new int[i4];
            for (int i5 = 0; i5 < this.s; i5++) {
                if (this.G) {
                    i2 = this.t[i5].a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.b();
                    } else {
                        eVar2.f1615e[i5] = i2;
                    }
                } else {
                    i2 = this.t[i5].b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.u.f();
                    } else {
                        eVar2.f1615e[i5] = i2;
                    }
                }
                i2 -= i3;
                eVar2.f1615e[i5] = i2;
            }
        } else {
            eVar2.f1612b = -1;
            eVar2.f1613c = -1;
            eVar2.f1614d = 0;
        }
        return eVar2;
    }
}
