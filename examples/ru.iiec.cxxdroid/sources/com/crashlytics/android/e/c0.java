package com.crashlytics.android.e;

import f.a.a.a.c;
import f.a.a.a.n.b.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

class c0 {
    private final File a;

    static {
        Charset.forName("UTF-8");
    }

    public c0(File file) {
        this.a = file;
    }

    private static String a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    private static w0 d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new w0(a(jSONObject, "userId"), a(jSONObject, "userName"), a(jSONObject, "userEmail"));
    }

    public File a(String str) {
        File file = this.a;
        return new File(file, str + "keys" + ".meta");
    }

    public File b(String str) {
        File file = this.a;
        return new File(file, str + "user" + ".meta");
    }

    public w0 c(String str) {
        Throwable th;
        Exception e2;
        File b2 = b(str);
        if (!b2.exists()) {
            return w0.f3044d;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(b2);
            try {
                w0 d2 = d(i.b(fileInputStream2));
                i.a((Closeable) fileInputStream2, "Failed to close user metadata file.");
                return d2;
            } catch (Exception e3) {
                e2 = e3;
                fileInputStream = fileInputStream2;
                try {
                    c.g().c("CrashlyticsCore", "Error deserializing user metadata.", e2);
                    i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    return w0.f3044d;
                } catch (Throwable th2) {
                    th = th2;
                    i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            c.g().c("CrashlyticsCore", "Error deserializing user metadata.", e2);
            i.a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return w0.f3044d;
        }
    }
}
