package d.c;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.getdirectory.GetFileActivity;
import d.b;
import java.util.ArrayList;
import org.json.JSONObject;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.samples.SamplesActivity;
import qwe.qweqwe.texteditor.v0.a;

public class f extends d {

    /* renamed from: i  reason: collision with root package name */
    static AlertDialog f6959i;
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public String f6960b;

    /* renamed from: c  reason: collision with root package name */
    public String f6961c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6962d;

    /* renamed from: e  reason: collision with root package name */
    public String f6963e;

    /* renamed from: f  reason: collision with root package name */
    public String f6964f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f6965g;

    /* renamed from: h  reason: collision with root package name */
    public String f6966h;

    f(JSONObject jSONObject) {
        this.f6966h = jSONObject.toString();
        this.a = jSONObject.getString("name");
        this.f6961c = jSONObject.getString("description");
        this.f6962d = jSONObject.getBoolean("is_archive");
        this.f6963e = jSONObject.getString("src_url");
        this.f6964f = jSONObject.optString("src", null);
        this.f6960b = jSONObject.getString("mainfile");
        b.a(jSONObject, "pic_urls");
        this.f6965g = b.a(jSONObject, "requirements");
    }

    public static f a(String str) {
        return new f(new JSONObject(str));
    }

    private void a(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra("sample_json_key", this.f6966h);
        intent.putExtra("sample_go_action_type", 1);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void a(Activity activity, int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            try {
                if (f6959i != null) {
                    f6959i.dismiss();
                    f6959i = null;
                }
                a(activity, intent.getStringExtra("extra_file_dir"), a(intent.getStringExtra("sample_json_key")));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(Activity activity, f fVar) {
        a(activity, a.b((Context) activity), fVar);
    }

    static /* synthetic */ void a(Activity activity, f fVar, View view) {
        Intent intent = new Intent(activity, GetFileActivity.class);
        intent.putExtra("mode", "mode_pick_directory");
        intent.putExtra("sample_json_key", fVar.f6966h);
        intent.putExtra("sample_go_action_type", 0);
        activity.startActivityForResult(intent, 1001);
    }

    private static void a(Activity activity, String str, f fVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = activity.getLayoutInflater().inflate(fVar.f6964f == null ? o0.show_download_dialog : o0.show_extract_dialog, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(n0.edit_text);
        editText.setText(str);
        editText.setOnClickListener(new b(activity, fVar));
        builder.setView(inflate);
        builder.setPositiveButton(fVar.f6964f == null ? q0.download_sample : q0.extract_sample, new a(fVar, str, activity));
        f6959i = builder.show();
    }

    static /* synthetic */ void a(f fVar, String str, Activity activity, DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent();
        intent.putExtra("sample_json_key", fVar.f6966h);
        intent.putExtra("sample_go_action_type", 0);
        intent.putExtra("sample_download_path", str);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public void a(SamplesActivity samplesActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(samplesActivity);
        builder.setTitle(this.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(samplesActivity.getString(this.f6964f == null ? q0.download_sample : q0.extract_sample));
        if (!this.f6962d) {
            arrayList.add(samplesActivity.getString(q0.open_sample));
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            charSequenceArr[i2] = (CharSequence) arrayList.get(i2);
        }
        builder.setItems(charSequenceArr, new c(this, samplesActivity));
        builder.show();
    }

    public /* synthetic */ void a(SamplesActivity samplesActivity, DialogInterface dialogInterface, int i2) {
        if (i2 == 0) {
            samplesActivity.c(this);
        } else if (i2 == 1) {
            a((Activity) samplesActivity);
        }
    }
}
