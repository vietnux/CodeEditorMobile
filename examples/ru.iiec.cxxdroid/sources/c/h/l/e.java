package c.h.l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import c.h.k.h;

public final class e {
    final ClipData a;

    /* renamed from: b  reason: collision with root package name */
    final int f2392b;

    /* renamed from: c  reason: collision with root package name */
    final int f2393c;

    /* renamed from: d  reason: collision with root package name */
    final Uri f2394d;

    /* renamed from: e  reason: collision with root package name */
    final Bundle f2395e;

    public static final class a {
        ClipData a;

        /* renamed from: b  reason: collision with root package name */
        int f2396b;

        /* renamed from: c  reason: collision with root package name */
        int f2397c;

        /* renamed from: d  reason: collision with root package name */
        Uri f2398d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f2399e;

        public a(ClipData clipData, int i2) {
            this.a = clipData;
            this.f2396b = i2;
        }

        public a a(int i2) {
            this.f2397c = i2;
            return this;
        }

        public a a(Uri uri) {
            this.f2398d = uri;
            return this;
        }

        public a a(Bundle bundle) {
            this.f2399e = bundle;
            return this;
        }

        public e a() {
            return new e(this);
        }
    }

    e(a aVar) {
        ClipData clipData = aVar.a;
        h.a(clipData);
        this.a = clipData;
        int i2 = aVar.f2396b;
        h.a(i2, 0, 3, "source");
        this.f2392b = i2;
        int i3 = aVar.f2397c;
        h.a(i3, 1);
        this.f2393c = i3;
        this.f2394d = aVar.f2398d;
        this.f2395e = aVar.f2399e;
    }

    static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    static String b(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public ClipData a() {
        return this.a;
    }

    public int b() {
        return this.f2393c;
    }

    public int c() {
        return this.f2392b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        sb.append(b(this.f2392b));
        sb.append(", flags=");
        sb.append(a(this.f2393c));
        String str2 = "";
        if (this.f2394d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.f2394d.toString().length() + ")";
        }
        sb.append(str);
        if (this.f2395e != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
