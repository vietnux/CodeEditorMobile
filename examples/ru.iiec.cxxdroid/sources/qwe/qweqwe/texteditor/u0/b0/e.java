package qwe.qweqwe.texteditor.u0.b0;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.squareup.picasso.t;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;

public class e {
    public static void a(e0 e0Var) {
        e0Var.e("open_more_ides");
        a(e0Var, "https://play.google.com/store/apps/developer?id=IIEC");
    }

    public static void a(e0 e0Var, Bundle bundle) {
        if (bundle == null) {
            try {
                String stringExtra = e0Var.getIntent().getStringExtra("iiec_promo_open_url");
                if (stringExtra != null) {
                    a(e0Var, stringExtra);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void a(e0 e0Var, String str) {
        e0Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    static /* synthetic */ void a(e0 e0Var, d dVar, AlertDialog alertDialog, View view) {
        a(e0Var, dVar.f9727f);
        alertDialog.dismiss();
    }

    public static boolean b(e0 e0Var) {
        d a = d.a(e0Var.d("json_remote_promo"));
        if (a == null || a.b(e0Var)) {
            return false;
        }
        if (!a.f9728g) {
            a.a(e0Var);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(e0Var);
        View inflate = e0Var.getLayoutInflater().inflate(o0.promo_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(n0.title);
        String str = a.f9723b;
        if (str != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(n0.promo_text);
        String str2 = a.f9724c;
        if (str2 != null) {
            textView2.setText(str2);
        } else {
            textView2.setVisibility(8);
        }
        ImageView imageView = (ImageView) inflate.findViewById(n0.imageView);
        if (a.f9725d != null) {
            try {
                t.b().a(a.f9725d).a(imageView);
            } catch (Exception e2) {
                imageView.setVisibility(8);
                e2.printStackTrace();
            }
        } else {
            imageView.setVisibility(8);
        }
        builder.setView(inflate);
        AlertDialog create = builder.create();
        if (a.f9728g) {
            create.setCancelable(false);
            inflate.findViewById(n0.not_interested).setVisibility(4);
        } else {
            inflate.findViewById(n0.not_interested).setOnClickListener(new a(create));
        }
        AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(n0.action);
        String str3 = a.f9726e;
        if (str3 == null || a.f9727f == null) {
            appCompatButton.setVisibility(8);
        } else {
            appCompatButton.setText(str3);
            appCompatButton.setOnClickListener(new b(e0Var, a, create));
        }
        create.show();
        return true;
    }
}
