package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    private final ConstraintLayout a;

    /* renamed from: b  reason: collision with root package name */
    e f874b;

    /* renamed from: c  reason: collision with root package name */
    int f875c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f876d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f877e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<e> f878f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    private g f879g = null;

    /* access modifiers changed from: package-private */
    public static class a {
        int a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f880b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f881c = -1;

        /* renamed from: d  reason: collision with root package name */
        e f882d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.State_android_id) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == k.State_constraints) {
                    this.f881c = obtainStyledAttributes.getResourceId(index, this.f881c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f881c);
                    context.getResources().getResourceName(this.f881c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f882d = new e();
                        this.f882d.a(context, this.f881c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f2, float f3) {
            for (int i2 = 0; i2 < this.f880b.size(); i2++) {
                if (this.f880b.get(i2).a(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f880b.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        float a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f883b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        float f884c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        float f885d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        int f886e = -1;

        /* renamed from: f  reason: collision with root package name */
        e f887f;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.Variant_constraints) {
                    this.f886e = obtainStyledAttributes.getResourceId(index, this.f886e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f886e);
                    context.getResources().getResourceName(this.f886e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f887f = new e();
                        this.f887f.a(context, this.f886e);
                    }
                } else if (index == k.Variant_region_heightLessThan) {
                    this.f885d = obtainStyledAttributes.getDimension(index, this.f885d);
                } else if (index == k.Variant_region_heightMoreThan) {
                    this.f883b = obtainStyledAttributes.getDimension(index, this.f883b);
                } else if (index == k.Variant_region_widthLessThan) {
                    this.f884c = obtainStyledAttributes.getDimension(index, this.f884c);
                } else if (index == k.Variant_region_widthMoreThan) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public boolean a(float f2, float f3) {
            if (!Float.isNaN(this.a) && f2 < this.a) {
                return false;
            }
            if (!Float.isNaN(this.f883b) && f3 < this.f883b) {
                return false;
            }
            if (Float.isNaN(this.f884c) || f2 <= this.f884c) {
                return Float.isNaN(this.f885d) || f3 <= this.f885d;
            }
            return false;
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i2) {
        this.a = constraintLayout;
        a(context, i2);
    }

    private void a(Context context, int i2) {
        char c2;
        XmlResourceParser xml = context.getResources().getXml(i2);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (!(c2 == 0 || c2 == 1)) {
                        if (c2 == 2) {
                            aVar = new a(context, xml);
                            this.f877e.put(aVar.a, aVar);
                        } else if (c2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c2 == 4) {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.a(context, xmlPullParser);
                this.f878f.put(identifier, eVar);
                return;
            }
        }
    }

    public void a(int i2, float f2, float f3) {
        int a2;
        int i3 = this.f875c;
        if (i3 == i2) {
            a valueAt = i2 == -1 ? this.f877e.valueAt(0) : this.f877e.get(i3);
            int i4 = this.f876d;
            if ((i4 == -1 || !valueAt.f880b.get(i4).a(f2, f3)) && this.f876d != (a2 = valueAt.a(f2, f3))) {
                e eVar = a2 == -1 ? this.f874b : valueAt.f880b.get(a2).f887f;
                int i5 = a2 == -1 ? valueAt.f881c : valueAt.f880b.get(a2).f886e;
                if (eVar != null) {
                    this.f876d = a2;
                    g gVar = this.f879g;
                    if (gVar != null) {
                        gVar.b(-1, i5);
                    }
                    eVar.a(this.a);
                    g gVar2 = this.f879g;
                    if (gVar2 != null) {
                        gVar2.a(-1, i5);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f875c = i2;
        a aVar = this.f877e.get(this.f875c);
        int a3 = aVar.a(f2, f3);
        e eVar2 = a3 == -1 ? aVar.f882d : aVar.f880b.get(a3).f887f;
        int i6 = a3 == -1 ? aVar.f881c : aVar.f880b.get(a3).f886e;
        if (eVar2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f3);
            return;
        }
        this.f876d = a3;
        g gVar3 = this.f879g;
        if (gVar3 != null) {
            gVar3.b(i2, i6);
        }
        eVar2.a(this.a);
        g gVar4 = this.f879g;
        if (gVar4 != null) {
            gVar4.a(i2, i6);
        }
    }

    public void a(g gVar) {
        this.f879g = gVar;
    }
}
