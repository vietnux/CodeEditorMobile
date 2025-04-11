package qwe.qweqwe.texteditor.x0;

import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.widget.Toast;
import androidx.appcompat.app.d;
import e.a.a.a.e.b;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.q0;

public class c {
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    private String f9844b;

    /* renamed from: c  reason: collision with root package name */
    private String f9845c;

    /* renamed from: d  reason: collision with root package name */
    private String f9846d;

    /* access modifiers changed from: package-private */
    public class a extends AsyncTask<Void, Void, Void> {
        e.a.a.a.e.b<String> a;

        /* access modifiers changed from: package-private */
        /* renamed from: qwe.qweqwe.texteditor.x0.c$a$a  reason: collision with other inner class name */
        public class DialogInterface$OnClickListenerC0156a implements DialogInterface.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f9848b;

            DialogInterface$OnClickListenerC0156a(String str) {
                this.f9848b = str;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                e0 e0Var = c.this.a;
                e0 unused = c.this.a;
                ((ClipboardManager) e0Var.getSystemService("clipboard")).setText(this.f9848b);
                Toast.makeText(c.this.a, c.this.a.getString(q0.pastebin_url_was_copied), 0).show();
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements DialogInterface.OnClickListener {
            b(a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
            }
        }

        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            this.a = c.this.a();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void r6) {
            e.a.a.a.e.b<String> bVar = this.a;
            if (bVar == null) {
                return;
            }
            if (bVar.a()) {
                e0 e0Var = c.this.a;
                Toast.makeText(e0Var, c.this.a.getString(q0.pastebin_post_error) + this.a.b(), 0).show();
                return;
            }
            String str = this.a.get();
            d.a aVar = new d.a(c.this.a);
            aVar.a(c.this.a.getString(q0.pastebin_load) + "\nUrl: " + str);
            aVar.a(false);
            aVar.b(q0.pastebin_copy_url, new DialogInterface$OnClickListenerC0156a(str));
            aVar.b(c.this.a.getString(q0.re_turn), new b(this));
            aVar.c();
            i0.a("PasteBin", "Paste published! Url: " + str);
        }
    }

    public c(e0 e0Var) {
        this.a = e0Var;
    }

    public b<String> a() {
        e.a.a.a.b.b.a aVar = new e.a.a.a.b.b.a();
        e.a.a.a.a a2 = aVar.a("b018ad21d13dbfc9dcbeeca231e65aec");
        e.a.a.a.d.b a3 = aVar.a();
        String string = this.a.getString(q0.code_load_prefix);
        a3.b(this.f9845c);
        a3.a(string + this.f9844b);
        a3.c(this.f9846d);
        a3.a(e.a.a.a.d.d.Unlisted);
        a3.a(e.a.a.a.d.c.Never);
        return a2.a(a3.a());
    }

    public void a(String str, String str2, String str3) {
        this.f9844b = str;
        this.f9845c = str2;
        this.f9846d = str3;
        new a().execute(new Void[0]);
    }
}
