package com.android.billingclient.api;

import java.util.ArrayList;

public class f {
    private boolean a;

    /* renamed from: b  reason: collision with root package name */
    private String f2723b;

    /* renamed from: c  reason: collision with root package name */
    private String f2724c;

    /* renamed from: d  reason: collision with root package name */
    private String f2725d;

    /* renamed from: e  reason: collision with root package name */
    private int f2726e = 0;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<k> f2727f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2728g;

    public static class a {
        private String a;

        /* renamed from: b  reason: collision with root package name */
        private String f2729b;

        /* renamed from: c  reason: collision with root package name */
        private String f2730c;

        /* renamed from: d  reason: collision with root package name */
        private int f2731d = 0;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<k> f2732e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2733f;

        /* synthetic */ a(t tVar) {
        }

        public a a(k kVar) {
            ArrayList<k> arrayList = new ArrayList<>();
            arrayList.add(kVar);
            this.f2732e = arrayList;
            return this;
        }

        public f a() {
            ArrayList<k> arrayList = this.f2732e;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<k> arrayList2 = this.f2732e;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (arrayList2.get(i2) != null) {
                    i2 = i3;
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.f2732e.size() > 1) {
                k kVar = this.f2732e.get(0);
                String e2 = kVar.e();
                ArrayList<k> arrayList3 = this.f2732e;
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    k kVar2 = arrayList3.get(i4);
                    if (!e2.equals("play_pass_subs") && !kVar2.e().equals("play_pass_subs") && !e2.equals(kVar2.e())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String h2 = kVar.h();
                ArrayList<k> arrayList4 = this.f2732e;
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    k kVar3 = arrayList4.get(i5);
                    if (!e2.equals("play_pass_subs") && !kVar3.e().equals("play_pass_subs") && !h2.equals(kVar3.h())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            f fVar = new f(null);
            fVar.a = true ^ this.f2732e.get(0).h().isEmpty();
            fVar.f2723b = this.a;
            fVar.f2725d = this.f2730c;
            fVar.f2724c = this.f2729b;
            fVar.f2726e = this.f2731d;
            fVar.f2727f = this.f2732e;
            fVar.f2728g = this.f2733f;
            return fVar;
        }
    }

    /* synthetic */ f(t tVar) {
    }

    public static a h() {
        return new a(null);
    }

    public boolean a() {
        return this.f2728g;
    }

    public final int b() {
        return this.f2726e;
    }

    public final String c() {
        return this.f2723b;
    }

    public final String d() {
        return this.f2725d;
    }

    public final String e() {
        return this.f2724c;
    }

    public final ArrayList<k> f() {
        ArrayList<k> arrayList = new ArrayList<>();
        arrayList.addAll(this.f2727f);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return (!this.f2728g && this.f2723b == null && this.f2725d == null && this.f2726e == 0 && !this.a) ? false : true;
    }
}
