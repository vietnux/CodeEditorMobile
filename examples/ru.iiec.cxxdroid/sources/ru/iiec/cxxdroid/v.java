package ru.iiec.cxxdroid;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import androidx.appcompat.app.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import k.a.a.a.b;
import k.a.a.a.f.e;
import k.a.a.a.f.g;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.u0.a0;
import qwe.qweqwe.texteditor.u0.x;
import qwe.qweqwe.texteditor.w0.d.d;
import qwe.qweqwe.texteditor.y;
import qwe.qweqwe.texteditor.y0.p;
import ru.iiec.cxxdroid.gui.AllegroActivity;
import ru.iiec.cxxdroid.gui.JumpActivity;
import ru.iiec.cxxdroid.gui.NativeActivity;
import ru.iiec.cxxdroid.gui.SDLActivity;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.manager.f;
import ru.iiec.cxxdroid.settings.CXXSettingsActivity;

public class v extends y {

    /* renamed from: b  reason: collision with root package name */
    public static Integer f10008b = null;

    /* renamed from: c  reason: collision with root package name */
    public static SpannableStringBuilder f10009c = null;

    /* renamed from: d  reason: collision with root package name */
    static long f10010d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static int f10011e = 3013;
    private final CxxActivity a;

    /* access modifiers changed from: package-private */
    public class a extends AsyncTask<Object, Object, Object> {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f10012b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f10013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f10014d;

        /* renamed from: ru.iiec.cxxdroid.v$a$a  reason: collision with other inner class name */
        class C0160a implements x.a {
            C0160a() {
            }

            @Override // qwe.qweqwe.texteditor.u0.x.a
            public void a(String str) {
                i0.a("ClangRunCodeHelper", str);
                SpannableStringBuilder spannableStringBuilder = v.f10009c;
                a0.a(spannableStringBuilder, str, a.this.a());
                spannableStringBuilder.append('\n');
            }

            @Override // qwe.qweqwe.texteditor.u0.x.a
            public void b(String str) {
                i0.b("ClangRunCodeHelper", str);
                String C0 = a.this.f10013c.C0();
                String s = u.s(v.this.a);
                if (C0 == null) {
                    C0 = "<stdin>";
                }
                String replace = str.replace(s, C0);
                a aVar = a.this;
                if (!aVar.a("error: ", v.f10009c, replace, e.d.a.a.b.e(v.this.a))) {
                    a aVar2 = a.this;
                    if (!aVar2.a("warning: ", v.f10009c, replace, e.d.a.a.b.k(v.this.a))) {
                        a0.a(v.f10009c, replace, a.this.a());
                    }
                }
                v.f10009c.append('\n');
            }
        }

        class b implements g {
            b(a aVar) {
            }

            @Override // k.a.a.a.f.g
            public boolean accept(File file) {
                return accept(null, file.getName());
            }

            @Override // k.a.a.a.f.g
            public boolean accept(File file, String str) {
                return !str.contains(".");
            }
        }

        a(File file, p pVar, String str) {
            this.f10012b = file;
            this.f10013c = pVar;
            this.f10014d = str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int a() {
            return v.this.a.getResources().getColor(C0162R.color.menu_icon);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean a(String str, SpannableStringBuilder spannableStringBuilder, String str2, int i2) {
            int indexOf = str2.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            a0.a(spannableStringBuilder, str2.substring(0, indexOf), a());
            a0.a(spannableStringBuilder, str, i2);
            a0.a(spannableStringBuilder, str2.substring(indexOf + str.length(), str2.length()), a());
            return true;
        }

        private String[] a(String str) {
            if (str == null || str.length() == 0) {
                return new String[0];
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, "\"' ", true);
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            loop0:
            while (true) {
                char c2 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (c2 == 1) {
                        if ("'".equals(nextToken)) {
                        }
                        sb.append(nextToken);
                    } else if (c2 != 2) {
                        if ("'".equals(nextToken)) {
                            c2 = 1;
                        } else if ("\"".equals(nextToken)) {
                            c2 = 2;
                        } else if (!" ".equals(nextToken)) {
                            sb.append(nextToken);
                        } else if (z || sb.length() != 0) {
                            arrayList.add(sb.toString());
                            sb.setLength(0);
                        }
                        z = false;
                    } else {
                        if ("\"".equals(nextToken)) {
                        }
                        sb.append(nextToken);
                    }
                    z = true;
                }
                break loop0;
            }
            if (z || sb.length() != 0) {
                arrayList.add(sb.toString());
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object[] objArr) {
            int i2;
            String str;
            File file;
            String c2;
            Integer num;
            if (this.f10013c.P0()) {
                this.a = null;
                str = u.k(v.this.a) + " ; cmake -DCMAKE_C_FLAGS='" + CXXSettingsActivity.p(v.this.a) + "' -DCMAKE_CXX_FLAGS='" + CXXSettingsActivity.q(v.this.a) + "' -DCMAKE_EXE_LINKER_FLAGS='" + CXXSettingsActivity.s(v.this.a) + "' -DCMAKE_EXPORT_COMPILE_COMMANDS=ON . && make -j4";
                file = this.f10013c.F0().getParentFile();
            } else {
                this.a = this.f10013c.I0();
                if (!(CXXSettingsActivity.l(v.this.a) || (num = v.f10008b) == null || num.intValue() != this.a.hashCode())) {
                    return 0;
                }
                File file2 = new File(qwe.qweqwe.texteditor.v0.a.c(v.this.a));
                File file3 = new File(u.s(v.this.a));
                Pair b2 = v.this.b((v) this.a);
                String str2 = (String) b2.first;
                boolean booleanValue = ((Boolean) b2.second).booleanValue();
                try {
                    k.a.a.a.b.a(file3, (CharSequence) ru.iiec.cxxdroid.c0.b.g(this.a, v.this.a));
                    StringBuilder sb = new StringBuilder();
                    sb.append(u.k(v.this.a));
                    sb.append(" ; ");
                    sb.append(u.a(v.this.a, this.f10013c.C0(), this.a, null));
                    sb.append(" ");
                    sb.append(u.s(v.this.a));
                    sb.append(booleanValue ? " -Wl,--no-undefined -Wl,--require-defined -Wl,cxxdroid_gui_link --shared" : "");
                    sb.append(" -Wl,--start-group ");
                    sb.append(str2);
                    sb.append(" -Wl,--end-group ");
                    sb.append(CXXSettingsActivity.s(v.this.a));
                    sb.append(" -o ");
                    sb.append(u.r(v.this.a));
                    file = file2;
                    str = sb.toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    i2 = 1;
                }
            }
            v.f10010d = System.currentTimeMillis();
            i0.a("ClangRunCodeHelper", "start");
            v.f10009c = new SpannableStringBuilder();
            i0.a("ClangRunCodeHelper", "command: " + str);
            C0160a aVar = new C0160a();
            if (!this.f10013c.P0() && (c2 = ru.iiec.cxxdroid.c0.b.c(this.a, v.this.a)) != null) {
                for (String str3 : c2.split("\\n")) {
                    aVar.b(str3);
                }
            }
            i2 = x.b(v.this.a, str, file, aVar);
            return Integer.valueOf(i2);
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Object obj) {
            String str;
            SpannableStringBuilder spannableStringBuilder;
            String str2;
            int e2;
            super.onPostExecute(obj);
            try {
                v.this.a.invalidateOptionsMenu();
                v.this.a.K().setVisibility(4);
                v.this.a.I().setActivated(true);
                i0.a("ClangRunCodeHelper", "done: " + (System.currentTimeMillis() - v.f10010d));
                int intValue = ((Integer) obj).intValue();
                i0.a("ClangRunCodeHelper", "exitCode: " + obj);
                if (intValue == 0 && this.f10013c.P0()) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        String g2 = k.a.a.a.b.g(this.f10013c.F0());
                        int indexOf = g2.indexOf("#Cxxdroid-binary:");
                        if (indexOf != -1) {
                            int i2 = indexOf + 17;
                            int indexOf2 = g2.indexOf(10, i2);
                            if (indexOf2 == -1) {
                                indexOf2 = g2.length();
                            }
                            arrayList.add(new File(this.f10013c.F0().getParentFile(), g2.substring(i2, indexOf2).trim()));
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (arrayList.size() == 0) {
                        for (File file : k.a.a.a.b.a(this.f10013c.F0().getParentFile(), new b(this), e.f9529c)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                byte[] bArr = new byte[4];
                                fileInputStream.read(bArr);
                                fileInputStream.close();
                                if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                                    arrayList.add(file);
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (arrayList.size() != 1) {
                        a0.a(v.f10009c, "Cxxdroid cannot find distinct executable file to launch.", e.d.a.a.b.e(v.this.a));
                        spannableStringBuilder = v.f10009c;
                        str2 = "\nConsider specifying its name in CMakeLists.txt via \"#Cxxdroid-binary: name-of-binary\" or configure it to produce only one ELF file without extension.\n";
                        e2 = a();
                    } else {
                        try {
                            k.a.a.a.b.a((File) arrayList.get(0), new File(u.r(v.this.a)));
                        } catch (Exception unused) {
                            spannableStringBuilder = v.f10009c;
                            str2 = "Cannot copy executable file \"" + arrayList.get(0) + "\" to launch.\n";
                            e2 = e.d.a.a.b.e(v.this.a);
                        }
                    }
                    a0.a(spannableStringBuilder, str2, e2);
                    intValue = 1;
                }
                if (intValue == 0) {
                    String str3 = null;
                    if (!this.f10013c.P0()) {
                        str = qwe.qweqwe.texteditor.v0.a.a(this.f10013c.C0());
                        v.f10008b = Integer.valueOf(this.a.hashCode());
                    } else {
                        str = this.f10013c.F0().getAbsolutePath();
                        v.f10008b = null;
                    }
                    String r = u.r(v.this.a);
                    int a2 = ru.iiec.cxxdroid.gui.a.a(r);
                    if (str != null) {
                        str3 = new File(str).getParent();
                    }
                    if (str3 == null) {
                        str3 = qwe.qweqwe.texteditor.v0.a.b((Context) v.this.a);
                    }
                    u.l(v.this.a).delete();
                    try {
                        e.e.a.a.c(v.this.a).a(qwe.qweqwe.texteditor.v0.a.d(v.this.a) + " pkill -9 -f cxxguiapp").waitFor();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    if (a2 == 0) {
                        CxxActivity cxxActivity = v.this.a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("cd '");
                        sb.append(str3);
                        sb.append("' && ");
                        sb.append(r);
                        sb.append(this.f10014d == null ? "" : " " + this.f10014d);
                        x.a(cxxActivity, sb.toString(), u.k(v.this.a), Integer.valueOf(v.f10011e));
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("cxxdroid_gui_preload", qwe.qweqwe.texteditor.v0.a.c(v.this.a) + "/lib/libc++_shared.so");
                    intent.putExtra("cxxdroid_gui_executable", r);
                    intent.putExtra("cxxdroid_gui_curdir", str3);
                    intent.putExtra("cxxdroid_gui_stderrout", u.l(v.this.a).getAbsolutePath());
                    intent.putExtra("cxxdroid_gui_env", u.v(v.this.a));
                    intent.putExtra("cxxdroid_gui_argv", a(this.f10014d));
                    if (a2 == 1) {
                        intent.putExtra("cxxdroid_gui_backclose", CXXSettingsActivity.n(v.this.a));
                        intent.setClass(v.this.a, SDLActivity.class);
                    }
                    if (a2 == 2) {
                        intent.putExtra("cxxdroid_gui_backclose", CXXSettingsActivity.o(v.this.a));
                        intent.setClass(v.this.a, NativeActivity.class);
                    }
                    if (a2 == 3) {
                        intent.putExtra("cxxdroid_gui_backclose", CXXSettingsActivity.m(v.this.a));
                        intent.setClass(v.this.a, AllegroActivity.class);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        intent.setFlags(134742016);
                        intent.putExtra("JUMP_PACKAGE_NAME", intent.getComponent().getPackageName());
                        intent.putExtra("JUMP_CLASS_NAME", intent.getComponent().getClassName());
                        intent.setComponent(new ComponentName(v.this.a, JumpActivity.class));
                    } else {
                        intent.addFlags(268435456);
                    }
                    v.this.a.startActivity(intent);
                    return;
                }
                String spannableStringBuilder2 = v.f10009c.toString();
                if (this.f10013c.P0()) {
                    spannableStringBuilder2 = spannableStringBuilder2.replace(this.f10013c.C0(), "<stdin>");
                }
                Iterator<d> it = ru.iiec.cxxdroid.a0.a.b(spannableStringBuilder2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    d next = it.next();
                    if (ru.iiec.cxxdroid.a0.a.a(next)) {
                        v.this.a.y().b(next.f9841b, next.f9842c - 1);
                        break;
                    }
                }
                v.a(v.this.a);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            v.this.a.K().setVisibility(0);
            v.this.a.I().setActivated(false);
            File file = this.f10012b;
            if (file != null) {
                y.a(file.getParentFile(), v.this.a);
            }
        }
    }

    public v(CxxActivity cxxActivity) {
        this.a = cxxActivity;
    }

    public static LinkedList<f> a(Context context, String str) {
        LinkedList<f> linkedList = new LinkedList<>(b(context, str));
        a(context, linkedList);
        return linkedList;
    }

    public static LinkedList<f> a(Context context, List<f> list) {
        List<f> c2 = f.c(context);
        LinkedList<f> linkedList = new LinkedList<>();
        for (f fVar : list) {
            CxxPackageManagerActivity.a(linkedList, fVar, c2);
        }
        HashSet hashSet = new HashSet();
        Iterator<f> it = linkedList.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(it.next())) {
                it.remove();
            }
        }
        a(context, linkedList);
        return linkedList;
    }

    private static void a(Context context, LinkedList<f> linkedList) {
        Iterator<f> it = linkedList.iterator();
        while (it.hasNext()) {
            if (!CxxPackageManagerActivity.a(context, it.next())) {
                it.remove();
            }
        }
    }

    public static void a(e0 e0Var, int i2, int i3, Intent intent) {
        if (i2 == f10011e) {
            s.a(e0Var);
        }
    }

    public static void a(CxxActivity cxxActivity) {
        if (f10009c != null) {
            d.a aVar = new d.a(cxxActivity);
            aVar.b(cxxActivity.getString(C0162R.string.compiler_output));
            TextView textView = new TextView(cxxActivity);
            textView.setPadding(a0.a(cxxActivity, 10), a0.a(cxxActivity, 10), a0.a(cxxActivity, 10), a0.a(cxxActivity, 10));
            textView.setText(f10009c, TextView.BufferType.SPANNABLE);
            textView.setTextIsSelectable(true);
            textView.setTypeface(Typeface.MONOSPACE);
            aVar.b(textView);
            aVar.c();
        }
    }

    public static void a(CxxActivity cxxActivity, Bundle bundle) {
        if (bundle == null) {
            try {
                u.l(cxxActivity).delete();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Pair<String, Boolean> b(String str) {
        LinkedList<f> a2 = a(this.a, b(this.a, str));
        ArrayList arrayList = new ArrayList();
        Iterator<f> descendingIterator = a2.descendingIterator();
        boolean z = false;
        while (descendingIterator.hasNext()) {
            f next = descendingIterator.next();
            arrayList.add(next.f9997j);
            z |= next.p;
        }
        if (z) {
            arrayList.add("-lEGL");
            arrayList.add("-lGLESv1_CM");
            arrayList.add("-lGLESv2");
            arrayList.add("-lOpenSLES");
            arrayList.add("-landroid");
        }
        return new Pair<>(TextUtils.join(" ", arrayList), Boolean.valueOf(z));
    }

    private static ArrayList<f> b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        for (String str2 : split) {
            if (str2.contains("#include")) {
                arrayList.add(str2);
            }
        }
        String join = TextUtils.join("\n", arrayList);
        List<f> c2 = f.c(context);
        ArrayList<f> arrayList2 = new ArrayList<>();
        for (f fVar : c2) {
            for (String str3 : fVar.f9996i) {
                if (!join.contains("<" + str3)) {
                    if (!join.contains("\"" + str3)) {
                    }
                }
                arrayList2.add(fVar);
            }
        }
        return arrayList2;
    }

    public static void b(CxxActivity cxxActivity) {
        d.a aVar = new d.a(cxxActivity);
        aVar.b(cxxActivity.getString(C0162R.string.just_logs));
        TextView textView = new TextView(cxxActivity);
        textView.setPadding(a0.a(cxxActivity, 10), a0.a(cxxActivity, 10), a0.a(cxxActivity, 10), a0.a(cxxActivity, 10));
        try {
            textView.setText(b.g(u.l(cxxActivity).getAbsoluteFile()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        textView.setTextIsSelectable(true);
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setTextColor(cxxActivity.getResources().getColor(C0162R.color.menu_icon));
        aVar.b(textView);
        aVar.c();
    }

    @Override // qwe.qweqwe.texteditor.y
    public void a() {
        a((String) null);
    }

    @Override // qwe.qweqwe.texteditor.y
    @SuppressLint({"StaticFieldLeak"})
    public void a(String str) {
        p y = this.a.y();
        new a(this.a.b(y.C0()), y, str).execute(new Object[0]);
    }
}
