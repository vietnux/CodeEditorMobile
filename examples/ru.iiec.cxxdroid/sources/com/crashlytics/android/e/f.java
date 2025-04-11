package com.crashlytics.android.e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

class f extends FileOutputStream {

    /* renamed from: e  reason: collision with root package name */
    public static final FilenameFilter f2911e = new a();

    /* renamed from: b  reason: collision with root package name */
    private final String f2912b;

    /* renamed from: c  reason: collision with root package name */
    private File f2913c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2914d = false;

    static class a implements FilenameFilter {
        a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public f(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f2912b = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2912b);
        sb.append(".cls_temp");
        this.f2913c = new File(sb.toString());
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f2914d) {
            this.f2914d = true;
            super.flush();
            super.close();
            File file = new File(this.f2912b + ".cls");
            if (this.f2913c.renameTo(file)) {
                this.f2913c = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f2913c.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.f2913c + " -> " + file + str);
        }
    }

    public void l() {
        if (!this.f2914d) {
            this.f2914d = true;
            super.flush();
            super.close();
        }
    }
}
