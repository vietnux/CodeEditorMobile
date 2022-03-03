package e.d.a.a;

public class u extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8271d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8272e = {"void", "boolean", "byte", "char", "short", "int", "long", "float", "double", "strictfp", "import", "package", "new", "class", "interface", "extends", "implements", "enum", "public", "private", "protected", "static", "abstract", "final", "native", "volatile", "assert", "try", "throw", "throws", "catch", "finally", "instanceof", "super", "this", "if", "else", "for", "do", "while", "switch", "case", "default", "continue", "break", "return", "synchronized", "transient", "true", "false", "null", "var"};

    private u() {
        super.a(f8272e);
    }

    public static m e() {
        if (f8271d == null) {
            f8271d = new u();
        }
        return f8271d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return '{';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "java".equals(str2);
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
