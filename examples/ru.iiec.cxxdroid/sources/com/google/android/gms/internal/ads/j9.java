package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class j9 {

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f4692e = new ka();
    private final List<byte[]> a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f4693b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f4694c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f4695d = 4096;

    public j9(int i2) {
    }

    private final synchronized void a() {
        while (this.f4694c > this.f4695d) {
            byte[] remove = this.a.remove(0);
            this.f4693b.remove(remove);
            this.f4694c -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f4695d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f4693b, bArr, f4692e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f4693b.add(binarySearch, bArr);
                this.f4694c += bArr.length;
                a();
            }
        }
    }

    public final synchronized byte[] a(int i2) {
        for (int i3 = 0; i3 < this.f4693b.size(); i3++) {
            byte[] bArr = this.f4693b.get(i3);
            if (bArr.length >= i2) {
                this.f4694c -= bArr.length;
                this.f4693b.remove(i3);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }
}
