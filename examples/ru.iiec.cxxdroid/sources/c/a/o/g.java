package c.a.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.w0;
import c.h.l.d;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f1842e = {Context.class};

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f1843f = f1842e;
    final Object[] a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f1844b = this.a;

    /* renamed from: c  reason: collision with root package name */
    Context f1845c;

    /* renamed from: d  reason: collision with root package name */
    private Object f1846d;

    /* access modifiers changed from: private */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f1847c = {MenuItem.class};
        private Object a;

        /* renamed from: b  reason: collision with root package name */
        private Method f1848b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1848b = cls.getMethod(str, f1847c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1848b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1848b.invoke(this.a, menuItem)).booleanValue();
                }
                this.f1848b.invoke(this.a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b {
        d A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;

        /* renamed from: b  reason: collision with root package name */
        private int f1849b;

        /* renamed from: c  reason: collision with root package name */
        private int f1850c;

        /* renamed from: d  reason: collision with root package name */
        private int f1851d;

        /* renamed from: e  reason: collision with root package name */
        private int f1852e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1853f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1854g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1855h;

        /* renamed from: i  reason: collision with root package name */
        private int f1856i;

        /* renamed from: j  reason: collision with root package name */
        private int f1857j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f1858k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f1859l;

        /* renamed from: m  reason: collision with root package name */
        private int f1860m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            d();
        }

        private char a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f1845c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1859l).setIcon(this.f1860m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!g.this.f1845c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.a(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).c(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).a(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, g.f1842e, g.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            d dVar = this.A;
            if (dVar != null) {
                c.h.l.k.a(menuItem, dVar);
            }
            c.h.l.k.a(menuItem, this.B);
            c.h.l.k.b(menuItem, this.C);
            c.h.l.k.a(menuItem, this.n, this.o);
            c.h.l.k.b(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                c.h.l.k.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                c.h.l.k.a(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1855h = true;
            a(this.a.add(this.f1849b, this.f1856i, this.f1857j, this.f1858k));
        }

        public void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f1845c.obtainStyledAttributes(attributeSet, c.a.j.MenuGroup);
            this.f1849b = obtainStyledAttributes.getResourceId(c.a.j.MenuGroup_android_id, 0);
            this.f1850c = obtainStyledAttributes.getInt(c.a.j.MenuGroup_android_menuCategory, 0);
            this.f1851d = obtainStyledAttributes.getInt(c.a.j.MenuGroup_android_orderInCategory, 0);
            this.f1852e = obtainStyledAttributes.getInt(c.a.j.MenuGroup_android_checkableBehavior, 0);
            this.f1853f = obtainStyledAttributes.getBoolean(c.a.j.MenuGroup_android_visible, true);
            this.f1854g = obtainStyledAttributes.getBoolean(c.a.j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public SubMenu b() {
            this.f1855h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.f1849b, this.f1856i, this.f1857j, this.f1858k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v64, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        public void b(AttributeSet attributeSet) {
            w0 a2 = w0.a(g.this.f1845c, attributeSet, c.a.j.MenuItem);
            this.f1856i = a2.g(c.a.j.MenuItem_android_id, 0);
            this.f1857j = (a2.d(c.a.j.MenuItem_android_menuCategory, this.f1850c) & -65536) | (a2.d(c.a.j.MenuItem_android_orderInCategory, this.f1851d) & 65535);
            this.f1858k = a2.e(c.a.j.MenuItem_android_title);
            this.f1859l = a2.e(c.a.j.MenuItem_android_titleCondensed);
            this.f1860m = a2.g(c.a.j.MenuItem_android_icon, 0);
            this.n = a(a2.d(c.a.j.MenuItem_android_alphabeticShortcut));
            this.o = a2.d(c.a.j.MenuItem_alphabeticModifiers, 4096);
            this.p = a(a2.d(c.a.j.MenuItem_android_numericShortcut));
            this.q = a2.d(c.a.j.MenuItem_numericModifiers, 4096);
            this.r = a2.g(c.a.j.MenuItem_android_checkable) ? a2.a(c.a.j.MenuItem_android_checkable, false) : this.f1852e ? 1 : 0;
            this.s = a2.a(c.a.j.MenuItem_android_checked, false);
            this.t = a2.a(c.a.j.MenuItem_android_visible, this.f1853f);
            this.u = a2.a(c.a.j.MenuItem_android_enabled, this.f1854g);
            this.v = a2.d(c.a.j.MenuItem_showAsAction, -1);
            this.z = a2.d(c.a.j.MenuItem_android_onClick);
            this.w = a2.g(c.a.j.MenuItem_actionLayout, 0);
            this.x = a2.d(c.a.j.MenuItem_actionViewClass);
            this.y = a2.d(c.a.j.MenuItem_actionProviderClass);
            boolean z2 = this.y != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (d) a(this.y, g.f1843f, g.this.f1844b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = a2.e(c.a.j.MenuItem_contentDescription);
            this.C = a2.e(c.a.j.MenuItem_tooltipText);
            if (a2.g(c.a.j.MenuItem_iconTintMode)) {
                this.E = d0.a(a2.d(c.a.j.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (a2.g(c.a.j.MenuItem_iconTint)) {
                this.D = a2.a(c.a.j.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            a2.b();
            this.f1855h = false;
        }

        public boolean c() {
            return this.f1855h;
        }

        public void d() {
            this.f1849b = 0;
            this.f1850c = 0;
            this.f1851d = 0;
            this.f1852e = 0;
            this.f1853f = true;
            this.f1854g = true;
        }
    }

    public g(Context context) {
        super(context);
        this.f1845c = context;
        this.a = new Object[]{context};
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        int i2 = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.d();
                        } else if (name2.equals("item")) {
                            if (!bVar.c()) {
                                d dVar = bVar.A;
                                if (dVar == null || !dVar.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.a(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.b(attributeSet);
                    } else if (name3.equals("menu")) {
                        a(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                i2 = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object a() {
        if (this.f1846d == null) {
            this.f1846d = a(this.f1845c);
        }
        return this.f1846d;
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof c.h.f.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1845c.getResources().getLayout(i2);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
