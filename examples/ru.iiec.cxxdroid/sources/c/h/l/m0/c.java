package c.h.l.m0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class c {
    private final AbstractC0052c a;

    /* access modifiers changed from: private */
    public static final class a implements AbstractC0052c {
        final InputContentInfo a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public ClipDescription a() {
            return this.a.getDescription();
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Object b() {
            return this.a;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Uri c() {
            return this.a.getContentUri();
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public void d() {
            this.a.requestPermission();
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Uri e() {
            return this.a.getLinkUri();
        }
    }

    private static final class b implements AbstractC0052c {
        private final Uri a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f2452b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f2453c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.f2452b = clipDescription;
            this.f2453c = uri2;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public ClipDescription a() {
            return this.f2452b;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Object b() {
            return null;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Uri c() {
            return this.a;
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public void d() {
        }

        @Override // c.h.l.m0.c.AbstractC0052c
        public Uri e() {
            return this.f2453c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.h.l.m0.c$c  reason: collision with other inner class name */
    public interface AbstractC0052c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private c(AbstractC0052c cVar) {
        this.a = cVar;
    }

    public static c a(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.c();
    }

    public ClipDescription b() {
        return this.a.a();
    }

    public Uri c() {
        return this.a.e();
    }

    public void d() {
        this.a.d();
    }

    public Object e() {
        return this.a.b();
    }
}
