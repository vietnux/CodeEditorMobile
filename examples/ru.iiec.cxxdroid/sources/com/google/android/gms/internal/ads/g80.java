package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@k2
public final class g80 {
    private final Collection<a80<?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Collection<a80<String>> f4409b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<a80<String>> f4410c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (a80<String> a80 : this.f4409b) {
            String str = (String) a50.g().a(a80);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void a(SharedPreferences.Editor editor, int i2, JSONObject jSONObject) {
        for (a80<?> a80 : this.a) {
            if (a80.b() == 1) {
                a80.a(editor, a80.a(jSONObject));
            }
        }
    }

    public final void a(a80 a80) {
        this.a.add(a80);
    }

    public final List<String> b() {
        List<String> a2 = a();
        for (a80<String> a80 : this.f4410c) {
            String str = (String) a50.g().a(a80);
            if (str != null) {
                a2.add(str);
            }
        }
        return a2;
    }

    public final void b(a80<String> a80) {
        this.f4409b.add(a80);
    }

    public final void c(a80<String> a80) {
        this.f4410c.add(a80);
    }
}
