package com.squareup.picasso;

import java.io.PrintWriter;

public class b0 {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6792b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6793c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6794d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6795e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6796f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6797g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6798h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6799i;

    /* renamed from: j  reason: collision with root package name */
    public final long f6800j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6801k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6802l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6803m;
    public final long n;

    public b0(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.a = i2;
        this.f6792b = i3;
        this.f6793c = j2;
        this.f6794d = j3;
        this.f6795e = j4;
        this.f6796f = j5;
        this.f6797g = j6;
        this.f6798h = j7;
        this.f6799i = j8;
        this.f6800j = j9;
        this.f6801k = i4;
        this.f6802l = i5;
        this.f6803m = i6;
        this.n = j10;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f6792b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f6792b) / ((float) this.a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f6793c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f6794d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f6801k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f6795e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f6798h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f6802l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f6796f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f6803m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f6797g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f6799i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f6800j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.a + ", size=" + this.f6792b + ", cacheHits=" + this.f6793c + ", cacheMisses=" + this.f6794d + ", downloadCount=" + this.f6801k + ", totalDownloadSize=" + this.f6795e + ", averageDownloadSize=" + this.f6798h + ", totalOriginalBitmapSize=" + this.f6796f + ", totalTransformedBitmapSize=" + this.f6797g + ", averageOriginalBitmapSize=" + this.f6799i + ", averageTransformedBitmapSize=" + this.f6800j + ", originalBitmapCount=" + this.f6802l + ", transformedBitmapCount=" + this.f6803m + ", timeStamp=" + this.n + '}';
    }
}
