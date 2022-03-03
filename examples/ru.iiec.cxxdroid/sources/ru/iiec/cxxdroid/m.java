package ru.iiec.cxxdroid;

import android.content.DialogInterface;
import java.io.File;
import java.util.ArrayList;

/* compiled from: lambda */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ x f9971b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ArrayList f9972c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ File f9973d;

    public /* synthetic */ m(x xVar, ArrayList arrayList, File file) {
        this.f9971b = xVar;
        this.f9972c = arrayList;
        this.f9973d = file;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9971b.a(this.f9972c, this.f9973d, dialogInterface, i2);
    }
}
