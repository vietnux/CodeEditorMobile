package e.c.a.n;

import android.content.Context;
import android.content.pm.PackageManager;
import g.r.d.i;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public final List<e.c.a.o.a> a(Context context, List<e.c.a.o.a> list) {
        i.d(context, "mCtx");
        i.d(list, "libraries");
        ArrayList arrayList = new ArrayList();
        for (e.c.a.o.a aVar : list) {
            if (aVar.i().length() > 0) {
                try {
                    Context createPackageContext = context.createPackageContext(context.getPackageName(), 3);
                    String i2 = aVar.i();
                    i.a((Object) createPackageContext, "ctx");
                    Class.forName(i2, false, createPackageContext.getClassLoader());
                    arrayList.add(aVar);
                } catch (PackageManager.NameNotFoundException | ClassNotFoundException unused) {
                }
            }
        }
        return arrayList;
    }
}
