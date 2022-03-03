package e.c.a.o;

import g.r.d.i;

public final class b {
    private String a;

    /* renamed from: b */
    private String f8137b;

    /* renamed from: c */
    private String f8138c;

    /* renamed from: d */
    private String f8139d;

    /* renamed from: e */
    private String f8140e;

    public b(String str, String str2, String str3, String str4, String str5) {
        i.d(str, "definedName");
        i.d(str2, "licenseName");
        i.d(str3, "licenseWebsite");
        i.d(str4, "licenseShortDescription");
        i.d(str5, "licenseDescription");
        this.a = str;
        this.f8137b = str2;
        this.f8138c = str3;
        this.f8139d = str4;
        this.f8140e = str5;
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.a;
        }
        if ((i2 & 2) != 0) {
            str2 = bVar.f8137b;
        }
        if ((i2 & 4) != 0) {
            str3 = bVar.f8138c;
        }
        if ((i2 & 8) != 0) {
            str4 = bVar.f8139d;
        }
        if ((i2 & 16) != 0) {
            str5 = bVar.f8140e;
        }
        return bVar.a(str, str2, str3, str4, str5);
    }

    public final b a(String str, String str2, String str3, String str4, String str5) {
        i.d(str, "definedName");
        i.d(str2, "licenseName");
        i.d(str3, "licenseWebsite");
        i.d(str4, "licenseShortDescription");
        i.d(str5, "licenseDescription");
        return new b(str, str2, str3, str4, str5);
    }

    public final String a() {
        return this.a;
    }

    public final void a(String str) {
        i.d(str, "<set-?>");
        this.f8140e = str;
    }

    public final String b() {
        return this.f8140e;
    }

    public final void b(String str) {
        i.d(str, "<set-?>");
        this.f8137b = str;
    }

    public final String c() {
        return this.f8137b;
    }

    public final void c(String str) {
        i.d(str, "<set-?>");
        this.f8139d = str;
    }

    public final String d() {
        return this.f8139d;
    }

    public final void d(String str) {
        i.d(str, "<set-?>");
        this.f8138c = str;
    }

    public final String e() {
        return this.f8138c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.a, bVar.a) && i.a(this.f8137b, bVar.f8137b) && i.a(this.f8138c, bVar.f8138c) && i.a(this.f8139d, bVar.f8139d) && i.a(this.f8140e, bVar.f8140e);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8137b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8138c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8139d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8140e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "License(definedName=" + this.a + ", licenseName=" + this.f8137b + ", licenseWebsite=" + this.f8138c + ", licenseShortDescription=" + this.f8139d + ", licenseDescription=" + this.f8140e + ")";
    }
}
