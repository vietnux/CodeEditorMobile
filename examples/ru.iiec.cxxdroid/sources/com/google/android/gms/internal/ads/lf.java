package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.x0;
import java.util.concurrent.TimeUnit;

@k2
public final class lf {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4872b;

    /* renamed from: c  reason: collision with root package name */
    private final sc f4873c;

    /* renamed from: d  reason: collision with root package name */
    private final v80 f4874d;

    /* renamed from: e  reason: collision with root package name */
    private final x80 f4875e;

    /* renamed from: f  reason: collision with root package name */
    private final ab f4876f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f4877g;

    /* renamed from: h  reason: collision with root package name */
    private final String[] f4878h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4879i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4880j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4881k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4882l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4883m;
    private ue n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public lf(Context context, sc scVar, String str, x80 x80, v80 v80) {
        db dbVar = new db();
        dbVar.a("min_1", Double.MIN_VALUE, 1.0d);
        dbVar.a("1_5", 1.0d, 5.0d);
        dbVar.a("5_10", 5.0d, 10.0d);
        dbVar.a("10_20", 10.0d, 20.0d);
        dbVar.a("20_30", 20.0d, 30.0d);
        dbVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f4876f = dbVar.a();
        this.a = context;
        this.f4873c = scVar;
        this.f4872b = str;
        this.f4875e = x80;
        this.f4874d = v80;
        String str2 = (String) a50.g().a(k80.u);
        if (str2 == null) {
            this.f4878h = new String[0];
            this.f4877g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f4878h = new String[split.length];
        this.f4877g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.f4877g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                qc.c("Unable to parse frame hash target time number.", e2);
                this.f4877g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (((Boolean) a50.g().a(k80.t)).booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f4872b);
            bundle.putString("player", this.n.e());
            for (cb cbVar : this.f4876f.a()) {
                String valueOf = String.valueOf(cbVar.a);
                bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(cbVar.f4004e));
                String valueOf2 = String.valueOf(cbVar.a);
                bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(cbVar.f4003d));
            }
            int i2 = 0;
            while (true) {
                long[] jArr = this.f4877g;
                if (i2 < jArr.length) {
                    String str = this.f4878h[i2];
                    if (str != null) {
                        String valueOf3 = String.valueOf(Long.valueOf(jArr[i2]));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                        sb.append("fh_");
                        sb.append(valueOf3);
                        bundle.putString(sb.toString(), str);
                    }
                    i2++;
                } else {
                    x0.f().a(this.a, this.f4873c.f5529b, "gmob-apps", bundle, true);
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void a(ue ueVar) {
        q80.a(this.f4875e, this.f4874d, "vpc2");
        this.f4879i = true;
        x80 x80 = this.f4875e;
        if (x80 != null) {
            x80.a("vpn", ueVar.e());
        }
        this.n = ueVar;
    }

    public final void b() {
        if (this.f4879i && !this.f4880j) {
            q80.a(this.f4875e, this.f4874d, "vfr2");
            this.f4880j = true;
        }
    }

    public final void b(ue ueVar) {
        if (this.f4881k && !this.f4882l) {
            if (l9.a() && !this.f4882l) {
                l9.e("VideoMetricsMixin first frame");
            }
            q80.a(this.f4875e, this.f4874d, "vff2");
            this.f4882l = true;
        }
        long c2 = x0.m().c();
        if (this.f4883m && this.p && this.q != -1) {
            this.f4876f.a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c2 - this.q)));
        }
        this.p = this.f4883m;
        this.q = c2;
        long longValue = ((Long) a50.g().a(k80.v)).longValue();
        long currentPosition = (long) ueVar.getCurrentPosition();
        int i2 = 0;
        while (true) {
            String[] strArr = this.f4878h;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] != null || longValue <= Math.abs(currentPosition - this.f4877g[i2])) {
                i2++;
            } else {
                String[] strArr2 = this.f4878h;
                int i3 = 8;
                Bitmap bitmap = ueVar.getBitmap(8, 8);
                long j2 = 63;
                int i4 = 0;
                long j3 = 0;
                while (i4 < i3) {
                    long j4 = j2;
                    long j5 = j3;
                    int i5 = 0;
                    while (i5 < i3) {
                        int pixel = bitmap.getPixel(i5, i4);
                        j5 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j4);
                        i5++;
                        j4--;
                        i3 = 8;
                    }
                    i4++;
                    j3 = j5;
                    i3 = 8;
                    j2 = j4;
                }
                strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                return;
            }
        }
    }

    public final void c() {
        this.f4883m = true;
        if (this.f4880j && !this.f4881k) {
            q80.a(this.f4875e, this.f4874d, "vfp2");
            this.f4881k = true;
        }
    }

    public final void d() {
        this.f4883m = false;
    }
}
