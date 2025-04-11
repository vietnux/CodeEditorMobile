package com.getdirectory;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.l0;
import androidx.fragment.app.Fragment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class a extends Fragment {
    private static String j0 = "";
    private View Z;
    public File a0;
    private ListView b0;
    private h c0;
    private TextView d0;
    private e e0;
    private ArrayList<i> f0 = new ArrayList<>();
    private ArrayList<g> g0 = new ArrayList<>();
    private long h0;
    private String i0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.getdirectory.a$a  reason: collision with other inner class name */
    public class View$OnTouchListenerC0071a implements View.OnTouchListener {
        View$OnTouchListenerC0071a(a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                try {
                    if (i2 < a.this.f0.size()) {
                        i iVar = (i) a.this.f0.get(i2);
                        a.this.a(iVar.f3074e, iVar.f3071b);
                    }
                } catch (Exception unused) {
                    a.this.b("Error accessing file");
                }
            }
        }
    }

    class c implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.getdirectory.a$c$a  reason: collision with other inner class name */
        class C0072a implements l0.d {
            final /* synthetic */ File a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f3062b;

            /* renamed from: com.getdirectory.a$c$a$a  reason: collision with other inner class name */
            class DialogInterface$OnClickListenerC0073a implements DialogInterface.OnClickListener {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ EditText f3064b;

                DialogInterface$OnClickListenerC0073a(EditText editText) {
                    this.f3064b = editText;
                }

                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (!C0072a.this.a.getName().equals(this.f3064b.getText().toString())) {
                        if (!new File(C0072a.this.a.getParentFile(), this.f3064b.getText().toString()).exists()) {
                            File file = C0072a.this.a;
                            if (file.renameTo(new File(file.getParentFile(), this.f3064b.getText().toString()))) {
                                ((i) a.this.f0.get(C0072a.this.f3062b)).f3074e = new File(C0072a.this.a.getParentFile(), this.f3064b.getText().toString());
                                String obj = this.f3064b.getText().toString();
                                ((i) a.this.f0.get(C0072a.this.f3062b)).f3071b = obj;
                                if (!((i) a.this.f0.get(C0072a.this.f3062b)).f3074e.isDirectory()) {
                                    int lastIndexOf = obj.lastIndexOf(46);
                                    ((i) a.this.f0.get(C0072a.this.f3062b)).f3073d = lastIndexOf > 0 ? obj.substring(lastIndexOf + 1) : "";
                                }
                                a.this.c0.notifyDataSetChanged();
                                return;
                            }
                        }
                        a.this.b("Failed to rename file");
                    }
                }
            }

            /* renamed from: com.getdirectory.a$c$a$b */
            class b implements DialogInterface.OnClickListener {
                b() {
                }

                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (!(C0072a.this.a.isDirectory() ? a.c(C0072a.this.a) : C0072a.this.a.delete())) {
                        a.this.b("Failed to delete file");
                        return;
                    }
                    a.this.f0.remove(C0072a.this.f3062b);
                    a.this.c0.notifyDataSetChanged();
                }
            }

            C0072a(File file, int i2) {
                this.a = file;
                this.f3062b = i2;
            }

            @Override // androidx.appcompat.widget.l0.d
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == c.action_rename) {
                    View inflate = a.this.v().inflate(d.dialog_enter_save_file_name, (ViewGroup) null);
                    EditText editText = (EditText) inflate.findViewById(c.enter_name_dialog_name_edt);
                    editText.setText(this.a.getName());
                    d.a aVar = new d.a(a.this.f());
                    aVar.b(f.action_rename);
                    aVar.b(inflate);
                    aVar.c("OK", new DialogInterface$OnClickListenerC0073a(editText));
                    aVar.c();
                    return true;
                } else if (menuItem.getItemId() != c.action_delete) {
                    return false;
                } else {
                    d.a aVar2 = new d.a(a.this.f());
                    aVar2.b(f.get_file_confirm_delete);
                    aVar2.a(f.get_file_confirm_delete_desc);
                    aVar2.b(f.get_file_confirm, new b());
                    aVar2.a(f.get_file_cancel, (DialogInterface.OnClickListener) null);
                    aVar2.c();
                    return true;
                }
            }
        }

        c() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            a aVar = a.this;
            if (aVar.a0 != null && i2 >= 0) {
                try {
                    if (i2 < aVar.f0.size()) {
                        File file = ((i) a.this.f0.get(i2)).f3074e;
                        l0 l0Var = new l0(a.this.f(), view.findViewById(c.doc_title), 3);
                        l0Var.a(e.context_get_file);
                        l0Var.a(new C0072a(file, i2));
                        l0Var.b();
                        return true;
                    }
                } catch (Exception unused) {
                    a.this.b("Error accessing file");
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Comparator<File> {
        d(a aVar) {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.isDirectory() != file2.isDirectory() ? file.isDirectory() ? -1 : 1 : file.getName().compareToIgnoreCase(file2.getName());
        }
    }

    public interface e {
        void a(String str);
    }

    /* access modifiers changed from: private */
    public static class f extends File {
        public f(String str, String str2) {
            super(str, str2);
        }

        public String getAbsolutePath() {
            return getPath();
        }

        public boolean isDirectory() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public class g {
        int a;

        /* renamed from: b  reason: collision with root package name */
        int f3067b;

        /* renamed from: c  reason: collision with root package name */
        File f3068c;

        /* renamed from: d  reason: collision with root package name */
        String f3069d;

        private g(a aVar) {
        }

        /* synthetic */ g(a aVar, View$OnTouchListenerC0071a aVar2) {
            this(aVar);
        }
    }

    /* access modifiers changed from: private */
    public class h extends BaseAdapter {
        public h(Context context) {
        }

        public int getCount() {
            return a.this.f0.size();
        }

        public Object getItem(int i2) {
            return a.this.f0.get(i2);
        }

        public long getItemId(int i2) {
            return 0;
        }

        public int getItemViewType(int i2) {
            return ((i) a.this.f0.get(i2)).f3072c.length() > 0 ? 0 : 1;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = a.this.v().inflate(d.document_list_element, (ViewGroup) null);
            }
            i iVar = (i) a.this.f0.get(i2);
            ((TextView) view.findViewById(c.doc_title)).setText(iVar.f3071b);
            ((TextView) view.findViewById(c.doc_desc)).setText(iVar.f3072c);
            if (iVar.a != 0) {
                ((ImageView) view.findViewById(c.doc_icon)).setVisibility(0);
                ((ImageView) view.findViewById(c.doc_icon)).setImageResource(iVar.a);
                ((TextView) view.findViewById(c.doc_type)).setVisibility(8);
            } else {
                ((ImageView) view.findViewById(c.doc_icon)).setVisibility(4);
                ((TextView) view.findViewById(c.doc_type)).setVisibility(0);
                ((TextView) view.findViewById(c.doc_type)).setText(iVar.f3073d.toUpperCase().substring(0, Math.min(iVar.f3073d.length(), 4)));
            }
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }
    }

    /* access modifiers changed from: private */
    public class i {
        int a;

        /* renamed from: b  reason: collision with root package name */
        String f3071b;

        /* renamed from: c  reason: collision with root package name */
        String f3072c;

        /* renamed from: d  reason: collision with root package name */
        String f3073d;

        /* renamed from: e  reason: collision with root package name */
        File f3074e;

        private i(a aVar) {
            this.f3072c = "";
            this.f3073d = "";
        }

        /* synthetic */ i(a aVar, View$OnTouchListenerC0071a aVar2) {
            this(aVar);
        }
    }

    public a() {
        new HashMap();
        this.h0 = 10485760;
        new String[]{".pdf", ".doc", ".docx", ".DOC", ".DOCX"};
        this.i0 = null;
    }

    public static String a(long j2) {
        if (j2 < 1024) {
            return String.format("%d B", Long.valueOf(j2));
        } else if (j2 < 1048576) {
            return String.format("%.1f KB", Float.valueOf(((float) j2) / 1024.0f));
        } else {
            int i2 = (j2 > 1073741824 ? 1 : (j2 == 1073741824 ? 0 : -1));
            Object[] objArr = new Object[1];
            float f2 = (((float) j2) / 1024.0f) / 1024.0f;
            if (i2 < 0) {
                objArr[0] = Float.valueOf(f2);
                return String.format("%.1f MB", objArr);
            }
            objArr[0] = Float.valueOf(f2 / 1024.0f);
            return String.format("%.1f GB", objArr);
        }
    }

    public static boolean a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putString("get_file_last_open_file_dir_pref", str).commit();
    }

    private static String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null && Build.VERSION.SDK_INT >= 19) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            int length = externalFilesDirs.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file = externalFilesDirs[i2];
                if (file != null) {
                    externalFilesDir = file;
                    break;
                }
                i2++;
            }
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String c(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("get_file_last_open_file_dir_pref", "");
    }

    private String c(String str) {
        try {
            StatFs statFs = new StatFs(str);
            long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            long availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            if (blockCount == 0) {
                return "";
            }
            return "Free " + a(availableBlocks) + " of " + a(blockCount);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void c(View view) {
        if (Build.VERSION.SDK_INT >= 21 && view != null) {
            if (view instanceof ListView) {
                Drawable selector = ((ListView) view).getSelector();
                if (selector != null) {
                    selector.setState(StateSet.NOTHING);
                    return;
                }
                return;
            }
            Drawable background = view.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean c(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            z &= file2.isDirectory() ? c(file2) : file2.delete();
        }
        return z & file.delete();
    }

    private void d(String str) {
        e eVar = this.e0;
        if (eVar != null) {
            eVar.a(str);
        }
    }

    private void x0() {
        this.a0 = null;
        this.f0.clear();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        i iVar = new i(this, null);
        if (Build.VERSION.SDK_INT < 9 || Environment.isExternalStorageRemovable()) {
            iVar.f3071b = "SD card";
        } else {
            iVar.f3071b = "Internal storage";
        }
        iVar.a = (Build.VERSION.SDK_INT < 9 || Environment.isExternalStorageRemovable()) ? b.ic_external_storage : b.ic_storage;
        iVar.f3072c = c(absolutePath);
        iVar.f3074e = Environment.getExternalStorageDirectory();
        this.f0.add(iVar);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            String str = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if ((readLine.contains("/mnt") || readLine.contains("/storage") || readLine.contains("/sdcard")) && !readLine.contains("asec") && !readLine.contains("tmpfs") && !readLine.contains("none")) {
                    if (!readLine.contains("pstore")) {
                        String[] split = readLine.split(" ");
                        if (!hashMap.containsKey(split[0])) {
                            hashMap.put(split[0], new ArrayList());
                        }
                        ((ArrayList) hashMap.get(split[0])).add(split[1]);
                        if (split[1].equals(absolutePath)) {
                            str = split[0];
                        }
                        arrayList.add(split[1]);
                    }
                }
            }
            bufferedReader.close();
            if (str != null) {
                arrayList.removeAll((Collection) hashMap.get(str));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    try {
                        i iVar2 = new i(this, null);
                        if (str2.toLowerCase().contains("sd")) {
                            iVar.f3071b = "SD card";
                        } else {
                            iVar.f3071b = "ExternalStorage";
                        }
                        iVar2.a = b.ic_external_storage;
                        iVar2.f3072c = c(str2);
                        iVar2.f3074e = new File(str2);
                        this.f0.add(iVar2);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (new File("/").canRead()) {
            i iVar3 = new i(this, null);
            iVar3.f3071b = "/";
            iVar3.f3072c = "System root";
            iVar3.a = b.ic_directory;
            iVar3.f3074e = new File("/");
            this.f0.add(iVar3);
        }
        try {
            i iVar4 = new i(this, null);
            iVar4.f3071b = "Home (app private)";
            iVar4.f3072c = "Terminal home directory, removed on uninstall";
            iVar4.a = b.ic_directory;
            iVar4.f3074e = f().getDir("HOME", 0);
            this.f0.add(iVar4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            SharedPreferences preferences = f().getPreferences(0);
            this.i0 = f().getIntent().getExtras().getString("mode");
            String c2 = this.i0.equals("mode_open_file") ? c(f()) : null;
            if (this.i0.equals("mode_save_file")) {
                c2 = preferences.getString("get_file_last_save_file_dir_pref", "");
            }
            if (this.i0.equals("mode_pick_directory")) {
                c2 = preferences.getString("get_file_last_save_file_dir_pref", "");
            }
            File file = new File(c2);
            if (file.exists()) {
                i iVar5 = new i(this, null);
                iVar5.f3071b = a(f.last_opened);
                iVar5.f3072c = c2;
                iVar5.a = b.ic_directory;
                iVar5.f3074e = file;
                this.f0.add(iVar5);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.c0.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.i0 = f().getIntent().getExtras().getString("mode");
        View view = this.Z;
        if (view == null) {
            this.Z = layoutInflater.inflate(d.document_select_layout, viewGroup, false);
            this.c0 = new h(f());
            this.d0 = (TextView) this.Z.findViewById(c.searchEmptyView);
            this.d0.setOnTouchListener(new View$OnTouchListenerC0071a(this));
            this.b0 = (ListView) this.Z.findViewById(c.listView);
            this.b0.setEmptyView(this.d0);
            this.b0.setAdapter((ListAdapter) this.c0);
            this.b0.setOnItemClickListener(new b());
            this.b0.setOnItemLongClickListener(new c());
            x0();
        } else {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.Z);
            }
        }
        return this.Z;
    }

    public void a(e eVar) {
        this.e0 = eVar;
    }

    public void a(File file, String str) {
        String str2;
        if (file == null) {
            ArrayList<g> arrayList = this.g0;
            g remove = arrayList.remove(arrayList.size() - 1);
            j0 = remove.f3069d;
            d(j0);
            File file2 = remove.f3068c;
            if (file2 != null) {
                a(file2);
            } else {
                x0();
            }
            this.b0.setSelectionFromTop(remove.a, remove.f3067b);
        } else if (file.isDirectory()) {
            g gVar = new g(this, null);
            gVar.a = this.b0.getFirstVisiblePosition();
            gVar.f3067b = this.b0.getChildAt(0).getTop();
            gVar.f3068c = this.a0;
            gVar.f3069d = j0.toString();
            d(j0);
            if (a(file)) {
                this.g0.add(gVar);
                j0 = str;
                d(j0);
                this.b0.setSelection(0);
            }
        } else {
            if (!file.canRead()) {
                str2 = "AccessError";
            } else if (this.h0 != 0 && file.length() > this.h0) {
                str2 = "FileSizeLimit";
            } else if (this.i0.equals("mode_open_file")) {
                a(f(), file.getParentFile().getAbsolutePath());
                Intent intent = new Intent();
                intent.putExtra("extra_file_dir", file.toString());
                f().setResult(-1, intent);
                f().finish();
                return;
            } else {
                return;
            }
            b(str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[SYNTHETIC, Splitter:B:38:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getdirectory.a.a(java.io.File):boolean");
    }

    public void b(String str) {
        if (f() != null) {
            d.a aVar = new d.a(f());
            aVar.b(f().getString(f.dialog_title));
            aVar.a(str);
            aVar.c("OK", null);
            aVar.c();
        }
    }

    public boolean v0() {
        if (this.g0.size() <= 0) {
            return true;
        }
        ArrayList<g> arrayList = this.g0;
        g remove = arrayList.remove(arrayList.size() - 1);
        j0 = remove.f3069d;
        d(remove.f3068c != null ? j0 : null);
        File file = remove.f3068c;
        if (file != null) {
            a(file);
        } else {
            x0();
        }
        this.b0.setSelectionFromTop(remove.a, remove.f3067b);
        return false;
    }

    public void w0() {
    }
}
