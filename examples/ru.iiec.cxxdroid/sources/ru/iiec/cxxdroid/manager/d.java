package ru.iiec.cxxdroid.manager;

import android.view.View;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxPackageManagerActivity.a f9985b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f9986c;

    public /* synthetic */ d(CxxPackageManagerActivity.a aVar, f fVar) {
        this.f9985b = aVar;
        this.f9986c = fVar;
    }

    public final void onClick(View view) {
        this.f9985b.a(this.f9986c, view);
    }
}
