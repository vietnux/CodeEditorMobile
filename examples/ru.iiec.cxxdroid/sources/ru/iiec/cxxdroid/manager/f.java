package ru.iiec.cxxdroid.manager;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.u0.x;
import ru.iiec.cxxdroid.u;

public class f {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9990c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9991d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9992e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9993f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f9994g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f9995h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f9996i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9997j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9998k;

    /* renamed from: l  reason: collision with root package name */
    public final String f9999l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10000m;
    public final String n;
    public final int o;
    public final boolean p;

    public f(JSONObject jSONObject) {
        this.a = jSONObject.getInt("files");
        this.f9989b = jSONObject.getString("description");
        this.f9990c = jSONObject.getString("title");
        this.f9991d = jSONObject.optString("filename");
        jSONObject.optString("url");
        this.f9992e = jSONObject.getInt("fullsize");
        this.f9993f = jSONObject.getString("version");
        this.f9999l = jSONObject.isNull("cmake_name") ? null : jSONObject.getString("cmake_name");
        this.f10000m = jSONObject.optString("cmake_prefix");
        this.n = jSONObject.optString("cmake_findflags");
        this.p = jSONObject.optBoolean("hasgui", false);
        this.f9994g = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("deps");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f9994g.add(jSONArray.getString(i2));
        }
        this.f9995h = new ArrayList();
        JSONArray jSONArray2 = jSONObject.getJSONArray("envvars");
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            this.f9995h.add(jSONArray2.getString(i3));
        }
        this.f9996i = new ArrayList();
        JSONArray jSONArray3 = jSONObject.getJSONArray("detectors");
        for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
            this.f9996i.add(jSONArray3.getString(i4));
        }
        this.f9998k = jSONObject.getString("id");
        this.f9997j = jSONObject.getString("libs");
        this.o = jSONObject.getInt("pkgsize");
    }

    public static List<f> a(String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(new f(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }

    public static List<f> c(Context context) {
        try {
            return a(x.b(context, "cxx_index_cache_key"));
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public File a(Context context) {
        return new File(u.f(context) + "/" + this.f9998k + ".files");
    }

    public File b(Context context) {
        return new File(u.f(context) + "/" + this.f9998k + ".package");
    }
}
