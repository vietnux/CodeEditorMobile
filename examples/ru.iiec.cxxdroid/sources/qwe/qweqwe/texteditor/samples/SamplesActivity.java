package qwe.qweqwe.texteditor.samples;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.s;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import d.c.f;
import l.a.b;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.p0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.samples.d;
import qwe.qweqwe.texteditor.u0.a0;

public class SamplesActivity extends e implements d.b {
    private a q;
    private ViewPager r;

    public class a extends s {
        public a(n nVar) {
            super(nVar);
        }

        @Override // androidx.viewpager.widget.a
        public int a() {
            return 1;
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence a(int i2) {
            SamplesActivity samplesActivity;
            int i3;
            if (i2 == 0) {
                samplesActivity = SamplesActivity.this;
                i3 = q0.samples_title_samples;
            } else if (i2 == 1) {
                samplesActivity = SamplesActivity.this;
                i3 = q0.samples_title_courses;
            } else if (i2 != 2) {
                return null;
            } else {
                samplesActivity = SamplesActivity.this;
                i3 = q0.samples_title_tutorials;
            }
            return samplesActivity.getString(i3);
        }

        @Override // androidx.fragment.app.s
        public Fragment c(int i2) {
            return d.c(0);
        }
    }

    public static void a(e0 e0Var) {
        Intent intent = new Intent(e0Var, SamplesActivity.class);
        intent.putExtra("premium_purchased", e0Var.D());
        intent.putExtra("key_samples_url", e0Var.L());
        e0Var.startActivityForResult(intent, 1003);
    }

    private Fragment v() {
        n k2 = k();
        return k2.c("android:switcher:" + n0.container + ":" + this.r.getCurrentItem());
    }

    @Override // qwe.qweqwe.texteditor.samples.d.b
    public void a(f fVar) {
        fVar.a(this);
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        a0.a(this, bVar, q0.rationale_for_samples);
    }

    /* access modifiers changed from: package-private */
    public void b(f fVar) {
        f.a(this, fVar);
    }

    public void c(f fVar) {
        e.a(this, fVar);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        f.a(this, i2, i3, intent);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (!s()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0.activity_samples);
        a((Toolbar) findViewById(n0.toolbar));
        p().d(true);
        this.q = new a(k());
        this.r = (ViewPager) findViewById(n0.container);
        this.r.setAdapter(this.q);
        ((TabLayout) findViewById(n0.tabs)).setupWithViewPager(this.r);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(p0.menu_samples, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        e.a(this, i2, iArr);
    }

    @Override // androidx.appcompat.app.e
    public boolean r() {
        if (s()) {
            return true;
        }
        super.onBackPressed();
        return true;
    }

    public boolean s() {
        try {
            Fragment v = v();
            if (v instanceof d) {
                return ((d) v).v0();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        Toast.makeText(this, q0.samples_perm_denied, 0).show();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        Toast.makeText(this, q0.samples_perm_denied, 0).show();
    }
}
