package qwe.qweqwe.texteditor.y0;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k.a.a.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.v0.a;
import qwe.qweqwe.texteditor.y0.q;

public class n {
    private final File a;

    public n(Context context) {
        this.a = new File(a.h(context));
    }

    public File a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0076, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b A[ExcHandler: IOException (r7v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList<qwe.qweqwe.texteditor.y0.q.g> r7, int r8) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: qwe.qweqwe.texteditor.y0.n.a(java.util.ArrayList, int):void");
    }

    public void a(ArrayList<p> arrayList, ArrayList<Integer> arrayList2, p pVar) {
        ArrayList<q.g> arrayList3 = new ArrayList<>();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (!arrayList2.contains(Integer.valueOf(i3))) {
                p pVar2 = arrayList.get(i3);
                arrayList3.add(q.g.a(pVar2));
                if (pVar == pVar2) {
                    i2 = arrayList3.size() - 1;
                }
            }
        }
        a(arrayList3, i2);
    }

    public Pair<List<q.g>, Integer> b() {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        try {
            i0.a("RestoreManager", "readState");
            JSONObject jSONObject = new JSONObject(b.g(a()));
            JSONArray jSONArray = jSONObject.getJSONArray("tabs");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                arrayList.add(new q.g(jSONObject2.getString("title"), jSONObject2.getString("text"), jSONObject2.optString("file_path", null), jSONObject2.getInt("car_pos"), jSONObject2.getInt("scroll_pos"), jSONObject2.getBoolean("is_ever_edit"), jSONObject2.getBoolean("has_changes")));
            }
            i2 = jSONObject.getInt("current_tab");
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return new Pair<>(arrayList, Integer.valueOf(i2));
    }
}
