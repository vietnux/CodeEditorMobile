package ru.iiec.cxxdroid;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k.a.a.a.b;
import qwe.qweqwe.texteditor.u0.w;
import qwe.qweqwe.texteditor.v0.a;

class y extends w {

    /* renamed from: i  reason: collision with root package name */
    public static String f10032i = "bb_key";

    /* renamed from: j  reason: collision with root package name */
    public static int f10033j = 108;

    /* renamed from: k  reason: collision with root package name */
    public static String f10034k = "package_key";

    /* renamed from: l  reason: collision with root package name */
    public static int f10035l = 41;

    /* renamed from: h  reason: collision with root package name */
    boolean f10036h = true;

    public y(Activity activity, Bundle bundle) {
        super(activity, bundle);
    }

    private void a(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        if (!file.delete() && this.f10036h) {
            Log.e("FirstTimerRunner", file.getAbsolutePath() + " was not deleted");
        }
    }

    public static boolean a(Context context) {
        t tVar = new t(context);
        return (f10035l == tVar.b(f10034k, -1) && f10033j == tVar.b(f10032i, -1)) ? false : true;
    }

    static /* synthetic */ void j() {
        try {
            w.f9750g.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // qwe.qweqwe.texteditor.u0.w
    public String b() {
        return a.c(this.f9752c) + "/busybox";
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.a.post(new r(this, str));
    }

    @Override // qwe.qweqwe.texteditor.u0.w
    public String c() {
        return a.c(this.f9752c) + "/sh";
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        this.a.post(new o(str));
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.u0.w
    public int d() {
        return 5;
    }

    public /* synthetic */ void d(String str) {
        Toast.makeText(this.f9752c, str, 1).show();
    }

    public int g() {
        return 3056;
    }

    public /* synthetic */ void h() {
        t tVar = new t(this.f9752c);
        if (f10033j != tVar.b(f10032i, -1)) {
            c("installing busybox");
            if (e()) {
                tVar.a(f10032i, f10033j);
            } else {
                b("problems with installing busybox");
            }
        }
        if (f10035l != tVar.b(f10034k, -1)) {
            c("installing clang");
            Iterator it = new ArrayList(Arrays.asList(a.c(this.f9752c) + "/aarch64-linux-android", a.c(this.f9752c) + "/arm-linux-androideabi", a.c(this.f9752c) + "/i686-linux-android", a.c(this.f9752c) + "/x86_64-linux-android", a.c(this.f9752c) + "/bin", a.c(this.f9752c) + "/include", a.c(this.f9752c) + "/lib", a.c(this.f9752c) + "/lib64", a.c(this.f9752c) + "/libexec")).iterator();
            while (it.hasNext()) {
                a(new File((String) it.next()));
            }
            try {
                b.b(new File(u.f(this.f9752c)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (a("finalpackage_arm64.tar.xz")) {
                tVar.a(f10034k, f10035l);
            } else {
                b("problems with installing clang");
            }
        }
        this.a.post(q.f10005b);
    }

    public void i() {
        w.f9750g = new ProgressDialog(this.f9752c);
        w.f9750g.setProgressStyle(1);
        w.f9750g.setCancelable(false);
        w.f9750g.setTitle("Installing");
        w.f9750g.show();
        w.f9750g.setMax(g());
        if (this.f9753d == null) {
            new Thread(new p(this)).start();
        }
    }
}
