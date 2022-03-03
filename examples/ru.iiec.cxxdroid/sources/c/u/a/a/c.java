package c.u.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import c.h.d.d.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends h implements b {

    /* renamed from: c  reason: collision with root package name */
    private b f2637c;

    /* renamed from: d  reason: collision with root package name */
    private Context f2638d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f2639e;

    /* renamed from: f  reason: collision with root package name */
    final Drawable.Callback f2640f;

    class a implements Drawable.Callback {
        a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            c.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends Drawable.ConstantState {
        int a;

        /* renamed from: b  reason: collision with root package name */
        i f2642b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f2643c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f2644d;

        /* renamed from: e  reason: collision with root package name */
        c.e.a<Animator, String> f2645e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                i iVar = bVar.f2642b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    this.f2642b = (i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    i iVar2 = this.f2642b;
                    iVar2.mutate();
                    this.f2642b = iVar2;
                    this.f2642b.setCallback(callback);
                    this.f2642b.setBounds(bVar.f2642b.getBounds());
                    this.f2642b.a(false);
                }
                ArrayList<Animator> arrayList = bVar.f2644d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2644d = new ArrayList<>(size);
                    this.f2645e = new c.e.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f2644d.get(i2);
                        Animator clone = animator.clone();
                        String str = bVar.f2645e.get(animator);
                        clone.setTarget(this.f2642b.a(str));
                        this.f2644d.add(clone);
                        this.f2645e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2643c == null) {
                this.f2643c = new AnimatorSet();
            }
            this.f2643c.playTogether(this.f2644d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: c.u.a.a.c$c  reason: collision with other inner class name */
    private static class C0065c extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public C0065c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c();
            cVar.f2647b = this.a.newDrawable();
            cVar.f2647b.setCallback(cVar.f2640f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            cVar.f2647b = this.a.newDrawable(resources);
            cVar.f2647b.setCallback(cVar.f2640f);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            cVar.f2647b = this.a.newDrawable(resources, theme);
            cVar.f2647b.setCallback(cVar.f2640f);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, b bVar, Resources resources) {
        this.f2639e = null;
        this.f2640f = new a();
        this.f2638d = context;
        if (bVar != null) {
            this.f2637c = bVar;
        } else {
            this.f2637c = new b(context, bVar, this.f2640f, resources);
        }
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                a(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f2639e == null) {
                    this.f2639e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f2639e);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f2637c.f2642b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        b bVar = this.f2637c;
        if (bVar.f2644d == null) {
            bVar.f2644d = new ArrayList<>();
            this.f2637c.f2645e = new c.e.a<>();
        }
        this.f2637c.f2644d.add(animator);
        this.f2637c.f2645e.put(animator, str);
    }

    @Override // c.u.a.a.h
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2637c.f2642b.draw(canvas);
        if (this.f2637c.f2643c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2637c.f2642b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2637c.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2637c.f2642b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f2647b;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0065c(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2637c.f2642b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2637c.f2642b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.getOpacity() : this.f2637c.f2642b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = g.a(resources, theme, attributeSet, a.f2629e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i a2 = i.a(resources, resourceId, theme);
                        a2.a(false);
                        a2.setCallback(this.f2640f);
                        i iVar = this.f2637c.f2642b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f2637c.f2642b = a2;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, a.f2630f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2638d;
                        if (context != null) {
                            a(string, e.a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2637c.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2647b;
        return drawable != null ? androidx.core.graphics.drawable.a.f(drawable) : this.f2637c.f2642b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f2647b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2637c.f2643c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.isStateful() : this.f2637c.f2642b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2637c.f2642b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // c.u.a.a.h
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.setLevel(i2) : this.f2637c.f2642b.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2647b;
        return drawable != null ? drawable.setState(iArr) : this.f2637c.f2642b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f2637c.f2642b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.f2637c.f2642b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2637c.f2642b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        } else {
            this.f2637c.f2642b.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        } else {
            this.f2637c.f2642b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
        } else {
            this.f2637c.f2642b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2637c.f2642b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f2637c.f2643c.isStarted()) {
            this.f2637c.f2643c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f2647b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2637c.f2643c.end();
        }
    }
}
