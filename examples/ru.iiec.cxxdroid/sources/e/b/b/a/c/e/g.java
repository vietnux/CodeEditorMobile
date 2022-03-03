package e.b.b.a.c.e;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
public final class g implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    private e<?, ?> f7264b;

    /* renamed from: c  reason: collision with root package name */
    private Object f7265c;

    /* renamed from: d  reason: collision with root package name */
    private List<l> f7266d = new ArrayList();

    g() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(b.b(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final g clone() {
        Object clone;
        g gVar = new g();
        try {
            gVar.f7264b = this.f7264b;
            if (this.f7266d == null) {
                gVar.f7266d = null;
            } else {
                gVar.f7266d.addAll(this.f7266d);
            }
            if (this.f7265c != null) {
                if (this.f7265c instanceof j) {
                    clone = (j) ((j) this.f7265c).clone();
                } else if (this.f7265c instanceof byte[]) {
                    clone = ((byte[]) this.f7265c).clone();
                } else {
                    int i2 = 0;
                    if (this.f7265c instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f7265c;
                        byte[][] bArr2 = new byte[bArr.length][];
                        gVar.f7265c = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (this.f7265c instanceof boolean[]) {
                        clone = ((boolean[]) this.f7265c).clone();
                    } else if (this.f7265c instanceof int[]) {
                        clone = ((int[]) this.f7265c).clone();
                    } else if (this.f7265c instanceof long[]) {
                        clone = ((long[]) this.f7265c).clone();
                    } else if (this.f7265c instanceof float[]) {
                        clone = ((float[]) this.f7265c).clone();
                    } else if (this.f7265c instanceof double[]) {
                        clone = ((double[]) this.f7265c).clone();
                    } else if (this.f7265c instanceof j[]) {
                        j[] jVarArr = (j[]) this.f7265c;
                        j[] jVarArr2 = new j[jVarArr.length];
                        gVar.f7265c = jVarArr2;
                        while (i2 < jVarArr.length) {
                            jVarArr2[i2] = (j) jVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
                gVar.f7265c = clone;
            }
            return gVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        Object obj = this.f7265c;
        if (obj != null) {
            e<?, ?> eVar = this.f7264b;
            if (eVar.f7223b) {
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    if (Array.get(obj, i2) != null) {
                        eVar.a(Array.get(obj, i2));
                        throw null;
                    }
                }
                return 0;
            }
            eVar.a(obj);
            throw null;
        }
        int i3 = 0;
        for (l lVar : this.f7266d) {
            i3 += b.e(lVar.a) + 0 + lVar.f7402b.length;
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        Object obj = this.f7265c;
        if (obj != null) {
            e<?, ?> eVar = this.f7264b;
            if (eVar.f7223b) {
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = Array.get(obj, i2);
                    if (obj2 != null) {
                        eVar.a(obj2, bVar);
                        throw null;
                    }
                }
                return;
            }
            eVar.a(obj, bVar);
            throw null;
        }
        for (l lVar : this.f7266d) {
            bVar.a(lVar.a);
            bVar.a(lVar.f7402b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(l lVar) {
        List<l> list = this.f7266d;
        if (list != null) {
            list.add(lVar);
            return;
        }
        Object obj = this.f7265c;
        if (obj instanceof j) {
            byte[] bArr = lVar.f7402b;
            a a = a.a(bArr, 0, bArr.length);
            int e2 = a.e();
            if (e2 == bArr.length - b.b(e2)) {
                j a2 = ((j) this.f7265c).a(a);
                this.f7264b = this.f7264b;
                this.f7265c = a2;
                this.f7266d = null;
                return;
            }
            throw i.b();
        } else if (obj instanceof j[]) {
            this.f7264b.a(Collections.singletonList(lVar));
            throw null;
        } else {
            this.f7264b.a(Collections.singletonList(lVar));
            throw null;
        }
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
        if (this.f7265c == null || gVar.f7265c == null) {
            List<l> list2 = this.f7266d;
            if (list2 != null && (list = gVar.f7266d) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(b(), gVar.b());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            e<?, ?> eVar = this.f7264b;
            if (eVar != gVar.f7264b) {
                return false;
            }
            if (!eVar.a.isArray()) {
                return this.f7265c.equals(gVar.f7265c);
            }
            Object obj2 = this.f7265c;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) gVar.f7265c) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) gVar.f7265c) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) gVar.f7265c) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) gVar.f7265c) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) gVar.f7265c) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) gVar.f7265c) : Arrays.deepEquals((Object[]) obj2, (Object[]) gVar.f7265c);
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
