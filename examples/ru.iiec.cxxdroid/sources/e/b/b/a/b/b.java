package e.b.b.a.b;

import android.os.IBinder;
import e.b.b.a.b.a;
import java.lang.reflect.Field;

public final class b<T> extends a.AbstractBinderC0100a {

    /* renamed from: b  reason: collision with root package name */
    private final T f7013b;

    private b(T t) {
        this.f7013b = t;
    }

    public static <T> a a(T t) {
        return new b(t);
    }

    public static <T> T y(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f7013b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
