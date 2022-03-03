package ru.iiec.cxxdroid.manager;

import android.view.View;
import java.util.List;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxPackageManagerActivity.a f9982b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f9983c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ List f9984d;

    public /* synthetic */ c(CxxPackageManagerActivity.a aVar, f fVar, List list) {
        this.f9982b = aVar;
        this.f9983c = fVar;
        this.f9984d = list;
    }

    public final void onClick(View view) {
        this.f9982b.a(this.f9983c, this.f9984d, view);
    }
}
