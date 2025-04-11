package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@k2
@TargetApi(14)
public abstract class ue extends TextureView implements pf {

    /* renamed from: b  reason: collision with root package name */
    protected final df f5728b = new df();

    /* renamed from: c  reason: collision with root package name */
    protected final nf f5729c;

    public ue(Context context) {
        super(context);
        this.f5729c = new nf(context, this);
    }

    @Override // com.google.android.gms.internal.ads.pf
    public abstract void a();

    public abstract void a(float f2, float f3);

    public abstract void a(int i2);

    public abstract void a(te teVar);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract String e();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void setVideoPath(String str);
}
