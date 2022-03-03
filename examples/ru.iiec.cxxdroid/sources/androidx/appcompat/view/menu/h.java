package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.n;
import c.a.g;

class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: b  reason: collision with root package name */
    private g f363b;

    /* renamed from: c  reason: collision with root package name */
    private d f364c;

    /* renamed from: d  reason: collision with root package name */
    e f365d;

    /* renamed from: e  reason: collision with root package name */
    private n.a f366e;

    public h(g gVar) {
        this.f363b = gVar;
    }

    public void a() {
        d dVar = this.f364c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        g gVar = this.f363b;
        d.a aVar = new d.a(gVar.e());
        this.f365d = new e(aVar.b(), g.abc_list_menu_item_layout);
        this.f365d.a(this);
        this.f363b.a(this.f365d);
        aVar.a(this.f365d.c(), this);
        View i2 = gVar.i();
        if (i2 != null) {
            aVar.a(i2);
        } else {
            aVar.a(gVar.g());
            aVar.b(gVar.h());
        }
        aVar.a(this);
        this.f364c = aVar.a();
        this.f364c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f364c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f364c.show();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(g gVar, boolean z) {
        if (z || gVar == this.f363b) {
            a();
        }
        n.a aVar = this.f366e;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean a(g gVar) {
        n.a aVar = this.f366e;
        if (aVar != null) {
            return aVar.a(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f363b.a((j) this.f365d.c().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f365d.a(this.f363b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f364c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f364c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f363b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f363b.performShortcut(i2, keyEvent, 0);
    }
}
