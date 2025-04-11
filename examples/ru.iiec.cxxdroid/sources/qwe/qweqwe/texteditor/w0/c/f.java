package qwe.qweqwe.texteditor.w0.c;

import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.u0.z;
import qwe.qweqwe.texteditor.w0.d.c;
import qwe.qweqwe.texteditor.y0.p;

public class f implements i {
    private final d a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f9807b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9808c = true;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f9809d = true;

    /* renamed from: e  reason: collision with root package name */
    protected LinearLayout f9810e;

    /* renamed from: f  reason: collision with root package name */
    protected RecyclerView f9811f;

    /* renamed from: g  reason: collision with root package name */
    protected Thread f9812g;

    /* renamed from: h  reason: collision with root package name */
    protected Handler f9813h;

    /* renamed from: i  reason: collision with root package name */
    protected Set<String> f9814i = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: j  reason: collision with root package name */
    protected String f9815j;

    /* renamed from: k  reason: collision with root package name */
    int f9816k = 1;

    /* renamed from: l  reason: collision with root package name */
    BlockingQueue f9817l = new ArrayBlockingQueue(this.f9816k);

    /* renamed from: m  reason: collision with root package name */
    private e f9818m;
    private List<c> n = null;

    class a implements z.b {
        a() {
        }

        @Override // qwe.qweqwe.texteditor.u0.z.b
        public void a(View view, int i2) {
            c c2 = f.this.a.c(i2);
            if (c2 instanceof k) {
                f.this.a.a(f.this.f9807b);
            } else if (!(c2 instanceof g)) {
                f.this.a(c2);
            }
        }

        @Override // qwe.qweqwe.texteditor.u0.z.b
        public void b(View view, int i2) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            while (true) {
                f fVar = f.this;
                if (fVar.f9808c) {
                    try {
                        Object take = fVar.f9817l.take();
                        i0.a("JediAutocomp", "unlocked, queue size=" + f.this.f9817l.size());
                        if (take instanceof e) {
                            f.this.b((e) take);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public f(e0 e0Var) {
        this.f9807b = e0Var;
        this.f9813h = new Handler();
        float f2 = this.f9807b.getResources().getDisplayMetrics().density;
        this.f9810e = (LinearLayout) this.f9807b.findViewById(n0.scrollAutocompleBar);
        this.f9811f = (RecyclerView) this.f9807b.findViewById(n0.completion_recycler);
        this.a = new d(new ArrayList(), this.f9807b, c());
        this.f9811f.setLayoutManager(new LinearLayoutManager(this.f9807b, 0, false));
        this.f9811f.setAdapter(this.a);
        RecyclerView recyclerView = this.f9811f;
        recyclerView.a(new z(this.f9807b, recyclerView, new a()));
        this.a.e();
        if (this.f9812g == null) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public String a(String str, int i2) {
        int i3 = 0;
        char c2 = '\n';
        int i4 = i2 - 1;
        while (true) {
            if (i4 < 0) {
                break;
            }
            try {
                char charAt = str.charAt(i4);
                if (!Character.isLetter(charAt) && !Character.isDigit(charAt) && charAt != '_') {
                    i3 = i4 + 1;
                    c2 = charAt;
                    break;
                }
                i4--;
            } catch (Exception unused) {
                return null;
            }
        }
        String substring = str.substring(i3, i2);
        if (substring.length() != 0 || a(c2)) {
            return substring;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public ArrayList<c> a(String str, String str2, int i2, int i3, int i4) {
        throw null;
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void a() {
        if (!c.a(this.f9807b.y(), g())) {
            b(1);
        }
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void a(int i2) {
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        i0.a("AutocompleteBench", "size: " + this.n.size());
        for (c cVar : this.n) {
            if (!cVar.a.startsWith(str)) {
                cVar.f9798c = false;
            } else {
                cVar.f9798c = true;
                cVar.f9797b = cVar.a.substring(str.length(), cVar.a.length());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        p d2 = this.f9807b.u.d();
        String str = cVar.f9797b;
        if (this.f9809d && this.f9814i.contains(cVar.a)) {
            str = str + " ";
        }
        d2.d(str);
        if ((cVar instanceof j) && !((j) cVar).f9822e.isEmpty()) {
            d2.R0();
        }
        e();
    }

    /* access modifiers changed from: protected */
    public void a(e eVar) {
        if (eVar != null) {
            String a2 = a(eVar.f9805e, eVar.f9804d);
            if (a2 == null) {
                e();
                return;
            }
            if (this.f9815j == null || a2.length() == 0 || a2.length() == 1 || !a2.startsWith(this.f9815j) || this.n == null) {
                this.f9815j = a2;
                this.n = a(eVar.a, eVar.f9805e, eVar.f9802b, eVar.f9803c, eVar.f9804d);
            } else {
                a(a2);
            }
            c(this.n);
        }
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void a(p pVar) {
        this.n = null;
        this.f9815j = null;
        e();
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public /* synthetic */ void a(boolean z) {
        h.a(this, z);
    }

    /* access modifiers changed from: protected */
    public boolean a(char c2) {
        throw null;
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void b() {
        this.n = null;
        this.f9815j = null;
        e();
    }

    public void b(int i2) {
        p d2 = this.f9807b.u.d();
        String v0 = d2.v0();
        int[] b2 = d2.b(v0);
        int x0 = d2.x0();
        e eVar = this.f9818m;
        if (i2 != 1 || eVar == null || eVar.f9806f == 1) {
            try {
                this.f9817l.poll();
                this.f9817l.put(new e(d2.C0(), b2[0], b2[1], x0, v0, i2));
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void a(List<c> list) {
        this.a.a(list);
    }

    /* access modifiers changed from: protected */
    public void b(e eVar) {
        throw null;
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void b(p pVar) {
    }

    /* access modifiers changed from: protected */
    public void c(List<c> list) {
        this.f9813h.post(new a(this, list));
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void c(p pVar) {
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        throw null;
    }

    public /* synthetic */ void d() {
        LinearLayout linearLayout = this.f9810e;
        if (!(linearLayout == null || linearLayout.getChildCount() == 0)) {
            this.f9810e.removeAllViews();
        }
        this.a.f();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f9813h.post(new b(this));
    }

    /* access modifiers changed from: protected */
    public void f() {
        i0.c("JediAutocomp", "startNewThread");
        Thread thread = new Thread(new b());
        thread.start();
        this.f9812g = thread;
    }

    /* access modifiers changed from: protected */
    public Class[] g() {
        throw null;
    }

    @Override // qwe.qweqwe.texteditor.w0.c.i
    public void onDestroy() {
        i0.a("JediAutocomp", "onDestroy");
        this.f9808c = false;
        try {
            this.f9817l.poll();
            this.f9817l.put(new Object());
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
