package ru.iiec.cxxdroid.manager;

import android.view.View;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxPackageManagerActivity.a f9980b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f9981c;

    public /* synthetic */ b(CxxPackageManagerActivity.a aVar, f fVar) {
        this.f9980b = aVar;
        this.f9981c = fVar;
    }

    public final void onClick(View view) {
        this.f9980b.b(this.f9981c, view);
    }
}
