package qwe.qweqwe.texteditor.ui.onboarding;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import g.r.d.i;
import qwe.qweqwe.texteditor.n0;

public abstract class j extends Fragment {
    /* access modifiers changed from: private */
    public static final void c(j jVar, View view) {
        i.c(jVar, "this$0");
        e f2 = jVar.f();
        if (f2 != null) {
            ((OnBoardingActivity) f2).u();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type qwe.qweqwe.texteditor.ui.onboarding.OnBoardingActivity");
    }

    private final String d(int i2) {
        return i.a("on_boarding_page_", (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    public static final void d(j jVar, View view) {
        i.c(jVar, "this$0");
        e f2 = jVar.f();
        if (f2 != null) {
            ((OnBoardingActivity) f2).s();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type qwe.qweqwe.texteditor.ui.onboarding.OnBoardingActivity");
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.c(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(v0(), viewGroup, false);
        i.b(inflate, "inflater.inflate(getLayoutId(), container, false)");
        return inflate;
    }

    public final void a(int i2, String str) {
        i.c(str, "tag");
        PreferenceManager.getDefaultSharedPreferences(r0()).edit().putString(d(i2), str).apply();
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        i.c(view, "view");
        super.a(view, bundle);
        View findViewById = view.findViewById(n0.next);
        if (findViewById != null) {
            findViewById.setOnClickListener(new b(this));
        }
        View findViewById2 = view.findViewById(n0.back);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new a(this));
        }
    }

    public final String c(int i2) {
        return PreferenceManager.getDefaultSharedPreferences(r0()).getString(d(i2), null);
    }

    public abstract int v0();
}
