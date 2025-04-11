package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class c {
    private static final int[] a = {16843531};

    /* access modifiers changed from: package-private */
    public static class a {
        public Method a;

        /* renamed from: b  reason: collision with root package name */
        public Method f173b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f174c;

        a(Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f173b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (childAt2 instanceof ImageView) {
                            this.f174c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a a(Activity activity, Drawable drawable, int i2) {
        a aVar = new a(activity);
        if (aVar.a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.a.invoke(actionBar, drawable);
                aVar.f173b.invoke(actionBar, Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e2);
            }
        } else {
            ImageView imageView = aVar.f174c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }

    public static a a(a aVar, Activity activity, int i2) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f173b.invoke(actionBar, Integer.valueOf(i2));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return aVar;
    }
}
