package qwe.qweqwe.texteditor.u0;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.d;
import l.a.b;
import qwe.qweqwe.texteditor.q0;

public class a0 {
    private static Float a;

    public static int a(Context context, int i2) {
        if (a == null) {
            a = Float.valueOf(context.getResources().getDisplayMetrics().density);
        }
        return (int) ((((float) i2) * a.floatValue()) + 0.5f);
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String str, int i2) {
        if (str == null) {
            return spannableStringBuilder;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i2), 0, spannableString.length(), 0);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public static void a(Activity activity, b bVar, int i2) {
        a(activity, bVar, activity.getString(i2));
    }

    public static void a(Activity activity, b bVar, String str) {
        d.a aVar = new d.a(activity);
        aVar.a(str);
        aVar.b(q0.dialog_allow, new t(bVar));
        aVar.a(q0.dialog_deny, new s(bVar));
        aVar.c();
    }
}
