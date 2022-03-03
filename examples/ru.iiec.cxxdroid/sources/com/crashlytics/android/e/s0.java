package com.crashlytics.android.e;

import com.crashlytics.android.e.c;
import f.a.a.a.n.b.i;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class s0 implements c.a {
    s0() {
    }

    private static String a(String str) {
        Throwable th;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = i.a((InputStream) bufferedInputStream2);
                i.a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                i.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i.a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    @Override // com.crashlytics.android.e.c.a
    public String a(File file) {
        return a(file.getPath());
    }
}
