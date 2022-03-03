package iiec.androidterm.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.widget.Scroller;
import iiec.androidterm.r.t.h;
import java.io.IOException;
import java.util.Arrays;
import java.util.Hashtable;

public class e extends View implements GestureDetector.OnGestureListener {
    private static final boolean c0 = Build.MODEL.contains("Transformer TF101");
    private static Linkify.MatchFilter d0 = new C0145e(null);
    private int A;
    private int B;
    private boolean C = false;
    private boolean D = false;
    private boolean E;
    private float F;
    private float G;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = -1;
    private int L = -1;
    private int M = -1;
    private Runnable N = new a();
    private GestureDetector O;
    private GestureDetector.OnGestureListener P;
    private Scroller Q;
    private Runnable R = new b();
    private Hashtable<Integer, URLSpan[]> S = new Hashtable<>();
    private f T = new f(this, null);
    private float U;
    private l V;
    private String W = "";
    private final Handler a0 = new Handler();

    /* renamed from: b  reason: collision with root package name */
    private boolean f9361b;
    private s b0 = new c();

    /* renamed from: c  reason: collision with root package name */
    private boolean f9362c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f9363d;

    /* renamed from: e  reason: collision with root package name */
    private int f9364e;

    /* renamed from: f  reason: collision with root package name */
    private m f9365f;

    /* renamed from: g  reason: collision with root package name */
    private float f9366g;

    /* renamed from: h  reason: collision with root package name */
    private int f9367h;

    /* renamed from: i  reason: collision with root package name */
    private int f9368i;

    /* renamed from: j  reason: collision with root package name */
    private o f9369j;

    /* renamed from: k  reason: collision with root package name */
    private int f9370k = 10;

    /* renamed from: l  reason: collision with root package name */
    private int f9371l;

    /* renamed from: m  reason: collision with root package name */
    private d f9372m = a.t;
    private Paint n;
    private Paint o;
    private boolean p;
    private n q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x = true;
    private boolean y = false;
    private boolean z = false;

    class a implements Runnable {
        a() {
        }

        public void run() {
            if (e.this.f9371l != 0) {
                e eVar = e.this;
                eVar.x = true ^ eVar.x;
                e.this.a0.postDelayed(this, 1000);
            } else {
                e.this.x = true;
            }
            e.this.invalidate();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (!e.this.Q.isFinished() && !e.this.a()) {
                boolean computeScrollOffset = e.this.Q.computeScrollOffset();
                int currY = e.this.Q.getCurrY();
                if (currY != e.this.v) {
                    e.this.v = currY;
                    e.this.invalidate();
                }
                if (computeScrollOffset) {
                    e.this.post(this);
                }
            }
        }
    }

    class c implements s {
        c() {
        }

        @Override // iiec.androidterm.r.s
        public void b() {
            if (e.this.y) {
                int i2 = e.this.q.i();
                e.a(e.this, i2);
                e.b(e.this, i2);
                e.c(e.this, i2);
            }
            e.this.q.a();
            e.this.h();
            e.this.invalidate();
        }
    }

    class d extends BaseInputConnection {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private int f9376b;

        /* renamed from: c  reason: collision with root package name */
        private int f9377c;

        /* renamed from: d  reason: collision with root package name */
        private int f9378d;

        /* renamed from: e  reason: collision with root package name */
        private int f9379e;

        d(View view, boolean z) {
            super(view, z);
        }

        private void a() {
            int length = e.this.W.length();
            if (this.f9376b <= length && this.f9377c <= length) {
                e eVar = e.this;
                eVar.setImeBuffer(e.this.W.substring(0, this.f9376b) + e.this.W.substring(this.f9377c));
                int i2 = this.a;
                int i3 = this.f9376b;
                if (i2 >= i3) {
                    int i4 = this.f9377c;
                    if (i2 < i4) {
                        this.a = i3;
                    } else {
                        this.a = i2 - (i4 - i3);
                    }
                }
            }
            this.f9376b = 0;
            this.f9377c = 0;
        }

        private void a(int i2) {
            int a2 = e.this.V.a(i2);
            if (a2 < 10485760) {
                e.this.f9365f.a(a2);
            } else {
                e.this.V.a(a2 - 10485760, (KeyEvent) null, e.this.getKeypadApplicationMode());
            }
            e.this.g();
        }

        private void a(CharSequence charSequence) {
            int length = charSequence.length();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char charAt = charSequence.charAt(i2);
                    boolean isHighSurrogate = Character.isHighSurrogate(charAt);
                    int i3 = charAt;
                    if (isHighSurrogate) {
                        i2++;
                        i3 = i2 < length ? Character.toCodePoint(charAt, charSequence.charAt(i2)) : 65533;
                    }
                    a(i3 == 1 ? 1 : 0);
                    i2++;
                } catch (IOException e2) {
                    Log.e("EmulatorView", "error writing ", e2);
                    return;
                }
            }
        }

        public boolean beginBatchEdit() {
            e.this.setImeBuffer("");
            this.a = 0;
            this.f9376b = 0;
            this.f9377c = 0;
            return true;
        }

        public boolean clearMetaKeyStates(int i2) {
            return false;
        }

        public boolean commitCompletion(CompletionInfo completionInfo) {
            return false;
        }

        public boolean commitCorrection(CorrectionInfo correctionInfo) {
            return true;
        }

        public boolean commitText(CharSequence charSequence, int i2) {
            a();
            a(charSequence);
            e.this.setImeBuffer("");
            this.a = 0;
            return true;
        }

        public boolean deleteSurroundingText(int i2, int i3) {
            if (i2 > 0) {
                for (int i4 = 0; i4 < i2; i4++) {
                    sendKeyEvent(new KeyEvent(0, 67));
                }
                return true;
            } else if (i2 != 0 || i3 != 0) {
                return true;
            } else {
                sendKeyEvent(new KeyEvent(0, 67));
                return true;
            }
        }

        public boolean endBatchEdit() {
            return true;
        }

        public boolean finishComposingText() {
            a(e.this.W);
            e.this.setImeBuffer("");
            this.f9376b = 0;
            this.f9377c = 0;
            this.a = 0;
            return true;
        }

        public int getCursorCapsMode(int i2) {
            return (i2 & 4096) != 0 ? 4096 : 0;
        }

        public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
            return null;
        }

        public CharSequence getSelectedText(int i2) {
            int length = e.this.W.length();
            int i3 = this.f9379e;
            return (i3 >= length || this.f9378d > i3) ? "" : e.this.W.substring(this.f9378d, this.f9379e + 1);
        }

        public CharSequence getTextAfterCursor(int i2, int i3) {
            int i4;
            int min = Math.min(i2, e.this.W.length() - this.a);
            if (min <= 0 || (i4 = this.a) < 0 || i4 >= e.this.W.length()) {
                return "";
            }
            String str = e.this.W;
            int i5 = this.a;
            return str.substring(i5, min + i5);
        }

        public CharSequence getTextBeforeCursor(int i2, int i3) {
            int i4;
            int min = Math.min(i2, this.a);
            if (min <= 0 || (i4 = this.a) < 0 || i4 >= e.this.W.length()) {
                return "";
            }
            String str = e.this.W;
            int i5 = this.a;
            return str.substring(i5 - min, i5);
        }

        public boolean performContextMenuAction(int i2) {
            return true;
        }

        public boolean performEditorAction(int i2) {
            if (i2 != 0) {
                return true;
            }
            a("\r");
            return true;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            return true;
        }

        public boolean reportFullscreenMode(boolean z) {
            return true;
        }

        public boolean sendKeyEvent(KeyEvent keyEvent) {
            e.this.dispatchKeyEvent(keyEvent);
            return true;
        }

        public boolean setComposingRegion(int i2, int i3) {
            if (i2 >= i3 || i2 <= 0 || i3 >= e.this.W.length()) {
                return true;
            }
            a();
            this.f9376b = i2;
            this.f9377c = i3;
            return true;
        }

        public boolean setComposingText(CharSequence charSequence, int i2) {
            int length = e.this.W.length();
            if (this.f9376b > length || this.f9377c > length) {
                return false;
            }
            e eVar = e.this;
            eVar.setImeBuffer(e.this.W.substring(0, this.f9376b) + ((Object) charSequence) + e.this.W.substring(this.f9377c));
            this.f9377c = this.f9376b + charSequence.length();
            this.a = i2 > 0 ? (this.f9377c + i2) - 1 : this.f9376b - i2;
            return true;
        }

        public boolean setSelection(int i2, int i3) {
            int length = e.this.W.length();
            if (i2 == i3 && i2 > 0 && i2 < length) {
                this.f9379e = 0;
                this.f9378d = 0;
            } else if (i2 >= i3 || i2 <= 0 || i3 >= length) {
                return true;
            } else {
                this.f9378d = i2;
                this.f9379e = i3;
            }
            this.a = i2;
            return true;
        }
    }

    /* renamed from: iiec.androidterm.r.e$e  reason: collision with other inner class name */
    private static class C0145e implements Linkify.MatchFilter {
        private C0145e() {
        }

        /* synthetic */ C0145e(a aVar) {
            this();
        }

        private boolean a(CharSequence charSequence, int i2, int i3, String str) {
            int length = str.length();
            if (length > i3 - i2) {
                return false;
            }
            for (int i4 = 0; i4 < length; i4++) {
                if (charSequence.charAt(i2 + i4) != str.charAt(i4)) {
                    return false;
                }
            }
            return true;
        }

        public boolean acceptMatch(CharSequence charSequence, int i2, int i3) {
            return a(charSequence, i2, i3, "http:") || a(charSequence, i2, i3, "https:");
        }
    }

    /* access modifiers changed from: private */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private Scroller f9381b;

        /* renamed from: c  reason: collision with root package name */
        private int f9382c;

        /* renamed from: d  reason: collision with root package name */
        private MotionEvent f9383d;

        private f() {
        }

        /* synthetic */ f(e eVar, a aVar) {
            this();
        }

        public void a(MotionEvent motionEvent, float f2, float f3) {
            this.f9381b.fling(0, 0, -((int) (f2 * 0.15f)), -((int) (f3 * 0.15f)), 0, 0, -100, 100);
            this.f9382c = 0;
            this.f9383d = motionEvent;
            e.this.post(this);
        }

        public void run() {
            if (!this.f9381b.isFinished() && e.this.a()) {
                boolean computeScrollOffset = this.f9381b.computeScrollOffset();
                int currY = this.f9381b.getCurrY();
                while (this.f9382c < currY) {
                    e.this.a((e) this.f9383d, (MotionEvent) 65);
                    this.f9382c++;
                }
                while (this.f9382c > currY) {
                    e.this.a((e) this.f9383d, (MotionEvent) 64);
                    this.f9382c--;
                }
                if (computeScrollOffset) {
                    e.this.post(this);
                }
            }
        }
    }

    public e(Context context, m mVar, DisplayMetrics displayMetrics) {
        super(context);
        a(mVar);
        setDensity(displayMetrics);
        a(context);
    }

    private int a(int i2) {
        int i3;
        URLSpan[] uRLSpanArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        URLSpan[] uRLSpanArr2;
        int i11;
        int i12;
        int i13;
        q h2 = this.q.h();
        char[] a2 = h2.a(i2);
        if (a2 == null) {
            return 1;
        }
        boolean c2 = h2.c(i2);
        if (c2) {
            i3 = a2.length;
        } else {
            i3 = 0;
            while (a2[i3] != 0) {
                i3++;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new String(a2, 0, i3));
        boolean b2 = h2.b(i2);
        boolean z2 = c2;
        int i14 = 1;
        while (b2) {
            int i15 = i2 + i14;
            char[] a3 = h2.a(i15);
            if (a3 == null) {
                break;
            }
            boolean c3 = h2.c(i15);
            if (z2 && !c3) {
                z2 = c3;
            }
            if (c3) {
                i13 = a3.length;
            } else {
                i13 = 0;
                while (a3[i13] != 0) {
                    i13++;
                }
            }
            spannableStringBuilder.append((CharSequence) new String(a3, 0, i13));
            b2 = h2.b(i15);
            i14++;
        }
        Linkify.addLinks(spannableStringBuilder, h.a, (String) null, d0, (Linkify.TransformFilter) null);
        URLSpan[] uRLSpanArr3 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr3.length > 0) {
            int i16 = this.s;
            int i17 = i2 - this.v;
            URLSpan[][] uRLSpanArr4 = new URLSpan[i14][];
            for (int i18 = 0; i18 < i14; i18++) {
                uRLSpanArr4[i18] = new URLSpan[i16];
                Arrays.fill(uRLSpanArr4[i18], (Object) null);
            }
            int i19 = 0;
            while (i19 < uRLSpanArr3.length) {
                URLSpan uRLSpan = uRLSpanArr3[i19];
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (z2) {
                    int i20 = spanEnd - 1;
                    int i21 = this.s;
                    i4 = spanStart / i21;
                    int i22 = i20 / i21;
                    i5 = i20 % i21;
                    uRLSpanArr = uRLSpanArr3;
                    i6 = spanStart % i21;
                    i7 = i22;
                    i8 = 1;
                } else {
                    int i23 = 0;
                    i4 = 0;
                    int i24 = 0;
                    while (i23 < spanStart) {
                        char charAt = spannableStringBuilder.charAt(i23);
                        if (Character.isHighSurrogate(charAt)) {
                            i23++;
                            i12 = r.a(charAt, spannableStringBuilder.charAt(i23));
                        } else {
                            i12 = r.g(charAt);
                        }
                        int i25 = i24 + i12;
                        if (i25 >= i16) {
                            i4++;
                            i25 %= i16;
                        }
                        i24 = i25;
                        i23++;
                    }
                    int i26 = i4;
                    int i27 = i24;
                    while (spanStart < spanEnd) {
                        char charAt2 = spannableStringBuilder.charAt(spanStart);
                        if (Character.isHighSurrogate(charAt2)) {
                            spanStart++;
                            uRLSpanArr2 = uRLSpanArr3;
                            i11 = r.a(charAt2, spannableStringBuilder.charAt(spanStart));
                        } else {
                            uRLSpanArr2 = uRLSpanArr3;
                            i11 = r.g(charAt2);
                        }
                        i27 += i11;
                        if (i27 >= i16) {
                            i26++;
                            i27 %= i16;
                        }
                        spanStart++;
                        uRLSpanArr3 = uRLSpanArr2;
                    }
                    uRLSpanArr = uRLSpanArr3;
                    i8 = 1;
                    i5 = i27;
                    i7 = i26;
                    i6 = i24;
                }
                int i28 = i4;
                while (i28 <= i7) {
                    int i29 = i28 == i4 ? i6 : 0;
                    if (i28 == i7) {
                        i9 = i7;
                        i10 = i5;
                    } else {
                        i10 = this.s - i8;
                        i9 = i7;
                    }
                    Arrays.fill(uRLSpanArr4[i28], i29, i10 + i8, uRLSpan);
                    i28++;
                    i16 = i16;
                    i7 = i9;
                }
                i19++;
                uRLSpanArr3 = uRLSpanArr;
            }
            for (int i30 = 0; i30 < i14; i30++) {
                this.S.put(Integer.valueOf(i17 + i30), uRLSpanArr4[i30]);
            }
        }
        return i14;
    }

    static /* synthetic */ int a(e eVar, int i2) {
        int i3 = eVar.K - i2;
        eVar.K = i3;
        return i3;
    }

    private void a(int i2, int i3) {
        this.s = Math.max(1, (int) (((float) i2) / this.f9366g));
        this.t = Math.max(1, (int) (((float) this.f9363d) / this.f9366g));
        this.f9368i = this.f9369j.c();
        this.r = Math.max(1, (i3 - this.f9368i) / this.f9367h);
        this.u = Math.max(1, (this.f9364e - this.f9368i) / this.f9367h);
        this.f9365f.b(this.s, this.r);
        this.v = 0;
        this.w = 0;
        invalidate();
    }

    private void a(Context context) {
        this.Q = new Scroller(context);
        this.T.f9381b = new Scroller(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(MotionEvent motionEvent, int i2) {
        int x2 = ((int) (motionEvent.getX() / this.f9366g)) + 1;
        int y2 = ((int) ((motionEvent.getY() - ((float) this.f9368i)) / ((float) this.f9367h))) + 1;
        boolean z2 = x2 < 1 || y2 < 1 || x2 > this.s || y2 > this.r || x2 > 223 || y2 > 223;
        if (i2 < 0 || i2 > 223) {
            Log.e("EmulatorView", "mouse button_code out of range: " + i2);
        } else if (!z2) {
            byte[] bArr = {27, 91, 77, (byte) (i2 + 32), (byte) (x2 + 32), (byte) (y2 + 32)};
            this.f9365f.c(bArr, 0, bArr.length);
        }
    }

    private boolean a(int i2, KeyEvent keyEvent) {
        boolean z2 = false;
        if (i2 != 113 && i2 != 114) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            z2 = true;
        }
        this.V.c(z2);
        invalidate();
        return true;
    }

    private boolean a(int i2, boolean z2) {
        if (i2 != this.A) {
            return false;
        }
        this.V.a(z2);
        invalidate();
        return true;
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x2 = (int) (motionEvent.getX() / this.f9366g);
        int max = Math.max(0, ((int) ((motionEvent.getY() + (this.G * -40.0f)) / ((float) this.f9367h))) + this.v);
        if (action != 0) {
            if (action == 1 || action == 2) {
                int min = Math.min(this.H, x2);
                int max2 = Math.max(this.H, x2);
                int min2 = Math.min(this.I, max);
                int max3 = Math.max(this.I, max);
                this.J = min;
                this.K = min2;
                this.L = max2;
                this.M = max3;
                if (action == 1) {
                    iiec.androidterm.r.t.e.a(getContext().getApplicationContext()).a(getSelectedText().trim());
                }
                invalidate();
            }
            f();
            invalidate();
        } else {
            this.H = x2;
            this.I = max;
            this.J = x2;
            this.K = max;
            this.L = this.J;
            this.M = this.K;
        }
        return true;
    }

    static /* synthetic */ int b(e eVar, int i2) {
        int i3 = eVar.M - i2;
        eVar.M = i3;
        return i3;
    }

    private boolean b(int i2) {
        return i2 == 4 && this.z;
    }

    private boolean b(int i2, KeyEvent keyEvent) {
        return keyEvent.isSystem();
    }

    private boolean b(int i2, boolean z2) {
        if (i2 != this.B) {
            return false;
        }
        this.V.b(z2);
        invalidate();
        return true;
    }

    static /* synthetic */ int c(e eVar, int i2) {
        int i3 = eVar.I - i2;
        eVar.I = i3;
        return i3;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void g() {
        if (this.C) {
            this.C = false;
            this.V.a(false);
            invalidate();
        }
        if (this.D) {
            this.D = false;
            this.V.b(false);
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h() {
        this.v = 0;
        if (this.t > 0) {
            int c2 = this.q.c();
            int c3 = this.q.c() - this.w;
            if (c3 >= 0) {
                int i2 = this.t;
                if (c3 >= i2) {
                    c2 = (c2 - i2) + 1;
                } else {
                    return;
                }
            }
            this.w = c2;
        }
    }

    private void i() {
        m mVar = this.f9365f;
        j();
        this.q = mVar.b();
        mVar.c(this.b0);
        requestFocus();
    }

    private void j() {
        d dVar = this.f9372m;
        int i2 = this.f9370k;
        if (i2 > 0) {
            this.f9369j = new h(i2, dVar);
        } else {
            this.f9369j = new b(getResources(), dVar);
        }
        this.n.setColor(dVar.d());
        this.o.setColor(dVar.a());
        this.f9366g = this.f9369j.a();
        this.f9367h = this.f9369j.b();
        a(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setImeBuffer(String str) {
        if (!str.equals(this.W)) {
            invalidate();
        }
        this.W = str;
    }

    public String a(float f2, float f3) {
        URLSpan uRLSpan;
        float width = (float) getWidth();
        float height = (float) getHeight();
        if (!(width == 0.0f || height == 0.0f)) {
            int floor = (int) Math.floor((double) ((f3 / height) * ((float) this.r)));
            int floor2 = (int) Math.floor((double) ((f2 / width) * ((float) this.s)));
            URLSpan[] uRLSpanArr = this.S.get(Integer.valueOf(floor));
            if (!(uRLSpanArr == null || (uRLSpan = uRLSpanArr[floor2]) == null)) {
                return uRLSpan.getURL();
            }
        }
        return null;
    }

    public void a(m mVar) {
        this.f9369j = null;
        this.n = new Paint();
        this.o = new Paint();
        this.v = 0;
        this.w = 0;
        this.O = new GestureDetector(this);
        setVerticalScrollBarEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f9365f = mVar;
        this.V = new l(mVar);
        mVar.a(this.V);
        if (this.f9362c) {
            this.f9362c = false;
            this.f9361b = true;
            i();
        }
    }

    public void a(boolean z2) {
        this.S.clear();
        if (this.f9361b) {
            int width = getWidth();
            int height = getHeight();
            if (z2 || width != this.f9363d || height != this.f9364e) {
                this.f9363d = width;
                this.f9364e = height;
                a(this.f9363d, this.f9364e);
            }
        }
    }

    public boolean a() {
        return this.q.f() != 0 && this.E;
    }

    public void b() {
        if (this.f9371l != 0) {
            this.a0.removeCallbacks(this.N);
        }
        l lVar = this.V;
        if (lVar != null) {
            lVar.f();
        }
    }

    public void c() {
        a(false);
        if (this.f9371l != 0) {
            this.a0.postDelayed(this.N, 1000);
        }
        l lVar = this.V;
        if (lVar != null) {
            lVar.g();
        }
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollExtent() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        return (this.q.h().b() + this.v) - this.r;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        return this.q.h().b();
    }

    public void d() {
        this.C = true;
        this.V.a(true);
        invalidate();
    }

    public void e() {
        this.D = true;
        this.V.b(true);
        invalidate();
    }

    public void f() {
        this.y = !this.y;
        setVerticalScrollBarEnabled(!this.y);
        if (!this.y) {
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
        }
    }

    public boolean getKeypadApplicationMode() {
        return this.q.e();
    }

    public String getSelectedText() {
        return this.q.a(this.J, this.K, this.L, this.M);
    }

    public boolean getSelectingText() {
        return this.y;
    }

    public m getTermSession() {
        return this.f9365f;
    }

    public int getVisibleColumns() {
        return this.t;
    }

    public int getVisibleHeight() {
        return this.f9364e;
    }

    public int getVisibleRows() {
        return this.u;
    }

    public int getVisibleWidth() {
        return this.f9363d;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z2;
        int i2 = 0;
        try {
            z2 = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method").toLowerCase().contains(".samsung.");
        } catch (Exception unused) {
            z2 = false;
        }
        if (this.p) {
            i2 = 1;
        } else if (z2) {
            i2 = 145;
        }
        editorInfo.inputType = i2;
        return new d(this, true);
    }

    public boolean onDown(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.P;
        if (onGestureListener != null && onGestureListener.onDown(motionEvent)) {
            return true;
        }
        this.U = 0.0f;
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        a(false);
        if (this.q != null) {
            int width = getWidth();
            int height = getHeight();
            boolean g2 = this.q.g();
            this.f9369j.a(g2);
            canvas.drawRect(0.0f, 0.0f, (float) width, (float) height, g2 ? this.n : this.o);
            float f2 = ((float) (-this.w)) * this.f9366g;
            float f3 = (float) (this.f9367h + this.f9368i);
            int i4 = this.v + this.r;
            int c2 = this.q.c();
            int d2 = this.q.d();
            boolean z2 = this.x && this.q.j();
            String str = this.W;
            int b2 = this.V.b();
            if (b2 != 0) {
                str = str + String.valueOf((char) b2);
            }
            int c3 = this.V.c();
            float f4 = f3;
            int i5 = this.v;
            int i6 = 0;
            while (i5 < i4) {
                int i7 = (i5 != d2 || !z2) ? -1 : c2;
                int i8 = this.K;
                if (i5 < i8 || i5 > this.M) {
                    i3 = -1;
                    i2 = -1;
                } else {
                    i3 = i5 == i8 ? this.J : -1;
                    i2 = i5 == this.M ? this.L : this.s;
                }
                this.q.h().a(i5, canvas, f2, f4, this.f9369j, i7, i3, i2, str, c3);
                f4 += (float) this.f9367h;
                if (i6 == 0) {
                    i6 = a(i5);
                }
                i6--;
                i5++;
                d2 = d2;
            }
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        GestureDetector.OnGestureListener onGestureListener = this.P;
        if (onGestureListener != null && onGestureListener.onFling(motionEvent, motionEvent2, f2, f3)) {
            return true;
        }
        this.U = 0.0f;
        if (a()) {
            this.T.a(motionEvent, f2, f3);
        } else {
            this.Q.fling(0, this.v, -((int) (f2 * 0.25f)), -((int) (f3 * 0.25f)), 0, 0, -this.q.h().c(), 0);
            post(this.R);
        }
        return true;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (a(i2, true) || b(i2, true)) {
            return true;
        }
        if (b(i2, keyEvent) && !b(i2)) {
            return super.onKeyDown(i2, keyEvent);
        }
        try {
            int b2 = this.V.b();
            int c2 = this.V.c();
            this.V.a(i2, keyEvent, getKeypadApplicationMode(), l.a(keyEvent));
            if (!(this.V.b() == b2 && this.V.c() == c2)) {
                invalidate();
            }
        } catch (IOException unused) {
        }
        return true;
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        if (c0) {
            boolean a2 = this.V.a();
            boolean z2 = false;
            boolean z3 = (keyEvent.getMetaState() & 2) != 0;
            boolean z4 = (keyEvent.getMetaState() & 65536) != 0;
            if (i2 == 57 || i2 == 58) {
                z2 = true;
            }
            boolean d2 = this.V.d();
            if (a2 && (z3 || z2 || d2 || z4)) {
                return keyEvent.getAction() == 0 ? onKeyDown(i2, keyEvent) : onKeyUp(i2, keyEvent);
            }
        }
        if (a(i2, keyEvent)) {
            return true;
        }
        return this.V.e() ? keyEvent.getAction() == 0 ? onKeyDown(i2, keyEvent) : onKeyUp(i2, keyEvent) : super.onKeyPreIme(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (a(i2, false) || b(i2, false)) {
            return true;
        }
        if (b(i2, keyEvent) && !b(i2)) {
            return super.onKeyUp(i2, keyEvent);
        }
        this.V.a(i2, keyEvent);
        g();
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        showContextMenu();
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        GestureDetector.OnGestureListener onGestureListener = this.P;
        if (onGestureListener != null && onGestureListener.onScroll(motionEvent, motionEvent2, f2, f3)) {
            return true;
        }
        float f4 = f3 + this.U;
        int i2 = this.f9367h;
        int i3 = (int) (f4 / ((float) i2));
        this.U = f4 - ((float) (i2 * i3));
        if (a()) {
            while (i3 > 0) {
                a(motionEvent, 65);
                i3--;
            }
            while (i3 < 0) {
                a(motionEvent, 64);
                i3++;
            }
            return true;
        }
        this.v = Math.min(0, Math.max(-this.q.h().c(), this.v + i3));
        invalidate();
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.P;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.P;
        if (onGestureListener != null && onGestureListener.onSingleTapUp(motionEvent)) {
            return true;
        }
        if (a()) {
            a(motionEvent, 0);
            a(motionEvent, 3);
        }
        requestFocus();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (this.f9365f == null) {
            this.f9362c = true;
        } else if (!this.f9361b) {
            this.f9361b = true;
            i();
        } else {
            a(false);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.y ? a(motionEvent) : this.O.onTouchEvent(motionEvent);
    }

    public void setAltSendsEsc(boolean z2) {
        this.V.d(z2);
    }

    public void setBackKeyCharacter(int i2) {
        this.V.b(i2);
        this.z = i2 != 0;
    }

    public void setColorScheme(d dVar) {
        if (dVar == null) {
            dVar = a.t;
        }
        this.f9372m = dVar;
        j();
    }

    public void setControlKeyCode(int i2) {
        this.A = i2;
    }

    public void setDensity(DisplayMetrics displayMetrics) {
        if (this.F == 0.0f) {
            this.f9370k = (int) (((float) this.f9370k) * displayMetrics.density);
        }
        this.F = displayMetrics.density;
        this.G = displayMetrics.scaledDensity;
    }

    public void setExtGestureListener(GestureDetector.OnGestureListener onGestureListener) {
        this.P = onGestureListener;
    }

    public void setFnKeyCode(int i2) {
        this.B = i2;
    }

    public void setMouseTracking(boolean z2) {
        this.E = z2;
    }

    public void setTermType(String str) {
        this.V.a(str);
    }

    public void setTextSize(int i2) {
        this.f9370k = (int) (((float) i2) * this.F);
        j();
    }

    public void setUseCookedIME(boolean z2) {
        this.p = z2;
    }
}
