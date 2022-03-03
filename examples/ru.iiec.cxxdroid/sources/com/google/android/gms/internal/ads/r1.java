package com.google.android.gms.internal.ads;

import c.e.g;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@k2
public final class r1 implements f1<t90> {
    private final boolean a;

    public r1(boolean z) {
        this.a = z;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.da0' to match base method */
    @Override // com.google.android.gms.internal.ads.f1
    public final /* synthetic */ t90 a(w0 w0Var, JSONObject jSONObject) {
        g gVar = new g();
        g gVar2 = new g();
        ld<k90> a2 = w0Var.a(jSONObject);
        ld<lg> a3 = w0Var.a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                gVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                gVar.put(jSONObject2.getString("name"), w0Var.a(jSONObject2, "image_value", this.a));
            } else {
                String valueOf = String.valueOf(string);
                qc.d(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        lg b2 = w0.b(a3);
        String string2 = jSONObject.getString("custom_template_id");
        g gVar3 = new g();
        for (int i3 = 0; i3 < gVar.size(); i3++) {
            gVar3.put(gVar.b(i3), ((Future) gVar.d(i3)).get());
        }
        return new t90(string2, gVar3, gVar2, (k90) a2.get(), b2 != null ? b2.s0() : null, b2 != null ? b2.getView() : null);
    }
}
