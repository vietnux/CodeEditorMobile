package androidx.activity.result.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

public abstract class a<I, O> {

    /* renamed from: androidx.activity.result.h.a$a  reason: collision with other inner class name */
    public static final class C0005a<T> {
        @SuppressLint({"UnknownNullness"})
        private final T a;

        public C0005a(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i2);

    @SuppressLint({"UnknownNullness"})
    public abstract O a(int i2, Intent intent);

    public C0005a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }
}
