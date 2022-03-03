package e.b.b.a.c.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class f0 implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private d0<?, ?> f7044b;

    /* renamed from: c  reason: collision with root package name */
    private Object f7045c;

    /* renamed from: d  reason: collision with root package name */
    private List<k0> f7046d = new ArrayList();

    f0() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(z.b(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final f0 clone() {
        Object clone;
        f0 f0Var = new f0();
        try {
            f0Var.f7044b = this.f7044b;
            if (this.f7046d == null) {
                f0Var.f7046d = null;
            } else {
                f0Var.f7046d.addAll(this.f7046d);
            }
            if (this.f7045c != null) {
                if (this.f7045c instanceof i0) {
                    clone = (i0) ((i0) this.f7045c).clone();
                } else if (this.f7045c instanceof byte[]) {
                    clone = ((byte[]) this.f7045c).clone();
                } else {
                    int i2 = 0;
                    if (this.f7045c instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f7045c;
                        byte[][] bArr2 = new byte[bArr.length][];
                        f0Var.f7045c = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (this.f7045c instanceof boolean[]) {
                        clone = ((boolean[]) this.f7045c).clone();
                    } else if (this.f7045c instanceof int[]) {
                        clone = ((int[]) this.f7045c).clone();
                    } else if (this.f7045c instanceof long[]) {
                        clone = ((long[]) this.f7045c).clone();
                    } else if (this.f7045c instanceof float[]) {
                        clone = ((float[]) this.f7045c).clone();
                    } else if (this.f7045c instanceof double[]) {
                        clone = ((double[]) this.f7045c).clone();
                    } else if (this.f7045c instanceof i0[]) {
                        i0[] i0VarArr = (i0[]) this.f7045c;
                        i0[] i0VarArr2 = new i0[i0VarArr.length];
                        f0Var.f7045c = i0VarArr2;
                        while (i2 < i0VarArr.length) {
                            i0VarArr2[i2] = (i0) i0VarArr[i2].clone();
                            i2++;
                        }
                    }
                }
                f0Var.f7045c = clone;
            }
            return f0Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f7045c == null) {
            int i2 = 0;
            for (k0 k0Var : this.f7046d) {
                i2 += z.e(k0Var.a) + 0 + k0Var.f7052b.length;
            }
            return i2;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void a(k0 k0Var) {
        NoSuchMethodError noSuchMethodError;
        List<k0> list = this.f7046d;
        if (list != null) {
            list.add(k0Var);
            return;
        }
        Object obj = this.f7045c;
        if (obj instanceof i0) {
            byte[] bArr = k0Var.f7052b;
            y a = y.a(bArr, 0, bArr.length);
            int e2 = a.e();
            if (e2 == bArr.length - z.b(e2)) {
                i0 a2 = ((i0) this.f7045c).a(a);
                this.f7044b = this.f7044b;
                this.f7045c = a2;
                this.f7046d = null;
                return;
            }
            throw h0.b();
        }
        boolean z = obj instanceof i0[];
        Collections.singletonList(k0Var);
        if (z) {
            throw noSuchMethodError;
        }
        noSuchMethodError = new NoSuchMethodError();
        throw noSuchMethodError;
    }

    /* access modifiers changed from: package-private */
    public final void a(z zVar) {
        if (this.f7045c == null) {
            for (k0 k0Var : this.f7046d) {
                zVar.a(k0Var.a);
                zVar.a(k0Var.f7052b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<k0> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f7045c == null || f0Var.f7045c == null) {
            List<k0> list2 = this.f7046d;
            if (list2 != null && (list = f0Var.f7046d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(b(), f0Var.b());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            d0<?, ?> d0Var = this.f7044b;
            if (d0Var != f0Var.f7044b) {
                return false;
            }
            if (!d0Var.a.isArray()) {
                return this.f7045c.equals(f0Var.f7045c);
            }
            Object obj2 = this.f7045c;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) f0Var.f7045c) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) f0Var.f7045c) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) f0Var.f7045c) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) f0Var.f7045c) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) f0Var.f7045c) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) f0Var.f7045c) : Arrays.deepEquals((Object[]) obj2, (Object[]) f0Var.f7045c);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
