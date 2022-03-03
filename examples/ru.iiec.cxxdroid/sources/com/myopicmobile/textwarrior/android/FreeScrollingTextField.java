package com.myopicmobile.textwarrior.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.ClipboardManager;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.method.CharacterPickerDialog;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.Scroller;
import e.d.a.a.b;
import e.d.a.a.g0;
import e.d.a.a.h0;
import e.d.a.a.i;
import e.d.a.a.j;
import e.d.a.a.l0;
import e.d.a.a.m;
import e.d.a.a.o0;
import java.util.Arrays;
import java.util.List;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;

public class FreeScrollingTextField extends View implements i.a, j.a {
    protected static float T = 0.75f;
    protected static float U = 0.5f;
    protected static int V = 4;
    protected static long W = 250;
    static int a0;
    private static SparseArray<String> b0 = new SparseArray<>();
    public boolean A;
    protected boolean B;
    Paint C;
    int D;
    int E;
    Paint F;
    char G;
    char H;
    h0 I;
    InputMethodManager J;
    private String K;
    private String L;
    int[] M;
    private final Runnable N;
    private final Runnable O;
    private final Runnable P;
    private final Runnable Q;
    ClipboardManager R;
    boolean S;

    /* renamed from: b  reason: collision with root package name */
    final char[] f6713b;

    /* renamed from: c  reason: collision with root package name */
    public e0 f6714c;

    /* renamed from: d  reason: collision with root package name */
    protected d f6715d;

    /* renamed from: e  reason: collision with root package name */
    public e.d.a.a.j f6716e;

    /* renamed from: f  reason: collision with root package name */
    public h f6717f;

    /* renamed from: g  reason: collision with root package name */
    private i f6718g;

    /* renamed from: h  reason: collision with root package name */
    private final Scroller f6719h;

    /* renamed from: i  reason: collision with root package name */
    private l0 f6720i;

    /* renamed from: j  reason: collision with root package name */
    private c f6721j;

    /* renamed from: k  reason: collision with root package name */
    protected int f6722k;

    /* renamed from: l  reason: collision with root package name */
    private int f6723l;

    /* renamed from: m  reason: collision with root package name */
    protected int f6724m;
    protected int n;
    private Paint o;
    public int p;
    protected int q;
    protected e.d.a.a.b r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    public boolean w;
    protected boolean x;
    protected boolean y;
    protected boolean z;

    /* access modifiers changed from: package-private */
    public class a implements l0 {
        a(FreeScrollingTextField freeScrollingTextField) {
        }

        @Override // e.d.a.a.l0
        public void a(int i2) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c {
        b() {
        }

        @Override // com.myopicmobile.textwarrior.android.c
        @SuppressLint({"NewApi"})
        public void a(boolean z) {
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            if (!freeScrollingTextField.A) {
                return;
            }
            if (z) {
                e0 e0Var = freeScrollingTextField.f6714c;
                c.a.o.b bVar = e0Var.r;
                if (bVar == null) {
                    e0Var.r = e0Var.b(e0Var.s);
                } else {
                    bVar.i();
                }
            } else {
                c.a.o.b bVar2 = freeScrollingTextField.f6714c.r;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            FreeScrollingTextField.this.f6717f.b(false);
            if (!FreeScrollingTextField.this.d()) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                freeScrollingTextField.postDelayed(freeScrollingTextField.N, FreeScrollingTextField.W);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            FreeScrollingTextField.this.f6717f.e(false);
            if (!FreeScrollingTextField.this.c()) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                freeScrollingTextField.postDelayed(freeScrollingTextField.O, FreeScrollingTextField.W);
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            FreeScrollingTextField.this.f6717f.c(false);
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            if (freeScrollingTextField.f6722k > 0) {
                int i2 = freeScrollingTextField.f6723l;
                FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                if (i2 == freeScrollingTextField2.f6716e.c(freeScrollingTextField2.f6722k - 1)) {
                    FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                    freeScrollingTextField3.postDelayed(freeScrollingTextField3.P, FreeScrollingTextField.W);
                }
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            FreeScrollingTextField.this.f6717f.d(false);
            if (!FreeScrollingTextField.this.b()) {
                int i2 = FreeScrollingTextField.this.f6723l;
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                if (i2 == freeScrollingTextField.f6716e.c(freeScrollingTextField.f6722k + 1)) {
                    FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                    freeScrollingTextField2.postDelayed(freeScrollingTextField2.Q, FreeScrollingTextField.W);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f6729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f6730c;

        g(SpannableStringBuilder spannableStringBuilder, boolean z) {
            this.f6729b = spannableStringBuilder;
            this.f6730c = z;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f6729b.length() > 0) {
                if (this.f6730c) {
                    FreeScrollingTextField.this.f6717f.a('\b');
                }
                FreeScrollingTextField.this.f6717f.a(this.f6729b.charAt(0));
            }
        }
    }

    public class h implements g0.a {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public final g0 f6732b = new g0(this);

        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f6734b;

            a(List list) {
                this.f6734b = list;
            }

            public void run() {
                FreeScrollingTextField.this.f6716e.a(this.f6734b);
                FreeScrollingTextField.this.invalidate();
            }
        }

        public h() {
        }

        private void b(int i2, int i3) {
            if (this.a) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i4 = freeScrollingTextField.n;
                if (i2 >= i4) {
                    int i5 = freeScrollingTextField.f6724m;
                    if (i3 < i5) {
                        freeScrollingTextField.n = i5;
                    }
                    freeScrollingTextField.n = i3;
                    return;
                } else if (i3 > i4) {
                    freeScrollingTextField.f6724m = i4;
                    freeScrollingTextField.n = i3;
                    return;
                }
                freeScrollingTextField.f6724m = i3;
            }
        }

        private boolean b(char c2) {
            String a2 = a(1);
            return "".equals(a2) || "\n".equals(a2) || "\r".equals(a2) || " ".equals(a2) || ";".equals(a2) || ")".equals(a2) || "]".equals(a2);
        }

        private boolean c(char c2) {
            if (!FreeScrollingTextField.this.w) {
                return false;
            }
            String valueOf = String.valueOf(c2);
            if (")".equals(valueOf) || "]".equals(valueOf) || "'".equals(valueOf) || "\"".equals(valueOf)) {
                return valueOf.equals(a(1));
            }
            return false;
        }

        private char[] f(int i2) {
            int d2 = FreeScrollingTextField.this.f6716e.d(FreeScrollingTextField.this.f6716e.b(i2));
            FreeScrollingTextField.this.f6716e.h(d2);
            int i3 = 0;
            while (FreeScrollingTextField.this.f6716e.l() && ((r2 = FreeScrollingTextField.this.f6716e.o()) == ' ' || r2 == '\t')) {
                i3++;
            }
            char[] cArr = new char[i3];
            FreeScrollingTextField.this.f6716e.h(d2);
            for (int i4 = 0; i4 < i3; i4++) {
                cArr[i4] = FreeScrollingTextField.this.f6716e.o();
            }
            return cArr;
        }

        private void g(boolean z) {
            int i2 = FreeScrollingTextField.this.f6723l;
            l();
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            if (!freeScrollingTextField.n((FreeScrollingTextField) freeScrollingTextField.f6722k)) {
                FreeScrollingTextField.this.e(i2, i2 + 1);
                FreeScrollingTextField.this.t();
            }
            if (!z) {
                k();
            }
        }

        private char[] g(int i2) {
            int d2 = FreeScrollingTextField.this.f6716e.d(FreeScrollingTextField.this.f6716e.b(i2));
            FreeScrollingTextField.this.f6716e.h(d2);
            int i3 = 0;
            while (FreeScrollingTextField.this.f6716e.l()) {
                if (this.f6732b.c().a(FreeScrollingTextField.this.f6716e.o())) {
                    break;
                }
                i3++;
            }
            char[] cArr = new char[(i3 + 1)];
            FreeScrollingTextField.this.f6716e.h(d2);
            for (int i4 = 0; i4 < i3; i4++) {
                if (FreeScrollingTextField.this.f6716e.o() == '\t') {
                    cArr[i4] = '\t';
                } else {
                    cArr[i4] = ' ';
                }
            }
            cArr[cArr.length - 1] = '\"';
            return cArr;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00e1 A[LOOP:4: B:43:0x00df->B:44:0x00e1, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private char[] m() {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.FreeScrollingTextField.h.m():char[]");
        }

        private void n() {
            g(false);
        }

        /* access modifiers changed from: package-private */
        public String a(int i2) {
            int f2 = FreeScrollingTextField.this.f6716e.f();
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            int i3 = freeScrollingTextField.f6722k;
            return i3 + i2 > f2 + -1 ? new String(freeScrollingTextField.f6716e.a(i3, (f2 - i3) - 1)) : new String(freeScrollingTextField.f6716e.a(i3, i2));
        }

        public void a() {
            this.f6732b.a();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
            if (r4 != r9.f6733c.f6716e.f(r3)) goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0120, code lost:
            r3 = r3 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ec, code lost:
            if (r4 != r9.f6733c.f6716e.f(r3)) goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x022c, code lost:
            if (r4 != r9.f6733c.f6716e.f(r3)) goto L_0x0120;
         */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x018e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(char r10) {
            /*
            // Method dump skipped, instructions count: 750
            */
            throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.FreeScrollingTextField.h.a(char):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(int r6, int r7) {
            /*
                r5 = this;
                boolean r0 = r5.a
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0010
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r0 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                int r3 = r0.f6724m
                int r0 = r0.n
                if (r3 >= r0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                boolean r3 = r5.a
                if (r3 == 0) goto L_0x001a
                if (r0 != 0) goto L_0x001a
                r5.f(r2)
            L_0x001a:
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r3 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                if (r0 == 0) goto L_0x0027
                int r4 = r3.f6724m
                int r4 = r4 - r6
                int r6 = r3.f6722k
                int r6 = r6 + r7
                r7 = r6
                r6 = r4
                goto L_0x002c
            L_0x0027:
                int r3 = r3.f6722k
                int r6 = r3 - r6
                int r7 = r7 + r3
            L_0x002c:
                if (r6 >= 0) goto L_0x002f
                r6 = 0
            L_0x002f:
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r3 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                e.d.a.a.j r3 = r3.f6716e
                int r3 = r3.f()
                int r1 = r3 + -1
                if (r7 <= r1) goto L_0x003c
                r7 = r1
            L_0x003c:
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x005d
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r0 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                int r0 = r0.f6724m
                r5.a(r6, r0, r1)
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r0 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                int r0 = r0.n
                r5.a(r0, r7, r1)
                com.myopicmobile.textwarrior.android.FreeScrollingTextField r7 = com.myopicmobile.textwarrior.android.FreeScrollingTextField.this
                int r0 = r7.f6724m
                int r6 = r0 - r6
                int r6 = r0 - r6
                int r7 = r7.n
                int r7 = r7 - r0
                r5.a(r6, r7, r2)
                goto L_0x0061
            L_0x005d:
                int r7 = r7 - r6
                r5.a(r6, r7, r1)
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.FreeScrollingTextField.h.a(int, int):void");
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, int i3, String str) {
            boolean z;
            boolean z2;
            char c2;
            if ("\n".equals(str)) {
                c2 = '\n';
            } else if ("(".equals(str)) {
                c2 = '(';
            } else if ("[".equals(str)) {
                c2 = '[';
            } else if ("'".equals(str)) {
                c2 = '\'';
            } else if ("\"".equals(str)) {
                c2 = '\"';
            } else if ("}".equals(str)) {
                c2 = '}';
            } else if ("\t".equals(str)) {
                c2 = '\t';
            } else if (")".equals(str)) {
                c2 = ')';
            } else if ("]".equals(str)) {
                c2 = ']';
            } else {
                int i4 = FreeScrollingTextField.this.f6723l;
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int f2 = freeScrollingTextField.f6716e.f(freeScrollingTextField.f6723l);
                boolean z3 = false;
                if (i3 > 0) {
                    int c3 = FreeScrollingTextField.this.f6716e.c(i2);
                    if (c3 < i4) {
                        f2 = FreeScrollingTextField.this.f6716e.f(c3);
                        i4 = c3;
                    }
                    z2 = i4 == FreeScrollingTextField.this.f6723l;
                    FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                    freeScrollingTextField2.f6722k = i2;
                    freeScrollingTextField2.f6716e.a(i2, i3, System.nanoTime());
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                if (str != null && str.length() > 0) {
                    int c4 = FreeScrollingTextField.this.f6716e.c(i2);
                    if (c4 < i4) {
                        f2 = FreeScrollingTextField.this.f6716e.f(c4);
                        i4 = c4;
                    }
                    FreeScrollingTextField.this.f6716e.a(str.toCharArray(), FreeScrollingTextField.this.f6722k, System.nanoTime());
                    FreeScrollingTextField.this.f6722k += str.length();
                    z = true;
                }
                if (z) {
                    FreeScrollingTextField.this.setEdited(true);
                    b();
                }
                int i5 = FreeScrollingTextField.this.f6723l;
                l();
                if (i5 == FreeScrollingTextField.this.f6723l) {
                    z3 = z2;
                }
                FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                if (!freeScrollingTextField3.n((FreeScrollingTextField) freeScrollingTextField3.f6722k)) {
                    if (FreeScrollingTextField.this.f6716e.n() && f2 != FreeScrollingTextField.this.f6716e.f(i4)) {
                        i4--;
                    }
                    if (!z3 || FreeScrollingTextField.this.f6716e.n()) {
                        FreeScrollingTextField.this.k((FreeScrollingTextField) i4);
                        return;
                    }
                    FreeScrollingTextField freeScrollingTextField4 = FreeScrollingTextField.this;
                    freeScrollingTextField4.e(freeScrollingTextField4.f6723l, FreeScrollingTextField.this.f6723l + 1);
                    return;
                }
                return;
            }
            a(c2);
        }

        public void a(int i2, int i3, boolean z) {
            a(i2, i3, z, false);
        }

        public void a(int i2, int i3, boolean z, boolean z2) {
            o0.a(i2 >= 0 && i3 <= FreeScrollingTextField.this.f6716e.f() - 1 && i3 >= 0, "Invalid range to select");
            if (this.a) {
                FreeScrollingTextField.this.u();
            } else {
                FreeScrollingTextField.this.t();
                f(true);
            }
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            freeScrollingTextField.f6724m = i2;
            freeScrollingTextField.n = freeScrollingTextField.f6724m + i3;
            freeScrollingTextField.f6722k = freeScrollingTextField.n;
            if (!z2) {
                k();
            }
            l();
            FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
            boolean n = freeScrollingTextField2.n((FreeScrollingTextField) freeScrollingTextField2.n);
            if (z) {
                FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                n = freeScrollingTextField3.n((FreeScrollingTextField) freeScrollingTextField3.f6724m);
            }
            if (!n) {
                FreeScrollingTextField.this.u();
            }
        }

        public void a(int i2, boolean z) {
            if (i2 < 0 || i2 >= FreeScrollingTextField.this.f6716e.f()) {
                o0.a("Invalid caret position");
                return;
            }
            b(FreeScrollingTextField.this.f6722k, i2);
            FreeScrollingTextField.this.f6722k = i2;
            g(z);
        }

        public void a(ClipboardManager clipboardManager) {
            FreeScrollingTextField freeScrollingTextField;
            int i2;
            int i3;
            if (this.a && (i2 = (freeScrollingTextField = FreeScrollingTextField.this).f6724m) < (i3 = freeScrollingTextField.n)) {
                clipboardManager.setText(new String(freeScrollingTextField.f6716e.a(i2, i3 - i2)));
            }
        }

        public void a(String str) {
            if (str != null) {
                FreeScrollingTextField.this.f6716e.b();
                j();
                int i2 = FreeScrollingTextField.this.f6723l;
                int f2 = FreeScrollingTextField.this.f6716e.f(i2);
                FreeScrollingTextField.this.f6716e.a(str.toCharArray(), FreeScrollingTextField.this.f6722k, System.nanoTime());
                FreeScrollingTextField.this.f6716e.g();
                FreeScrollingTextField.this.f6722k += str.length();
                l();
                FreeScrollingTextField.this.setEdited(true);
                b();
                k();
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                if (!freeScrollingTextField.n((FreeScrollingTextField) freeScrollingTextField.f6722k)) {
                    int i3 = (!FreeScrollingTextField.this.f6716e.n() || f2 == FreeScrollingTextField.this.f6716e.f(i2)) ? i2 : i2 - 1;
                    if (i2 != FreeScrollingTextField.this.f6723l || FreeScrollingTextField.this.f6716e.n()) {
                        FreeScrollingTextField.this.k((FreeScrollingTextField) i3);
                    } else {
                        FreeScrollingTextField.this.e(i3, i3 + 1);
                    }
                }
            }
        }

        @Override // e.d.a.a.g0.a
        public void a(List<h0> list) {
            FreeScrollingTextField.this.post(new a(list));
        }

        public void a(boolean z) {
            FreeScrollingTextField freeScrollingTextField;
            int i2;
            FreeScrollingTextField freeScrollingTextField2;
            int i3;
            if (this.a) {
                if (z && (freeScrollingTextField2 = FreeScrollingTextField.this).f6722k != (i3 = freeScrollingTextField2.f6724m)) {
                    freeScrollingTextField2.f6722k = i3;
                } else if (!z && (freeScrollingTextField = FreeScrollingTextField.this).f6722k != (i2 = freeScrollingTextField.n)) {
                    freeScrollingTextField.f6722k = i2;
                } else {
                    return;
                }
                n();
            }
        }

        /* access modifiers changed from: package-private */
        public String b(int i2) {
            int i3 = FreeScrollingTextField.this.f6722k - i2;
            if (i3 < 0) {
                i3 = 0;
            }
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            return new String(freeScrollingTextField.f6716e.a(i3, freeScrollingTextField.f6722k - i3));
        }

        public void b() {
            this.f6732b.b(FreeScrollingTextField.this.f6716e);
        }

        public void b(ClipboardManager clipboardManager) {
            a(clipboardManager);
            j();
        }

        public void b(boolean z) {
            if (!FreeScrollingTextField.this.d()) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i2 = freeScrollingTextField.f6722k;
                int i3 = freeScrollingTextField.f6723l;
                int i4 = i3 + 1;
                int e2 = FreeScrollingTextField.this.e(i2);
                int g2 = FreeScrollingTextField.this.f6716e.g(i3);
                int g3 = FreeScrollingTextField.this.f6716e.g(i4);
                if (e2 < g3) {
                    FreeScrollingTextField.this.f6722k += g2;
                } else {
                    FreeScrollingTextField.this.f6722k += ((g2 - e2) + g3) - 1;
                }
                FreeScrollingTextField.k(FreeScrollingTextField.this);
                b(i2, FreeScrollingTextField.this.f6722k);
                FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                if (!freeScrollingTextField2.n((FreeScrollingTextField) freeScrollingTextField2.f6722k)) {
                    FreeScrollingTextField.this.e(i3, i4 + 1);
                }
                FreeScrollingTextField.this.f6720i.a(i4);
                if (!z) {
                    k();
                }
            }
        }

        public void c() {
            char[] cArr;
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
            int b2 = freeScrollingTextField2.f6716e.b(freeScrollingTextField2.getSelectionEnd());
            int selectionStart = FreeScrollingTextField.this.getSelectionStart();
            int selectionEnd = FreeScrollingTextField.this.getSelectionEnd() - FreeScrollingTextField.this.getSelectionStart();
            long nanoTime = System.nanoTime();
            FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
            if (freeScrollingTextField3.y) {
                cArr = new char[freeScrollingTextField3.q];
                Arrays.fill(cArr, ' ');
            } else {
                cArr = new char[]{'\t'};
            }
            int i2 = 0;
            for (int b3 = freeScrollingTextField.f6716e.b(freeScrollingTextField.getSelectionStart()); b3 <= b2; b3++) {
                i2 += cArr.length;
                e.d.a.a.j jVar = FreeScrollingTextField.this.f6716e;
                jVar.a(cArr, jVar.d(b3), nanoTime);
            }
            a(selectionStart, selectionEnd + i2, false);
            FreeScrollingTextField.this.l();
            FreeScrollingTextField.this.invalidate();
        }

        public void c(boolean z) {
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            if (freeScrollingTextField.f6722k > 0) {
                int i2 = freeScrollingTextField.f6723l;
                FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                freeScrollingTextField2.f6722k--;
                l();
                int i3 = FreeScrollingTextField.this.f6722k;
                b(i3 + 1, i3);
                FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                if (!freeScrollingTextField3.n((FreeScrollingTextField) freeScrollingTextField3.f6722k)) {
                    FreeScrollingTextField freeScrollingTextField4 = FreeScrollingTextField.this;
                    freeScrollingTextField4.e(freeScrollingTextField4.f6723l, i2 + 1);
                }
                if (!z) {
                    k();
                }
            }
        }

        public boolean c(int i2) {
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            int i3 = freeScrollingTextField.f6724m;
            return i3 >= 0 && i3 <= i2 && i2 < freeScrollingTextField.n;
        }

        public void d() {
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            int b2 = freeScrollingTextField.f6716e.b(freeScrollingTextField.getSelectionStart());
            FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
            int b3 = freeScrollingTextField2.f6716e.b(freeScrollingTextField2.getSelectionEnd());
            int selectionStart = FreeScrollingTextField.this.getSelectionStart();
            int selectionEnd = FreeScrollingTextField.this.getSelectionEnd() - FreeScrollingTextField.this.getSelectionStart();
            long nanoTime = System.nanoTime();
            int i2 = 0;
            while (b2 <= b3) {
                int d2 = FreeScrollingTextField.this.f6716e.d(b2);
                int i3 = i2;
                int i4 = 0;
                while (true) {
                    FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                    if (i4 >= (freeScrollingTextField3.y ? freeScrollingTextField3.q : 1)) {
                        break;
                    }
                    if (FreeScrollingTextField.this.f6716e.a(d2) == ' ' || FreeScrollingTextField.this.f6716e.a(d2) == '\t') {
                        i3++;
                        FreeScrollingTextField.this.f6716e.a(d2, nanoTime);
                    }
                    i4++;
                }
                b2++;
                i2 = i3;
            }
            a(selectionStart, selectionEnd - i2, false);
            FreeScrollingTextField.this.l();
            FreeScrollingTextField.this.invalidate();
        }

        public void d(int i2) {
            a(i2, false);
        }

        public void d(boolean z) {
            if (!FreeScrollingTextField.this.b()) {
                int i2 = FreeScrollingTextField.this.f6723l;
                FreeScrollingTextField.this.f6722k++;
                l();
                int i3 = FreeScrollingTextField.this.f6722k;
                b(i3 - 1, i3);
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                if (!freeScrollingTextField.n((FreeScrollingTextField) freeScrollingTextField.f6722k)) {
                    FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                    freeScrollingTextField2.e(i2, freeScrollingTextField2.f6723l + 1);
                }
                if (!z) {
                    k();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return FreeScrollingTextField.this.getCaretPosition();
        }

        public void e(int i2) {
            if (i2 < 0 || i2 >= FreeScrollingTextField.this.f6716e.f()) {
                o0.a("Invalid caret position");
                return;
            }
            b(FreeScrollingTextField.this.f6722k, i2);
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            freeScrollingTextField.f6722k = i2;
            int i3 = freeScrollingTextField.f6723l;
            l();
            FreeScrollingTextField.this.e(i3, i3 + 1);
            FreeScrollingTextField.this.t();
            k();
        }

        public void e(boolean z) {
            if (!FreeScrollingTextField.this.c()) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i2 = freeScrollingTextField.f6722k;
                int i3 = freeScrollingTextField.f6723l;
                int i4 = i3 - 1;
                int e2 = FreeScrollingTextField.this.e(i2);
                int g2 = FreeScrollingTextField.this.f6716e.g(i4);
                if (e2 < g2) {
                    FreeScrollingTextField.this.f6722k -= g2;
                } else {
                    FreeScrollingTextField.this.f6722k -= e2 + 1;
                }
                FreeScrollingTextField.l(FreeScrollingTextField.this);
                b(i2, FreeScrollingTextField.this.f6722k);
                FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                if (!freeScrollingTextField2.n((FreeScrollingTextField) freeScrollingTextField2.f6722k)) {
                    FreeScrollingTextField.this.e(i4, i3 + 1);
                }
                FreeScrollingTextField.this.f6720i.a(i4);
                if (!z) {
                    k();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return FreeScrollingTextField.this.getSelectionEnd();
        }

        public void f(boolean z) {
            if (this.a ^ z) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i2 = z ? freeScrollingTextField.f6722k : -1;
                freeScrollingTextField.f6724m = i2;
                freeScrollingTextField.n = i2;
                this.a = z;
                FreeScrollingTextField.this.f6721j.a(z);
            }
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return FreeScrollingTextField.this.getSelectionStart();
        }

        /* access modifiers changed from: package-private */
        public String h() {
            FreeScrollingTextField freeScrollingTextField;
            int i2;
            int i3;
            if (!this.a || (i2 = (freeScrollingTextField = FreeScrollingTextField.this).f6724m) >= (i3 = freeScrollingTextField.n)) {
                return null;
            }
            return new String(freeScrollingTextField.f6716e.a(i2, i3 - i2));
        }

        public final boolean i() {
            return this.a;
        }

        public void j() {
            if (this.a) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i2 = freeScrollingTextField.n;
                int i3 = freeScrollingTextField.f6724m;
                int i4 = i2 - i3;
                if (i4 > 0) {
                    int c2 = freeScrollingTextField.f6716e.c(i3);
                    int f2 = FreeScrollingTextField.this.f6716e.f(c2);
                    FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                    boolean z = freeScrollingTextField2.f6716e.c(freeScrollingTextField2.n) == c2;
                    FreeScrollingTextField freeScrollingTextField3 = FreeScrollingTextField.this;
                    freeScrollingTextField3.f6716e.a(freeScrollingTextField3.f6724m, i4, System.nanoTime());
                    FreeScrollingTextField freeScrollingTextField4 = FreeScrollingTextField.this;
                    freeScrollingTextField4.f6722k = freeScrollingTextField4.f6724m;
                    l();
                    FreeScrollingTextField.this.setEdited(true);
                    b();
                    f(false);
                    k();
                    FreeScrollingTextField freeScrollingTextField5 = FreeScrollingTextField.this;
                    if (!freeScrollingTextField5.n((FreeScrollingTextField) freeScrollingTextField5.f6722k)) {
                        if (FreeScrollingTextField.this.f6716e.n() && f2 != FreeScrollingTextField.this.f6716e.f(c2)) {
                            c2--;
                        }
                        if (!z || FreeScrollingTextField.this.f6716e.n()) {
                            FreeScrollingTextField.this.k((FreeScrollingTextField) c2);
                        } else {
                            FreeScrollingTextField.this.e(c2, c2 + 1);
                        }
                    }
                } else {
                    f(false);
                    FreeScrollingTextField.this.t();
                }
            }
        }

        @SuppressLint({"NewApi"})
        public void k() {
            FreeScrollingTextField.this.f6714c.W();
            ((InputMethodManager) FreeScrollingTextField.this.getContext().getSystemService("input_method")).restartInput(FreeScrollingTextField.this);
            FreeScrollingTextField.this.v();
            if (FreeScrollingTextField.this.f6718g != null && FreeScrollingTextField.this.f6718g.c()) {
                FreeScrollingTextField.this.f6718g.d();
            }
        }

        /* access modifiers changed from: package-private */
        public void l() {
            FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
            int c2 = freeScrollingTextField.f6716e.c(freeScrollingTextField.f6722k);
            if (FreeScrollingTextField.this.f6723l != c2) {
                FreeScrollingTextField.this.f6723l = c2;
                FreeScrollingTextField.this.f6720i.a(c2);
                if (!this.a) {
                    FreeScrollingTextField freeScrollingTextField2 = FreeScrollingTextField.this;
                    freeScrollingTextField2.f6714c.h(freeScrollingTextField2.f6716e.b(freeScrollingTextField2.f6722k) + 1);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class i extends BaseInputConnection {
        private boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f6736b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f6737c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f6738d = 0;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6739e = false;

        public i(FreeScrollingTextField freeScrollingTextField) {
            super(freeScrollingTextField, true);
        }

        private boolean e() {
            if (this.a) {
                return false;
            }
            if (FreeScrollingTextField.this.f6717f.a) {
                FreeScrollingTextField freeScrollingTextField = FreeScrollingTextField.this;
                int i2 = freeScrollingTextField.f6724m;
                this.f6736b = i2;
                this.f6737c = freeScrollingTextField.n - i2;
                return true;
            }
            this.f6736b = FreeScrollingTextField.this.f6722k;
            this.f6737c = 0;
            return true;
        }

        public void a() {
            this.f6739e = true;
        }

        public boolean b() {
            return this.f6738d > 0;
        }

        public boolean beginBatchEdit() {
            this.f6738d++;
            return true;
        }

        public boolean c() {
            return this.a;
        }

        public boolean commitText(CharSequence charSequence, int i2) {
            return setComposingText(charSequence, i2) && finishComposingText();
        }

        public void d() {
            this.f6736b = -1;
            this.f6737c = -1;
            this.a = false;
            FreeScrollingTextField.this.f6716e.g();
        }

        public boolean deleteSurroundingText(int i2, int i3) {
            if (i2 == 1 && i3 == 0) {
                FreeScrollingTextField.this.f6717f.a('\b');
                return true;
            }
            if (this.f6737c != 0) {
                i0.a("Editor", "Warning: Implmentation of InputConnection.deleteSurroundingText will not skip composing text");
            }
            FreeScrollingTextField.this.f6717f.a(i2, i3);
            return true;
        }

        public boolean endBatchEdit() {
            boolean z = true;
            this.f6738d--;
            if (this.f6738d != 0) {
                z = false;
            }
            if (z && this.f6739e) {
                FreeScrollingTextField.this.r();
                this.f6739e = false;
            }
            return z;
        }

        public boolean finishComposingText() {
            d();
            return true;
        }

        public int getCursorCapsMode(int i2) {
            return 0;
        }

        public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
            int i3;
            if (!FreeScrollingTextField.this.f6717f.a || (i3 = (FreeScrollingTextField.this.f6717f.f() - FreeScrollingTextField.this.f6717f.g()) * 2) <= 512) {
                i3 = 512;
            }
            int e2 = FreeScrollingTextField.this.f6717f.e() - i3;
            ExtractedText extractedText = new ExtractedText();
            extractedText.text = FreeScrollingTextField.this.f6717f.b(i3) + FreeScrollingTextField.this.f6717f.a(i3);
            extractedText.startOffset = Math.max(0, e2);
            if (FreeScrollingTextField.this.f6717f.a) {
                extractedText.selectionStart = FreeScrollingTextField.this.f6717f.g() - extractedText.startOffset;
                extractedText.selectionEnd = FreeScrollingTextField.this.f6717f.f() - extractedText.startOffset;
            } else {
                int e3 = FreeScrollingTextField.this.f6717f.e() - extractedText.startOffset;
                extractedText.selectionEnd = e3;
                extractedText.selectionStart = e3;
            }
            return extractedText;
        }

        public CharSequence getSelectedText(int i2) {
            if (FreeScrollingTextField.this.f6717f.a) {
                return FreeScrollingTextField.this.f6717f.h();
            }
            return null;
        }

        public CharSequence getTextAfterCursor(int i2, int i3) {
            return FreeScrollingTextField.this.f6717f.a(i2);
        }

        public CharSequence getTextBeforeCursor(int i2, int i3) {
            return FreeScrollingTextField.this.f6717f.b(i2);
        }

        public boolean setComposingRegion(int i2, int i3) {
            this.a = true;
            this.f6736b = i2;
            this.f6737c = i3 - i2;
            return true;
        }

        public boolean setComposingText(CharSequence charSequence, int i2) {
            if (!FreeScrollingTextField.this.f6716e.m()) {
                FreeScrollingTextField.this.f6716e.b();
            }
            boolean e2 = e();
            FreeScrollingTextField.this.f6717f.a(this.f6736b, this.f6737c, charSequence.toString());
            this.f6737c = charSequence.length();
            this.a = true;
            if (e2 && FreeScrollingTextField.this.f6717f.a) {
                FreeScrollingTextField.this.f6717f.f(false);
            }
            if (i2 > 1) {
                FreeScrollingTextField.this.f6717f.a((this.f6736b + i2) - 1, false);
            } else if (i2 <= 0) {
                FreeScrollingTextField.this.f6717f.a((this.f6736b - charSequence.length()) + i2, false);
            }
            return true;
        }

        public boolean setSelection(int i2, int i3) {
            if (i2 == i3) {
                if (FreeScrollingTextField.this.f6717f.a) {
                    FreeScrollingTextField.this.f6717f.f(false);
                }
                FreeScrollingTextField.this.f6717f.a(i2, true);
            } else {
                FreeScrollingTextField.this.f6717f.a(i2, i3 - i2, false, true);
            }
            return true;
        }
    }

    public static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        final int f6741b;

        /* renamed from: c  reason: collision with root package name */
        final int f6742c;

        /* renamed from: d  reason: collision with root package name */
        final int f6743d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f6744e;

        /* renamed from: f  reason: collision with root package name */
        final int f6745f;

        /* renamed from: g  reason: collision with root package name */
        final int f6746g;

        class a implements Parcelable.Creator<j> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public j createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public j[] newArray(int i2) {
                return new j[i2];
            }
        }

        private j(Parcel parcel) {
            this.f6741b = parcel.readInt();
            this.f6742c = parcel.readInt();
            this.f6743d = parcel.readInt();
            this.f6744e = parcel.readInt() != 0;
            this.f6745f = parcel.readInt();
            this.f6746g = parcel.readInt();
        }

        /* synthetic */ j(Parcel parcel, a aVar) {
            this(parcel);
        }

        public j(FreeScrollingTextField freeScrollingTextField) {
            this.f6741b = freeScrollingTextField.getCaretPosition();
            this.f6742c = freeScrollingTextField.getScrollX();
            this.f6743d = freeScrollingTextField.getScrollY();
            this.f6744e = freeScrollingTextField.i();
            this.f6745f = freeScrollingTextField.getSelectionStart();
            this.f6746g = freeScrollingTextField.getSelectionEnd();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f6741b);
            parcel.writeInt(this.f6742c);
            parcel.writeInt(this.f6743d);
            parcel.writeInt(this.f6744e ? 1 : 0);
            parcel.writeInt(this.f6745f);
            parcel.writeInt(this.f6746g);
        }
    }

    static {
        b0.put(65, "ÀÁÂÄÆÃÅĄĀ");
        b0.put(67, "ÇĆČ");
        b0.put(68, "Ď");
        b0.put(69, "ÈÉÊËĘĚĒ");
        b0.put(71, "Ğ");
        b0.put(76, "Ł");
        b0.put(73, "ÌÍÎÏĪİ");
        b0.put(78, "ÑŃŇ");
        b0.put(79, "ØŒÕÒÓÔÖŌ");
        b0.put(82, "Ř");
        b0.put(83, "ŚŠŞ");
        b0.put(84, "Ť");
        b0.put(85, "ÙÚÛÜŮŪ");
        b0.put(89, "ÝŸ");
        b0.put(90, "ŹŻŽ");
        b0.put(97, "àáâäæãåąā");
        b0.put(99, "çćč");
        b0.put(100, "ď");
        b0.put(101, "èéêëęěē");
        b0.put(103, "ğ");
        b0.put(105, "ìíîïīı");
        b0.put(108, "ł");
        b0.put(110, "ñńň");
        b0.put(111, "øœõòóôöō");
        b0.put(114, "ř");
        b0.put(115, "§ßśšş");
        b0.put(116, "ť");
        b0.put(117, "ùúûüůū");
        b0.put(121, "ýÿ");
        b0.put(122, "źżž");
        b0.put(61185, "+-*/<>[]{}&|");
        b0.put(47, "\\");
        b0.put(49, "¹½⅓¼⅛");
        b0.put(50, "²⅔");
        b0.put(51, "³¾⅜");
        b0.put(52, "⁴");
        b0.put(53, "⅝");
        b0.put(55, "⅞");
        b0.put(48, "ⁿ∅");
        b0.put(36, "¢£€¥₣₤₱");
        b0.put(37, "‰");
        b0.put(42, "†‡");
        b0.put(45, "–—");
        b0.put(43, "±");
        b0.put(40, "[{<");
        b0.put(41, "]}>");
        b0.put(33, "¡");
        b0.put(34, "“”«»˝");
        b0.put(63, "¿");
        b0.put(44, "‚„");
        b0.put(61, "≠≈∞");
        b0.put(60, "≤«‹");
        b0.put(62, "≥»›");
    }

    public FreeScrollingTextField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6713b = new char[]{'R', 'C', 'W', 'E', 'F'};
        this.f6722k = 0;
        this.f6723l = 0;
        this.f6724m = -1;
        this.n = -1;
        this.p = 0;
        this.q = V;
        this.r = new e.d.a.a.d();
        this.s = false;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.x = true;
        this.y = false;
        this.z = false;
        this.A = true;
        this.B = false;
        this.I = new h0(-1, -1);
        this.J = null;
        this.K = "\t";
        this.L = null;
        this.M = new int[128];
        this.N = new c();
        this.O = new d();
        this.P = new e();
        this.Q = new f();
        this.R = null;
        this.S = false;
        this.f6716e = new e.d.a.a.j(this, this);
        this.f6715d = new d(this);
        this.f6719h = new Scroller(context);
        this.f6714c = (e0) context;
        s();
    }

    public FreeScrollingTextField(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6713b = new char[]{'R', 'C', 'W', 'E', 'F'};
        this.f6722k = 0;
        this.f6723l = 0;
        this.f6724m = -1;
        this.n = -1;
        this.p = 0;
        this.q = V;
        this.r = new e.d.a.a.d();
        this.s = false;
        this.t = false;
        this.u = true;
        this.v = false;
        this.w = true;
        this.x = true;
        this.y = false;
        this.z = false;
        this.A = true;
        this.B = false;
        this.I = new h0(-1, -1);
        this.J = null;
        this.K = "\t";
        this.L = null;
        this.M = new int[128];
        this.N = new c();
        this.O = new d();
        this.P = new e();
        this.Q = new f();
        this.R = null;
        this.S = false;
        this.f6716e = new e.d.a.a.j(this, this);
        this.f6715d = new d(this);
        this.f6719h = new Scroller(context);
        s();
    }

    private int a(Canvas canvas, char c2, int i2, int i3) {
        int i4;
        int color = this.o.getColor();
        int a2 = a(c2);
        int i5 = this.f6722k;
        if (i5 != this.f6724m || i5 == this.n) {
            i4 = color;
        } else {
            this.o.setColor(this.r.a(b.a.SELECTION_BACKGROUND));
            a(canvas, i2, i3, a2);
            i4 = this.r.a(b.a.CARET_FOREGROUND);
        }
        this.o.setColor(this.r.a(b.a.CARET_BACKGROUND));
        int i6 = this.f6722k;
        if (i6 == this.n || i6 == this.f6724m) {
            Paint.FontMetricsInt fontMetricsInt = this.o.getFontMetricsInt();
            canvas.drawRect((float) i2, (((float) fontMetricsInt.ascent) * U) + ((float) i3), (float) (i2 + a2), (float) (fontMetricsInt.descent + i3), this.o);
        } else {
            a(canvas, i2, i3, 2);
            i4 = color;
        }
        this.o.setColor(i4);
        b(canvas, c2, i2, i3);
        this.o.setColor(color);
        return a2;
    }

    private int a(Canvas canvas, String str, int i2, int i3) {
        canvas.drawText(str, (float) i2, (float) i3, this.o);
        return (int) this.o.measureText(str);
    }

    private void a(Canvas canvas) {
        if (this.s) {
            int j2 = j(this.f6723l);
            int color = this.o.getColor();
            this.o.setColor(this.r.a(b.a.LINE_HIGHLIGHT));
            canvas.drawRect(0.0f, (float) (j2 + 1), (float) Math.max(this.p, getContentWidth()), (float) (j2 + 2), this.o);
            this.o.setColor(color);
        }
    }

    private void a(Canvas canvas, int i2, int i3, int i4) {
        Paint.FontMetricsInt fontMetricsInt = this.o.getFontMetricsInt();
        canvas.drawRect((float) i2, (float) (fontMetricsInt.ascent + i3), (float) (i2 + i4), (float) (i3 + fontMetricsInt.descent), this.o);
    }

    private void a(String str, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Selection.setSelection(spannableStringBuilder, 0);
        CharacterPickerDialog characterPickerDialog = new CharacterPickerDialog(getContext(), this, spannableStringBuilder, str, true);
        characterPickerDialog.setOnDismissListener(new g(spannableStringBuilder, z2));
        characterPickerDialog.show();
    }

    private boolean a(int i2, h0 h0Var) {
        return h0Var != null && i2 == h0Var.a();
    }

    private int b(Canvas canvas) {
        return canvas.getClipBounds().top / m();
    }

    private int b(Canvas canvas, char c2, int i2, int i3) {
        Paint paint;
        float f2;
        float f3;
        int i4;
        int i5;
        String str;
        int color = this.o.getColor();
        if (c2 != '\t') {
            if (c2 != '\n') {
                if (c2 != ' ') {
                    if (c2 != 65535) {
                        canvas.drawText(new char[]{c2}, 0, 1, (float) i2, (float) i3, this.o);
                    }
                } else if (this.t) {
                    this.o.setColor(this.r.a(b.a.NON_PRINTING_GLYPH));
                    i5 = 0;
                    i4 = 1;
                    f3 = (float) i2;
                    f2 = (float) i3;
                    paint = this.o;
                    str = "·";
                } else {
                    canvas.drawText(" ", 0, 1, (float) i2, (float) i3, this.o);
                }
                return a(c2);
            }
            if (this.t) {
                this.o.setColor(this.r.a(b.a.NON_PRINTING_GLYPH));
                i5 = 0;
                i4 = 1;
                f3 = (float) i2;
                f2 = (float) i3;
                paint = this.o;
                str = "↵";
            }
            return a(c2);
        }
        if (this.t) {
            this.o.setColor(this.r.a(b.a.NON_PRINTING_GLYPH));
            i5 = 0;
            i4 = 1;
            f3 = (float) i2;
            f2 = (float) i3;
            paint = this.o;
            str = "»";
        }
        return a(c2);
        canvas.drawText(str, i5, i4, f3, f2, paint);
        this.o.setColor(color);
        return a(c2);
    }

    private int b(Canvas canvas, String str, int i2, int i3) {
        int color = this.o.getColor();
        int measureText = (int) this.o.measureText(str);
        this.o.setColor(this.r.a(b.a.SELECTION_BACKGROUND));
        a(canvas, i2, i3, measureText);
        this.o.setColor(this.r.a(b.a.SELECTION_FOREGROUND));
        a(canvas, str, i2, i3);
        this.o.setColor(color);
        return measureText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r7 > 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r7 <= 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (a(r6, r7 - 1) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (a(r6, r7) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
        if (r7 != (r6.f() - 1)) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r7 == (r6.f() - 1)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (a(r6, r7 - 1) != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (a(r6, r7) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r6, android.view.KeyEvent r7) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.FreeScrollingTextField.b(int, android.view.KeyEvent):void");
    }

    private int c(Canvas canvas) {
        return (canvas.getClipBounds().bottom - 1) / m();
    }

    private int c(Canvas canvas, char c2, int i2, int i3) {
        int color = this.o.getColor();
        int a2 = a(c2);
        this.o.setColor(this.r.a(b.a.SELECTION_BACKGROUND));
        a(canvas, i2, i3, a2);
        this.o.setColor(this.r.a(b.a.SELECTION_FOREGROUND));
        b(canvas, c2, i2, i3);
        this.o.setColor(color);
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x018c A[EDGE_INSN: B:228:0x018c->B:68:0x018c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x034c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.graphics.Canvas r29) {
        /*
        // Method dump skipped, instructions count: 1507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.myopicmobile.textwarrior.android.FreeScrollingTextField.d(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e(int i2, int i3) {
        o0.a(i2 <= i3 && i2 >= 0, "Invalid startRow and/or endRow");
        Rect a2 = this.f6715d.a();
        super.invalidate(0, Math.max(0, ((i2 * m()) + getPaddingTop()) - Math.max(a2.top, this.o.getFontMetricsInt().descent)), getScrollX() + getWidth(), (i3 * m()) + getPaddingTop() + a2.bottom);
    }

    private void f(char c2) {
        h hVar;
        if (!Character.isLowerCase(c2) || c2 != this.f6716e.a(this.f6722k - 1)) {
            hVar = this.f6717f;
        } else {
            this.f6717f.a('\b');
            hVar = this.f6717f;
            c2 = Character.toUpperCase(c2);
        }
        hVar.a(c2);
    }

    private final boolean f(int i2, int i3) {
        return i2 >= 0 && i2 < getWidth() && i3 >= 0 && i3 < getHeight();
    }

    private void g(char c2) {
        String str = b0.get(Character.isUpperCase(this.f6716e.a(this.f6722k - 1)) ? Character.toUpperCase(c2) : c2);
        if (str != null) {
            this.f6717f.k();
            a(str, true);
            return;
        }
        this.f6717f.a(c2);
    }

    private InputMethodManager getimm() {
        if (this.J == null) {
            this.J = (InputMethodManager) getContext().getSystemService("input_method");
        }
        return this.J;
    }

    private int j(int i2) {
        return ((i2 + 1) * m()) - this.o.getFontMetricsInt().descent;
    }

    static /* synthetic */ int k(FreeScrollingTextField freeScrollingTextField) {
        int i2 = freeScrollingTextField.f6723l + 1;
        freeScrollingTextField.f6723l = i2;
        return i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void k(int i2) {
        o0.a(i2 >= 0, "Invalid startRow");
        super.invalidate(0, Math.max(0, ((i2 * m()) + getPaddingTop()) - Math.max(this.f6715d.a().top, this.o.getFontMetricsInt().descent)), getScrollX() + getWidth(), getScrollY() + getHeight());
    }

    private int l(int i2) {
        h0 d2 = d(i2);
        int a2 = d2.a();
        int b2 = d2.b();
        int scrollX = b2 > getScrollX() + getContentWidth() ? (b2 - getScrollX()) - getContentWidth() : 0;
        if (a2 >= getScrollX() - this.D) {
            return scrollX;
        }
        return this.D + (a2 - getScrollX());
    }

    static /* synthetic */ int l(FreeScrollingTextField freeScrollingTextField) {
        int i2 = freeScrollingTextField.f6723l - 1;
        freeScrollingTextField.f6723l = i2;
        return i2;
    }

    private int m(int i2) {
        int c2 = this.f6716e.c(i2) * m();
        int m2 = m() + c2;
        if (c2 < getScrollY()) {
            return c2 - getScrollY();
        }
        if (m2 > getScrollY() + getContentHeight()) {
            return (m2 - getScrollY()) - getContentHeight();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean n(int i2) {
        o0.a(i2 >= 0 && i2 < this.f6716e.f(), "Invalid charOffset given");
        int m2 = m(i2);
        int l2 = l(i2);
        if (m2 == 0 && l2 == 0) {
            return false;
        }
        scrollBy(l2, m2);
        return true;
    }

    private int o(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            return size;
        }
        o0.a("MeasureSpec cannot be UNSPECIFIED. Setting dimensions to max.");
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r() {
        int i2;
        int i3;
        i iVar = this.f6718g;
        if (iVar != null) {
            if (iVar.b()) {
                this.f6718g.a();
                return;
            }
            if (this.f6717f.a) {
                i3 = getSelectionStart();
                i2 = getSelectionEnd();
            } else {
                i3 = getCaretPosition();
                i2 = getCaretPosition();
            }
            if (this.I.a() != i3 || this.I.b() != i2) {
                if (this.B) {
                    getimm().updateSelection(this, -1, -1, -1, -1);
                }
                getimm().updateSelection(this, i3, i2, this.f6718g.f6736b, this.f6718g.f6736b + this.f6718g.f6737c);
                this.I.a(i3);
                this.I.b(i2);
            }
        }
    }

    private void s() {
        this.f6717f = new h();
        this.o = new Paint();
        this.o.setAntiAlias(true);
        this.o.setTextSize(16.0f);
        a();
        this.F = new Paint();
        this.F.setStyle(Paint.Style.STROKE);
        this.F.setColor(-8421505);
        this.F.setStrokeWidth(2.0f);
        this.C = new Paint();
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setColor(this.r.a(b.a.FOREGROUND));
        this.C.setStrokeWidth(3.0f);
        this.C.setAntiAlias(true);
        setBackgroundColor(this.r.a(b.a.BACKGROUND));
        setLongClickable(false);
        setFocusableInTouchMode(true);
        setHapticFeedbackEnabled(true);
        this.f6720i = new a(this);
        this.f6721j = new b();
        w();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void t() {
        int i2 = this.f6723l;
        e(i2, i2 + 1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void u() {
        e(this.f6716e.c(this.f6724m), this.f6716e.c(this.n) + 1);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void v() {
        this.I = new h0(-1, -1);
    }

    private void w() {
        this.f6722k = 0;
        this.f6723l = 0;
        this.p = 0;
        this.f6717f.f(false);
        this.f6717f.k();
        this.f6716e.e();
        if (getContentWidth() > 0) {
            this.f6716e.a();
        }
        this.f6720i.a(0);
        scrollTo(0, 0);
    }

    @Override // e.d.a.a.i.a
    public int a(char c2) {
        int i2;
        if (c2 < 127) {
            int[] iArr = this.M;
            if (iArr[c2] != -1) {
                return iArr[c2];
            }
        }
        if (c2 != '\t') {
            if (c2 != '\n') {
                if (c2 == ' ') {
                    i2 = getSpaceAdvance();
                } else if (c2 != 65535) {
                    i2 = (int) this.o.measureText(new char[]{c2}, 0, 1);
                }
            }
            i2 = getEOLAdvance();
        } else {
            i2 = getTabAdvance();
        }
        if (c2 < 127) {
            this.M[c2] = i2;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2, int i3) {
        int m2 = i3 / m();
        int f2 = this.f6716e.f(m2);
        if (f2 < 0) {
            return -1;
        }
        if (i2 < 0) {
            return f2;
        }
        String e2 = this.f6716e.e(m2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < e2.length()) {
            char charAt = e2.charAt(i4);
            i5 += (charAt == '\n' || charAt == 65535) ? getEOLAdvance() : charAt == ' ' ? getSpaceAdvance() : charAt == '\t' ? getTabAdvance() : (int) this.o.measureText(new char[]{charAt}, 0, 1);
            if (i5 >= i2) {
                break;
            }
            i4++;
        }
        int i6 = f2 + i4;
        return i4 < e2.length() ? i6 : i6 - 1;
    }

    /* access modifiers changed from: package-private */
    public h0 a(int i2) {
        int i3;
        h0 h0Var;
        List<h0> k2 = this.f6716e.k();
        h0 h0Var2 = k2.get(0);
        int i4 = 1;
        while (true) {
            if (i4 < k2.size()) {
                i3 = i4 + 1;
                h0Var = k2.get(i4);
            } else {
                i3 = i4;
                h0Var = null;
            }
            if (h0Var != null && h0Var.a() < i2) {
                h0Var2 = h0Var;
                i4 = i3;
            }
        }
        if (h0Var2.b() != 50 || getLexer().c().c(this.f6716e.a(i2 - 1))) {
            return null;
        }
        return new h0(h0Var2.a(), h0Var != null ? h0Var.a() : this.f6716e.f());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i2;
        Arrays.fill(this.M, -1);
        if (this.x) {
            this.D = a('M') * 4;
            i2 = a('M');
        } else {
            this.D = a('M') / 2;
            i2 = 0;
        }
        this.E = i2;
    }

    public void a(ClipboardManager clipboardManager) {
        this.f6717f.a(clipboardManager);
    }

    public void a(String str) {
        this.f6717f.a(str);
    }

    public void a(boolean z2) {
        h hVar;
        boolean z3;
        if (this.f6717f.i() && !z2) {
            u();
            hVar = this.f6717f;
            z3 = false;
        } else if (!this.f6717f.i() && z2) {
            t();
            hVar = this.f6717f;
            z3 = true;
        } else {
            return;
        }
        hVar.f(z3);
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        if (this.R == null) {
            this.R = (ClipboardManager) getContext().getSystemService("clipboard");
        }
        if (i2 == 31 && (keyEvent.getMetaState() & 4096) != 0) {
            a(this.R);
            return true;
        } else if (i2 == 50 && (keyEvent.getMetaState() & 4096) != 0) {
            if (this.R.getText() != null) {
                a(this.R.getText().toString());
            }
            return true;
        } else if (i2 == 52 && (keyEvent.getMetaState() & 4096) != 0) {
            b(this.R);
            return true;
        } else if (i2 == 54 && (keyEvent.getMetaState() & 4096) != 0 && (keyEvent.getMetaState() & 1) != 0) {
            this.f6714c.a(false);
            return true;
        } else if (i2 == 54 && (keyEvent.getMetaState() & 4096) != 0) {
            this.f6714c.a(true);
            return true;
        } else if (i2 == 53 && (keyEvent.getMetaState() & 4096) != 0) {
            this.f6714c.a(false);
            return true;
        } else if (i2 == 29 && (keyEvent.getMetaState() & 4096) != 0) {
            n();
            return true;
        } else if (i2 == 122 && (keyEvent.getMetaState() & 4096) != 0) {
            h(0);
            return true;
        } else if (i2 == 123 && (keyEvent.getMetaState() & 4096) != 0) {
            h(this.f6716e.f() - 1);
            return true;
        } else if (i2 != 33 || (keyEvent.getMetaState() & 4096) == 0) {
            return this.f6714c.a(i2, keyEvent);
        } else {
            n();
            return true;
        }
    }

    public boolean a(e.d.a.a.j jVar, int i2) {
        char a2 = jVar.a(i2);
        return (a2 == '\n' || a2 == '\r' || a2 == 65535 || a2 == 0 || a2 == '\t' || a2 == ' ' || a2 == '(' || a2 == ')' || a2 == '\"' || a2 == '{' || a2 == '}' || a2 == '=' || a2 == ',' || a2 == '.' || a2 == '>' || a2 == '<' || a2 == ';' || a2 == '+' || a2 == '-' || a2 == '*' || a2 == '/' || a2 == '[' || a2 == ']') ? false : true;
    }

    /* access modifiers changed from: package-private */
    public int b(int i2, int i3) {
        int i4;
        int m2 = i3 / m();
        int f2 = this.f6716e.f(m2);
        if (f2 >= 0 && i2 >= 0) {
            String e2 = this.f6716e.e(m2);
            int i5 = 0;
            int i6 = 0;
            while (i5 < e2.length()) {
                char charAt = e2.charAt(i5);
                if (charAt == '\n' || charAt == 65535) {
                    i4 = getEOLAdvance();
                } else if (charAt == ' ') {
                    i4 = getSpaceAdvance();
                } else if (charAt == '\t') {
                    i4 = getTabAdvance();
                } else {
                    i4 = (int) this.o.measureText(new char[]{charAt}, 0, 1);
                }
                i6 += i4;
                if (i6 >= i2) {
                    break;
                }
                i5++;
            }
            if (i5 < e2.length()) {
                return f2 + i5;
            }
        }
        return -1;
    }

    public void b(ClipboardManager clipboardManager) {
        this.f6717f.b(clipboardManager);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (z2) {
            inputMethodManager.showSoftInput(this, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f6722k == this.f6716e.f() - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean b(char c2) {
        return c2 == this.H;
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        Runnable runnable;
        if (i2 == 0) {
            removeCallbacks(this.O);
            if (!c()) {
                runnable = this.O;
            }
            return false;
        } else if (i2 == 1) {
            removeCallbacks(this.N);
            if (!d()) {
                runnable = this.N;
            }
            return false;
        } else if (i2 != 2) {
            if (i2 != 3) {
                o0.a("Invalid scroll direction");
            } else {
                removeCallbacks(this.Q);
                if (!b() && this.f6723l == this.f6716e.c(this.f6722k + 1)) {
                    runnable = this.Q;
                }
            }
            return false;
        } else {
            removeCallbacks(this.P);
            int i3 = this.f6722k;
            if (i3 > 0 && this.f6723l == this.f6716e.c(i3 - 1)) {
                runnable = this.P;
            }
            return false;
        }
        post(runnable);
        return true;
    }

    /* access modifiers changed from: package-private */
    public Rect c(int i2) {
        if (i2 < 0 || i2 >= this.f6716e.f()) {
            return new Rect(-1, -1, -1, -1);
        }
        int c2 = this.f6716e.c(i2) * m();
        h0 d2 = d(i2);
        return new Rect(d2.a(), c2, d2.b(), m() + c2);
    }

    /* access modifiers changed from: package-private */
    public void c(int i2, int i3) {
        this.f6719h.fling(getScrollX(), getScrollY(), i2, i3, 0, getMaxScrollX(), 0, getMaxScrollY());
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return this.f6723l == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean c(char c2) {
        char c3;
        char c4 = '}';
        if (c2 == '}') {
            c3 = '{';
        } else {
            c4 = ')';
            if (c2 != ')') {
                return false;
            }
            c3 = '(';
        }
        this.G = c3;
        this.H = c4;
        return true;
    }

    public void computeScroll() {
        if (this.f6719h.computeScrollOffset()) {
            scrollTo(this.f6719h.getCurrX(), this.f6719h.getCurrY());
        }
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        return getScrollY();
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        return (this.f6716e.j() * m()) + getPaddingTop() + getPaddingBottom();
    }

    /* access modifiers changed from: protected */
    public h0 d(int i2) {
        int tabAdvance;
        int c2 = this.f6716e.c(i2);
        e.d.a.a.j jVar = this.f6716e;
        int h2 = jVar.h(jVar.f(c2));
        int i3 = 0;
        int i4 = 0;
        while (h2 <= i2 && this.f6716e.l()) {
            char o2 = this.f6716e.o();
            if (o2 != '\t') {
                if (o2 != '\n') {
                    if (o2 == ' ') {
                        tabAdvance = getSpaceAdvance();
                    } else if (o2 != 65535) {
                        tabAdvance = (int) this.o.measureText(new char[]{o2}, 0, 1);
                    }
                }
                tabAdvance = getEOLAdvance();
            } else {
                tabAdvance = getTabAdvance();
            }
            h2++;
            i4 = tabAdvance + i4;
            i3 = i4;
        }
        return new h0(i3, i4);
    }

    public void d(int i2, int i3) {
        this.f6717f.a(i2, i3, true);
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return this.f6723l == this.f6716e.j() - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean d(char c2) {
        return c2 == this.G;
    }

    /* access modifiers changed from: protected */
    public int e(int i2) {
        int c2 = this.f6716e.c(i2);
        o0.a(c2 >= 0, "Invalid char offset given to getColumn");
        return i2 - this.f6716e.f(c2);
    }

    public e.d.a.a.j e() {
        return new e.d.a.a.j(this.f6716e, this);
    }

    /* access modifiers changed from: package-private */
    public boolean e(char c2) {
        char c3;
        if (c2 == '{') {
            this.G = '{';
            c3 = '}';
        } else if (c2 != '(') {
            return false;
        } else {
            this.G = '(';
            c3 = ')';
        }
        this.H = c3;
        return true;
    }

    public void f() {
        this.f6717f.a(false);
    }

    public boolean f(int i2) {
        return this.f6717f.c(i2);
    }

    public void g() {
        this.f6717f.a(true);
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i2) {
        int i3;
        h0 h0Var;
        List<h0> k2 = this.f6716e.k();
        h0 h0Var2 = k2.get(0);
        int i4 = 1;
        while (true) {
            if (i4 < k2.size()) {
                i3 = i4 + 1;
                h0Var = k2.get(i4);
            } else {
                i3 = i4;
                h0Var = null;
            }
            if (h0Var != null && h0Var.a() <= i2) {
                h0Var2 = h0Var;
                i4 = i3;
            }
        }
        return h0Var2.b() == 0 || g0.a(h0Var2.b());
    }

    public int getCaretPosition() {
        return this.f6722k;
    }

    public int getCaretRow() {
        return this.f6723l;
    }

    public e.d.a.a.b getColorScheme() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* access modifiers changed from: protected */
    public int getContentWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* access modifiers changed from: protected */
    public int getEOLAdvance() {
        return (int) (this.t ? this.o.measureText("↵", 0, 1) : T * this.o.measureText(" ", 0, 1));
    }

    public m getLanguage() {
        return getLexer().c();
    }

    public g0 getLexer() {
        return this.f6717f.f6732b;
    }

    /* access modifiers changed from: package-private */
    public int getMaxScrollX() {
        return Math.max(0, (this.p - getContentWidth()) + this.f6715d.a().right);
    }

    /* access modifiers changed from: package-private */
    public int getMaxScrollY() {
        int contentHeight = getContentHeight();
        if (getResources().getConfiguration().orientation != 2) {
            contentHeight *= 3;
        }
        return Math.max(0, ((this.f6716e.j() * m()) - (contentHeight / 4)) + this.f6715d.a().bottom);
    }

    /* access modifiers changed from: protected */
    public int getNumVisibleRows() {
        return (int) Math.ceil(((double) getContentHeight()) / ((double) m()));
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() + this.D;
    }

    @Override // e.d.a.a.i.a
    public final int getRowWidth() {
        return getContentWidth();
    }

    public int getSelectionEnd() {
        return this.n;
    }

    public int getSelectionStart() {
        return this.f6724m;
    }

    /* access modifiers changed from: protected */
    public int getSpaceAdvance() {
        Paint paint;
        String str;
        if (this.t) {
            paint = this.o;
            str = "·";
        } else {
            paint = this.o;
            str = " ";
        }
        return (int) paint.measureText(str, 0, 1);
    }

    /* access modifiers changed from: protected */
    public int getTabAdvance() {
        int i2;
        Paint paint;
        String str;
        if (this.t) {
            i2 = this.q;
            paint = this.o;
            str = "·";
        } else {
            i2 = this.q;
            paint = this.o;
            str = " ";
        }
        return i2 * ((int) paint.measureText(str, 0, 1));
    }

    public Parcelable getUiState() {
        return new j(this);
    }

    public void h(int i2) {
        this.f6717f.d(i2);
    }

    public boolean h() {
        return !this.f6719h.isFinished();
    }

    public void i(int i2) {
        this.f6717f.e(i2);
    }

    public final boolean i() {
        return this.f6717f.i();
    }

    public boolean isSaveEnabled() {
        return true;
    }

    public void j() {
        this.f6717f.c(false);
    }

    public void k() {
        this.f6717f.d(false);
    }

    public void l() {
        this.f6717f.b();
    }

    /* access modifiers changed from: protected */
    public int m() {
        Paint.FontMetricsInt fontMetricsInt = this.o.getFontMetricsInt();
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public void n() {
        this.f6717f.a(0, this.f6716e.f() - 1, false);
    }

    public void o() {
        this.f6715d.c();
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.inputType = (this.z ? 0 : 144) | 131073;
        try {
            this.B = Settings.Secure.getString(this.f6715d.f6748b.f6714c.getContentResolver(), "default_input_method").toLowerCase().contains("swiftkey");
        } catch (Exception unused) {
        }
        if (this.B && !this.z) {
            editorInfo.inputType |= 8;
        }
        editorInfo.imeOptions = 1342177286;
        editorInfo.initialCapsMode = 0;
        editorInfo.initialSelStart = getCaretPosition();
        editorInfo.initialSelEnd = getCaretPosition();
        this.f6718g = new i(this);
        return this.f6718g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getScrollX() + super.getPaddingLeft(), getScrollY() + getPaddingTop(), (getScrollX() + getWidth()) - getPaddingRight(), (getScrollY() + getHeight()) - getPaddingBottom());
        canvas.translate((float) super.getPaddingLeft(), (float) getPaddingTop());
        d(canvas);
        canvas.restore();
        this.f6715d.c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        t();
    }

    @SuppressLint({"NewApi"})
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        this.f6715d.onScroll(motionEvent, motionEvent, 0.0f, (-motionEvent.getAxisValue(9)) * ((float) m()));
        return true;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z2;
        if (this.f6715d.a(i2, keyEvent)) {
            return true;
        }
        if (a(i2, keyEvent)) {
            a0 = 0;
            return true;
        }
        if (i2 == 112) {
            if (i()) {
                this.f6717f.j();
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && this.f6716e.f8226b.j(this.f6722k + 1)) {
                this.f6716e.a(this.f6722k, System.nanoTime());
                k(this.f6723l);
            }
        }
        if (b.b(keyEvent)) {
            b(i2, keyEvent);
            return true;
        } else if (i2 == 63 || keyEvent.getUnicodeChar() == 61185) {
            a(b0.get(61185), false);
            return true;
        } else {
            if (keyEvent.getMetaState() != 0) {
                a0 = keyEvent.getMetaState();
            }
            if (!this.f6714c.q) {
                a0 = keyEvent.getMetaState();
            }
            if (i2 != 61 || (keyEvent.getMetaState() & 1) == 0 || !this.f6717f.i()) {
                char a2 = b.a(keyEvent, a0);
                a0 = 0;
                if (a2 == 0) {
                    a0 = keyEvent.getMetaState();
                    return super.onKeyDown(i2, keyEvent);
                }
                int repeatCount = keyEvent.getRepeatCount();
                if (repeatCount == 1) {
                    if (this.v) {
                        f(a2);
                    } else {
                        g(a2);
                    }
                } else if (repeatCount == 0 || ((this.v && !Character.isLowerCase(a2)) || (!this.v && b0.get(a2) == null))) {
                    this.f6717f.a(a2);
                }
                return true;
            }
            a0 = 0;
            this.f6717f.d();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(o(i2), o(i3));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            this.f6716e.a();
        }
        this.f6717f.l();
        if (!n(this.f6722k)) {
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 1 && f((int) motionEvent.getX(), (int) motionEvent.getY())) {
            requestFocus();
            requestFocusFromTouch();
        }
        if (isFocused() && !this.S && this.f6718g == null) {
            this.S = true;
            clearFocus();
            requestFocus();
            requestFocusFromTouch();
        }
        this.f6715d.a(motionEvent);
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        while (round > 0) {
            this.f6717f.d(false);
            round--;
        }
        while (round < 0) {
            this.f6717f.c(false);
            round++;
        }
        while (round2 > 0) {
            this.f6717f.b(false);
            round2--;
        }
        while (round2 < 0) {
            this.f6717f.e(false);
            round2++;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        removeCallbacks(this.N);
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
    }

    public void q() {
        this.f6719h.forceFinished(true);
    }

    public void setAllowSuggestions(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            h hVar = this.f6717f;
            if (hVar != null) {
                hVar.k();
            }
        }
    }

    public void setAutoIndent(boolean z2) {
        this.u = z2;
    }

    public void setChirality(boolean z2) {
        this.f6715d.a(z2);
    }

    public void setColorScheme(e.d.a.a.b bVar) {
        this.r = bVar;
        this.f6715d.a(bVar);
        setBackgroundColor(bVar.a(b.a.BACKGROUND));
    }

    public void setDocumentProvider(e.d.a.a.j jVar) {
        this.f6716e = jVar;
        w();
        this.f6717f.a();
        this.f6717f.b();
        invalidate();
    }

    public void setEdited(boolean z2) {
        this.f6714c.e0();
    }

    public void setHighlightCurrentRow(boolean z2) {
        this.s = z2;
        t();
    }

    public void setLanguage(m mVar) {
        getLexer().a(mVar);
    }

    public void setLongPressCaps(boolean z2) {
        this.v = z2;
    }

    public void setNavigationMethod(d dVar) {
        this.f6715d = dVar;
    }

    public void setNonPrintingCharVisibility(boolean z2) {
        if (this.t ^ z2) {
            this.t = z2;
            this.f6716e.a();
            this.f6717f.l();
            if (!n(this.f6722k)) {
                invalidate();
            }
        }
    }

    public void setRowListener(l0 l0Var) {
        this.f6720i = l0Var;
    }

    public void setSelModeListener(c cVar) {
        this.f6721j = cVar;
    }

    public void setShowLineNumbers(boolean z2) {
        this.x = z2;
        a();
    }

    public void setTabInsertsSpaces(boolean z2) {
        this.y = z2;
    }

    public void setTabSpaces(int i2) {
        if (i2 >= 0) {
            this.L = null;
            this.q = i2;
            this.f6716e.a();
            this.f6717f.l();
            if (!n(this.f6722k)) {
                invalidate();
            }
        }
    }

    public void setTypeface(Typeface typeface) {
        this.o.setTypeface(typeface);
        this.f6716e.a();
        a();
        this.f6717f.l();
        if (!n(this.f6722k)) {
            invalidate();
        }
    }

    public void setUseBraceComplete(boolean z2) {
        this.w = z2;
    }

    public void setWordWrap(boolean z2) {
        this.f6716e.a(z2);
        if (z2) {
            this.p = 0;
            scrollTo(0, 0);
        }
        this.f6717f.l();
        if (!n(this.f6722k)) {
            invalidate();
        }
    }

    public void setZoom(float f2) {
        if (f2 > 0.0f) {
            this.o.setTextSize((float) ((int) (f2 * getContext().getResources().getDisplayMetrics().density)));
            a();
            this.f6716e.a();
            this.f6717f.l();
            if (!n(this.f6722k)) {
                invalidate();
            }
        }
    }
}
