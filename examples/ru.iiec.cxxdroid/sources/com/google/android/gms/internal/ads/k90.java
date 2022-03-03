package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@k2
public final class k90 extends va0 {

    /* renamed from: k  reason: collision with root package name */
    private static final int f4801k = Color.rgb(12, 174, 206);

    /* renamed from: l  reason: collision with root package name */
    private static final int f4802l = Color.rgb(204, 204, 204);

    /* renamed from: m  reason: collision with root package name */
    private static final int f4803m = f4801k;

    /* renamed from: b  reason: collision with root package name */
    private final String f4804b;

    /* renamed from: c  reason: collision with root package name */
    private final List<o90> f4805c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<ya0> f4806d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final int f4807e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4808f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4809g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4810h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4811i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f4812j;

    public k90(String str, List<o90> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f4804b = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                o90 o90 = list.get(i4);
                this.f4805c.add(o90);
                this.f4806d.add(o90);
            }
        }
        this.f4807e = num != null ? num.intValue() : f4802l;
        this.f4808f = num2 != null ? num2.intValue() : f4803m;
        this.f4809g = num3 != null ? num3.intValue() : 12;
        this.f4810h = i2;
        this.f4811i = i3;
        this.f4812j = z;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final List<ya0> O0() {
        return this.f4806d;
    }

    public final int f2() {
        return this.f4807e;
    }

    public final int g2() {
        return this.f4808f;
    }

    public final int h2() {
        return this.f4809g;
    }

    public final List<o90> i2() {
        return this.f4805c;
    }

    public final int j2() {
        return this.f4810h;
    }

    public final int k2() {
        return this.f4811i;
    }

    public final boolean l2() {
        return this.f4812j;
    }

    @Override // com.google.android.gms.internal.ads.ua0
    public final String v() {
        return this.f4804b;
    }
}
