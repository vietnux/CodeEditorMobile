package e.c.a.p;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import g.e;
import g.r.d.i;
import g.r.d.j;
import g.r.d.m;
import g.r.d.o;
import g.t.g;

public final class d extends LinkMovementMethod {
    private static final g.d a = e.a(a.f8144c);

    /* renamed from: b  reason: collision with root package name */
    public static final b f8143b = new b(null);

    static final class a extends j implements g.r.c.a<d> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8144c = new a();

        a() {
            super(0);
        }

        @Override // g.r.c.a
        public final d c() {
            return new d();
        }
    }

    public static final class b {
        static final /* synthetic */ g[] a;

        static {
            m mVar = new m(o.a(b.class), "instance", "getInstance()Lcom/mikepenz/aboutlibraries/util/MovementCheck;");
            o.a(mVar);
            a = new g[]{mVar};
        }

        private b() {
        }

        public /* synthetic */ b(g.r.d.g gVar) {
            this();
        }

        public final d a() {
            g.d dVar = d.a;
            b bVar = d.f8143b;
            g gVar = a[0];
            return (d) dVar.getValue();
        }
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        i.d(textView, "widget");
        i.d(spannable, "buffer");
        i.d(motionEvent, "event");
        try {
            return super.onTouchEvent(textView, spannable, motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }
}
