package ru.iiec.cxxdroid;

import android.content.Context;
import java.util.LinkedList;
import qwe.qweqwe.texteditor.t0;
import ru.iiec.cxxdroid.manager.CxxPackageManagerActivity;
import ru.iiec.cxxdroid.manager.f;

/* compiled from: lambda */
public final /* synthetic */ class k implements t0.e {
    private final /* synthetic */ CxxPackageManagerActivity a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f9968b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ LinkedList f9969c;

    public /* synthetic */ k(CxxPackageManagerActivity cxxPackageManagerActivity, f fVar, LinkedList linkedList) {
        this.a = cxxPackageManagerActivity;
        this.f9968b = fVar;
        this.f9969c = linkedList;
    }

    @Override // qwe.qweqwe.texteditor.t0.e
    public final void a(Object obj) {
        CxxPackageManagerActivity cxxPackageManagerActivity;
        w.a((CxxPackageManagerActivity) ((Context) cxxPackageManagerActivity), this.f9968b, (LinkedList) ((t0.e) new l(this.a, this.f9969c)));
    }
}
