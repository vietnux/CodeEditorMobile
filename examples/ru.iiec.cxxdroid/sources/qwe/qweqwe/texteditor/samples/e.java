package qwe.qweqwe.texteditor.samples;

import android.app.Activity;
import android.content.Context;
import d.c.f;
import java.lang.ref.WeakReference;
import l.a.c;

/* access modifiers changed from: package-private */
public final class e {
    private static final String[] a = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: b  reason: collision with root package name */
    private static l.a.a f9679b;

    /* access modifiers changed from: private */
    public static final class b implements l.a.a {
        private final WeakReference<SamplesActivity> a;

        /* renamed from: b  reason: collision with root package name */
        private final f f9680b;

        private b(SamplesActivity samplesActivity, f fVar) {
            this.a = new WeakReference<>(samplesActivity);
            this.f9680b = fVar;
        }

        @Override // l.a.b
        public void a() {
            SamplesActivity samplesActivity = this.a.get();
            if (samplesActivity != null) {
                androidx.core.app.a.a(samplesActivity, e.a, 1);
            }
        }

        @Override // l.a.a
        public void b() {
            SamplesActivity samplesActivity = this.a.get();
            if (samplesActivity != null) {
                samplesActivity.b(this.f9680b);
            }
        }

        @Override // l.a.b
        public void cancel() {
            SamplesActivity samplesActivity = this.a.get();
            if (samplesActivity != null) {
                samplesActivity.u();
            }
        }
    }

    static void a(SamplesActivity samplesActivity, int i2, int[] iArr) {
        if (i2 == 1) {
            if (c.a(samplesActivity) >= 23 || c.a((Context) samplesActivity, a)) {
                if (c.a(iArr)) {
                    l.a.a aVar = f9679b;
                    if (aVar != null) {
                        aVar.b();
                    }
                } else if (!c.a((Activity) samplesActivity, a)) {
                    samplesActivity.t();
                } else {
                    samplesActivity.u();
                }
                f9679b = null;
                return;
            }
            samplesActivity.u();
        }
    }

    static void a(SamplesActivity samplesActivity, f fVar) {
        if (c.a((Context) samplesActivity, a)) {
            samplesActivity.b(fVar);
            return;
        }
        f9679b = new b(samplesActivity, fVar);
        if (c.a((Activity) samplesActivity, a)) {
            samplesActivity.a(f9679b);
        } else {
            androidx.core.app.a.a(samplesActivity, a, 1);
        }
    }
}
