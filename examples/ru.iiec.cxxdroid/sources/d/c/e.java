package d.c;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends d {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public String f6956b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6957c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<f> f6958d = new ArrayList<>();

    public e(JSONObject jSONObject) {
        jSONObject.toString();
        this.a = jSONObject.getString("name");
        this.f6956b = jSONObject.getString("description");
        JSONArray jSONArray = jSONObject.getJSONArray("examples");
        boolean z = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f6958d.add(new f(jSONArray.getJSONObject(i2)));
        }
        this.f6957c = jSONObject.has("premium") ? jSONObject.getBoolean("premium") : z;
    }
}
