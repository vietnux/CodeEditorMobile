package iiec.androidterm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class e {
    private final Term a;

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f9306b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f9307c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f9308d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f9309e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f9310f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<Integer> f9311g;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public ScrollView f9312b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f9313c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f9314d;

        /* renamed from: e  reason: collision with root package name */
        public BufferedReader f9315e;

        /* renamed from: f  reason: collision with root package name */
        private PrintWriter f9316f;

        /* access modifiers changed from: package-private */
        /* renamed from: iiec.androidterm.e$a$a  reason: collision with other inner class name */
        public class View$OnClickListenerC0142a implements View.OnClickListener {
            View$OnClickListenerC0142a() {
            }

            public void onClick(View view) {
                a.this.d();
            }
        }

        /* access modifiers changed from: package-private */
        public class b implements View.OnClickListener {
            b() {
            }

            public void onClick(View view) {
                a.this.a();
            }
        }

        /* access modifiers changed from: package-private */
        public class c implements View.OnClickListener {
            c() {
            }

            public void onClick(View view) {
                a.this.b();
            }
        }

        /* access modifiers changed from: package-private */
        public class d implements View.OnClickListener {
            d() {
            }

            public void onClick(View view) {
                a.this.f();
            }
        }

        /* renamed from: iiec.androidterm.e$a$e  reason: collision with other inner class name */
        class RunnableC0143e implements Runnable {
            RunnableC0143e() {
            }

            public void run() {
                e.this.f9306b.setVisibility(0);
            }
        }

        /* access modifiers changed from: package-private */
        public class f implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f9323b;

            f(String str) {
                this.f9323b = str;
            }

            public void run() {
                a.this.f9314d.setText(this.f9323b);
                a.this.f9312b.setScrollY((a.this.f9312b.getChildAt(0).getHeight() - a.this.f9312b.getHeight()) / 2);
            }
        }

        /* access modifiers changed from: package-private */
        public class g implements DialogInterface.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EditText f9325b;

            g(EditText editText) {
                this.f9325b = editText;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                String obj = this.f9325b.getText().toString();
                if (!e.this.f9307c.contains(obj)) {
                    e.this.f9307c.add(obj);
                    a.this.c((a) obj);
                    return;
                }
                Term term = e.this.a;
                Toast.makeText(term, "\"" + obj + "\" " + e.this.a.getString(m.pdb_watch_already_exists), 0).show();
            }
        }

        /* access modifiers changed from: package-private */
        public class h implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f9327b;

            h(String str) {
                this.f9327b = str;
            }

            public void onClick(View view) {
                a.this.e((a) this.f9327b);
            }
        }

        /* access modifiers changed from: package-private */
        public class i implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f9329b;

            /* renamed from: iiec.androidterm.e$a$i$a  reason: collision with other inner class name */
            class RunnableC0144a implements Runnable {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f9331b;

                RunnableC0144a(String str) {
                    this.f9331b = str;
                }

                public void run() {
                    try {
                        ((TextView) a.this.f9313c.findViewWithTag(e.this.a((e) i.this.f9329b)).findViewById(i.watch_name)).setText(this.f9331b);
                    } catch (Exception unused) {
                    }
                }
            }

            i(String str) {
                this.f9329b = str;
            }

            public void run() {
                e.this.f9309e.post(new RunnableC0144a(this.f9329b + " = " + a.this.a((a) this.f9329b)));
            }
        }

        /* access modifiers changed from: package-private */
        public class j implements DialogInterface.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ EditText f9333b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f9334c;

            j(EditText editText, String str) {
                this.f9333b = editText;
                this.f9334c = str;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                String obj = this.f9333b.getText().toString();
                a aVar = a.this;
                String d2 = aVar.d((a) ("!" + this.f9334c + "=" + obj));
                if (!d2.equals("")) {
                    Toast.makeText(e.this.a, d2, 0).show();
                }
                a.this.h();
            }
        }

        /* access modifiers changed from: package-private */
        public class k implements Runnable {
            k() {
            }

            public void run() {
                a.this.d((a) "c");
                a.this.f((a) "l");
                a.this.h();
                e.this.f9308d = false;
            }
        }

        /* access modifiers changed from: package-private */
        public class l implements View.OnClickListener {
            l() {
            }

            public void onClick(View view) {
                a.this.e();
            }
        }

        /* access modifiers changed from: package-private */
        public class m implements View.OnClickListener {
            m() {
            }

            public void onClick(View view) {
                a.this.c();
            }
        }

        a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private String a(String str) {
            return d("print(" + str + ")");
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a() {
            if (!e.this.f9308d) {
                e.this.f9308d = true;
                new Thread(new k()).start();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void b() {
            if (!e.this.f9308d) {
                d("n");
                f("l");
                h();
            }
        }

        private void b(String str) {
            this.f9316f.println(str);
            this.f9316f.flush();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c() {
            if (!e.this.f9308d) {
                d("r");
                f("l");
                h();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void c(String str) {
            View inflate = e.this.a.getLayoutInflater().inflate(k.pdb_watches_list_element, (ViewGroup) this.f9313c, false);
            ((TextView) inflate.findViewById(i.watch_name)).setText(str);
            inflate.setTag(e.this.a((e) str));
            ((Button) inflate.findViewById(i.watch_set_btn)).setOnClickListener(new h(str));
            this.f9313c.addView(inflate);
            h(str);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private String d(String str) {
            b(str);
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    String readLine = this.f9315e.readLine();
                    if (readLine == null || readLine.equals("(Pdb_iiec)")) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                    Log.d("PDB", "fileOut:" + readLine + "\n");
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void d() {
            if (!e.this.f9308d) {
                d("s");
                f("l");
                h();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void e() {
            AlertDialog.Builder builder = new AlertDialog.Builder(e.this.a);
            View inflate = e.this.a.getLayoutInflater().inflate(k.get_watch_name_dialog, (ViewGroup) null);
            builder.setView(inflate);
            builder.setTitle(e.this.a.getString(m.pdb_add_watch_title));
            builder.setMessage(e.this.a.getString(m.pdb_add_watch_message));
            builder.setPositiveButton(e.this.a.getString(m.pdb_add_watch_add), new g((EditText) inflate.findViewById(i.pdb_watch_name_edt)));
            builder.create().show();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void e(String str) {
            AlertDialog.Builder builder = new AlertDialog.Builder(e.this.a);
            View inflate = e.this.a.getLayoutInflater().inflate(k.get_watch_name_dialog, (ViewGroup) null);
            builder.setView(inflate);
            builder.setTitle(e.this.a.getString(m.pdb_set_watch_title));
            builder.setMessage(e.this.a.getString(m.pdb_set_watch_message_for, new Object[]{str}));
            builder.setPositiveButton(e.this.a.getString(m.pdb_set_watch_set), new j((EditText) inflate.findViewById(i.pdb_watch_name_edt), str));
            builder.create().show();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void f() {
            for (int i2 = 1; i2 <= e.this.f9311g.size(); i2++) {
                d("clear " + i2);
            }
            a();
            e.this.b();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void f(String str) {
            g(d(str));
        }

        private void g() {
            ((Button) e.this.a.findViewById(i.pdb_add_watch)).setOnClickListener(new l());
            ((Button) e.this.a.findViewById(i.pdb_return)).setOnClickListener(new m());
            ((Button) e.this.a.findViewById(i.pdb_step)).setOnClickListener(new View$OnClickListenerC0142a());
            ((Button) e.this.a.findViewById(i.pdb_continue)).setOnClickListener(new b());
            ((Button) e.this.a.findViewById(i.pdb_next)).setOnClickListener(new c());
            ((Button) e.this.a.findViewById(i.pdb_detach)).setOnClickListener(new d());
        }

        private void g(String str) {
            e.this.f9309e.post(new f(str));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void h() {
            Iterator<String> it = e.this.f9307c.iterator();
            while (it.hasNext()) {
                h(it.next());
            }
        }

        private void h(String str) {
            e.this.f9310f.post(new i(str));
        }

        public void run() {
            FileOutputStream fileOutputStream;
            Exception e2;
            boolean z = true;
            int i2 = 100;
            while (true) {
                if (!z) {
                    break;
                }
                try {
                    if (c.f9280d != null) {
                        Log.d("PDB", "globals inited");
                        try {
                            if (c.f9280d.equals(new Boolean(false))) {
                                return;
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            z = false;
                        }
                    } else {
                        Thread.sleep(100);
                        i2--;
                        if (i2 >= 0) {
                            Log.d("PDB", "waiting for globals");
                        } else {
                            return;
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                }
            }
            e.this.f9309e.post(new RunnableC0143e());
            this.f9314d = (TextView) e.this.a.findViewById(i.pdb_text);
            this.f9313c = (LinearLayout) e.this.a.findViewById(i.watchesListLayout);
            this.f9312b = (ScrollView) e.this.a.findViewById(i.scroll_view);
            File file = new File(c.a);
            File file2 = new File(c.f9278b);
            e.this.f9311g = c.f9279c;
            while (!file.exists()) {
                try {
                    Thread.sleep(100);
                    Log.d("PDB", "waiting for file exist");
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
                fileOutputStream = null;
            }
            if (fileOutputStream != null) {
                this.f9316f = new PrintWriter(fileOutputStream);
                if (this.f9316f == null) {
                    return;
                }
            }
            this.f9315e = null;
            try {
                this.f9315e = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e7) {
                e7.printStackTrace();
            }
            g();
            try {
                if (this.f9315e.readLine().equals("(_xXx_)Pydroid::Pipe opened(_xXx_)")) {
                    file.delete();
                    file2.delete();
                }
                while (true) {
                    String readLine = this.f9315e.readLine();
                    if (readLine == null || readLine.equals("(Pdb_iiec)")) {
                        break;
                    }
                    Log.d("PDB", "fileOut:" + readLine + "\n");
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            Iterator it = e.this.f9311g.iterator();
            while (it.hasNext()) {
                Log.d("PDB", "answer:" + d("b " + ((Integer) it.next())));
            }
            if (!e.this.f9311g.contains(new Integer(1))) {
                d("c");
            }
            g(d("l"));
            e.this.f9308d = false;
        }
    }

    public e(Term term, LinearLayout linearLayout) {
        this.a = term;
        this.f9306b = linearLayout;
        this.f9310f = new Handler();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String a(String str) {
        return "tag_for_watch_named" + str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b() {
        this.f9306b.setVisibility(8);
    }

    public void a() {
        this.f9309e = new Handler();
        new Thread(new a()).start();
    }
}
