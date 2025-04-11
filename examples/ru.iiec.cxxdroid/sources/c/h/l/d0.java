package c.h.l;

import android.os.Build;
import android.view.ViewGroup;
import c.h.b;

public final class d0 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && b0.A(viewGroup) == null) ? false : true;
    }
}
