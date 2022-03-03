package e.d.a.a;

import android.content.Context;
import java.util.HashMap;
import qwe.qweqwe.texteditor.l0;

public abstract class b {
    protected HashMap<a, Integer> a = d();

    /* renamed from: b  reason: collision with root package name */
    int[] f8182b = {0, -3454186, -14251054, -13273344};

    /* renamed from: c  reason: collision with root package name */
    int[] f8183c = {0, -1280512, -7679507, -7092381};

    /* renamed from: d  reason: collision with root package name */
    int f8184d = -1510658;

    /* renamed from: e  reason: collision with root package name */
    int f8185e = -16116704;

    /* renamed from: f  reason: collision with root package name */
    int f8186f = -32897;

    /* renamed from: g  reason: collision with root package name */
    int f8187g = -8454144;

    public enum a {
        FOREGROUND,
        BACKGROUND,
        SELECTION_FOREGROUND,
        SELECTION_BACKGROUND,
        CARET_FOREGROUND,
        CARET_BACKGROUND,
        CARET_DISABLED,
        LINE_HIGHLIGHT,
        NON_PRINTING_GLYPH,
        COMMENT,
        KEYWORD,
        LITERAL,
        SECONDARY,
        LINECOLOR,
        LINETEXT
    }

    public static int a(Context context) {
        return c.h.d.a.a(context, l0.msg_convention);
    }

    public static int a(Context context, char c2) {
        return c2 != 'C' ? c2 != 'R' ? c2 != 'W' ? c2 != 'E' ? c2 != 'F' ? c(context) : g(context) : e(context) : k(context) : i(context) : a(context);
    }

    public static int b(Context context) {
        return c.h.d.a.a(context, l0.ul_convention);
    }

    public static int b(Context context, char c2) {
        return c2 != 'C' ? c2 != 'R' ? c2 != 'W' ? c2 != 'E' ? c2 != 'F' ? d(context) : h(context) : f(context) : l(context) : j(context) : b(context);
    }

    public static int c(Context context) {
        return c.h.d.a.a(context, l0.msg_default);
    }

    public static int d(Context context) {
        return c.h.d.a.a(context, l0.ul_default);
    }

    private HashMap<a, Integer> d() {
        HashMap<a, Integer> hashMap = new HashMap<>(a.values().length);
        hashMap.put(a.FOREGROUND, -16777216);
        hashMap.put(a.BACKGROUND, -1);
        hashMap.put(a.SELECTION_FOREGROUND, -1);
        hashMap.put(a.SELECTION_BACKGROUND, -16776961);
        hashMap.put(a.CARET_FOREGROUND, -1);
        hashMap.put(a.CARET_BACKGROUND, -16777216);
        hashMap.put(a.CARET_DISABLED, -8355712);
        hashMap.put(a.LINE_HIGHLIGHT, -65536);
        hashMap.put(a.NON_PRINTING_GLYPH, -5592406);
        hashMap.put(a.COMMENT, -12615841);
        hashMap.put(a.KEYWORD, -8454059);
        hashMap.put(a.LITERAL, -14024449);
        hashMap.put(a.SECONDARY, -7667712);
        hashMap.put(a.LINECOLOR, -8355712);
        hashMap.put(a.LINETEXT, -8355712);
        return hashMap;
    }

    public static int e(Context context) {
        return c.h.d.a.a(context, l0.msg_error);
    }

    public static int f(Context context) {
        return c.h.d.a.a(context, l0.ul_error);
    }

    public static int g(Context context) {
        return c.h.d.a.a(context, l0.msg_fatal);
    }

    public static int h(Context context) {
        return c.h.d.a.a(context, l0.ul_fatal);
    }

    public static int i(Context context) {
        return c.h.d.a.a(context, l0.msg_refactor);
    }

    public static int j(Context context) {
        return c.h.d.a.a(context, l0.ul_refactor);
    }

    public static int k(Context context) {
        return c.h.d.a.a(context, l0.msg_warning);
    }

    public static int l(Context context) {
        return c.h.d.a.a(context, l0.ul_warning);
    }

    public int a() {
        return c() ? this.f8185e : this.f8184d;
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return i2 == 100 ? a(a.FOREGROUND) : c() ? this.f8183c[i2 - 100] : this.f8182b[i2 - 100];
    }

    public int a(a aVar) {
        Integer num = this.a.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        o0.a("Color not specified for " + aVar);
        return 0;
    }

    /* access modifiers changed from: protected */
    public void a(a aVar, int i2) {
        this.a.put(aVar, Integer.valueOf(i2));
    }

    public int b() {
        return c() ? this.f8187g : this.f8186f;
    }

    public int b(int i2) {
        a aVar;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 10) {
                    if (i2 != 30) {
                        if (i2 != 20) {
                            if (!(i2 == 21 || i2 == 40 || i2 == 41)) {
                                if (i2 == 50 || i2 == 51) {
                                    aVar = a.LITERAL;
                                } else if (g0.a(i2)) {
                                    return a(i2);
                                } else {
                                    o0.a("Invalid token type");
                                }
                            }
                        }
                    }
                    aVar = a.COMMENT;
                }
                aVar = a.SECONDARY;
            } else {
                aVar = a.KEYWORD;
            }
            return a(aVar);
        }
        aVar = a.FOREGROUND;
        return a(aVar);
    }

    public abstract boolean c();
}
