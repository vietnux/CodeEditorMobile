package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.v;
import c.h.k.h;

public class i {
    private final k<?> a;

    private i(k<?> kVar) {
        this.a = kVar;
    }

    public static i a(k<?> kVar) {
        h.a(kVar, "callbacks == null");
        return new i(kVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f1306e.w().onCreateView(view, str, context, attributeSet);
    }

    public void a() {
        this.a.f1306e.d();
    }

    public void a(Configuration configuration) {
        this.a.f1306e.a(configuration);
    }

    public void a(Parcelable parcelable) {
        k<?> kVar = this.a;
        if (kVar instanceof v) {
            kVar.f1306e.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a(Menu menu) {
        this.a.f1306e.a(menu);
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.a;
        kVar.f1306e.a(kVar, kVar, fragment);
    }

    public void a(boolean z) {
        this.a.f1306e.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.a.f1306e.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.a.f1306e.a(menuItem);
    }

    public void b() {
        this.a.f1306e.f();
    }

    public void b(boolean z) {
        this.a.f1306e.b(z);
    }

    public boolean b(Menu menu) {
        return this.a.f1306e.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.a.f1306e.b(menuItem);
    }

    public void c() {
        this.a.f1306e.g();
    }

    public void d() {
        this.a.f1306e.i();
    }

    public void e() {
        this.a.f1306e.j();
    }

    public void f() {
        this.a.f1306e.l();
    }

    public void g() {
        this.a.f1306e.m();
    }

    public void h() {
        this.a.f1306e.n();
    }

    public boolean i() {
        return this.a.f1306e.c(true);
    }

    public n j() {
        return this.a.f1306e;
    }

    public void k() {
        this.a.f1306e.E();
    }

    public Parcelable l() {
        return this.a.f1306e.G();
    }
}
