package ru.iiec.cxxdroid.c0;

import java.io.File;
import java.util.Comparator;

/* compiled from: lambda */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a f9952b = new a();

    private /* synthetic */ a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
    }
}
