package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.x0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@k2
@TargetApi(14)
public final class ie extends ue implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> r = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final lf f4607d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4608e;

    /* renamed from: f  reason: collision with root package name */
    private int f4609f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f4610g = 0;

    /* renamed from: h  reason: collision with root package name */
    private MediaPlayer f4611h;

    /* renamed from: i  reason: collision with root package name */
    private Uri f4612i;

    /* renamed from: j  reason: collision with root package name */
    private int f4613j;

    /* renamed from: k  reason: collision with root package name */
    private int f4614k;

    /* renamed from: l  reason: collision with root package name */
    private int f4615l;

    /* renamed from: m  reason: collision with root package name */
    private int f4616m;
    private Cif n;
    private boolean o;
    private int p;
    private te q;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            r.put(-1004, "MEDIA_ERROR_IO");
            r.put(-1007, "MEDIA_ERROR_MALFORMED");
            r.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            r.put(-110, "MEDIA_ERROR_TIMED_OUT");
            r.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        r.put(100, "MEDIA_ERROR_SERVER_DIED");
        r.put(1, "MEDIA_ERROR_UNKNOWN");
        r.put(1, "MEDIA_INFO_UNKNOWN");
        r.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        r.put(701, "MEDIA_INFO_BUFFERING_START");
        r.put(702, "MEDIA_INFO_BUFFERING_END");
        r.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        r.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        r.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            r.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            r.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public ie(Context context, boolean z, boolean z2, jf jfVar, lf lfVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.f4607d = lfVar;
        this.o = z;
        this.f4608e = z2;
        this.f4607d.a(this);
    }

    private final void a(float f2) {
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            qc.d("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void a(boolean z) {
        l9.e("AdMediaPlayerView release");
        Cif ifVar = this.n;
        if (ifVar != null) {
            ifVar.b();
            this.n = null;
        }
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f4611h.release();
            this.f4611h = null;
            c(0);
            if (z) {
                this.f4610g = 0;
                this.f4610g = 0;
            }
        }
    }

    private final void c(int i2) {
        if (i2 == 3) {
            this.f4607d.c();
            this.f5729c.b();
        } else if (this.f4609f == 3) {
            this.f4607d.d();
            this.f5729c.c();
        }
        this.f4609f = i2;
    }

    private final void f() {
        l9.e("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f4612i != null && surfaceTexture != null) {
            a(false);
            try {
                x0.w();
                this.f4611h = new MediaPlayer();
                this.f4611h.setOnBufferingUpdateListener(this);
                this.f4611h.setOnCompletionListener(this);
                this.f4611h.setOnErrorListener(this);
                this.f4611h.setOnInfoListener(this);
                this.f4611h.setOnPreparedListener(this);
                this.f4611h.setOnVideoSizeChangedListener(this);
                if (this.o) {
                    this.n = new Cif(getContext());
                    this.n.a(surfaceTexture, getWidth(), getHeight());
                    this.n.start();
                    SurfaceTexture c2 = this.n.c();
                    if (c2 != null) {
                        surfaceTexture = c2;
                    } else {
                        this.n.b();
                        this.n = null;
                    }
                }
                this.f4611h.setDataSource(getContext(), this.f4612i);
                x0.x();
                this.f4611h.setSurface(new Surface(surfaceTexture));
                this.f4611h.setAudioStreamType(3);
                this.f4611h.setScreenOnWhilePlaying(true);
                this.f4611h.prepareAsync();
                c(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.f4612i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                qc.c(sb.toString(), e2);
                onError(this.f4611h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r8 = this;
            boolean r0 = r8.f4608e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.h()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.f4611h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.f4610g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.l9.e(r0)
            r0 = 0
            r8.a(r0)
            android.media.MediaPlayer r0 = r8.f4611h
            r0.start()
            android.media.MediaPlayer r0 = r8.f4611h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.x0.m()
            long r1 = r1.a()
        L_0x0034:
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.f4611h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.x0.m()
            long r3 = r3.a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.f4611h
            r0.pause()
            r8.a()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ie.g():void");
    }

    private final boolean h() {
        int i2;
        return (this.f4611h == null || (i2 = this.f4609f) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.pf, com.google.android.gms.internal.ads.ue
    public final void a() {
        a(this.f5729c.a());
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void a(float f2, float f3) {
        Cif ifVar = this.n;
        if (ifVar != null) {
            ifVar.a(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void a(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        l9.e(sb.toString());
        if (h()) {
            this.f4611h.seekTo(i2);
            this.p = 0;
            return;
        }
        this.p = i2;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void a(te teVar) {
        this.q = teVar;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void b() {
        l9.e("AdMediaPlayerView pause");
        if (h() && this.f4611h.isPlaying()) {
            this.f4611h.pause();
            c(4);
            u9.f5718h.post(new se(this));
        }
        this.f4610g = 4;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2) {
        te teVar = this.q;
        if (teVar != null) {
            teVar.onWindowVisibilityChanged(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void c() {
        l9.e("AdMediaPlayerView play");
        if (h()) {
            this.f4611h.start();
            c(3);
            this.f5728b.a();
            u9.f5718h.post(new re(this));
        }
        this.f4610g = 3;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void d() {
        l9.e("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f4611h.release();
            this.f4611h = null;
            c(0);
            this.f4610g = 0;
        }
        this.f4607d.a();
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final String e() {
        String str = this.o ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final int getCurrentPosition() {
        if (h()) {
            return this.f4611h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final int getDuration() {
        if (h()) {
            return this.f4611h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        l9.e("AdMediaPlayerView completion");
        c(5);
        this.f4610g = 5;
        u9.f5718h.post(new le(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        qc.d(sb.toString());
        c(-1);
        this.f4610g = -1;
        u9.f5718h.post(new me(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        l9.e(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ie.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        l9.e("AdMediaPlayerView prepared");
        c(2);
        this.f4607d.b();
        u9.f5718h.post(new ke(this));
        this.f4613j = mediaPlayer.getVideoWidth();
        this.f4614k = mediaPlayer.getVideoHeight();
        int i2 = this.p;
        if (i2 != 0) {
            a(i2);
        }
        g();
        int i3 = this.f4613j;
        int i4 = this.f4614k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        qc.c(sb.toString());
        if (this.f4610g == 3) {
            c();
        }
        a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        l9.e("AdMediaPlayerView surface created");
        f();
        u9.f5718h.post(new oe(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l9.e("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f4611h;
        if (mediaPlayer != null && this.p == 0) {
            this.p = mediaPlayer.getCurrentPosition();
        }
        Cif ifVar = this.n;
        if (ifVar != null) {
            ifVar.b();
        }
        u9.f5718h.post(new qe(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        l9.e("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.f4610g == 3;
        if (!(this.f4613j == i2 && this.f4614k == i3)) {
            z = false;
        }
        if (this.f4611h != null && z2 && z) {
            int i4 = this.p;
            if (i4 != 0) {
                a(i4);
            }
            c();
        }
        Cif ifVar = this.n;
        if (ifVar != null) {
            ifVar.a(i2, i3);
        }
        u9.f5718h.post(new pe(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f4607d.b(this);
        this.f5728b.a(surfaceTexture, this.q);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        l9.e(sb.toString());
        this.f4613j = mediaPlayer.getVideoWidth();
        this.f4614k = mediaPlayer.getVideoHeight();
        if (this.f4613j != 0 && this.f4614k != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        l9.e(sb.toString());
        u9.f5718h.post(new je(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.ue
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        k20 a = k20.a(parse);
        if (a != null) {
            parse = Uri.parse(a.f4749b);
        }
        this.f4612i = parse;
        this.p = 0;
        f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = ie.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
