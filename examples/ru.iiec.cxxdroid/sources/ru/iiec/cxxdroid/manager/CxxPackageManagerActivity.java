package ru.iiec.cxxdroid.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import qwe.qweqwe.texteditor.u0.x;
import ru.iiec.cxxdroid.C0162R;
import ru.iiec.cxxdroid.CxxActivity;
import ru.iiec.cxxdroid.v;
import ru.iiec.cxxdroid.w;

public class CxxPackageManagerActivity extends e {

    /* access modifiers changed from: package-private */
    public class a extends ArrayAdapter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f9974b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9975c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, int i2, List list, List list2, boolean z) {
            super(context, i2, list);
            this.f9974b = list2;
            this.f9975c = z;
        }

        public /* synthetic */ void a(f fVar, View view) {
            CxxPackageManagerActivity.this.b((CxxPackageManagerActivity) fVar);
        }

        public /* synthetic */ void a(f fVar, List list, View view) {
            CxxPackageManagerActivity.this.a((CxxPackageManagerActivity) fVar, (f) list);
        }

        public /* synthetic */ void b(f fVar, View view) {
            try {
                CxxPackageManagerActivity cxxPackageManagerActivity = CxxPackageManagerActivity.this;
                Intent intent = new Intent();
                cxxPackageManagerActivity.setResult(-1, intent.putExtra("show_get_premium_dialog_on_result", "from_mngr_" + fVar.f9998k));
                CxxPackageManagerActivity.this.finish();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public /* synthetic */ void b(f fVar, List list, View view) {
            CxxPackageManagerActivity.this.b((CxxPackageManagerActivity) fVar, (f) list);
        }

        public /* synthetic */ void c(f fVar, View view) {
            try {
                CxxPackageManagerActivity cxxPackageManagerActivity = CxxPackageManagerActivity.this;
                Intent intent = new Intent();
                cxxPackageManagerActivity.setResult(-1, intent.putExtra("show_get_premium_dialog_on_result", "from_mngr_" + fVar.f9998k));
                CxxPackageManagerActivity.this.finish();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            f fVar = (f) this.f9974b.get(i2);
            if (view == null) {
                view = CxxPackageManagerActivity.this.getLayoutInflater().inflate(C0162R.layout.package_item, (ViewGroup) null);
            }
            ((TextView) view.findViewById(C0162R.id.name)).setText(fVar.f9990c);
            ((TextView) view.findViewById(C0162R.id.description)).setText(fVar.f9989b);
            ((TextView) view.findViewById(C0162R.id.version)).setText(CxxPackageManagerActivity.this.getString(C0162R.string.version_mask, new Object[]{fVar.f9993f}));
            ((TextView) view.findViewById(C0162R.id.size)).setText(CxxPackageManagerActivity.this.getString(C0162R.string.size_mask_mb, new Object[]{Double.valueOf((((double) fVar.f9992e) / 1024.0d) / 1024.0d)}));
            ((TextView) view.findViewById(C0162R.id.pkg_size)).setText(CxxPackageManagerActivity.this.getString(C0162R.string.pkg_size_mask_mb, new Object[]{Double.valueOf((((double) fVar.o) / 1024.0d) / 1024.0d)}));
            Button button = (Button) view.findViewById(C0162R.id.install);
            Button button2 = (Button) view.findViewById(C0162R.id.uninstall);
            Button button3 = (Button) view.findViewById(C0162R.id.update);
            boolean a = CxxPackageManagerActivity.a((Context) CxxPackageManagerActivity.this, fVar);
            boolean a2 = a ? CxxPackageManagerActivity.this.a((CxxPackageManagerActivity) fVar) : false;
            int i3 = 8;
            button.setVisibility(a ? 8 : 0);
            button2.setVisibility(a ? 0 : 8);
            if (a2) {
                i3 = 0;
            }
            button3.setVisibility(i3);
            button2.setOnClickListener(new d(this, fVar));
            if (this.f9975c || (!"sfml".equals(fVar.f9998k) && !"allegro".equals(fVar.f9998k))) {
                button.setText(C0162R.string.install);
                button3.setText(C0162R.string.update);
                button.setOnClickListener(new c(this, fVar, this.f9974b));
                button3.setOnClickListener(new a(this, fVar, this.f9974b));
            } else {
                button.setText("🔒 Premium only");
                button.setOnClickListener(new b(this, fVar));
                button3.setText("🔒 Premium only");
                button3.setOnClickListener(new e(this, fVar));
            }
            return view;
        }
    }

    public static ArrayList<f> a(Context context) {
        ArrayList<f> arrayList = new ArrayList<>();
        for (f fVar : f.c(context)) {
            if (a(context, fVar)) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static LinkedList<f> a(LinkedList<f> linkedList, f fVar, List<f> list) {
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        for (String str : fVar.f9994g) {
            for (f fVar2 : list) {
                if (str.equals(fVar2.f9998k)) {
                    a(linkedList, fVar2, list);
                }
            }
        }
        linkedList.add(fVar);
        return linkedList;
    }

    private void a(String str) {
        try {
            a(f.a(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
            Toast.makeText(this, getString(C0162R.string.loading_index_error), 0).show();
            finish();
        }
    }

    private void a(List<f> list) {
        ((ListView) findViewById(C0162R.id.list)).setAdapter((ListAdapter) new a(this, C0162R.layout.package_item, list, list, s()));
        u();
    }

    public static void a(CxxActivity cxxActivity) {
        Intent intent = new Intent(cxxActivity, CxxPackageManagerActivity.class);
        intent.putExtra("is_premium", cxxActivity.D());
        cxxActivity.startActivityForResult(intent, 1724);
    }

    public static void a(CxxActivity cxxActivity, ArrayList<String> arrayList) {
        Intent intent = new Intent(cxxActivity, CxxPackageManagerActivity.class);
        intent.putExtra("is_premium", cxxActivity.D());
        intent.putExtra("extra_need_libraries", arrayList);
        cxxActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(f fVar, List<f> list) {
        LinkedList<f> a2 = a((LinkedList<f>) null, fVar, list);
        HashSet hashSet = new HashSet();
        Iterator<f> it = a2.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!hashSet.add(next) || !a(next)) {
                it.remove();
            }
        }
        w.a(this, a2);
    }

    public static boolean a(Context context, f fVar) {
        return fVar.b(context).exists();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean a(f fVar) {
        return !fVar.f9993f.equals(x.a(fVar.b(this).getAbsolutePath()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(f fVar) {
        w.b(this, fVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(f fVar, List<f> list) {
        LinkedList<f> a2 = a((LinkedList<f>) null, fVar, list);
        HashSet hashSet = new HashSet();
        Iterator<f> it = a2.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!hashSet.add(next) || !a(next)) {
                it.remove();
            }
        }
        w.b(this, a2);
    }

    private void u() {
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("extra_need_libraries");
                getIntent().removeExtra("extra_need_libraries");
                if (stringArrayList != null) {
                    List<f> c2 = f.c(this);
                    LinkedList linkedList = new LinkedList();
                    for (f fVar : f.c(this)) {
                        if (stringArrayList.contains(fVar.f9998k)) {
                            linkedList.addAll(a((LinkedList<f>) null, fVar, c2));
                        }
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        f fVar2 = (f) it.next();
                        if (!hashSet.add(fVar2) || !a(fVar2)) {
                            it.remove();
                        }
                    }
                    w.a(this, (LinkedList<f>) linkedList);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.f10008b = null;
        setContentView(C0162R.layout.activity_cxx_package_manager);
        a((Toolbar) findViewById(C0162R.id.toolbar));
        p().d(true);
        try {
            InputStream open = getAssets().open("packages_arm64.idx");
            String b2 = k.a.a.a.e.b(open);
            x.b(this, "cxx_index_cache_key", b2);
            open.close();
            findViewById(C0162R.id.list).setVisibility(0);
            findViewById(C0162R.id.pb).setVisibility(8);
            a(b2);
        } catch (Exception e2) {
            Toast.makeText(this, getString(C0162R.string.loading_index_error), 0).show();
            finish();
            e2.printStackTrace();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public boolean s() {
        try {
            return getIntent().getExtras().getBoolean("is_premium");
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public void t() {
        a(x.b(this, "cxx_index_cache_key"));
    }
}
