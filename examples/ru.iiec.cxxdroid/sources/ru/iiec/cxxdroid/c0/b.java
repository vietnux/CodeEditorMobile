package ru.iiec.cxxdroid.c0;

import android.content.Context;
import c.h.k.d;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.u0.x;
import ru.iiec.cxxdroid.u;

public class b {
    public static final Pattern a = Pattern.compile("please rebuild precompiled header '(.*?)'");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f9953b = Pattern.compile("((\\/\\/.*$)|(\\/\\*[\\s\\S]*?\\*\\/)|(^[\\s]*#([^\\\\\\n]|\\\\[\\s\\S])*$)|[\\s])*$", 8);

    /* renamed from: c  reason: collision with root package name */
    private static String f9954c = "^\\s*(#\\s*ifdef([^A-Za-z0-9]|$))";

    /* renamed from: d  reason: collision with root package name */
    private static String f9955d = "^\\s*(#\\s*if([^A-Za-z0-9]|$))";

    /* renamed from: e  reason: collision with root package name */
    private static String f9956e = "^\\s*(#\\s*endif([^A-Za-z0-9]|$))";

    /* renamed from: f  reason: collision with root package name */
    private static String f9957f = ("((" + f9954c + ")|(" + f9956e + ")|(" + f9955d + "))");

    /* renamed from: g  reason: collision with root package name */
    private static Pattern f9958g = Pattern.compile(f9957f, 8);

    /* renamed from: h  reason: collision with root package name */
    private static LinkedHashMap<String, d<Integer, Integer>> f9959h = new a(32);

    /* renamed from: i  reason: collision with root package name */
    private static HashMap<String, d<String, String>> f9960i = new HashMap<>();

    public static class a<K, V> extends LinkedHashMap<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private final int f9961b;

        public a(int i2) {
            this.f9961b = i2;
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.f9961b;
        }
    }

    public static d<Integer, Integer> a(String str) {
        if (f9959h.containsKey(str)) {
            return f9959h.get(str);
        }
        Matcher matcher = f9953b.matcher(str);
        int i2 = 0;
        if (!matcher.find()) {
            i0.b("PreCompHeaderHelper", "NO MATCH FOUND");
            return new d<>(0, 0);
        }
        int start = matcher.start();
        int end = matcher.end();
        Matcher matcher2 = f9958g.matcher(str.substring(start, end));
        int i3 = -1;
        while (matcher2.find()) {
            boolean contains = matcher2.group().contains("endif");
            if (i2 == 0) {
                i3 = matcher2.start();
            }
            i2 = contains ? i2 - 1 : i2 + 1;
        }
        if (i2 != 0) {
            end = i3 + start;
        }
        d<Integer, Integer> dVar = new d<>(Integer.valueOf(start), Integer.valueOf(end));
        f9959h.put(str, dVar);
        return dVar;
    }

    public static String a(String str, Context context) {
        return u.o(context).replace("%s", Integer.toHexString(str.hashCode()));
    }

    public static void a(Context context) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = new File(qwe.qweqwe.texteditor.v0.a.a(context)).listFiles();
        for (File file : listFiles) {
            if (file.getName().endsWith(".pch")) {
                linkedList.add(file);
            }
        }
        Collections.sort(linkedList, a.f9952b);
        if (linkedList.size() > 1) {
            for (int i2 = 0; i2 < 1; i2++) {
                linkedList.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                File file2 = (File) it.next();
                new File(c(file2.getAbsolutePath())).delete();
                file2.delete();
                new File(file2.getAbsolutePath() + ".log").delete();
            }
        }
    }

    private static void a(String str, String str2, Context context, File file) {
        File file2 = new File(qwe.qweqwe.texteditor.v0.a.c(context));
        d(str);
        try {
            k.a.a.a.b.a(new File(a(str2, context)), (CharSequence) str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a(str2, context);
        String d2 = d(str2, context);
        String b2 = b(str2, context);
        StringBuilder sb = new StringBuilder();
        sb.append(u.a(context, str, null, true, false, file));
        sb.append(" -Xclang -emit-pch");
        sb.append(" " + a2);
        sb.append(" -o");
        sb.append(" " + d2);
        sb.append(" -fno-color-diagnostics -fdiagnostics-parseable-fixits -fdiagnostics-print-source-range-info");
        sb.append(" 2>" + b2);
        f9960i.put(str, new d<>(a2, d2));
        i0.a("PreCompHeaderHelper", "command: " + sb.toString());
        x.a(context, sb.toString(), file2, null, false, u.j(context));
    }

    public static void a(String str, String str2, String str3, int i2, Context context, File file) {
        if (b(context)) {
            if (i2 != 0) {
                Matcher matcher = a.matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    String c2 = c(group);
                    i0.a("PreCompHeaderHelper", "deleting pch:" + group);
                    i0.a("PreCompHeaderHelper", "deleting h:" + c2);
                    new File(group).delete();
                    new File(c2).delete();
                    new File(group + ".log").delete();
                }
                if (str.contains("PCH file") || str.contains("precompiled header was") || str.contains("the precompiled header")) {
                    String e2 = e(str2, context);
                    if (e2 != null) {
                        String c3 = c(e2);
                        i0.a("PreCompHeaderHelper", "deleting pch:" + e2);
                        i0.a("PreCompHeaderHelper", "deleting h:" + c3);
                        new File(e2).delete();
                        new File(c3).delete();
                        new File(e2 + ".log").delete();
                        return;
                    }
                    i0.b("PreCompHeaderHelper", "PCH error, but no PCH file name found");
                }
            } else if (str2.contains("#")) {
                String b2 = b(str2);
                if (!f(b2, context)) {
                    a(str3, b2, context, file);
                }
            }
        }
    }

    public static String b(String str) {
        d<Integer, Integer> a2 = a(str);
        return str.substring(a2.a.intValue(), a2.f2368b.intValue());
    }

    private static String b(String str, Context context) {
        return u.p(context).replace("%s", Integer.toHexString(str.hashCode()));
    }

    public static boolean b(Context context) {
        return x.a(context).getBoolean("enable_pch", true);
    }

    public static String c(String str) {
        return str.substring(0, str.length() - 4) + ".h";
    }

    public static String c(String str, Context context) {
        String b2 = b(str);
        if (!f(b2, context)) {
            return null;
        }
        String b3 = b(b2, context);
        try {
            String replace = k.a.a.a.b.g(new File(b3)).replace(a(b2, context), "<stdin>");
            if (replace.endsWith("generated.\n")) {
                replace = replace.substring(0, replace.lastIndexOf(10, replace.length() - 2) + 1);
            }
            if ("".equals(replace)) {
                return null;
            }
            return replace;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String d(String str, Context context) {
        return u.n(context).replace("%s", Integer.toHexString(str.hashCode()));
    }

    public static boolean d(String str) {
        if (f9960i.containsKey(str)) {
            d<String, String> dVar = f9960i.get(str);
            int i2 = 0;
            for (d<String, String> dVar2 : f9960i.values()) {
                if (dVar2.a.equals(dVar.a)) {
                    i2++;
                }
            }
            if (i2 <= 1) {
                new File(((String) dVar.f2368b) + ".log").delete();
                new File((String) dVar.f2368b).delete();
                new File((String) dVar.a).delete();
                return true;
            }
        }
        return false;
    }

    public static String e(String str, Context context) {
        String b2 = b(str);
        if (!f(b2, context)) {
            return null;
        }
        return d(b2, context);
    }

    public static void e(String str) {
        d(str);
    }

    private static boolean f(String str, Context context) {
        return b(context) && new File(d(str, context)).exists();
    }

    public static String g(String str, Context context) {
        if (!b(context)) {
            return str;
        }
        d<Integer, Integer> a2 = a(str);
        if (!f(str.substring(a2.a.intValue(), a2.f2368b.intValue()), context)) {
            return str;
        }
        String substring = str.substring(a2.a.intValue(), a2.f2368b.intValue());
        int length = substring.length();
        String replaceAll = substring.replaceAll("\\S", " ");
        if (replaceAll.length() != length) {
            i0.b("PreCompHeaderHelper", "SIZE MISMATCH, DATS BAD");
        }
        return str.substring(0, a2.a.intValue()) + replaceAll + str.substring(a2.f2368b.intValue());
    }
}
