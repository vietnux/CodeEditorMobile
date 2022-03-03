package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* access modifiers changed from: package-private */
public final class kr extends zp<Float> implements rr<Float>, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private float[] f4836c;

    /* renamed from: d  reason: collision with root package name */
    private int f4837d;

    static {
        new kr().p();
    }

    kr() {
        this(new float[10], 0);
    }

    private kr(float[] fArr, int i2) {
        this.f4836c = fArr;
        this.f4837d = i2;
    }

    private final void a(int i2, float f2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f4837d)) {
            throw new IndexOutOfBoundsException(d(i2));
        }
        float[] fArr = this.f4836c;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f4836c, i2, fArr2, i2 + 1, this.f4837d - i2);
            this.f4836c = fArr2;
        }
        this.f4836c[i2] = f2;
        this.f4837d++;
        ((AbstractList) this).modCount++;
    }

    private final void c(int i2) {
        if (i2 < 0 || i2 >= this.f4837d) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    private final String d(int i2) {
        int i3 = this.f4837d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.rr' to match base method */
    @Override // com.google.android.gms.internal.ads.rr
    public final /* synthetic */ rr<Float> a(int i2) {
        if (i2 >= this.f4837d) {
            return new kr(Arrays.copyOf(this.f4836c, i2), this.f4837d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(float f2) {
        a(this.f4837d, f2);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i2, Object obj) {
        a(i2, ((Float) obj).floatValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.ads.zp, java.util.Collection
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        or.a(collection);
        if (!(collection instanceof kr)) {
            return super.addAll(collection);
        }
        kr krVar = (kr) collection;
        int i2 = krVar.f4837d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4837d;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f4836c;
            if (i4 > fArr.length) {
                this.f4836c = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(krVar.f4836c, 0, this.f4836c, this.f4837d, krVar.f4837d);
            this.f4837d = i4;
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
        if (!(obj instanceof kr)) {
            return super.equals(obj);
        }
        kr krVar = (kr) obj;
        if (this.f4837d != krVar.f4837d) {
            return false;
        }
        float[] fArr = krVar.f4836c;
        for (int i2 = 0; i2 < this.f4837d; i2++) {
            if (this.f4836c[i2] != fArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i2) {
        c(i2);
        return Float.valueOf(this.f4836c[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f4837d; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f4836c[i3]);
        }
        return i2;
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object remove(int i2) {
        a();
        c(i2);
        float[] fArr = this.f4836c;
        float f2 = fArr[i2];
        int i3 = this.f4837d;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, i3 - i2);
        }
        this.f4837d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.List, com.google.android.gms.internal.ads.zp
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f4837d; i2++) {
            if (obj.equals(Float.valueOf(this.f4836c[i2]))) {
                float[] fArr = this.f4836c;
                System.arraycopy(fArr, i2 + 1, fArr, i2, this.f4837d - i2);
                this.f4837d--;
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
            float[] fArr = this.f4836c;
            System.arraycopy(fArr, i3, fArr, i2, this.f4837d - i3);
            this.f4837d -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i2);
        float[] fArr = this.f4836c;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f4837d;
    }
}
