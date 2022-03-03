package com.crashlytics.android.d;

import android.content.Context;
import android.content.pm.PackageManager;
import f.a.a.a.c;
import f.a.a.a.l;
import f.a.a.a.n.a.d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class h implements d<String> {
    @Override // f.a.a.a.n.a.d
    public String a(Context context) {
        String str;
        long nanoTime = System.nanoTime();
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = a(context, "io.crash.air");
            str = a(zipInputStream);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (IOException e2) {
                    c.g().c("Beta", "Failed to close the APK file", e2);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            c.g().e("Beta", "Beta by Crashlytics app is not installed");
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        } catch (FileNotFoundException e3) {
            c.g().c("Beta", "Failed to find the APK file", e3);
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        } catch (IOException e4) {
            c.g().c("Beta", "Failed to read the APK file", e4);
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (IOException e5) {
                    c.g().c("Beta", "Failed to close the APK file", e5);
                }
            }
        } catch (Throwable th) {
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (IOException e6) {
                    c.g().c("Beta", "Failed to close the APK file", e6);
                }
            }
            throw th;
        }
        l g2 = c.g();
        g2.e("Beta", "Beta device token load took " + (((double) (System.nanoTime() - nanoTime)) / 1000000.0d) + "ms");
        return str;
        str = "";
        l g22 = c.g();
        g22.e("Beta", "Beta device token load took " + (((double) (System.nanoTime() - nanoTime)) / 1000000.0d) + "ms");
        return str;
    }

    /* access modifiers changed from: package-private */
    public String a(ZipInputStream zipInputStream) {
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry == null) {
            return "";
        }
        String name = nextEntry.getName();
        return name.startsWith("assets/com.crashlytics.android.beta/dirfactor-device-token=") ? name.substring(59, name.length() - 1) : "";
    }

    /* access modifiers changed from: package-private */
    public ZipInputStream a(Context context, String str) {
        return new ZipInputStream(new FileInputStream(context.getPackageManager().getApplicationInfo(str, 0).sourceDir));
    }
}
