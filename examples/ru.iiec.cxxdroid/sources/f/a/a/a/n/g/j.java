package f.a.a.a.n.g;

import f.a.a.a.c;
import f.a.a.a.i;
import f.a.a.a.n.f.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class j implements h {
    private final i a;

    public j(i iVar) {
        this.a = iVar;
    }

    @Override // f.a.a.a.n.g.h
    public JSONObject a() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        JSONObject jSONObject;
        c.g().e("Fabric", "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new b(this.a).a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(f.a.a.a.n.b.i.b(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        c.g().c("Fabric", "Failed to fetch cached settings", e2);
                        f.a.a.a.n.b.i.a((Closeable) fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        f.a.a.a.n.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                c.g().e("Fabric", "No cached settings found.");
                jSONObject = null;
            }
            f.a.a.a.n.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
            c.g().c("Fabric", "Failed to fetch cached settings", e2);
            f.a.a.a.n.b.i.a((Closeable) fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            f.a.a.a.n.b.i.a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // f.a.a.a.n.g.h
    public void a(long j2, JSONObject jSONObject) {
        Throwable th;
        Exception e2;
        c.g().e("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j2);
                FileWriter fileWriter2 = new FileWriter(new File(new b(this.a).a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    f.a.a.a.n.b.i.a((Closeable) fileWriter2, "Failed to close settings writer.");
                } catch (Exception e3) {
                    e2 = e3;
                    fileWriter = fileWriter2;
                    try {
                        c.g().c("Fabric", "Failed to cache settings", e2);
                        f.a.a.a.n.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th2) {
                        th = th2;
                        f.a.a.a.n.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = fileWriter2;
                    f.a.a.a.n.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                c.g().c("Fabric", "Failed to cache settings", e2);
                f.a.a.a.n.b.i.a((Closeable) fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
