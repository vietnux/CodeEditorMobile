package com.crashlytics.android.e;

import android.content.Context;
import f.a.a.a.n.b.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

final class g0 {
    private static File a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static byte[] a(Context context, String str) {
        return new c(context, new s0()).a(str);
    }

    static byte[] a(File file) {
        File a = a(file, ".device_info");
        if (a == null) {
            return null;
        }
        return d(a);
    }

    static byte[] a(File file, Context context) {
        File a = a(file, ".binary_libs");
        if (a == null) {
            return null;
        }
        return b(a, context);
    }

    private static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static byte[] b(File file) {
        File a = a(file, ".dmp");
        return a == null ? new byte[0] : c(a);
    }

    private static byte[] b(File file, Context context) {
        byte[] d2 = d(file);
        if (d2 == null || d2.length == 0) {
            return null;
        }
        return a(context, new String(d2));
    }

    private static byte[] c(File file) {
        return d(file);
    }

    static byte[] d(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] a = a(fileInputStream);
                i.a((Closeable) fileInputStream);
                return a;
            } catch (FileNotFoundException unused) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                i.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            i.a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            i.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            i.a((Closeable) fileInputStream2);
            throw th;
        }
    }
}
