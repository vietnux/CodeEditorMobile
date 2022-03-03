package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class fq implements Serializable, Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final fq f4347c = new mq(or.f5189b);

    /* renamed from: d  reason: collision with root package name */
    private static final jq f4348d = (aq.a() ? new nq(null) : new hq(null));

    /* renamed from: b  reason: collision with root package name */
    private int f4349b = 0;

    fq() {
    }

    public static fq a(String str) {
        return new mq(str.getBytes(or.a));
    }

    public static fq a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static fq a(byte[] bArr, int i2, int i3) {
        return new mq(f4348d.a(bArr, i2, i3));
    }

    static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i3);
            sb3.append(" >= ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static fq b(byte[] bArr) {
        return new mq(bArr);
    }

    static kq d(int i2) {
        return new kq(i2, null);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i2, int i3, int i4);

    public abstract fq a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(eq eqVar);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i2, int i3, int i4);

    public final byte[] b() {
        int size = size();
        if (size == 0) {
            return or.f5189b;
        }
        byte[] bArr = new byte[size];
        a(bArr, 0, 0, size);
        return bArr;
    }

    public abstract byte c(int i2);

    public final String c() {
        return size() == 0 ? "" : a(or.a);
    }

    public abstract boolean d();

    public abstract oq e();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f4349b;
    }

    public final int hashCode() {
        int i2 = this.f4349b;
        if (i2 == 0) {
            int size = size();
            i2 = a(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f4349b = i2;
        }
        return i2;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new gq(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
