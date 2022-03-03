package c.h.l;

import android.view.KeyEvent;
import android.view.View;
import c.h.l.b0;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnUnhandledKeyEventListener {
    private final /* synthetic */ b0.t a;

    public /* synthetic */ b(b0.t tVar) {
        this.a = tVar;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.a.onUnhandledKeyEvent(view, keyEvent);
    }
}
