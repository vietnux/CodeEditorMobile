package ru.iiec.cxxdroid;

import android.app.AlertDialog;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import k.a.a.a.e;
import qwe.qweqwe.texteditor.t0;
import qwe.qweqwe.texteditor.u0.x;
import qwe.qweqwe.texteditor.y0.p;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.manager.f;

public class w extends t0 {
    public static String a = "AlignTrailingComments: true,BreakBeforeBraces: Allman,ColumnLimit: 0,IndentWidth: 4,KeepEmptyLinesAtTheStartOfBlocks: false,ObjCSpaceAfterProperty: true,ObjCSpaceBeforeProtocolList: true,PointerBindsToType: false,SpacesBeforeTrailingComments: 1,SortIncludes: false,TabWidth: 4,UseTab: $USETAB";

    /* access modifiers changed from: package-private */
    public class a extends t0.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f10016i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f10017j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ t0.e f10018k;

        /* renamed from: ru.iiec.cxxdroid.w$a$a  reason: collision with other inner class name */
        class C0161a implements x.a {
            int a = 0;

            C0161a() {
            }

            @Override // qwe.qweqwe.texteditor.u0.x.a
            public void a(String str) {
                a aVar = a.this;
                int i2 = this.a;
                this.a = i2 + 1;
                aVar.b((a) i2, aVar.f10017j.a);
            }

            @Override // qwe.qweqwe.texteditor.u0.x.a
            public void b(String str) {
            }
        }

        a(Context context, f fVar, t0.e eVar) {
            this.f10016i = context;
            this.f10017j = fVar;
            this.f10018k = eVar;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            File file = new File(qwe.qweqwe.texteditor.v0.a.a(this.f10016i) + "/tmp_file_for_lib.tar.xz");
            b(1);
            b(this.f10016i.getString(C0162R.string.extracing_files) + ": " + this.f10017j.f9990c);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ZipInputStream zipInputStream = new ZipInputStream(this.f10016i.getAssets().open("arm64.obb"));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (nextEntry.getName().equals(this.f10017j.f9991d)) {
                        e.a(zipInputStream, fileOutputStream);
                        break;
                    }
                } else {
                    break;
                }
            }
            fileOutputStream.close();
            zipInputStream.close();
            Context context = this.f10016i;
            x.a(context, qwe.qweqwe.texteditor.v0.a.d(this.f10016i) + " tar -xvf '" + file.getAbsolutePath() + "'", new File(u.f(context)), new C0161a());
            file.delete();
            return null;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            this.f10018k.a(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends t0.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CxxPackageManagerActivity f10020i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f10021j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ t0.e f10022k;

        b(CxxPackageManagerActivity cxxPackageManagerActivity, f fVar, t0.e eVar) {
            this.f10020i = cxxPackageManagerActivity;
            this.f10021j = fVar;
            this.f10022k = eVar;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            b(this.f10020i.getString(C0162R.string.uninstalling));
            return w.c(this.f10020i, this.f10021j);
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            this.f10022k.a(obj);
        }
    }

    class c extends t0.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ d.c.f f10023i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ CxxActivity f10024j;

        c(d.c.f fVar, CxxActivity cxxActivity) {
            this.f10023i = fVar;
            this.f10024j = cxxActivity;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            ArrayList arrayList = new ArrayList(this.f10023i.f6965g);
            ArrayList arrayList2 = new ArrayList();
            ArrayList<f> a = CxxPackageManagerActivity.a((Context) this.f10024j);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator<f> it2 = a.iterator();
                while (it2.hasNext()) {
                    if (str.equals(it2.next().f9998k)) {
                        arrayList2.add(str);
                    }
                }
            }
            arrayList.removeAll(arrayList2);
            return arrayList;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f10024j);
                builder.setTitle(C0162R.string.found_libraries);
                String string = this.f10024j.getString(C0162R.string.following_libraries_are_missing);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    string = string + "\n" + ((String) it.next());
                }
                builder.setMessage(string + "\n\n" + this.f10024j.getString(C0162R.string.do_you_want_install_it));
                builder.setPositiveButton(C0162R.string.install, new g(this.f10024j, arrayList));
                builder.show();
            }
        }
    }

    class d extends t0.d {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ CxxActivity f10025i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f10026j;

        d(CxxActivity cxxActivity, p pVar) {
            this.f10025i = cxxActivity;
            this.f10026j = pVar;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public Object a() {
            b(this.f10025i.getString(C0162R.string.formatting_code));
            String I0 = this.f10026j.I0();
            File file = new File(u.t(this.f10025i));
            k.a.a.a.b.a(file, (CharSequence) I0);
            StringBuilder sb = new StringBuilder();
            sb.append(u.k(this.f10025i));
            sb.append(" ; ");
            sb.append(u.e(this.f10025i));
            sb.append(" -style='{");
            sb.append(w.a.replace("$USETAB", w.b(this.f10025i) ? "Never" : "Always"));
            sb.append("}' -assume-filename=");
            sb.append(u.a(this.f10026j.C0(), this.f10025i) ? "file.cpp" : "file.c");
            sb.append(" -i ");
            sb.append(file.getAbsolutePath());
            if (x.a(this.f10025i, sb.toString(), file.getParentFile())) {
                String a = x.a(file.getAbsolutePath());
                file.delete();
                return a;
            }
            file.delete();
            return null;
        }

        @Override // qwe.qweqwe.texteditor.t0.d
        public void a(Object obj) {
            if (obj instanceof String) {
                int x0 = this.f10026j.x0();
                this.f10026j.f((String) obj);
                this.f10026j.e(x0);
            }
        }
    }

    public static void a(Context context, LinkedList<f> linkedList, t0.e eVar) {
        if (!linkedList.isEmpty()) {
            a(context, linkedList.removeFirst(), new i(context, linkedList, eVar));
        } else if (eVar != null) {
            eVar.a(null);
        }
    }

    /* access modifiers changed from: private */
    public static void a(Context context, f fVar, t0.e eVar) {
        t0.a(context, new a(context, fVar, eVar));
    }

    public static void a(CxxActivity cxxActivity) {
        t0.a(cxxActivity, new d(cxxActivity, cxxActivity.y()));
    }

    public static void a(CxxActivity cxxActivity, d.c.f fVar) {
        if (!fVar.f6965g.isEmpty()) {
            t0.a(cxxActivity, new c(fVar, cxxActivity));
        }
    }

    public static void a(CxxPackageManagerActivity cxxPackageManagerActivity, LinkedList<f> linkedList) {
        a((Context) cxxPackageManagerActivity, linkedList, (t0.e) new j(cxxPackageManagerActivity));
    }

    public static void a(CxxPackageManagerActivity cxxPackageManagerActivity, f fVar, t0.e eVar) {
        t0.b(cxxPackageManagerActivity, new b(cxxPackageManagerActivity, fVar, eVar));
    }

    public static void b(CxxPackageManagerActivity cxxPackageManagerActivity, LinkedList<f> linkedList) {
        if (linkedList.isEmpty()) {
            cxxPackageManagerActivity.t();
            return;
        }
        f removeFirst = linkedList.removeFirst();
        a(cxxPackageManagerActivity, removeFirst, (t0.e) new k(cxxPackageManagerActivity, removeFirst, linkedList));
    }

    public static void b(CxxPackageManagerActivity cxxPackageManagerActivity, f fVar) {
        a(cxxPackageManagerActivity, fVar, (t0.e) new h(cxxPackageManagerActivity));
    }

    /* access modifiers changed from: private */
    public static boolean b(Context context) {
        return x.a(context).getBoolean("editor_tab_insert_spaces", false);
    }

    /* access modifiers changed from: private */
    public static Object c(CxxPackageManagerActivity cxxPackageManagerActivity, f fVar) {
        File file = new File(u.f(cxxPackageManagerActivity));
        x.a(fVar.a(cxxPackageManagerActivity).getAbsolutePath());
        FileInputStream fileInputStream = new FileInputStream(fVar.a(cxxPackageManagerActivity));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                new File(file, readLine).delete();
            } else {
                bufferedReader.close();
                fileInputStream.close();
                return null;
            }
        }
    }
}
