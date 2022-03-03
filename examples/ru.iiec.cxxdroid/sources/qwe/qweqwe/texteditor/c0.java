package qwe.qweqwe.texteditor;

import android.content.Context;
import java.util.Date;
import qwe.qweqwe.texteditor.u0.b0.f;
import qwe.qweqwe.texteditor.u0.v;
import qwe.qweqwe.texteditor.u0.x;

public class c0 {
    private static String a = "common_run_premium_date_key";

    /* renamed from: b  reason: collision with root package name */
    protected static int f9610b = 604800000;

    /* renamed from: c  reason: collision with root package name */
    protected static int f9611c = 1000;

    public static void a(e0 e0Var) {
        if (!e0Var.v().a() && !a(e0Var, (long) f9610b, (long) f9611c)) {
            f.a(e0Var);
        }
    }

    public static boolean a(e0 e0Var, long j2, long j3) {
        try {
            if (e0Var.D()) {
                return false;
            }
            long a2 = x.a((Context) e0Var, a, -1L);
            long time = new Date().getTime();
            if (a2 == -1) {
                x.b(e0Var, a, time);
                return false;
            }
            if (time - a2 > j2) {
                x.b(e0Var, a, time);
                e0Var.e("show_get_premium_after_run");
                v.a(j3, e0Var, e0Var.w());
                return true;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
