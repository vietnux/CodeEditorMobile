package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class hs extends zp<Long> implements rr<Long>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private long[] f4548c;

    /* renamed from: d  reason: collision with root package name */
    private int f4549d;

    static {
        new hs().p();
    }

    hs() {
        this(new long[10], 0);
    }

    private hs(long[] jArr, int i2) {
        this.f4548c = jArr;
        this.f4549d = i2;
    }

    private final void a(int i2, long j2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f4549d)) {
            throw new IndexOutOfBoundsException(e(i2));
        }
        long[] jArr = this.f4548c;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f4548c, i2, jArr2, i2 + 1, this.f4549d - i2);
            this.f4548c = jArr2;
        }
        this.f4548c[i2] = j2;
        this.f4549d++;
        ((AbstractList) this).modCount++;
    }

    private final void d(int i2) {
        if (i2 < 0 || i2 >= this.f4549d) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    private final String e(int i2) {
        int i3 = this.f4549d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.rr' to match base method */
    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr<Long> a(int i2) {
        if (i2 >= this.f4549d) {
            return new hs(Arrays.copyOf(this.f4548c, i2), this.f4549d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(long j2) {
        a(this.f4549d, j2);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a(i2, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        or.a(collection);
        if (!(collection instanceof hs)) {
            return super.addAll(collection);
        }
        hs hsVar = (hs) collection;
        int i2 = hsVar.f4549d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4549d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f4548c;
            if (i4 > jArr.length) {
                this.f4548c = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(hsVar.f4548c, 0, this.f4548c, this.f4549d, hsVar.f4549d);
            this.f4549d = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i2) {
        d(i2);
        return this.f4548c[i2];
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return super.equals(obj);
        }
        hs hsVar = (hs) obj;
        if (this.f4549d != hsVar.f4549d) {
            return false;
        }
        long[] jArr = hsVar.f4548c;
        for (int i2 = 0; i2 < this.f4549d; i2++) {
            if (this.f4548c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(c(i2));
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4549d; i3++) {
            i2 = (i2 * 31) + or.a(this.f4548c[i3]);
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        d(i2);
        long[] jArr = this.f4548c;
        long j2 = jArr[i2];
        int i3 = this.f4549d;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, i3 - i2);
        }
        this.f4549d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f4549d; i2++) {
            if (obj.equals(Long.valueOf(this.f4548c[i2]))) {
                long[] jArr = this.f4548c;
                System.arraycopy(jArr, i2 + 1, jArr, i2, this.f4549d - i2);
                this.f4549d--;
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
            long[] jArr = this.f4548c;
            System.arraycopy(jArr, i3, jArr, i2, this.f4549d - i3);
            this.f4549d -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        d(i2);
        long[] jArr = this.f4548c;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f4549d;
    }
}
