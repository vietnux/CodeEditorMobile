package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import c.f.b.b.l;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f888d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    private static SparseIntArray f889e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    private static SparseIntArray f890f = new SparseIntArray();
    private HashMap<String, b> a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f891b = true;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, a> f892c = new HashMap<>();

    public static class a {
        int a;

        /* renamed from: b  reason: collision with root package name */
        String f893b;

        /* renamed from: c  reason: collision with root package name */
        public final d f894c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f895d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f896e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final C0014e f897f = new C0014e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, b> f898g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0013a f899h;

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        public static class C0013a {
            int[] a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f900b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f901c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f902d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f903e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f904f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f905g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f906h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f907i = 0;

            /* renamed from: j  reason: collision with root package name */
            int[] f908j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            boolean[] f909k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f910l = 0;

            C0013a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i2, float f2) {
                int i3 = this.f904f;
                int[] iArr = this.f902d;
                if (i3 >= iArr.length) {
                    this.f902d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f903e;
                    this.f903e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f902d;
                int i4 = this.f904f;
                iArr2[i4] = i2;
                float[] fArr2 = this.f903e;
                this.f904f = i4 + 1;
                fArr2[i4] = f2;
            }

            /* access modifiers changed from: package-private */
            public void a(int i2, int i3) {
                int i4 = this.f901c;
                int[] iArr = this.a;
                if (i4 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f900b;
                    this.f900b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i5 = this.f901c;
                iArr3[i5] = i2;
                int[] iArr4 = this.f900b;
                this.f901c = i5 + 1;
                iArr4[i5] = i3;
            }

            /* access modifiers changed from: package-private */
            public void a(int i2, String str) {
                int i3 = this.f907i;
                int[] iArr = this.f905g;
                if (i3 >= iArr.length) {
                    this.f905g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f906h;
                    this.f906h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f905g;
                int i4 = this.f907i;
                iArr2[i4] = i2;
                String[] strArr2 = this.f906h;
                this.f907i = i4 + 1;
                strArr2[i4] = str;
            }

            /* access modifiers changed from: package-private */
            public void a(int i2, boolean z) {
                int i3 = this.f910l;
                int[] iArr = this.f908j;
                if (i3 >= iArr.length) {
                    this.f908j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f909k;
                    this.f909k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f908j;
                int i4 = this.f910l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.f909k;
                this.f910l = i4 + 1;
                zArr2[i4] = z;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(int i2, ConstraintLayout.b bVar) {
            this.a = i2;
            b bVar2 = this.f896e;
            bVar2.f917h = bVar.f829d;
            bVar2.f918i = bVar.f830e;
            bVar2.f919j = bVar.f831f;
            bVar2.f920k = bVar.f832g;
            bVar2.f921l = bVar.f833h;
            bVar2.f922m = bVar.f834i;
            bVar2.n = bVar.f835j;
            bVar2.o = bVar.f836k;
            bVar2.p = bVar.f837l;
            bVar2.q = bVar.f838m;
            bVar2.r = bVar.n;
            bVar2.s = bVar.r;
            bVar2.t = bVar.s;
            bVar2.u = bVar.t;
            bVar2.v = bVar.u;
            bVar2.w = bVar.D;
            bVar2.x = bVar.E;
            bVar2.y = bVar.F;
            bVar2.z = bVar.o;
            bVar2.A = bVar.p;
            bVar2.B = bVar.q;
            bVar2.C = bVar.U;
            bVar2.D = bVar.V;
            bVar2.E = bVar.W;
            bVar2.f916g = bVar.f828c;
            bVar2.f914e = bVar.a;
            bVar2.f915f = bVar.f827b;
            bVar2.f912c = ((ViewGroup.MarginLayoutParams) bVar).width;
            this.f896e.f913d = ((ViewGroup.MarginLayoutParams) bVar).height;
            b bVar3 = this.f896e;
            bVar3.F = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.H = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.I = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.L = bVar.C;
            bVar3.T = bVar.J;
            bVar3.U = bVar.I;
            bVar3.W = bVar.L;
            bVar3.V = bVar.K;
            bVar3.l0 = bVar.X;
            bVar3.m0 = bVar.Y;
            bVar3.X = bVar.M;
            bVar3.Y = bVar.N;
            bVar3.Z = bVar.Q;
            bVar3.a0 = bVar.R;
            bVar3.b0 = bVar.O;
            bVar3.c0 = bVar.P;
            bVar3.d0 = bVar.S;
            bVar3.e0 = bVar.T;
            bVar3.k0 = bVar.Z;
            bVar3.N = bVar.w;
            bVar3.P = bVar.y;
            bVar3.M = bVar.v;
            bVar3.O = bVar.x;
            bVar3.R = bVar.z;
            bVar3.Q = bVar.A;
            bVar3.S = bVar.B;
            bVar3.o0 = bVar.a0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar3.J = bVar.getMarginEnd();
                this.f896e.K = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(int i2, f.a aVar) {
            a(i2, (ConstraintLayout.b) aVar);
            this.f894c.f937d = aVar.u0;
            C0014e eVar = this.f897f;
            eVar.f939b = aVar.x0;
            eVar.f940c = aVar.y0;
            eVar.f941d = aVar.z0;
            eVar.f942e = aVar.A0;
            eVar.f943f = aVar.B0;
            eVar.f944g = aVar.C0;
            eVar.f945h = aVar.D0;
            eVar.f947j = aVar.E0;
            eVar.f948k = aVar.F0;
            eVar.f949l = aVar.G0;
            eVar.n = aVar.w0;
            eVar.f950m = aVar.v0;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a(c cVar, int i2, f.a aVar) {
            a(i2, aVar);
            if (cVar instanceof a) {
                b bVar = this.f896e;
                bVar.h0 = 1;
                a aVar2 = (a) cVar;
                bVar.f0 = aVar2.getType();
                this.f896e.i0 = aVar2.getReferencedIds();
                this.f896e.g0 = aVar2.getMargin();
            }
        }

        public void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f896e;
            bVar.f829d = bVar2.f917h;
            bVar.f830e = bVar2.f918i;
            bVar.f831f = bVar2.f919j;
            bVar.f832g = bVar2.f920k;
            bVar.f833h = bVar2.f921l;
            bVar.f834i = bVar2.f922m;
            bVar.f835j = bVar2.n;
            bVar.f836k = bVar2.o;
            bVar.f837l = bVar2.p;
            bVar.f838m = bVar2.q;
            bVar.n = bVar2.r;
            bVar.r = bVar2.s;
            bVar.s = bVar2.t;
            bVar.t = bVar2.u;
            bVar.u = bVar2.v;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.I;
            bVar.z = bVar2.R;
            bVar.A = bVar2.Q;
            bVar.w = bVar2.N;
            bVar.y = bVar2.P;
            bVar.D = bVar2.w;
            bVar.E = bVar2.x;
            bVar.o = bVar2.z;
            bVar.p = bVar2.A;
            bVar.q = bVar2.B;
            bVar.F = bVar2.y;
            bVar.U = bVar2.C;
            bVar.V = bVar2.D;
            bVar.J = bVar2.T;
            bVar.I = bVar2.U;
            bVar.L = bVar2.W;
            bVar.K = bVar2.V;
            bVar.X = bVar2.l0;
            bVar.Y = bVar2.m0;
            bVar.M = bVar2.X;
            bVar.N = bVar2.Y;
            bVar.Q = bVar2.Z;
            bVar.R = bVar2.a0;
            bVar.O = bVar2.b0;
            bVar.P = bVar2.c0;
            bVar.S = bVar2.d0;
            bVar.T = bVar2.e0;
            bVar.W = bVar2.E;
            bVar.f828c = bVar2.f916g;
            bVar.a = bVar2.f914e;
            bVar.f827b = bVar2.f915f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f912c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f913d;
            String str = bVar2.k0;
            if (str != null) {
                bVar.Z = str;
            }
            b bVar3 = this.f896e;
            bVar.a0 = bVar3.o0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar3.K);
                bVar.setMarginEnd(this.f896e.J);
            }
            bVar.a();
        }

        public a clone() {
            a aVar = new a();
            aVar.f896e.a(this.f896e);
            aVar.f895d.a(this.f895d);
            aVar.f894c.a(this.f894c);
            aVar.f897f.a(this.f897f);
            aVar.a = this.a;
            aVar.f899h = this.f899h;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray p0 = new SparseIntArray();
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = -1;
        public boolean a = false;
        public int a0 = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f911b = false;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f912c;
        public int c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f913d;
        public float d0 = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f914e = -1;
        public float e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f915f = -1;
        public int f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f916g = -1.0f;
        public int g0 = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f917h = -1;
        public int h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f918i = -1;
        public int[] i0;

        /* renamed from: j  reason: collision with root package name */
        public int f919j = -1;
        public String j0;

        /* renamed from: k  reason: collision with root package name */
        public int f920k = -1;
        public String k0;

        /* renamed from: l  reason: collision with root package name */
        public int f921l = -1;
        public boolean l0 = false;

        /* renamed from: m  reason: collision with root package name */
        public int f922m = -1;
        public boolean m0 = false;
        public int n = -1;
        public boolean n0 = true;
        public int o = -1;
        public int o0 = 0;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public float w = 0.5f;
        public float x = 0.5f;
        public String y = null;
        public int z = -1;

        static {
            p0.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
            p0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
            p0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
            p0.append(k.Layout_layout_constraintRight_toRightOf, 29);
            p0.append(k.Layout_layout_constraintTop_toTopOf, 35);
            p0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
            p0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
            p0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
            p0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
            p0.append(k.Layout_layout_editor_absoluteX, 6);
            p0.append(k.Layout_layout_editor_absoluteY, 7);
            p0.append(k.Layout_layout_constraintGuide_begin, 17);
            p0.append(k.Layout_layout_constraintGuide_end, 18);
            p0.append(k.Layout_layout_constraintGuide_percent, 19);
            p0.append(k.Layout_android_orientation, 26);
            p0.append(k.Layout_layout_constraintStart_toEndOf, 31);
            p0.append(k.Layout_layout_constraintStart_toStartOf, 32);
            p0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
            p0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
            p0.append(k.Layout_layout_goneMarginLeft, 13);
            p0.append(k.Layout_layout_goneMarginTop, 16);
            p0.append(k.Layout_layout_goneMarginRight, 14);
            p0.append(k.Layout_layout_goneMarginBottom, 11);
            p0.append(k.Layout_layout_goneMarginStart, 15);
            p0.append(k.Layout_layout_goneMarginEnd, 12);
            p0.append(k.Layout_layout_constraintVertical_weight, 38);
            p0.append(k.Layout_layout_constraintHorizontal_weight, 37);
            p0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
            p0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
            p0.append(k.Layout_layout_constraintHorizontal_bias, 20);
            p0.append(k.Layout_layout_constraintVertical_bias, 36);
            p0.append(k.Layout_layout_constraintDimensionRatio, 5);
            p0.append(k.Layout_layout_constraintLeft_creator, 76);
            p0.append(k.Layout_layout_constraintTop_creator, 76);
            p0.append(k.Layout_layout_constraintRight_creator, 76);
            p0.append(k.Layout_layout_constraintBottom_creator, 76);
            p0.append(k.Layout_layout_constraintBaseline_creator, 76);
            p0.append(k.Layout_android_layout_marginLeft, 23);
            p0.append(k.Layout_android_layout_marginRight, 27);
            p0.append(k.Layout_android_layout_marginStart, 30);
            p0.append(k.Layout_android_layout_marginEnd, 8);
            p0.append(k.Layout_android_layout_marginTop, 33);
            p0.append(k.Layout_android_layout_marginBottom, 2);
            p0.append(k.Layout_android_layout_width, 22);
            p0.append(k.Layout_android_layout_height, 21);
            p0.append(k.Layout_layout_constraintWidth, 41);
            p0.append(k.Layout_layout_constraintHeight, 42);
            p0.append(k.Layout_layout_constrainedWidth, 41);
            p0.append(k.Layout_layout_constrainedHeight, 42);
            p0.append(k.Layout_layout_wrapBehaviorInParent, 97);
            p0.append(k.Layout_layout_constraintCircle, 61);
            p0.append(k.Layout_layout_constraintCircleRadius, 62);
            p0.append(k.Layout_layout_constraintCircleAngle, 63);
            p0.append(k.Layout_layout_constraintWidth_percent, 69);
            p0.append(k.Layout_layout_constraintHeight_percent, 70);
            p0.append(k.Layout_chainUseRtl, 71);
            p0.append(k.Layout_barrierDirection, 72);
            p0.append(k.Layout_barrierMargin, 73);
            p0.append(k.Layout_constraint_referenced_ids, 74);
            p0.append(k.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Layout);
            this.f911b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = p0.get(index);
                if (i3 == 80) {
                    this.l0 = obtainStyledAttributes.getBoolean(index, this.l0);
                } else if (i3 == 81) {
                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                } else if (i3 != 97) {
                    switch (i3) {
                        case 1:
                            this.p = e.b(obtainStyledAttributes, index, this.p);
                            continue;
                        case 2:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 3:
                            this.o = e.b(obtainStyledAttributes, index, this.o);
                            continue;
                        case 4:
                            this.n = e.b(obtainStyledAttributes, index, this.n);
                            continue;
                        case 5:
                            this.y = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            continue;
                        case 7:
                            this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.v = e.b(obtainStyledAttributes, index, this.v);
                            continue;
                        case 10:
                            this.u = e.b(obtainStyledAttributes, index, this.u);
                            continue;
                        case 11:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        case 12:
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        case 13:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 14:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 15:
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        case 16:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 17:
                            this.f914e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f914e);
                            continue;
                        case 18:
                            this.f915f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f915f);
                            continue;
                        case 19:
                            this.f916g = obtainStyledAttributes.getFloat(index, this.f916g);
                            continue;
                        case 20:
                            this.w = obtainStyledAttributes.getFloat(index, this.w);
                            continue;
                        case 21:
                            this.f913d = obtainStyledAttributes.getLayoutDimension(index, this.f913d);
                            continue;
                        case 22:
                            this.f912c = obtainStyledAttributes.getLayoutDimension(index, this.f912c);
                            continue;
                        case 23:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 24:
                            this.f917h = e.b(obtainStyledAttributes, index, this.f917h);
                            continue;
                        case 25:
                            this.f918i = e.b(obtainStyledAttributes, index, this.f918i);
                            continue;
                        case 26:
                            this.E = obtainStyledAttributes.getInt(index, this.E);
                            continue;
                        case 27:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 28:
                            this.f919j = e.b(obtainStyledAttributes, index, this.f919j);
                            continue;
                        case 29:
                            this.f920k = e.b(obtainStyledAttributes, index, this.f920k);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.s = e.b(obtainStyledAttributes, index, this.s);
                            continue;
                        case 32:
                            this.t = e.b(obtainStyledAttributes, index, this.t);
                            continue;
                        case 33:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            continue;
                        case 34:
                            this.f922m = e.b(obtainStyledAttributes, index, this.f922m);
                            continue;
                        case 35:
                            this.f921l = e.b(obtainStyledAttributes, index, this.f921l);
                            continue;
                        case 36:
                            this.x = obtainStyledAttributes.getFloat(index, this.x);
                            continue;
                        case 37:
                            this.U = obtainStyledAttributes.getFloat(index, this.U);
                            continue;
                        case 38:
                            this.T = obtainStyledAttributes.getFloat(index, this.T);
                            continue;
                        case 39:
                            this.V = obtainStyledAttributes.getInt(index, this.V);
                            continue;
                        case 40:
                            this.W = obtainStyledAttributes.getInt(index, this.W);
                            continue;
                        case 41:
                            e.a(this, obtainStyledAttributes, index, 0);
                            continue;
                        case 42:
                            e.a(this, obtainStyledAttributes, index, 1);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    continue;
                                case 55:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    continue;
                                case 56:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    continue;
                                case 57:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    continue;
                                case 58:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    continue;
                                case 59:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.z = e.b(obtainStyledAttributes, index, this.z);
                                            continue;
                                        case 62:
                                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                            continue;
                                        case 63:
                                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f0 = obtainStyledAttributes.getInt(index, this.f0);
                                                    break;
                                                case 73:
                                                    this.g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                                    break;
                                                case 74:
                                                    this.j0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(p0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 77:
                                                    this.k0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 91:
                                                            this.q = e.b(obtainStyledAttributes, index, this.q);
                                                            break;
                                                        case 92:
                                                            this.r = e.b(obtainStyledAttributes, index, this.r);
                                                            break;
                                                        case 93:
                                                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                                            break;
                                                        case 94:
                                                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                                            break;
                                                        default:
                                                            sb = new StringBuilder();
                                                            str = "Unknown attribute 0x";
                                                            sb.append(str);
                                                            sb.append(Integer.toHexString(index));
                                                            sb.append("   ");
                                                            sb.append(p0.get(index));
                                                            Log.w("ConstraintSet", sb.toString());
                                                            continue;
                                                            continue;
                                                            continue;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.o0 = obtainStyledAttributes.getInt(index, this.o0);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.f912c = bVar.f912c;
            this.f911b = bVar.f911b;
            this.f913d = bVar.f913d;
            this.f914e = bVar.f914e;
            this.f915f = bVar.f915f;
            this.f916g = bVar.f916g;
            this.f917h = bVar.f917h;
            this.f918i = bVar.f918i;
            this.f919j = bVar.f919j;
            this.f920k = bVar.f920k;
            this.f921l = bVar.f921l;
            this.f922m = bVar.f922m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.k0 = bVar.k0;
            int[] iArr = bVar.i0;
            if (iArr != null) {
                this.i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.i0 = null;
            }
            this.j0 = bVar.j0;
            this.l0 = bVar.l0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
        }
    }

    public static class c {
        private static SparseIntArray o = new SparseIntArray();
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f923b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f924c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f925d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f926e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f927f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f928g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f929h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f930i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f931j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f932k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f933l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f934m = -3;
        public int n = -1;

        static {
            o.append(k.Motion_motionPathRotate, 1);
            o.append(k.Motion_pathMotionArc, 2);
            o.append(k.Motion_transitionEasing, 3);
            o.append(k.Motion_drawPath, 4);
            o.append(k.Motion_animateRelativeTo, 5);
            o.append(k.Motion_animateCircleAngleTo, 6);
            o.append(k.Motion_motionStagger, 7);
            o.append(k.Motion_quantizeMotionSteps, 8);
            o.append(k.Motion_quantizeMotionPhase, 9);
            o.append(k.Motion_quantizeMotionInterpolator, 10);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Motion);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (o.get(index)) {
                    case 1:
                        this.f930i = obtainStyledAttributes.getFloat(index, this.f930i);
                        break;
                    case 2:
                        this.f926e = obtainStyledAttributes.getInt(index, this.f926e);
                        break;
                    case 3:
                        this.f925d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : c.f.a.k.a.b.f2078c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f927f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f923b = e.b(obtainStyledAttributes, index, this.f923b);
                        break;
                    case 6:
                        this.f924c = obtainStyledAttributes.getInteger(index, this.f924c);
                        break;
                    case 7:
                        this.f928g = obtainStyledAttributes.getFloat(index, this.f928g);
                        break;
                    case 8:
                        this.f932k = obtainStyledAttributes.getInteger(index, this.f932k);
                        break;
                    case 9:
                        this.f931j = obtainStyledAttributes.getFloat(index, this.f931j);
                        break;
                    case 10:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            this.n = obtainStyledAttributes.getResourceId(index, -1);
                            if (this.n == -1) {
                                break;
                            }
                        } else if (i3 != 3) {
                            this.f934m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        } else {
                            this.f933l = obtainStyledAttributes.getString(index);
                            if (this.f933l.indexOf("/") <= 0) {
                                this.f934m = -1;
                                break;
                            } else {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                            }
                        }
                        this.f934m = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.f923b = cVar.f923b;
            this.f925d = cVar.f925d;
            this.f926e = cVar.f926e;
            this.f927f = cVar.f927f;
            this.f930i = cVar.f930i;
            this.f928g = cVar.f928g;
            this.f929h = cVar.f929h;
        }
    }

    public static class d {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f935b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f936c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f937d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f938e = Float.NaN;

        /* access modifiers changed from: package-private */
        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.PropertySet_android_alpha) {
                    this.f937d = obtainStyledAttributes.getFloat(index, this.f937d);
                } else if (index == k.PropertySet_android_visibility) {
                    this.f935b = obtainStyledAttributes.getInt(index, this.f935b);
                    this.f935b = e.f888d[this.f935b];
                } else if (index == k.PropertySet_visibilityMode) {
                    this.f936c = obtainStyledAttributes.getInt(index, this.f936c);
                } else if (index == k.PropertySet_motionProgress) {
                    this.f938e = obtainStyledAttributes.getFloat(index, this.f938e);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(d dVar) {
            this.a = dVar.a;
            this.f935b = dVar.f935b;
            this.f937d = dVar.f937d;
            this.f938e = dVar.f938e;
            this.f936c = dVar.f936c;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    public static class C0014e {
        private static SparseIntArray o = new SparseIntArray();
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f939b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f940c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f941d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f942e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f943f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f944g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f945h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f946i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f947j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f948k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f949l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f950m = false;
        public float n = 0.0f;

        static {
            o.append(k.Transform_android_rotation, 1);
            o.append(k.Transform_android_rotationX, 2);
            o.append(k.Transform_android_rotationY, 3);
            o.append(k.Transform_android_scaleX, 4);
            o.append(k.Transform_android_scaleY, 5);
            o.append(k.Transform_android_transformPivotX, 6);
            o.append(k.Transform_android_transformPivotY, 7);
            o.append(k.Transform_android_translationX, 8);
            o.append(k.Transform_android_translationY, 9);
            o.append(k.Transform_android_translationZ, 10);
            o.append(k.Transform_android_elevation, 11);
            o.append(k.Transform_transformPivotTarget, 12);
        }

        /* access modifiers changed from: package-private */
        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Transform);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (o.get(index)) {
                    case 1:
                        this.f939b = obtainStyledAttributes.getFloat(index, this.f939b);
                        break;
                    case 2:
                        this.f940c = obtainStyledAttributes.getFloat(index, this.f940c);
                        break;
                    case 3:
                        this.f941d = obtainStyledAttributes.getFloat(index, this.f941d);
                        break;
                    case 4:
                        this.f942e = obtainStyledAttributes.getFloat(index, this.f942e);
                        break;
                    case 5:
                        this.f943f = obtainStyledAttributes.getFloat(index, this.f943f);
                        break;
                    case 6:
                        this.f944g = obtainStyledAttributes.getDimension(index, this.f944g);
                        break;
                    case 7:
                        this.f945h = obtainStyledAttributes.getDimension(index, this.f945h);
                        break;
                    case 8:
                        this.f947j = obtainStyledAttributes.getDimension(index, this.f947j);
                        break;
                    case 9:
                        this.f948k = obtainStyledAttributes.getDimension(index, this.f948k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f949l = obtainStyledAttributes.getDimension(index, this.f949l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f950m = true;
                            this.n = obtainStyledAttributes.getDimension(index, this.n);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.f946i = e.b(obtainStyledAttributes, index, this.f946i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(C0014e eVar) {
            this.a = eVar.a;
            this.f939b = eVar.f939b;
            this.f940c = eVar.f940c;
            this.f941d = eVar.f941d;
            this.f942e = eVar.f942e;
            this.f943f = eVar.f943f;
            this.f944g = eVar.f944g;
            this.f945h = eVar.f945h;
            this.f946i = eVar.f946i;
            this.f947j = eVar.f947j;
            this.f948k = eVar.f948k;
            this.f949l = eVar.f949l;
            this.f950m = eVar.f950m;
            this.n = eVar.n;
        }
    }

    static {
        f889e.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
        f889e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
        f889e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
        f889e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
        f889e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
        f889e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
        f889e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
        f889e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
        f889e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f889e.append(k.Constraint_layout_constraintBaseline_toTopOf, 91);
        f889e.append(k.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f889e.append(k.Constraint_layout_editor_absoluteX, 6);
        f889e.append(k.Constraint_layout_editor_absoluteY, 7);
        f889e.append(k.Constraint_layout_constraintGuide_begin, 17);
        f889e.append(k.Constraint_layout_constraintGuide_end, 18);
        f889e.append(k.Constraint_layout_constraintGuide_percent, 19);
        f889e.append(k.Constraint_android_orientation, 27);
        f889e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
        f889e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
        f889e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
        f889e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
        f889e.append(k.Constraint_layout_goneMarginLeft, 13);
        f889e.append(k.Constraint_layout_goneMarginTop, 16);
        f889e.append(k.Constraint_layout_goneMarginRight, 14);
        f889e.append(k.Constraint_layout_goneMarginBottom, 11);
        f889e.append(k.Constraint_layout_goneMarginStart, 15);
        f889e.append(k.Constraint_layout_goneMarginEnd, 12);
        f889e.append(k.Constraint_layout_constraintVertical_weight, 40);
        f889e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
        f889e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f889e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
        f889e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
        f889e.append(k.Constraint_layout_constraintVertical_bias, 37);
        f889e.append(k.Constraint_layout_constraintDimensionRatio, 5);
        f889e.append(k.Constraint_layout_constraintLeft_creator, 87);
        f889e.append(k.Constraint_layout_constraintTop_creator, 87);
        f889e.append(k.Constraint_layout_constraintRight_creator, 87);
        f889e.append(k.Constraint_layout_constraintBottom_creator, 87);
        f889e.append(k.Constraint_layout_constraintBaseline_creator, 87);
        f889e.append(k.Constraint_android_layout_marginLeft, 24);
        f889e.append(k.Constraint_android_layout_marginRight, 28);
        f889e.append(k.Constraint_android_layout_marginStart, 31);
        f889e.append(k.Constraint_android_layout_marginEnd, 8);
        f889e.append(k.Constraint_android_layout_marginTop, 34);
        f889e.append(k.Constraint_android_layout_marginBottom, 2);
        f889e.append(k.Constraint_android_layout_width, 23);
        f889e.append(k.Constraint_android_layout_height, 21);
        f889e.append(k.Constraint_layout_constraintWidth, 95);
        f889e.append(k.Constraint_layout_constraintHeight, 96);
        f889e.append(k.Constraint_android_visibility, 22);
        f889e.append(k.Constraint_android_alpha, 43);
        f889e.append(k.Constraint_android_elevation, 44);
        f889e.append(k.Constraint_android_rotationX, 45);
        f889e.append(k.Constraint_android_rotationY, 46);
        f889e.append(k.Constraint_android_rotation, 60);
        f889e.append(k.Constraint_android_scaleX, 47);
        f889e.append(k.Constraint_android_scaleY, 48);
        f889e.append(k.Constraint_android_transformPivotX, 49);
        f889e.append(k.Constraint_android_transformPivotY, 50);
        f889e.append(k.Constraint_android_translationX, 51);
        f889e.append(k.Constraint_android_translationY, 52);
        f889e.append(k.Constraint_android_translationZ, 53);
        f889e.append(k.Constraint_layout_constraintWidth_default, 54);
        f889e.append(k.Constraint_layout_constraintHeight_default, 55);
        f889e.append(k.Constraint_layout_constraintWidth_max, 56);
        f889e.append(k.Constraint_layout_constraintHeight_max, 57);
        f889e.append(k.Constraint_layout_constraintWidth_min, 58);
        f889e.append(k.Constraint_layout_constraintHeight_min, 59);
        f889e.append(k.Constraint_layout_constraintCircle, 61);
        f889e.append(k.Constraint_layout_constraintCircleRadius, 62);
        f889e.append(k.Constraint_layout_constraintCircleAngle, 63);
        f889e.append(k.Constraint_animateRelativeTo, 64);
        f889e.append(k.Constraint_transitionEasing, 65);
        f889e.append(k.Constraint_drawPath, 66);
        f889e.append(k.Constraint_transitionPathRotate, 67);
        f889e.append(k.Constraint_motionStagger, 79);
        f889e.append(k.Constraint_android_id, 38);
        f889e.append(k.Constraint_motionProgress, 68);
        f889e.append(k.Constraint_layout_constraintWidth_percent, 69);
        f889e.append(k.Constraint_layout_constraintHeight_percent, 70);
        f889e.append(k.Constraint_layout_wrapBehaviorInParent, 97);
        f889e.append(k.Constraint_chainUseRtl, 71);
        f889e.append(k.Constraint_barrierDirection, 72);
        f889e.append(k.Constraint_barrierMargin, 73);
        f889e.append(k.Constraint_constraint_referenced_ids, 74);
        f889e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
        f889e.append(k.Constraint_pathMotionArc, 76);
        f889e.append(k.Constraint_layout_constraintTag, 77);
        f889e.append(k.Constraint_visibilityMode, 78);
        f889e.append(k.Constraint_layout_constrainedWidth, 80);
        f889e.append(k.Constraint_layout_constrainedHeight, 81);
        f889e.append(k.Constraint_polarRelativeTo, 82);
        f889e.append(k.Constraint_transformPivotTarget, 83);
        f889e.append(k.Constraint_quantizeMotionSteps, 84);
        f889e.append(k.Constraint_quantizeMotionPhase, 85);
        f889e.append(k.Constraint_quantizeMotionInterpolator, 86);
        f890f.append(k.ConstraintOverride_layout_editor_absoluteY, 6);
        f890f.append(k.ConstraintOverride_layout_editor_absoluteY, 7);
        f890f.append(k.ConstraintOverride_android_orientation, 27);
        f890f.append(k.ConstraintOverride_layout_goneMarginLeft, 13);
        f890f.append(k.ConstraintOverride_layout_goneMarginTop, 16);
        f890f.append(k.ConstraintOverride_layout_goneMarginRight, 14);
        f890f.append(k.ConstraintOverride_layout_goneMarginBottom, 11);
        f890f.append(k.ConstraintOverride_layout_goneMarginStart, 15);
        f890f.append(k.ConstraintOverride_layout_goneMarginEnd, 12);
        f890f.append(k.ConstraintOverride_layout_constraintVertical_weight, 40);
        f890f.append(k.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f890f.append(k.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f890f.append(k.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f890f.append(k.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f890f.append(k.ConstraintOverride_layout_constraintVertical_bias, 37);
        f890f.append(k.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f890f.append(k.ConstraintOverride_layout_constraintLeft_creator, 87);
        f890f.append(k.ConstraintOverride_layout_constraintTop_creator, 87);
        f890f.append(k.ConstraintOverride_layout_constraintRight_creator, 87);
        f890f.append(k.ConstraintOverride_layout_constraintBottom_creator, 87);
        f890f.append(k.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f890f.append(k.ConstraintOverride_android_layout_marginLeft, 24);
        f890f.append(k.ConstraintOverride_android_layout_marginRight, 28);
        f890f.append(k.ConstraintOverride_android_layout_marginStart, 31);
        f890f.append(k.ConstraintOverride_android_layout_marginEnd, 8);
        f890f.append(k.ConstraintOverride_android_layout_marginTop, 34);
        f890f.append(k.ConstraintOverride_android_layout_marginBottom, 2);
        f890f.append(k.ConstraintOverride_android_layout_width, 23);
        f890f.append(k.ConstraintOverride_android_layout_height, 21);
        f890f.append(k.ConstraintOverride_layout_constraintWidth, 95);
        f890f.append(k.ConstraintOverride_layout_constraintHeight, 96);
        f890f.append(k.ConstraintOverride_android_visibility, 22);
        f890f.append(k.ConstraintOverride_android_alpha, 43);
        f890f.append(k.ConstraintOverride_android_elevation, 44);
        f890f.append(k.ConstraintOverride_android_rotationX, 45);
        f890f.append(k.ConstraintOverride_android_rotationY, 46);
        f890f.append(k.ConstraintOverride_android_rotation, 60);
        f890f.append(k.ConstraintOverride_android_scaleX, 47);
        f890f.append(k.ConstraintOverride_android_scaleY, 48);
        f890f.append(k.ConstraintOverride_android_transformPivotX, 49);
        f890f.append(k.ConstraintOverride_android_transformPivotY, 50);
        f890f.append(k.ConstraintOverride_android_translationX, 51);
        f890f.append(k.ConstraintOverride_android_translationY, 52);
        f890f.append(k.ConstraintOverride_android_translationZ, 53);
        f890f.append(k.ConstraintOverride_layout_constraintWidth_default, 54);
        f890f.append(k.ConstraintOverride_layout_constraintHeight_default, 55);
        f890f.append(k.ConstraintOverride_layout_constraintWidth_max, 56);
        f890f.append(k.ConstraintOverride_layout_constraintHeight_max, 57);
        f890f.append(k.ConstraintOverride_layout_constraintWidth_min, 58);
        f890f.append(k.ConstraintOverride_layout_constraintHeight_min, 59);
        f890f.append(k.ConstraintOverride_layout_constraintCircleRadius, 62);
        f890f.append(k.ConstraintOverride_layout_constraintCircleAngle, 63);
        f890f.append(k.ConstraintOverride_animateRelativeTo, 64);
        f890f.append(k.ConstraintOverride_transitionEasing, 65);
        f890f.append(k.ConstraintOverride_drawPath, 66);
        f890f.append(k.ConstraintOverride_transitionPathRotate, 67);
        f890f.append(k.ConstraintOverride_motionStagger, 79);
        f890f.append(k.ConstraintOverride_android_id, 38);
        f890f.append(k.ConstraintOverride_motionTarget, 98);
        f890f.append(k.ConstraintOverride_motionProgress, 68);
        f890f.append(k.ConstraintOverride_layout_constraintWidth_percent, 69);
        f890f.append(k.ConstraintOverride_layout_constraintHeight_percent, 70);
        f890f.append(k.ConstraintOverride_chainUseRtl, 71);
        f890f.append(k.ConstraintOverride_barrierDirection, 72);
        f890f.append(k.ConstraintOverride_barrierMargin, 73);
        f890f.append(k.ConstraintOverride_constraint_referenced_ids, 74);
        f890f.append(k.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f890f.append(k.ConstraintOverride_pathMotionArc, 76);
        f890f.append(k.ConstraintOverride_layout_constraintTag, 77);
        f890f.append(k.ConstraintOverride_visibilityMode, 78);
        f890f.append(k.ConstraintOverride_layout_constrainedWidth, 80);
        f890f.append(k.ConstraintOverride_layout_constrainedHeight, 81);
        f890f.append(k.ConstraintOverride_polarRelativeTo, 82);
        f890f.append(k.ConstraintOverride_transformPivotTarget, 83);
        f890f.append(k.ConstraintOverride_quantizeMotionSteps, 84);
        f890f.append(k.ConstraintOverride_quantizeMotionPhase, 85);
        f890f.append(k.ConstraintOverride_quantizeMotionInterpolator, 86);
        f890f.append(k.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    private a a(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? k.ConstraintOverride : k.Constraint);
        a(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private static void a(Context context, a aVar, TypedArray typedArray) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        float f3;
        int i10;
        boolean z;
        int i11;
        int i12;
        c cVar;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        a.C0013a aVar2 = new a.C0013a();
        aVar.f899h = aVar2;
        aVar.f895d.a = false;
        aVar.f896e.f911b = false;
        aVar.f894c.a = false;
        aVar.f897f.a = false;
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArray.getIndex(i13);
            float f4 = 1.0f;
            int i14 = 21;
            switch (f890f.get(index)) {
                case 2:
                    i2 = 2;
                    i4 = aVar.f896e.I;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f889e.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 5:
                    i5 = 5;
                    aVar2.a(i5, typedArray.getString(index));
                    break;
                case 6:
                    i2 = 6;
                    i6 = aVar.f896e.C;
                    i3 = typedArray.getDimensionPixelOffset(index, i6);
                    aVar2.a(i2, i3);
                    break;
                case 7:
                    i2 = 7;
                    i6 = aVar.f896e.D;
                    i3 = typedArray.getDimensionPixelOffset(index, i6);
                    aVar2.a(i2, i3);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        i2 = 8;
                        i4 = aVar.f896e.J;
                        i3 = typedArray.getDimensionPixelSize(index, i4);
                        aVar2.a(i2, i3);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = 11;
                    i4 = aVar.f896e.P;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 12:
                    i2 = 12;
                    i4 = aVar.f896e.Q;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 13:
                    i2 = 13;
                    i4 = aVar.f896e.M;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 14:
                    i2 = 14;
                    i4 = aVar.f896e.O;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 15:
                    i2 = 15;
                    i4 = aVar.f896e.R;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 16:
                    i2 = 16;
                    i4 = aVar.f896e.N;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 17:
                    aVar2.a(17, typedArray.getDimensionPixelOffset(index, aVar.f896e.f914e));
                    break;
                case 18:
                    i2 = 18;
                    i6 = aVar.f896e.f915f;
                    i3 = typedArray.getDimensionPixelOffset(index, i6);
                    aVar2.a(i2, i3);
                    break;
                case 19:
                    i7 = 19;
                    f4 = aVar.f896e.f916g;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 20:
                    i7 = 20;
                    f4 = aVar.f896e.w;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 21:
                    i8 = typedArray.getLayoutDimension(index, aVar.f896e.f913d);
                    aVar2.a(i14, i8);
                    break;
                case 22:
                    i2 = 22;
                    i3 = f888d[typedArray.getInt(index, aVar.f894c.f935b)];
                    aVar2.a(i2, i3);
                    break;
                case 23:
                    i2 = 23;
                    i3 = typedArray.getLayoutDimension(index, aVar.f896e.f912c);
                    aVar2.a(i2, i3);
                    break;
                case 24:
                    i2 = 24;
                    i4 = aVar.f896e.F;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 27:
                    i2 = 27;
                    i9 = aVar.f896e.E;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 28:
                    i2 = 28;
                    i4 = aVar.f896e.G;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        i2 = 31;
                        i4 = aVar.f896e.K;
                        i3 = typedArray.getDimensionPixelSize(index, i4);
                        aVar2.a(i2, i3);
                        break;
                    } else {
                        break;
                    }
                case 34:
                    i2 = 34;
                    i4 = aVar.f896e.H;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 37:
                    i7 = 37;
                    f4 = aVar.f896e.x;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    aVar2.a(38, aVar.a);
                    break;
                case 39:
                    i7 = 39;
                    f4 = aVar.f896e.U;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 40:
                    i7 = 40;
                    f4 = aVar.f896e.T;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 41:
                    i2 = 41;
                    i9 = aVar.f896e.V;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 42:
                    i2 = 42;
                    i9 = aVar.f896e.W;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 43:
                    i7 = 43;
                    f4 = aVar.f894c.f937d;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        i7 = 44;
                        aVar2.a(44, true);
                        f3 = aVar.f897f.n;
                        f2 = typedArray.getDimension(index, f3);
                        aVar2.a(i7, f2);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i7 = 45;
                    f4 = aVar.f897f.f940c;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 46:
                    i7 = 46;
                    f4 = aVar.f897f.f941d;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 47:
                    i7 = 47;
                    f4 = aVar.f897f.f942e;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 48:
                    i7 = 48;
                    f4 = aVar.f897f.f943f;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 49:
                    i7 = 49;
                    f3 = aVar.f897f.f944g;
                    f2 = typedArray.getDimension(index, f3);
                    aVar2.a(i7, f2);
                    break;
                case 50:
                    i7 = 50;
                    f3 = aVar.f897f.f945h;
                    f2 = typedArray.getDimension(index, f3);
                    aVar2.a(i7, f2);
                    break;
                case 51:
                    i7 = 51;
                    f3 = aVar.f897f.f947j;
                    f2 = typedArray.getDimension(index, f3);
                    aVar2.a(i7, f2);
                    break;
                case 52:
                    i7 = 52;
                    f3 = aVar.f897f.f948k;
                    f2 = typedArray.getDimension(index, f3);
                    aVar2.a(i7, f2);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        i7 = 53;
                        f3 = aVar.f897f.f949l;
                        f2 = typedArray.getDimension(index, f3);
                        aVar2.a(i7, f2);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    i2 = 54;
                    i9 = aVar.f896e.X;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 55:
                    i2 = 55;
                    i9 = aVar.f896e.Y;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 56:
                    i2 = 56;
                    i4 = aVar.f896e.Z;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 57:
                    i2 = 57;
                    i4 = aVar.f896e.a0;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 58:
                    i2 = 58;
                    i4 = aVar.f896e.b0;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 59:
                    i2 = 59;
                    i4 = aVar.f896e.c0;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 60:
                    i7 = 60;
                    f4 = aVar.f897f.f939b;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 62:
                    i2 = 62;
                    i4 = aVar.f896e.A;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 63:
                    i7 = 63;
                    f4 = aVar.f896e.B;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 64:
                    i2 = 64;
                    i10 = aVar.f895d.f923b;
                    i3 = b(typedArray, index, i10);
                    aVar2.a(i2, i3);
                    break;
                case 65:
                    aVar2.a(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : c.f.a.k.a.b.f2078c[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i2 = 66;
                    i3 = typedArray.getInt(index, 0);
                    aVar2.a(i2, i3);
                    break;
                case 67:
                    i7 = 67;
                    f4 = aVar.f895d.f930i;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 68:
                    i7 = 68;
                    f4 = aVar.f894c.f938e;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 69:
                    i7 = 69;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 70:
                    i7 = 70;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    i2 = 72;
                    i9 = aVar.f896e.f0;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 73:
                    i2 = 73;
                    i4 = aVar.f896e.g0;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 74:
                    i5 = 74;
                    aVar2.a(i5, typedArray.getString(index));
                    break;
                case 75:
                    i11 = 75;
                    z = aVar.f896e.n0;
                    aVar2.a(i11, typedArray.getBoolean(index, z));
                    break;
                case 76:
                    i2 = 76;
                    i9 = aVar.f895d.f926e;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 77:
                    i5 = 77;
                    aVar2.a(i5, typedArray.getString(index));
                    break;
                case 78:
                    i2 = 78;
                    i9 = aVar.f894c.f936c;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 79:
                    i7 = 79;
                    f4 = aVar.f895d.f928g;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 80:
                    i11 = 80;
                    z = aVar.f896e.l0;
                    aVar2.a(i11, typedArray.getBoolean(index, z));
                    break;
                case 81:
                    i11 = 81;
                    z = aVar.f896e.m0;
                    aVar2.a(i11, typedArray.getBoolean(index, z));
                    break;
                case 82:
                    i2 = 82;
                    i12 = aVar.f895d.f924c;
                    i3 = typedArray.getInteger(index, i12);
                    aVar2.a(i2, i3);
                    break;
                case 83:
                    i2 = 83;
                    i10 = aVar.f897f.f946i;
                    i3 = b(typedArray, index, i10);
                    aVar2.a(i2, i3);
                    break;
                case 84:
                    i2 = 84;
                    i12 = aVar.f895d.f932k;
                    i3 = typedArray.getInteger(index, i12);
                    aVar2.a(i2, i3);
                    break;
                case 85:
                    i7 = 85;
                    f4 = aVar.f895d.f931j;
                    f2 = typedArray.getFloat(index, f4);
                    aVar2.a(i7, f2);
                    break;
                case 86:
                    int i15 = typedArray.peekValue(index).type;
                    i14 = 88;
                    if (i15 == 1) {
                        aVar.f895d.n = typedArray.getResourceId(index, -1);
                        aVar2.a(89, aVar.f895d.n);
                        cVar = aVar.f895d;
                        if (cVar.n == -1) {
                            break;
                        }
                    } else {
                        if (i15 == 3) {
                            aVar.f895d.f933l = typedArray.getString(index);
                            aVar2.a(90, aVar.f895d.f933l);
                            if (aVar.f895d.f933l.indexOf("/") > 0) {
                                aVar.f895d.n = typedArray.getResourceId(index, -1);
                                aVar2.a(89, aVar.f895d.n);
                                cVar = aVar.f895d;
                            } else {
                                cVar = aVar.f895d;
                                cVar.f934m = -1;
                            }
                        } else {
                            c cVar2 = aVar.f895d;
                            cVar2.f934m = typedArray.getInteger(index, cVar2.n);
                            cVar = aVar.f895d;
                        }
                        i8 = cVar.f934m;
                        aVar2.a(i14, i8);
                        break;
                    }
                    cVar.f934m = -2;
                    i8 = cVar.f934m;
                    aVar2.a(i14, i8);
                case 87:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f889e.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 93:
                    i2 = 93;
                    i4 = aVar.f896e.L;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 94:
                    i2 = 94;
                    i4 = aVar.f896e.S;
                    i3 = typedArray.getDimensionPixelSize(index, i4);
                    aVar2.a(i2, i3);
                    break;
                case 95:
                    a(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    a(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    i2 = 97;
                    i9 = aVar.f896e.o0;
                    i3 = typedArray.getInt(index, i9);
                    aVar2.a(i2, i3);
                    break;
                case 98:
                    if (!l.B0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.a = typedArray.getResourceId(index, aVar.a);
                            break;
                        }
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        if (aVar.a != -1) {
                            break;
                        }
                    }
                    aVar.f893b = typedArray.getString(index);
                    break;
            }
        }
    }

    private void a(Context context, a aVar, TypedArray typedArray, boolean z) {
        c cVar;
        String str;
        c cVar2;
        StringBuilder sb;
        String str2;
        if (z) {
            a(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (!(index == k.Constraint_android_id || k.Constraint_android_layout_marginStart == index || k.Constraint_android_layout_marginEnd == index)) {
                aVar.f895d.a = true;
                aVar.f896e.f911b = true;
                aVar.f894c.a = true;
                aVar.f897f.a = true;
            }
            switch (f889e.get(index)) {
                case 1:
                    b bVar = aVar.f896e;
                    bVar.p = b(typedArray, index, bVar.p);
                    continue;
                case 2:
                    b bVar2 = aVar.f896e;
                    bVar2.I = typedArray.getDimensionPixelSize(index, bVar2.I);
                    continue;
                case 3:
                    b bVar3 = aVar.f896e;
                    bVar3.o = b(typedArray, index, bVar3.o);
                    continue;
                case 4:
                    b bVar4 = aVar.f896e;
                    bVar4.n = b(typedArray, index, bVar4.n);
                    continue;
                case 5:
                    aVar.f896e.y = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f896e;
                    bVar5.C = typedArray.getDimensionPixelOffset(index, bVar5.C);
                    continue;
                case 7:
                    b bVar6 = aVar.f896e;
                    bVar6.D = typedArray.getDimensionPixelOffset(index, bVar6.D);
                    continue;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f896e;
                        bVar7.J = typedArray.getDimensionPixelSize(index, bVar7.J);
                    } else {
                        continue;
                    }
                case 9:
                    b bVar8 = aVar.f896e;
                    bVar8.v = b(typedArray, index, bVar8.v);
                    continue;
                case 10:
                    b bVar9 = aVar.f896e;
                    bVar9.u = b(typedArray, index, bVar9.u);
                    continue;
                case 11:
                    b bVar10 = aVar.f896e;
                    bVar10.P = typedArray.getDimensionPixelSize(index, bVar10.P);
                    continue;
                case 12:
                    b bVar11 = aVar.f896e;
                    bVar11.Q = typedArray.getDimensionPixelSize(index, bVar11.Q);
                    continue;
                case 13:
                    b bVar12 = aVar.f896e;
                    bVar12.M = typedArray.getDimensionPixelSize(index, bVar12.M);
                    continue;
                case 14:
                    b bVar13 = aVar.f896e;
                    bVar13.O = typedArray.getDimensionPixelSize(index, bVar13.O);
                    continue;
                case 15:
                    b bVar14 = aVar.f896e;
                    bVar14.R = typedArray.getDimensionPixelSize(index, bVar14.R);
                    continue;
                case 16:
                    b bVar15 = aVar.f896e;
                    bVar15.N = typedArray.getDimensionPixelSize(index, bVar15.N);
                    continue;
                case 17:
                    b bVar16 = aVar.f896e;
                    bVar16.f914e = typedArray.getDimensionPixelOffset(index, bVar16.f914e);
                    continue;
                case 18:
                    b bVar17 = aVar.f896e;
                    bVar17.f915f = typedArray.getDimensionPixelOffset(index, bVar17.f915f);
                    continue;
                case 19:
                    b bVar18 = aVar.f896e;
                    bVar18.f916g = typedArray.getFloat(index, bVar18.f916g);
                    continue;
                case 20:
                    b bVar19 = aVar.f896e;
                    bVar19.w = typedArray.getFloat(index, bVar19.w);
                    continue;
                case 21:
                    b bVar20 = aVar.f896e;
                    bVar20.f913d = typedArray.getLayoutDimension(index, bVar20.f913d);
                    continue;
                case 22:
                    d dVar = aVar.f894c;
                    dVar.f935b = typedArray.getInt(index, dVar.f935b);
                    d dVar2 = aVar.f894c;
                    dVar2.f935b = f888d[dVar2.f935b];
                    continue;
                case 23:
                    b bVar21 = aVar.f896e;
                    bVar21.f912c = typedArray.getLayoutDimension(index, bVar21.f912c);
                    continue;
                case 24:
                    b bVar22 = aVar.f896e;
                    bVar22.F = typedArray.getDimensionPixelSize(index, bVar22.F);
                    continue;
                case 25:
                    b bVar23 = aVar.f896e;
                    bVar23.f917h = b(typedArray, index, bVar23.f917h);
                    continue;
                case 26:
                    b bVar24 = aVar.f896e;
                    bVar24.f918i = b(typedArray, index, bVar24.f918i);
                    continue;
                case 27:
                    b bVar25 = aVar.f896e;
                    bVar25.E = typedArray.getInt(index, bVar25.E);
                    continue;
                case 28:
                    b bVar26 = aVar.f896e;
                    bVar26.G = typedArray.getDimensionPixelSize(index, bVar26.G);
                    continue;
                case 29:
                    b bVar27 = aVar.f896e;
                    bVar27.f919j = b(typedArray, index, bVar27.f919j);
                    continue;
                case 30:
                    b bVar28 = aVar.f896e;
                    bVar28.f920k = b(typedArray, index, bVar28.f920k);
                    continue;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f896e;
                        bVar29.K = typedArray.getDimensionPixelSize(index, bVar29.K);
                    } else {
                        continue;
                    }
                case 32:
                    b bVar30 = aVar.f896e;
                    bVar30.s = b(typedArray, index, bVar30.s);
                    continue;
                case 33:
                    b bVar31 = aVar.f896e;
                    bVar31.t = b(typedArray, index, bVar31.t);
                    continue;
                case 34:
                    b bVar32 = aVar.f896e;
                    bVar32.H = typedArray.getDimensionPixelSize(index, bVar32.H);
                    continue;
                case 35:
                    b bVar33 = aVar.f896e;
                    bVar33.f922m = b(typedArray, index, bVar33.f922m);
                    continue;
                case 36:
                    b bVar34 = aVar.f896e;
                    bVar34.f921l = b(typedArray, index, bVar34.f921l);
                    continue;
                case 37:
                    b bVar35 = aVar.f896e;
                    bVar35.x = typedArray.getFloat(index, bVar35.x);
                    continue;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    continue;
                case 39:
                    b bVar36 = aVar.f896e;
                    bVar36.U = typedArray.getFloat(index, bVar36.U);
                    continue;
                case 40:
                    b bVar37 = aVar.f896e;
                    bVar37.T = typedArray.getFloat(index, bVar37.T);
                    continue;
                case 41:
                    b bVar38 = aVar.f896e;
                    bVar38.V = typedArray.getInt(index, bVar38.V);
                    continue;
                case 42:
                    b bVar39 = aVar.f896e;
                    bVar39.W = typedArray.getInt(index, bVar39.W);
                    continue;
                case 43:
                    d dVar3 = aVar.f894c;
                    dVar3.f937d = typedArray.getFloat(index, dVar3.f937d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0014e eVar = aVar.f897f;
                        eVar.f950m = true;
                        eVar.n = typedArray.getDimension(index, eVar.n);
                    } else {
                        continue;
                    }
                case 45:
                    C0014e eVar2 = aVar.f897f;
                    eVar2.f940c = typedArray.getFloat(index, eVar2.f940c);
                    continue;
                case 46:
                    C0014e eVar3 = aVar.f897f;
                    eVar3.f941d = typedArray.getFloat(index, eVar3.f941d);
                    continue;
                case 47:
                    C0014e eVar4 = aVar.f897f;
                    eVar4.f942e = typedArray.getFloat(index, eVar4.f942e);
                    continue;
                case 48:
                    C0014e eVar5 = aVar.f897f;
                    eVar5.f943f = typedArray.getFloat(index, eVar5.f943f);
                    continue;
                case 49:
                    C0014e eVar6 = aVar.f897f;
                    eVar6.f944g = typedArray.getDimension(index, eVar6.f944g);
                    continue;
                case 50:
                    C0014e eVar7 = aVar.f897f;
                    eVar7.f945h = typedArray.getDimension(index, eVar7.f945h);
                    continue;
                case 51:
                    C0014e eVar8 = aVar.f897f;
                    eVar8.f947j = typedArray.getDimension(index, eVar8.f947j);
                    continue;
                case 52:
                    C0014e eVar9 = aVar.f897f;
                    eVar9.f948k = typedArray.getDimension(index, eVar9.f948k);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0014e eVar10 = aVar.f897f;
                        eVar10.f949l = typedArray.getDimension(index, eVar10.f949l);
                    } else {
                        continue;
                    }
                case 54:
                    b bVar40 = aVar.f896e;
                    bVar40.X = typedArray.getInt(index, bVar40.X);
                    continue;
                case 55:
                    b bVar41 = aVar.f896e;
                    bVar41.Y = typedArray.getInt(index, bVar41.Y);
                    continue;
                case 56:
                    b bVar42 = aVar.f896e;
                    bVar42.Z = typedArray.getDimensionPixelSize(index, bVar42.Z);
                    continue;
                case 57:
                    b bVar43 = aVar.f896e;
                    bVar43.a0 = typedArray.getDimensionPixelSize(index, bVar43.a0);
                    continue;
                case 58:
                    b bVar44 = aVar.f896e;
                    bVar44.b0 = typedArray.getDimensionPixelSize(index, bVar44.b0);
                    continue;
                case 59:
                    b bVar45 = aVar.f896e;
                    bVar45.c0 = typedArray.getDimensionPixelSize(index, bVar45.c0);
                    continue;
                case 60:
                    C0014e eVar11 = aVar.f897f;
                    eVar11.f939b = typedArray.getFloat(index, eVar11.f939b);
                    continue;
                case 61:
                    b bVar46 = aVar.f896e;
                    bVar46.z = b(typedArray, index, bVar46.z);
                    continue;
                case 62:
                    b bVar47 = aVar.f896e;
                    bVar47.A = typedArray.getDimensionPixelSize(index, bVar47.A);
                    continue;
                case 63:
                    b bVar48 = aVar.f896e;
                    bVar48.B = typedArray.getFloat(index, bVar48.B);
                    continue;
                case 64:
                    c cVar3 = aVar.f895d;
                    cVar3.f923b = b(typedArray, index, cVar3.f923b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f895d;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f895d;
                        str = c.f.a.k.a.b.f2078c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f925d = str;
                    continue;
                case 66:
                    aVar.f895d.f927f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f895d;
                    cVar4.f930i = typedArray.getFloat(index, cVar4.f930i);
                    continue;
                case 68:
                    d dVar4 = aVar.f894c;
                    dVar4.f938e = typedArray.getFloat(index, dVar4.f938e);
                    continue;
                case 69:
                    aVar.f896e.d0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f896e.e0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f896e;
                    bVar49.f0 = typedArray.getInt(index, bVar49.f0);
                    continue;
                case 73:
                    b bVar50 = aVar.f896e;
                    bVar50.g0 = typedArray.getDimensionPixelSize(index, bVar50.g0);
                    continue;
                case 74:
                    aVar.f896e.j0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f896e;
                    bVar51.n0 = typedArray.getBoolean(index, bVar51.n0);
                    continue;
                case 76:
                    c cVar5 = aVar.f895d;
                    cVar5.f926e = typedArray.getInt(index, cVar5.f926e);
                    continue;
                case 77:
                    aVar.f896e.k0 = typedArray.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f894c;
                    dVar5.f936c = typedArray.getInt(index, dVar5.f936c);
                    continue;
                case 79:
                    c cVar6 = aVar.f895d;
                    cVar6.f928g = typedArray.getFloat(index, cVar6.f928g);
                    continue;
                case 80:
                    b bVar52 = aVar.f896e;
                    bVar52.l0 = typedArray.getBoolean(index, bVar52.l0);
                    continue;
                case 81:
                    b bVar53 = aVar.f896e;
                    bVar53.m0 = typedArray.getBoolean(index, bVar53.m0);
                    continue;
                case 82:
                    c cVar7 = aVar.f895d;
                    cVar7.f924c = typedArray.getInteger(index, cVar7.f924c);
                    continue;
                case 83:
                    C0014e eVar12 = aVar.f897f;
                    eVar12.f946i = b(typedArray, index, eVar12.f946i);
                    continue;
                case 84:
                    c cVar8 = aVar.f895d;
                    cVar8.f932k = typedArray.getInteger(index, cVar8.f932k);
                    continue;
                case 85:
                    c cVar9 = aVar.f895d;
                    cVar9.f931j = typedArray.getFloat(index, cVar9.f931j);
                    continue;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.f895d.n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f895d;
                        if (cVar2.n == -1) {
                            continue;
                        }
                    } else {
                        if (i3 == 3) {
                            aVar.f895d.f933l = typedArray.getString(index);
                            if (aVar.f895d.f933l.indexOf("/") > 0) {
                                aVar.f895d.n = typedArray.getResourceId(index, -1);
                                cVar2 = aVar.f895d;
                            } else {
                                aVar.f895d.f934m = -1;
                            }
                        } else {
                            c cVar10 = aVar.f895d;
                            cVar10.f934m = typedArray.getInteger(index, cVar10.n);
                        }
                    }
                    cVar2.f934m = -2;
                case 87:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f896e;
                    bVar54.q = b(typedArray, index, bVar54.q);
                    continue;
                case 92:
                    b bVar55 = aVar.f896e;
                    bVar55.r = b(typedArray, index, bVar55.r);
                    continue;
                case 93:
                    b bVar56 = aVar.f896e;
                    bVar56.L = typedArray.getDimensionPixelSize(index, bVar56.L);
                    continue;
                case 94:
                    b bVar57 = aVar.f896e;
                    bVar57.S = typedArray.getDimensionPixelSize(index, bVar57.S);
                    continue;
                case 95:
                    a(aVar.f896e, typedArray, index, 0);
                    continue;
                case 96:
                    a(aVar.f896e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f896e;
                    bVar58.o0 = typedArray.getInt(index, bVar58.o0);
                    continue;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f889e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    static void a(ConstraintLayout.b bVar, String str) {
        float f2 = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i3);
                if (substring2.length() > 0) {
                    f2 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i3, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f2 = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.F = str;
        bVar.G = f2;
        bVar.H = i2;
    }

    static void a(Object obj, TypedArray typedArray, int i2, int i3) {
        int i4;
        if (obj != null) {
            int i5 = typedArray.peekValue(i2).type;
            if (i5 != 3) {
                int i6 = -2;
                boolean z = false;
                if (i5 != 5) {
                    int i7 = typedArray.getInt(i2, 0);
                    if (i7 != -4) {
                        i6 = (i7 == -3 || !(i7 == -2 || i7 == -1)) ? 0 : i7;
                    } else {
                        z = true;
                    }
                } else {
                    i6 = typedArray.getDimensionPixelSize(i2, 0);
                }
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = i6;
                        bVar.X = z;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) bVar).height = i6;
                    bVar.Y = z;
                } else if (obj instanceof b) {
                    b bVar2 = (b) obj;
                    if (i3 == 0) {
                        bVar2.f912c = i6;
                        bVar2.l0 = z;
                        return;
                    }
                    bVar2.f913d = i6;
                    bVar2.m0 = z;
                } else if (obj instanceof a.C0013a) {
                    a.C0013a aVar = (a.C0013a) obj;
                    if (i3 == 0) {
                        aVar.a(23, i6);
                        i4 = 80;
                    } else {
                        aVar.a(21, i6);
                        i4 = 81;
                    }
                    aVar.a(i4, z);
                }
            } else {
                a(obj, typedArray.getString(i2), i3);
            }
        }
    }

    static void a(Object obj, String str, int i2) {
        int i3;
        int i4;
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                            }
                            a(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).y = trim2;
                        } else if (obj instanceof a.C0013a) {
                            ((a.C0013a) obj).a(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i2 == 0) {
                                    ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                    bVar2.I = parseFloat;
                                    return;
                                }
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.J = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i2 == 0) {
                                    bVar3.f912c = 0;
                                    bVar3.U = parseFloat;
                                    return;
                                }
                                bVar3.f913d = 0;
                                bVar3.T = parseFloat;
                            } else if (obj instanceof a.C0013a) {
                                a.C0013a aVar = (a.C0013a) obj;
                                if (i2 == 0) {
                                    aVar.a(23, 0);
                                    i4 = 39;
                                } else {
                                    aVar.a(21, 0);
                                    i4 = 40;
                                }
                                aVar.a(i4, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                                bVar4.S = max;
                                bVar4.M = 2;
                                return;
                            }
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.T = max;
                            bVar4.N = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i2 == 0) {
                                bVar5.f912c = 0;
                                bVar5.d0 = max;
                                bVar5.X = 2;
                                return;
                            }
                            bVar5.f913d = 0;
                            bVar5.e0 = max;
                            bVar5.Y = 2;
                        } else if (obj instanceof a.C0013a) {
                            a.C0013a aVar2 = (a.C0013a) obj;
                            if (i2 == 0) {
                                aVar2.a(23, 0);
                                i3 = 54;
                            } else {
                                aVar2.a(21, 0);
                                i3 = 55;
                            }
                            aVar2.a(i3, 2);
                        }
                    }
                }
            }
        }
    }

    private int[] a(View view, String str) {
        int i2;
        Object a2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = j.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) view.getParent()).a(0, trim)) != null && (a2 instanceof Integer)) {
                i2 = ((Integer) a2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* access modifiers changed from: private */
    public static int b(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public void a(Context context, int i2) {
        b((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cd, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void a(ConstraintLayout constraintLayout) {
        a(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f892c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f892c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + c.f.b.b.b.a(childAt));
            } else if (this.f891b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f892c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f892c.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof a) {
                            aVar.f896e.h0 = 1;
                            a aVar2 = (a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f896e.f0);
                            aVar2.setMargin(aVar.f896e.g0);
                            aVar2.setAllowsGoneWidget(aVar.f896e.n0);
                            b bVar = aVar.f896e;
                            int[] iArr = bVar.i0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.j0;
                                if (str != null) {
                                    bVar.i0 = a(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f896e.i0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        if (z) {
                            b.a(childAt, aVar.f898g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f894c;
                        if (dVar.f936c == 0) {
                            childAt.setVisibility(dVar.f935b);
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(aVar.f894c.f937d);
                            childAt.setRotation(aVar.f897f.f939b);
                            childAt.setRotationX(aVar.f897f.f940c);
                            childAt.setRotationY(aVar.f897f.f941d);
                            childAt.setScaleX(aVar.f897f.f942e);
                            childAt.setScaleY(aVar.f897f.f943f);
                            C0014e eVar = aVar.f897f;
                            if (eVar.f946i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f897f.f946i);
                                if (findViewById != null) {
                                    float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                    float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - ((float) childAt.getLeft()));
                                        childAt.setPivotY(top - ((float) childAt.getTop()));
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f944g)) {
                                    childAt.setPivotX(aVar.f897f.f944g);
                                }
                                if (!Float.isNaN(aVar.f897f.f945h)) {
                                    childAt.setPivotY(aVar.f897f.f945h);
                                }
                            }
                            childAt.setTranslationX(aVar.f897f.f947j);
                            childAt.setTranslationY(aVar.f897f.f948k);
                            if (Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(aVar.f897f.f949l);
                                C0014e eVar2 = aVar.f897f;
                                if (eVar2.f950m) {
                                    childAt.setElevation(eVar2.n);
                                }
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f892c.get(num);
            if (aVar3 != null) {
                if (aVar3.f896e.h0 == 1) {
                    a aVar4 = new a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f896e;
                    int[] iArr2 = bVar3.i0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.j0;
                        if (str2 != null) {
                            bVar3.i0 = a(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f896e.i0);
                        }
                    }
                    aVar4.setType(aVar3.f896e.f0);
                    aVar4.setMargin(aVar3.f896e.g0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.b();
                    aVar3.a(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.f896e.a) {
                    View hVar = new h(constraintLayout.getContext());
                    hVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(hVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof c) {
                ((c) childAt2).b(constraintLayout);
            }
        }
    }

    public void a(f fVar) {
        int childCount = fVar.getChildCount();
        this.f892c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = fVar.getChildAt(i2);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f891b || id != -1) {
                if (!this.f892c.containsKey(Integer.valueOf(id))) {
                    this.f892c.put(Integer.valueOf(id), new a());
                }
                a aVar2 = this.f892c.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof c) {
                        aVar2.a((a) ((c) childAt), (c) id, (int) aVar);
                    }
                    aVar2.a((a) id, (int) aVar);
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void b(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.f896e.a = true;
                    }
                    this.f892c.put(Integer.valueOf(a2.a), a2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f892c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f891b || id != -1) {
                if (!this.f892c.containsKey(Integer.valueOf(id))) {
                    this.f892c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.f892c.get(Integer.valueOf(id));
                if (aVar != null) {
                    aVar.f898g = b.a(this.a, childAt);
                    aVar.a((a) id, (int) bVar);
                    aVar.f894c.f935b = childAt.getVisibility();
                    if (Build.VERSION.SDK_INT >= 17) {
                        aVar.f894c.f937d = childAt.getAlpha();
                        aVar.f897f.f939b = childAt.getRotation();
                        aVar.f897f.f940c = childAt.getRotationX();
                        aVar.f897f.f941d = childAt.getRotationY();
                        aVar.f897f.f942e = childAt.getScaleX();
                        aVar.f897f.f943f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0014e eVar = aVar.f897f;
                            eVar.f944g = pivotX;
                            eVar.f945h = pivotY;
                        }
                        aVar.f897f.f947j = childAt.getTranslationX();
                        aVar.f897f.f948k = childAt.getTranslationY();
                        if (Build.VERSION.SDK_INT >= 21) {
                            aVar.f897f.f949l = childAt.getTranslationZ();
                            C0014e eVar2 = aVar.f897f;
                            if (eVar2.f950m) {
                                eVar2.n = childAt.getElevation();
                            }
                        }
                    }
                    if (childAt instanceof a) {
                        a aVar2 = (a) childAt;
                        aVar.f896e.n0 = aVar2.getAllowsGoneWidget();
                        aVar.f896e.i0 = aVar2.getReferencedIds();
                        aVar.f896e.f0 = aVar2.getType();
                        aVar.f896e.g0 = aVar2.getMargin();
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
