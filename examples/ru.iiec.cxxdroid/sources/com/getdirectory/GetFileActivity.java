package com.getdirectory;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.d;
import androidx.appcompat.app.e;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import com.getdirectory.a;
import java.io.File;

public class GetFileActivity extends e {
    public String q;
    private Toolbar r;
    private n s = null;
    private y t = null;
    private a u;

    class a implements a.e {
        a() {
        }

        @Override // com.getdirectory.a.e
        public void a(String str) {
            Toolbar toolbar = GetFileActivity.this.r;
            if (str == null) {
                str = "Directory";
            }
            toolbar.setTitle(str);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f3053b;

        b(EditText editText) {
            this.f3053b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            try {
                File file = new File(GetFileActivity.this.u.a0, this.f3053b.getText().toString());
                file.mkdirs();
                GetFileActivity.this.u.a(file, file.getName());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f3055b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ File f3056c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GetFileActivity f3057d;

        class a implements DialogInterface.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f3059b;

            a(String str) {
                this.f3059b = str;
            }

            public void onClick(DialogInterface dialogInterface, int i2) {
                c cVar = c.this;
                GetFileActivity.this.a((GetFileActivity) cVar.f3056c, (File) this.f3059b);
            }
        }

        c(EditText editText, File file, GetFileActivity getFileActivity) {
            this.f3055b = editText;
            this.f3056c = file;
            this.f3057d = getFileActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            File[] listFiles;
            String obj = this.f3055b.getText().toString();
            for (File file : this.f3056c.listFiles()) {
                if (file.getName().toString().equals(obj)) {
                    d.a aVar = new d.a(this.f3057d);
                    aVar.b(this.f3057d.getString(f.dialog_title));
                    aVar.a(this.f3057d.getString(f.already_have_this_file));
                    aVar.c(this.f3057d.getString(f.override), new a(obj));
                    aVar.c();
                    return;
                }
            }
            GetFileActivity.this.a((GetFileActivity) this.f3056c, (File) obj);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(File file, String str) {
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("get_file_last_save_file_dir_pref", file.getAbsolutePath());
        edit.commit();
        Intent intent = new Intent();
        intent.putExtra("extra_file_dir", file.toString());
        intent.putExtra("extra_file_name", str);
        intent.putExtra("extra_text_to_save", getIntent().getExtras().getString("extra_text_to_save"));
        setResult(-1, intent);
        finish();
    }

    private void s() {
        if (this.u.a0 != null) {
            d.a aVar = new d.a(this);
            View inflate = getLayoutInflater().inflate(d.dialog_enter_folder_name, (ViewGroup) null);
            aVar.b(f.action_new_folder);
            aVar.b(inflate);
            aVar.a(true);
            aVar.b(f.create, new b((EditText) inflate.findViewById(c.enter_name_dialog_name_edt)));
            aVar.c();
        }
    }

    private void t() {
        File file = this.u.a0;
        if (file != null) {
            if ("mode_pick_directory".equals(this.q)) {
                Intent intent = getIntent();
                String file2 = file.toString();
                SharedPreferences.Editor edit = getPreferences(0).edit();
                edit.putString("get_file_last_save_file_dir_pref", file2);
                edit.commit();
                intent.putExtra("extra_file_dir", file2);
                setResult(-1, intent);
                finish();
                return;
            }
            View inflate = getLayoutInflater().inflate(d.dialog_enter_save_file_name, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(c.enter_name_dialog_name_edt);
            editText.setText(getIntent().getExtras().getString("extra_default_file_name", editText.getText().toString()));
            d.a aVar = new d.a(this);
            aVar.b(f.enter_name_dialog_title);
            aVar.b(inflate);
            aVar.a(true);
            aVar.c(getString(f.enter_name_dialog_positive_button), new c(editText, file, this));
            aVar.a().show();
        }
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (this.u.v0()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.e, androidx.core.app.f
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(d.activity_main_get_file);
        this.q = getIntent().getExtras().getString("mode");
        this.r = (Toolbar) findViewById(c.tool__bar);
        this.r.setTitle("Directory");
        a(this.r);
        p().d(true);
        this.s = k();
        this.t = this.s.b();
        this.u = new a();
        this.u.a(new a());
        y yVar = this.t;
        int i2 = c.fragment_container;
        a aVar = this.u;
        yVar.a(i2, aVar, "" + this.u.toString());
        this.t.a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(e.main_get_file, menu);
        try {
            if (this.q != null) {
                if (this.q.equals("mode_save_file")) {
                    return true;
                }
                if (this.q.equals("mode_pick_directory")) {
                    return true;
                }
            }
            menu.findItem(c.action_select_folder).setVisible(false);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, androidx.appcompat.app.e
    public void onDestroy() {
        this.u.w0();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == c.action_select_folder) {
            t();
            return true;
        } else if (itemId == c.action_new_folder) {
            s();
            return true;
        } else {
            if (itemId == 16908332 && this.u.v0()) {
                super.onBackPressed();
            }
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
