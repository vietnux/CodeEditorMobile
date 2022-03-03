package qwe.qweqwe.texteditor.w0;

import android.preference.PreferenceManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.d.a.a.b;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.l0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.q0;

public class b {
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f9790b;

    /* renamed from: c  reason: collision with root package name */
    String[] f9791c = {"\t", ":", "'", "#", "(", ")", "{", "}", "=", "<", ">", "-", "+", "*", "/", "^", "%", "$", "|", "!", "?", "_", " "};

    /* access modifiers changed from: package-private */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9792b;

        a(String str) {
            this.f9792b = str;
        }

        public void onClick(View view) {
            b.this.a(this.f9792b);
        }
    }

    public b(e0 e0Var) {
        this.a = e0Var;
    }

    private String[] b() {
        String[] split = PreferenceManager.getDefaultSharedPreferences(this.a).getString("editor_btn_bar_btns", this.a.getString(q0.editor_btn_bar_default_value)).split(" ");
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].equals("\\t")) {
                split[i2] = "\t";
            }
            if (split[i2].equals("\\n")) {
                split[i2] = "\n";
            }
            if (split[i2].equals("\\r")) {
                split[i2] = "\r";
            }
        }
        return split;
    }

    public void a() {
        this.f9790b = (LinearLayout) this.a.findViewById(n0.scrollButtonBar);
        LinearLayout linearLayout = this.f9790b;
        if (linearLayout != null) {
            if (this.a.t.f9690e || linearLayout == null) {
                e0 e0Var = this.a;
                if (e0Var.t.f9690e && this.f9790b != null) {
                    float f2 = e0Var.getResources().getDisplayMetrics().density;
                    if (this.f9790b.getChildCount() > 0) {
                        this.f9790b.removeAllViews();
                    }
                    this.f9791c = b();
                    int i2 = 0;
                    while (true) {
                        String[] strArr = this.f9791c;
                        if (i2 < strArr.length) {
                            String str = strArr[i2];
                            TextView textView = new TextView(this.a);
                            if (str.equals("\t")) {
                                textView.setText("Tab");
                            } else {
                                textView.setText(str);
                            }
                            textView.setTypeface(this.a.t.f9687b);
                            textView.setTextColor(this.a.t.f9688c.a(b.a.FOREGROUND));
                            textView.setBackgroundColor(c.h.d.a.a(this.a, l0.colorPrimary));
                            textView.setTextColor(c.h.d.a.a(this.a, l0.default_white));
                            textView.setMinWidth((int) (64.0f * f2));
                            textView.setHeight((int) (32.0f * f2));
                            textView.setGravity(17);
                            int i3 = (int) (5.0f * f2);
                            int i4 = (int) (3.0f * f2);
                            textView.setPadding(i3, i4, i3, i4);
                            textView.setOnClickListener(new a(str));
                            this.f9790b.addView(textView);
                            i2++;
                        } else {
                            this.f9790b.setVisibility(0);
                            return;
                        }
                    }
                }
            } else {
                linearLayout.setVisibility(8);
            }
        }
    }

    public void a(String str) {
        if (this.a.u.d() != null) {
            try {
                for (char c2 : str.toCharArray()) {
                    this.a.u.d().g0.f6717f.a(c2);
                }
            } catch (Exception unused) {
            }
        }
    }
}
