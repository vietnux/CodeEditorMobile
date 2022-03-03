package iiec.androidterm;

import android.content.Context;
import android.util.DisplayMetrics;
import iiec.androidterm.r.d;
import iiec.androidterm.r.e;
import iiec.androidterm.r.m;
import iiec.androidterm.t.c;

public class p extends e {
    public p(Context context, m mVar, DisplayMetrics displayMetrics) {
        super(context, mVar, displayMetrics);
    }

    public void a(c cVar) {
        a(cVar, (d) null);
    }

    public void a(c cVar, d dVar) {
        if (dVar == null) {
            dVar = new d(cVar.i());
        }
        setTextSize(cVar.o());
        setUseCookedIME(cVar.y());
        setColorScheme(dVar);
        setBackKeyCharacter(cVar.h());
        setAltSendsEsc(cVar.e());
        setControlKeyCode(cVar.j());
        setFnKeyCode(cVar.m());
        setTermType(cVar.v());
        setMouseTracking(cVar.r());
    }

    public String toString() {
        return p.class.toString() + '(' + getTermSession() + ')';
    }
}
