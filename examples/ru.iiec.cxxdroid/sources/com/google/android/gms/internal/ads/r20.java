package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.x0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@k2
public final class r20 {
    private final v20 a;

    /* renamed from: b  reason: collision with root package name */
    private final h30 f5371b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5372c;

    private r20() {
        this.f5372c = false;
        this.a = new v20();
        this.f5371b = new h30();
        b();
    }

    public r20(v20 v20) {
        this.a = v20;
        this.f5372c = ((Boolean) a50.g().a(k80.a3)).booleanValue();
        this.f5371b = new h30();
        b();
    }

    public static r20 a() {
        return new r20();
    }

    private final synchronized void b() {
        this.f5371b.f4485l = new a30();
        this.f5371b.f4485l.f3748f = new d30();
        this.f5371b.f4482i = new f30();
    }

    private final synchronized void b(t20 t20) {
        this.f5371b.f4481h = c();
        x20 a2 = this.a.a(iv.a(this.f5371b));
        a2.b(t20.b());
        a2.a();
        String valueOf = String.valueOf(Integer.toString(t20.b(), 10));
        l9.e(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void c(t20 t20) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(d(t20).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        l9.e("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    l9.e("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        l9.e("Could not close Clearcut output stream.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                        l9.e("Could not close Clearcut output stream.");
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                l9.e("Could not find file for Clearcut");
            }
        }
    }

    private static long[] c() {
        int i2;
        List<String> b2 = k80.b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b2.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i2 < length) {
                try {
                    arrayList.add(Long.valueOf(split[i2]));
                } catch (NumberFormatException unused) {
                    l9.e("Experiment ID is not a number");
                }
                i2++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jArr[i3] = ((Long) obj).longValue();
            i3++;
        }
        return jArr;
    }

    private final synchronized String d(t20 t20) {
        return String.format("id=%s,timestamp=%s,event=%s", this.f5371b.f4477d, Long.valueOf(x0.m().b()), Integer.valueOf(t20.b()));
    }

    public final synchronized void a(s20 s20) {
        if (this.f5372c) {
            try {
                s20.a(this.f5371b);
            } catch (NullPointerException e2) {
                x0.j().a(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void a(t20 t20) {
        if (this.f5372c) {
            if (((Boolean) a50.g().a(k80.b3)).booleanValue()) {
                c(t20);
            } else {
                b(t20);
            }
        }
    }
}
