package e.d.a.a;

import qwe.qweqwe.texteditor.m0;

public class b0 extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8200d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8201e = {"and", "assert", "break", "class", "continue", "def", "del", "elif", "else", "except", "finally", "for", "from", "global", "if", "import", "in", "is", "as", "lambda", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield", "True", "False", "None", "async", "await"};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8202f = {'(', ')', '{', '}', '.', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '~', '%', '^'};

    private b0() {
        super.a(f8201e);
        super.a(f8202f);
    }

    public static m e() {
        if (f8200d == null) {
            f8200d = new b0();
        }
        return f8200d;
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
