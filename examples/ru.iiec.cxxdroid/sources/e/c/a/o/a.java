package e.c.a.o;

import g.r.d.g;
import g.r.d.i;
import g.v.e;

public final class a implements Comparable<a> {

    /* renamed from: b  reason: collision with root package name */
    private String f8125b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8126c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8127d;

    /* renamed from: e  reason: collision with root package name */
    private String f8128e;

    /* renamed from: f  reason: collision with root package name */
    private String f8129f;

    /* renamed from: g  reason: collision with root package name */
    private String f8130g;

    /* renamed from: h  reason: collision with root package name */
    private String f8131h;

    /* renamed from: i  reason: collision with root package name */
    private String f8132i;

    /* renamed from: j  reason: collision with root package name */
    private String f8133j;

    /* renamed from: k  reason: collision with root package name */
    private String f8134k;

    /* renamed from: l  reason: collision with root package name */
    private b f8135l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8136m;
    private String n;
    private String o;

    public a(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar, boolean z3, String str9, String str10) {
        i.d(str, "definedName");
        i.d(str2, "libraryName");
        i.d(str3, "author");
        i.d(str4, "authorWebsite");
        i.d(str5, "libraryDescription");
        i.d(str6, "libraryVersion");
        i.d(str7, "libraryArtifactId");
        i.d(str8, "libraryWebsite");
        i.d(str9, "repositoryLink");
        i.d(str10, "classPath");
        this.f8125b = str;
        this.f8126c = z;
        this.f8127d = z2;
        this.f8128e = str2;
        this.f8129f = str3;
        this.f8130g = str4;
        this.f8131h = str5;
        this.f8132i = str6;
        this.f8133j = str7;
        this.f8134k = str8;
        this.f8135l = bVar;
        this.f8136m = z3;
        this.n = str9;
        this.o = str10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar, boolean z3, String str9, String str10, int i2, g gVar) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? null : bVar, (i2 & 2048) != 0 ? true : z3, (i2 & 4096) != 0 ? "" : str9, (i2 & 8192) != 0 ? "" : str10);
    }

    private final String j(String str) {
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        i.d(aVar, "other");
        return e.a(this.f8128e, aVar.f8128e, true);
    }

    public final String a() {
        return this.f8129f;
    }

    public final void a(b bVar) {
        this.f8135l = bVar;
    }

    public final void a(String str) {
        i.d(str, "<set-?>");
        this.f8129f = str;
    }

    public final void a(boolean z) {
        this.f8126c = z;
    }

    public final void b(a aVar) {
        i.d(aVar, "enchantWith");
        String j2 = j(aVar.f8128e);
        if (j2 == null) {
            j2 = this.f8128e;
        }
        this.f8128e = j2;
        String j3 = j(aVar.f8129f);
        if (j3 == null) {
            j3 = this.f8129f;
        }
        this.f8129f = j3;
        String j4 = j(aVar.f8130g);
        if (j4 == null) {
            j4 = this.f8130g;
        }
        this.f8130g = j4;
        String j5 = j(aVar.f8131h);
        if (j5 == null) {
            j5 = this.f8131h;
        }
        this.f8131h = j5;
        String j6 = j(aVar.f8132i);
        if (j6 == null) {
            j6 = this.f8132i;
        }
        this.f8132i = j6;
        String j7 = j(aVar.f8133j);
        if (j7 == null) {
            j7 = this.f8133j;
        }
        this.f8133j = j7;
        String j8 = j(aVar.f8134k);
        if (j8 == null) {
            j8 = this.f8134k;
        }
        this.f8134k = j8;
        b bVar = aVar.f8135l;
        if (bVar == null) {
            bVar = this.f8135l;
        }
        this.f8135l = bVar;
        this.f8136m = aVar.f8136m;
        String j9 = j(aVar.n);
        if (j9 == null) {
            j9 = this.n;
        }
        this.n = j9;
    }

    public final void b(String str) {
        i.d(str, "<set-?>");
        this.f8130g = str;
    }

    public final void b(boolean z) {
        this.f8136m = z;
    }

    public final void c(String str) {
        i.d(str, "<set-?>");
        this.o = str;
    }

    public final void c(boolean z) {
        this.f8127d = z;
    }

    public final void d(String str) {
        i.d(str, "<set-?>");
        this.f8133j = str;
    }

    public final void e(String str) {
        i.d(str, "<set-?>");
        this.f8131h = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f8125b, aVar.f8125b) && this.f8126c == aVar.f8126c && this.f8127d == aVar.f8127d && i.a(this.f8128e, aVar.f8128e) && i.a(this.f8129f, aVar.f8129f) && i.a(this.f8130g, aVar.f8130g) && i.a(this.f8131h, aVar.f8131h) && i.a(this.f8132i, aVar.f8132i) && i.a(this.f8133j, aVar.f8133j) && i.a(this.f8134k, aVar.f8134k) && i.a(this.f8135l, aVar.f8135l) && this.f8136m == aVar.f8136m && i.a(this.n, aVar.n) && i.a(this.o, aVar.o);
    }

    public final void f(String str) {
        i.d(str, "<set-?>");
        this.f8128e = str;
    }

    public final void g(String str) {
        i.d(str, "<set-?>");
        this.f8132i = str;
    }

    public final String h() {
        return this.f8130g;
    }

    public final void h(String str) {
        i.d(str, "<set-?>");
        this.f8134k = str;
    }

    public int hashCode() {
        String str = this.f8125b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f8126c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f8127d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str2 = this.f8128e;
        int hashCode2 = (i10 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8129f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8130g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8131h;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f8132i;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f8133j;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f8134k;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        b bVar = this.f8135l;
        int hashCode9 = (hashCode8 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z3 = this.f8136m;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode9 + i11) * 31;
        String str9 = this.n;
        int hashCode10 = (i14 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.o;
        if (str10 != null) {
            i2 = str10.hashCode();
        }
        return hashCode10 + i2;
    }

    public final String i() {
        return this.o;
    }

    public final void i(String str) {
        i.d(str, "<set-?>");
        this.n = str;
    }

    public final String j() {
        return this.f8125b;
    }

    public final String k() {
        return this.f8131h;
    }

    public final String l() {
        return this.f8128e;
    }

    public final String m() {
        return this.f8132i;
    }

    public final String n() {
        return this.f8134k;
    }

    public final b o() {
        return this.f8135l;
    }

    public final String p() {
        return this.n;
    }

    public String toString() {
        return "Library(definedName=" + this.f8125b + ", isInternal=" + this.f8126c + ", isPlugin=" + this.f8127d + ", libraryName=" + this.f8128e + ", author=" + this.f8129f + ", authorWebsite=" + this.f8130g + ", libraryDescription=" + this.f8131h + ", libraryVersion=" + this.f8132i + ", libraryArtifactId=" + this.f8133j + ", libraryWebsite=" + this.f8134k + ", license=" + this.f8135l + ", isOpenSource=" + this.f8136m + ", repositoryLink=" + this.n + ", classPath=" + this.o + ")";
    }
}
