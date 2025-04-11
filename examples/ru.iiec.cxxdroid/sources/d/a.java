package d;

import android.content.Context;
import d.c.e;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    public static ArrayList<e> a(Context context, String str) {
        ArrayList<e> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONObject(b.b(context, str)).getJSONObject("data").getJSONArray("categories");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(new e(jSONArray.getJSONObject(i2)));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }
}
