package qwe.qweqwe.texteditor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import c.a.o.b;
import com.getdirectory.GetFileActivity;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import d.c.f;
import e.d.a.a.m;
import iiec.androidterm.RunScript;
import iiec.androidterm.TermPreferences;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipFile;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.foldernav.h;
import qwe.qweqwe.texteditor.samples.SamplesActivity;
import qwe.qweqwe.texteditor.settings.SettingsActivity;
import qwe.qweqwe.texteditor.u0.a0;
import qwe.qweqwe.texteditor.u0.v;
import qwe.qweqwe.texteditor.u0.x;
import qwe.qweqwe.texteditor.u0.y;
import qwe.qweqwe.texteditor.ui.onboarding.OnBoardingActivity;
import qwe.qweqwe.texteditor.w0.c.i;
import qwe.qweqwe.texteditor.y0.p;
import qwe.qweqwe.texteditor.y0.q;
import qwe.qweqwe.texteditor.y0.r;

public abstract class e0 extends e implements NavigationView.b {
    private static final HashMap<Integer, ArrayList<qwe.qweqwe.texteditor.w0.d.d>> H = new HashMap<>();
    private z A;
    private boolean B = false;
    public boolean C = false;
    private h D;
    private ArrayList<Runnable> E = new ArrayList<>();
    boolean F = false;
    private HashMap<Integer, d> G = new HashMap<>();
    public boolean q = false;
    public c.a.o.b r;
    public b.a s;
    public qwe.qweqwe.texteditor.settings.d t;
    public q u;
    public i v;
    public Handler w;
    protected qwe.qweqwe.texteditor.w0.d.e x;
    boolean y = false;
    private y z;

    /* access modifiers changed from: package-private */
    public class a extends androidx.appcompat.app.b {

        /* renamed from: j  reason: collision with root package name */
        public boolean f9618j;

        /* renamed from: qwe.qweqwe.texteditor.e0$a$a  reason: collision with other inner class name */
        class AsyncTaskC0153a extends AsyncTask<Void, Void, Void> {
            TextView a;

            /* renamed from: b  reason: collision with root package name */
            TextView f9620b;

            /* renamed from: c  reason: collision with root package name */
            TextView f9621c;

            /* renamed from: d  reason: collision with root package name */
            String f9622d;

            /* renamed from: e  reason: collision with root package name */
            String f9623e;

            /* renamed from: f  reason: collision with root package name */
            String f9624f;

            /* renamed from: g  reason: collision with root package name */
            private String f9625g;

            /* renamed from: h  reason: collision with root package name */
            private String f9626h;

            AsyncTaskC0153a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                try {
                    p d2 = e0.this.u.d();
                    int[] y0 = d2.y0();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f9626h);
                    sb.append(" ");
                    sb.append(y0[1]);
                    this.f9622d = d2.K0();
                    this.f9623e = this.f9625g + " " + y0[0] + "/" + y0[2];
                    this.f9624f = sb.toString();
                    return null;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void onPostExecute(Void r2) {
                super.onPostExecute(r2);
                try {
                    this.a = (TextView) e0.this.findViewById(n0.nav_header_main_textview_0);
                    this.f9620b = (TextView) e0.this.findViewById(n0.nav_header_main_textview_1);
                    this.f9621c = (TextView) e0.this.findViewById(n0.nav_header_main_textview_2);
                    this.a.setText(this.f9622d);
                    this.f9620b.setText(this.f9623e);
                    this.f9621c.setText(this.f9624f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                this.f9625g = e0.this.getString(q0.nav_header_titles_line);
                this.f9626h = e0.this.getString(q0.nav_header_titles_lineoffset);
                super.onPreExecute();
            }
        }

        a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i2, int i3) {
            super(activity, drawerLayout, toolbar, i2, i3);
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            super.a(view);
            e0.this.invalidateOptionsMenu();
            InputMethodManager inputMethodManager = (InputMethodManager) e0.this.getSystemService("input_method");
            if (e0.this.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(e0.this.getCurrentFocus().getWindowToken(), 0);
            }
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view, float f2) {
            super.a(view, f2);
            if (!this.f9618j) {
                this.f9618j = true;
                try {
                    e0.this.a((NavigationView) e0.this.findViewById(n0.nav_view));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (e0.this.u.d() != null) {
                    new AsyncTaskC0153a().execute(new Void[0]);
                }
            }
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            super.b(view);
            InputMethodManager inputMethodManager = (InputMethodManager) e0.this.getSystemService("input_method");
            if (e0.this.getCurrentFocus() != null) {
                inputMethodManager.hideSoftInputFromWindow(e0.this.getCurrentFocus().getWindowToken(), 0);
            }
            this.f9618j = false;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements b.a {
        b() {
        }

        @Override // c.a.o.b.a
        public void a(c.a.o.b bVar) {
            e0.this.r = null;
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, Menu menu) {
            return b(bVar, menu);
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                e0.this.u.d().T0();
            }
            if (itemId == 1) {
                e0.this.u.d().g0.b((ClipboardManager) e0.this.getSystemService("clipboard"));
            }
            if (itemId == 2) {
                e0.this.u.d().g0.a((ClipboardManager) e0.this.getSystemService("clipboard"));
                e0 e0Var = e0.this;
                Toast.makeText(e0Var, e0Var.getString(q0.text_was_copied), 0).show();
            }
            if (itemId == 3) {
                e0.this.u.d().g0.a(((ClipboardManager) e0.this.getSystemService("clipboard")).getText().toString());
            }
            if (itemId == 4) {
                e0.this.u.d().m(true);
            }
            if (itemId == 5) {
                e0.this.u.d().m(false);
            }
            if (itemId == 6) {
                p y = e0.this.y();
                y.b(e0.this.a(y.C0()));
            }
            e0.this.V();
            return false;
        }

        @Override // c.a.o.b.a
        public boolean b(c.a.o.b bVar, Menu menu) {
            i0.a("commenting", "creating menu");
            menu.clear();
            menu.add(0, 0, 2, e0.this.getString(q0.copy_paste_mode_select_all)).setIcon(m0.ic_select_all_white_24px).setShowAsAction(2);
            p d2 = e0.this.u.d();
            if (d2.g0.i() && d2.g0.getSelectionStart() != d2.g0.getSelectionEnd()) {
                menu.add(0, 1, 3, e0.this.getString(q0.copy_paste_mode_cut)).setIcon(m0.ic_content_cut_white_24px).setShowAsAction(2);
                menu.add(0, 2, 4, e0.this.getString(q0.copy_paste_mode_copy)).setIcon(m0.ic_content_copy_white_24px).setShowAsAction(2);
                int i2 = m0.ic_comment_slash;
                try {
                    i2 = e0.this.y().D0().b();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (d2.D0().c() != null) {
                    menu.add(0, 6, 1, e0.this.getString(q0.copy_pastemode_comment_or_uncomment_text)).setIcon(i2).setShowAsAction(2);
                }
            }
            CharSequence text = ((ClipboardManager) e0.this.getSystemService("clipboard")).getText();
            if (text != null && !text.equals("")) {
                menu.add(0, 3, 5, e0.this.getString(q0.paste)).setIcon(m0.ic_content_paste_white_24px).setShowAsAction(2);
            }
            if (e0.this.u.d().g0.e().d()) {
                menu.add(0, 4, 6, e0.this.getString(q0.action_undo)).setIcon(m0.ic_undo_white_24px).setShowAsAction(2);
            }
            if (e0.this.u.d().g0.e().c()) {
                menu.add(0, 5, 7, e0.this.getString(q0.action_redo)).setIcon(m0.ic_redo_white_24px).setShowAsAction(2);
            }
            return true;
        }
    }

    public interface c {
        void a(JSONObject jSONObject);
    }

    public interface d {
        void a(int i2, Intent intent);
    }

    static /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
    }

    private void c(Intent intent) {
        try {
            f a2 = f.a(intent.getStringExtra("sample_json_key"));
            int intExtra = intent.getIntExtra("sample_go_action_type", -1);
            if (intExtra == 1) {
                t0.a(this, a2);
            } else if (intExtra == 0) {
                t0.a(this, a2, intent.getStringExtra("sample_download_path"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void c(boolean z2) {
        this.B = z2;
        g0();
        i iVar = this.v;
        if (iVar != null) {
            iVar.a(D());
        }
    }

    static /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
    }

    private void d(Bundle bundle) {
        setContentView(o0.activity_editor);
        Toolbar toolbar = (Toolbar) findViewById(n0.toolbar);
        a(toolbar);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(n0.drawer_layout);
        a aVar = new a(this, drawerLayout, toolbar, q0.navigation_drawer_open, q0.navigation_drawer_close);
        drawerLayout.setDrawerListener(aVar);
        aVar.b();
        NavigationView navigationView = (NavigationView) findViewById(n0.nav_view);
        b(navigationView);
        navigationView.setNavigationItemSelectedListener(this);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(n0.fab);
        floatingActionButton.setOnClickListener(new e(this));
        floatingActionButton.setOnLongClickListener(new p(this));
        this.D = new h(this, (ViewGroup) findViewById(n0.second_navigation));
        if (i0()) {
            this.D.a(new f(this, drawerLayout));
        } else {
            ((DrawerLayout) findViewById(n0.drawer_layout)).removeView(findViewById(n0.second_navigation));
        }
    }

    private void j0() {
        e("share_pastebin");
        new qwe.qweqwe.texteditor.x0.c(this).a(this.u.d().I0(), this.u.d().K0(), C());
    }

    private void k0() {
        d.a aVar = new d.a(this);
        aVar.a(getString(q0.exit_someone_has_changes_dialog));
        aVar.c(getString(q0.exit), new j(this));
        aVar.a(getString(q0.save_all), new k(this));
        aVar.b(getString(q0.re_turn), h.f9652b);
        aVar.c();
    }

    private boolean l0() {
        try {
            Intent intent = getIntent();
            if (intent.getAction().compareTo("android.intent.action.VIEW") != 0) {
                return false;
            }
            String scheme = intent.getScheme();
            getContentResolver();
            if (scheme.compareTo("file") != 0) {
                return false;
            }
            this.y = true;
            Uri data = intent.getData();
            data.getLastPathSegment();
            qwe.qweqwe.texteditor.x0.a.a(data.getPath(), this);
            this.y = true;
            return this.y;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private void m0() {
        b(new b(this));
    }

    private void n0() {
        SamplesActivity.a(this);
    }

    private void o0() {
        if (!this.u.g()) {
            finish();
            return;
        }
        p d2 = this.u.d();
        if (a("android.permission.WRITE_EXTERNAL_STORAGE", 1001)) {
            if (d2.C0() == null) {
                Intent intent = new Intent(this, GetFileActivity.class);
                intent.putExtra("mode", "mode_save_file");
                intent.putExtra("extra_text_to_save", d2.I0());
                intent.putExtra("extra_default_file_name", z());
                startActivityForResult(intent, 10012);
                return;
            }
            try {
                qwe.qweqwe.texteditor.x0.b.a(d2.I0(), d2.C0());
                Toast.makeText(this, getString(q0.file_was_saved_part1) + " " + d2.K0() + " " + getString(q0.file_was_saved_part2), 0).show();
                this.u.a(false);
                o0();
            } catch (IOException e2) {
                e2.printStackTrace();
                Toast.makeText(this, getString(q0.file_wasnot_saved) + "\n" + e2.toString(), 0).show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public m A() {
        return e.d.a.a.y.e();
    }

    public h B() {
        return this.D;
    }

    /* access modifiers changed from: protected */
    public abstract String C();

    public boolean D() {
        return this.B;
    }

    /* access modifiers changed from: protected */
    public abstract String E();

    public HashMap<Integer, ArrayList<qwe.qweqwe.texteditor.w0.d.d>> F() {
        return D() ? this.u.d().E0() : H;
    }

    public boolean G() {
        return false;
    }

    public String H() {
        return null;
    }

    public FloatingActionButton I() {
        return (FloatingActionButton) findViewById(n0.fab);
    }

    /* access modifiers changed from: protected */
    public abstract y J();

    public ProgressBar K() {
        return (ProgressBar) findViewById(n0.fab_pg);
    }

    public String L() {
        return "";
    }

    public Class<?> M() {
        return SettingsActivity.class;
    }

    public q N() {
        return this.u;
    }

    public r O() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void P() {
        this.s = new b();
    }

    /* access modifiers changed from: protected */
    public void Q() {
    }

    public /* synthetic */ void R() {
        ConsentInformation a2 = ConsentInformation.a(this);
        if (!a2.d() || a2.a() != ConsentStatus.UNKNOWN) {
            qwe.qweqwe.texteditor.u0.b0.e.b(this);
        }
    }

    public /* synthetic */ void S() {
        Intent intent = new Intent(this, GetFileActivity.class);
        intent.putExtra("mode", "mode_save_file");
        intent.putExtra("extra_text_to_save", this.u.d().I0());
        intent.putExtra("extra_default_file_name", z());
        startActivityForResult(intent, 10002);
    }

    public /* synthetic */ void T() {
        Intent intent = new Intent(this, GetFileActivity.class);
        intent.putExtra("mode", "mode_open_file");
        startActivityForResult(intent, 10001);
    }

    /* access modifiers changed from: protected */
    public void U() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        EditText editText = new EditText(this);
        editText.setText(x.a(this, "last_used_run_argument", ""));
        builder.setTitle(q0.run_code_with_params);
        builder.setView(editText);
        builder.setPositiveButton(q0.run, new i(this, editText));
        builder.show();
    }

    @SuppressLint({"NewApi"})
    public void V() {
        try {
            if (this.r != null) {
                this.r.i();
            }
        } catch (Exception unused) {
        }
    }

    public void W() {
        i iVar;
        if (this.t.f9692g && (iVar = this.v) != null) {
            iVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void X() {
        Toast.makeText(this, q0.others_perm_denied, 0).show();
    }

    /* access modifiers changed from: protected */
    public void Y() {
        this.u.e();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        Toast.makeText(this, q0.others_perm_denied, 0).show();
    }

    public m a(String str) {
        return m.a(str, A());
    }

    public void a(int i2, d dVar) {
        this.G.put(Integer.valueOf(i2), dVar);
    }

    public void a(int i2, p pVar) {
    }

    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.C = false;
        qwe.qweqwe.texteditor.settings.d.a(this);
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    public /* synthetic */ void a(View view) {
        c0();
    }

    public /* synthetic */ void a(EditText editText, DialogInterface dialogInterface, int i2) {
        String obj = editText.getText().toString();
        x.b(this, "last_used_run_argument", obj);
        J().a(obj);
    }

    public /* synthetic */ void a(androidx.appcompat.widget.f fVar, DialogInterface dialogInterface, int i2) {
        SettingsActivity.c(this, fVar.isChecked());
        j0();
    }

    public /* synthetic */ void a(DrawerLayout drawerLayout, String str) {
        drawerLayout.a(8388613);
        qwe.qweqwe.texteditor.x0.a.b(str, this);
    }

    /* access modifiers changed from: protected */
    public void a(NavigationView navigationView) {
        try {
            Menu menu = navigationView.getMenu();
            menu.findItem(n0.nav_get_premium_parent).setVisible(f0());
            menu.findItem(n0.nav_more_ides).setActionView(o0.custon_more_ides_menu_item_layout);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(File file) {
        r O = O();
        if (O != null) {
            O.a(file);
        }
    }

    public /* synthetic */ void a(Boolean bool) {
        c(bool.booleanValue());
    }

    public void a(Runnable runnable) {
        this.w.post(runnable);
    }

    public void a(String str, String str2) {
        this.u.a(str, str2);
    }

    public void a(String str, String str2, String str3, int i2, boolean z2) {
        if (str3 == null) {
            this.u.a(str, str2, str3, i2, z2);
            return;
        }
        this.u.a(str, str2, str3, i2);
        d(this.u.d());
    }

    public void a(String str, c cVar) {
        c(new r(this, cVar, str));
    }

    /* access modifiers changed from: package-private */
    public void a(l.a.b bVar) {
        a0.a(this, bVar, q0.rationale_for_others);
    }

    public /* synthetic */ void a(c cVar, String str) {
        cVar.a(c(str));
    }

    public void a(i iVar) {
        this.v = iVar;
    }

    public void a(qwe.qweqwe.texteditor.w0.d.e eVar) {
        this.x = eVar;
    }

    public /* synthetic */ void a(p pVar) {
        if (qwe.qweqwe.texteditor.v0.a.a(pVar.C0()) == null) {
            Intent intent = new Intent(this, GetFileActivity.class);
            intent.putExtra("mode", "mode_save_file");
            intent.putExtra("extra_text_to_save", this.u.d().I0());
            intent.putExtra("extra_default_file_name", z());
            startActivityForResult(intent, 10002);
            return;
        }
        d(pVar);
    }

    public void a(boolean z2) {
        if (this.u.d() != null) {
            this.u.d().m(z2);
        }
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        if (i2 == 34 && (keyEvent.getMetaState() & 4096) != 0) {
            new qwe.qweqwe.texteditor.z0.b(this).a();
            return true;
        } else if (i2 == 40 && (keyEvent.getMetaState() & 4096) != 0) {
            new qwe.qweqwe.texteditor.z0.a(this).a();
            return true;
        } else if (i2 == 47 && (keyEvent.getMetaState() & 4096) != 0) {
            b(this.u.d());
            return true;
        } else if (i2 != 43 || (keyEvent.getMetaState() & 4096) == 0) {
            if (i2 == 30) {
                keyEvent.getMetaState();
            }
            if (i2 == 46 && (keyEvent.getMetaState() & 4096) != 0) {
                c0();
                return true;
            } else if (i2 != 62 && i2 != 32) {
                return false;
            } else {
                keyEvent.getMetaState();
                return false;
            }
        } else {
            m0();
            return true;
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.b
    public boolean a(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == n0.nav_settings) {
            Intent intent2 = new Intent(this, M());
            intent2.putExtra("extra_premium", D() ? G() ? 2 : 1 : 0);
            startActivityForResult(intent2, 10003);
        } else {
            if (itemId == n0.nav_terminal_settings) {
                intent = new Intent(this, TermPreferences.class);
            } else if (itemId == n0.nav_share_button) {
                intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", getString(q0.code_load_prefix) + this.u.d().I0());
                intent.setType("text/plain");
            } else if (itemId == n0.nav_pastebin) {
                if (SettingsActivity.d(this)) {
                    j0();
                } else {
                    androidx.appcompat.widget.f fVar = new androidx.appcompat.widget.f(this);
                    fVar.setText(q0.pastebin_warning_neveragain);
                    fVar.setChecked(false);
                    TypedValue typedValue = new TypedValue();
                    int complexToDimensionPixelSize = getTheme().resolveAttribute(k0.dialogPreferredPadding, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : 0;
                    d.a aVar = new d.a(this);
                    aVar.b(q0.pastebin_warning_title);
                    aVar.a(q0.pastebin_warning_desc);
                    aVar.a(q0.no, l.f9657b);
                    aVar.b(q0.yes, new g(this, fVar));
                    androidx.appcompat.app.d a2 = aVar.a();
                    a2.a(fVar, complexToDimensionPixelSize, 0, complexToDimensionPixelSize, 0);
                    a2.show();
                }
            } else if (itemId == n0.nav_get_premium) {
                e("show_get_premium_side_nav");
                g("from_nav");
            } else if (itemId == n0.nav_examples) {
                e("open_samples");
                n0();
            } else if (itemId == n0.nav_more_ides) {
                qwe.qweqwe.texteditor.u0.b0.e.a(this);
            } else if (itemId == n0.nav_feedback) {
                g0.a(this);
            } else if (itemId == n0.nav_privacy_policy) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(E())));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            startActivity(intent);
        }
        ((DrawerLayout) findViewById(n0.drawer_layout)).a(8388611);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, int i2) {
        if (getPackageManager().checkPermission(str, getPackageName()) == 0) {
            return true;
        }
        androidx.core.app.a.a(this, new String[]{str}, i2);
        return false;
    }

    public void a0() {
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.b();
        }
    }

    public File b(String str) {
        return null;
    }

    public /* synthetic */ Boolean b(Boolean bool) {
        runOnUiThread(new q(this, bool));
        return true;
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        o0();
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void b(NavigationView navigationView) {
    }

    public void b(f fVar) {
    }

    public void b(Runnable runnable) {
        f0.a(this, runnable);
    }

    public abstract void b(String str, String str2);

    public void b(p pVar) {
        b(new c(this, pVar));
    }

    public void b(boolean z2) {
        try {
            ((b0) getApplication()).b(z2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ boolean b(View view) {
        U();
        return true;
    }

    public void b0() {
        if (i0()) {
            ((DrawerLayout) findViewById(n0.drawer_layout)).k(findViewById(n0.second_navigation));
        } else {
            i0.b("EditorActivity", "Trying openSecondDrawer() while useFolderStructure() = false");
        }
    }

    public JSONObject c(String str) {
        try {
            return new JSONObject(d(str));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    /* access modifiers changed from: protected */
    public abstract h0 c(Bundle bundle);

    /* access modifiers changed from: protected */
    public void c(Runnable runnable) {
        ArrayList<Runnable> arrayList = this.E;
        if (arrayList == null) {
            runOnUiThread(runnable);
        } else {
            arrayList.add(runnable);
        }
    }

    public void c(p pVar) {
        i iVar = this.v;
        if (iVar != null) {
            iVar.b(pVar);
        }
    }

    public int[] c(int i2) {
        return this.u.d() != null ? this.u.d().d(i2) : new int[]{0, 0};
    }

    /* access modifiers changed from: protected */
    public void c0() {
        if (!this.F) {
            try {
                this.F = true;
                InputStream inputStream = null;
                Enumeration<URL> resources = getClassLoader().getResources("AndroidManifest.xml");
                while (resources.hasMoreElements()) {
                    URL nextElement = resources.nextElement();
                    if (nextElement.toString().contains(getPackageName())) {
                        if (inputStream == null) {
                            inputStream = nextElement.openStream();
                        } else {
                            throw new RuntimeException("Failed");
                        }
                    }
                }
                ZipFile zipFile = new ZipFile(getPackageResourcePath());
                InputStream inputStream2 = zipFile.getInputStream(zipFile.getEntry("AndroidManifest.xml"));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                k.a.a.a.e.a(inputStream, byteArrayOutputStream);
                k.a.a.a.e.a(inputStream2, byteArrayOutputStream2);
                this.F = Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
                inputStream.close();
                inputStream2.close();
                zipFile.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (this.F) {
            J().a();
        }
    }

    public abstract String d(String str);

    public void d(int i2) {
        this.u.d().c(i2);
    }

    public void d(p pVar) {
        try {
            qwe.qweqwe.texteditor.x0.b.a(pVar.I0(), pVar.C0());
            Toast.makeText(this, getString(q0.file_was_saved_part1) + " " + pVar.K0() + " " + getString(q0.file_was_saved_part2), 0).show();
            this.u.a(false, pVar);
        } catch (IOException e2) {
            e2.printStackTrace();
            Toast.makeText(this, getString(q0.file_wasnot_saved) + "\n" + e2.toString(), 0).show();
        }
        e(pVar);
    }

    /* access modifiers changed from: protected */
    public void d0() {
        Intent intent = new Intent(this, RunScript.class);
        intent.setAction("iiec.androidterm.RUN_SCRIPT");
        intent.putExtra("pdb_mode_key", false);
        intent.putExtra("iiec.androidterm.iInitialCommand", "cd '" + qwe.qweqwe.texteditor.v0.a.f(this) + "' ; " + qwe.qweqwe.texteditor.v0.a.a((Activity) this) + " ; clear -r ; '" + qwe.qweqwe.texteditor.v0.a.d(this) + "' sh");
        startActivity(intent);
    }

    public void e(int i2) {
        ((DrawerLayout) findViewById(n0.drawer_layout)).a(i2);
    }

    public abstract void e(String str);

    public void e(p pVar) {
        i iVar;
        if (this.t.f9692g && (iVar = this.v) != null) {
            iVar.c(pVar);
        }
    }

    public void e0() {
        i iVar;
        this.u.a(true);
        if (this.t.f9692g && (iVar = this.v) != null) {
            iVar.a();
        }
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.a();
        }
    }

    public p f(int i2) {
        return this.u.a(i2);
    }

    public void f(String str) {
        B().a(str);
        if (str == null) {
            ((TextView) findViewById(n0.project_name_tv)).setText(q0.no_project_opened_text);
            ((TextView) findViewById(n0.project_path_tv)).setText((CharSequence) null);
            return;
        }
        ((TextView) findViewById(n0.project_name_tv)).setText(getString(q0.project_name, new Object[]{new File(str).getName()}));
        ((TextView) findViewById(n0.project_path_tv)).setText(str);
    }

    /* access modifiers changed from: protected */
    public boolean f0() {
        return !D();
    }

    public void g(int i2) {
        i iVar;
        p y2 = y();
        if (y2 != null) {
            if (i0()) {
                File b2 = b(y2.C0());
                f(b2 == null ? null : b2.getParent());
            }
            if (this.t.f9692g && (iVar = this.v) != null) {
                iVar.a(y2);
            }
        }
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.c();
        }
    }

    public void g(String str) {
        v.a(str);
        v.a(this, this.z);
    }

    /* access modifiers changed from: protected */
    public void g0() {
        try {
            int i2 = 8;
            boolean z2 = false;
            findViewById(n0.scrollAnalysisBarHor).setVisibility(D() ? 0 : 8);
            View findViewById = findViewById(n0.completion_recycler);
            if (D()) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            MenuItem findItem = ((NavigationView) findViewById(n0.nav_view)).getMenu().findItem(n0.nav_get_premium);
            if (findItem != null) {
                if (!D()) {
                    z2 = true;
                }
                findItem.setVisible(z2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void h(int i2) {
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.a(i2);
        }
        i iVar = this.v;
        if (iVar != null) {
            iVar.a(i2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h0();

    public boolean i0() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01cf, code lost:
        if (r0 != null) goto L_0x01b4;
     */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: qwe.qweqwe.texteditor.e0.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(n0.drawer_layout);
        if (drawerLayout == null || !drawerLayout.e(8388611)) {
            q qVar = this.u;
            if (qVar == null || !qVar.h() || SettingsActivity.i(this)) {
                super.onBackPressed();
            } else {
                k0();
            }
        } else {
            drawerLayout.a(8388611);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q();
        this.w = new Handler();
        a(bundle);
        if (this.t == null) {
            this.t = new qwe.qweqwe.texteditor.settings.d(this);
            qwe.qweqwe.texteditor.settings.d.a(this, this.t);
        }
        d(bundle);
        this.u = new q(this);
        new qwe.qweqwe.texteditor.w0.b(this).a();
        this.u.a(bundle);
        P();
        this.u.c(0);
        l0();
        if (!"qwe".equals(getString(q0.license_key_gp))) {
            this.z = new y(this, new m(this));
            g0();
            c(D());
            qwe.qweqwe.texteditor.u0.b0.e.a(this, bundle);
            this.A = new z(this);
            a0.a(bundle, this);
            c(bundle);
            b(bundle);
            new d0(this).a();
            c(new o(this));
            if (OnBoardingActivity.a(this)) {
                this.C = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("replace gp_key");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(p0.editor_main, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onDestroy() {
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.onDestroy();
        }
        i iVar = this.v;
        if (iVar != null) {
            iVar.onDestroy();
        }
        y yVar = this.z;
        if (yVar != null) {
            yVar.h();
        }
        i0.a("EditorActivity", "onDestroy");
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.e
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 25 && this.t.f9689d) {
            this.u.d().S0();
            return true;
        } else if (i2 != 24 || !this.t.f9689d) {
            return super.onKeyDown(i2, keyEvent);
        } else {
            this.u.d().R0();
            return true;
        }
    }

    @Override // androidx.appcompat.app.e
    public boolean onMenuOpened(int i2, Menu menu) {
        try {
            MenuItem findItem = menu.findItem(n0.action_update_to_project);
            if (findItem != null) {
                if (i0()) {
                    findItem.setTitle((!i0() || y().P0()) ? q0.action_open_project_view : q0.action_update_to_project);
                } else {
                    findItem.setVisible(false);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return super.onMenuOpened(i2, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == n0.action_search) {
            new qwe.qweqwe.texteditor.z0.b(this).a();
            return true;
        } else if (itemId == n0.action_gotoline) {
            new qwe.qweqwe.texteditor.z0.a(this).a();
            return true;
        } else if (itemId == n0.action_redo) {
            this.u.d().l(false);
            this.v.a();
            return true;
        } else if (itemId == n0.action_undo) {
            this.u.d().l(true);
            this.v.a();
            return true;
        } else if (itemId == n0.nav_new_file) {
            Y();
            return true;
        } else if (itemId == n0.nav_open_file) {
            m0();
            return true;
        } else {
            if (itemId == n0.nav_save_file) {
                b(this.u.d());
            } else if (itemId == n0.nav_save_file_as) {
                b(new d(this));
            } else if (itemId == n0.nav_close_cur_tab) {
                this.u.f();
            } else if (itemId == n0.nav_recent_files) {
                qwe.qweqwe.texteditor.w0.a.b(this);
            } else if (itemId == n0.action_update_to_project) {
                if (y().P0()) {
                    b0();
                } else {
                    h0();
                }
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onPause() {
        try {
            if (this.u != null) {
                this.u.k();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.e
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        i0.c("EditorActivity", "onPostCreate()");
        if (bundle == null) {
            if (SettingsActivity.i(this)) {
                try {
                    int intValue = ((Integer) this.u.f9880b.b().second).intValue();
                    this.u.c(intValue);
                    this.u.b(intValue);
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.u.c(0);
            this.u.b(0);
            return;
        }
        int i2 = bundle.getInt("cur_tab_opened_num");
        this.u.c(i2);
        this.u.b(i2);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        f0.a(this, i2, iArr);
        if (i2 != 1001) {
            if (i2 == 1002) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    Toast.makeText(this, getString(q0.running_without_permission) + "WRITE_EXTERNAL_STORAGE", 0).show();
                }
                d0();
            }
        } else if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(this, getString(q0.no_permission) + "WRITE_EXTERNAL_STORAGE", 0).show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e
    public void onResume() {
        super.onResume();
        u();
        t();
        i0.c("EditorActivity", "onResume()");
        qwe.qweqwe.texteditor.settings.d.a(this, this.t);
        this.u.i();
        qwe.qweqwe.texteditor.w0.d.e eVar = this.x;
        if (eVar != null) {
            eVar.onResume();
        }
        h hVar = this.D;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        this.u.b(bundle);
        bundle.putStringArrayList("tabs_path_list", arrayList);
        bundle.putStringArrayList("tabs_text_list", arrayList2);
        bundle.putIntegerArrayList("tabs_carpos_list", arrayList3);
        bundle.putIntegerArrayList("tabs_scrollpos_list", arrayList4);
    }

    /* access modifiers changed from: protected */
    public void s() {
        ArrayList<Runnable> arrayList = this.E;
        if (arrayList != null) {
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                runOnUiThread(it.next());
            }
            this.E = null;
        }
    }

    public abstract void setNewGetPremiumDialogReasons(View view);

    /* access modifiers changed from: protected */
    public void t() {
    }

    /* access modifiers changed from: protected */
    public abstract void u();

    public z v() {
        return this.A;
    }

    public y w() {
        return this.z;
    }

    public ArrayList<Integer> x() {
        return this.u.d().c0;
    }

    public p y() {
        return this.u.d();
    }

    /* access modifiers changed from: protected */
    public String z() {
        return getString(q0.new_file_text);
    }
}
