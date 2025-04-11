package f.a.a.a.n.d;

import android.content.Context;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.r;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class h implements c {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final File f8496b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8497c;

    /* renamed from: d  reason: collision with root package name */
    private final File f8498d;

    /* renamed from: e  reason: collision with root package name */
    private r f8499e = new r(this.f8498d);

    /* renamed from: f  reason: collision with root package name */
    private File f8500f;

    public h(Context context, File file, String str, String str2) {
        this.a = context;
        this.f8496b = file;
        this.f8497c = str2;
        this.f8498d = new File(this.f8496b, str);
        e();
    }

    private void a(File file, File file2) {
        Throwable th;
        FileInputStream fileInputStream;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = a(file2);
                i.a(fileInputStream, outputStream, new byte[1024]);
                i.a((Closeable) fileInputStream, "Failed to close file input stream");
                i.a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                th = th2;
                i.a((Closeable) fileInputStream, "Failed to close file input stream");
                i.a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            i.a((Closeable) fileInputStream, "Failed to close file input stream");
            i.a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    private void e() {
        this.f8500f = new File(this.f8496b, this.f8497c);
        if (!this.f8500f.exists()) {
            this.f8500f.mkdirs();
        }
    }

    @Override // f.a.a.a.n.d.c
    public int a() {
        return this.f8499e.o();
    }

    public OutputStream a(File file) {
        throw null;
    }

    @Override // f.a.a.a.n.d.c
    public List<File> a(int i2) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f8500f.listFiles()) {
            arrayList.add(file);
            if (arrayList.size() >= i2) {
                break;
            }
        }
        return arrayList;
    }

    @Override // f.a.a.a.n.d.c
    public void a(String str) {
        this.f8499e.close();
        a(this.f8498d, new File(this.f8500f, str));
        this.f8499e = new r(this.f8498d);
    }

    @Override // f.a.a.a.n.d.c
    public void a(List<File> list) {
        for (File file : list) {
            i.c(this.a, String.format("deleting sent analytics file %s", file.getName()));
            file.delete();
        }
    }

    @Override // f.a.a.a.n.d.c
    public void a(byte[] bArr) {
        this.f8499e.a(bArr);
    }

    @Override // f.a.a.a.n.d.c
    public boolean a(int i2, int i3) {
        return this.f8499e.a(i2, i3);
    }

    @Override // f.a.a.a.n.d.c
    public boolean b() {
        return this.f8499e.m();
    }

    @Override // f.a.a.a.n.d.c
    public List<File> c() {
        return Arrays.asList(this.f8500f.listFiles());
    }

    @Override // f.a.a.a.n.d.c
    public void d() {
        try {
            this.f8499e.close();
        } catch (IOException unused) {
        }
        this.f8498d.delete();
    }
}
