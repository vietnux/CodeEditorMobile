package qwe.qweqwe.texteditor.z0;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.d;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;

public class a {
    private final e0 a;

    /* access modifiers changed from: package-private */
    /* renamed from: qwe.qweqwe.texteditor.z0.a$a  reason: collision with other inner class name */
    public class DialogInterface$OnClickListenerC0157a implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f9919b;

        DialogInterface$OnClickListenerC0157a(EditText editText) {
            this.f9919b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            String obj = this.f9919b.getText().toString();
            if (!obj.equals("")) {
                a.this.a(Integer.valueOf(obj).intValue());
            }
        }
    }

    public a(e0 e0Var) {
        this.a = e0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i2) {
        if (this.a.u.d() != null) {
            this.a.u.d().g(i2);
        }
    }

    public void a() {
        if (this.a.u.d() != null) {
            View inflate = this.a.getLayoutInflater().inflate(o0.dialog_go_to_line, (ViewGroup) null);
            d.a aVar = new d.a(this.a);
            aVar.b(this.a.getString(q0.go_to_line_dialog_title_lines) + " " + String.valueOf(this.a.u.d().L0()));
            aVar.b(inflate);
            aVar.a(true);
            aVar.c(this.a.getString(q0.dialog_go_to_line_positive_button_find), new DialogInterface$OnClickListenerC0157a((EditText) inflate.findViewById(n0.go_to_line_dialog_enter_line)));
            aVar.a().show();
        }
    }
}
