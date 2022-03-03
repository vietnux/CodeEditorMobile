package g.v;

import g.r.d.i;
import java.nio.charset.Charset;

public final class c {
    public static final Charset a;

    static {
        new c();
        Charset forName = Charset.forName("UTF-8");
        i.b(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        i.b(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        i.b(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        i.b(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        i.b(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        i.b(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private c() {
    }
}
