package qwe.qweqwe.texteditor.z0;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.d;
import c.a.o.b;
import java.util.ArrayList;
import java.util.regex.Pattern;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.p0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.y0.p;

public class b {
    e0 a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9921b;

    /* renamed from: c  reason: collision with root package name */
    private String f9922c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f9923d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f9924e = "";

    /* renamed from: f  reason: collision with root package name */
    private b.a f9925f = new a();

    class a implements b.a {
        a() {
        }

        @Override // c.a.o.b.a
        public void a(c.a.o.b bVar) {
            b.this.a.u.a();
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, Menu menu) {
            b.this.a.u.f9881c.setVisibility(8);
            return false;
        }

        @Override // c.a.o.b.a
        public boolean a(c.a.o.b bVar, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == n0.action_search_jump_forward) {
                b.this.a(1);
                return true;
            } else if (itemId == n0.action_search_jump_backward) {
                b.this.a(-1);
                return true;
            } else if (itemId != n0.action_search_replace_selected) {
                return false;
            } else {
                b.this.b();
                return true;
            }
        }

        @Override // c.a.o.b.a
        public boolean b(c.a.o.b bVar, Menu menu) {
            bVar.d().inflate(p0.editor_search_action_mode, menu);
            if (b.this.f9923d) {
                return true;
            }
            menu.findItem(n0.action_search_replace_selected).setVisible(false);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: qwe.qweqwe.texteditor.z0.b$b  reason: collision with other inner class name */
    public class DialogInterface$OnClickListenerC0158b implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f9926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f9927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CheckBox f9928d;

        DialogInterface$OnClickListenerC0158b(EditText editText, EditText editText2, CheckBox checkBox) {
            this.f9926b = editText;
            this.f9927c = editText2;
            this.f9928d = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            String obj = this.f9926b.getText().toString();
            String obj2 = this.f9927c.getText().toString();
            boolean isChecked = this.f9928d.isChecked();
            if (!obj2.equals("")) {
                b.this.b(obj2, obj, isChecked);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f9930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CheckBox f9931c;

        c(EditText editText, CheckBox checkBox) {
            this.f9930b = editText;
            this.f9931c = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            String obj = this.f9930b.getText().toString();
            boolean isChecked = this.f9931c.isChecked();
            if (!obj.equals("")) {
                b.this.a(obj, isChecked);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f9933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EditText f9934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CheckBox f9935d;

        d(EditText editText, EditText editText2, CheckBox checkBox) {
            this.f9933b = editText;
            this.f9934c = editText2;
            this.f9935d = checkBox;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            String obj = this.f9933b.getText().toString();
            b.this.a((b) this.f9934c.getText().toString(), obj, (String) this.f9935d.isChecked());
        }
    }

    public b(e0 e0Var) {
        this.a = e0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str, String str2, boolean z) {
        String str3;
        p d2 = this.a.u.d();
        String I0 = d2.I0();
        if (z) {
            str3 = I0.replace(str, str2);
        } else {
            str3 = I0.replaceAll("(?i)" + Pattern.quote(str), str2);
        }
        d2.e(str3);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(String str, boolean z) {
        this.f9921b = z;
        this.f9922c = str;
        if (!str.equals("")) {
            String J0 = this.a.u.d().J0();
            if (!z) {
                J0 = J0.toLowerCase();
                str = str.toLowerCase();
            }
            ArrayList arrayList = new ArrayList();
            for (int indexOf = J0.indexOf(str); indexOf != -1; indexOf = J0.indexOf(str, indexOf + 1)) {
                arrayList.add(Integer.valueOf(indexOf));
            }
            if (arrayList.isEmpty()) {
                Context baseContext = this.a.getBaseContext();
                Toast.makeText(baseContext, this.a.getString(q0.search_toast_no_matches) + str, 0).show();
                return;
            }
            Context baseContext2 = this.a.getBaseContext();
            Toast.makeText(baseContext2, String.valueOf(arrayList.size()) + " " + this.a.getString(q0.search_toast_N_matches) + str, 0).show();
            a(1);
            this.a.b(this.f9925f);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b() {
        int x0 = this.a.u.d().x0();
        String J0 = this.a.u.d().J0();
        if (this.f9922c.length() + x0 <= J0.length() && J0.substring(x0, this.f9922c.length() + x0).equals(this.f9922c)) {
            this.a.u.d().a(x0, this.f9922c.length() + x0, this.f9924e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(String str, String str2, boolean z) {
        this.f9924e = str2;
        this.f9923d = true;
        a(str, z);
    }

    public void a() {
        if (this.a.u.d() != null) {
            View inflate = this.a.getLayoutInflater().inflate(o0.dialog_search_replace, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(n0.search_dialog_search);
            EditText editText2 = (EditText) inflate.findViewById(n0.search_dialog_replace);
            CheckBox checkBox = (CheckBox) inflate.findViewById(n0.search_dialog_checkbox_MatchCase);
            d.a aVar = new d.a(this.a);
            aVar.b(this.a.getString(q0.search_dialog_title));
            aVar.b(inflate);
            aVar.a(true);
            aVar.a(this.a.getString(q0.search_dialog_negative_button_replace), new DialogInterface$OnClickListenerC0158b(editText2, editText, checkBox));
            aVar.c(this.a.getString(q0.search_dialog_positive_button_find), new c(editText, checkBox));
            aVar.b(this.a.getString(q0.search_dialog_neutral_button_replace_all), new d(editText2, editText, checkBox));
            aVar.a().show();
        }
    }

    public void a(int i2) {
        p d2 = this.a.u.d();
        d2.g0.o();
        int x0 = d2.x0();
        String J0 = d2.J0();
        String str = this.f9922c;
        if (!this.f9921b) {
            J0 = J0.toLowerCase();
            str = str.toLowerCase();
        }
        int indexOf = i2 == 1 ? J0.indexOf(str, x0 + 1) : x0;
        if (i2 == -1) {
            indexOf = J0.lastIndexOf(str, x0 - 1);
        }
        if (indexOf != -1) {
            d2.e(indexOf);
        }
    }
}
