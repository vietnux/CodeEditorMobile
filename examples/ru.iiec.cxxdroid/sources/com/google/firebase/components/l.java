package com.google.firebase.components;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class l {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final o f6581b;

    public l(Context context) {
        this(context, new n());
    }

    private l(Context context, o oVar) {
        this.a = context;
        this.f6581b = oVar;
    }

    private static List<e> a(List<String> list) {
        Throwable e2;
        String str;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            try {
                Class<?> cls = Class.forName(str2);
                if (!e.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", str2, "com.google.firebase.components.ComponentRegistrar"));
                } else {
                    arrayList.add((e) cls.newInstance());
                }
            } catch (ClassNotFoundException e3) {
                e2 = e3;
                str = String.format("Class %s is not an found.", str2);
                Log.w("ComponentDiscovery", str, e2);
            } catch (IllegalAccessException e4) {
                e2 = e4;
                str = String.format("Could not instantiate %s.", str2);
                Log.w("ComponentDiscovery", str, e2);
            } catch (InstantiationException e5) {
                e2 = e5;
                str = String.format("Could not instantiate %s.", str2);
                Log.w("ComponentDiscovery", str, e2);
            }
        }
        return arrayList;
    }

    public final List<e> a() {
        return a(this.f6581b.a(this.a));
    }
}
