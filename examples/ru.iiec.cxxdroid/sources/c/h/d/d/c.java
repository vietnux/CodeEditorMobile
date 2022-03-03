package c.h.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {

    public interface a {
    }

    public static final class b implements a {
        private final C0043c[] a;

        public b(C0043c[] cVarArr) {
            this.a = cVarArr;
        }

        public C0043c[] a() {
            return this.a;
        }
    }

    /* renamed from: c.h.d.d.c$c  reason: collision with other inner class name */
    public static final class C0043c {
        private final String a;

        /* renamed from: b  reason: collision with root package name */
        private int f2275b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2276c;

        /* renamed from: d  reason: collision with root package name */
        private String f2277d;

        /* renamed from: e  reason: collision with root package name */
        private int f2278e;

        /* renamed from: f  reason: collision with root package name */
        private int f2279f;

        public C0043c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.f2275b = i2;
            this.f2276c = z;
            this.f2277d = str2;
            this.f2278e = i3;
            this.f2279f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f2279f;
        }

        public int c() {
            return this.f2278e;
        }

        public String d() {
            return this.f2277d;
        }

        public int e() {
            return this.f2275b;
        }

        public boolean f() {
            return this.f2276c;
        }
    }

    public static final class d implements a {
        private final c.h.i.d a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2280b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2281c;

        /* renamed from: d  reason: collision with root package name */
        private final String f2282d;

        public d(c.h.i.d dVar, int i2, int i3, String str) {
            this.a = dVar;
            this.f2281c = i2;
            this.f2280b = i3;
            this.f2282d = str;
        }

        public int a() {
            return this.f2281c;
        }

        public c.h.i.d b() {
            return this.a;
        }

        public String c() {
            return this.f2282d;
        }

        public int d() {
            return this.f2280b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.c.FontFamily);
        String string = obtainAttributes.getString(c.h.c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(c.h.c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(c.h.c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(c.h.c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(c.h.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(c.h.c.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(c.h.c.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(d(xmlPullParser, resources));
                    } else {
                        a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0043c[]) arrayList.toArray(new C0043c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new d(new c.h.i.d(string, string2, string3, a(resources, resourceId)), integer, integer2, string4);
    }

    private static C0043c d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), c.h.c.FontFamilyFont);
        int i2 = obtainAttributes.getInt(obtainAttributes.hasValue(c.h.c.FontFamilyFont_fontWeight) ? c.h.c.FontFamilyFont_fontWeight : c.h.c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(c.h.c.FontFamilyFont_fontStyle) ? c.h.c.FontFamilyFont_fontStyle : c.h.c.FontFamilyFont_android_fontStyle, 0);
        int i3 = obtainAttributes.hasValue(c.h.c.FontFamilyFont_ttcIndex) ? c.h.c.FontFamilyFont_ttcIndex : c.h.c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(c.h.c.FontFamilyFont_fontVariationSettings) ? c.h.c.FontFamilyFont_fontVariationSettings : c.h.c.FontFamilyFont_android_fontVariationSettings);
        int i4 = obtainAttributes.getInt(i3, 0);
        int i5 = obtainAttributes.hasValue(c.h.c.FontFamilyFont_font) ? c.h.c.FontFamilyFont_font : c.h.c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            a(xmlPullParser);
        }
        return new C0043c(string2, i2, z, string, i4, resourceId);
    }
}
