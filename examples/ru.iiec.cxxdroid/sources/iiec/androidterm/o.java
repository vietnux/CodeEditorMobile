package iiec.androidterm;

import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import iiec.androidterm.compat.FileCompat;
import iiec.androidterm.t.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class o extends d {
    private int D;
    private Thread E;
    private String F;
    private Handler G = new a();

    class a extends Handler {
        a() {
        }

        public void handleMessage(Message message) {
            if (o.this.f() && message.what == 1) {
                o.this.b((o) ((Integer) message.obj).intValue());
            }
        }
    }

    class b extends Thread {
        b() {
        }

        public void run() {
            Log.i("Term", "waiting for: " + o.this.D);
            int waitFor = TermExec.waitFor(o.this.D);
            Log.i("Term", "Subprocess exited: " + waitFor);
            o.this.G.sendMessageDelayed(o.this.G.obtainMessage(1, Integer.valueOf(waitFor)), 100);
        }
    }

    public o(c cVar, String str) {
        super(ParcelFileDescriptor.open(new File("/dev/ptmx"), 805306368), cVar, false);
        m();
        a(new ParcelFileDescriptor.AutoCloseOutputStream(this.y));
        a(new ParcelFileDescriptor.AutoCloseInputStream(this.y));
        this.F = str;
        this.E = new b();
        this.E.setName("Process watcher");
    }

    private int a(String str, String[] strArr) {
        String[] strArr2;
        String str2;
        ArrayList<String> g2 = g(str);
        try {
            str2 = g2.get(0);
            File file = new File(str2);
            if (!file.exists()) {
                Log.e("Term", "Shell " + str2 + " not found!");
                throw new FileNotFoundException(str2);
            } else if (FileCompat.a(file)) {
                strArr2 = (String[]) g2.toArray(new String[1]);
                return TermExec.a(this.y, str2, strArr2, strArr);
            } else {
                Log.e("Term", "Shell " + str2 + " not executable!");
                throw new FileNotFoundException(str2);
            }
        } catch (Exception unused) {
            ArrayList<String> g3 = g(this.z.l());
            str2 = g3.get(0);
            strArr2 = (String[]) g3.toArray(new String[1]);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(int i2) {
        i();
    }

    private String f(String str) {
        String[] split = str.split(":");
        StringBuilder sb = new StringBuilder(str.length());
        for (String str2 : split) {
            File file = new File(str2);
            if (file.isDirectory() && FileCompat.a(file)) {
                sb.append(str2);
                sb.append(":");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r7 == '\"') goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r7 == '\"') goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r2.append(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList<java.lang.String> g(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: iiec.androidterm.o.g(java.lang.String):java.util.ArrayList");
    }

    private void h(String str) {
        if (str.length() > 0) {
            b(str + '\r');
        }
    }

    private void m() {
        String s;
        c cVar = this.z;
        String str = System.getenv("PATH");
        if (cVar.d()) {
            String f2 = cVar.f();
            if (f2 != null && f2.length() > 0) {
                str = str + ":" + f2;
            }
            if (cVar.b() && (s = cVar.s()) != null && s.length() > 0) {
                str = s + ":" + str;
            }
        }
        if (cVar.z()) {
            str = f(str);
        }
        String p = cVar.p();
        if (cVar.p() == null) {
            p = TermService.f9244e;
        }
        this.D = a(cVar.u(), new String[]{"TERM=" + cVar.v(), "PATH=" + str, "HOME=" + p});
    }

    @Override // iiec.androidterm.d, iiec.androidterm.r.m
    public void a() {
        l();
        super.a();
    }

    @Override // iiec.androidterm.d, iiec.androidterm.r.m
    public void a(int i2, int i3) {
        super.a(i2, i3);
        this.E.start();
        h(this.F);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        TermExec.sendSignal(-this.D, 1);
    }
}
