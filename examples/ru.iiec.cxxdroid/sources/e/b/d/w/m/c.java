package e.b.d.w.m;

import e.b.d.e;
import e.b.d.r;
import e.b.d.t;
import e.b.d.u;
import e.b.d.w.i;
import e.b.d.y.b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends t<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f7969b = new a();
    private final List<DateFormat> a = new ArrayList();

    static class a implements u {
        a() {
        }

        @Override // e.b.d.u
        public <T> t<T> a(e eVar, e.b.d.x.a<T> aVar) {
            if (aVar.a() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        this.a.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.b.d.z.a.c()) {
            this.a.add(i.a(2, 2));
        }
    }

    private synchronized Date a(String str) {
        for (DateFormat dateFormat : this.a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return e.b.d.w.m.o.a.a(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new r(str, e2);
        }
    }

    @Override // e.b.d.t
    public Date a(e.b.d.y.a aVar) {
        if (aVar.B() != b.NULL) {
            return a(aVar.A());
        }
        aVar.z();
        return null;
    }

    public synchronized void a(e.b.d.y.c cVar, Date date) {
        if (date == null) {
            cVar.s();
        } else {
            cVar.d(this.a.get(0).format(date));
        }
    }
}
