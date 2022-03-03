package e.b.b.a.c.b;

import android.content.Context;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f7060b;

    /* renamed from: c  reason: collision with root package name */
    private final p f7061c;

    /* renamed from: d  reason: collision with root package name */
    private final p f7062d;

    /* renamed from: e  reason: collision with root package name */
    private final p f7063e;

    /* renamed from: f  reason: collision with root package name */
    private final r f7064f;

    public o(Context context, p pVar, p pVar2, p pVar3, r rVar) {
        this.f7060b = context;
        this.f7061c = pVar;
        this.f7062d = pVar2;
        this.f7063e = pVar3;
        this.f7064f = rVar;
    }

    private static s a(p pVar) {
        s sVar = new s();
        if (pVar.c() != null) {
            Map<String, Map<String, byte[]>> c2 = pVar.c();
            ArrayList arrayList = new ArrayList();
            if (c2 != null) {
                for (String str : c2.keySet()) {
                    ArrayList arrayList2 = new ArrayList();
                    Map<String, byte[]> map = c2.get(str);
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            t tVar = new t();
                            tVar.f7083c = str2;
                            tVar.f7084d = map.get(str2);
                            arrayList2.add(tVar);
                        }
                    }
                    v vVar = new v();
                    vVar.f7091c = str;
                    vVar.f7092d = (t[]) arrayList2.toArray(new t[arrayList2.size()]);
                    arrayList.add(vVar);
                }
            }
            sVar.f7074c = (v[]) arrayList.toArray(new v[arrayList.size()]);
        }
        if (pVar.b() != null) {
            List<byte[]> b2 = pVar.b();
            sVar.f7076e = (byte[][]) b2.toArray(new byte[b2.size()][]);
        }
        sVar.f7075d = pVar.a();
        return sVar;
    }

    public final void run() {
        w wVar = new w();
        p pVar = this.f7061c;
        if (pVar != null) {
            wVar.f7093c = a(pVar);
        }
        p pVar2 = this.f7062d;
        if (pVar2 != null) {
            wVar.f7094d = a(pVar2);
        }
        p pVar3 = this.f7063e;
        if (pVar3 != null) {
            wVar.f7095e = a(pVar3);
        }
        if (this.f7064f != null) {
            u uVar = new u();
            uVar.f7085c = this.f7064f.a();
            uVar.f7086d = this.f7064f.b();
            wVar.f7096f = uVar;
        }
        r rVar = this.f7064f;
        if (!(rVar == null || rVar.c() == null)) {
            ArrayList arrayList = new ArrayList();
            Map<String, m> c2 = this.f7064f.c();
            for (String str : c2.keySet()) {
                if (c2.get(str) != null) {
                    x xVar = new x();
                    xVar.f7101e = str;
                    xVar.f7100d = c2.get(str).b();
                    xVar.f7099c = c2.get(str).a();
                    arrayList.add(xVar);
                }
            }
            wVar.f7097g = (x[]) arrayList.toArray(new x[arrayList.size()]);
        }
        byte[] bArr = new byte[wVar.b()];
        try {
            z a = z.a(bArr, 0, bArr.length);
            wVar.a(a);
            a.a();
            try {
                FileOutputStream openFileOutput = this.f7060b.openFileOutput("persisted_config", 0);
                openFileOutput.write(bArr);
                openFileOutput.close();
            } catch (IOException e2) {
                Log.e("AsyncPersisterTask", "Could not persist config.", e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e3);
        }
    }
}
