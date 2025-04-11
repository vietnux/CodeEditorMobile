package ru.iiec.cxxdroid;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import qwe.qweqwe.texteditor.v0.a;
import ru.iiec.cxxdroid.c0.b;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.manager.f;
import ru.iiec.cxxdroid.settings.CXXSettingsActivity;

public class u {
    private static int a(String str, String str2, Context context) {
        int i2 = a(str, context) == c(str2, context) ? 10000 : 0;
        int min = Math.min(str.length(), str2.length());
        for (int i3 = 0; i3 < min; i3++) {
            if (str.charAt((str.length() - i3) - 1) != str2.charAt((str2.length() - i3) - 1)) {
                return i3 + i2;
            }
        }
        return min + i2;
    }

    public static String a(Context context) {
        return context.getPackageResourcePath();
    }

    public static String a(Context context, String str, String str2, File file) {
        return a(context, str, str2, false, a(false, context), file);
    }

    public static String a(Context context, String str, String str2, boolean z, boolean z2, File file) {
        String e2;
        StringBuilder sb = new StringBuilder();
        boolean a = a(str, context);
        String a2 = a(str, file, context);
        if (a2 == null) {
            sb.append(a ? c(context) : d(context));
        } else {
            sb.append(a2);
            if (b(str, context)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d(context));
                sb2.append(" ");
                a = !a2.startsWith(sb2.toString()) && !a2.startsWith("clang ");
            }
        }
        sb.append(a(a.a(str)));
        sb.append(!z ? a ? " -x c++" : " -x c" : a ? " -x c++-header" : " -x c-header");
        if (a2 == null) {
            sb.append(" ");
            sb.append(a ? CXXSettingsActivity.q(context) : CXXSettingsActivity.p(context));
        }
        if (z2 && (e2 = b.e(str2, context)) != null) {
            sb.append(" -include-pch " + e2);
        }
        if (a2 == null && file != null) {
            if (new File(file.getParentFile().getAbsolutePath() + "/include").exists()) {
                sb.append(" -iquote '" + file.getParentFile().getAbsolutePath() + "/include'");
            }
        }
        return sb.toString();
    }

    private static String a(String str) {
        if (str == null) {
            return "";
        }
        return " -iquote '" + new File(str).getParentFile().getAbsolutePath() + "'";
    }

    private static String a(String str, File file, Context context) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file.getParentFile(), "compile_commands.json");
        if (!file2.exists()) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(k.a.a.a.b.g(file2));
            String str2 = null;
            int i2 = -1;
            boolean z = true;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String optString = jSONArray.getJSONObject(i3).optString("command");
                String optString2 = jSONArray.getJSONObject(i3).optString("file");
                if (!(optString2 == null || optString == null)) {
                    int a = a(optString2, str, context);
                    if (a > i2) {
                        str2 = optString;
                        i2 = a;
                    }
                    z &= a(optString2, context);
                }
            }
            if ((i2 >= 10000 || (z && b(str, context))) && str2 != null) {
                return str2.substring(0, str2.indexOf(" -o "));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public static boolean a(String str, Context context) {
        if (str == null) {
            return CXXSettingsActivity.r(context);
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".cpp") || lowerCase.endsWith(".cxx") || lowerCase.endsWith(".c++") || lowerCase.endsWith(".cc")) {
            return true;
        }
        if (lowerCase.endsWith(".c")) {
            return false;
        }
        return CXXSettingsActivity.r(context);
    }

    public static boolean a(boolean z, Context context) {
        if (z) {
            return false;
        }
        return b.b(context);
    }

    public static String b(Context context) {
        return a.c(context) + "/bin";
    }

    public static boolean b(String str, Context context) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".hpp") || lowerCase.endsWith(".hxx") || lowerCase.endsWith(".h++") || lowerCase.endsWith(".hh") || lowerCase.endsWith(".h");
    }

    private static String c(Context context) {
        return b(context) + "/clang++";
    }

    private static boolean c(String str, Context context) {
        if (str == null) {
            return CXXSettingsActivity.r(context);
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".hpp") || lowerCase.endsWith(".hxx") || lowerCase.endsWith(".h++") || lowerCase.endsWith(".hh")) {
            return true;
        }
        if (lowerCase.endsWith(".h")) {
            return false;
        }
        return a(str, context);
    }

    private static String d(Context context) {
        return b(context) + "/clang";
    }

    public static String e(Context context) {
        return b(context) + "/clang-format";
    }

    public static String f(Context context) {
        return a.c(context) + "/sysroot";
    }

    public static String g(Context context) {
        return a.c(context) + "/sysroot/bin";
    }

    public static String h(Context context) {
        return f(context) + ":" + f(context) + "/include:" + f(context) + "/usr/include";
    }

    public static String i(Context context) {
        return f(context) + ":" + f(context) + "/lib:" + f(context) + "/usr/lib";
    }

    public static String[] j(Context context) {
        String[] strArr = new String[7];
        StringBuilder sb = new StringBuilder();
        sb.append("ANDROID_DATA=");
        sb.append(System.getenv("ANDROID_DATA") != null ? System.getenv("ANDROID_DATA") : "/data");
        strArr[0] = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ANDROID_ROOT=");
        sb2.append(System.getenv("ANDROID_ROOT") != null ? System.getenv("ANDROID_ROOT") : "/system");
        strArr[1] = sb2.toString();
        strArr[2] = "LD_LIBRARY_PATH=" + m(context);
        strArr[3] = "CLANG_SYSROOT=" + f(context);
        strArr[4] = "APP_PACKAGE=" + a(context);
        strArr[5] = "TMPDIR=" + a.i(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("PATH=");
        sb3.append(a.c(context));
        sb3.append(":");
        sb3.append(b(context));
        sb3.append(":");
        sb3.append(a.e(context));
        sb3.append(":");
        sb3.append(System.getenv("PATH") != null ? System.getenv("PATH") : "/system/bin");
        strArr[6] = sb3.toString();
        return strArr;
    }

    public static String k(Context context) {
        StringBuilder sb;
        String str;
        ArrayList<Pair<String, String>> u = u(context);
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < u.size(); i2++) {
            Pair<String, String> pair = u.get(i2);
            if (((String) pair.first).equals("PATH")) {
                sb = new StringBuilder();
                sb.append("export ");
                sb.append((String) pair.first);
                sb.append("='");
                sb.append((String) pair.second);
                str = "':\"$PATH\"";
            } else {
                sb = new StringBuilder();
                sb.append("export ");
                sb.append((String) pair.first);
                sb.append("='");
                sb.append((String) pair.second);
                str = "'";
            }
            sb.append(str);
            sb2.append(sb.toString());
            if (i2 != u.size() - 1) {
                sb2.append(';');
            }
        }
        return sb2.toString();
    }

    public static File l(Context context) {
        return new File(a.c(context), "gui_stderrout");
    }

    public static String m(Context context) {
        return a.c(context) + "/lib";
    }

    public static String n(Context context) {
        return a.a(context) + "/iiec_%s_pch.pch";
    }

    public static String o(Context context) {
        return a.a(context) + "/iiec_%s_pch.h";
    }

    public static String p(Context context) {
        return n(context) + ".log";
    }

    public static String q(Context context) {
        return a.c(context) + "/new_template.cpp";
    }

    public static String r(Context context) {
        return a.c(context) + "/iiec_tmp_binary";
    }

    public static String s(Context context) {
        return a.c(context) + "/iiec_tmp_source_file.txt";
    }

    public static String t(Context context) {
        return a.a(context) + "/tmp_file_for_format_code.txt";
    }

    private static ArrayList<Pair<String, String>> u(Context context) {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (System.getenv("ANDROID_DATA") == null) {
            arrayList.add(new Pair<>("ANDROID_DATA", "/data"));
        }
        if (System.getenv("ANDROID_ROOT") == null) {
            arrayList.add(new Pair<>("ANDROID_ROOT", "/system"));
        }
        arrayList.add(new Pair<>("LD_LIBRARY_PATH", m(context)));
        arrayList.add(new Pair<>("CLANG_SYSROOT", f(context)));
        arrayList.add(new Pair<>("APP_PACKAGE", a(context)));
        arrayList.add(new Pair<>("CC", "clang"));
        arrayList.add(new Pair<>("CXX", "clang++"));
        arrayList.add(new Pair<>("CMAKE_INCLUDE_PATH", h(context)));
        arrayList.add(new Pair<>("CMAKE_LIBRARY_PATH", i(context)));
        arrayList.add(new Pair<>("TMPDIR", a.i(context)));
        arrayList.add(new Pair<>("SHELL", a.g(context)));
        arrayList.add(new Pair<>("CONFIG_SHELL", a.g(context)));
        arrayList.add(new Pair<>("LC_ALL", "en_US.UTF-8"));
        for (f fVar : f.c(context)) {
            if (CxxPackageManagerActivity.a(context, fVar)) {
                for (String str : fVar.f9995h) {
                    String[] split = str.split("=", 2);
                    split[1] = split[1].replace("$sysroot", f(context));
                    arrayList.add(new Pair<>(split[0], split[1]));
                }
            }
        }
        arrayList.add(new Pair<>("PATH", a.c(context) + ":" + b(context) + ":" + g(context) + ":" + a.e(context)));
        return arrayList;
    }

    public static String[] v(Context context) {
        ArrayList<Pair<String, String>> u = u(context);
        u.addAll(e.e.a.a.b(context));
        String[] strArr = new String[(u.size() * 2)];
        for (int i2 = 0; i2 < u.size(); i2++) {
            int i3 = i2 * 2;
            strArr[i3] = (String) u.get(i2).first;
            int i4 = i3 + 1;
            strArr[i4] = (String) u.get(i2).second;
            if (strArr[i3].equals("PATH")) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i4]);
                sb.append(":");
                sb.append(System.getenv("PATH") != null ? System.getenv("PATH") : "/system/bin");
                strArr[i4] = sb.toString();
            }
        }
        return strArr;
    }
}
