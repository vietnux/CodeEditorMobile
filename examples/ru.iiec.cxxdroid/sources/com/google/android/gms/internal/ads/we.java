package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@k2
public final class we extends FrameLayout implements te {

    /* renamed from: b  reason: collision with root package name */
    private final kf f5923b;

    /* renamed from: c  reason: collision with root package name */
    private final FrameLayout f5924c;

    /* renamed from: d  reason: collision with root package name */
    private final x80 f5925d;

    /* renamed from: e  reason: collision with root package name */
    private final mf f5926e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5927f;

    /* renamed from: g  reason: collision with root package name */
    private ue f5928g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5929h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5930i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5931j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f5932k;

    /* renamed from: l  reason: collision with root package name */
    private long f5933l;

    /* renamed from: m  reason: collision with root package name */
    private long f5934m;
    private String n;
    private Bitmap o;
    private ImageView p;
    private boolean q;

    public we(Context context, kf kfVar, int i2, boolean z, x80 x80, jf jfVar) {
        super(context);
        this.f5923b = kfVar;
        this.f5925d = x80;
        this.f5924c = new FrameLayout(context);
        addView(this.f5924c, new FrameLayout.LayoutParams(-1, -1));
        c.a(kfVar.x0());
        this.f5928g = kfVar.x0().f3340b.a(context, kfVar, i2, z, x80, jfVar);
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            this.f5924c.addView(ueVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) a50.g().a(k80.w)).booleanValue()) {
                n();
            }
        }
        this.p = new ImageView(context);
        this.f5927f = ((Long) a50.g().a(k80.A)).longValue();
        this.f5932k = ((Boolean) a50.g().a(k80.y)).booleanValue();
        x80 x802 = this.f5925d;
        if (x802 != null) {
            x802.a("spinner_used", this.f5932k ? "1" : "0");
        }
        this.f5926e = new mf(this);
        ue ueVar2 = this.f5928g;
        if (ueVar2 != null) {
            ueVar2.a(this);
        }
        if (this.f5928g == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(kf kfVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        kfVar.a("onVideoEvent", hashMap);
    }

    public static void a(kf kfVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        kfVar.a("onVideoEvent", hashMap);
    }

    public static void a(kf kfVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        kfVar.a("onVideoEvent", hashMap);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f5923b.a("onVideoEvent", hashMap);
    }

    private final boolean p() {
        return this.p.getParent() != null;
    }

    private final void q() {
        if (this.f5923b.b0() != null && this.f5930i && !this.f5931j) {
            this.f5923b.b0().getWindow().clearFlags(128);
            this.f5930i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void a() {
        if (this.f5929h && p()) {
            this.f5924c.removeView(this.p);
        }
        if (this.o != null) {
            long b2 = x0.m().b();
            if (this.f5928g.getBitmap(this.o) != null) {
                this.q = true;
            }
            long b3 = x0.m().b() - b2;
            if (l9.a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b3);
                sb.append("ms");
                l9.e(sb.toString());
            }
            if (b3 > this.f5927f) {
                qc.d("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f5932k = false;
                this.o = null;
                x80 x80 = this.f5925d;
                if (x80 != null) {
                    x80.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void a(float f2, float f3) {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.a(f2, f3);
        }
    }

    public final void a(int i2) {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.a(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void a(int i2, int i3) {
        if (this.f5932k) {
            int max = Math.max(i2 / ((Integer) a50.g().a(k80.z)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) a50.g().a(k80.z)).intValue(), 1);
            Bitmap bitmap = this.o;
            if (bitmap == null || bitmap.getWidth() != max || this.o.getHeight() != max2) {
                this.o = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.q = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.f5924c.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void a(MotionEvent motionEvent) {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.dispatchTouchEvent(motionEvent);
        }
    }

    public final void a(String str) {
        this.n = str;
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void a(String str, String str2) {
        a("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void b() {
        ue ueVar = this.f5928g;
        if (ueVar != null && this.f5934m == 0) {
            a("canplaythrough", "duration", String.valueOf(((float) ueVar.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f5928g.getVideoWidth()), "videoHeight", String.valueOf(this.f5928g.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void c() {
        if (this.q && this.o != null && !p()) {
            this.p.setImageBitmap(this.o);
            this.p.invalidate();
            this.f5924c.addView(this.p, new FrameLayout.LayoutParams(-1, -1));
            this.f5924c.bringChildToFront(this.p);
        }
        this.f5926e.a();
        this.f5934m = this.f5933l;
        u9.f5718h.post(new ze(this));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void d() {
        this.f5926e.b();
        u9.f5718h.post(new ye(this));
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void e() {
        a("pause", new String[0]);
        q();
        this.f5929h = false;
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void f() {
        a("ended", new String[0]);
        q();
    }

    @Override // java.lang.Object
    public final void finalize() {
        try {
            this.f5926e.a();
            if (this.f5928g != null) {
                ue ueVar = this.f5928g;
                Executor executor = rd.a;
                ueVar.getClass();
                executor.execute(xe.a(ueVar));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void g() {
        if (this.f5923b.b0() != null && !this.f5930i) {
            this.f5931j = (this.f5923b.b0().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f5931j) {
                this.f5923b.b0().getWindow().addFlags(128);
                this.f5930i = true;
            }
        }
        this.f5929h = true;
    }

    public final void h() {
        this.f5926e.a();
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.d();
        }
        q();
    }

    public final void i() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.b();
        }
    }

    public final void j() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.c();
        }
    }

    public final void k() {
        if (this.f5928g != null) {
            if (!TextUtils.isEmpty(this.n)) {
                this.f5928g.setVideoPath(this.n);
            } else {
                a("no_src", new String[0]);
            }
        }
    }

    public final void l() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.f5729c.a(true);
            ueVar.a();
        }
    }

    public final void m() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.f5729c.a(false);
            ueVar.a();
        }
    }

    @TargetApi(14)
    public final void n() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            TextView textView = new TextView(ueVar.getContext());
            String valueOf = String.valueOf(this.f5928g.e());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f5924c.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f5924c.bringChildToFront(textView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            long currentPosition = (long) ueVar.getCurrentPosition();
            if (this.f5933l != currentPosition && currentPosition > 0) {
                a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f5933l = currentPosition;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.te
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        if (i2 == 0) {
            this.f5926e.b();
            z = true;
        } else {
            this.f5926e.a();
            this.f5934m = this.f5933l;
            z = false;
        }
        u9.f5718h.post(new af(this, z));
    }

    public final void setVolume(float f2) {
        ue ueVar = this.f5928g;
        if (ueVar != null) {
            ueVar.f5729c.a(f2);
            ueVar.a();
        }
    }
}
