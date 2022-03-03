package e.d.a.a;

public class s extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8268d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8269e = new String[0];

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8270f = {'{', '}', ';', ':', ',', '[', ']', '<', '>', '/', '(', ')'};

    private s() {
        super.a(f8269e);
        super.a(f8270f);
    }

    public static m e() {
        if (f8268d == null) {
            f8268d = new s();
        }
        return f8268d;
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
        return false;
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "css".equals(str2);
    }

    @Override // e.d.a.a.m
    public boolean b(char c2) {
        return c2 == '\'';
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3) {
        return c2 == '*' && c3 == '/';
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3, char c4) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean c(char c2, char c3) {
        return c2 == '/' && c3 == '*';
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
