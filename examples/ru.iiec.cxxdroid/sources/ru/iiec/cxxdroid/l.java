package ru.iiec.cxxdroid;

import java.util.LinkedList;
import qwe.qweqwe.texteditor.t0;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.manager.f;

/* compiled from: lambda */
public final /* synthetic */ class l implements t0.e {
    private final /* synthetic */ CxxPackageManagerActivity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LinkedList f9970b;

    public /* synthetic */ l(CxxPackageManagerActivity cxxPackageManagerActivity, LinkedList linkedList) {
        this.a = cxxPackageManagerActivity;
        this.f9970b = linkedList;
    }

    @Override // qwe.qweqwe.texteditor.t0.e
    public final void a(Object obj) {
        w.b(this.a, (LinkedList) ((LinkedList<f>) this.f9970b));
    }
}
