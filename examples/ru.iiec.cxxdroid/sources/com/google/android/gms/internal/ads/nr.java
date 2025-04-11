package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class nr extends zp<Integer> implements rr<Integer>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private int[] f5106c;

    /* renamed from: d  reason: collision with root package name */
    private int f5107d;

    static {
        new nr().p();
    }

    nr() {
        this(new int[10], 0);
    }

    private nr(int[] iArr, int i2) {
        this.f5106c = iArr;
        this.f5107d = i2;
    }

    private final void a(int i2, int i3) {
        int i4;
        a();
        if (i2 < 0 || i2 > (i4 = this.f5107d)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        int[] iArr = this.f5106c;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[(((i4 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f5106c, i2, iArr2, i2 + 1, this.f5107d - i2);
            this.f5106c = iArr2;
        }
        this.f5106c[i2] = i3;
        this.f5107d++;
        ((AbstractList) this).modCount++;
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f5107d) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f5107d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.rr' to match base method */
    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr<Integer> a(int i2) {
        if (i2 >= this.f5107d) {
            return new nr(Arrays.copyOf(this.f5106c, i2), this.f5107d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a(i2, ((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        or.a(collection);
        if (!(collection instanceof nr)) {
            return super.addAll(collection);
        }
        nr nrVar = (nr) collection;
        int i2 = nrVar.f5107d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f5107d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f5106c;
            if (i4 > iArr.length) {
                this.f5106c = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(nrVar.f5106c, 0, this.f5106c, this.f5107d, nrVar.f5107d);
            this.f5107d = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int c(int i2) {
        e(i2);
        return this.f5106c[i2];
    }

    public final void d(int i2) {
        a(this.f5107d, i2);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr)) {
            return super.equals(obj);
        }
        nr nrVar = (nr) obj;
        if (this.f5107d != nrVar.f5107d) {
            return false;
        }
        int[] iArr = nrVar.f5106c;
        for (int i2 = 0; i2 < this.f5107d; i2++) {
            if (this.f5106c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(c(i2));
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f5107d; i3++) {
            i2 = (i2 * 31) + this.f5106c[i3];
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        int[] iArr = this.f5106c;
        int i3 = iArr[i2];
        int i4 = this.f5107d;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, i4 - i2);
        }
        this.f5107d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f5107d; i2++) {
            if (obj.equals(Integer.valueOf(this.f5106c[i2]))) {
                int[] iArr = this.f5106c;
                System.arraycopy(iArr, i2 + 1, iArr, i2, this.f5107d - i2);
                this.f5107d--;
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
            int[] iArr = this.f5106c;
            System.arraycopy(iArr, i3, iArr, i2, this.f5107d - i3);
            this.f5107d -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        e(i2);
        int[] iArr = this.f5106c;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f5107d;
    }
}
