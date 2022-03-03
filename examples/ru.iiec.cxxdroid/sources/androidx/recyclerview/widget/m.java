package androidx.recyclerview.widget;

import android.view.View;

/* access modifiers changed from: package-private */
public class m {
    final b a;

    /* renamed from: b  reason: collision with root package name */
    a f1720b = new a();

    /* access modifiers changed from: package-private */
    public static class a {
        int a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f1721b;

        /* renamed from: c  reason: collision with root package name */
        int f1722c;

        /* renamed from: d  reason: collision with root package name */
        int f1723d;

        /* renamed from: e  reason: collision with root package name */
        int f1724e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            this.a = i2 | this.a;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, int i4, int i5) {
            this.f1721b = i2;
            this.f1722c = i3;
            this.f1723d = i4;
            this.f1724e = i5;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (a(this.f1723d, this.f1721b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 112) != 0 && (i3 & (a(this.f1723d, this.f1722c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (a(this.f1724e, this.f1721b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            return (i5 & 28672) == 0 || (i5 & (a(this.f1724e, this.f1722c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        int a();

        int a(View view);

        View a(int i2);

        int b();

        int b(View view);
    }

    m(b bVar) {
        this.a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i2, int i3, int i4, int i5) {
        int b2 = this.a.b();
        int a2 = this.a.a();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a3 = this.a.a(i2);
            this.f1720b.a(b2, a2, this.a.a(a3), this.a.b(a3));
            if (i4 != 0) {
                this.f1720b.b();
                this.f1720b.a(i4);
                if (this.f1720b.a()) {
                    return a3;
                }
            }
            if (i5 != 0) {
                this.f1720b.b();
                this.f1720b.a(i5);
                if (this.f1720b.a()) {
                    view = a3;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i2) {
        this.f1720b.a(this.a.b(), this.a.a(), this.a.a(view), this.a.b(view));
        if (i2 == 0) {
            return false;
        }
        this.f1720b.b();
        this.f1720b.a(i2);
        return this.f1720b.a();
    }
}
