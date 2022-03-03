package e.d.a.a;

import qwe.qweqwe.texteditor.m0;

public class c0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8203d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8204e = {"and", "assert", "break", "class", "continue", "def", "del", "elif", "else", "except", "exec", "finally", "for", "from", "global", "if", "import", "in", "is", "as", "lambda", "not", "or", "pass", "print", "raise", "return", "try", "while", "with", "yield", "True", "False", "None"};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8205f = {'(', ')', '{', '}', '.', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '~', '%', '^'};

    private c0() {
        super.a(f8204e);
        super.a(f8205f);
    }

    public static m e() {
        if (f8203d == null) {
            f8203d = new c0();
        }
        return f8203d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return ':';
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3) {
        return false;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3, char c4) {
        return (c2 == '\'' && c3 == '\'' && c4 == '\'') || (c2 == '\"' && c3 == '\"' && c4 == '\"');
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "py".equals(str2);
    }

    @Override // e.d.a.a.m
    public int b() {
        return m0.ic_comment_hash;
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3, char c4) {
        return (c2 == '\'' && c3 == '\'' && c4 == '\'') || (c2 == '\"' && c3 == '\"' && c4 == '\"');
    }

    @Override // e.d.a.a.m
    public String c() {
        return "#";
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
        return c2 == '@';
    }
}
