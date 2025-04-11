package c.u.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import c.h.d.d.g;
import c.h.e.c;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    /* access modifiers changed from: private */
    public static class a implements TypeEvaluator<c.b[]> {
        private c.b[] a;

        a() {
        }

        /* renamed from: a */
        public c.b[] evaluate(float f2, c.b[] bVarArr, c.b[] bVarArr2) {
            if (c.a(bVarArr, bVarArr2)) {
                if (!c.a(this.a, bVarArr)) {
                    this.a = c.a(bVarArr);
                }
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    this.a[i2].a(bVarArr[i2], bVarArr2[i2], f2);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.f2634j);
        int i2 = 0;
        TypedValue b2 = g.b(a2, xmlPullParser, "value", 0);
        if ((b2 != null) && a(b2.type)) {
            i2 = 3;
        }
        a2.recycle();
        return i2;
    }

    private static int a(TypedArray typedArray, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i4 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 == null) {
            z = false;
        }
        return ((!z2 || !a(i4)) && (!z || !a(z ? peekValue2.type : 0))) ? 0 : 3;
    }

    public static Animator a(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i2) : a(context, context.getResources(), context.getTheme(), i2);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i2) {
        return a(context, resources, theme, i2, 1.0f);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i2, float f2) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i2);
            Animator a2 = a(context, resources, theme, xmlResourceParser, f2);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a2;
        } catch (XmlPullParserException e2) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (IOException e3) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
            notFoundException2.initCause(e3);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) {
        return a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
        // Method dump skipped, instructions count: 263
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe a(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    private static Keyframe a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i2, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.f2634j);
        float a3 = g.a(a2, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b2 = g.b(a2, xmlPullParser, "value", 0);
        boolean z = b2 != null;
        if (i2 == 4) {
            i2 = (!z || !a(b2.type)) ? 0 : 3;
        }
        Keyframe ofInt = z ? i2 != 0 ? (i2 == 1 || i2 == 3) ? Keyframe.ofInt(a3, g.b(a2, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(a3, g.a(a2, xmlPullParser, "value", 0, 0.0f)) : i2 == 0 ? Keyframe.ofFloat(a3) : Keyframe.ofInt(a3);
        int c2 = g.c(a2, xmlPullParser, "interpolator", 1, 0);
        if (c2 > 0) {
            ofInt.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        return ofInt;
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((!z || !a(i5)) && (!z2 || !a(i6))) ? 0 : 3;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            c.b[] a2 = c.a(string);
            c.b[] a3 = c.a(string2);
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 != null) {
                a aVar = new a();
                if (a3 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, a2);
                } else if (c.a(a2, a3)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, a2, a3);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (a3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), a3);
            }
        } else {
            f a4 = i2 == 3 ? f.a() : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : a(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : a(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
            }
            if (propertyValuesHolder3 == null || a4 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a4);
            return propertyValuesHolder3;
        }
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray a2 = g.a(resources, theme, attributeSet, a.f2631g);
        TypedArray a3 = g.a(resources, theme, attributeSet, a.f2635k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f2, xmlPullParser);
        int c2 = g.c(a2, xmlPullParser, "interpolator", 0, 0);
        if (c2 > 0) {
            valueAnimator.setInterpolator(d.a(context, c2));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int i2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a2 = g.a(typedArray, xmlPullParser, "pathData", 1);
        if (a2 != null) {
            String a3 = g.a(typedArray, xmlPullParser, "propertyXName", 2);
            String a4 = g.a(typedArray, xmlPullParser, "propertyYName", 3);
            if (i2 != 2) {
            }
            if (a3 == null && a4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            a(c.b(a2), objectAnimator, f2 * 0.5f, a3, a4);
            return;
        }
        objectAnimator.setPropertyName(g.a(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long b2 = (long) g.b(typedArray, xmlPullParser, "duration", 1, 300);
        long b3 = (long) g.b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b4 = g.b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (g.a(xmlPullParser, "valueFrom") && g.a(xmlPullParser, "valueTo")) {
            if (b4 == 4) {
                b4 = a(typedArray, 5, 6);
            }
            PropertyValuesHolder a2 = a(typedArray, b4, 5, 6, "");
            if (a2 != null) {
                valueAnimator.setValues(a2);
            }
        }
        valueAnimator.setDuration(b2);
        valueAnimator.setStartDelay(b3);
        valueAnimator.setRepeatCount(g.b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(g.b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            a(valueAnimator, typedArray2, b4, f2, xmlPullParser);
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i2 = 0;
        float f5 = 0.0f;
        int i3 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f5 += f4;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f5 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }

    private static void a(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((float) ((i3 - i2) + 2));
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static boolean a(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: c.u.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}
