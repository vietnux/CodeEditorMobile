package ru.iiec.cxxdroid;

import android.content.DialogInterface;
import java.util.ArrayList;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxActivity f9964b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ArrayList f9965c;

    public /* synthetic */ g(CxxActivity cxxActivity, ArrayList arrayList) {
        this.f9964b = cxxActivity;
        this.f9965c = arrayList;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        CxxPackageManagerActivity.a(this.f9964b, this.f9965c);
    }
}
