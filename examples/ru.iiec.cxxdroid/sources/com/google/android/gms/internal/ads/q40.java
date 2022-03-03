package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.j;

@k2
public final class q40 {
    private final d[] a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5303b;

    public q40(Context context, AttributeSet attributeSet) {
        IllegalArgumentException illegalArgumentException;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, j.AdsAttrs);
        String string = obtainAttributes.getString(j.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(j.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.a = a(string);
        } else if (!z && z2) {
            this.a = a(string2);
        } else if (z) {
            throw illegalArgumentException;
        } else {
            illegalArgumentException = new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            throw illegalArgumentException;
        }
        this.f5303b = obtainAttributes.getString(j.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f5303b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static d[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        d[] dVarArr = new d[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            String trim = split[i2].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    dVarArr[i2] = new d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                dVarArr[i2] = d.f3103d;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i2] = d.f3105f;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i2] = d.f3104e;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i2] = d.f3106g;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i2] = d.f3107h;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i2] = d.f3109j;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i2] = d.f3108i;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i2] = d.f3110k;
            } else if ("ICON".equals(trim)) {
                dVarArr[i2] = d.f3111l;
            } else {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final String a() {
        return this.f5303b;
    }

    public final d[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
