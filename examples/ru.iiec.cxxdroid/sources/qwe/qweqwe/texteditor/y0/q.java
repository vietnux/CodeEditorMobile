package qwe.qweqwe.texteditor.y0;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.settings.SettingsActivity;

public class q {
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    public final n f9880b;

    /* renamed from: c  reason: collision with root package name */
    public TabLayout f9881c;

    /* renamed from: d  reason: collision with root package name */
    private p f9882d;

    /* renamed from: e  reason: collision with root package name */
    private int f9883e = 0;

    /* access modifiers changed from: package-private */
    public class a implements TabLayout.d {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            int c2 = gVar.c();
            i0.a("checkForLoops", "showTabAt(" + String.valueOf(c2) + ") call");
            q.this.c(c2);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnLongClickListener {
        b() {
        }

        public boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) q.this.f9881c.getChildAt(0);
            for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                if (linearLayout.getChildAt(i2).equals(view)) {
                    q.this.f(i2);
                    return true;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f9886c;

        c(int i2, p pVar) {
            this.f9885b = i2;
            this.f9886c = pVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            q.this.a((q) this.f9885b, (int) this.f9886c);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9888b;

        d(int i2) {
            this.f9888b = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            q.this.c(this.f9888b);
            q.this.a.b(q.this.d());
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements DialogInterface.OnClickListener {
        e(q qVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements View.OnLongClickListener {
        f() {
        }

        public boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) q.this.f9881c.getChildAt(0);
            for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                if (linearLayout.getChildAt(i2).equals(view)) {
                    q.this.f(i2);
                    return true;
                }
            }
            return true;
        }
    }

    public static class g {
        String a;

        /* renamed from: b  reason: collision with root package name */
        String f9891b;

        /* renamed from: c  reason: collision with root package name */
        String f9892c;

        /* renamed from: d  reason: collision with root package name */
        int f9893d;

        /* renamed from: e  reason: collision with root package name */
        int f9894e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9895f;

        /* renamed from: g  reason: collision with root package name */
        boolean f9896g;

        public g(String str, String str2, String str3, int i2, int i3, boolean z, boolean z2) {
            this.a = str;
            this.f9891b = str2;
            this.f9892c = str3;
            this.f9893d = i2;
            this.f9894e = i3;
            this.f9895f = z;
            this.f9896g = z2;
        }

        public static g a(p pVar) {
            return new g(pVar.K0(), pVar.v0(), pVar.C0(), pVar.x0(), pVar.G0(), pVar.Z, pVar.A0());
        }
    }

    public q(e0 e0Var) {
        this.a = e0Var;
        this.f9880b = new n(this.a);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i2, p pVar) {
        boolean z = false;
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        linearLayout.getChildAt(i2).setVisibility(8);
        e(i2);
        a();
        if (i2 == this.f9881c.getSelectedTabPosition()) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f9881c.getTabCount()) {
                    break;
                } else if (linearLayout.getChildAt(i3).getVisibility() != 8) {
                    c(i3);
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z) {
                this.f9882d.Z = true;
                e();
            }
        }
        this.a.a(i2, pVar);
    }

    private void d(int i2) {
        n k2 = this.a.k();
        Fragment c2 = k2.c(qwe.qweqwe.texteditor.v0.b.a(i2));
        if (c2 != null) {
            y b2 = k2.b();
            b2.c(c2);
            b2.a();
            i0.a("fragment_logs", "fragment_hide_" + qwe.qweqwe.texteditor.v0.b.a(i2));
        }
        this.a.k().p();
    }

    private void e(int i2) {
        Fragment c2;
        n k2 = this.a.k();
        if (k2 != null && (c2 = k2.c(qwe.qweqwe.texteditor.v0.b.a(i2))) != null) {
            y b2 = k2.b();
            b2.d(c2);
            b2.a();
            i0.a("fragment_logs", "remove fragment at" + String.valueOf(i2));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f(int i2) {
        p a2 = a(i2);
        if (a2 != null) {
            if (a2.O0()) {
                d.a aVar = new d.a(this.a);
                aVar.a(this.a.getString(q0.dialog_do_you_want_to_save_changes));
                aVar.c(this.a.getString(q0.close), new c(i2, a2));
                aVar.a(this.a.getString(q0.save), new d(i2));
                aVar.b(this.a.getString(q0.re_turn), new e(this));
                aVar.a().show();
                return;
            }
            a(i2, a2);
        }
    }

    private void l() {
        for (int i2 = 0; i2 < this.f9881c.getTabCount(); i2++) {
            d(i2);
        }
    }

    public String a(p pVar) {
        if (pVar == null) {
            return "";
        }
        String K0 = pVar.K0();
        if (!pVar.O0()) {
            return K0;
        }
        return this.a.getString(q0.hasChangesTitlePrefix) + K0 + this.a.getString(q0.hasChangesTitlePostfix);
    }

    public p a(int i2) {
        return (p) this.a.k().c(qwe.qweqwe.texteditor.v0.b.a(i2));
    }

    public void a() {
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        int i2 = 0;
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            if (linearLayout.getChildAt(i3).getVisibility() != 8) {
                i2++;
            }
        }
        if (i2 == 1) {
            this.f9881c.setVisibility(8);
        } else {
            this.f9881c.setVisibility(0);
        }
    }

    public void a(Bundle bundle) {
        this.f9881c = (TabLayout) this.a.findViewById(n0.tab_layout);
        this.f9881c.setTabGravity(0);
        this.f9881c.a();
        this.f9881c.a(new a());
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("tabs_title_list");
            int i2 = bundle.getInt("cur_tab_opened_num");
            LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
            for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                if (i3 != i2) {
                    TabLayout tabLayout = this.f9881c;
                    TabLayout.g c2 = tabLayout.c();
                    c2.b(stringArrayList.get(i3));
                    tabLayout.a(c2);
                }
            }
            TabLayout tabLayout2 = this.f9881c;
            TabLayout.g c3 = tabLayout2.c();
            c3.b(stringArrayList.get(i2));
            tabLayout2.a(c3, i2, true);
            for (int i4 = 0; i4 < this.f9881c.getTabCount(); i4++) {
                linearLayout.getChildAt(i4).setOnLongClickListener(new b());
            }
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("gone_tab_numbers");
            for (int i5 = 0; i5 < integerArrayList.size(); i5++) {
                linearLayout.getChildAt(integerArrayList.get(i5).intValue()).setVisibility(8);
            }
            c(i2);
        } else {
            if (SettingsActivity.i(this.a)) {
                Pair<List<g>, Integer> b2 = this.f9880b.b();
                if (!((List) b2.first).isEmpty()) {
                    for (g gVar : (List) b2.first) {
                        a(gVar);
                    }
                    c(((Integer) b2.second).intValue());
                }
            }
            e();
        }
        a();
    }

    public void a(Bundle bundle, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<p> arrayList2 = new ArrayList<>();
        int i2 = 0;
        while (i2 < this.f9881c.getTabCount()) {
            p pVar = (p) this.a.k().c(qwe.qweqwe.texteditor.v0.b.a(i2));
            arrayList.add(i2 < this.f9881c.getTabCount() ? this.f9881c.b(i2).d().toString() : "");
            arrayList2.add(pVar);
            i2++;
        }
        if (bundle != null) {
            bundle.putInt("cur_tab_opened_num", this.f9881c.getSelectedTabPosition());
        }
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            if (linearLayout.getChildAt(i3).getVisibility() == 8) {
                arrayList3.add(Integer.valueOf(i3));
            }
        }
        if (bundle != null) {
            bundle.putIntegerArrayList("gone_tab_numbers", arrayList3);
            bundle.putStringArrayList("tabs_title_list", arrayList);
        }
        if (z) {
            this.f9880b.a(arrayList2, arrayList3, d());
        }
    }

    public void a(String str, String str2) {
        a(str, str2, null, 0, 0, true);
    }

    public void a(String str, String str2, String str3, int i2) {
        a(str, str2, str3, i2, 0, true, true);
    }

    public void a(String str, String str2, String str3, int i2, int i3, boolean z) {
        a(str, str2, str3, i2, i3, z, false);
    }

    public void a(String str, String str2, String str3, int i2, int i3, boolean z, boolean z2) {
        p d2 = d();
        if (d2 == null || d2.Z) {
            i0.a("TabManager", "creating absolutely new tab");
            p pVar = new p();
            pVar.a(str, str2, str3, 0, i3, this.f9881c.getTabCount(), z2, z);
            if (i2 > 0) {
                pVar.f(i2);
            }
            pVar.c(this.a.a(pVar.C0()));
            this.f9882d = pVar;
            this.f9882d.m(this.a.getIntent().getExtras());
            y b2 = this.a.k().b();
            b2.a(n0.fragment_container, this.f9882d, qwe.qweqwe.texteditor.v0.b.a(this.f9881c.getTabCount()));
            b2.a();
            i0.a("fragment_logs", "fragment_add_" + qwe.qweqwe.texteditor.v0.b.a(this.f9881c.getTabCount()));
            TabLayout tabLayout = this.f9881c;
            TabLayout.g c2 = tabLayout.c();
            c2.b(str);
            tabLayout.a(c2);
            ((LinearLayout) this.f9881c.getChildAt(0)).getChildAt(this.f9881c.getTabCount() - 1).setOnLongClickListener(new b(this));
            this.a.k().p();
            l();
            c(this.f9881c.getTabCount());
            b(this.f9881c.getTabCount() - 1);
            a();
            j();
            this.a.c(pVar);
            if (this.a.i0()) {
                File b3 = this.a.b(str3);
                this.a.f(b3 == null ? null : b3.getParent());
                return;
            }
            return;
        }
        i0.a("TabManager", "creating new tab on already created");
        d2.a(str, str2, str3, 0, i3, d2.H0(), z2, z);
        if (i2 > 0) {
            d2.f(i2);
        }
        i();
        j();
        this.a.c(d2);
        this.a.g(this.f9883e);
    }

    public void a(String str, String str2, String str3, int i2, boolean z) {
        a(str, str2, str3, i2, 0, z);
    }

    public void a(g gVar) {
        a(gVar.a, gVar.f9891b, gVar.f9892c, gVar.f9893d, gVar.f9894e, gVar.f9895f, gVar.f9896g);
    }

    public void a(boolean z) {
        a(z, d());
    }

    public void a(boolean z, p pVar) {
        if (z) {
            pVar.h0 = z;
        }
        if (pVar.A0() != z) {
            pVar.o(z);
            b(pVar);
            i();
        }
    }

    public /* synthetic */ boolean a(View view) {
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            if (linearLayout.getChildAt(i2).equals(view)) {
                f(i2);
                return true;
            }
        }
        return true;
    }

    public List<p> b() {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : this.a.k().u()) {
            if (fragment != null && (fragment instanceof p)) {
                arrayList.add((p) fragment);
            }
        }
        return arrayList;
    }

    public void b(int i2) {
        TabLayout.g b2;
        TabLayout tabLayout = this.f9881c;
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i2 && (b2 = this.f9881c.b(i2)) != null) {
            b2.g();
        }
    }

    public void b(Bundle bundle) {
        a(bundle, false);
    }

    public void b(p pVar) {
        if (pVar != null) {
            pVar.c(this.a.a(pVar.C0()));
            this.f9881c.b(pVar.H0()).b(a(pVar));
            ((LinearLayout) this.f9881c.getChildAt(0)).getChildAt(this.f9881c.getSelectedTabPosition()).setOnLongClickListener(new f());
        }
    }

    public String c() {
        return a(d());
    }

    public void c(int i2) {
        this.f9883e = i2;
        i0.a("checkForLoops", "showTabAt(" + String.valueOf(i2) + ") call");
        l();
        n k2 = this.a.k();
        Fragment c2 = k2.c(qwe.qweqwe.texteditor.v0.b.a(i2));
        if (c2 != null) {
            this.f9882d = (p) c2;
            y b2 = k2.b();
            b2.e(c2);
            b2.a();
            i0.a("fragment_logs", "fragment_show_" + qwe.qweqwe.texteditor.v0.b.a(i2));
            androidx.appcompat.app.a p = this.a.p();
            if (p != null) {
                String K0 = this.f9882d.K0();
                String a2 = qwe.qweqwe.texteditor.v0.a.a(this.f9882d.C0());
                p.b(K0);
                p.a(a2);
            }
            b(i2);
            if (this.f9882d.L() != null) {
                this.f9882d.L().requestFocus();
            }
        }
        this.a.k().p();
        i();
        this.a.g(i2);
    }

    public p d() {
        return this.f9882d;
    }

    public void e() {
        a(this.a.getString(q0.open_new_file_title), "", null, 0, 0, false);
    }

    public void f() {
        f(this.f9881c.getSelectedTabPosition());
    }

    public boolean g() {
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        for (int i2 = 0; i2 < this.f9881c.getTabCount(); i2++) {
            if (linearLayout.getChildAt(i2).getVisibility() == 0 && a(i2).A0()) {
                c(i2);
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        p a2;
        LinearLayout linearLayout = (LinearLayout) this.f9881c.getChildAt(0);
        boolean z = false;
        for (int i2 = 0; i2 < this.f9881c.getTabCount(); i2++) {
            if (linearLayout.getChildAt(i2).getVisibility() == 0 && (a2 = a(i2)) != null && a2.A0()) {
                z = true;
            }
        }
        return z;
    }

    public void i() {
        String a2;
        androidx.appcompat.app.a p = this.a.p();
        p d2 = d();
        if (p != null && d2 != null) {
            p.b(c());
            File F0 = d2.F0();
            if (F0 != null) {
                a2 = this.a.getString(q0.project_name, new Object[]{F0.getParentFile().getName()});
            } else if (d2.C0() != null) {
                a2 = qwe.qweqwe.texteditor.v0.a.a(d().C0());
            } else {
                return;
            }
            p.a(a2);
        }
    }

    public void j() {
        b(d());
    }

    public void k() {
        a((Bundle) null, true);
    }
}
