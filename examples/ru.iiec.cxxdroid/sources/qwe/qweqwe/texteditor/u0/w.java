package qwe.qweqwe.texteditor.u0;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import qwe.qweqwe.texteditor.i0;

public class w {

    /* renamed from: g  reason: collision with root package name */
    protected static ProgressDialog f9750g;
    protected final Handler a;

    /* renamed from: b  reason: collision with root package name */
    boolean f9751b = true;

    /* renamed from: c  reason: collision with root package name */
    protected final Activity f9752c;

    /* renamed from: d  reason: collision with root package name */
    protected final Bundle f9753d;

    /* renamed from: e  reason: collision with root package name */
    int f9754e = 20;

    /* renamed from: f  reason: collision with root package name */
    private int f9755f = 0;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f9756b;

        a(InputStream inputStream) {
            this.f9756b = inputStream;
        }

        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9756b));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        w.this.f();
                        if (w.this.f9751b) {
                            i0.a("FirstTimerRunner", readLine);
                        }
                    } else {
                        this.f9756b.close();
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputStream f9758b;

        b(InputStream inputStream) {
            this.f9758b = inputStream;
        }

        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9758b));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        this.f9758b.close();
                        return;
                    } else if (w.this.f9751b) {
                        i0.b("FirstTimerRunner", readLine);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                w.f9750g.setProgress(w.this.f9755f);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public w(Activity activity, Bundle bundle) {
        this.f9753d = bundle;
        this.f9752c = activity;
        this.a = new Handler();
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public File a() {
        return new ContextWrapper(this.f9752c).getFilesDir();
    }

    public boolean a(String str) {
        return a(str, a());
    }

    public boolean a(String str, File file) {
        InputStream inputStream;
        boolean z;
        String str2 = b() + " tar -xvJ ";
        Process process = null;
        try {
            inputStream = this.f9752c.getAssets().open(str);
            z = true;
        } catch (IOException e2) {
            e2.printStackTrace();
            inputStream = null;
            z = false;
        }
        if (inputStream != null) {
            if (this.f9751b) {
                i0.a("FirstTimerRunner", "got tarFile ");
            }
            try {
                process = e.e.a.a.c(this.f9752c).a(str2, (String[]) null, file);
                new Thread(new a(process.getInputStream())).start();
                new Thread(new b(process.getErrorStream())).start();
                OutputStream outputStream = process.getOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
                if (this.f9751b) {
                    i0.a("FirstTimerRunner", "end.");
                }
                outputStream.flush();
                outputStream.close();
            } catch (Exception e3) {
                e3.printStackTrace();
                z = false;
            }
        }
        try {
            if (this.f9751b) {
                i0.a("FirstTimerRunner", "waiting for...");
            }
            process.waitFor();
            if (this.f9751b) {
                i0.a("FirstTimerRunner", "waited");
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return z;
    }

    public String b() {
        throw null;
    }

    public String c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public int d() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(7:1|2|3|4|5|6|(2:8|9))|10|11|34|(2:36|37)|40|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
        if (r3 == null) goto L_0x0064;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0044 A[Catch:{ all -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c A[SYNTHETIC, Splitter:B:30:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9 A[SYNTHETIC, Splitter:B:43:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0 A[SYNTHETIC, Splitter:B:47:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: qwe.qweqwe.texteditor.u0.w.e():boolean");
    }

    /* access modifiers changed from: protected */
    public void f() {
        this.f9755f++;
        this.f9754e++;
        if (this.f9754e >= d()) {
            this.f9754e = 0;
            this.a.post(new c());
        }
    }
}
