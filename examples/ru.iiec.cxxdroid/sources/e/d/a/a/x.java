package e.d.a.a;

public class x extends m {

    /* renamed from: d  reason: collision with root package name */
    private static m f8277d;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f8278e = {"cat", "cd", "chmod", "chown", "cp", "echo", "env", "export", "grep", "install", "ln", "make", "mkdir", "mv", "rm", "sed", "set", "tar", "touch", "umask", "unset", "if", "define", "else", "endef", "endif", "ifdef", "ifeq", "ifndef", "ifneq", "while", "test"};

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f8279f = {'=', '?', ':', '+', '#'};

    private x() {
        super.a(f8278e);
        super.a(f8279f);
    }

    public static m e() {
        if (f8277d == null) {
            f8277d = new x();
        }
        return f8277d;
    }

    @Override // e.d.a.a.m
    public boolean a(char c2, char c3) {
        return c2 == '#';
    }

    @Override // e.d.a.a.m
    public boolean a(String str, String str2) {
        return "mk".equals(str2) || "Makefile".equals(str);
    }

    @Override // e.d.a.a.m
    public boolean b(char c2, char c3) {
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
}
