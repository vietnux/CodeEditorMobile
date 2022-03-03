package e.d.a.a;

public class e0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8208d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8209e = {"type", "yield", "lazy", "override", "def", "with", "val", "var", "sealed", "abstract", "private", "trait", "object", "if", "forSome", "for", "while", "throw", "finally", "protected", "extends", "import", "final", "return", "else", "break", "new", "catch", "super", "class", "case", "package", "default", "try", "this", "match", "continue", "throws", "implicit", "true", "false", "null"};

    private e0() {
        super.a(f8209e);
    }

    public static m e() {
        if (f8208d == null) {
            f8208d = new e0();
        }
        return f8208d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return '{';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "scala".equals(str2);
    }

    @Override // e.d.a.a.m
    public String c() {
        return "//";
    }

    @Override // e.d.a.a.m
    public boolean d(char c2) {
        return false;
    }
}
