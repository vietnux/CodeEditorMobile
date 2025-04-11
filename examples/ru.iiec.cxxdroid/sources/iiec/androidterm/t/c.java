package iiec.androidterm.t;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.Log;
import e.e.a.a;
import iiec.androidterm.RemoteInterface;
import iiec.androidterm.g;
import iiec.androidterm.j;
import iiec.androidterm.m;

public class c {
    public static final int[][] x = {new int[]{-16777216, -1}, new int[]{-1, -16777216}, new int[]{-1, -13349187}, new int[]{-16711936, -16777216}, new int[]{-18863, -16777216}, new int[]{-65261, -16777216}, new int[]{-13388315, -16777216}, new int[]{-10126461, -133405}, new int[]{-8153962, -16766154}, new int[]{-5592406, -16777216}};
    public static final int[] y = {23, 77, 57, 58, 24, 25, 27, -1};
    public static final int[] z = {23, 77, 57, 58, 24, 25, 27, -1};
    private SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    private int f9450b;

    /* renamed from: c  reason: collision with root package name */
    private int f9451c;

    /* renamed from: d  reason: collision with root package name */
    private int f9452d;

    /* renamed from: e  reason: collision with root package name */
    private int f9453e;

    /* renamed from: f  reason: collision with root package name */
    private int f9454f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9455g;

    /* renamed from: h  reason: collision with root package name */
    private int f9456h;

    /* renamed from: i  reason: collision with root package name */
    private int f9457i;

    /* renamed from: j  reason: collision with root package name */
    private int f9458j;

    /* renamed from: k  reason: collision with root package name */
    private int f9459k;

    /* renamed from: l  reason: collision with root package name */
    private String f9460l;

    /* renamed from: m  reason: collision with root package name */
    private String f9461m;
    private String n;
    private boolean o;
    private boolean p;
    private boolean q;
    private String r;
    private String s = null;
    private String t = null;
    private boolean u;
    private boolean v;
    private boolean w;

    public c(Resources resources, SharedPreferences sharedPreferences) {
        a(resources);
        a(sharedPreferences);
    }

    private int a(String str, int i2, int i3) {
        try {
            i2 = Integer.parseInt(this.a.getString(str, Integer.toString(i2)));
        } catch (NumberFormatException unused) {
        }
        return Math.max(0, Math.min(i2, i3));
    }

    private String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    private void a(Resources resources) {
        this.f9450b = Integer.parseInt(resources.getString(m.pref_statusbar_default));
        this.f9451c = resources.getInteger(j.pref_actionbar_default);
        this.f9452d = resources.getInteger(j.pref_orientation_default);
        Integer.parseInt(resources.getString(m.pref_cursorstyle_default));
        Integer.parseInt(resources.getString(m.pref_cursorblink_default));
        this.f9453e = Integer.parseInt(resources.getString(m.pref_fontsize_default));
        this.f9454f = Integer.parseInt(resources.getString(m.pref_color_default));
        this.f9455g = resources.getBoolean(g.pref_utf8_by_default_default);
        this.f9456h = Integer.parseInt(resources.getString(m.pref_backaction_default));
        this.f9457i = Integer.parseInt(resources.getString(m.pref_controlkey_default));
        this.f9458j = Integer.parseInt(resources.getString(m.pref_fnkey_default));
        this.f9459k = Integer.parseInt(resources.getString(m.pref_ime_default));
        this.f9461m = "system/bin/sh -";
        RemoteInterface remoteInterface = RemoteInterface.f9234f;
        if (remoteInterface != null) {
            String path = new ContextWrapper(remoteInterface).getFilesDir().getPath();
            String a2 = a.c(new ContextWrapper(remoteInterface)).a();
            this.f9461m = path + "/busybox sh";
            if (a2 != null) {
                this.f9461m = a2 + " " + this.f9461m;
            }
            try {
                String stringExtra = remoteInterface.getIntent().getStringExtra("custom_shell_path");
                if (stringExtra != null && !"".equals(stringExtra)) {
                    this.f9461m = stringExtra;
                    Log.v("CUSTOM_SHELL", "run program with custom shell: " + stringExtra);
                }
            } catch (Exception unused) {
            }
        }
        this.f9460l = this.f9461m;
        this.n = resources.getString(m.pref_termtype_default);
        this.o = resources.getBoolean(g.pref_verify_path_default);
        this.p = resources.getBoolean(g.pref_do_path_extensions_default);
        this.q = resources.getBoolean(g.pref_allow_prepend_path_default);
        this.u = resources.getBoolean(g.pref_alt_sends_esc_default);
        this.v = resources.getBoolean(g.pref_mouse_tracking_default);
        this.w = resources.getBoolean(g.pref_use_keyboard_shortcuts_default);
    }

    private boolean a(String str, boolean z2) {
        return this.a.getBoolean(str, z2);
    }

    public int a() {
        return this.f9451c;
    }

    public void a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.f9450b = a("statusbar", this.f9450b, 1);
        this.f9451c = a("actionbar", this.f9451c, 2);
        this.f9452d = a("orientation", this.f9452d, 2);
        this.f9453e = a("fontsize", this.f9453e, 288);
        this.f9454f = a("color", this.f9454f, x.length - 1);
        this.f9455g = a("utf8_by_default", this.f9455g);
        this.f9456h = a("backaction", this.f9456h, 4);
        this.f9457i = a("controlkey", this.f9457i, y.length - 1);
        this.f9458j = a("fnkey", this.f9458j, z.length - 1);
        this.f9459k = a("ime", this.f9459k, 1);
        this.n = a("termtype", this.n);
        this.o = a("verify_path", this.o);
        this.p = a("do_path_extensions", this.p);
        this.q = a("allow_prepend_path", this.q);
        this.r = a("home_path", this.r);
        this.u = a("alt_sends_esc", this.u);
        this.v = a("mouse_tracking", this.v);
        this.w = a("use_keyboard_shortcuts", this.w);
        this.a = null;
    }

    public void a(String str) {
        this.t = str;
    }

    public void b(String str) {
        this.s = str;
    }

    public boolean b() {
        return this.q;
    }

    public boolean c() {
        return this.f9455g;
    }

    public boolean d() {
        return this.p;
    }

    public boolean e() {
        return this.u;
    }

    public String f() {
        return this.t;
    }

    public int g() {
        return this.f9456h;
    }

    public int h() {
        int i2 = this.f9456h;
        if (i2 != 3) {
            return i2 != 4 ? 0 : 9;
        }
        return 27;
    }

    public int[] i() {
        return x[this.f9454f];
    }

    public int j() {
        return y[this.f9457i];
    }

    public int k() {
        return this.f9457i;
    }

    public String l() {
        return this.f9461m;
    }

    public int m() {
        return z[this.f9458j];
    }

    public int n() {
        return this.f9458j;
    }

    public int o() {
        return this.f9453e;
    }

    public String p() {
        return this.r;
    }

    public String q() {
        return "";
    }

    public boolean r() {
        return this.v;
    }

    public String s() {
        return this.s;
    }

    public int t() {
        return this.f9452d;
    }

    public String u() {
        return this.f9460l;
    }

    public String v() {
        return this.n;
    }

    public boolean w() {
        return this.w;
    }

    public boolean x() {
        return this.f9450b != 0;
    }

    public boolean y() {
        return this.f9459k != 0;
    }

    public boolean z() {
        return this.o;
    }
}
