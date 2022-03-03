package e.d.a.a;

public class a0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8179d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8180e = {"abstract", "and", "array", "as", "break", "case", "catch", "class", "clone", "const", "continue", "declare", "default", "do", "else", "elseif", "enddeclare", "endfor", "endforeach", "endif", "endswitch", "endwhile", "extends", "final", "for", "foreach", "function", "global", "goto", "if", "implements", "interface", "instanceof", "namespace", "new", "or", "private", "protected", "public", "static", "switch", "throw", "try", "use", "var", "while", "xor", "die", "echo", "empty", "exit", "eval", "include", "include_once", "isset", "list", "require", "require_once", "return", "print", "unset", "self", "static", "parent", "true", "TRUE", "false", "FALSE", "null", "NULL"};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8181f = {'(', ')', '{', '}', '.', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^', '`', '@'};

    private a0() {
        super.a(f8180e);
        super.a(f8181f);
    }

    public static m e() {
        if (f8179d == null) {
            f8179d = new a0();
        }
        return f8179d;
    }

    @Override // e.d.a.a.m
    public boolean d(char c2) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean h(char c2) {
        return c2 == '$';
    }
}
