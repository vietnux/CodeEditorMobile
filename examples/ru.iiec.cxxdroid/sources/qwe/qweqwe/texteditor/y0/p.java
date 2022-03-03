package qwe.qweqwe.texteditor.y0;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.myopicmobile.textwarrior.android.FreeScrollingTextField;
import e.d.a.a.b;
import e.d.a.a.c;
import e.d.a.a.e;
import e.d.a.a.f;
import e.d.a.a.g;
import e.d.a.a.h;
import e.d.a.a.i;
import e.d.a.a.j;
import e.d.a.a.k0;
import e.d.a.a.m;
import e.d.a.a.q0;
import e.d.a.a.y;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.l0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.w0.d.d;

public class p extends Fragment {
    private static HashMap<String, File> t0 = new HashMap<>();
    public boolean Z = false;
    public String a0 = null;
    public int b0;
    public ArrayList<Integer> c0 = new ArrayList<>();
    public ArrayList<Integer> d0 = new ArrayList<>();
    public ArrayList<Integer> e0 = new ArrayList<>();
    public HashMap<Integer, ArrayList<d>> f0;
    public FreeScrollingTextField g0;
    public boolean h0;
    Typeface i0;
    int j0;
    private String k0;
    private String l0;
    private int m0;
    private String n0;
    private int o0;
    private boolean p0;
    private boolean q0;
    private Handler r0;
    private m s0;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            FreeScrollingTextField freeScrollingTextField = p.this.g0;
            freeScrollingTextField.p = 0;
            freeScrollingTextField.l();
            FreeScrollingTextField freeScrollingTextField2 = p.this.g0;
            freeScrollingTextField2.scrollTo(0, freeScrollingTextField2.getScrollY());
        }
    }

    public p() {
        new ArrayList();
        this.f0 = new HashMap<>();
        this.p0 = false;
        this.q0 = true;
        this.s0 = y.e();
    }

    private void W0() {
        Typeface typeface = Typeface.SANS_SERIF;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f());
        String string = defaultSharedPreferences.getString("editor_font", "sans-serif");
        if (string.equals("sans-serif")) {
            typeface = Typeface.SANS_SERIF;
        } else if (string.equals("serif")) {
            typeface = Typeface.SERIF;
        } else if (string.equals("monospace")) {
            typeface = Typeface.MONOSPACE;
        } else if (string.equals("default")) {
            typeface = Typeface.DEFAULT;
        } else if (string.equals("default-bold")) {
            typeface = Typeface.DEFAULT_BOLD;
        }
        a(typeface, Integer.valueOf(defaultSharedPreferences.getString("editor_font_size", "16")).intValue());
        q(defaultSharedPreferences.getBoolean("editor_word_wrap", true));
        p(defaultSharedPreferences.getBoolean("editor_tab_insert_spaces", false));
        n(defaultSharedPreferences.getBoolean("editor_allow_suggestions", false));
        this.g0.setTabSpaces(Integer.valueOf(defaultSharedPreferences.getString("editor_tab_length", "4")).intValue());
        b dVar = new e.d.a.a.d();
        String string2 = (E().getColor(l0.menu_icon) & 16777215) == 0 ? defaultSharedPreferences.getString("appearance_editor_theme", "light") : defaultSharedPreferences.getString("appearance_editor_theme_dark", "dark");
        if (string2.equals("light")) {
            dVar = new e.d.a.a.d();
        }
        if (string2.equals("dark")) {
            dVar = new c();
        }
        if (string2.equals("monokai")) {
            dVar = new e();
        }
        if (string2.equals("obsidian")) {
            dVar = new f();
        }
        if (string2.equals("solarized_light")) {
            dVar = new h();
        }
        if (string2.equals("solarized_dark")) {
            dVar = new g();
        }
        this.g0.setColorScheme(dVar);
        this.g0.setUseBraceComplete(defaultSharedPreferences.getBoolean("editor_autoinsert_braces", true));
    }

    private void d(m mVar) {
        StringBuilder sb = new StringBuilder(I0().substring(this.g0.getSelectionStart(), this.g0.getSelectionEnd()));
        int length = sb.length();
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            char charAt = sb.charAt(i2);
            char charAt2 = i2 < sb.length() - 1 ? sb.charAt(i2 + 1) : 0;
            if (charAt == '\n') {
                z = false;
            } else if (!z) {
                if (!mVar.e(charAt) && !mVar.a(charAt, charAt2)) {
                    sb.insert(i2, mVar.c());
                    length += mVar.c().length();
                    i2 += mVar.c().length();
                }
                z = true;
            }
            i2++;
        }
        this.g0.f6717f.j();
        this.g0.a(sb.toString());
    }

    private void e(m mVar) {
        String substring = I0().substring(this.g0.getSelectionStart(), this.g0.getSelectionEnd());
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        boolean z = false;
        while (i2 < substring.length()) {
            char charAt = substring.charAt(i2);
            char charAt2 = i2 < substring.length() - 1 ? substring.charAt(i2 + 1) : 0;
            if (mVar.e(charAt) || mVar.a(charAt, charAt2)) {
                if (!z) {
                    linkedList.add(Integer.valueOf(i2));
                    if (mVar.a(charAt, charAt2)) {
                        linkedList.add(Integer.valueOf(i2 + 1));
                    }
                }
                z = true;
            } else if (charAt == '\n') {
                z = false;
            }
            i2++;
        }
        this.g0.f6717f.j();
        StringBuilder sb = new StringBuilder(substring);
        for (int size = linkedList.size() - 1; size >= 0; size--) {
            sb.deleteCharAt(((Integer) linkedList.get(size)).intValue());
        }
        this.g0.a(sb.toString());
    }

    public boolean A0() {
        return this.p0;
    }

    public e0 B0() {
        return (e0) f();
    }

    @Deprecated
    public String C0() {
        return this.n0;
    }

    public m D0() {
        return this.s0;
    }

    public HashMap<Integer, ArrayList<d>> E0() {
        return this.f0;
    }

    public File F0() {
        HashMap<String, File> hashMap = t0;
        String C0 = C0();
        if (hashMap.containsKey(C0)) {
            return hashMap.get(C0);
        }
        File b2 = B0().b(C0);
        hashMap.put(C0, b2);
        return b2;
    }

    public int G0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        return freeScrollingTextField != null ? freeScrollingTextField.getScrollY() : this.o0;
    }

    public int H0() {
        return this.b0;
    }

    public String I0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField == null) {
            return this.l0;
        }
        try {
            return new q0(null, freeScrollingTextField.e(), "UTF-8", "Auto").a();
        } catch (Exception unused) {
            return "";
        }
    }

    public String J0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField == null) {
            return this.l0;
        }
        try {
            return new q0(null, freeScrollingTextField.e(), "UTF-8", "Unix").a();
        } catch (Exception unused) {
            return "";
        }
    }

    public String K0() {
        return this.k0;
    }

    public int L0() {
        return d(I0().length())[0];
    }

    public String M0() {
        return qwe.qweqwe.texteditor.v0.a.a(C0());
    }

    public boolean N0() {
        return this.q0;
    }

    public boolean O0() {
        return this.p0;
    }

    public boolean P0() {
        return F0() != null;
    }

    public /* synthetic */ void Q0() {
        this.g0.l();
        FreeScrollingTextField freeScrollingTextField = this.g0;
        freeScrollingTextField.scrollTo(0, freeScrollingTextField.getScrollY());
    }

    public void R0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.j();
        }
    }

    public void S0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.k();
        }
    }

    public void T0() {
        this.g0.n();
    }

    public void U0() {
        if (C0() != null) {
            try {
                f(qwe.qweqwe.texteditor.x0.a.a(this.n0));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void V0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setTypeface(this.i0);
            this.g0.setZoom((float) this.j0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
    }

    public int a(int i2, int i3) {
        i0.a("scrollSet", "line:" + String.valueOf(i2) + "offset:" + String.valueOf(i3));
        String v0 = v0();
        int i4 = 1;
        int i5 = 0;
        while (i5 < v0.length() && i2 > i4) {
            if (v0.charAt(i5) == '\n') {
                i4++;
            }
            i5++;
        }
        return i5 + i3;
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d0.add(1);
        this.e0.add(2);
        i0.c("TabFragment", "onCreateView");
        View inflate = layoutInflater.inflate(o0.editor_tab_fragment, viewGroup, false);
        this.g0 = (FreeScrollingTextField) inflate.findViewById(n0.fstfedt);
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setNavigationMethod(new com.myopicmobile.textwarrior.android.d(freeScrollingTextField));
            this.g0.setLongPressCaps(false);
            this.g0.setVerticalScrollBarEnabled(true);
            this.g0.setTabSpaces(4);
            this.g0.setZoom(16.0f);
            this.g0.setLanguage(this.s0);
        }
        if (bundle != null) {
            this.l0 = o.a(bundle, "text_key");
            this.m0 = bundle.getInt("carriage_pos_key");
            this.o0 = bundle.getInt("scroll_pos_key");
            this.k0 = bundle.getString("title_key");
            this.p0 = bundle.getBoolean("has_changes_key");
            this.Z = bundle.getBoolean("ever_edited_key");
            this.a0 = bundle.getString("fake_file_path_key");
            this.s0 = m.b(bundle.getString("language_name_key"));
        }
        f(this.l0);
        e(this.m0);
        h(this.o0);
        W0();
        return inflate;
    }

    public void a(int i2, int i3, String str) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        freeScrollingTextField.A = false;
        freeScrollingTextField.f6717f.a(i2, i3 - i2, false);
        c(str);
        this.g0.A = true;
    }

    public void a(Typeface typeface, int i2) {
        this.j0 = i2;
        this.i0 = typeface;
        V0();
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public void a(String str, String str2, String str3, int i2, int i3, int i4, boolean z, boolean z2) {
        h(str);
        f(str2);
        g(str3);
        e(i2);
        h(i3);
        i(i4);
        this.p0 = z;
        this.Z = z2;
        this.a0 = null;
    }

    public void a(HashMap<Integer, ArrayList<d>> hashMap) {
        this.f0 = hashMap;
    }

    public boolean a(m mVar) {
        String I0 = I0();
        int selectionStart = this.g0.getSelectionStart();
        boolean z = false;
        while (selectionStart < this.g0.getSelectionEnd()) {
            char charAt = I0.charAt(selectionStart);
            char charAt2 = selectionStart < this.g0.getSelectionEnd() - 1 ? I0.charAt(selectionStart + 1) : 0;
            if (mVar.e(charAt) || mVar.a(charAt, charAt2)) {
                z = true;
            } else if (charAt == '\n') {
                z = false;
            } else if (!(z || charAt == ' ' || charAt == '\t')) {
                i0.a("commenting", "can't uncommnent");
                return false;
            }
            selectionStart++;
        }
        i0.a("commenting", "can uncommnent");
        return true;
    }

    public void b(int i2, int i3) {
        e(a(i2, i3));
    }

    public void b(m mVar) {
        if (a(mVar)) {
            e(mVar);
        } else {
            d(mVar);
        }
    }

    public int[] b(String str) {
        int i2;
        int i3;
        try {
            int x0 = x0();
            i3 = this.g0.f6716e.b(x0) + 1;
            int x02 = x0() - 1;
            while (true) {
                if (x02 < 0) {
                    i2 = x0;
                    break;
                } else if (str.charAt(x02) == '\n') {
                    i2 = (x0() - 1) - x02;
                    break;
                } else {
                    x02--;
                }
            }
        } catch (Exception unused) {
            i2 = 0;
            i3 = 1;
        }
        return new int[]{i3, i2};
    }

    public void c(int i2) {
        if (this.c0.contains(Integer.valueOf(i2))) {
            this.c0.remove(new Integer(i2));
        } else {
            this.c0.add(Integer.valueOf(i2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        this.r0 = new Handler();
        if (bundle != null) {
            this.l0 = o.a(bundle, "text_key");
            this.n0 = bundle.getString("file_path_key");
            this.m0 = bundle.getInt("carriage_pos_key");
            this.o0 = bundle.getInt("scroll_pos_key");
        }
    }

    public void c(m mVar) {
        boolean z = this.s0 != mVar;
        this.s0 = mVar;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setLanguage(mVar);
            if (z) {
                this.g0.l();
            }
        }
    }

    public void c(String str) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.a(str);
        }
    }

    public void d(String str) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (!(freeScrollingTextField == null || str == null)) {
            char[] a2 = freeScrollingTextField.f6716e.f8226b.a(freeScrollingTextField.getCaretPosition(), str.length());
            String valueOf = String.valueOf(a2, 0, a2.length - 1);
            for (int length = valueOf.length(); length >= 1; length--) {
                if (valueOf.substring(0, length).equals(str.substring(str.length() - length))) {
                    this.g0.a(str.substring(0, str.length() - length));
                    FreeScrollingTextField freeScrollingTextField2 = this.g0;
                    freeScrollingTextField2.h(freeScrollingTextField2.getCaretPosition() + length);
                    return;
                }
            }
            this.g0.a(str);
        }
    }

    public int[] d(int i2) {
        String I0 = I0();
        int i3 = -1;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            if (I0.charAt(i5) == '\n') {
                i4++;
                i3 = i5;
            }
        }
        return new int[]{i4, i2 - i3};
    }

    @Override // androidx.fragment.app.Fragment
    public void d0() {
        super.d0();
        if (this.g0 != null) {
            w0();
            W0();
        }
    }

    public void e(int i2) {
        this.m0 = i2;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null && freeScrollingTextField.getCaretPosition() != i2) {
            this.g0.a(false);
            this.g0.h(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        o.a(m(), bundle, "text_key", I0());
        bundle.putInt("carriage_pos_key", x0());
        bundle.putString("file_path_key", this.n0);
        bundle.putInt("scroll_pos_key", G0());
        bundle.putString("title_key", this.k0);
        bundle.putBoolean("has_changes_key", this.p0);
        bundle.putBoolean("ever_edited_key", this.Z);
        bundle.putString("fake_file_path_key", this.a0);
        bundle.putString("language_name_key", this.s0.getClass().getName());
    }

    public void e(String str) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        freeScrollingTextField.A = false;
        freeScrollingTextField.f6717f.a(0, v0().length(), false);
        c(str);
        this.g0.A = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        super.e0();
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setNavigationMethod(new com.myopicmobile.textwarrior.android.d(freeScrollingTextField));
            this.g0.setLongPressCaps(false);
            this.g0.setVerticalScrollBarEnabled(true);
            this.g0.setTabSpaces(4);
            this.g0.setZoom(16.0f);
            this.g0.setLanguage(this.s0);
        }
    }

    public void f(int i2) {
        this.m0 = i2;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null && freeScrollingTextField.getCaretPosition() != i2) {
            this.g0.i(i2);
            this.g0.scrollTo(0, 0);
        }
    }

    public void f(String str) {
        this.l0 = str;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            try {
                i iVar = new i(freeScrollingTextField);
                iVar.a(N0());
                new k0(null, iVar, "UTF-8", "Auto").a(str);
                this.g0.setDocumentProvider(new j(iVar, this.g0));
                this.g0.f6717f.k();
                this.g0.q();
                this.r0.postDelayed(new a(this), 100);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void g(int i2) {
        b(i2, 0);
    }

    public void g(String str) {
        this.n0 = str;
    }

    public void h(int i2) {
        this.o0 = i2;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.scrollTo(0, i2);
        }
    }

    public void h(String str) {
        this.k0 = str;
    }

    public void i(int i2) {
        this.b0 = i2;
    }

    public void l(boolean z) {
        m(z);
    }

    public void m(boolean z) {
        j e2 = this.g0.e();
        if ((e2.d() && z) || (e2.c() && !z)) {
            int q = z ? e2.q() : e2.p();
            if (q < 0) {
                q = 0;
            }
            if (q >= 0) {
                this.g0.l();
                this.g0.a(false);
                this.g0.h(q);
                this.g0.invalidate();
                this.g0.f6717f.k();
            }
        }
    }

    public void n(boolean z) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setAllowSuggestions(z);
        }
    }

    public void o(boolean z) {
        this.p0 = z;
        if (z) {
            this.Z = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.g0 != null) {
            w0();
        }
    }

    public void p(boolean z) {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setTabInsertsSpaces(z);
        }
    }

    public void q(boolean z) {
        this.q0 = z;
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField != null) {
            freeScrollingTextField.setHorizontalScrollBarEnabled(!z);
            this.g0.e().a(z);
        }
    }

    public String v0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        if (freeScrollingTextField == null) {
            return this.l0;
        }
        char[] a2 = freeScrollingTextField.f6716e.f8226b.a(0, Integer.MAX_VALUE);
        return String.valueOf(a2, 0, a2.length - 1);
    }

    public void w0() {
        if (this.g0 != null) {
            this.r0.postDelayed(new a(), 100);
        }
    }

    public int x0() {
        FreeScrollingTextField freeScrollingTextField = this.g0;
        return freeScrollingTextField != null ? freeScrollingTextField.getCaretPosition() : this.m0;
    }

    public int[] y0() {
        int[] b2 = b(v0());
        return new int[]{b2[0], b2[1], L0()};
    }

    public int[] z0() {
        int i2;
        int i3;
        String v0 = v0();
        try {
            int x0 = x0();
            i2 = this.g0.f6716e.b(x0) + 1;
            int x02 = x0() - 1;
            while (true) {
                if (x02 < 0) {
                    i3 = x0;
                    break;
                } else if (v0.charAt(x02) == '\n') {
                    i3 = (x0() - 1) - x02;
                    break;
                } else {
                    x02--;
                }
            }
        } catch (Exception unused) {
            i3 = 0;
            i2 = 1;
        }
        return new int[]{i2, i3};
    }
}
