package c.h.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import c.h.c;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class d {

    /* access modifiers changed from: package-private */
    public static final class a {
        final int[] a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f2283b;

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.f2283b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.f2283b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.f2283b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.f2283b[i2] = list2.get(i2).floatValue();
            }
        }
    }

    private static Shader.TileMode a(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray a2 = g.a(resources, theme, attributeSet, c.GradientColor);
            float a3 = g.a(a2, xmlPullParser, "startX", c.GradientColor_android_startX, 0.0f);
            float a4 = g.a(a2, xmlPullParser, "startY", c.GradientColor_android_startY, 0.0f);
            float a5 = g.a(a2, xmlPullParser, "endX", c.GradientColor_android_endX, 0.0f);
            float a6 = g.a(a2, xmlPullParser, "endY", c.GradientColor_android_endY, 0.0f);
            float a7 = g.a(a2, xmlPullParser, "centerX", c.GradientColor_android_centerX, 0.0f);
            float a8 = g.a(a2, xmlPullParser, "centerY", c.GradientColor_android_centerY, 0.0f);
            int b2 = g.b(a2, xmlPullParser, "type", c.GradientColor_android_type, 0);
            int a9 = g.a(a2, xmlPullParser, "startColor", c.GradientColor_android_startColor, 0);
            boolean a10 = g.a(xmlPullParser, "centerColor");
            int a11 = g.a(a2, xmlPullParser, "centerColor", c.GradientColor_android_centerColor, 0);
            int a12 = g.a(a2, xmlPullParser, "endColor", c.GradientColor_android_endColor, 0);
            int b3 = g.b(a2, xmlPullParser, "tileMode", c.GradientColor_android_tileMode, 0);
            float a13 = g.a(a2, xmlPullParser, "gradientRadius", c.GradientColor_android_gradientRadius, 0.0f);
            a2.recycle();
            a a14 = a(b(resources, xmlPullParser, attributeSet, theme), a9, a12, a10, a11);
            if (b2 != 1) {
                return b2 != 2 ? new LinearGradient(a3, a4, a5, a6, a14.a, a14.f2283b, a(b3)) : new SweepGradient(a7, a8, a14.a, a14.f2283b);
            }
            if (a13 > 0.0f) {
                return new RadialGradient(a7, a8, a13, a14.a, a14.f2283b, a(b3));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new a(i2, i3);
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static c.h.d.d.d.a b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: c.h.d.d.d.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):c.h.d.d.d$a");
    }
}
