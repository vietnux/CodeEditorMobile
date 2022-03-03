package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class fv implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private dv<?, ?> f4354b;

    /* renamed from: c  reason: collision with root package name */
    private Object f4355c;

    /* renamed from: d  reason: collision with root package name */
    private List<kv> f4356d = new ArrayList();

    fv() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(av.b(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final fv clone() {
        Object clone;
        fv fvVar = new fv();
        try {
            fvVar.f4354b = this.f4354b;
            if (this.f4356d == null) {
                fvVar.f4356d = null;
            } else {
                fvVar.f4356d.addAll(this.f4356d);
            }
            if (this.f4355c != null) {
                if (this.f4355c instanceof iv) {
                    clone = (iv) ((iv) this.f4355c).clone();
                } else if (this.f4355c instanceof byte[]) {
                    clone = ((byte[]) this.f4355c).clone();
                } else {
                    int i2 = 0;
                    if (this.f4355c instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f4355c;
                        byte[][] bArr2 = new byte[bArr.length][];
                        fvVar.f4355c = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (this.f4355c instanceof boolean[]) {
                        clone = ((boolean[]) this.f4355c).clone();
                    } else if (this.f4355c instanceof int[]) {
                        clone = ((int[]) this.f4355c).clone();
                    } else if (this.f4355c instanceof long[]) {
                        clone = ((long[]) this.f4355c).clone();
                    } else if (this.f4355c instanceof float[]) {
                        clone = ((float[]) this.f4355c).clone();
                    } else if (this.f4355c instanceof double[]) {
                        clone = ((double[]) this.f4355c).clone();
                    } else if (this.f4355c instanceof iv[]) {
                        iv[] ivVarArr = (iv[]) this.f4355c;
                        iv[] ivVarArr2 = new iv[ivVarArr.length];
                        fvVar.f4355c = ivVarArr2;
                        while (i2 < ivVarArr.length) {
                            ivVarArr2[i2] = (iv) ivVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
                fvVar.f4355c = clone;
            }
            return fvVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f4355c == null) {
            int i2 = 0;
            for (kv kvVar : this.f4356d) {
                i2 += av.d(kvVar.a) + 0 + kvVar.f4838b.length;
            }
            return i2;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void a(av avVar) {
        if (this.f4355c == null) {
            for (kv kvVar : this.f4356d) {
                avVar.a(kvVar.a);
                avVar.a(kvVar.f4838b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void a(kv kvVar) {
        NoSuchMethodError noSuchMethodError;
        List<kv> list = this.f4356d;
        if (list != null) {
            list.add(kvVar);
            return;
        }
        Object obj = this.f4355c;
        if (obj instanceof iv) {
            byte[] bArr = kvVar.f4838b;
            yu a = yu.a(bArr, 0, bArr.length);
            int h2 = a.h();
            if (h2 == bArr.length - av.c(h2)) {
                iv a2 = ((iv) this.f4355c).a(a);
                this.f4354b = this.f4354b;
                this.f4355c = a2;
                this.f4356d = null;
                return;
            }
            throw hv.b();
        }
        boolean z = obj instanceof iv[];
        Collections.singletonList(kvVar);
        if (z) {
            throw noSuchMethodError;
        }
        noSuchMethodError = new NoSuchMethodError();
        throw noSuchMethodError;
    }

    public final boolean equals(Object obj) {
        List<kv> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        if (this.f4355c == null || fvVar.f4355c == null) {
            List<kv> list2 = this.f4356d;
            if (list2 != null && (list = fvVar.f4356d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(b(), fvVar.b());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            dv<?, ?> dvVar = this.f4354b;
            if (dvVar != fvVar.f4354b) {
                return false;
            }
            if (!dvVar.a.isArray()) {
                return this.f4355c.equals(fvVar.f4355c);
            }
            Object obj2 = this.f4355c;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) fvVar.f4355c) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) fvVar.f4355c) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) fvVar.f4355c) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) fvVar.f4355c) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) fvVar.f4355c) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fvVar.f4355c) : Arrays.deepEquals((Object[]) obj2, (Object[]) fvVar.f4355c);
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
