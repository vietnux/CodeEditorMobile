package org.liballeg.android;

import android.view.View;

/* access modifiers changed from: package-private */
public class TouchListener implements View.OnTouchListener {
    private static final String TAG = "TouchListener";

    TouchListener() {
    }

    /* access modifiers changed from: package-private */
    public native void nativeOnTouch(int i2, int i3, float f2, float f3, boolean z);

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: org.liballeg.android.TouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
