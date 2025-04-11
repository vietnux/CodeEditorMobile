package e.c.b;

import e.c.b.k;
import e.c.b.u.b;
import g.r.d.g;
import java.util.List;

public interface j<Identifiable extends k> {
    public static final j<? extends k> a = new b();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    long a(Identifiable identifiable);

    List<Identifiable> a(List<? extends Identifiable> list);
}
