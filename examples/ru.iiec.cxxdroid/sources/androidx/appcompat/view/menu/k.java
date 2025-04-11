package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c.h.l.d;
import java.lang.reflect.Method;

public class k extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final c.h.f.a.b f379d;

    /* renamed from: e  reason: collision with root package name */
    private Method f380e;

    private class a extends c.h.l.d {

        /* renamed from: b  reason: collision with root package name */
        final ActionProvider f381b;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f381b = actionProvider;
        }

        @Override // c.h.l.d
        public void a(SubMenu subMenu) {
            this.f381b.onPrepareSubMenu(k.this.a(subMenu));
        }

        @Override // c.h.l.d
        public boolean a() {
            return this.f381b.hasSubMenu();
        }

        @Override // c.h.l.d
        public View c() {
            return this.f381b.onCreateActionView();
        }

        @Override // c.h.l.d
        public boolean d() {
            return this.f381b.onPerformDefaultAction();
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        private d.b f383d;

        b(k kVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // c.h.l.d
        public View a(MenuItem menuItem) {
            return this.f381b.onCreateActionView(menuItem);
        }

        @Override // c.h.l.d
        public void a(d.b bVar) {
            this.f383d = bVar;
            this.f381b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // c.h.l.d
        public boolean b() {
            return this.f381b.isVisible();
        }

        @Override // c.h.l.d
        public boolean e() {
            return this.f381b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            d.b bVar = this.f383d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class c extends FrameLayout implements c.a.o.c {

        /* renamed from: b  reason: collision with root package name */
        final CollapsibleActionView f384b;

        c(View view) {
            super(view.getContext());
            this.f384b = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f384b;
        }

        @Override // c.a.o.c
        public void b() {
            this.f384b.onActionViewExpanded();
        }

        @Override // c.a.o.c
        public void c() {
            this.f384b.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(k.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(k.this.a(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(k.this.a(menuItem));
        }
    }

    public k(Context context, c.h.f.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f379d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public void a(boolean z) {
        try {
            if (this.f380e == null) {
                this.f380e = this.f379d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f380e.invoke(this.f379d, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean collapseActionView() {
        return this.f379d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f379d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        c.h.l.d a2 = this.f379d.a();
        if (a2 instanceof a) {
            return ((a) a2).f381b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f379d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f379d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f379d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f379d.getContentDescription();
    }

    public int getGroupId() {
        return this.f379d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f379d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f379d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f379d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f379d.getIntent();
    }

    public int getItemId() {
        return this.f379d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f379d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f379d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f379d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f379d.getOrder();
    }

    public SubMenu getSubMenu() {
        return a(this.f379d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f379d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f379d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f379d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f379d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f379d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f379d.isCheckable();
    }

    public boolean isChecked() {
        return this.f379d.isChecked();
    }

    public boolean isEnabled() {
        return this.f379d.isEnabled();
    }

    public boolean isVisible() {
        return this.f379d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        c.h.l.d bVar = Build.VERSION.SDK_INT >= 16 ? new b(this, this.a, actionProvider) : new a(this.a, actionProvider);
        c.h.f.a.b bVar2 = this.f379d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f379d.setActionView(i2);
        View actionView = this.f379d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f379d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f379d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f379d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f379d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f379d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f379d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f379d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f379d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f379d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f379d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f379d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f379d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f379d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f379d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f379d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f379d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f379d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f379d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f379d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f379d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f379d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f379d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f379d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f379d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f379d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f379d.setVisible(z);
    }
}
