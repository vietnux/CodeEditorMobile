package c.h.l;

import android.view.MotionEvent;

public final class l {
    public static boolean a(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}
