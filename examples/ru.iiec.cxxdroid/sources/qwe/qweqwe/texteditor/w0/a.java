package qwe.qweqwe.texteditor.w0;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;

public class a {

    /* access modifiers changed from: package-private */
    /* renamed from: qwe.qweqwe.texteditor.w0.a$a  reason: collision with other inner class name */
    public class View$OnClickListenerC0154a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f9787b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0 f9788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f9789d;

        View$OnClickListenerC0154a(d dVar, e0 e0Var, String str) {
            this.f9787b = dVar;
            this.f9788c = e0Var;
            this.f9789d = str;
        }

        public void onClick(View view) {
            try {
                this.f9787b.dismiss();
                a.a(this.f9788c, this.f9789d);
                com.getdirectory.a.a(this.f9788c, new File(this.f9789d).getParent());
                qwe.qweqwe.texteditor.x0.a.a(this.f9789d, this.f9788c);
            } catch (Exception unused) {
            }
        }
    }

    private static final String a(int i2) {
        return "recent_opened_file_for_" + i2 + "_pref_key";
    }

    public static ArrayList<File> a(e0 e0Var) {
        ArrayList<File> arrayList = new ArrayList<>();
        SharedPreferences preferences = e0Var.getPreferences(0);
        int i2 = preferences.getInt("recent_opened_file_last_num_pref_key", 0);
        for (int i3 = 0; i3 < 8; i3++) {
            String string = preferences.getString(a(i2), null);
            if (string != null) {
                File file = new File(string);
                if (file.exists()) {
                    arrayList.add(file);
                }
            }
            i2--;
            if (i2 < 0) {
                i2 = 7;
            }
        }
        return arrayList;
    }

    public static void a(e0 e0Var, String str) {
        if (str != null) {
            int i2 = 0;
            SharedPreferences preferences = e0Var.getPreferences(0);
            SharedPreferences.Editor edit = preferences.edit();
            if (a(e0Var).contains(new File(str))) {
                for (int i3 = 0; i3 < 8; i3++) {
                    if (str.equals(preferences.getString(a(i3), null))) {
                        edit.putString(a(i3), null);
                    }
                }
            }
            int i4 = preferences.getInt("recent_opened_file_last_num_pref_key", 0);
            if (preferences.getString(a(i4), null) != null) {
                int i5 = i4 + 1;
                if (i5 < 8) {
                    i2 = i5;
                }
            } else {
                i2 = i4;
            }
            edit.putString(a(i2), str);
            edit.putInt("recent_opened_file_last_num_pref_key", i2);
            edit.commit();
        }
    }

    public static void b(e0 e0Var) {
        ArrayList<File> a = a(e0Var);
        if (a.isEmpty()) {
            Toast.makeText(e0Var, e0Var.getString(q0.no_recentfiles_found), 0).show();
            return;
        }
        LayoutInflater layoutInflater = e0Var.getLayoutInflater();
        View inflate = layoutInflater.inflate(o0.dialog_recent_files, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(n0.linear_layout);
        d.a aVar = new d.a(e0Var);
        aVar.b(inflate);
        aVar.a(true);
        aVar.b(e0Var.getString(q0.recent_files_dialog_title));
        d a2 = aVar.a();
        a2.show();
        Iterator<File> it = a.iterator();
        while (it.hasNext()) {
            File next = it.next();
            String name = next.getName();
            String absolutePath = next.getAbsolutePath();
            View inflate2 = layoutInflater.inflate(o0.dialog_recent_files_element, (ViewGroup) null);
            ((TextView) inflate2.findViewById(n0.file_name)).setText(name);
            ((TextView) inflate2.findViewById(n0.file_path)).setText(absolutePath);
            inflate2.setOnClickListener(new View$OnClickListenerC0154a(a2, e0Var, absolutePath));
            linearLayout.addView(inflate2);
        }
    }
}
