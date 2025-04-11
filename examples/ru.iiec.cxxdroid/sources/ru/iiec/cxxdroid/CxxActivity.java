package ru.iiec.cxxdroid;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.c.f;
import e.b.b.a.e.g;
import e.b.c.g.a;
import e.d.a.a.m;
import e.d.a.a.q;
import iiec.androidterm.RunScript;
import java.io.File;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.h0;
import qwe.qweqwe.texteditor.w0.d.e;
import qwe.qweqwe.texteditor.y;
import qwe.qweqwe.texteditor.y0.p;
import qwe.qweqwe.texteditor.y0.r;
import ru.iiec.cxxdroid.c0.b;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.settings.CXXSettingsActivity;

public class CxxActivity extends e0 {
    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public m A() {
        return q.e();
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public String C() {
        return "cpp";
    }

    @Override // qwe.qweqwe.texteditor.e0
    public boolean D() {
        return super.D();
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public String E() {
        return "http://n0n3m4.ru/privacy_policies/cxxdroid.html";
    }

    @Override // qwe.qweqwe.texteditor.e0
    public String H() {
        return "CMakeLists.txt";
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public y J() {
        return new v(this);
    }

    @Override // qwe.qweqwe.texteditor.e0
    public String L() {
        return "assets://examples/examples.json";
    }

    @Override // qwe.qweqwe.texteditor.e0
    public Class<?> M() {
        return CXXSettingsActivity.class;
    }

    @Override // qwe.qweqwe.texteditor.e0
    public r O() {
        return new x(this);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void Y() {
        O().c();
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void a(int i2, p pVar) {
        super.a(i2, pVar);
        b.e(pVar.C0());
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void a(NavigationView navigationView) {
        super.a(navigationView);
        try {
            navigationView.getMenu().findItem(C0162R.id.nav_show_compiler_output).setVisible(v.f10009c != null);
            navigationView.getMenu().findItem(C0162R.id.nav_run_logs).setVisible(u.l(this).exists());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ void a(a aVar, g gVar) {
        if (gVar.e()) {
            aVar.a();
        }
        this.w.post(new f(this));
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void a(String str, String str2) {
        qwe.qweqwe.texteditor.y0.q qVar = this.u;
        qVar.a(str, str2, qwe.qweqwe.texteditor.v0.a.a() + str, 0, 0, true);
    }

    @Override // com.google.android.material.navigation.NavigationView.b, qwe.qweqwe.texteditor.e0
    public boolean a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0162R.id.nav_interpreter) {
            Intent intent = new Intent(this, RunScript.class);
            intent.setAction("iiec.androidterm.RUN_SCRIPT");
            intent.putExtra("pdb_mode_key", false);
            intent.putExtra("iiec.androidterm.iInitialCommand", "cd '" + qwe.qweqwe.texteditor.v0.a.f(this) + "' ; " + u.k(this) + " ; clear -r ; '" + u.b(this) + "/cling' ; exit");
            startActivity(intent);
        } else if (itemId == C0162R.id.nav_run_terminal) {
            if (a("android.permission.WRITE_EXTERNAL_STORAGE", 1002)) {
                d0();
            }
        } else if (itemId == C0162R.id.nav_run_package_manager) {
            CxxPackageManagerActivity.a(this);
        } else if (itemId == C0162R.id.nav_show_compiler_output) {
            v.a(this);
        } else if (itemId == C0162R.id.nav_run_logs) {
            v.b(this);
        }
        return super.a(menuItem);
    }

    @Override // qwe.qweqwe.texteditor.e0
    public File b(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        File file2 = null;
        while (true) {
            file = file.getParentFile();
            if (file == null) {
                return file2;
            }
            File file3 = new File(file.getAbsolutePath() + "/CMakeLists.txt");
            if (file3.exists()) {
                if (file3.getParentFile().getAbsolutePath().equals(qwe.qweqwe.texteditor.v0.a.f(this)) || file3.getParentFile().getAbsolutePath().equals("/sdcard")) {
                    return null;
                }
                file2 = file3;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void b(Bundle bundle) {
        super.b(bundle);
        if (this.x == null) {
            super.a(new ru.iiec.cxxdroid.a0.b(this));
        }
        if (this.v == null) {
            super.a(new ru.iiec.cxxdroid.b0.a(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void b(NavigationView navigationView) {
        super.b(navigationView);
        navigationView.b(C0162R.menu.activity_cxx_drawer);
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void b(f fVar) {
        super.b(fVar);
        e eVar = this.x;
        if (eVar != null) {
            eVar.d();
        }
        w.a(this, fVar);
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void b(String str, String str2) {
        FirebaseAnalytics.getInstance(this).setUserProperty(str, str2);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public h0 c(Bundle bundle) {
        if (!y.a(this)) {
            return null;
        }
        new y(this, bundle).i();
        return null;
    }

    @Override // qwe.qweqwe.texteditor.e0
    public String d(String str) {
        return a.b().a(str);
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void d(int i2) {
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void d0() {
        Intent intent = new Intent(this, RunScript.class);
        intent.setAction("iiec.androidterm.RUN_SCRIPT");
        intent.putExtra("pdb_mode_key", false);
        intent.putExtra("iiec.androidterm.iInitialCommand", "cd '" + qwe.qweqwe.texteditor.v0.a.f(this) + "' ; " + u.k(this) + " ; clear -r ; '" + qwe.qweqwe.texteditor.v0.a.d(this) + "' sh");
        startActivity(intent);
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i2) {
        g("upgrade_proj");
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void e(String str) {
        FirebaseAnalytics.getInstance(this).logEvent(str, new Bundle());
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void e0() {
        v.f10008b = null;
        super.e0();
    }

    public /* synthetic */ void h(String str) {
        qwe.qweqwe.texteditor.w0.a.a(this, str);
        qwe.qweqwe.texteditor.x0.a.a(str, this);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void h0() {
        if (D()) {
            b(new c(this));
        } else {
            l0();
        }
    }

    @Override // qwe.qweqwe.texteditor.e0
    public boolean i0() {
        return true;
    }

    public /* synthetic */ void j0() {
        try {
            Thread.sleep(500);
            e.e.a.a c2 = e.e.a.a.c(this);
            c2.a(qwe.qweqwe.texteditor.v0.a.d(this) + " pkill -9 -f cxxguiapp").waitFor();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ void k0() {
        new x(this).a(y(), new e(this));
    }

    public void l0() {
        new AlertDialog.Builder(this).setTitle(C0162R.string.proj_support_paywall_title).setMessage(C0162R.string.proj_support_paywall_message).setPositiveButton(C0162R.string.get_premium, new b(this)).show();
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, qwe.qweqwe.texteditor.e0
    public void onActivityResult(int i2, int i3, Intent intent) {
        v.a(this, i2, i3, intent);
        super.onActivityResult(i2, i3, intent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f, qwe.qweqwe.texteditor.e0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.a(this);
        v.a(this, bundle);
        b.a(this);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(C0162R.id.fab);
        floatingActionButton.setImageDrawable(c.h.d.d.f.b(getResources(), C0162R.drawable.ic_play_arrow_black_24dp, null));
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(c.h.d.a.a(this, (int) C0162R.color.light_gray)));
        if (bundle == null) {
            O().c();
        }
        this.u.f9881c.setSelectedTabIndicatorColor(getResources().getColor(C0162R.color.light_gray));
    }

    @Override // qwe.qweqwe.texteditor.e0
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C0162R.menu.cxx_menu, menu);
        return true;
    }

    @Override // qwe.qweqwe.texteditor.e0
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0162R.id.action_format_code) {
            w.a(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, qwe.qweqwe.texteditor.e0
    public void onResume() {
        super.onResume();
        new Thread(new a(this)).start();
    }

    @Override // qwe.qweqwe.texteditor.e0
    public void setNewGetPremiumDialogReasons(View view) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String string = defaultSharedPreferences.getString("on_boarding_page_1", null);
        if (string == null) {
            view.findViewById(C0162R.id.code_analysis_reason).setVisibility(8);
        } else {
            TextView textView = (TextView) view.findViewById(C0162R.id.code_analysis_reason);
            textView.setVisibility(0);
            textView.setText("option_3".equals(string) ? C0162R.string.paywall_code_analysis_advanced : C0162R.string.paywall_code_analysis_basic);
        }
        String string2 = defaultSharedPreferences.getString("on_boarding_page_2", null);
        if (string2 == null) {
            view.findViewById(C0162R.id.code_prediction_reason).setVisibility(8);
        } else {
            TextView textView2 = (TextView) view.findViewById(C0162R.id.code_prediction_reason);
            textView2.setVisibility(0);
            textView2.setText("option_3".equals(string2) ? C0162R.string.paywall_code_prediction_advanced : C0162R.string.paywall_code_prediction_basic);
        }
        String string3 = defaultSharedPreferences.getString("on_boarding_page_4", null);
        if (string3 == null || "option_1".equals(string3)) {
            view.findViewById(C0162R.id.projects_reason).setVisibility(8);
            view.findViewById(C0162R.id.paywall_projects_priority).setVisibility(8);
            view.findViewById(C0162R.id.paywall_projects_no_priority).setVisibility(0);
        } else {
            view.findViewById(C0162R.id.projects_reason).setVisibility(0);
            view.findViewById(C0162R.id.paywall_projects_priority).setVisibility(0);
            view.findViewById(C0162R.id.paywall_projects_no_priority).setVisibility(8);
            ((TextView) view.findViewById(C0162R.id.projects_reason)).setText("option_2".equals(string3) ? C0162R.string.paywall_projects_advanced : C0162R.string.paywall_projects_graphics);
        }
        if (!"option_3".equals(string3)) {
            view.findViewById(C0162R.id.libs_reason).setVisibility(8);
            view.findViewById(C0162R.id.paywall_libs_priority).setVisibility(8);
            view.findViewById(C0162R.id.paywall_libs_no_priority).setVisibility(0);
            return;
        }
        view.findViewById(C0162R.id.libs_reason).setVisibility(0);
        view.findViewById(C0162R.id.paywall_libs_priority).setVisibility(0);
        view.findViewById(C0162R.id.paywall_libs_no_priority).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public void u() {
        a b2 = a.b();
        b2.a(0).a(this, new d(this, b2));
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.e0
    public String z() {
        return getString(CXXSettingsActivity.r(this) ? C0162R.string.new_file_text : C0162R.string.new_file_text_c);
    }
}
