package c.t;

import android.os.IBinder;

/* access modifiers changed from: package-private */
public class j0 implements l0 {
    private final IBinder a;

    j0(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && ((j0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
