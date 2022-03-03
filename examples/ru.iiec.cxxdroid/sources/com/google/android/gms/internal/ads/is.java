package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;

final class is implements lt {

    /* renamed from: b  reason: collision with root package name */
    private static final rs f4644b = new js();
    private final rs a;

    public is() {
        this(new ks(lr.a(), a()));
    }

    private is(rs rsVar) {
        or.a((Object) rsVar, "messageInfoFactory");
        this.a = rsVar;
    }

    private static rs a() {
        try {
            return (rs) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4644b;
        }
    }

    private static boolean a(qs qsVar) {
        return qsVar.a() == mr.e.f4984i;
    }

    @Override // com.google.android.gms.internal.ads.lt
    public final <T> kt<T> a(Class<T> cls) {
        mt.a((Class<?>) cls);
        qs b2 = this.a.b(cls);
        if (b2.b()) {
            return mr.class.isAssignableFrom(cls) ? ys.a(mt.c(), dr.b(), b2.c()) : ys.a(mt.a(), dr.c(), b2.c());
        }
        if (mr.class.isAssignableFrom(cls)) {
            boolean a2 = a(b2);
            at b3 = ct.b();
            ds b4 = ds.b();
            du<?, ?> c2 = mt.c();
            return a2 ? ws.a(cls, b2, b3, b4, c2, dr.b(), ps.b()) : ws.a(cls, b2, b3, b4, c2, (br<?>) null, ps.b());
        }
        boolean a3 = a(b2);
        at a4 = ct.a();
        ds a5 = ds.a();
        return a3 ? ws.a(cls, b2, a4, a5, mt.a(), dr.c(), ps.a()) : ws.a(cls, b2, a4, a5, mt.b(), (br<?>) null, ps.a());
    }
}
