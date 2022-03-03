package c.t;

import android.os.Build;
import android.view.ViewGroup;

class x {
    static w a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new v(viewGroup) : u.a(viewGroup);
    }

    static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            z.a(viewGroup, z);
        } else {
            y.a(viewGroup, z);
        }
    }
}
