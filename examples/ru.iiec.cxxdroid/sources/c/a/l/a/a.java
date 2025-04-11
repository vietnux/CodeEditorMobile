package c.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import c.a.l.a.b;
import c.a.l.a.e;
import c.e.h;
import c.u.a.a.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends e implements androidx.core.graphics.drawable.b {
    private c p;
    private g q;
    private int r;
    private int s;
    private boolean t;

    /* access modifiers changed from: private */
    public static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // c.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.a.l.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends e.a {
        c.e.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new c.e.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long f(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        /* access modifiers changed from: package-private */
        public int a(int i2, int i3, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long f2 = f(i2, i3);
            long j2 = z ? 8589934592L : 0;
            long j3 = (long) a;
            this.K.a(f2, Long.valueOf(j3 | j2));
            if (z) {
                this.K.a(f(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        public int a(int[] iArr, Drawable drawable, int i2) {
            int a = super.a(iArr, drawable);
            this.L.c(a, Integer.valueOf(i2));
            return a;
        }

        /* access modifiers changed from: package-private */
        public int b(int[] iArr) {
            int a = super.a(iArr);
            return a >= 0 ? a : super.a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: package-private */
        public int c(int i2, int i3) {
            return (int) this.K.b(f(i2, i3), -1L).longValue();
        }

        /* access modifiers changed from: package-private */
        public int d(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.b(i2, 0).intValue();
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i2, int i3) {
            return (this.K.b(f(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean e(int i2, int i3) {
            return (this.K.b(f(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: package-private */
        @Override // c.a.l.a.e.a, c.a.l.a.b.d
        public void m() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // c.a.l.a.e.a
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // c.a.l.a.e.a
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* access modifiers changed from: private */
    public static class d extends g {
        private final c.u.a.a.c a;

        d(c.u.a.a.c cVar) {
            super();
            this.a = cVar;
        }

        @Override // c.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.a.l.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: private */
    public static class e extends g {
        private final ObjectAnimator a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1783b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.f1783b = z2;
            this.a = ofInt;
        }

        @Override // c.a.l.a.a.g
        public boolean a() {
            return this.f1783b;
        }

        @Override // c.a.l.a.a.g
        public void b() {
            this.a.reverse();
        }

        @Override // c.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // c.a.l.a.a.g
        public void d() {
            this.a.cancel();
        }
    }

    private static class f implements TimeInterpolator {
        private int[] a;

        /* renamed from: b  reason: collision with root package name */
        private int f1784b;

        /* renamed from: c  reason: collision with root package name */
        private int f1785c;

        f(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f1785c;
        }

        /* access modifiers changed from: package-private */
        public int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1784b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f1785c = i2;
            return i2;
        }

        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * ((float) this.f1785c)) + 0.5f);
            int i3 = this.f1784b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.f1785c) : 0.0f);
        }
    }

    /* access modifiers changed from: private */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        a(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    private void a(TypedArray typedArray) {
        c cVar = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f1802d |= typedArray.getChangingConfigurations();
        }
        cVar.b(typedArray.getBoolean(c.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f1807i));
        cVar.a(typedArray.getBoolean(c.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f1810l));
        cVar.b(typedArray.getInt(c.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.c(typedArray.getInt(c.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(c.a.m.b.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    public static a b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private boolean b(int i2) {
        int i3;
        int c2;
        g gVar;
        g gVar2 = this.q;
        if (gVar2 == null) {
            i3 = b();
        } else if (i2 == this.r) {
            return true;
        } else {
            if (i2 != this.s || !gVar2.a()) {
                i3 = this.r;
                gVar2.d();
            } else {
                gVar2.b();
                this.r = this.s;
                this.s = i2;
                return true;
            }
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        c cVar = this.p;
        int d2 = cVar.d(i3);
        int d3 = cVar.d(i2);
        if (d3 == 0 || d2 == 0 || (c2 = cVar.c(d2, d3)) < 0) {
            return false;
        }
        boolean e2 = cVar.e(d2, d3);
        a(c2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.d(d2, d3), e2);
        } else if (current instanceof c.u.a.a.c) {
            gVar = new d((c.u.a.a.c) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.q = gVar;
        this.s = i3;
        this.r = i2;
        return true;
    }

    private void c() {
        onStateChange(getState());
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = c.h.d.d.g.a(resources, theme, attributeSet, c.a.m.b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(c.a.m.b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(c.a.m.b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? m0.a().a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = a(attributeSet);
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("vector") ? i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a2 != null) {
            return this.p.a(a3, a2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray a = c.h.d.d.g.a(resources, theme, attributeSet, c.a.m.b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(c.a.m.b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(c.a.m.b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(c.a.m.b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? m0.a().a(context, resourceId3) : null;
        boolean z = a.getBoolean(c.a.m.b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                a2 = xmlPullParser.getName().equals("animated-vector") ? c.u.a.a.c.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (a2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.p.a(resourceId, resourceId2, a2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // c.a.l.a.b, c.a.l.a.e, c.a.l.a.e
    public c a() {
        return new c(this.p, this, null);
    }

    public void a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray a = c.h.d.d.g.a(resources, theme, attributeSet, c.a.m.b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(c.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(a);
        a(resources);
        a.recycle();
        c(context, resources, xmlPullParser, attributeSet, theme);
        c();
    }

    /* access modifiers changed from: package-private */
    @Override // c.a.l.a.b, c.a.l.a.e
    public void a(b.d dVar) {
        super.a(dVar);
        if (dVar instanceof c) {
            this.p = (c) dVar;
        }
    }

    @Override // c.a.l.a.e
    public boolean isStateful() {
        return true;
    }

    @Override // c.a.l.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // c.a.l.a.b, c.a.l.a.e
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.m();
                this.t = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.l.a.b, c.a.l.a.e
    public boolean onStateChange(int[] iArr) {
        int b2 = this.p.b(iArr);
        boolean z = b2 != b() && (b(b2) || a(b2));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // c.a.l.a.b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
