package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class lb implements wp {
    private final Map<String, lc> a;

    /* renamed from: b  reason: collision with root package name */
    private long f4858b;

    /* renamed from: c  reason: collision with root package name */
    private final File f4859c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4860d;

    public lb(File file) {
        this(file, 5242880);
    }

    private lb(File file, int i2) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.f4858b = 0;
        this.f4859c = file;
        this.f4860d = 5242880;
    }

    private static int a(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(md mdVar) {
        return new String(a(mdVar, c(mdVar)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i2) {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write(i2 >>> 24);
    }

    static void a(OutputStream outputStream, long j2) {
        outputStream.write((byte) ((int) j2));
        outputStream.write((byte) ((int) (j2 >>> 8)));
        outputStream.write((byte) ((int) (j2 >>> 16)));
        outputStream.write((byte) ((int) (j2 >>> 24)));
        outputStream.write((byte) ((int) (j2 >>> 32)));
        outputStream.write((byte) ((int) (j2 >>> 40)));
        outputStream.write((byte) ((int) (j2 >>> 48)));
        outputStream.write((byte) ((int) (j2 >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void a(String str, lc lcVar) {
        if (!this.a.containsKey(str)) {
            this.f4858b += lcVar.a;
        } else {
            this.f4858b += lcVar.a - this.a.get(str).a;
        }
        this.a.put(str, lcVar);
    }

    private static byte[] a(md mdVar, long j2) {
        long l2 = mdVar.l();
        if (j2 >= 0 && j2 <= l2) {
            int i2 = (int) j2;
            if (((long) i2) == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(mdVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(l2);
        throw new IOException(sb.toString());
    }

    static int b(InputStream inputStream) {
        return (a(inputStream) << 24) | a(inputStream) | 0 | (a(inputStream) << 8) | (a(inputStream) << 16);
    }

    static List<z50> b(md mdVar) {
        int b2 = b((InputStream) mdVar);
        List<z50> emptyList = b2 == 0 ? Collections.emptyList() : new ArrayList<>(b2);
        for (int i2 = 0; i2 < b2; i2++) {
            emptyList.add(new z50(a(mdVar).intern(), a(mdVar).intern()));
        }
        return emptyList;
    }

    private final synchronized void b(String str) {
        boolean delete = e(str).delete();
        c(str);
        if (!delete) {
            e4.a("Could not delete cache entry for key=%s, filename=%s", str, d(str));
        }
    }

    static long c(InputStream inputStream) {
        return (((long) a(inputStream)) & 255) | 0 | ((((long) a(inputStream)) & 255) << 8) | ((((long) a(inputStream)) & 255) << 16) | ((((long) a(inputStream)) & 255) << 24) | ((((long) a(inputStream)) & 255) << 32) | ((((long) a(inputStream)) & 255) << 40) | ((((long) a(inputStream)) & 255) << 48) | ((255 & ((long) a(inputStream))) << 56);
    }

    private final void c(String str) {
        lc remove = this.a.remove(str);
        if (remove != null) {
            this.f4858b -= remove.a;
        }
    }

    private static String d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File e(String str) {
        return new File(this.f4859c, d(str));
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final synchronized void F() {
        if (!this.f4859c.exists()) {
            if (!this.f4859c.mkdirs()) {
                e4.b("Unable to create cache dir %s", this.f4859c.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f4859c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    long length = file.length();
                    md mdVar = new md(new BufferedInputStream(a(file)), length);
                    try {
                        lc a2 = lc.a(mdVar);
                        a2.a = length;
                        a(a2.f4861b, a2);
                    } finally {
                        mdVar.close();
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final synchronized tw a(String str) {
        lc lcVar = this.a.get(str);
        if (lcVar == null) {
            return null;
        }
        File e2 = e(str);
        try {
            md mdVar = new md(new BufferedInputStream(a(e2)), e2.length());
            try {
                lc a2 = lc.a(mdVar);
                if (!TextUtils.equals(str, a2.f4861b)) {
                    e4.a("%s: key=%s, found=%s", e2.getAbsolutePath(), str, a2.f4861b);
                    c(str);
                    return null;
                }
                byte[] a3 = a(mdVar, mdVar.l());
                tw twVar = new tw();
                twVar.a = a3;
                twVar.f5657b = lcVar.f4862c;
                twVar.f5658c = lcVar.f4863d;
                twVar.f5659d = lcVar.f4864e;
                twVar.f5660e = lcVar.f4865f;
                twVar.f5661f = lcVar.f4866g;
                List<z50> list = lcVar.f4867h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (z50 z50 : list) {
                    treeMap.put(z50.a(), z50.b());
                }
                twVar.f5662g = treeMap;
                twVar.f5663h = Collections.unmodifiableList(lcVar.f4867h);
                mdVar.close();
                return twVar;
            } finally {
                mdVar.close();
            }
        } catch (IOException e3) {
            e4.a("%s: %s", e2.getAbsolutePath(), e3.toString());
            b(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final synchronized void a(String str, tw twVar) {
        long j2;
        Iterator<Map.Entry<String, lc>> it;
        long length = (long) twVar.a.length;
        if (this.f4858b + length >= ((long) this.f4860d)) {
            if (e4.f4172b) {
                e4.c("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f4858b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, lc>> it2 = this.a.entrySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    j2 = j3;
                    break;
                }
                lc value = it2.next().getValue();
                j2 = j3;
                if (e(value.f4861b).delete()) {
                    it = it2;
                    this.f4858b -= value.a;
                } else {
                    it = it2;
                    e4.a("Could not delete cache entry for key=%s, filename=%s", value.f4861b, d(value.f4861b));
                }
                it.remove();
                i2++;
                if (((float) (this.f4858b + length)) < ((float) this.f4860d) * 0.9f) {
                    break;
                }
                j3 = j2;
                it2 = it;
            }
            if (e4.f4172b) {
                e4.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f4858b - j2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        File e2 = e(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e2));
            lc lcVar = new lc(str, twVar);
            if (lcVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(twVar.a);
                bufferedOutputStream.close();
                a(str, lcVar);
            } else {
                bufferedOutputStream.close();
                e4.a("Failed to write header for %s", e2.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!e2.delete()) {
                e4.a("Could not clean up file %s", e2.getAbsolutePath());
            }
        }
    }
}
