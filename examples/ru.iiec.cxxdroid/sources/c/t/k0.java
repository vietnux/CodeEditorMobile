package c.t;

import android.view.View;
import android.view.WindowId;

/* access modifiers changed from: package-private */
public class k0 implements l0 {
    private final WindowId a;

    k0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
