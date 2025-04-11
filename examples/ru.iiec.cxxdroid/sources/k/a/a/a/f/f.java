package k.a.a.a.f;

import java.util.ArrayList;
import java.util.List;

public class f {
    static {
        a(a(a(), a("CVS")));
        a(a(a(), a(".svn")));
    }

    public static g a() {
        return d.f9526b;
    }

    public static g a(String str) {
        return new h(str);
    }

    public static g a(g gVar) {
        return new i(gVar);
    }

    public static g a(g... gVarArr) {
        return new b(c(gVarArr));
    }

    public static g b(g... gVarArr) {
        return new j(c(gVarArr));
    }

    public static List<g> c(g... gVarArr) {
        if (gVarArr != null) {
            ArrayList arrayList = new ArrayList(gVarArr.length);
            for (int i2 = 0; i2 < gVarArr.length; i2++) {
                if (gVarArr[i2] != null) {
                    arrayList.add(gVarArr[i2]);
                } else {
                    throw new IllegalArgumentException("The filter[" + i2 + "] is null");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
