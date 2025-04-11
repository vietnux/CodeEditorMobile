package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.e4;
import java.util.Collections;
import java.util.Map;

public abstract class bc0<T> implements Comparable<bc0<T>> {

    /* renamed from: b  reason: collision with root package name */
    private final e4.a f3866b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3867c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3868d;

    /* renamed from: e  reason: collision with root package name */
    private final int f3869e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f3870f;

    /* renamed from: g  reason: collision with root package name */
    private ej0 f3871g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f3872h;

    /* renamed from: i  reason: collision with root package name */
    private bg0 f3873i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3874j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3875k;

    /* renamed from: l  reason: collision with root package name */
    private c0 f3876l;

    /* renamed from: m  reason: collision with root package name */
    private tw f3877m;
    private zd0 n;

    public bc0(int i2, String str, ej0 ej0) {
        Uri parse;
        String host;
        this.f3866b = e4.a.f4173c ? new e4.a() : null;
        this.f3870f = new Object();
        this.f3874j = true;
        int i3 = 0;
        this.f3875k = false;
        this.f3877m = null;
        this.f3867c = i2;
        this.f3868d = str;
        this.f3871g = ej0;
        this.f3876l = new y10();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.f3869e = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.bc0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final bc0<?> a(int i2) {
        this.f3872h = Integer.valueOf(i2);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.bc0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final bc0<?> a(bg0 bg0) {
        this.f3873i = bg0;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.bc0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final bc0<?> a(tw twVar) {
        this.f3877m = twVar;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract di0<T> a(ba0 ba0);

    public Map<String, String> a() {
        return Collections.emptyMap();
    }

    public final void a(d3 d3Var) {
        ej0 ej0;
        synchronized (this.f3870f) {
            ej0 = this.f3871g;
        }
        if (ej0 != null) {
            ej0.a(d3Var);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(di0<?> di0) {
        zd0 zd0;
        synchronized (this.f3870f) {
            zd0 = this.n;
        }
        if (zd0 != null) {
            zd0.a(this, di0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(zd0 zd0) {
        synchronized (this.f3870f) {
            this.n = zd0;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final void a(String str) {
        if (e4.a.f4173c) {
            this.f3866b.a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        bg0 bg0 = this.f3873i;
        if (bg0 != null) {
            bg0.b(this);
        }
        if (e4.a.f4173c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bd0(this, str, id));
                return;
            }
            this.f3866b.a(str, id);
            this.f3866b.a(toString());
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        bc0 bc0 = (bc0) obj;
        af0 af0 = af0.NORMAL;
        return af0 == af0 ? this.f3872h.intValue() - bc0.f3872h.intValue() : af0.ordinal() - af0.ordinal();
    }

    public final int h() {
        return this.f3867c;
    }

    public final String i() {
        return this.f3868d;
    }

    public final boolean j() {
        synchronized (this.f3870f) {
        }
        return false;
    }

    public final int k() {
        return this.f3869e;
    }

    public final tw l() {
        return this.f3877m;
    }

    public byte[] m() {
        return null;
    }

    public final boolean n() {
        return this.f3874j;
    }

    public final int o() {
        return this.f3876l.L();
    }

    public final c0 p() {
        return this.f3876l;
    }

    public final void q() {
        synchronized (this.f3870f) {
            this.f3875k = true;
        }
    }

    public final boolean r() {
        boolean z;
        synchronized (this.f3870f) {
            z = this.f3875k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        zd0 zd0;
        synchronized (this.f3870f) {
            zd0 = this.n;
        }
        if (zd0 != null) {
            zd0.a(this);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f3869e));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        String str = this.f3868d;
        String valueOf2 = String.valueOf(af0.NORMAL);
        String valueOf3 = String.valueOf(this.f3872h);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
