package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {
    private boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    String f849b;

    /* renamed from: c  reason: collision with root package name */
    private EnumC0012b f850c;

    /* renamed from: d  reason: collision with root package name */
    private int f851d;

    /* renamed from: e  reason: collision with root package name */
    private float f852e;

    /* renamed from: f  reason: collision with root package name */
    private String f853f;

    /* renamed from: g  reason: collision with root package name */
    boolean f854g;

    /* renamed from: h  reason: collision with root package name */
    private int f855h;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a = new int[EnumC0012b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.widget.b$b[] r0 = androidx.constraintlayout.widget.b.EnumC0012b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.b.a.a = r0
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.REFERENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = androidx.constraintlayout.widget.b.a.a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.b.EnumC0012b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public enum EnumC0012b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(b bVar, Object obj) {
        this.f849b = bVar.f849b;
        this.f850c = bVar.f850c;
        a(obj);
    }

    public b(String str, EnumC0012b bVar, Object obj, boolean z) {
        this.f849b = str;
        this.f850c = bVar;
        this.a = z;
        a(obj);
    }

    private static int a(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        EnumC0012b bVar;
        int resourceId;
        Object string;
        float f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0012b bVar2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == k.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == k.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = EnumC0012b.BOOLEAN_TYPE;
            } else {
                if (index == k.CustomAttribute_customColorValue) {
                    bVar = EnumC0012b.COLOR_TYPE;
                } else if (index == k.CustomAttribute_customColorDrawableValue) {
                    bVar = EnumC0012b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == k.CustomAttribute_customPixelDimension) {
                        bVar = EnumC0012b.DIMENSION_TYPE;
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == k.CustomAttribute_customDimension) {
                        bVar = EnumC0012b.DIMENSION_TYPE;
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == k.CustomAttribute_customFloatValue) {
                        bVar = EnumC0012b.FLOAT_TYPE;
                        f2 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == k.CustomAttribute_customIntegerValue) {
                            bVar = EnumC0012b.INT_TYPE;
                            resourceId = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == k.CustomAttribute_customStringValue) {
                            bVar = EnumC0012b.STRING_TYPE;
                            string = obtainStyledAttributes.getString(index);
                            bVar2 = bVar;
                            obj = string;
                        } else if (index == k.CustomAttribute_customReference) {
                            bVar = EnumC0012b.REFERENCE_TYPE;
                            resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        bVar2 = bVar;
                        obj = string;
                    }
                    string = Float.valueOf(f2);
                    bVar2 = bVar;
                    obj = string;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                bVar2 = bVar;
                obj = string;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new b(str, bVar2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void a(View view, HashMap<String, b> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            String str2 = !bVar.a ? "set" + str : str;
            try {
                switch (a.a[bVar.f850c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f851d));
                        continue;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f854g));
                        continue;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f853f);
                        continue;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f855h));
                        continue;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f855h);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f851d));
                        continue;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f852e));
                        continue;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f852e));
                        continue;
                    default:
                        continue;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public void a(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f849b;
        try {
            switch (a.a[this.f850c.ordinal()]) {
                case 2:
                    boolean z = true;
                    Method method = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method.invoke(view, objArr);
                    return;
                case 3:
                    throw new RuntimeException("unable to interpolate strings " + this.f849b);
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    Method method2 = cls.getMethod(str, Drawable.class);
                    int a2 = a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a3 = a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a2 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a3 << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method2.invoke(view, colorDrawable);
                    return;
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e2) {
            Log.e("TransitionLayout", "no method " + str + " on View \"" + c.f.b.b.b.a(view) + "\"");
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            Log.e("TransitionLayout", "cannot access method " + str + " on View \"" + c.f.b.b.b.a(view) + "\"");
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    public void a(Object obj) {
        switch (a.a[this.f850c.ordinal()]) {
            case 1:
            case 6:
                this.f851d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f854g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f853f = (String) obj;
                return;
            case 4:
            case 5:
                this.f855h = ((Integer) obj).intValue();
                return;
            case 7:
            case 8:
                this.f852e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
