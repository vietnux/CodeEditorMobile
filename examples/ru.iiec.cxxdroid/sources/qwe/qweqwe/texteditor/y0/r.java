package qwe.qweqwe.texteditor.y0;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import com.getdirectory.GetFileActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder;
import qwe.qweqwe.texteditor.foldernav.h;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.u0.x;

public abstract class r {
    protected final e0 a;

    /* access modifiers changed from: private */
    public class a extends Exception {

        /* renamed from: b  reason: collision with root package name */
        private final String f9897b;

        a(r rVar, String str) {
            this.f9897b = str;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
        void a(m[] mVarArr);
    }

    protected interface c {
        void a(m[] mVarArr, String str);
    }

    protected class d {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9898b;

        public d(r rVar, String str, String str2) {
            this.a = str;
            this.f9898b = str2;
        }
    }

    /* access modifiers changed from: protected */
    public static class e {
        public final CharSequence a;

        /* renamed from: b  reason: collision with root package name */
        public final m[] f9899b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9900c;

        /* renamed from: d  reason: collision with root package name */
        private int f9901d = 0;

        public static class a extends m {

            /* renamed from: b  reason: collision with root package name */
            public boolean f9902b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f9903c;

            public a(String str, boolean z) {
                super(str);
                this.f9902b = z;
                this.f9903c = z;
            }
        }

        public static class b extends d {
            public b(String str, String str2, String str3) {
                super(str, str2, str3);
            }
        }

        public static class c extends d {

            /* renamed from: k  reason: collision with root package name */
            public final String f9904k;

            public c(String str) {
                super("File path", "$path", "");
                this.f9904k = str;
            }
        }

        public static class d extends m {

            /* renamed from: b  reason: collision with root package name */
            public final String f9905b;

            /* renamed from: c  reason: collision with root package name */
            public String f9906c;

            /* renamed from: d  reason: collision with root package name */
            public String f9907d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f9908e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f9909f = false;

            /* renamed from: g  reason: collision with root package name */
            public boolean f9910g = false;

            /* renamed from: h  reason: collision with root package name */
            public boolean f9911h = false;

            /* renamed from: i  reason: collision with root package name */
            public int f9912i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int f9913j = 0;

            public d(String str, String str2, String str3) {
                super(str);
                this.f9905b = str2;
                this.f9906c = str3;
                this.f9907d = str3;
            }

            public d a() {
                this.f9908e = true;
                return this;
            }

            public d a(int i2, int i3) {
                this.f9910g = true;
                this.f9912i = i2;
                this.f9913j = i3;
                return this;
            }

            public d b() {
                this.f9911h = true;
                return this;
            }

            public d c() {
                this.f9909f = true;
                return this;
            }
        }

        public e(CharSequence charSequence, String str) {
            this.a = charSequence;
            this.f9899b = new m[0];
            this.f9900c = str;
        }

        public e(CharSequence charSequence, String str, m[] mVarArr) {
            this.a = charSequence;
            this.f9899b = mVarArr;
            this.f9900c = str;
        }

        public String a() {
            m[] mVarArr = this.f9899b;
            String str = "new";
            for (m mVar : mVarArr) {
                if (mVar instanceof d) {
                    d dVar = (d) mVar;
                    if ("$name".equals(dVar.f9905b)) {
                        str = dVar.f9907d;
                    }
                }
            }
            return str;
        }

        public String a(String str) {
            return str;
        }

        public e a(int i2) {
            this.f9901d = i2;
            return this;
        }

        public final String b() {
            String str = this.f9900c;
            m[] mVarArr = this.f9899b;
            for (m mVar : mVarArr) {
                if (mVar instanceof d) {
                    d dVar = (d) mVar;
                    str = str.replace(dVar.f9905b, dVar.f9907d);
                }
            }
            return a(str);
        }
    }

    public r(e0 e0Var) {
        this.a = e0Var;
    }

    private String a(String str, String str2, String str3) {
        if (str2 == null) {
            return null;
        }
        if (str2.startsWith("/")) {
            return str2 + "/" + str3;
        }
        return str + "/" + str2 + "/" + str3;
    }

    static /* synthetic */ void a(e.d dVar, EditText editText, View view, boolean z) {
        if (z && dVar.f9910g) {
            dVar.f9910g = false;
            int length = editText.length() + 1;
            editText.setSelection((dVar.f9912i + length) % length, (dVar.f9913j + length) % length);
        }
    }

    private void a(e eVar, String str) {
        a(eVar, str, true);
    }

    private void a(e eVar, String str, boolean z) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                e0 e0Var = this.a;
                Toast.makeText(e0Var, e0Var.getString(q0.file_already_exists, new Object[]{file.getName()}), 1).show();
                return;
            }
        }
        if (eVar instanceof k) {
            try {
                new File(str).mkdirs();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            String b2 = eVar.b();
            int i2 = eVar.f9901d;
            this.a.a(str == null ? eVar.a() : c(str), b2, str, i2 < 0 ? b2.length() - (-i2) : i2, z);
        }
        h B = this.a.B();
        if (B != null) {
            B.a();
            try {
                this.a.e(8388613);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    private void a(m[] mVarArr, View view, boolean z) {
        for (m mVar : mVarArr) {
            View findViewWithTag = view.findViewWithTag(mVar);
            if (mVar instanceof e.d) {
                e.d dVar = (e.d) mVar;
                dVar.f9907d = ((EditText) findViewWithTag).getText().toString();
                if (z && dVar.f9908e && dVar.f9907d.isEmpty()) {
                    throw new a(this, this.a.getString(q0.bad_input_is_empty_mask, new Object[]{dVar.a}));
                }
            } else if (mVar instanceof e.a) {
                ((e.a) mVar).f9903c = ((CheckBox) findViewWithTag).isChecked();
            }
        }
    }

    private String c(String str) {
        return new File(str).getName();
    }

    /* access modifiers changed from: protected */
    public abstract e a();

    public /* synthetic */ void a(androidx.appcompat.app.d dVar, m[] mVarArr, LinearLayout linearLayout, int i2, m mVar, b bVar, View view) {
        Intent intent = new Intent(this.a, GetFileActivity.class);
        intent.putExtra("mode", "mode_pick_directory");
        dVar.dismiss();
        try {
            a(mVarArr, (View) linearLayout, false);
        } catch (Exception unused) {
        }
        m[] mVarArr2 = (m[]) Arrays.copyOf(mVarArr, mVarArr.length);
        for (m mVar2 : mVarArr2) {
            if (mVar2 instanceof e.d) {
                boolean z = mVar2 instanceof e.c;
                e.d dVar2 = (e.d) mVar2;
                dVar2.f9906c = dVar2.f9907d;
            }
            if (mVar2 instanceof e.a) {
                e.a aVar = (e.a) mVar2;
                aVar.f9902b = aVar.f9903c;
            }
        }
        int i3 = i2 + 30000;
        this.a.a(i3, new j(this, mVarArr2, mVar, bVar));
        this.a.startActivityForResult(intent, i3);
    }

    public abstract void a(File file);

    public abstract void a(IconTreeItemHolder.b bVar);

    public /* synthetic */ void a(c cVar, e eVar, m[] mVarArr) {
        try {
            cVar.a(mVarArr, eVar.b());
            x.a((Activity) this.a);
        } catch (Exception e2) {
            e2.printStackTrace();
            Toast.makeText(this.a, e2.getMessage(), 1).show();
        }
    }

    public void a(e eVar, c cVar) {
        a(eVar.f9899b, new e(this, cVar, eVar));
    }

    public /* synthetic */ void a(e eVar, String[] strArr, String str, m[] mVarArr) {
        String str2;
        m[] mVarArr2 = eVar.f9899b;
        for (m mVar : mVarArr2) {
            if (mVar instanceof e.c) {
                strArr[0] = str + "/" + ((e.c) mVar).f9907d;
            }
            if (mVar instanceof e.d) {
                e.d dVar = (e.d) mVar;
                if ("$package".equals(dVar.f9905b)) {
                    String str3 = str + "/src/";
                    if (strArr[0].startsWith(str3)) {
                        str2 = strArr[0].substring(str3.length());
                        int indexOf = str2.indexOf(47);
                        if (indexOf != -1) {
                            str2 = str2.substring(0, indexOf);
                        }
                    } else {
                        str2 = "main";
                    }
                    String str4 = dVar.f9907d;
                    if ("(default package)".equals(str4)) {
                        str4 = "";
                    }
                    strArr[0] = str3 + str2 + "/java/" + str4.replace('.', '/');
                }
            }
        }
        a(eVar, a(str, strArr[0], eVar.a()));
    }

    public /* synthetic */ void a(m[] mVarArr, LinearLayout linearLayout, b bVar, DialogInterface dialogInterface, int i2) {
        try {
            a(mVarArr, (View) linearLayout, true);
            bVar.a(mVarArr);
            new Handler().postDelayed(new c(this), 100);
        } catch (a e2) {
            Toast.makeText(this.a, e2.f9897b, 0).show();
        }
    }

    public /* synthetic */ void a(m[] mVarArr, m mVar, b bVar, int i2, Intent intent) {
        for (m mVar2 : mVarArr) {
            if (i2 == -1 && (mVar2 instanceof e.b) && mVar2.a.equals(mVar.a)) {
                ((e.b) mVar2).f9906c = intent.getStringExtra("extra_file_dir");
            }
        }
        a(mVarArr, bVar);
    }

    public void a(m[] mVarArr, b bVar) {
        m[] mVarArr2 = mVarArr;
        d.a aVar = new d.a(this.a);
        LayoutInflater layoutInflater = this.a.getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(o0.dialog_template_fields, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(n0.ll);
        aVar.b(viewGroup);
        aVar.b(q0.create, new i(this, mVarArr2, linearLayout, bVar));
        androidx.appcompat.app.d a2 = aVar.a();
        boolean z = false;
        int i2 = 0;
        while (i2 < mVarArr2.length) {
            m mVar = mVarArr2[i2];
            if (mVar instanceof e.d) {
                e.d dVar = (e.d) mVar;
                boolean z2 = mVar instanceof e.b;
                View inflate = layoutInflater.inflate(z2 ? o0.dialog_template_fields_element_folder : o0.dialog_template_fields_element, linearLayout, z);
                linearLayout.addView(inflate);
                ((TextView) inflate.findViewById(n0.text_view)).setText(mVar.a);
                EditText editText = (EditText) inflate.findViewById(n0.edit_text);
                editText.setSelectAllOnFocus(dVar.f9909f);
                editText.setText(dVar.f9906c);
                if (dVar.f9911h) {
                    editText.setSelection(editText.length());
                }
                if (dVar.f9910g) {
                    editText.setOnFocusChangeListener(new h(dVar, editText));
                }
                if (mVar instanceof e.c) {
                    editText.setHint(q0.path_field_hint);
                }
                editText.setTag(mVar);
                if (z2) {
                    inflate.findViewById(n0.folder_button).setOnClickListener(new f(this, a2, mVarArr, linearLayout, i2, mVar, bVar));
                }
            } else if (mVar instanceof e.a) {
                View inflate2 = layoutInflater.inflate(o0.dialog_template_fields_element_bool, (ViewGroup) linearLayout, false);
                linearLayout.addView(inflate2);
                CheckBox checkBox = (CheckBox) inflate2.findViewById(n0.checkbox);
                checkBox.setText(mVar.a);
                checkBox.setChecked(((e.a) mVar).f9902b);
                checkBox.setTag(mVar);
                i2++;
                mVarArr2 = mVarArr;
                z = false;
            }
            i2++;
            mVarArr2 = mVarArr;
            z = false;
        }
        try {
            a2.getWindow().setSoftInputMode(4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        a2.show();
    }

    public void a(d[] dVarArr) {
        String str;
        m[] mVarArr;
        int i2;
        d[] dVarArr2 = dVarArr;
        String[] strArr = {null};
        for (d dVar : dVarArr2) {
            if ("$path".equals(dVar.a)) {
                strArr[0] = dVar.f9898b;
            }
        }
        try {
            str = this.a.y().F0().getParentFile().getAbsolutePath();
        } catch (Exception unused) {
            str = null;
        }
        if (this.a.y().P0()) {
            d.a aVar = new d.a(this.a);
            e[] a2 = a(strArr[0]);
            int length = a2.length;
            int i3 = 0;
            while (i3 < length) {
                m[] mVarArr2 = a2[i3].f9899b;
                int length2 = mVarArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    m mVar = mVarArr2[i4];
                    if (mVar instanceof e.d) {
                        e.d dVar2 = (e.d) mVar;
                        int length3 = dVarArr2.length;
                        int i5 = 0;
                        while (i5 < length3) {
                            d dVar3 = dVarArr2[i5];
                            if (!dVar2.f9905b.equals(dVar3.a)) {
                                i2 = length;
                                mVarArr = mVarArr2;
                            } else if (dVar2 instanceof e.c) {
                                String str2 = dVar3.f9898b;
                                e.c cVar = (e.c) dVar2;
                                String str3 = cVar.f9904k;
                                i2 = length;
                                mVarArr = mVarArr2;
                                if (str2.length() > str.length()) {
                                    str3 = str2.substring(str.length() + 1, str2.length()) + "/" + cVar.f9904k;
                                }
                                dVar2.f9906c = str3;
                            } else {
                                i2 = length;
                                mVarArr = mVarArr2;
                                dVar2.f9906c = dVar3.f9898b;
                            }
                            i5++;
                            dVarArr2 = dVarArr;
                            length = i2;
                            mVarArr2 = mVarArr;
                        }
                    }
                    i4++;
                    dVarArr2 = dVarArr;
                    length = length;
                    mVarArr2 = mVarArr2;
                }
                i3++;
                dVarArr2 = dVarArr;
            }
            ArrayList arrayList = new ArrayList();
            for (e eVar : a2) {
                arrayList.add(eVar.a);
            }
            aVar.a((CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]), new d(this, a2, strArr, str));
            aVar.c();
            return;
        }
        a(a(), (String) null, false);
    }

    public /* synthetic */ void a(e[] eVarArr, String[] strArr, String str, DialogInterface dialogInterface, int i2) {
        e eVar = eVarArr[i2];
        m[] mVarArr = eVar.f9899b;
        if (mVarArr.length > 0) {
            a(mVarArr, new g(this, eVar, strArr, str));
        } else {
            a(eVar, a(str, strArr[0], eVar.a()));
        }
    }

    /* access modifiers changed from: protected */
    public abstract e[] a(String str);

    /* access modifiers changed from: protected */
    public String b(String str) {
        String str2 = qwe.qweqwe.texteditor.v0.a.f(this.a) + str;
        if (!new File(str2).exists()) {
            return str2;
        }
        for (int i2 = 2; i2 < 99999; i2++) {
            String str3 = str2 + "-" + i2;
            if (!new File(str3).exists()) {
                return str3;
            }
        }
        return str2;
    }

    public /* synthetic */ void b() {
        try {
            x.a((Activity) this.a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c() {
        a(a(), (String) null, false);
    }
}
