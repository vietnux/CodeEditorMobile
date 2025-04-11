package ru.iiec.cxxdroid;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import androidx.appcompat.app.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qwe.qweqwe.texteditor.b0;
import qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder;
import qwe.qweqwe.texteditor.y0.k;
import qwe.qweqwe.texteditor.y0.l;
import qwe.qweqwe.texteditor.y0.m;
import qwe.qweqwe.texteditor.y0.p;
import qwe.qweqwe.texteditor.y0.r;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* access modifiers changed from: package-private */
public class x extends r {

    /* renamed from: b  reason: collision with root package name */
    private final CxxActivity f10027b;

    class a extends r.e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f10028e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, String str, m[] mVarArr, String str2) {
            super(charSequence, str, mVarArr);
            this.f10028e = str2;
        }

        @Override // qwe.qweqwe.texteditor.y0.r.e
        public String a(String str) {
            x xVar = x.this;
            return xVar.a(v.a(((r) xVar).a, this.f10028e), str).a;
        }
    }

    /* access modifiers changed from: private */
    public class b extends r.e.a {

        /* renamed from: d  reason: collision with root package name */
        public final File f10030d;

        public b(x xVar, File file) {
            super(file.getName(), false);
            this.f10030d = file;
        }
    }

    /* access modifiers changed from: private */
    public class c extends r.e.a {

        /* renamed from: d  reason: collision with root package name */
        public final File f10031d;

        public c(x xVar, File file) {
            super(file.getName(), false);
            this.f10031d = file;
        }
    }

    private class d extends r.e {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(ru.iiec.cxxdroid.x r5) {
            /*
                r4 = this;
                r5 = 1
                qwe.qweqwe.texteditor.y0.m[] r5 = new qwe.qweqwe.texteditor.y0.m[r5]
                qwe.qweqwe.texteditor.y0.r$e$d r0 = new qwe.qweqwe.texteditor.y0.r$e$d
                java.lang.String r1 = "File name"
                java.lang.String r2 = "$name"
                java.lang.String r3 = "header.h"
                r0.<init>(r1, r2, r3)
                r0.a()
                r1 = 0
                r2 = -3
                r0.a(r1, r2)
                r5[r1] = r0
                java.lang.String r0 = "C Header File"
                java.lang.String r1 = ""
                r4.<init>(r0, r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.iiec.cxxdroid.x.d.<init>(ru.iiec.cxxdroid.x):void");
        }
    }

    private class e extends r.e {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(ru.iiec.cxxdroid.x r5) {
            /*
                r4 = this;
                r5 = 1
                qwe.qweqwe.texteditor.y0.m[] r5 = new qwe.qweqwe.texteditor.y0.m[r5]
                qwe.qweqwe.texteditor.y0.r$e$d r0 = new qwe.qweqwe.texteditor.y0.r$e$d
                java.lang.String r1 = "File name"
                java.lang.String r2 = "$name"
                java.lang.String r3 = "source.c"
                r0.<init>(r1, r2, r3)
                r0.a()
                r1 = 0
                r2 = -3
                r0.a(r1, r2)
                r5[r1] = r0
                java.lang.String r0 = "C Source File"
                java.lang.String r1 = ""
                r4.<init>(r0, r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.iiec.cxxdroid.x.e.<init>(ru.iiec.cxxdroid.x):void");
        }
    }

    private class f extends r.e {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(ru.iiec.cxxdroid.x r5) {
            /*
                r4 = this;
                r5 = 1
                qwe.qweqwe.texteditor.y0.m[] r5 = new qwe.qweqwe.texteditor.y0.m[r5]
                qwe.qweqwe.texteditor.y0.r$e$d r0 = new qwe.qweqwe.texteditor.y0.r$e$d
                java.lang.String r1 = "File name"
                java.lang.String r2 = "$name"
                java.lang.String r3 = "header.hpp"
                r0.<init>(r1, r2, r3)
                r0.a()
                r1 = 0
                r2 = -5
                r0.a(r1, r2)
                r5[r1] = r0
                java.lang.String r0 = "C++ Header File"
                java.lang.String r1 = ""
                r4.<init>(r0, r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.iiec.cxxdroid.x.f.<init>(ru.iiec.cxxdroid.x):void");
        }
    }

    private class g extends r.e {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(ru.iiec.cxxdroid.x r5) {
            /*
                r4 = this;
                r5 = 1
                qwe.qweqwe.texteditor.y0.m[] r5 = new qwe.qweqwe.texteditor.y0.m[r5]
                qwe.qweqwe.texteditor.y0.r$e$d r0 = new qwe.qweqwe.texteditor.y0.r$e$d
                java.lang.String r1 = "File name"
                java.lang.String r2 = "$name"
                java.lang.String r3 = "source.cpp"
                r0.<init>(r1, r2, r3)
                r0.a()
                r1 = 0
                r2 = -5
                r0.a(r1, r2)
                r5[r1] = r0
                java.lang.String r0 = "C++ Source File"
                java.lang.String r1 = ""
                r4.<init>(r0, r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.iiec.cxxdroid.x.g.<init>(ru.iiec.cxxdroid.x):void");
        }
    }

    /* access modifiers changed from: package-private */
    public interface h {
        void a(String str);
    }

    public x(CxxActivity cxxActivity) {
        super(cxxActivity);
        this.f10027b = cxxActivity;
    }

    public static void a(Context context) {
        try {
            File file = new File(u.q(context));
            if (!file.exists()) {
                k.a.a.a.b.a(file, (CharSequence) "int main(int argc, char *argv[])\n{\n\t\n}");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void a(boolean z, String str, h hVar, m[] mVarArr, String str2) {
        File file;
        File file2;
        String str3 = ((r.e.d) mVarArr[0]).f9907d;
        File file3 = new File(str3, "src");
        file3.mkdirs();
        File file4 = new File(str3, "include");
        file4.mkdirs();
        String absolutePath = new File(file3, z ? "main.cpp" : "main.c").getAbsolutePath();
        try {
            qwe.qweqwe.texteditor.x0.b.a(str2, str3 + "/CMakeLists.txt");
            qwe.qweqwe.texteditor.x0.b.a(str, absolutePath);
            for (m mVar : mVarArr) {
                if (!(mVar instanceof b) || !((b) mVar).f9903c) {
                    if ((mVar instanceof c) && ((c) mVar).f9903c) {
                        file = ((c) mVar).f10031d;
                        file2 = new File(file3, file.getName());
                    }
                } else {
                    file = ((b) mVar).f10030d;
                    file2 = new File(file4, file.getName());
                }
                k.a.a.a.b.a(file, file2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        hVar.a(absolutePath);
    }

    public c.h.k.d<String, Integer> a(List<ru.iiec.cxxdroid.manager.f> list, String str) {
        Matcher matcher = Pattern.compile("add_executable\\s*\\((.*?)[\\s,)]").matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        if (arrayList.size() != 1) {
            return new c.h.k.d<>(str, 1);
        }
        String str2 = (String) arrayList.get(0);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ru.iiec.cxxdroid.manager.f fVar : list) {
            if (fVar.f9999l != null) {
                arrayList2.add(fVar);
            } else {
                arrayList3.add(fVar);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ru.iiec.cxxdroid.manager.f fVar2 = (ru.iiec.cxxdroid.manager.f) it.next();
            String format = !fVar2.f10000m.startsWith("#") ? String.format("${%s}", fVar2.f10000m + "LIBRARIES") : fVar2.f10000m.substring(1);
            String str3 = "\n" + String.format("find_package(%s %s)", fVar2.f9999l, fVar2.n) + "\n" + String.format("target_link_libraries(%s %s)", str2, format);
            if (!str.contains(str3)) {
                str = str + str3;
            }
        }
        if (arrayList3.size() != 0) {
            Iterator<ru.iiec.cxxdroid.manager.f> descendingIterator = v.a(this.a, arrayList3).descendingIterator();
            String str4 = "";
            while (descendingIterator.hasNext()) {
                str4 = str4 + " " + descendingIterator.next().f9997j;
            }
            String replace = str4.replace(" -l", " ");
            if (replace.length() > 0) {
                replace = replace.substring(1);
            }
            String str5 = "\n" + String.format("target_link_libraries(%s -Wl,--start-group %s -Wl,--end-group)", str2, replace);
            if (!str.contains(str5)) {
                str = str + str5;
            }
        }
        return new c.h.k.d<>(str, 0);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.y0.r
    public r.e a() {
        String str;
        a(this.a);
        try {
            str = k.a.a.a.b.g(new File(u.q(this.a)));
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "int main(int argc, char *argv[])\n{\n\t\n}";
        }
        int i2 = 0;
        int length = str.length() - 1;
        while (true) {
            if (length <= 0) {
                break;
            } else if (str.charAt(length) == '}') {
                int i3 = length - 1;
                while (i3 >= 0 && (str.charAt(i3) == '\n' || str.charAt(i3) == '\r')) {
                    i3--;
                }
                i2 = i3 + 1;
            } else {
                length--;
            }
        }
        return new r.e("", str).a(i2);
    }

    @Override // qwe.qweqwe.texteditor.y0.r
    public void a(File file) {
        ArrayList<ru.iiec.cxxdroid.manager.f> a2 = CxxPackageManagerActivity.a((Context) this.a);
        CharSequence[] charSequenceArr = new CharSequence[a2.size()];
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            charSequenceArr[i2] = a2.get(i2).f9990c;
        }
        d.a aVar = new d.a(this.a);
        aVar.b(C0162R.string.add_library_title);
        aVar.a(charSequenceArr, new m(this, a2, file));
        if (a2.size() == 0) {
            Toast.makeText(this.a, (int) C0162R.string.cmake_add_failed_no_libs, 0).show();
        } else {
            aVar.c();
        }
    }

    public /* synthetic */ void a(ArrayList arrayList, File file, DialogInterface dialogInterface, int i2) {
        try {
            c.h.k.d<String, Integer> a2 = a(Arrays.asList((ru.iiec.cxxdroid.manager.f) arrayList.get(i2)), k.a.a.a.b.g(file));
            if (a2.f2368b.intValue() == 1) {
                Toast.makeText(this.a, (int) C0162R.string.cmake_add_failed_format, 1).show();
                return;
            }
            k.a.a.a.b.a(file, (String) a2.a);
            for (p pVar : this.a.u.b()) {
                if (file.getAbsolutePath().equals(pVar.C0())) {
                    pVar.U0();
                }
            }
            this.a.e(8388613);
        } catch (Exception e2) {
            e2.printStackTrace();
            Toast.makeText(this.a, (int) C0162R.string.cmake_add_failed_io, 0).show();
        }
    }

    @Override // qwe.qweqwe.texteditor.y0.r
    public void a(IconTreeItemHolder.b bVar) {
        if (this.a.D()) {
            a(new r.d[]{new r.d(this, "$path", bVar.f9634e.getAbsolutePath())});
            return;
        }
        this.f10027b.l0();
    }

    public void a(p pVar, h hVar) {
        Object obj;
        v.f10008b = null;
        if (!b0.c() || !pVar.P0()) {
            ArrayList arrayList = new ArrayList();
            r.e.b bVar = new r.e.b("Project folder", "$nonexistent", b("/my-project"));
            bVar.b();
            arrayList.add(bVar);
            r.e.d dVar = new r.e.d("Project name", "$project", "Main");
            dVar.c();
            arrayList.add(dVar);
            String v0 = pVar.v0();
            String M0 = pVar.M0();
            boolean a2 = u.a(pVar.C0(), this.a);
            if (M0 != null) {
                File[] listFiles = new File(M0).getParentFile().listFiles();
                Arrays.sort(listFiles);
                for (File file : listFiles) {
                    if (file.isFile() && !file.getAbsolutePath().equals(M0)) {
                        String name = file.getName();
                        if (name.endsWith(".c") || name.endsWith(".cpp") || name.endsWith(".cxx") || name.endsWith(".c++") || name.endsWith(".cc")) {
                            obj = new c(this, file);
                        } else if (name.endsWith(".h") || name.endsWith(".hpp") || name.endsWith(".hxx") || name.endsWith(".h++") || name.endsWith(".hh")) {
                            obj = new b(this, file);
                        }
                        arrayList.add(obj);
                    }
                }
            }
            a(new a("No_title", "cmake_minimum_required(VERSION 3.6.0)\nproject($project)\ninclude_directories(\n\t${PROJECT_SOURCE_DIR}/include\n\t${PROJECT_SOURCE_DIR}/src\n)\nfile(GLOB SRCS\n\t\"${PROJECT_SOURCE_DIR}/include/*\"\n\t\"${PROJECT_SOURCE_DIR}/src/*\"\n)\nadd_executable($project ${SRCS})", (m[]) arrayList.toArray(new m[0]), v0), new n(a2, v0, hVar));
            return;
        }
        throw new RuntimeException("User shouldn't be able to upgrade projects to projects");
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.y0.r
    public r.e[] a(String str) {
        if (str == null) {
            return new r.e[]{new l()};
        } else if (str.endsWith("/src")) {
            return new r.e[]{new e(this), new g(this), new l(), new k()};
        } else if (str.endsWith("/include")) {
            return new r.e[]{new d(this), new f(this), new l(), new k()};
        } else {
            return new r.e[]{new l(), new k()};
        }
    }
}
