package org.liballeg.android;

import android.app.Activity;
import android.util.Log;

class ScreenLock {
    private static final String TAG = "ScreenLock";
    private Activity activity;

    ScreenLock(Activity activity2) {
        this.activity = activity2;
    }

    private void acquire() {
        this.activity.runOnUiThread(new Runnable() {
            /* class org.liballeg.android.ScreenLock.AnonymousClass1 */

            public void run() {
                ScreenLock.this.activity.getWindow().addFlags(128);
            }
        });
    }

    private void release() {
        this.activity.runOnUiThread(new Runnable() {
            /* class org.liballeg.android.ScreenLock.AnonymousClass2 */

            public void run() {
                ScreenLock.this.activity.getWindow().clearFlags(128);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public boolean inhibitScreenLock(boolean z) {
        if (z) {
            try {
                acquire();
                return true;
            } catch (Exception e2) {
                Log.d(TAG, "Got exception in inhibitScreenLock: " + e2.getMessage());
                return false;
            }
        } else if (z) {
            return true;
        } else {
            release();
            return true;
        }
    }
}
