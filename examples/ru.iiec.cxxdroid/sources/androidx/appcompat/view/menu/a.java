package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.h.f.a.b;
import c.h.l.d;

public class a implements b {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f290b;

    /* renamed from: c  reason: collision with root package name */
    private final int f291c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f292d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f293e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f294f;

    /* renamed from: g  reason: collision with root package name */
    private char f295g;

    /* renamed from: h  reason: collision with root package name */
    private int f296h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f297i;

    /* renamed from: j  reason: collision with root package name */
    private int f298j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f299k;

    /* renamed from: l  reason: collision with root package name */
    private Context f300l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f301m;
    private CharSequence n;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f300l = context;
        this.a = i3;
        this.f290b = i2;
        this.f291c = i5;
        this.f292d = charSequence;
    }

    private void b() {
        if (this.f299k == null) {
            return;
        }
        if (this.q || this.r) {
            this.f299k = androidx.core.graphics.drawable.a.i(this.f299k);
            this.f299k = this.f299k.mutate();
            if (this.q) {
                androidx.core.graphics.drawable.a.a(this.f299k, this.o);
            }
            if (this.r) {
                androidx.core.graphics.drawable.a.a(this.f299k, this.p);
            }
        }
    }

    @Override // c.h.f.a.b
    public b a(d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.f.a.b
    public d a() {
        return null;
    }

    @Override // c.h.f.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // c.h.f.a.b
    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.f.a.b
    public View getActionView() {
        return null;
    }

    @Override // c.h.f.a.b
    public int getAlphabeticModifiers() {
        return this.f298j;
    }

    public char getAlphabeticShortcut() {
        return this.f297i;
    }

    @Override // c.h.f.a.b
    public CharSequence getContentDescription() {
        return this.f301m;
    }

    public int getGroupId() {
        return this.f290b;
    }

    public Drawable getIcon() {
        return this.f299k;
    }

    @Override // c.h.f.a.b
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // c.h.f.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f294f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c.h.f.a.b
    public int getNumericModifiers() {
        return this.f296h;
    }

    public char getNumericShortcut() {
        return this.f295g;
    }

    public int getOrder() {
        return this.f291c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f292d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f293e;
        return charSequence != null ? charSequence : this.f292d;
    }

    @Override // c.h.f.a.b
    public CharSequence getTooltipText() {
        return this.n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // c.h.f.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.f.a.b, android.view.MenuItem
    public b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.f.a.b, android.view.MenuItem
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f297i = Character.toLowerCase(c2);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f297i = Character.toLowerCase(c2);
        this.f298j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    @Override // c.h.f.a.b
    public b setContentDescription(CharSequence charSequence) {
        this.f301m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f299k = c.h.d.a.c(this.f300l, i2);
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f299k = drawable;
        b();
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        b();
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f294f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f295g = c2;
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f295g = c2;
        this.f296h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f295g = c2;
        this.f297i = Character.toLowerCase(c3);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f295g = c2;
        this.f296h = KeyEvent.normalizeMetaState(i2);
        this.f297i = Character.toLowerCase(c3);
        this.f298j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // c.h.f.a.b
    public void setShowAsAction(int i2) {
    }

    @Override // c.h.f.a.b
    public b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f292d = this.f300l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f292d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f293e = charSequence;
        return this;
    }

    @Override // c.h.f.a.b
    public b setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }
}
