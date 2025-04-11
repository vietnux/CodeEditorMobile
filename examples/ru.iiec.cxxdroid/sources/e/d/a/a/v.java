package e.d.a.a;

public class v extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8273d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8274e = {"in", "of", "if", "for", "while", "finally", "var", "new", "function", "do", "return", "void", "else", "break", "catch", "instanceof", "with", "throw", "case", "default", "try", "this", "switch", "continue", "typeof", "delete", "let", "yield", "const", "export", "super", "debugger", "as", "async", "await", "static", "import", "from", "as", "true", "false", "null", "undefined", "NaN", "Infinity", "constructor", "class"};

    private v() {
        super.a(f8274e);
    }

    public static m e() {
        if (f8273d == null) {
            f8273d = new v();
        }
        return f8273d;
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "js".equals(str2) || "json".equals(str2);
    }

    @Override // e.d.a.a.m
    public boolean d(char c2) {
        return false;
    }
}
