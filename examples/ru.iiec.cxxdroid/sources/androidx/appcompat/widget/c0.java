package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import c.h.l.g0;

public interface c0 {
    g0 a(int i2, long j2);

    void a(int i2);

    void a(Drawable drawable);

    void a(Menu menu, n.a aVar);

    void a(n.a aVar, g.a aVar2);

    void a(p0 p0Var);

    void a(CharSequence charSequence);

    void a(boolean z);

    boolean a();

    void b();

    void b(int i2);

    void b(Drawable drawable);

    void b(boolean z);

    void c(int i2);

    boolean c();

    void collapseActionView();

    void d(int i2);

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    ViewGroup h();

    int i();

    boolean j();

    int k();

    Menu l();

    int m();

    void n();

    void o();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
