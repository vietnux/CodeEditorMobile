package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 implements d {
    final Object a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f32b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f33c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f34d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f35b;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f35b.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
                    mediaControllerCompat$MediaControllerImplApi21.f34d.a(b.a.a(e.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f34d.a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class a extends c.BinderC0002c {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void a(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void a(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void e(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a, android.support.v4.media.session.c.BinderC0002c
        public void u() {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f34d.a() != null) {
            for (c cVar : this.f32b) {
                a aVar = new a(cVar);
                this.f33c.put(cVar, aVar);
                cVar.f62b = aVar;
                try {
                    this.f34d.a().a(aVar);
                    cVar.a(13, null, null);
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
                }
            }
            this.f32b.clear();
        }
    }
}
