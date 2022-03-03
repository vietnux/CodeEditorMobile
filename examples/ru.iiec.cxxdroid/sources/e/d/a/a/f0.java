package e.d.a.a;

public class f0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8210d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8211e = new String[0];

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8212f = {'<', '>', '='};

    private f0() {
        super.a(f8211e);
        super.a(f8212f);
    }

    public static m e() {
        if (f8210d == null) {
            f8210d = new f0();
        }
        return f8210d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return null;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2) {
        return c2 == '\"';
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3, char c4) {
        return c2 == '-' && c3 == '-' && c4 == '>';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "xml".equals(str2) || "html".equals(str2) || "htm".equals(str2);
    }

    @Override // e.d.a.a.m
    public boolean b(char c2) {
        return c2 == '\'';
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3, char c4) {
        return c2 == '<' && c3 == '!' && c4 == '-';
    }

    @Override // e.d.a.a.m
    public boolean c(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean d(char c2) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean e(char c2) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean h(char c2) {
        return false;
    }
}
