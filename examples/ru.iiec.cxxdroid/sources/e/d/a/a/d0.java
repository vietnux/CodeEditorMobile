package e.d.a.a;

public class d0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8206d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8207e = {"alias", "and", "BEGIN", "begin", "break", "case", "catch", "class", "def", "defined?", "do", "else", "elsif", "END", "end", "ensure", "false", "for", "if", "in", "module", "next", "nil", "not", "or", "public", "private", "protected", "raise", "redo", "rescue", "retry", "return", "self", "super", "then", "throw", "true", "undef", "unless", "until", "when", "while", "yield", "self", "nil", "true", "false", "TRUE", "FALSE", "NIL"};

    private d0() {
        super.a(f8207e);
    }

    public static m e() {
        if (f8206d == null) {
            f8206d = new d0();
        }
        return f8206d;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3) {
        return false;
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
        return c2 == '#';
    }

    @Override // e.d.a.a.m
    public boolean h(char c2) {
        return c2 == '$';
    }
}
