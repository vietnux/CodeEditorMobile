package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import b.a.b.a.b;

class MediaBrowserCompat$CustomActionResultReceiver extends b {

    /* renamed from: d  reason: collision with root package name */
    private final String f1d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f2e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3f;

    /* access modifiers changed from: protected */
    @Override // b.a.b.a.b
    public void a(int i2, Bundle bundle) {
        if (this.f3f != null) {
            MediaSessionCompat.a(bundle);
            if (i2 == -1) {
                this.f3f.a(this.f1d, this.f2e, bundle);
            } else if (i2 == 0) {
                this.f3f.c(this.f1d, this.f2e, bundle);
            } else if (i2 != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i2 + " (extras=" + this.f2e + ", resultData=" + bundle + ")");
            } else {
                this.f3f.b(this.f1d, this.f2e, bundle);
            }
        }
    }
}
