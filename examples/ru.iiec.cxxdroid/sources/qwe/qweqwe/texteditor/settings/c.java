package qwe.qweqwe.texteditor.settings;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import androidx.appcompat.app.f;
import androidx.appcompat.app.g;

public abstract class c extends PreferenceActivity {

    /* renamed from: b  reason: collision with root package name */
    private g f9686b;

    private g b() {
        if (this.f9686b == null) {
            this.f9686b = g.a(this, (f) null);
        }
        return this.f9686b;
    }

    public a a() {
        return b().e();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(b().b(context));
    }

    public MenuInflater getMenuInflater() {
        return b().d();
    }

    public void invalidateOptionsMenu() {
        b().g();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b().a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        b().f();
        b().a(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        b().h();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        b().b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        b().i();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        b().c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        b().j();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        b().k();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        b().a(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        b().c(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        b().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }
}
