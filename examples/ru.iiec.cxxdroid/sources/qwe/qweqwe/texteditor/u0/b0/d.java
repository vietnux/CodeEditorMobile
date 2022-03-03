package qwe.qweqwe.texteditor.u0.b0;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.u0.x;

public class d {
    public String a = "default";

    /* renamed from: b  reason: collision with root package name */
    public String f9723b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f9724c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f9725d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f9726e = null;

    /* renamed from: f  reason: collision with root package name */
    public String f9727f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9728g = false;

    private d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.a = a(jSONObject, "key", this.a);
        this.f9723b = a(jSONObject, "title", this.f9723b);
        this.f9724c = a(jSONObject, "message", this.f9724c);
        this.f9725d = a(jSONObject, "img_url", this.f9725d);
        this.f9726e = a(jSONObject, "action_text", this.f9726e);
        this.f9727f = a(jSONObject, "action_url", this.f9727f);
        this.f9728g = a(jSONObject, "sticky", this.f9728g);
    }

    private String a(JSONObject jSONObject, String str, String str2) {
        return jSONObject.has(str) ? jSONObject.getString(str) : str2;
    }

    public static d a(String str) {
        try {
            return new d(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(JSONObject jSONObject, String str, boolean z) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getBoolean(str);
            }
        } catch (Exception unused) {
        }
        return z;
    }

    public void a(Context context) {
        x.a(context, "promo_pref_key_prefix_" + this.a, true);
    }

    public boolean b(Context context) {
        return x.a(context, "promo_pref_key_prefix_" + this.a);
    }
}
