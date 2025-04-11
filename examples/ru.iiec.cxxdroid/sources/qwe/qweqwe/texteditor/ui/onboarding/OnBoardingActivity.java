package qwe.qweqwe.texteditor.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import g.r.d.g;
import g.r.d.i;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.j0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;

public final class OnBoardingActivity extends e {
    public static final a r = new a(null);
    private int q;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            i.c(context, "context");
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("onboarding_seen", true).apply();
        }

        public final boolean a(e0 e0Var) {
            i.c(e0Var, "activity");
            boolean k2 = qwe.qweqwe.texteditor.v0.a.k(e0Var);
            boolean D = e0Var.D();
            boolean b2 = b(e0Var);
            i0.a("OnBoardingActivity", "busyBoxExists: " + k2 + ", premium: " + D + ", wasSeen: " + b2);
            if (k2 || D || b2) {
                a((Context) e0Var);
                return false;
            }
            e0Var.startActivityForResult(new Intent(e0Var, OnBoardingActivity.class), 709);
            return true;
        }

        public final boolean b(Context context) {
            i.c(context, "context");
            return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("onboarding_seen", false);
        }
    }

    public static final boolean a(e0 e0Var) {
        return r.a(e0Var);
    }

    public final void c(int i2) {
        Fragment fragment;
        if (this.q > 0 || i2 >= 0) {
            this.q += i2;
            int i3 = this.q;
            if (i3 > 4) {
                t();
                return;
            }
            if (i3 != 0) {
                int i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            fragment = new l();
                        } else if (i3 != 4) {
                            t();
                            fragment = new m();
                        } else {
                            fragment = k.a0.a(4);
                        }
                    }
                }
                fragment = k.a0.a(i4);
            } else {
                fragment = new m();
            }
            y b2 = k().b();
            b2.a(i2 > 0 ? j0.enter_from_right : j0.enter_from_left, i2 > 0 ? j0.exit_to_left : j0.exit_to_right, i2 > 0 ? j0.enter_from_left : j0.enter_from_right, i2 > 0 ? j0.exit_to_right : j0.exit_to_left);
            b2.a(n0.container, fragment);
            b2.c();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        c(-1);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0.onboarding_activity);
        if (bundle == null) {
            y b2 = k().b();
            b2.a(n0.container, new m());
            b2.c();
            this.q = 0;
            return;
        }
        this.q = bundle.getInt("page_num", 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f
    public void onSaveInstanceState(Bundle bundle) {
        i.c(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("page_num", this.q);
    }

    public final void s() {
        c(-1);
    }

    public final void t() {
        setResult(-1);
        finish();
        overridePendingTransition(0, j0.exit_to_left);
    }

    public final void u() {
        c(1);
    }
}
