package c.h.i;

import android.util.Base64;
import c.h.k.h;
import java.util.List;

public final class d {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2325b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2326c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f2327d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2328e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2329f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        h.a(str);
        this.a = str;
        h.a(str2);
        this.f2325b = str2;
        h.a(str3);
        this.f2326c = str3;
        h.a(list);
        this.f2327d = list;
        this.f2329f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> a() {
        return this.f2327d;
    }

    public int b() {
        return this.f2328e;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f2329f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f2325b;
    }

    public String f() {
        return this.f2326c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.f2325b + ", mQuery: " + this.f2326c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f2327d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2327d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2328e);
        return sb.toString();
    }
}
