package qwe.qweqwe.texteditor.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import g.r.d.i;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.settings.SettingsActivity;

public final class l extends j {
    /* access modifiers changed from: private */
    public static final void d(l lVar, View view) {
        i.c(lVar, "this$0");
        View L = lVar.L();
        ((SwitchCompat) (L == null ? null : L.findViewById(n0.switch_0))).toggle();
    }

    /* access modifiers changed from: private */
    public static final void d(l lVar, CompoundButton compoundButton, boolean z) {
        i.c(lVar, "this$0");
        SettingsActivity.d(lVar.s0(), z);
    }

    /* access modifiers changed from: private */
    public static final void e(l lVar, View view) {
        i.c(lVar, "this$0");
        View L = lVar.L();
        ((SwitchCompat) (L == null ? null : L.findViewById(n0.switch_1))).toggle();
    }

    /* access modifiers changed from: private */
    public static final void e(l lVar, CompoundButton compoundButton, boolean z) {
        i.c(lVar, "this$0");
        SettingsActivity.a(lVar.s0(), z);
    }

    /* access modifiers changed from: private */
    public static final void f(l lVar, View view) {
        i.c(lVar, "this$0");
        View L = lVar.L();
        ((SwitchCompat) (L == null ? null : L.findViewById(n0.switch_2))).toggle();
    }

    /* access modifiers changed from: private */
    public static final void f(l lVar, CompoundButton compoundButton, boolean z) {
        i.c(lVar, "this$0");
        SettingsActivity.b(lVar.s0(), z);
    }

    @Override // qwe.qweqwe.texteditor.ui.onboarding.j, androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        i.c(view, "view");
        super.a(view, bundle);
        View L = L();
        View view2 = null;
        ((TextView) (L == null ? null : L.findViewById(n0.sw_tv_0))).setOnClickListener(new f(this));
        View L2 = L();
        ((TextView) (L2 == null ? null : L2.findViewById(n0.sw_tv_1))).setOnClickListener(new g(this));
        View L3 = L();
        ((TextView) (L3 == null ? null : L3.findViewById(n0.sw_tv_2))).setOnClickListener(new e(this));
        View L4 = L();
        ((SwitchCompat) (L4 == null ? null : L4.findViewById(n0.switch_0))).setOnCheckedChangeListener(new i(this));
        View L5 = L();
        ((SwitchCompat) (L5 == null ? null : L5.findViewById(n0.switch_1))).setOnCheckedChangeListener(new d(this));
        View L6 = L();
        ((SwitchCompat) (L6 == null ? null : L6.findViewById(n0.switch_2))).setOnCheckedChangeListener(new h(this));
        View L7 = L();
        ((SwitchCompat) (L7 == null ? null : L7.findViewById(n0.switch_0))).setChecked(SettingsActivity.i(s0()));
        View L8 = L();
        ((SwitchCompat) (L8 == null ? null : L8.findViewById(n0.switch_1))).setChecked(SettingsActivity.a(s0()));
        View L9 = L();
        if (L9 != null) {
            view2 = L9.findViewById(n0.switch_2);
        }
        ((SwitchCompat) view2).setChecked(SettingsActivity.c(s0()));
    }

    @Override // qwe.qweqwe.texteditor.ui.onboarding.j
    public int v0() {
        return o0.onboarding_settings;
    }
}
