package org.liballeg.android;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;

/* access modifiers changed from: package-private */
public class Clipboard {
    private static final String TAG = "Clipboard";
    private Activity activity;
    private boolean clip_thread_done = false;
    private String clipdata;

    Clipboard(Activity activity2) {
        this.activity = activity2;
    }

    public String getText() {
        this.activity.runOnUiThread(new Runnable() {
            /* class org.liballeg.android.Clipboard.AnonymousClass2 */

            public void run() {
                ClipData.Item itemAt;
                ClipData primaryClip = ((ClipboardManager) Clipboard.this.activity.getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
                    Clipboard.this.clipdata = null;
                } else {
                    Clipboard.this.clipdata = itemAt.coerceToText(Clipboard.this.activity.getApplicationContext()).toString();
                }
                Clipboard.this.clip_thread_done = true;
            }
        });
        do {
        } while (!this.clip_thread_done);
        this.clip_thread_done = false;
        return this.clipdata;
    }

    /* access modifiers changed from: package-private */
    public boolean hasText() {
        return getText() != null;
    }

    public boolean setText(final String str) {
        this.activity.runOnUiThread(new Runnable() {
            /* class org.liballeg.android.Clipboard.AnonymousClass1 */

            public void run() {
                ((ClipboardManager) Clipboard.this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("allegro", str));
                Clipboard.this.clip_thread_done = true;
            }
        });
        do {
        } while (!this.clip_thread_done);
        this.clip_thread_done = false;
        return true;
    }
}
