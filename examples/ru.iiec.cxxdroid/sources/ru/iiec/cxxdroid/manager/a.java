package ru.iiec.cxxdroid.manager;

import android.view.View;
import java.util.List;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CxxPackageManagerActivity.a f9977b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f9978c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ List f9979d;

    public /* synthetic */ a(CxxPackageManagerActivity.a aVar, f fVar, List list) {
        this.f9977b = aVar;
        this.f9978c = fVar;
        this.f9979d = list;
    }

    public final void onClick(View view) {
        this.f9977b.b(this.f9978c, this.f9979d, view);
    }
}
