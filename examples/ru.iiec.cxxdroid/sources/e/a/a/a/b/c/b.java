package e.a.a.a.b.c;

import e.a.a.a.d.a;
import e.a.a.a.d.c;
import e.a.a.a.d.d;

public class b implements a {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6977b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6978c;

    /* renamed from: d  reason: collision with root package name */
    private final d f6979d;

    /* renamed from: e  reason: collision with root package name */
    private final c f6980e;

    /* renamed from: f  reason: collision with root package name */
    private String f6981f;

    b(String str, String str2, long j2, String str3, String str4, int i2, d dVar, c cVar, String str5, long j3, long j4) {
        this.a = str;
        this.f6977b = str2;
        this.f6978c = str4;
        this.f6979d = dVar;
        this.f6980e = cVar;
        this.f6981f = str5;
    }

    @Override // e.a.a.a.d.a
    public e.a.a.a.e.b<String> a() {
        String str = this.f6981f;
        if (str != null) {
            return e.a.a.a.e.c.a((Object) str);
        }
        String str2 = this.a;
        if (str2 == null) {
            return e.a.a.a.e.c.a("This paste doesn't support the raw response");
        }
        e.a.a.a.e.b<String> a2 = e.a.a.a.d.e.a.a(str2);
        if (a2.a()) {
            return a2;
        }
        this.f6981f = a2.get();
        return e.a.a.a.e.c.a((Object) this.f6981f);
    }

    @Override // e.a.a.a.d.a
    public String b() {
        return this.f6978c;
    }

    @Override // e.a.a.a.d.a
    public d c() {
        return this.f6979d;
    }

    @Override // e.a.a.a.d.a
    public c d() {
        return this.f6980e;
    }

    @Override // e.a.a.a.d.a
    public String getTitle() {
        return this.f6977b;
    }
}
