package e.d.a.a;

public class q extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8262d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8263e = {"bool", "char", "double", "float", "int", "long", "short", "void", "wchar_t", "auto", "const", "extern", "mutable", "register", "static", "volatile", "signed", "unsigned", "true", "false", "new", "delete", "sizeof", "typedef", "typeid", "typename", "const_cast", "dynamic_cast", "reinterpret_cast", "static_cast", "class", "enum", "explicit", "operator", "struct", "template", "union", "virtual", "private", "protected", "public", "friend", "this", "break", "case", "catch", "continue", "default", "do", "else", "for", "goto", "if", "return", "switch", "throw", "try", "while", "export", "namespace", "using", "asm", "inline", "and", "and_eq", "bitand", "bitor", "compl", "not", "not_eq", "or", "or_eq", "xor", "xor_eq"};

    private q() {
        super.a(f8263e);
    }

    public static m e() {
        if (f8262d == null) {
            f8262d = new q();
        }
        return f8262d;
    }

    @Override // e.d.a.a.m
    public Character a() {
        return '{';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "cpp".equals(str2) || "cxx".equals(str2) || "c++".equals(str2) || "cc".equals(str2) || "hpp".equals(str2) || "hxx".equals(str2) || "h++".equals(str2) || "hh".equals(str2);
    }

    @Override // e.d.a.a.m
    public String c() {
        return "//";
    }
}
