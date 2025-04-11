package f.a.a.a.n.f;

import android.content.Context;
import f.a.a.a.c;
import f.a.a.a.i;
import java.io.File;

public class b implements a {
    private final Context a;

    public b(i iVar) {
        if (iVar.j() != null) {
            this.a = iVar.j();
            iVar.o();
            String str = "Android/" + this.a.getPackageName();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Override // f.a.a.a.n.f.a
    public File a() {
        return a(this.a.getFilesDir());
    }

    /* access modifiers changed from: package-private */
    public File a(File file) {
        if (file == null) {
            c.g().e("Fabric", "Null File");
            return null;
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            c.g().a("Fabric", "Couldn't create file");
            return null;
        }
    }
}
