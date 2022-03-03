package ru.iiec.cxxdroid.b0;

import android.graphics.Color;
import java.util.regex.Pattern;
import qwe.qweqwe.texteditor.w0.c.j;

public class b extends j {

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f9945h = Pattern.compile("^COMPLETION: (.*)");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f9946i = Pattern.compile("^(.*?) : (.*)");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f9947j = Pattern.compile("^\\[#(.*?)#\\]");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f9948k = Pattern.compile("\\[# const#\\]$");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f9949l = Pattern.compile("<#(.*?)#>");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f9950m = Pattern.compile("^COMPLETION: ([^ ]+) : ([^\\n]+)$");
    private static final Pattern n = Pattern.compile("^COMPLETION: ([^ ]+)$");

    static {
        Pattern.compile("(?: : (.*))?$");
        Pattern.compile("\\[#(.*?)#\\]");
        Pattern.compile("^COMPLETION: ([^:]+)(?: : .*)?$");
    }

    private b(String str, String str2) {
        super(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5 A[SYNTHETIC, Splitter:B:28:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static qwe.qweqwe.texteditor.w0.c.j a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.iiec.cxxdroid.b0.b.a(java.lang.String, java.lang.String):qwe.qweqwe.texteditor.w0.c.j");
    }

    @Override // qwe.qweqwe.texteditor.w0.c.j
    public int a() {
        return Color.rgb(129, 212, 250);
    }

    @Override // qwe.qweqwe.texteditor.w0.c.j
    public String c(String str) {
        if (str != null) {
            return str.endsWith("::") ? str : str.replaceAll("([a-zA-Z_][a-zA-Z0-9_]*::)", "");
        }
        return null;
    }
}
