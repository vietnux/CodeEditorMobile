package qwe.qweqwe.texteditor.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import c.h.l.e0;
import g.j;
import g.n;
import g.o.z;
import g.r.d.g;
import g.r.d.i;
import java.util.HashMap;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.m0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;

public final class k extends j {
    public static final a a0 = new a(null);
    private final HashMap<Integer, b> Z = z.a(j.a(1, new b(m0.ic_emoji_u1f393, q0.onboarding_q1_title, q0.onboarding_q1_o1, q0.onboarding_q1_o2, q0.onboarding_q1_o3)), j.a(2, new b(m0.ic_emoji_u1f9d1_1f3fb_200d_1f4bb, q0.onboarding_q2_title, q0.onboarding_q2_o1, q0.onboarding_q2_o2, q0.onboarding_q2_o3)), j.a(4, new b(m0.ic_emoji_u1f528, q0.onboarding_q3_title, q0.onboarding_q3_o1, q0.onboarding_q3_o2, q0.onboarding_q3_o3)));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final k a(int i2) {
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putInt("page_num", i2);
            n nVar = n.a;
            kVar.m(bundle);
            return kVar;
        }
    }

    public static final class b {
        private final int a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9778b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9779c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9780d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9781e;

        public b(int i2, int i3, int i4, int i5, int i6) {
            this.a = i2;
            this.f9778b = i3;
            this.f9779c = i4;
            this.f9780d = i5;
            this.f9781e = i6;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.f9779c;
        }

        public final int c() {
            return this.f9780d;
        }

        public final int d() {
            return this.f9781e;
        }

        public final int e() {
            return this.f9778b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.f9778b == bVar.f9778b && this.f9779c == bVar.f9779c && this.f9780d == bVar.f9780d && this.f9781e == bVar.f9781e;
        }

        public int hashCode() {
            return (((((((Integer.valueOf(this.a).hashCode() * 31) + Integer.valueOf(this.f9778b).hashCode()) * 31) + Integer.valueOf(this.f9779c).hashCode()) * 31) + Integer.valueOf(this.f9780d).hashCode()) * 31) + Integer.valueOf(this.f9781e).hashCode();
        }

        public String toString() {
            return "OnBoardingFragmentData(logo=" + this.a + ", title_id=" + this.f9778b + ", o1text=" + this.f9779c + ", o2text=" + this.f9780d + ", o3text=" + this.f9781e + ')';
        }
    }

    /* access modifiers changed from: private */
    public static final void b(int i2, k kVar, RadioGroup radioGroup, int i3) {
        i.c(kVar, "this$0");
        String obj = ((RadioButton) radioGroup.findViewById(i3)).getTag().toString();
        i0.a("OnBoardingFragment", "setSelectedTagAt " + i2 + ' ' + obj);
        kVar.a(i2, obj);
    }

    @Override // qwe.qweqwe.texteditor.ui.onboarding.j, androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        i.c(view, "view");
        super.a(view, bundle);
        Bundle k2 = k();
        n nVar = null;
        if (k2 != null) {
            int i2 = k2.getInt("page_num");
            b bVar = w0().get(Integer.valueOf(i2));
            i.a(bVar);
            ((ImageView) view.findViewById(n0.logo)).setImageResource(bVar.a());
            ((TextView) view.findViewById(n0.title)).setText(d(bVar.e()));
            ((RadioButton) view.findViewWithTag("option_1")).setText(d(bVar.b()));
            ((RadioButton) view.findViewWithTag("option_2")).setText(d(bVar.c()));
            ((RadioButton) view.findViewWithTag("option_3")).setText(d(bVar.d()));
            ((RadioButton) view.findViewWithTag("option_1")).setClipToOutline(true);
            ((RadioButton) view.findViewWithTag("option_2")).setClipToOutline(true);
            ((RadioButton) view.findViewWithTag("option_3")).setClipToOutline(true);
            RadioGroup radioGroup = (RadioGroup) view.findViewById(n0.radio);
            radioGroup.setOnCheckedChangeListener(new c(i2, this));
            String c2 = c(i2);
            i.b(radioGroup, "ratio");
            for (View view2 : e0.a(radioGroup)) {
                i0.a("OnBoardingFragment", "setSelectedTagAt " + i2 + ' ' + ((Object) c2));
                RadioButton radioButton = view2 instanceof RadioButton ? (RadioButton) view2 : null;
                if (radioButton != null) {
                    radioButton.setChecked(i.a(view2.getTag(), (Object) c2));
                }
            }
            nVar = n.a;
        }
        if (nVar == null) {
            i0.b("OnBoardingFragment", "page num is null");
        }
    }

    public final String d(int i2) {
        String a2 = a(i2);
        i.b(a2, "getString(id)");
        String a3 = a(q0.lang_name);
        i.b(a3, "getString(R.string.lang_name)");
        String str = g.v.n.a(a2, "%LANGNAME%", a3, false, 4, (Object) null);
        String a4 = a(q0.app_name);
        i.b(a4, "getString(R.string.app_name)");
        return g.v.n.a(str, "%APPNAME%", a4, false, 4, (Object) null);
    }

    @Override // qwe.qweqwe.texteditor.ui.onboarding.j
    public int v0() {
        return o0.onboarding_quiz;
    }

    public final HashMap<Integer, b> w0() {
        return this.Z;
    }
}
