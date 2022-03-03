package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import c.f.a.m.d;
import c.f.a.m.e;
import c.f.a.m.f;
import c.f.a.m.g;
import c.f.a.m.m.b;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    private static l u;

    /* renamed from: b  reason: collision with root package name */
    SparseArray<View> f815b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<c> f816c = new ArrayList<>(4);

    /* renamed from: d  reason: collision with root package name */
    protected f f817d = new f();

    /* renamed from: e  reason: collision with root package name */
    private int f818e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f819f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f820g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f821h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f822i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f823j = 257;

    /* renamed from: k  reason: collision with root package name */
    private e f824k = null;

    /* renamed from: l  reason: collision with root package name */
    protected d f825l = null;

    /* renamed from: m  reason: collision with root package name */
    private int f826m = -1;
    private HashMap<String, Integer> n = new HashMap<>();
    private int o = -1;
    private int p = -1;
    private SparseArray<e> q = new SparseArray<>();
    c r = new c(this);
    private int s = 0;
    private int t = 0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[e.b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                c.f.a.m.e$b[] r0 = c.f.a.m.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.a.a = r0
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.f.a.m.e$b r1 = c.f.a.m.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.f.a.m.e$b r1 = c.f.a.m.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.f.a.m.e$b r1 = c.f.a.m.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.f.a.m.e$b r1 = c.f.a.m.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = 0;
        public float D = 0.5f;
        public float E = 0.5f;
        public String F = null;
        float G;
        int H;
        public float I = -1.0f;
        public float J = -1.0f;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public float S = 1.0f;
        public float T = 1.0f;
        public int U = -1;
        public int V = -1;
        public int W = -1;
        public boolean X = false;
        public boolean Y = false;
        public String Z = null;
        public int a = -1;
        public int a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f827b = -1;
        boolean b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f828c = -1.0f;
        boolean c0 = true;

        /* renamed from: d  reason: collision with root package name */
        public int f829d = -1;
        boolean d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f830e = -1;
        boolean e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f831f = -1;
        boolean f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f832g = -1;
        boolean g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f833h = -1;
        boolean h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f834i = -1;
        int i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f835j = -1;
        int j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f836k = -1;
        int k0 = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f837l = -1;
        int l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f838m = -1;
        int m0 = Integer.MIN_VALUE;
        public int n = -1;
        int n0 = Integer.MIN_VALUE;
        public int o = -1;
        float o0 = 0.5f;
        public int p = 0;
        int p0;
        public float q = 0.0f;
        int q0;
        public int r = -1;
        float r0;
        public int s = -1;
        e s0 = new e();
        public int t = -1;
        public boolean t0;
        public int u = -1;
        public int v = Integer.MIN_VALUE;
        public int w = Integer.MIN_VALUE;
        public int x = Integer.MIN_VALUE;
        public int y = Integer.MIN_VALUE;
        public int z = Integer.MIN_VALUE;

        private static class a {
            public static final SparseIntArray a = new SparseIntArray();

            static {
                a.append(k.ConstraintLayout_Layout_layout_constraintWidth, 64);
                a.append(k.ConstraintLayout_Layout_layout_constraintHeight, 65);
                a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                a.append(k.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                a.append(k.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                a.append(k.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                a.append(k.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                a.append(k.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                a.append(k.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                a.append(k.ConstraintLayout_Layout_layout_constraintCircle, 2);
                a.append(k.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                a.append(k.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                a.append(k.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                a.append(k.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                a.append(k.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                a.append(k.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                a.append(k.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                a.append(k.ConstraintLayout_Layout_android_orientation, 1);
                a.append(k.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                a.append(k.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                a.append(k.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                a.append(k.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                a.append(k.ConstraintLayout_Layout_layout_marginBaseline, 54);
                a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                a.append(k.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                a.append(k.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                a.append(k.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                a.append(k.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                a.append(k.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                a.append(k.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                a.append(k.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                a.append(k.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                a.append(k.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                a.append(k.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                a.append(k.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                a.append(k.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                a.append(k.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                a.append(k.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                a.append(k.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                a.append(k.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                a.append(k.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                a.append(k.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                a.append(k.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                a.append(k.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                a.append(k.ConstraintLayout_Layout_layout_constraintTag, 51);
                a.append(k.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.a.get(index);
                switch (i3) {
                    case 0:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 1:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        continue;
                    case 2:
                        this.o = obtainStyledAttributes.getResourceId(index, this.o);
                        if (this.o == -1) {
                            this.o = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                        continue;
                    case 4:
                        this.q = obtainStyledAttributes.getFloat(index, this.q) % 360.0f;
                        float f2 = this.q;
                        if (f2 < 0.0f) {
                            this.q = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        continue;
                    case 6:
                        this.f827b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f827b);
                        continue;
                    case 7:
                        this.f828c = obtainStyledAttributes.getFloat(index, this.f828c);
                        continue;
                    case 8:
                        this.f829d = obtainStyledAttributes.getResourceId(index, this.f829d);
                        if (this.f829d == -1) {
                            this.f829d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        this.f830e = obtainStyledAttributes.getResourceId(index, this.f830e);
                        if (this.f830e == -1) {
                            this.f830e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        this.f831f = obtainStyledAttributes.getResourceId(index, this.f831f);
                        if (this.f831f == -1) {
                            this.f831f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        this.f832g = obtainStyledAttributes.getResourceId(index, this.f832g);
                        if (this.f832g == -1) {
                            this.f832g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        this.f833h = obtainStyledAttributes.getResourceId(index, this.f833h);
                        if (this.f833h == -1) {
                            this.f833h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        this.f834i = obtainStyledAttributes.getResourceId(index, this.f834i);
                        if (this.f834i == -1) {
                            this.f834i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        this.f835j = obtainStyledAttributes.getResourceId(index, this.f835j);
                        if (this.f835j == -1) {
                            this.f835j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        this.f836k = obtainStyledAttributes.getResourceId(index, this.f836k);
                        if (this.f836k == -1) {
                            this.f836k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        this.f837l = obtainStyledAttributes.getResourceId(index, this.f837l);
                        if (this.f837l == -1) {
                            this.f837l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        this.r = obtainStyledAttributes.getResourceId(index, this.r);
                        if (this.r == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        this.s = obtainStyledAttributes.getResourceId(index, this.s);
                        if (this.s == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        this.t = obtainStyledAttributes.getResourceId(index, this.t);
                        if (this.t == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        this.u = obtainStyledAttributes.getResourceId(index, this.u);
                        if (this.u == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 22:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 23:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 24:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 25:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        continue;
                    case 26:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 27:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        continue;
                    case 28:
                        this.Y = obtainStyledAttributes.getBoolean(index, this.Y);
                        continue;
                    case 29:
                        this.D = obtainStyledAttributes.getFloat(index, this.D);
                        continue;
                    case 30:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        continue;
                    case 31:
                        this.M = obtainStyledAttributes.getInt(index, 0);
                        if (this.M == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        this.N = obtainStyledAttributes.getInt(index, 0);
                        if (this.N == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                    case 34:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                    case 35:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        continue;
                    case 36:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                    case 37:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                    case 38:
                        this.T = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.T));
                        this.N = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                e.a(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 46:
                                this.J = obtainStyledAttributes.getFloat(index, this.J);
                                continue;
                            case 47:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.L = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 50:
                                this.V = obtainStyledAttributes.getDimensionPixelOffset(index, this.V);
                                continue;
                            case 51:
                                this.Z = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                this.f838m = obtainStyledAttributes.getResourceId(index, this.f838m);
                                if (this.f838m == -1) {
                                    this.f838m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                this.n = obtainStyledAttributes.getResourceId(index, this.n);
                                if (this.n == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 55:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            default:
                                switch (i3) {
                                    case 64:
                                        e.a(this, obtainStyledAttributes, index, 0);
                                        continue;
                                    case 65:
                                        e.a(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        continue;
                                        continue;
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.e0 = false;
            this.b0 = true;
            this.c0 = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.Y) {
                this.c0 = false;
                if (this.N == 0) {
                    this.N = 1;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).width == 0 || ((ViewGroup.MarginLayoutParams) this).width == -1) {
                this.b0 = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.X = true;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == 0 || ((ViewGroup.MarginLayoutParams) this).height == -1) {
                this.c0 = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.N == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.Y = true;
                }
            }
            if (this.f828c != -1.0f || this.a != -1 || this.f827b != -1) {
                this.e0 = true;
                this.b0 = true;
                this.c0 = true;
                if (!(this.s0 instanceof g)) {
                    this.s0 = new g();
                }
                ((g) this.s0).B(this.W);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00de, code lost:
            if (r1 > 0) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ed, code lost:
            if (r1 > 0) goto L_0x00e0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
            // Method dump skipped, instructions count: 269
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements b.AbstractC0041b {
        ConstraintLayout a;

        /* renamed from: b  reason: collision with root package name */
        int f839b;

        /* renamed from: c  reason: collision with root package name */
        int f840c;

        /* renamed from: d  reason: collision with root package name */
        int f841d;

        /* renamed from: e  reason: collision with root package name */
        int f842e;

        /* renamed from: f  reason: collision with root package name */
        int f843f;

        /* renamed from: g  reason: collision with root package name */
        int f844g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        private boolean a(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        @Override // c.f.a.m.m.b.AbstractC0041b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.a.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).a(this.a);
                }
            }
            int size = this.a.f816c.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((c) this.a.f816c.get(i3)).e(this.a);
                }
            }
        }

        public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f839b = i4;
            this.f840c = i5;
            this.f841d = i6;
            this.f842e = i7;
            this.f843f = i2;
            this.f844g = i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01ed A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0290  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0296  */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x029b  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0125  */
        @Override // c.f.a.m.m.b.AbstractC0041b
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(c.f.a.m.e r18, c.f.a.m.m.b.a r19) {
            /*
            // Method dump skipped, instructions count: 737
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.a(c.f.a.m.e, c.f.a.m.m.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, i2, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(attributeSet, i2, i3);
    }

    private void a(AttributeSet attributeSet, int i2, int i3) {
        this.f817d.a(this);
        this.f817d.a((b.AbstractC0041b) this.r);
        this.f815b.put(getId(), this);
        this.f824k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.ConstraintLayout_Layout, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == k.ConstraintLayout_Layout_android_minWidth) {
                    this.f818e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f818e);
                } else if (index == k.ConstraintLayout_Layout_android_minHeight) {
                    this.f819f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f819f);
                } else if (index == k.ConstraintLayout_Layout_android_maxWidth) {
                    this.f820g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f820g);
                } else if (index == k.ConstraintLayout_Layout_android_maxHeight) {
                    this.f821h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f821h);
                } else if (index == k.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f823j = obtainStyledAttributes.getInt(index, this.f823j);
                } else if (index == k.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            b(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f825l = null;
                        }
                    }
                } else if (index == k.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f824k = new e();
                        this.f824k.b(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f824k = null;
                    }
                    this.f826m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f817d.z(this.f823j);
    }

    private void a(e eVar, b bVar, SparseArray<e> sparseArray, int i2, d.b bVar2) {
        View view = this.f815b.get(i2);
        e eVar2 = sparseArray.get(i2);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.d0 = true;
            if (bVar2 == d.b.BASELINE) {
                b bVar3 = (b) view.getLayoutParams();
                bVar3.d0 = true;
                bVar3.s0.a(true);
            }
            eVar.a(d.b.BASELINE).a(eVar2.a(bVar2), bVar.C, bVar.B, true);
            eVar.a(true);
            eVar.a(d.b.TOP).m();
            eVar.a(d.b.BOTTOM).m();
        }
    }

    private void b() {
        this.f822i = true;
        this.o = -1;
        this.p = -1;
    }

    private final e c(int i2) {
        if (i2 == 0) {
            return this.f817d;
        }
        View view = this.f815b.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f817d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).s0;
    }

    private void c() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            e a2 = a(getChildAt(i2));
            if (a2 != null) {
                a2.U();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    a(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    c(childAt.getId()).a(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f826m != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f826m && (childAt2 instanceof f)) {
                    this.f824k = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.f824k;
        if (eVar != null) {
            eVar.a(this, true);
        }
        this.f817d.Y();
        int size = this.f816c.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f816c.get(i5).g(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof i) {
                ((i) childAt3).b(this);
            }
        }
        this.q.clear();
        this.q.put(0, this.f817d);
        this.q.put(getId(), this.f817d);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.q.put(childAt4.getId(), a(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            e a3 = a(childAt5);
            if (a3 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f817d.a(a3);
                a(isInEditMode, childAt5, a3, bVar, this.q);
            }
        }
    }

    private boolean d() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            } else if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            c();
        }
        return z;
    }

    private int getPaddingWidth() {
        int i2 = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i2 > 0 ? i2 : max;
    }

    public static l getSharedValues() {
        if (u == null) {
            u = new l();
        }
        return u;
    }

    public View a(int i2) {
        return this.f815b.get(i2);
    }

    public final e a(View view) {
        if (view == this) {
            return this.f817d;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).s0;
    }

    public Object a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.n.get(str);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        c cVar = this.r;
        int i6 = cVar.f842e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + cVar.f841d, i2, 0);
        int min = Math.min(this.f820g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f821h, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.o = min;
        this.p = min2;
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.n == null) {
                this.n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    public void a(f fVar, int i2, int i3, int i4) {
        int i5;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i6 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.r.a(i3, i4, max, max2, paddingWidth, i6);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (a()) {
                max3 = max4;
            }
            i5 = max3;
        } else {
            i5 = Math.max(0, getPaddingLeft());
        }
        int i7 = size - paddingWidth;
        int i8 = size2 - i6;
        a(fVar, mode, i7, mode2, i8);
        fVar.a(i2, mode, i7, mode2, i8, this.o, this.p, i5, max);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.f.a.m.f r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(c.f.a.m.f, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r17, android.view.View r18, c.f.a.m.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray<c.f.a.m.e> r21) {
        /*
        // Method dump skipped, instructions count: 644
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(boolean, android.view.View, c.f.a.m.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
        this.f825l = new d(getContext(), this, i2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<c> arrayList = this.f816c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f816c.get(i2).f(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) i5;
                        float f4 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        b();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f821h;
    }

    public int getMaxWidth() {
        return this.f820g;
    }

    public int getMinHeight() {
        return this.f819f;
    }

    public int getMinWidth() {
        return this.f818e;
    }

    public int getOptimizationLevel() {
        return this.f817d.a0();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.s0;
            if ((childAt.getVisibility() != 8 || bVar.e0 || bVar.f0 || bVar.h0 || isInEditMode) && !bVar.g0) {
                int D = eVar.D();
                int E = eVar.E();
                int C = eVar.C() + D;
                int k2 = eVar.k() + E;
                childAt.layout(D, E, C, k2);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(D, E, C, k2);
                }
            }
        }
        int size = this.f816c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f816c.get(i7).d(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.s == i2) {
            int i4 = this.t;
        }
        if (!this.f822i) {
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                } else if (getChildAt(i5).isLayoutRequested()) {
                    this.f822i = true;
                    break;
                } else {
                    i5++;
                }
            }
        }
        boolean z = this.f822i;
        this.s = i2;
        this.t = i3;
        this.f817d.g(a());
        if (this.f822i) {
            this.f822i = false;
            if (d()) {
                this.f817d.h0();
            }
        }
        a(this.f817d, this.f823j, i2, i3);
        a(i2, i3, this.f817d.C(), this.f817d.k(), this.f817d.g0(), this.f817d.e0());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e a2 = a(view);
        if ((view instanceof h) && !(a2 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            bVar.s0 = new g();
            bVar.e0 = true;
            ((g) bVar.s0).B(bVar.W);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.b();
            ((b) view.getLayoutParams()).f0 = true;
            if (!this.f816c.contains(cVar)) {
                this.f816c.add(cVar);
            }
        }
        this.f815b.put(view.getId(), view);
        this.f822i = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f815b.remove(view.getId());
        this.f817d.c(a(view));
        this.f816c.remove(view);
        this.f822i = true;
    }

    public void requestLayout() {
        b();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f824k = eVar;
    }

    public void setId(int i2) {
        this.f815b.remove(getId());
        super.setId(i2);
        this.f815b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f821h) {
            this.f821h = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f820g) {
            this.f820g = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f819f) {
            this.f819f = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f818e) {
            this.f818e = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(g gVar) {
        d dVar = this.f825l;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f823j = i2;
        this.f817d.z(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
