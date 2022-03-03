package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.x0;
import c.a.o.i;
import c.h.l.b0;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class m extends a {
    c0 a;

    /* renamed from: b  reason: collision with root package name */
    boolean f227b;

    /* renamed from: c  reason: collision with root package name */
    Window.Callback f228c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f229d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f230e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<a.b> f231f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f232g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Toolbar.f f233h = new b();

    class a implements Runnable {
        a() {
        }

        public void run() {
            m.this.p();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return m.this.f228c.onMenuItemSelected(0, menuItem);
        }
    }

    /* access modifiers changed from: private */
    public final class c implements n.a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f235b;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void a(g gVar, boolean z) {
            if (!this.f235b) {
                this.f235b = true;
                m.this.a.g();
                Window.Callback callback = m.this.f228c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f235b = false;
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean a(g gVar) {
            Window.Callback callback = m.this.f228c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
            m mVar = m.this;
            if (mVar.f228c == null) {
                return;
            }
            if (mVar.a.a()) {
                m.this.f228c.onPanelClosed(108, gVar);
            } else if (m.this.f228c.onPreparePanel(0, null, gVar)) {
                m.this.f228c.onMenuOpened(108, gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }
    }

    private class e extends i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // c.a.o.i
        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(m.this.a.getContext()) : super.onCreatePanelView(i2);
        }

        @Override // c.a.o.i
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (onPreparePanel) {
                m mVar = m.this;
                if (!mVar.f227b) {
                    mVar.a.b();
                    m.this.f227b = true;
                }
            }
            return onPreparePanel;
        }
    }

    m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new x0(toolbar, false);
        this.f228c = new e(callback);
        this.a.setWindowCallback(this.f228c);
        toolbar.setOnMenuItemClickListener(this.f233h);
        this.a.setWindowTitle(charSequence);
    }

    private Menu q() {
        if (!this.f229d) {
            this.a.a(new c(), new d());
            this.f229d = true;
        }
        return this.a.l();
    }

    @Override // androidx.appcompat.app.a
    public void a(int i2) {
        this.a.d(i2);
    }

    @Override // androidx.appcompat.app.a
    public void a(int i2, int i3) {
        this.a.b((i2 & i3) | ((~i3) & this.a.k()));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i2, KeyEvent keyEvent) {
        Menu q = q();
        if (q == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        q.setQwertyMode(z);
        return q.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            m();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void b(Drawable drawable) {
        this.a.b(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void b(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z != this.f230e) {
            this.f230e = z;
            int size = this.f231f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f231f.get(i2).a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public void c(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void e(boolean z) {
        a(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public boolean e() {
        return this.a.d();
    }

    @Override // androidx.appcompat.app.a
    public void f(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        if (!this.a.j()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.a.k();
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void i() {
        this.a.a(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean j() {
        this.a.h().removeCallbacks(this.f232g);
        b0.a(this.a.h(), this.f232g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        return this.a.i() == 0;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void l() {
        this.a.h().removeCallbacks(this.f232g);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        return this.a.e();
    }

    @Override // androidx.appcompat.app.a
    public void n() {
        this.a.a(0);
    }

    public Window.Callback o() {
        return this.f228c;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        Menu q = q();
        g gVar = q instanceof g ? (g) q : null;
        if (gVar != null) {
            gVar.s();
        }
        try {
            q.clear();
            if (!this.f228c.onCreatePanelMenu(0, q) || !this.f228c.onPreparePanel(0, null, q)) {
                q.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.r();
            }
        }
    }
}
