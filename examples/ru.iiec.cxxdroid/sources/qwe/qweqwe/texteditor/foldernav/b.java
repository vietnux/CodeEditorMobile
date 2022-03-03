package qwe.qweqwe.texteditor.foldernav;

import android.content.DialogInterface;
import qwe.qweqwe.texteditor.foldernav.IconTreeItemHolder;

/* compiled from: lambda */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f9636b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ IconTreeItemHolder.b f9637c;

    public /* synthetic */ b(h hVar, IconTreeItemHolder.b bVar) {
        this.f9636b = hVar;
        this.f9637c = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9636b.a(this.f9637c, dialogInterface, i2);
    }
}
