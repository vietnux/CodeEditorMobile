package e.c.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.mikepenz.aboutlibraries.ui.LibsActivity;
import e.c.a.c;
import e.c.a.p.a;
import g.r.d.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.HashMap;

public final class d implements Serializable {
    private String A;
    private a B;
    private c.a C;
    private b D = b.DEFAULT_EXECUTOR;
    private final HashMap<String, HashMap<String, String>> E = new HashMap<>();
    private final HashMap<String, String> F = new HashMap<>();
    private Class<?> G = LibsActivity.class;

    /* renamed from: b  reason: collision with root package name */
    private String[] f8095b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    private String[] f8096c = new String[0];

    /* renamed from: d  reason: collision with root package name */
    private String[] f8097d = new String[0];

    /* renamed from: e  reason: collision with root package name */
    private boolean f8098e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8099f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8100g = true;

    /* renamed from: h  reason: collision with root package name */
    private Comparator<e.c.a.o.a> f8101h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8102i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8103j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8104k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8105l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8106m = true;
    private String n = "";
    private String o;
    private boolean p = true;
    private String q;
    private boolean r = true;
    private boolean s = true;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private int z = -1;

    private final void C() {
        if (this.f8095b.length == 0) {
            Log.w("AboutLibraries", "Have you missed to call withFields(R.string.class.getFields())? - autoDetect won't work - https://github.com/mikepenz/AboutLibraries/wiki/HOWTO:-Fragment");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: e.c.a.d */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Intent a(d dVar, Context context, Class cls, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cls = dVar.G;
        }
        return dVar.a(context, cls);
    }

    public final boolean A() {
        return this.f8104k;
    }

    public final boolean B() {
        return this.f8100g;
    }

    public final Intent a(Context context, Class<?> cls) {
        i.d(context, "ctx");
        i.d(cls, "clazz");
        C();
        Intent intent = new Intent(context, cls);
        intent.putExtra("data", this);
        intent.putExtra("ABOUT_LIBRARIES_THEME", this.z);
        String str = this.A;
        if (str != null) {
            intent.putExtra("ABOUT_LIBRARIES_TITLE", str);
        }
        a aVar = this.B;
        if (aVar != null) {
            intent.putExtra("ABOUT_COLOR", aVar);
        }
        c.a aVar2 = this.C;
        if (aVar2 != null) {
            intent.putExtra("ABOUT_LIBRARIES_STYLE", aVar2 != null ? aVar2.name() : null);
        }
        return intent;
    }

    public final d a(String[] strArr) {
        i.d(strArr, "fields");
        this.f8095b = strArr;
        return this;
    }

    public final d a(Field[] fieldArr) {
        i.d(fieldArr, "fields");
        a(e.c.a.p.c.a(fieldArr));
        return this;
    }

    public final void a(Context context) {
        i.d(context, "ctx");
        Intent a = a(this, context, null, 2, null);
        a.addFlags(268435456);
        context.startActivity(a);
    }

    public final void a(String str) {
        this.o = str;
    }

    public final void a(boolean z2) {
        this.f8106m = z2;
    }

    public final String b() {
        return this.o;
    }

    public final void b(String str) {
        this.t = str;
    }

    public final void b(boolean z2) {
        this.p = z2;
    }

    public final String c() {
        return this.t;
    }

    public final void c(String str) {
        this.u = str;
    }

    public final void c(boolean z2) {
        this.s = z2;
    }

    public final String d() {
        return this.u;
    }

    public final void d(String str) {
        this.v = str;
    }

    public final void d(boolean z2) {
        this.r = z2;
    }

    public final String e() {
        return this.v;
    }

    public final void e(String str) {
        this.w = str;
    }

    public final String f() {
        return this.w;
    }

    public final void f(String str) {
        this.x = str;
    }

    public final String g() {
        return this.x;
    }

    public final void g(String str) {
        this.y = str;
    }

    public final String h() {
        return this.y;
    }

    public final void h(String str) {
        this.q = str;
    }

    public final String i() {
        return this.q;
    }

    public final boolean j() {
        return this.f8106m;
    }

    public final boolean k() {
        return this.p;
    }

    public final boolean l() {
        return this.s;
    }

    public final boolean m() {
        return this.r;
    }

    public final String n() {
        return this.n;
    }

    public final boolean o() {
        return this.f8098e;
    }

    public final boolean p() {
        return this.f8099f;
    }

    public final String[] q() {
        return this.f8097d;
    }

    public final String[] r() {
        return this.f8095b;
    }

    public final String[] s() {
        return this.f8096c;
    }

    public final b t() {
        return this.D;
    }

    public final Comparator<e.c.a.o.a> u() {
        return this.f8101h;
    }

    public final HashMap<String, String> v() {
        return this.F;
    }

    public final HashMap<String, HashMap<String, String>> w() {
        return this.E;
    }

    public final boolean x() {
        return this.f8102i;
    }

    public final boolean y() {
        return this.f8103j;
    }

    public final boolean z() {
        return this.f8105l;
    }
}
