package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.d.c;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.core.app.g;
import androidx.core.app.o;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.d;
import c.a.o.b;

public class e extends androidx.fragment.app.e implements f, o.a, b.c {
    private g o;
    private Resources p;

    /* access modifiers changed from: package-private */
    public class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.o().c(bundle);
            return bundle;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c {
        b() {
        }

        @Override // androidx.activity.d.c
        public void a(Context context) {
            g o = e.this.o();
            o.f();
            o.a(e.this.d().a("androidx:appcompat"));
        }
    }

    public e() {
        s();
    }

    private boolean b(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    private void s() {
        d().a("androidx:appcompat", new a());
        a(new b());
    }

    private void t() {
        w.a(getWindow().getDecorView(), this);
        x.a(getWindow().getDecorView(), this);
        d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.appcompat.app.f
    public c.a.o.b a(b.a aVar) {
        return null;
    }

    public void a(Intent intent) {
        g.a(this, intent);
    }

    public void a(Toolbar toolbar) {
        o().a(toolbar);
    }

    public void a(o oVar) {
        oVar.a((Activity) this);
    }

    @Override // androidx.appcompat.app.f
    public void a(c.a.o.b bVar) {
    }

    @Override // androidx.activity.ComponentActivity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        o().a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(o().b(context));
    }

    public c.a.o.b b(b.a aVar) {
        return o().a(aVar);
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
    }

    public void b(o oVar) {
    }

    @Override // androidx.appcompat.app.f
    public void b(c.a.o.b bVar) {
    }

    public boolean b(Intent intent) {
        return g.b(this, intent);
    }

    public void closeOptionsMenu() {
        a p2 = p();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (p2 == null || !p2.e()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.f
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a p2 = p();
        if (keyCode != 82 || p2 == null || !p2.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) o().a(i2);
    }

    @Override // androidx.appcompat.app.b.c
    public b.AbstractC0007b g() {
        return o().b();
    }

    public MenuInflater getMenuInflater() {
        return o().d();
    }

    public Resources getResources() {
        if (this.p == null && b1.b()) {
            this.p = new b1(this, super.getResources());
        }
        Resources resources = this.p;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.core.app.o.a
    public Intent h() {
        return g.a(this);
    }

    public void invalidateOptionsMenu() {
        o().g();
    }

    @Override // androidx.fragment.app.e
    public void n() {
        o().g();
    }

    public g o() {
        if (this.o == null) {
            this.o = g.a(this, this);
        }
        return this.o;
    }

    @Override // androidx.fragment.app.e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.p != null) {
            this.p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        o().a(configuration);
    }

    public void onContentChanged() {
        q();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onDestroy() {
        super.onDestroy();
        o().h();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (b(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a p2 = p();
        if (menuItem.getItemId() != 16908332 || p2 == null || (p2.g() & 4) == 0) {
            return false;
        }
        return r();
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.e
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        o().b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onPostResume() {
        super.onPostResume();
        o().i();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onStart() {
        super.onStart();
        o().j();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onStop() {
        super.onStop();
        o().k();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        o().a(charSequence);
    }

    public void openOptionsMenu() {
        a p2 = p();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (p2 == null || !p2.m()) {
            super.openOptionsMenu();
        }
    }

    public a p() {
        return o().e();
    }

    @Deprecated
    public void q() {
    }

    public boolean r() {
        Intent h2 = h();
        if (h2 == null) {
            return false;
        }
        if (b(h2)) {
            o a2 = o.a((Context) this);
            a(a2);
            b(a2);
            a2.a();
            try {
                androidx.core.app.a.a((Activity) this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            a(h2);
            return true;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        t();
        o().c(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        t();
        o().a(view);
    }

    @Override // androidx.activity.ComponentActivity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        o().b(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i2) {
        super.setTheme(i2);
        o().d(i2);
    }
}
