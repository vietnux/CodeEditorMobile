package i.f0.j;

import j.l;
import j.r;
import j.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface a {
    public static final a a = new C0138a();

    /* renamed from: i.f0.j.a$a  reason: collision with other inner class name */
    class C0138a implements a {
        C0138a() {
        }

        @Override // i.f0.j.a
        public void a(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        @Override // i.f0.j.a
        public void a(File file, File file2) {
            a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        @Override // i.f0.j.a
        public s b(File file) {
            return l.c(file);
        }

        @Override // i.f0.j.a
        public r c(File file) {
            try {
                return l.b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return l.b(file);
            }
        }

        @Override // i.f0.j.a
        public void d(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        d(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        @Override // i.f0.j.a
        public r e(File file) {
            try {
                return l.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return l.a(file);
            }
        }

        @Override // i.f0.j.a
        public boolean f(File file) {
            return file.exists();
        }

        @Override // i.f0.j.a
        public long g(File file) {
            return file.length();
        }
    }

    void a(File file);

    void a(File file, File file2);

    s b(File file);

    r c(File file);

    void d(File file);

    r e(File file);

    boolean f(File file);

    long g(File file);
}
