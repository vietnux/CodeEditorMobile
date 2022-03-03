package ru.iiec.cxxdroid.a0;

import android.widget.TextView;
import e.d.a.a.n;
import e.d.a.a.q;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.util.ArrayList;
import k.a.a.a.e;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.v0.a;
import qwe.qweqwe.texteditor.w0.d.c;
import qwe.qweqwe.texteditor.w0.d.d;
import ru.iiec.cxxdroid.u;

public class b extends c {

    /* renamed from: k  reason: collision with root package name */
    String f9940k = "CodeCheckBench";

    /* renamed from: l  reason: collision with root package name */
    String f9941l = "CodeCheck";

    /* renamed from: m  reason: collision with root package name */
    Process f9942m;

    public b(e0 e0Var) {
        super(e0Var);
    }

    @Override // qwe.qweqwe.texteditor.w0.d.c
    public ArrayList<d> a(c.d dVar) {
        InputStream inputStream;
        ArrayList<d> arrayList = new ArrayList<>();
        String str = dVar.f9840c;
        long currentTimeMillis = System.currentTimeMillis();
        i0.a(this.f9940k, "start get new complete: " + (System.currentTimeMillis() - currentTimeMillis));
        boolean z = true;
        try {
            File file = new File(a.i(this.f9828c));
            String str2 = u.a(this.f9828c, dVar.a, dVar.f9840c, this.f9828c.b(dVar.a)) + " -fsyntax-only " + "-fno-color-diagnostics -fdiagnostics-parseable-fixits -fdiagnostics-print-source-range-info" + " -";
            i0.a(this.f9941l, "exec command: " + str2);
            this.f9942m = e.e.a.a.c(this.f9828c).a(new String[]{a.g(this.f9828c), "-c", str2}, u.j(this.f9828c), file);
            OutputStream outputStream = this.f9942m.getOutputStream();
            e.a(ru.iiec.cxxdroid.c0.b.g(str, this.f9828c), outputStream);
            outputStream.close();
            i0.a("CodeCheckBench", "exec done: " + (System.currentTimeMillis() - currentTimeMillis));
            inputStream = this.f9942m.getErrorStream();
        } catch (Exception e2) {
            e2.printStackTrace();
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    i0.a(this.f9941l, "resLine:" + readLine);
                    if (z) {
                        i0.a(this.f9940k, "got first line:" + (System.currentTimeMillis() - currentTimeMillis));
                        z = false;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                }
                String sb2 = sb.toString();
                String c2 = ru.iiec.cxxdroid.c0.b.c(str, this.f9828c);
                if (c2 != null) {
                    sb2 = c2 + sb2;
                }
                arrayList = a.b(sb2);
                this.f9942m.waitFor();
                int exitValue = this.f9942m.exitValue();
                this.f9942m = null;
                ru.iiec.cxxdroid.c0.b.a(sb2, str, dVar.a, exitValue, this.f9828c, this.f9828c.b(dVar.a));
            } catch (InterruptedIOException unused) {
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        i0.a(this.f9940k, "All complete: " + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    @Override // qwe.qweqwe.texteditor.w0.d.c
    public void a(TextView textView, d dVar) {
        int a = e.d.a.a.b.a(this.f9828c, dVar.a);
        String a2 = a(dVar.a);
        textView.setText(a(a, a2, " : " + dVar.f9843d), TextView.BufferType.SPANNABLE);
    }

    @Override // qwe.qweqwe.texteditor.w0.d.c
    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.d.c
    public long e() {
        return 500;
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.d.c
    public Class[] f() {
        return new Class[]{n.class, q.class};
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.w0.d.c
    public void g() {
        Process process = this.f9942m;
        if (process != null) {
            process.destroy();
        }
        super.g();
    }
}
