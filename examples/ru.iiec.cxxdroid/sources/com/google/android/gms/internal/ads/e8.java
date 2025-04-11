package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
@k2
@TargetApi(21)
public final class e8 {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f4193d;
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f4194b;

    /* renamed from: c  reason: collision with root package name */
    private final q7 f4195c;

    static {
        HashMap hashMap = new HashMap();
        if (n.i()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f4193d = hashMap;
    }

    e8(Context context, List<String> list, q7 q7Var) {
        this.a = context;
        this.f4194b = list;
        this.f4195c = q7Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> a(java.lang.String[] r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e8.a(java.lang.String[]):java.util.List");
    }
}
