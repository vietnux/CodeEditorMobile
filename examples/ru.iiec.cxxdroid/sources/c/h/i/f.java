package c.h.i;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import c.h.k.h;
import java.util.concurrent.Executor;

public class f {

    public static class a {
        private final int a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f2342b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.a = i2;
            this.f2342b = bVarArr;
        }

        static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] a() {
            return this.f2342b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class b {
        private final Uri a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2343b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2344c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2345d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2346e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z, int i4) {
            h.a(uri);
            this.a = uri;
            this.f2343b = i2;
            this.f2344c = i3;
            this.f2345d = z;
            this.f2346e = i4;
        }

        static b a(Uri uri, int i2, int i3, boolean z, int i4) {
            return new b(uri, i2, i3, z, i4);
        }

        public int a() {
            return this.f2346e;
        }

        public int b() {
            return this.f2343b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.f2344c;
        }

        public boolean e() {
            return this.f2345d;
        }
    }

    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void a(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i2, boolean z, int i3, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        return z ? e.a(context, dVar, aVar, i2, i3) : e.a(context, dVar, i2, (Executor) null, aVar);
    }
}
