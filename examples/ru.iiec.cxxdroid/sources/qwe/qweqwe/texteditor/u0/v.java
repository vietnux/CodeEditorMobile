package qwe.qweqwe.texteditor.u0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.r0;

public class v {
    public static String a = "unknown";

    /* access modifiers changed from: package-private */
    public static class a {
        String a;

        /* renamed from: b  reason: collision with root package name */
        String f9748b;

        /* renamed from: c  reason: collision with root package name */
        String f9749c;

        a(y yVar) {
            String str;
            this.a = yVar.b();
            this.f9748b = yVar.c();
            try {
                String a2 = yVar.a();
                if (a2 != null) {
                    char charAt = a2.charAt(1);
                    char charAt2 = a2.charAt(2);
                    if (charAt2 == 'W') {
                        str = charAt + " week";
                    } else if (charAt2 == 'D') {
                        str = charAt + " day";
                    } else {
                        this.f9749c = null;
                        return;
                    }
                    this.f9749c = str;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(long j2, e0 e0Var, y yVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(e0Var);
        View inflate = e0Var.getLayoutInflater().inflate(o0.layout_purchase_premium_dialog, (ViewGroup) null);
        try {
            d(e0Var, inflate);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        builder.setView(inflate);
        AlertDialog create = builder.create();
        inflate.findViewById(n0.purchase_premium_forever).setOnClickListener(new c(yVar));
        inflate.findViewById(n0.purchase_premium_mounthly).setOnClickListener(new i(yVar));
        inflate.findViewById(n0.close_dialog).setOnClickListener(new j(create));
        if (j2 > 0) {
            create.setCancelable(false);
            new Handler().postDelayed(new d(create), j2);
        }
        create.show();
    }

    static /* synthetic */ void a(AlertDialog alertDialog) {
        try {
            alertDialog.setCancelable(true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str) {
        a = str;
    }

    public static void a(e0 e0Var) {
        if (e0Var.w().d() && !x.a(e0Var, "log_purchase_event_once_key")) {
            e0Var.e("purchase_premium_forever_" + a);
            x.a((Context) e0Var, "log_purchase_event_once_key", true);
        }
    }

    static /* synthetic */ void a(e0 e0Var, View view) {
        try {
            d(e0Var, view);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(e0 e0Var, String str) {
        a(str);
        a(e0Var, e0Var.w());
    }

    public static void a(e0 e0Var, String str, DialogInterface.OnDismissListener onDismissListener) {
        Dialog dialog = new Dialog(e0Var, r0.AppTheme);
        View inflate = e0Var.getLayoutInflater().inflate(o0.onboarding_fragment_paywall, (ViewGroup) null);
        try {
            e0Var.w().a(new e(e0Var, inflate));
            d(e0Var, inflate);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        inflate.findViewById(n0.purchase_premium_forever).setOnClickListener(new h(e0Var));
        inflate.findViewById(n0.purchase_premium_mounthly).setOnClickListener(new f(e0Var));
        inflate.findViewById(n0.close_dialog).setOnClickListener(new b(dialog));
        ((TextView) inflate.findViewById(n0.title)).setText(e0Var.getString(q0.onboarding_paywall_title).replace("%LANGNAME%", e0Var.getString(q0.lang_name)));
        e0Var.setNewGetPremiumDialogReasons(inflate.findViewById(n0.fragment_paywall_content_container));
        dialog.setOnCancelListener(new g(e0Var));
        dialog.setContentView(inflate);
        dialog.setOnDismissListener(onDismissListener);
        dialog.show();
    }

    public static void a(e0 e0Var, y yVar) {
        a(-1, e0Var, yVar);
    }

    private static void d(e0 e0Var, View view) {
        a aVar = new a(e0Var.w());
        if (aVar.a == null || aVar.f9748b == null) {
            i0.b("BillingUtils", "Some prices are unable to load");
            ((TextView) view.findViewById(n0.error_message)).setVisibility(0);
            ((TextView) view.findViewById(n0.error_message)).setText(q0.unable_load_prices);
        }
        if (aVar.f9748b == null) {
            ((TextView) view.findViewById(n0.purchase_premium_forever_text2)).setText(q0.forever_offer_text_2_unloaded);
        } else {
            ((TextView) view.findViewById(n0.purchase_premium_forever_text2)).setText(e0Var.getString(q0.forever_offer_text_2, new Object[]{aVar.f9748b}));
        }
        if (aVar.a == null) {
            ((TextView) view.findViewById(n0.purchase_premium_mounthly_text2)).setText(q0.sub_offer_text_2_unloaded);
        } else {
            ((TextView) view.findViewById(n0.purchase_premium_mounthly_text2)).setText(e0Var.getString(q0.sub_offer_text_2, new Object[]{aVar.a}));
        }
        if (aVar.f9749c == null) {
            ((TextView) view.findViewById(n0.purchase_premium_mounthly_text1)).setText(q0.sub_offer_text_1_unloaded);
            return;
        }
        ((TextView) view.findViewById(n0.purchase_premium_mounthly_text1)).setText(e0Var.getString(q0.sub_offer_text_1, new Object[]{aVar.f9749c}));
    }
}
