package org.libsdl.app;

import android.content.ClipboardManager;

/* access modifiers changed from: package-private */
public class SDLClipboardHandler_API11 implements SDLClipboardHandler, ClipboardManager.OnPrimaryClipChangedListener {
    protected ClipboardManager mClipMgr = ((ClipboardManager) SDL.getContext().getSystemService("clipboard"));

    SDLClipboardHandler_API11() {
        this.mClipMgr.addPrimaryClipChangedListener(this);
    }

    @Override // org.libsdl.app.SDLClipboardHandler
    public String clipboardGetText() {
        CharSequence text = this.mClipMgr.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // org.libsdl.app.SDLClipboardHandler
    public boolean clipboardHasText() {
        return this.mClipMgr.hasText();
    }

    @Override // org.libsdl.app.SDLClipboardHandler
    public void clipboardSetText(String str) {
        this.mClipMgr.removePrimaryClipChangedListener(this);
        this.mClipMgr.setText(str);
        this.mClipMgr.addPrimaryClipChangedListener(this);
    }

    public void onPrimaryClipChanged() {
        SDLActivity.onNativeClipboardChanged();
    }
}
