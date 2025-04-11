package qwe.qweqwe.texteditor.w0.d;

import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.d.a.a.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.l0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.y0.p;

public abstract class c implements e {
    private final float a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f9827b;

    /* renamed from: c  reason: collision with root package name */
    protected final e0 f9828c;

    /* renamed from: d  reason: collision with root package name */
    int f9829d = 1;

    /* renamed from: e  reason: collision with root package name */
    BlockingQueue f9830e = new ArrayBlockingQueue(this.f9829d);

    /* renamed from: f  reason: collision with root package name */
    private Process f9831f;

    /* renamed from: g  reason: collision with root package name */
    private Thread f9832g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f9833h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9834i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9835j = true;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            while (c.this.f9835j) {
                try {
                    Object take = c.this.f9830e.take();
                    if (take instanceof d) {
                        c.this.b((c) ((d) take));
                    }
                    if (take instanceof e) {
                        Object poll = c.this.f9830e.poll(c.this.e(), TimeUnit.MILLISECONDS);
                        if (poll == null) {
                            c.this.h();
                        } else {
                            c.this.f9830e.offer(poll);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (c.this.f9831f != null) {
                i0.c("Code_check", "pre_destroy_process");
                c.this.f9831f.destroy();
                i0.c("Code_check", "post_destroy_process");
                try {
                    c.this.f9831f.waitFor();
                    i0.c("Code_check", "process_waited");
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f9837b;

        b(p pVar) {
            this.f9837b = pVar;
        }

        public void run() {
            this.f9837b.g0.invalidate();
            c.this.i();
        }
    }

    /* renamed from: qwe.qweqwe.texteditor.w0.d.c$c  reason: collision with other inner class name */
    class C0155c extends HashMap<Character, Integer> {
        C0155c(c cVar) {
            put('R', 1);
        }
    }

    public class d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9839b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9840c;

        public d(c cVar, int i2, String str, String str2) {
            this.f9839b = i2;
            this.f9840c = str;
            this.a = str2;
        }
    }

    public class e {
        public e(c cVar) {
        }
    }

    public c(e0 e0Var) {
        new C0155c(this);
        this.f9828c = e0Var;
        this.f9833h = new Handler();
        this.a = this.f9828c.getResources().getDisplayMetrics().density;
        this.f9827b = (LinearLayout) this.f9828c.findViewById(n0.scrollAnalysisBar);
        if (this.f9832g == null) {
            j();
        }
    }

    private void a(ArrayList<d> arrayList) {
        Collections.sort(arrayList, new b(this));
    }

    public static boolean a(p pVar, Class[] clsArr) {
        if (pVar == null) {
            return true;
        }
        m D0 = pVar.D0();
        for (Class cls : clsArr) {
            if (cls.isInstance(D0)) {
                return false;
            }
        }
        return true;
    }

    private Integer b(char c2) {
        return Integer.valueOf(c2 != 'C' ? c2 != 'R' ? c2 != 'W' ? c2 != 'E' ? c2 != 'F' ? c2 != 'H' ? c2 != 'I' ? 7 : 5 : 6 : 0 : 1 : 2 : 4 : 3);
    }

    private void b(int i2) {
        this.f9827b.removeAllViews();
        ArrayList<d> arrayList = this.f9828c.y().E0().get(Integer.valueOf(i2));
        if (arrayList != null && arrayList.size() != 0) {
            a(arrayList);
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                d next = it.next();
                TextView textView = new TextView(this.f9828c);
                textView.setMinWidth((int) (this.a * 64.0f));
                textView.setHeight((int) (this.a * 32.0f));
                textView.setBackgroundColor(c.h.d.a.a(this.f9828c, l0.colorPrimary));
                textView.setTextColor(c.h.d.a.a(this.f9828c, l0.default_white));
                textView.setGravity(17);
                float f2 = this.a;
                textView.setPadding((int) ((f2 * 15.0f) / 2.0f), (int) (f2 * 3.0f), (int) (15.0f * f2), (int) (f2 * 3.0f));
                a(textView, next);
                textView.setOnClickListener(new a(this, next));
                this.f9827b.addView(textView);
            }
            try {
                TextView textView2 = new TextView(this.f9828c);
                textView2.setBackgroundColor(c.h.d.a.a(this.f9828c, l0.colorPrimary));
                textView2.setWidth((int) (this.a * 96.0f));
                textView2.setHeight((int) (this.a * 32.0f));
                textView2.setGravity(17);
                this.f9827b.addView(textView2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean b(d dVar) {
        if (dVar == null) {
            return false;
        }
        ArrayList<d> a2 = a(dVar);
        HashMap<Integer, ArrayList<d>> hashMap = new HashMap<>();
        qwe.qweqwe.texteditor.settings.d dVar2 = this.f9828c.t;
        Iterator<d> it = a2.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next != null) {
                char c2 = next.a;
                if ((dVar2.f9695j && c2 == 'R') || ((dVar2.f9696k && c2 == 'C') || ((dVar2.f9697l && c2 == 'W') || ((dVar2.f9698m && c2 == 'E') || (dVar2.n && c2 == 'F'))))) {
                    if (hashMap.containsKey(Integer.valueOf(next.f9841b))) {
                        hashMap.get(Integer.valueOf(next.f9841b)).add(next);
                    } else {
                        ArrayList<d> arrayList = new ArrayList<>();
                        arrayList.add(next);
                        hashMap.put(Integer.valueOf(next.f9841b), arrayList);
                    }
                }
            }
        }
        p f2 = this.f9828c.f(dVar.f9839b);
        if (f2 == null) {
            return true;
        }
        f2.a(hashMap);
        this.f9833h.post(new b(f2));
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h() {
        i0.a("Code_check", "forceCodeChecking");
        if (this.f9834i) {
            this.f9834i = false;
            g();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i() {
        p d2 = this.f9828c.u.d();
        if (d2 != null) {
            b(d2.z0()[0]);
        }
    }

    private void j() {
        i0.c("Code_check", "startNewThread");
        Thread thread = new Thread(new a());
        thread.start();
        this.f9832g = thread;
    }

    public /* synthetic */ int a(d dVar, d dVar2) {
        return b(dVar.a).compareTo(b(dVar2.a));
    }

    /* access modifiers changed from: protected */
    public Spannable a(int i2, String str, String str2) {
        SpannableString spannableString = new SpannableString(str + str2);
        spannableString.setSpan(new ForegroundColorSpan(i2), 0, str.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: protected */
    public String a(char c2) {
        e0 e0Var;
        int i2;
        if (c2 == 'C') {
            e0Var = this.f9828c;
            i2 = q0.analysis_convention;
        } else if (c2 == 'R') {
            e0Var = this.f9828c;
            i2 = q0.analysis_refactor;
        } else if (c2 == 'W') {
            e0Var = this.f9828c;
            i2 = q0.analysis_warning;
        } else if (c2 == 'E') {
            e0Var = this.f9828c;
            i2 = q0.analysis_error;
        } else if (c2 == 'F') {
            e0Var = this.f9828c;
            i2 = q0.analysis_fatal;
        } else if (c2 == 'H') {
            e0Var = this.f9828c;
            i2 = q0.analysis_hint;
        } else if (c2 != 'I') {
            return "";
        } else {
            e0Var = this.f9828c;
            i2 = q0.analysis_information;
        }
        return e0Var.getString(i2);
    }

    public abstract ArrayList<d> a(d dVar);

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void a() {
        this.f9834i = true;
        if (!a(this.f9828c.y(), f())) {
            try {
                Object peek = this.f9830e.peek();
                if (peek == null || (peek instanceof e)) {
                    this.f9830e.poll();
                    this.f9830e.put(new e(this));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void a(int i2) {
        if (!a(this.f9828c.y(), f())) {
            b(i2);
            if (this.f9834i) {
                this.f9834i = false;
                g();
            }
        }
    }

    public abstract void a(TextView textView, d dVar);

    public abstract void a(d dVar);

    public /* synthetic */ void a(d dVar, View view) {
        a(dVar);
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void b() {
        g();
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void c() {
        i();
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void d() {
        g();
    }

    /* access modifiers changed from: protected */
    public abstract long e();

    /* access modifiers changed from: protected */
    public abstract Class[] f();

    /* access modifiers changed from: protected */
    public void g() {
        p d2 = this.f9828c.u.d();
        if (!a(d2, f()) && d2 != null) {
            String v0 = d2.v0();
            String C0 = d2.C0();
            int H0 = d2.H0();
            try {
                this.f9830e.poll();
                this.f9830e.put(new d(this, H0, v0, C0));
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void onDestroy() {
        i0.a("Code_check", "onDestroy");
        this.f9835j = false;
        try {
            this.f9830e.poll();
            this.f9830e.put(new Object());
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    @Override // qwe.qweqwe.texteditor.w0.d.e
    public void onResume() {
        try {
            this.f9834i = true;
            a(-1);
        } catch (Exception unused) {
        }
    }
}
