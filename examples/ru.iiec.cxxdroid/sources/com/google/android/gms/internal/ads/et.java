package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class et {

    /* renamed from: c  reason: collision with root package name */
    private static final et f4227c = new et();
    private final lt a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, kt<?>> f4228b = new ConcurrentHashMap();

    private et() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        lt ltVar = null;
        for (int i2 = 0; i2 <= 0; i2++) {
            ltVar = a(strArr[0]);
            if (ltVar != null) {
                break;
            }
        }
        this.a = ltVar == null ? new is() : ltVar;
    }

    public static et a() {
        return f4227c;
    }

    private static lt a(String str) {
        try {
            return (lt) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> kt<T> a(Class<T> cls) {
        or.a((Object) cls, "messageType");
        kt<T> ktVar = (kt<T>) this.f4228b.get(cls);
        if (ktVar != null) {
            return ktVar;
        }
        kt<T> a2 = this.a.a(cls);
        or.a((Object) cls, "messageType");
        or.a((Object) a2, "schema");
        kt<T> ktVar2 = (kt<T>) this.f4228b.putIfAbsent(cls, a2);
        return ktVar2 != null ? ktVar2 : a2;
    }

    public final <T> kt<T> a(T t) {
        return a((Class) t.getClass());
    }
}
