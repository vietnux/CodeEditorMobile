package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {
    a a;

    /* renamed from: b  reason: collision with root package name */
    a f62b;

    /* access modifiers changed from: private */
    public class a extends Handler {
    }

    private static class b implements f.a {
        private final WeakReference<c> a;

        b(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.f.a
        public void a(int i2, int i3, int i4, int i5, int i6) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(new e(i2, i3, i4, i5, i6));
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void a(CharSequence charSequence) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(charSequence);
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void a(Object obj) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(MediaMetadataCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void a(String str, Bundle bundle) {
            c cVar = this.a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f62b == null || Build.VERSION.SDK_INT >= 23) {
                cVar.a(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void a(List<?> list) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(MediaSessionCompat.QueueItem.a(list));
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void b(Object obj) {
            c cVar = this.a.get();
            if (cVar != null && cVar.f62b == null) {
                cVar.a(PlaybackStateCompat.a(obj));
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void e(Bundle bundle) {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a(bundle);
            }
        }

        @Override // android.support.v4.media.session.f.a
        public void u() {
            c cVar = this.a.get();
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    public static class BinderC0002c extends a.AbstractBinderC0000a {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<c> f63b;

        BinderC0002c(c cVar) {
            this.f63b = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void a(MediaMetadataCompat mediaMetadataCompat) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(4, parcelableVolumeInfo != null ? new e(parcelableVolumeInfo.f41b, parcelableVolumeInfo.f42c, parcelableVolumeInfo.f43d, parcelableVolumeInfo.f44e, parcelableVolumeInfo.f45f) : null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(CharSequence charSequence) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void a(List<MediaSessionCompat.QueueItem> list) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void b(int i2) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(9, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void b(boolean z) {
        }

        @Override // android.support.v4.media.session.a
        public void c(String str, Bundle bundle) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void d(int i2) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(12, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void d0() {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void e(Bundle bundle) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void f(boolean z) {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void u() {
            c cVar = this.f63b.get();
            if (cVar != null) {
                cVar.a(8, null, null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            f.a(new b(this));
        } else {
            this.f62b = new BinderC0002c(this);
        }
    }

    public void a() {
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, Object obj, Bundle bundle) {
        a aVar = this.a;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i2, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public void a(Bundle bundle) {
    }

    public void a(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void a(PlaybackStateCompat playbackStateCompat) {
    }

    public void a(e eVar) {
    }

    public void a(CharSequence charSequence) {
    }

    public void a(String str, Bundle bundle) {
    }

    public void a(List<MediaSessionCompat.QueueItem> list) {
    }

    public void binderDied() {
        a(8, null, null);
    }
}
