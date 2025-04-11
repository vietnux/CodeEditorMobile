package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@k2
public final class s8 {
    private final e9 a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedList<t8> f5509b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5510c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5511d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5512e;

    /* renamed from: f  reason: collision with root package name */
    private long f5513f;

    /* renamed from: g  reason: collision with root package name */
    private long f5514g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5515h;

    /* renamed from: i  reason: collision with root package name */
    private long f5516i;

    /* renamed from: j  reason: collision with root package name */
    private long f5517j;

    /* renamed from: k  reason: collision with root package name */
    private long f5518k;

    /* renamed from: l  reason: collision with root package name */
    private long f5519l;

    private s8(e9 e9Var, String str, String str2) {
        this.f5510c = new Object();
        this.f5513f = -1;
        this.f5514g = -1;
        this.f5515h = false;
        this.f5516i = -1;
        this.f5517j = 0;
        this.f5518k = -1;
        this.f5519l = -1;
        this.a = e9Var;
        this.f5511d = str;
        this.f5512e = str2;
        this.f5509b = new LinkedList<>();
    }

    public s8(String str, String str2) {
        this(x0.k(), str, str2);
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f5510c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f5511d);
            bundle.putString("slotid", this.f5512e);
            bundle.putBoolean("ismediation", this.f5515h);
            bundle.putLong("treq", this.f5518k);
            bundle.putLong("tresponse", this.f5519l);
            bundle.putLong("timp", this.f5514g);
            bundle.putLong("tload", this.f5516i);
            bundle.putLong("pcc", this.f5517j);
            bundle.putLong("tfetch", this.f5513f);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<t8> it = this.f5509b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void a(long j2) {
        synchronized (this.f5510c) {
            this.f5519l = j2;
            if (this.f5519l != -1) {
                this.a.a(this);
            }
        }
    }

    public final void a(j40 j40) {
        synchronized (this.f5510c) {
            this.f5518k = SystemClock.elapsedRealtime();
            this.a.a(j40, this.f5518k);
        }
    }

    public final void a(boolean z) {
        synchronized (this.f5510c) {
            if (this.f5519l != -1) {
                this.f5516i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f5514g = this.f5516i;
                    this.a.a(this);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f5510c) {
            if (this.f5519l != -1 && this.f5514g == -1) {
                this.f5514g = SystemClock.elapsedRealtime();
                this.a.a(this);
            }
            this.a.a();
        }
    }

    public final void b(long j2) {
        synchronized (this.f5510c) {
            if (this.f5519l != -1) {
                this.f5513f = j2;
                this.a.a(this);
            }
        }
    }

    public final void b(boolean z) {
        synchronized (this.f5510c) {
            if (this.f5519l != -1) {
                this.f5515h = z;
                this.a.a(this);
            }
        }
    }

    public final void c() {
        synchronized (this.f5510c) {
            if (this.f5519l != -1) {
                t8 t8Var = new t8();
                t8Var.d();
                this.f5509b.add(t8Var);
                this.f5517j++;
                this.a.b();
                this.a.a(this);
            }
        }
    }

    public final void d() {
        synchronized (this.f5510c) {
            if (this.f5519l != -1 && !this.f5509b.isEmpty()) {
                t8 last = this.f5509b.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.a.a(this);
                }
            }
        }
    }
}
