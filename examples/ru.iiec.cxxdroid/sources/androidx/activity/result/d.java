package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.core.app.b;

public abstract class d<I> {
    public abstract void a();

    public void a(@SuppressLint({"UnknownNullness"}) I i2) {
        a(i2, null);
    }

    public abstract void a(@SuppressLint({"UnknownNullness"}) I i2, b bVar);
}
