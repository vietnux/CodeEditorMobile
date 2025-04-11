package org.libsdl.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

class DummyEdit extends View implements View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    InputConnection f9572b;

    public DummyEdit(Context context) {
        super(context);
        setFocusableInTouchMode(true);
        setFocusable(true);
        setOnKeyListener(this);
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f9572b = new SDLInputConnection(this, true);
        editorInfo.inputType = 145;
        editorInfo.imeOptions = 301989888;
        return this.f9572b;
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (SDLActivity.isTextInputEvent(keyEvent)) {
                this.f9572b.commitText(String.valueOf((char) keyEvent.getUnicodeChar()), 1);
                return true;
            }
            SDLActivity.onNativeKeyDown(i2);
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            SDLActivity.onNativeKeyUp(i2);
            return true;
        }
    }

    public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
        View view;
        if (keyEvent.getAction() == 1 && i2 == 4 && (view = SDLActivity.mTextEdit) != null && view.getVisibility() == 0) {
            SDLActivity.onNativeKeyboardFocusLost();
        }
        return super.onKeyPreIme(i2, keyEvent);
    }
}
