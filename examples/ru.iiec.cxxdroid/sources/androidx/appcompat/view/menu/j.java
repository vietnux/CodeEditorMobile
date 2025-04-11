package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o;
import c.a.h;
import c.h.f.a.b;
import c.h.l.d;

public final class j implements b {
    private View A;
    private d B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f367b;

    /* renamed from: c  reason: collision with root package name */
    private final int f368c;

    /* renamed from: d  reason: collision with root package name */
    private final int f369d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f370e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f371f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f372g;

    /* renamed from: h  reason: collision with root package name */
    private char f373h;

    /* renamed from: i  reason: collision with root package name */
    private int f374i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f375j;

    /* renamed from: k  reason: collision with root package name */
    private int f376k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f377l;

    /* renamed from: m  reason: collision with root package name */
    private int f378m = 0;
    g n;
    private s o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    class a implements d.b {
        a() {
        }

        @Override // c.h.l.d.b
        public void onActionProviderVisibilityChanged(boolean z) {
            j jVar = j.this;
            jVar.n.d(jVar);
        }
    }

    j(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = gVar;
        this.a = i3;
        this.f367b = i2;
        this.f368c = i4;
        this.f369d = i5;
        this.f370e = charSequence;
        this.z = i6;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.a(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.a(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    private static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // c.h.f.a.b
    public b a(d dVar) {
        d dVar2 = this.B;
        if (dVar2 != null) {
            dVar2.f();
        }
        this.A = null;
        this.B = dVar;
        this.n.b(true);
        d dVar3 = this.B;
        if (dVar3 != null) {
            dVar3.a(new a());
        }
        return this;
    }

    @Override // c.h.f.a.b
    public d a() {
        return this.B;
    }

    /* access modifiers changed from: package-private */
    public CharSequence a(o.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    /* access modifiers changed from: package-private */
    public void a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public void a(s sVar) {
        this.o = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    public void a(boolean z2) {
        this.D = z2;
        this.n.b(false);
    }

    public void b() {
        this.n.c(this);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        int i2 = this.y;
        this.y = (z2 ? 2 : 0) | (i2 & -3);
        if (i2 != this.y) {
            this.n.b(false);
        }
    }

    public int c() {
        return this.f369d;
    }

    public void c(boolean z2) {
        this.y = (z2 ? 4 : 0) | (this.y & -5);
    }

    @Override // c.h.f.a.b
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.a(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public char d() {
        return this.n.p() ? this.f375j : this.f373h;
    }

    public void d(boolean z2) {
        this.y = z2 ? this.y | 32 : this.y & -33;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        int i2;
        char d2 = d();
        if (d2 == 0) {
            return "";
        }
        Resources resources = this.n.e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.abc_prepend_shortcut_label));
        }
        int i3 = this.n.p() ? this.f376k : this.f374i;
        a(sb, i3, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        a(sb, i3, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
        a(sb, i3, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        a(sb, i3, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        a(sb, i3, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        a(sb, i3, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (d2 == '\b') {
            i2 = h.abc_menu_delete_shortcut_label;
        } else if (d2 == '\n') {
            i2 = h.abc_menu_enter_shortcut_label;
        } else if (d2 != ' ') {
            sb.append(d2);
            return sb.toString();
        } else {
            i2 = h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean e(boolean z2) {
        int i2 = this.y;
        this.y = (z2 ? 0 : 8) | (i2 & -9);
        return i2 != this.y;
    }

    @Override // c.h.f.a.b
    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.b(this);
        }
        return false;
    }

    public boolean f() {
        d dVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (dVar = this.B) != null) {
            this.A = dVar.a(this);
        }
        return this.A != null;
    }

    public boolean g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.a(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f372g != null) {
            try {
                this.n.e().startActivity(this.f372g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        d dVar = this.B;
        return dVar != null && dVar.d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c.h.f.a.b
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        d dVar = this.B;
        if (dVar == null) {
            return null;
        }
        this.A = dVar.a(this);
        return this.A;
    }

    @Override // c.h.f.a.b
    public int getAlphabeticModifiers() {
        return this.f376k;
    }

    public char getAlphabeticShortcut() {
        return this.f375j;
    }

    @Override // c.h.f.a.b
    public CharSequence getContentDescription() {
        return this.r;
    }

    public int getGroupId() {
        return this.f367b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f377l;
        if (drawable != null) {
            return a(drawable);
        }
        if (this.f378m == 0) {
            return null;
        }
        Drawable c2 = c.a.k.a.a.c(this.n.e(), this.f378m);
        this.f378m = 0;
        this.f377l = c2;
        return a(c2);
    }

    @Override // c.h.f.a.b
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // c.h.f.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.f372g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // c.h.f.a.b
    public int getNumericModifiers() {
        return this.f374i;
    }

    public char getNumericShortcut() {
        return this.f373h;
    }

    public int getOrder() {
        return this.f368c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f370e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f371f;
        if (charSequence == null) {
            charSequence = this.f370e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // c.h.f.a.b
    public CharSequence getTooltipText() {
        return this.s;
    }

    public boolean h() {
        return (this.y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    public boolean i() {
        return (this.y & 4) != 0;
    }

    @Override // c.h.f.a.b
    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public boolean isVisible() {
        d dVar = this.B;
        return (dVar == null || !dVar.e()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        return (this.z & 1) == 1;
    }

    public boolean k() {
        return (this.z & 2) == 2;
    }

    public boolean l() {
        return this.n.k();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.n.q() && d() != 0;
    }

    public boolean n() {
        return (this.z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // c.h.f.a.b, android.view.MenuItem
    public b setActionView(int i2) {
        Context e2 = this.n.e();
        setActionView(LayoutInflater.from(e2).inflate(i2, (ViewGroup) new LinearLayout(e2), false));
        return this;
    }

    @Override // c.h.f.a.b, android.view.MenuItem
    public b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f375j == c2) {
            return this;
        }
        this.f375j = Character.toLowerCase(c2);
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f375j == c2 && this.f376k == i2) {
            return this;
        }
        this.f375j = Character.toLowerCase(c2);
        this.f376k = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.y;
        this.y = (z2 ? 1 : 0) | (i2 & -2);
        if (i2 != this.y) {
            this.n.b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.y & 4) != 0) {
            this.n.a((MenuItem) this);
        } else {
            b(z2);
        }
        return this;
    }

    @Override // c.h.f.a.b
    public b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.y = z2 ? this.y | 16 : this.y & -17;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f377l = null;
        this.f378m = i2;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f378m = 0;
        this.f377l = drawable;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f372g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f373h == c2) {
            return this;
        }
        this.f373h = c2;
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f373h == c2 && this.f374i == i2) {
            return this;
        }
        this.f373h = c2;
        this.f374i = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f373h = c2;
        this.f375j = Character.toLowerCase(c3);
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f373h = c2;
        this.f374i = KeyEvent.normalizeMetaState(i2);
        this.f375j = Character.toLowerCase(c3);
        this.f376k = KeyEvent.normalizeMetaState(i3);
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.n.c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // c.h.f.a.b
    public b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.e().getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f370e = charSequence;
        this.n.b(false);
        s sVar = this.o;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f371f = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // c.h.f.a.b
    public b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.b(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (e(z2)) {
            this.n.d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f370e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
