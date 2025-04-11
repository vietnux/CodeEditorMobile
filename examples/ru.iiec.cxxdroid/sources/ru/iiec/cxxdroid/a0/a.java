package ru.iiec.cxxdroid.a0;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qwe.qweqwe.texteditor.w0.d.d;

public class a extends d {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f9938e = Pattern.compile("^(<stdin>|.+):(\\d+):(\\d+):(?:(\\{.+\\}):)? ([\\w \\\\-]+): ([^\\[\\n\\r]+)(?: \\[(.+)\\])?\\r?$(?:\\r?\\n^ .+$)+(?:\\r?\\n^fix\\-it:\".+\":\\{(\\d+):(\\d+)\\-(\\d+):(\\d+)\\}:\"(.+)\"$)?", 8);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f9939f = Pattern.compile("^In file included from <stdin>:(\\d+):", 8);

    static {
        new String[]{"^(<stdin>|.+):", "(\\d+):(\\d+):", "(?:({.+}):)?", " ([\\w \\\\-]+):", " ([^[\\n\\r]+)", "(?: \\[(.+)\\])?\\r?$", "(?:\\r?\\n^ .+$)+", "(?:\\r?\\n^fix-it:\".+\":", "{(\\d+):(\\d+)-(\\d+):(\\d+)}:", "\"(.+)\"", "$)?"};
    }

    private a(char c2, int i2, int i3, String str, String str2, String str3) {
        super(c2, i2, i3, str, str2, str3);
    }

    private static char a(String str) {
        if ("error".equalsIgnoreCase(str)) {
            return 'E';
        }
        return "note".equalsIgnoreCase(str) ? 0 : 'W';
    }

    public static boolean a(d dVar) {
        return 'E' == dVar.a;
    }

    public static ArrayList<d> b(String str) {
        a aVar;
        ArrayList<d> arrayList = new ArrayList<>();
        Matcher matcher = f9938e.matcher(str);
        Matcher matcher2 = f9939f.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            try {
                int groupCount = matcher.groupCount();
                String[] strArr = new String[groupCount];
                for (int i3 = 0; i3 < groupCount; i3++) {
                    strArr[i3] = matcher.group(i3);
                }
                String str2 = strArr[1];
                int parseInt = Integer.parseInt(strArr[2]);
                int parseInt2 = Integer.parseInt(strArr[3]);
                String str3 = strArr[4];
                String str4 = strArr[5];
                String str5 = strArr[6];
                char a = a(str4);
                if (a != 0) {
                    if (str2.equals("<stdin>")) {
                        aVar = new a(a, parseInt, parseInt2, "", str5, "");
                    } else {
                        matcher2.region(i2, matcher.end());
                        if (matcher2.find()) {
                            aVar = new a(a, Integer.parseInt(matcher2.group(1)), 0, "", str5, "");
                        }
                        i2 = matcher.end();
                    }
                    arrayList.add(aVar);
                    i2 = matcher.end();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }
}
