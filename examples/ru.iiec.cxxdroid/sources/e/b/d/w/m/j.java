package e.b.d.w.m;

import e.b.d.e;
import e.b.d.r;
import e.b.d.t;
import e.b.d.u;
import e.b.d.y.b;
import e.b.d.y.c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class j extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f7992b = new a();
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    static class a implements u {
        a() {
        }

        @Override // e.b.d.u
        public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
            if (aVar.a() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // e.b.d.t
    public synchronized Date a(e.b.d.y.a aVar) {
        if (aVar.B() == b.NULL) {
            aVar.z();
            return null;
        }
        try {
            return new Date(this.a.parse(aVar.A()).getTime());
        } catch (ParseException e2) {
            throw new r(e2);
        }
    }

    public synchronized void a(c cVar, Date date) {
        cVar.d(date == null ? null : this.a.format(date));
    }
}
