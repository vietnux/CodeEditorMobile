package e.b.b.a.c.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private e<?, ?> f7122b;

    /* renamed from: c  reason: collision with root package name */
    private Object f7123c;

    /* renamed from: d  reason: collision with root package name */
    private List<l> f7124d = new ArrayList();

    g() {
    }

    private final byte[] a() {
        if (this.f7123c == null) {
            int i2 = 0;
            for (l lVar : this.f7124d) {
                i2 += b.c(lVar.a) + 0 + lVar.f7126b.length;
            }
            byte[] bArr = new byte[i2];
            b b2 = b.b(bArr);
            if (this.f7123c == null) {
                for (l lVar2 : this.f7124d) {
                    b2.a(lVar2.a);
                    b2.a(lVar2.f7126b);
                }
                return bArr;
            }
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final g clone() {
        Object clone;
        g gVar = new g();
        try {
            gVar.f7122b = this.f7122b;
            if (this.f7124d == null) {
                gVar.f7124d = null;
            } else {
                gVar.f7124d.addAll(this.f7124d);
            }
            if (this.f7123c != null) {
                if (this.f7123c instanceof j) {
                    clone = (j) ((j) this.f7123c).clone();
                } else if (this.f7123c instanceof byte[]) {
                    clone = ((byte[]) this.f7123c).clone();
                } else {
                    int i2 = 0;
                    if (this.f7123c instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f7123c;
                        byte[][] bArr2 = new byte[bArr.length][];
                        gVar.f7123c = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (this.f7123c instanceof boolean[]) {
                        clone = ((boolean[]) this.f7123c).clone();
                    } else if (this.f7123c instanceof int[]) {
                        clone = ((int[]) this.f7123c).clone();
                    } else if (this.f7123c instanceof long[]) {
                        clone = ((long[]) this.f7123c).clone();
                    } else if (this.f7123c instanceof float[]) {
                        clone = ((float[]) this.f7123c).clone();
                    } else if (this.f7123c instanceof double[]) {
                        clone = ((double[]) this.f7123c).clone();
                    } else if (this.f7123c instanceof j[]) {
                        j[] jVarArr = (j[]) this.f7123c;
                        j[] jVarArr2 = new j[jVarArr.length];
                        gVar.f7123c = jVarArr2;
                        while (i2 < jVarArr.length) {
                            jVarArr2[i2] = (j) jVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
                gVar.f7123c = clone;
            }
            return gVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(l lVar) {
        NoSuchMethodError noSuchMethodError;
        List<l> list = this.f7124d;
        if (list != null) {
            list.add(lVar);
            return;
        }
        Object obj = this.f7123c;
        if (obj instanceof j) {
            byte[] bArr = lVar.f7126b;
            a a = a.a(bArr, 0, bArr.length);
            int f2 = a.f();
            if (f2 == bArr.length - (f2 >= 0 ? b.c(f2) : 10)) {
                j a2 = ((j) this.f7123c).a(a);
                this.f7122b = this.f7122b;
                this.f7123c = a2;
                this.f7124d = null;
                return;
            }
            throw i.b();
        }
        boolean z = obj instanceof j[];
        Collections.singletonList(lVar);
        if (z) {
            throw noSuchMethodError;
        }
        noSuchMethodError = new NoSuchMethodError();
        throw noSuchMethodError;
    }

    public final boolean equals(Object obj) {
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7123c == null || gVar.f7123c == null) {
            List<l> list2 = this.f7124d;
            if (list2 != null && (list = gVar.f7124d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(a(), gVar.a());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            e<?, ?> eVar = this.f7122b;
            if (eVar != gVar.f7122b) {
                return false;
            }
            if (!eVar.a.isArray()) {
                return this.f7123c.equals(gVar.f7123c);
            }
            Object obj2 = this.f7123c;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) gVar.f7123c) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) gVar.f7123c) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) gVar.f7123c) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) gVar.f7123c) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) gVar.f7123c) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) gVar.f7123c) : Arrays.deepEquals((Object[]) obj2, (Object[]) gVar.f7123c);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(a()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
