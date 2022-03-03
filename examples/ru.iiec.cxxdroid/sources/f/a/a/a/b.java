package f.a.a.a;

import android.util.Log;

public class b implements l {
    private int a;

    public b() {
        this.a = 4;
    }

    public b(int i2) {
        this.a = i2;
    }

    @Override // f.a.a.a.l
    public void a(int i2, String str, String str2) {
        a(i2, str, str2, false);
    }

    public void a(int i2, String str, String str2, boolean z) {
        if (z || a(str, i2)) {
            Log.println(i2, str, str2);
        }
    }

    @Override // f.a.a.a.l
    public void a(String str, String str2) {
        b(str, str2, null);
    }

    @Override // f.a.a.a.l
    public void a(String str, String str2, Throwable th) {
        if (a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    @Override // f.a.a.a.l
    public boolean a(String str, int i2) {
        return this.a <= i2;
    }

    @Override // f.a.a.a.l
    public void b(String str, String str2) {
        d(str, str2, null);
    }

    @Override // f.a.a.a.l
    public void b(String str, String str2, Throwable th) {
        if (a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    @Override // f.a.a.a.l
    public void c(String str, String str2) {
        c(str, str2, null);
    }

    @Override // f.a.a.a.l
    public void c(String str, String str2, Throwable th) {
        if (a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    @Override // f.a.a.a.l
    public void d(String str, String str2) {
        e(str, str2, null);
    }

    public void d(String str, String str2, Throwable th) {
        if (a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    @Override // f.a.a.a.l
    public void e(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void e(String str, String str2, Throwable th) {
        if (a(str, 2)) {
            Log.v(str, str2, th);
        }
    }
}
