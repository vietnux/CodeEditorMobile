package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;

@k2
public final class c10 {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3949b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3950c;

    /* renamed from: d  reason: collision with root package name */
    private final p10 f3951d;

    /* renamed from: e  reason: collision with root package name */
    private final z10 f3952e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3953f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f3954g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<String> f3955h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<n10> f3956i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private int f3957j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f3958k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f3959l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f3960m;
    private String n = "";
    private String o = "";
    private String p = "";

    public c10(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i2;
        this.f3949b = i3;
        this.f3950c = i4;
        this.f3951d = new p10(i5);
        this.f3952e = new z10(i6, i7, i8);
    }

    private static String a(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    private final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null && str.length() >= this.f3950c) {
            synchronized (this.f3953f) {
                this.f3954g.add(str);
                this.f3957j += str.length();
                if (z) {
                    this.f3955h.add(str);
                    this.f3956i.add(new n10(f2, f3, f4, f5, this.f3955h.size() - 1));
                }
            }
        }
    }

    public final int a() {
        return this.f3960m;
    }

    public final void a(int i2) {
        this.f3958k = i2;
    }

    public final void a(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
        synchronized (this.f3953f) {
            if (this.f3959l < 0) {
                qc.b("ActivityContent: negative number of WebViews.");
            }
            i();
        }
    }

    public final String b() {
        return this.n;
    }

    public final void b(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f3953f) {
            z = this.f3959l == 0;
        }
        return z;
    }

    public final String d() {
        return this.o;
    }

    public final String e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c10)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((c10) obj).n;
        return str != null && str.equals(this.n);
    }

    public final void f() {
        synchronized (this.f3953f) {
            this.f3960m -= 100;
        }
    }

    public final void g() {
        synchronized (this.f3953f) {
            this.f3959l--;
        }
    }

    public final void h() {
        synchronized (this.f3953f) {
            this.f3959l++;
        }
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final void i() {
        synchronized (this.f3953f) {
            int i2 = (this.f3957j * this.a) + (this.f3958k * this.f3949b);
            if (i2 > this.f3960m) {
                this.f3960m = i2;
                if (((Boolean) a50.g().a(k80.W)).booleanValue() && !x0.j().m().b()) {
                    this.n = this.f3951d.a(this.f3954g);
                    this.o = this.f3951d.a(this.f3955h);
                }
                if (((Boolean) a50.g().a(k80.Y)).booleanValue() && !x0.j().m().d()) {
                    this.p = this.f3952e.a(this.f3955h, this.f3956i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.f3957j;
    }

    public final String toString() {
        int i2 = this.f3958k;
        int i3 = this.f3960m;
        int i4 = this.f3957j;
        String a2 = a(this.f3954g, 100);
        String a3 = a(this.f3955h, 100);
        String str = this.n;
        String str2 = this.o;
        String str3 = this.p;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 165 + String.valueOf(a3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(a2);
        sb.append("\n viewableText");
        sb.append(a3);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
