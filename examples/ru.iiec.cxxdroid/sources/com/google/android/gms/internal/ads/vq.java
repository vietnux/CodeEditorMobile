package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class vq extends zp<Double> implements rr<Double>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private double[] f5843c;

    /* renamed from: d  reason: collision with root package name */
    private int f5844d;

    static {
        new vq().p();
    }

    vq() {
        this(new double[10], 0);
    }

    private vq(double[] dArr, int i2) {
        this.f5843c = dArr;
        this.f5844d = i2;
    }

    private final void a(int i2, double d2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f5844d)) {
            throw new IndexOutOfBoundsException(d(i2));
        }
        double[] dArr = this.f5843c;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f5843c, i2, dArr2, i2 + 1, this.f5844d - i2);
            this.f5843c = dArr2;
        }
        this.f5843c[i2] = d2;
        this.f5844d++;
        ((AbstractList) this).modCount++;
    }

    private final void c(int i2) {
        if (i2 < 0 || i2 >= this.f5844d) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    private final String d(int i2) {
        int i3 = this.f5844d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.rr' to match base method */
    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr<Double> a(int i2) {
        if (i2 >= this.f5844d) {
            return new vq(Arrays.copyOf(this.f5843c, i2), this.f5844d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(double d2) {
        a(this.f5844d, d2);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a(i2, ((Double) obj).doubleValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        or.a(collection);
        if (!(collection instanceof vq)) {
            return super.addAll(collection);
        }
        vq vqVar = (vq) collection;
        int i2 = vqVar.f5844d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f5844d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f5843c;
            if (i4 > dArr.length) {
                this.f5843c = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(vqVar.f5843c, 0, this.f5843c, this.f5844d, vqVar.f5844d);
            this.f5844d = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq)) {
            return super.equals(obj);
        }
        vq vqVar = (vq) obj;
        if (this.f5844d != vqVar.f5844d) {
            return false;
        }
        double[] dArr = vqVar.f5843c;
        for (int i2 = 0; i2 < this.f5844d; i2++) {
            if (this.f5843c[i2] != dArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        c(i2);
        return Double.valueOf(this.f5843c[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f5844d; i3++) {
            i2 = (i2 * 31) + or.a(Double.doubleToLongBits(this.f5843c[i3]));
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        c(i2);
        double[] dArr = this.f5843c;
        double d2 = dArr[i2];
        int i3 = this.f5844d;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, i3 - i2);
        }
        this.f5844d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f5844d; i2++) {
            if (obj.equals(Double.valueOf(this.f5843c[i2]))) {
                double[] dArr = this.f5843c;
                System.arraycopy(dArr, i2 + 1, dArr, i2, this.f5844d - i2);
                this.f5844d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            double[] dArr = this.f5843c;
            System.arraycopy(dArr, i3, dArr, i2, this.f5844d - i3);
            this.f5844d -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        c(i2);
        double[] dArr = this.f5843c;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    public final int size() {
        return this.f5844d;
    }
}
