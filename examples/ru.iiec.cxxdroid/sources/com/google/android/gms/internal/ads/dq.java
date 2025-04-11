package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class dq extends zp<Boolean> implements rr<Boolean>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f4130c;

    /* renamed from: d  reason: collision with root package name */
    private int f4131d;

    static {
        new dq().p();
    }

    dq() {
        this(new boolean[10], 0);
    }

    private dq(boolean[] zArr, int i2) {
        this.f4130c = zArr;
        this.f4131d = i2;
    }

    private final void a(int i2, boolean z) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f4131d)) {
            throw new IndexOutOfBoundsException(d(i2));
        }
        boolean[] zArr = this.f4130c;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f4130c, i2, zArr2, i2 + 1, this.f4131d - i2);
            this.f4130c = zArr2;
        }
        this.f4130c[i2] = z;
        this.f4131d++;
        ((AbstractList) this).modCount++;
    }

    private final void c(int i2) {
        if (i2 < 0 || i2 >= this.f4131d) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    private final String d(int i2) {
        int i3 = this.f4131d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.rr' to match base method */
    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr<Boolean> a(int i2) {
        if (i2 >= this.f4131d) {
            return new dq(Arrays.copyOf(this.f4130c, i2), this.f4131d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z) {
        a(this.f4131d, z);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a(i2, ((Boolean) obj).booleanValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        or.a(collection);
        if (!(collection instanceof dq)) {
            return super.addAll(collection);
        }
        dq dqVar = (dq) collection;
        int i2 = dqVar.f4131d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4131d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f4130c;
            if (i4 > zArr.length) {
                this.f4130c = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(dqVar.f4130c, 0, this.f4130c, this.f4131d, dqVar.f4131d);
            this.f4131d = i4;
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
        if (!(obj instanceof dq)) {
            return super.equals(obj);
        }
        dq dqVar = (dq) obj;
        if (this.f4131d != dqVar.f4131d) {
            return false;
        }
        boolean[] zArr = dqVar.f4130c;
        for (int i2 = 0; i2 < this.f4131d; i2++) {
            if (this.f4130c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        c(i2);
        return Boolean.valueOf(this.f4130c[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4131d; i3++) {
            i2 = (i2 * 31) + or.a(this.f4130c[i3]);
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        c(i2);
        boolean[] zArr = this.f4130c;
        boolean z = zArr[i2];
        int i3 = this.f4131d;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, i3 - i2);
        }
        this.f4131d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f4131d; i2++) {
            if (obj.equals(Boolean.valueOf(this.f4130c[i2]))) {
                boolean[] zArr = this.f4130c;
                System.arraycopy(zArr, i2 + 1, zArr, i2, this.f4131d - i2);
                this.f4131d--;
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
            boolean[] zArr = this.f4130c;
            System.arraycopy(zArr, i3, zArr, i2, this.f4131d - i3);
            this.f4131d -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i2);
        boolean[] zArr = this.f4130c;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f4131d;
    }
}
