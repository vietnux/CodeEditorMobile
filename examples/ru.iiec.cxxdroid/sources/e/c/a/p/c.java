package e.c.a.p;

import android.content.Context;
import g.k;
import g.r.d.i;
import g.v.e;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class c {
    public static final Class<?> a(String str) {
        boolean z;
        i.d(str, "packageName");
        do {
            try {
                return Class.forName(str + ".R$string");
            } catch (ClassNotFoundException unused) {
                z = false;
                if (e.a((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
                    int b2 = e.b(str, '.', 0, false, 6, null);
                    if (str != null) {
                        str = str.substring(0, b2);
                        i.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new k("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    z = true;
                    continue;
                }
                if (!z) {
                    return null;
                }
            }
        } while (!z);
        return null;
    }

    public static final String[] a(Context context) {
        Field[] fields;
        String[] a;
        i.d(context, "$this$getFields");
        String packageName = context.getPackageName();
        i.a((Object) packageName, "packageName");
        Class<?> a2 = a(packageName);
        return (a2 == null || (fields = a2.getFields()) == null || (a = a(fields)) == null) ? new String[0] : a;
    }

    public static final String[] a(Field[] fieldArr) {
        i.d(fieldArr, "$this$toStringArray");
        ArrayList arrayList = new ArrayList(fieldArr.length);
        for (Field field : fieldArr) {
            arrayList.add(field.getName());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            i.a((Object) str, "it");
            if (e.a((CharSequence) str, (CharSequence) "define_", false, 2, (Object) null)) {
                arrayList2.add(obj);
            }
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new k("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
