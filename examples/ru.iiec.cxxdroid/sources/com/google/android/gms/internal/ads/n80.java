package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@k2
public final class n80 {
    private BlockingQueue<x80> a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f5057b;

    /* renamed from: c  reason: collision with root package name */
    private LinkedHashMap<String, String> f5058c = new LinkedHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, r80> f5059d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f5060e;

    /* renamed from: f  reason: collision with root package name */
    private Context f5061f;

    /* renamed from: g  reason: collision with root package name */
    private String f5062g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f5063h;

    /* renamed from: i  reason: collision with root package name */
    private File f5064i;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[SYNTHETIC, Splitter:B:34:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n80.a():void");
    }

    public final r80 a(String str) {
        r80 r80 = this.f5059d.get(str);
        return r80 != null ? r80 : r80.a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, a(key).a(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f5061f = context;
        this.f5062g = str;
        this.f5060e = str2;
        this.f5063h = new AtomicBoolean(false);
        this.f5063h.set(((Boolean) a50.g().a(k80.P)).booleanValue());
        if (this.f5063h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f5064i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f5058c.put(entry.getKey(), entry.getValue());
        }
        this.f5057b = Executors.newSingleThreadExecutor();
        this.f5057b.execute(new o80(this));
        this.f5059d.put("action", r80.f5403b);
        this.f5059d.put("ad_format", r80.f5403b);
        this.f5059d.put("e", r80.f5404c);
    }

    public final void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f5058c.put("e", TextUtils.join(",", list));
        }
    }

    public final boolean a(x80 x80) {
        return this.a.offer(x80);
    }
}
