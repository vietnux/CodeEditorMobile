package net.grandcentrix.tray.provider;

import android.content.Context;
import android.net.Uri;
import h.b.a.c.j;

/* access modifiers changed from: package-private */
public class f {
    private final Uri a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f9559b;

    /* renamed from: c  reason: collision with root package name */
    private Context f9560c;

    public final class a {
        private boolean a;

        /* renamed from: b  reason: collision with root package name */
        private String f9561b;

        /* renamed from: c  reason: collision with root package name */
        private String f9562c;

        /* renamed from: d  reason: collision with root package name */
        private j.a f9563d = j.a.UNDEFINED;

        public a(Context context) {
            f.this.f9560c = context.getApplicationContext();
        }

        public Uri a() {
            Uri.Builder buildUpon = (this.a ? f.this.f9559b : f.this.a).buildUpon();
            String str = this.f9562c;
            if (str != null) {
                buildUpon.appendPath(str);
            }
            String str2 = this.f9561b;
            if (str2 != null) {
                buildUpon.appendPath(str2);
            }
            j.a aVar = this.f9563d;
            if (aVar != j.a.UNDEFINED) {
                buildUpon.appendQueryParameter("backup", j.a.USER.equals(aVar) ? "true" : "false");
            }
            return buildUpon.build();
        }

        public a a(j.a aVar) {
            this.f9563d = aVar;
            return this;
        }

        public a a(String str) {
            this.f9561b = str;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a b(String str) {
            this.f9562c = str;
            return this;
        }
    }

    public f(Context context) {
        this.f9560c = context;
        this.a = c.b(context);
        this.f9559b = c.c(context);
    }

    public a a() {
        return new a(this.f9560c);
    }
}
