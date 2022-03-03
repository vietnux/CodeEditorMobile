package qwe.qweqwe.texteditor.foldernav;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import e.f.a.a.c.a;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import k.a.a.a.b;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.r0;
import qwe.qweqwe.texteditor.y0.r;

public class h implements IconTreeItemHolder.a {
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    private e.f.a.a.d.a f9641b;

    /* renamed from: c  reason: collision with root package name */
    public File f9642c = null;

    /* renamed from: d  reason: collision with root package name */
    private final View f9643d;

    /* renamed from: e  reason: collision with root package name */
    private String f9644e = "is_visible";

    /* renamed from: f  reason: collision with root package name */
    private boolean f9645f;

    /* renamed from: g  reason: collision with root package name */
    private e.f.a.a.c.a f9646g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup f9647h;

    /* renamed from: i  reason: collision with root package name */
    private a.b f9648i = c.a;

    public interface a {
        void a(String str);
    }

    public h(e0 e0Var, ViewGroup viewGroup) {
        this.a = e0Var;
        this.f9643d = viewGroup;
        this.f9647h = (ViewGroup) viewGroup.findViewById(n0.container);
        a((Bundle) null);
    }

    private static e.f.a.a.c.a a(File file, e.f.a.a.c.a aVar) {
        if (!(aVar == null || file == null)) {
            try {
                for (e.f.a.a.c.a aVar2 : aVar.a()) {
                    if (file.equals(((IconTreeItemHolder.b) aVar2.g()).f9634e)) {
                        return aVar2;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private void a(e.f.a.a.c.a aVar, e.f.a.a.c.a aVar2, File file) {
        try {
            if (file.isDirectory()) {
                e.f.a.a.c.a aVar3 = new e.f.a.a.c.a(new IconTreeItemHolder.b(file, this, this.a.H()));
                if (aVar2 != null) {
                    aVar3.a(aVar2.i());
                }
                aVar.a(aVar3);
                File[] listFiles = file.listFiles();
                Arrays.sort(listFiles);
                for (File file2 : listFiles) {
                    a(aVar3, a(file2, aVar2), file2);
                }
                return;
            }
            aVar.a(new e.f.a.a.c.a(new IconTreeItemHolder.b(file, this, this.a.H())));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void a(e.f.a.a.c.a aVar, Object obj) {
    }

    static /* synthetic */ void a(a aVar, e.f.a.a.c.a aVar2, Object obj) {
        File file = ((IconTreeItemHolder.b) obj).f9634e;
        if (file.isFile()) {
            aVar.a(file.getAbsolutePath());
        }
    }

    private void b() {
        View view = this.f9643d;
        if (view != null) {
            int i2 = 0;
            view.findViewById(n0.container).setVisibility(this.f9645f ? 0 : 4);
            View findViewById = view.findViewById(n0.status_bar);
            if (this.f9645f) {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
    }

    public void a() {
        try {
            if (this.f9642c != null) {
                e.f.a.a.c.a aVar = null;
                if (this.f9646g != null) {
                    List<e.f.a.a.c.a> a2 = this.f9646g.a();
                    if (a2.size() == 1) {
                        aVar = a2.get(0);
                    }
                }
                this.f9646g = new e.f.a.a.c.a(new IconTreeItemHolder.b(this.f9642c, this, this.a.H()));
                a(this.f9646g, aVar, this.f9642c);
                try {
                    e.f.a.a.c.a aVar2 = this.f9646g;
                    aVar2.a(true);
                    aVar2.a().get(0).a(true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f9641b = new e.f.a.a.d.a(this.a, this.f9646g);
                this.f9641b.a(false);
                this.f9641b.b(r0.TreeNodeStyleCustom);
                this.f9641b.a(IconTreeItemHolder.class);
                this.f9641b.a(this.f9648i);
                this.f9647h.removeAllViews();
                this.f9647h.addView(this.f9641b.b());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public void a(Bundle bundle) {
        a();
        if (bundle != null) {
            String string = bundle.getString("tState");
            this.f9645f = bundle.getBoolean(this.f9644e);
            if (!TextUtils.isEmpty(string)) {
                this.f9641b.a(string);
            }
        }
        b();
    }

    public void a(String str) {
        if (str == null) {
            this.f9645f = false;
            b();
            return;
        }
        this.f9645f = true;
        b();
        if (!new File(str).equals(this.f9642c)) {
            this.f9642c = new File(str);
            a();
        }
    }

    @Override // qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder.a
    public void a(IconTreeItemHolder.b bVar) {
        r O = this.a.O();
        if (O != null) {
            O.a(bVar);
        }
    }

    public /* synthetic */ void a(IconTreeItemHolder.b bVar, DialogInterface dialogInterface, int i2) {
        try {
            if (bVar.f9634e.isDirectory()) {
                b.b(bVar.f9634e);
            } else {
                bVar.f9634e.delete();
            }
            a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(a aVar) {
        this.f9648i = new d(aVar);
        e.f.a.a.d.a aVar2 = this.f9641b;
        if (aVar2 != null) {
            aVar2.a(this.f9648i);
        }
    }

    @Override // qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder.a
    public void b(IconTreeItemHolder.b bVar) {
        this.a.a(bVar.f9634e);
    }

    @Override // qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder.a
    public void c(IconTreeItemHolder.b bVar) {
        new AlertDialog.Builder(this.a).setTitle(q0.confirm_removal).setMessage(this.a.getString(q0.confirm_removal_message, new Object[]{bVar.f9634e.getName()})).setPositiveButton(q0.remove, new b(this, bVar)).setNegativeButton(q0.cancel, a.f9635b).show();
    }
}
