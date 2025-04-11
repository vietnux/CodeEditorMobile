package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import b.a.b.a.b;

class MediaBrowserCompat$ItemReceiver extends b {

    /* renamed from: d  reason: collision with root package name */
    private final String f4d;

    /* renamed from: e  reason: collision with root package name */
    private final b f5e;

    /* access modifiers changed from: protected */
    @Override // b.a.b.a.b
    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f5e.a(this.f4d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f5e.a((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f5e.a(this.f4d);
        }
    }
}
