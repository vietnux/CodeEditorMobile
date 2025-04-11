package ru.iiec.cxxdroid.manager;

import android.view.View;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxPackageManagerActivity.a f9987b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f9988c;

    public /* synthetic */ e(CxxPackageManagerActivity.a aVar, f fVar) {
        this.f9987b = aVar;
        this.f9988c = fVar;
    }

    public final void onClick(View view) {
        this.f9987b.c(this.f9988c, view);
    }
}
