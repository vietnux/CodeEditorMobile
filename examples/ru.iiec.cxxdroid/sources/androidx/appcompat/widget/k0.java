package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import java.lang.reflect.Method;

public class k0 extends i0 implements j0 {
    private static Method K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
    private j0 J;

    public static class a extends e0 {
        final int p;
        final int q;
        private j0 r;
        private MenuItem s;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.p = 22;
                this.q = 21;
                return;
            }
            this.p = 21;
            this.q = 22;
        }

        @Override // androidx.appcompat.widget.e0
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                f fVar = (f) adapter;
                j jVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    jVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.s;
                if (menuItem != jVar) {
                    g b2 = fVar.b();
                    if (menuItem != null) {
                        this.r.b(b2, menuItem);
                    }
                    this.s = jVar;
                    if (jVar != null) {
                        this.r.a(b2, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.q) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((f) adapter).b().a(false);
                return true;
            }
        }

        public void setHoverListener(j0 j0Var) {
            this.r = j0Var;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.e0
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.i0
    public e0 a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // androidx.appcompat.widget.j0
    public void a(g gVar, MenuItem menuItem) {
        j0 j0Var = this.J;
        if (j0Var != null) {
            j0Var.a(gVar, menuItem);
        }
    }

    public void a(j0 j0Var) {
        this.J = j0Var;
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setEnterTransition((Transition) obj);
        }
    }

    @Override // androidx.appcompat.widget.j0
    public void b(g gVar, MenuItem menuItem) {
        j0 j0Var = this.J;
        if (j0Var != null) {
            j0Var.b(gVar, menuItem);
        }
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.F.setExitTransition((Transition) obj);
        }
    }

    public void c(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.F, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.F.setTouchModal(z);
        }
    }
}
