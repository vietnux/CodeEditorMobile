package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import b.a.b.a.b;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends b {

    /* renamed from: d  reason: collision with root package name */
    private final String f8d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f9e;

    /* renamed from: f  reason: collision with root package name */
    private final c f10f;

    /* access modifiers changed from: protected */
    @Override // b.a.b.a.b
    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f10f.a(this.f8d, this.f9e);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f10f.a(this.f8d, this.f9e, arrayList);
    }
}
