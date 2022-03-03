package e.d.a.a;

public class w extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8275d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8276e = {"abstract", "as", "val", "var", "vararg", "get", "set", "class", "object", "open", "private", "protected", "public", "noinline", "crossinline", "dynamic", "final", "enum", "if", "else", "do", "while", "for", "when", "throw", "try", "catch", "finally", "import", "package", "is", "in", "fun", "override", "companion", "reified", "inline", "lateinit", "init", "interface", "annotation", "data", "sealed", "internal", "infix", "operator", "out", "by", "constructor", "super", "tailrec", "where", "const", "inner", "suspend", "typealias", "external", "expect", "actual", "Byte", "Short", "Char", "Int", "Long", "Boolean", "Float", "Double", "Void", "Unit", "Nothing", "true", "false", "null", "break", "continue", "return", "this"};

    private w() {
        super.a(f8276e);
    }

    public static m e() {
        if (f8275d == null) {
            f8275d = new w();
        }
        return f8275d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return '{';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "kt".equals(str2);
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
