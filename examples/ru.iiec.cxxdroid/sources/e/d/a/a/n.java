package e.d.a.a;

public class n extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8244d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8245e = {"char", "double", "float", "int", "long", "short", "void", "auto", "const", "extern", "register", "static", "volatile", "signed", "unsigned", "sizeof", "typedef", "enum", "struct", "union", "break", "case", "continue", "default", "do", "else", "for", "goto", "if", "return", "switch", "while"};

    private n() {
        super.a(f8245e);
    }

    public static m e() {
        if (f8244d == null) {
            f8244d = new n();
        }
        return f8244d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return '{';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "c".equals(str2) || "h".equals(str2);
    }

    @Override // e.d.a.a.m
    public String c() {
        return "//";
    }
}
