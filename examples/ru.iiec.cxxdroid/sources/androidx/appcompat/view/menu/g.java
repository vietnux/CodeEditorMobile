package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import c.h.l.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements c.h.f.a.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f351b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f352c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f353d;

    /* renamed from: e  reason: collision with root package name */
    private a f354e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<j> f355f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<j> f356g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f357h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<j> f358i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f359j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f360k;

    /* renamed from: l  reason: collision with root package name */
    private int f361l = 0;

    /* renamed from: m  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f362m;
    CharSequence n;
    Drawable o;
    View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<j> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> w = new CopyOnWriteArrayList<>();
    private j x;
    private boolean y = false;
    private boolean z;

    public interface a {
        void a(g gVar);

        boolean a(g gVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.a = context;
        this.f351b = context.getResources();
        this.f355f = new ArrayList<>();
        this.f356g = new ArrayList<>();
        this.f357h = true;
        this.f358i = new ArrayList<>();
        this.f359j = new ArrayList<>();
        this.f360k = true;
        e(true);
    }

    private static int a(ArrayList<j> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).c() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    private j a(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new j(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources l2 = l();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.n = l2.getText(i2);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i3 > 0) {
                this.o = c.h.d.a.c(e(), i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        b(false);
    }

    private void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f355f.size()) {
            this.f355f.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    private boolean a(s sVar, n nVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z2 = nVar.a(sVar);
        }
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.w.remove(next);
            } else if (!z2) {
                z2 = nVar2.a(sVar);
            }
        }
        return z2;
    }

    private void d(boolean z2) {
        if (!this.w.isEmpty()) {
            s();
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    nVar.a(z2);
                }
            }
            r();
        }
    }

    private void e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.w.isEmpty()) {
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    int id = nVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        nVar.a(parcelable);
                    }
                }
            }
        }
    }

    private void e(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.f351b.getConfiguration().keyboard == 1 || !c0.d(ViewConfiguration.get(this.a), this.a)) {
            z3 = false;
        }
        this.f353d = z3;
    }

    private static int f(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void f(Bundle bundle) {
        Parcelable b2;
        if (!this.w.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    int id = nVar.getId();
                    if (id > 0 && (b2 = nVar.b()) != null) {
                        sparseArray.put(id, b2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public int a(int i2) {
        return a(i2, 0);
    }

    public int a(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f355f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int f2 = f(i4);
        j a2 = a(i2, i3, i4, f2, charSequence, this.f361l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f362m;
        if (contextMenuInfo != null) {
            a2.a(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.f355f;
        arrayList.add(a(arrayList, f2), a2);
        b(true);
        return a2;
    }

    /* access modifiers changed from: protected */
    public g a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public g a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    public g a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: package-private */
    public j a(int i2, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.v;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p2 = p();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = arrayList.get(i3);
            char alphabeticShortcut = p2 ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (p2 && alphabeticShortcut == '\b' && i2 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void a() {
        a aVar = this.f354e;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((s) item.getSubMenu()).a(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f355f.size();
        s();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f355f.get(i2);
            if (jVar.getGroupId() == groupId && jVar.i() && jVar.isCheckable()) {
                jVar.b(jVar == menuItem);
            }
        }
        r();
    }

    public void a(a aVar) {
        this.f354e = aVar;
    }

    public void a(n nVar) {
        a(nVar, this.a);
    }

    public void a(n nVar, Context context) {
        this.w.add(new WeakReference<>(nVar));
        nVar.a(context, this);
        this.f360k = true;
    }

    /* access modifiers changed from: package-private */
    public void a(List<j> list, int i2, KeyEvent keyEvent) {
        boolean p2 = p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f355f.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar = this.f355f.get(i3);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = p2 ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p2 ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p2 && alphabeticShortcut == '\b' && i2 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    nVar.a(this, z2);
                }
            }
            this.u = false;
        }
    }

    public boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (n) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MenuItem r7, androidx.appcompat.view.menu.n r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.a(android.view.MenuItem, androidx.appcompat.view.menu.n, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean a(g gVar, MenuItem menuItem) {
        a aVar = this.f354e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean a(j jVar) {
        boolean z2 = false;
        if (!this.w.isEmpty() && this.x == jVar) {
            s();
            Iterator<WeakReference<n>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    z2 = nVar.a(this, jVar);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.x = null;
            }
        }
        return z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f351b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f351b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f351b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f351b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        j jVar = (j) a(i2, i3, i4, charSequence);
        s sVar = new s(this.a, this, jVar);
        jVar.a(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int b(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f355f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public void b() {
        ArrayList<j> n2 = n();
        if (this.f360k) {
            Iterator<WeakReference<n>> it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.w.remove(next);
                } else {
                    z2 |= nVar.a();
                }
            }
            if (z2) {
                this.f358i.clear();
                this.f359j.clear();
                int size = n2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j jVar = n2.get(i2);
                    (jVar.h() ? this.f358i : this.f359j).add(jVar);
                }
            } else {
                this.f358i.clear();
                this.f359j.clear();
                this.f359j.addAll(n());
            }
            this.f360k = false;
        }
    }

    public void b(Bundle bundle) {
        e(bundle);
    }

    public void b(n nVar) {
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.w.remove(next);
            }
        }
    }

    public void b(boolean z2) {
        if (!this.q) {
            if (z2) {
                this.f357h = true;
                this.f360k = true;
            }
            d(z2);
            return;
        }
        this.r = true;
        if (z2) {
            this.s = true;
        }
    }

    public boolean b(j jVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        s();
        Iterator<WeakReference<n>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.w.remove(next);
            } else {
                z2 = nVar.b(this, jVar);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.x = jVar;
        }
        return z2;
    }

    public g c(int i2) {
        this.f361l = i2;
        return this;
    }

    public ArrayList<j> c() {
        b();
        return this.f358i;
    }

    public void c(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(j jVar) {
        this.f360k = true;
        b(true);
    }

    public void c(boolean z2) {
        this.z = z2;
    }

    public void clear() {
        j jVar = this.x;
        if (jVar != null) {
            a(jVar);
        }
        this.f355f.clear();
        b(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        b(false);
    }

    public void close() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public g d(int i2) {
        a(0, null, i2, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "android:menu:actionviewstates";
    }

    public void d(Bundle bundle) {
        f(bundle);
    }

    /* access modifiers changed from: package-private */
    public void d(j jVar) {
        this.f357h = true;
        b(true);
    }

    public Context e() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public g e(int i2) {
        a(i2, null, 0, null, null);
        return this;
    }

    public j f() {
        return this.x;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f355f.get(i3);
            if (jVar.getItemId() == i2) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public Drawable g() {
        return this.o;
    }

    public MenuItem getItem(int i2) {
        return this.f355f.get(i2);
    }

    public CharSequence h() {
        return this.n;
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f355f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public View i() {
        return this.p;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public ArrayList<j> j() {
        b();
        return this.f359j;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Resources l() {
        return this.f351b;
    }

    public g m() {
        return this;
    }

    public ArrayList<j> n() {
        if (!this.f357h) {
            return this.f356g;
        }
        this.f356g.clear();
        int size = this.f355f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f355f.get(i2);
            if (jVar.isVisible()) {
                this.f356g.add(jVar);
            }
        }
        this.f357h = false;
        this.f360k = true;
        return this.f356g;
    }

    public boolean o() {
        return this.y;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f352c;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        j a2 = a(i2, keyEvent);
        boolean a3 = a2 != null ? a(a2, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public boolean q() {
        return this.f353d;
    }

    public void r() {
        this.q = false;
        if (this.r) {
            this.r = false;
            b(this.s);
        }
    }

    public void removeGroup(int i2) {
        int a2 = a(i2);
        if (a2 >= 0) {
            int size = this.f355f.size() - a2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f355f.get(a2).getGroupId() != i2) {
                    b(true);
                } else {
                    a(a2, false);
                    i3 = i4;
                }
            }
            b(true);
        }
    }

    public void removeItem(int i2) {
        a(b(i2), true);
    }

    public void s() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f355f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f355f.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.c(z3);
                jVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f355f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f355f.get(i3);
            if (jVar.getGroupId() == i2) {
                jVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f355f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f355f.get(i3);
            if (jVar.getGroupId() == i2 && jVar.e(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f352c = z2;
        b(false);
    }

    public int size() {
        return this.f355f.size();
    }
}
