package qwe.qweqwe.texteditor;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.d;
import d.c.f;
import java.io.File;
import java.io.InputStream;
import qwe.qweqwe.texteditor.u0.x;

public class t0 {

    /* access modifiers changed from: package-private */
    public class a extends d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e0 f9701i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f9702j;

        a(e0 e0Var, f fVar) {
            this.f9701i = e0Var;
            this.f9702j = fVar;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            b(this.f9701i.getString(q0.loading_src));
            f fVar = this.f9702j;
            if (fVar.f6964f == null) {
                return d.b.a(this.f9701i, fVar.f6963e);
            }
            e0 e0Var = this.f9701i;
            return d.b.a(e0Var, "assets://" + this.f9702j.f6964f);
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            this.f9701i.a(this.f9702j.f6960b, (String) obj);
            this.f9701i.b(this.f9702j);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f9703i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f9704j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ e0 f9705k;

        b(String str, f fVar, e0 e0Var) {
            this.f9703i = str;
            this.f9704j = fVar;
            this.f9705k = e0Var;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            File file = new File(this.f9703i, this.f9704j.a);
            try {
                k.a.a.a.b.b(file);
            } catch (Exception unused) {
            }
            file.mkdir();
            f fVar = this.f9704j;
            File file2 = new File(file, fVar.f6962d ? "sample_archive" : fVar.f6960b);
            b(1);
            b(this.f9705k.getString(q0.loading_src));
            f fVar2 = this.f9704j;
            if (fVar2.f6964f == null) {
                d.b.a(fVar2.f6963e, file2, new x(this));
            } else {
                InputStream open = this.f9705k.getAssets().open(this.f9704j.f6964f);
                k.a.a.a.b.a(open, file2);
                open.close();
            }
            b(0);
            if (this.f9704j.f6962d) {
                b(this.f9705k.getString(q0.extracing_files));
                x.a(this.f9705k, qwe.qweqwe.texteditor.v0.a.d(this.f9705k) + " tar -xvzf '" + file2.getAbsolutePath() + "'", file);
                file2.delete();
            }
            return new File(file, this.f9704j.f6960b).getAbsolutePath();
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            String str = (String) obj;
            try {
                qwe.qweqwe.texteditor.w0.a.a(this.f9705k, str);
                com.getdirectory.a.a(this.f9705k, new File(str).getParentFile().getAbsolutePath());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            qwe.qweqwe.texteditor.x0.a.a(str, this.f9705k);
            this.f9705k.b(this.f9704j);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends AsyncTask {
        final /* synthetic */ Context a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f9706b;

        c(Context context, d dVar) {
            this.a = context;
            this.f9706b = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            try {
                return this.f9706b.a();
            } catch (Throwable th) {
                return th;
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            try {
                this.f9706b.f9707b.dismiss();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (obj instanceof Throwable) {
                d.a aVar = new d.a(this.a);
                aVar.b(q0.process_problem);
                aVar.a(t0.b((Throwable) obj));
                aVar.b(q0.retry, new t(this.a, this.f9706b));
                aVar.c();
                return;
            }
            try {
                this.f9706b.a(obj);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            d.a aVar = new d.a(this.a);
            View inflate = LayoutInflater.from(this.a).inflate(o0.progress_dialog, (ViewGroup) null);
            aVar.b(inflate);
            this.f9706b.f9709d = (ProgressBar) inflate.findViewById(n0.pb_spinner);
            this.f9706b.f9708c = (ProgressBar) inflate.findViewById(n0.pb);
            this.f9706b.f9710e = (TextView) inflate.findViewById(n0.title);
            this.f9706b.f9711f = (TextView) inflate.findViewById(n0.textLoading);
            this.f9706b.f9712g = (TextView) inflate.findViewById(n0.textPercent);
            this.f9706b.f9713h = (TextView) inflate.findViewById(n0.message);
            this.f9706b.f9707b = aVar.a();
            this.f9706b.f9707b.setCancelable(false);
            this.f9706b.f9707b.show();
        }
    }

    public static abstract class d {
        Handler a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private androidx.appcompat.app.d f9707b;

        /* renamed from: c  reason: collision with root package name */
        private ProgressBar f9708c;

        /* renamed from: d  reason: collision with root package name */
        private ProgressBar f9709d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f9710e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f9711f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f9712g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f9713h;

        public abstract Object a();

        public /* synthetic */ void a(int i2) {
            if (i2 == 0) {
                this.f9708c.setVisibility(8);
                this.f9711f.setVisibility(8);
                this.f9712g.setVisibility(8);
                this.f9709d.setVisibility(0);
                return;
            }
            this.f9708c.setVisibility(0);
            this.f9711f.setVisibility(0);
            this.f9712g.setVisibility(0);
            this.f9709d.setVisibility(8);
        }

        public /* synthetic */ void a(int i2, int i3) {
            this.f9708c.setMax(i2);
            this.f9708c.setProgress(i3);
            TextView textView = this.f9711f;
            textView.setText(i3 + "/" + i2);
            TextView textView2 = this.f9712g;
            textView2.setText(Math.round((((double) i3) * 100.0d) / ((double) i2)) + "%");
        }

        public abstract void a(Object obj);

        public /* synthetic */ void a(String str) {
            this.f9710e.setText(str);
        }

        /* access modifiers changed from: protected */
        public void b(int i2) {
            this.a.post(new u(this, i2));
        }

        /* access modifiers changed from: protected */
        public void b(int i2, int i3) {
            this.a.post(new v(this, i3, i2));
        }

        /* access modifiers changed from: protected */
        public void b(String str) {
            this.a.post(new w(this, str));
        }
    }

    public interface e {
        void a(Object obj);
    }

    /* access modifiers changed from: protected */
    public static void a(Context context, d dVar) {
        new c(context, dVar).execute(new Object[0]);
    }

    public static void a(e0 e0Var, f fVar) {
        a(e0Var, new a(e0Var, fVar));
    }

    public static void a(e0 e0Var, f fVar, String str) {
        a(e0Var, new b(str, fVar, e0Var));
    }

    /* access modifiers changed from: private */
    public static String b(Throwable th) {
        try {
            return th.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static void b(Context context, d dVar) {
        a(context, dVar);
    }
}
