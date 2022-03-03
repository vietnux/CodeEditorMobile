package org.libsdl.app;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

class SDLInputConnection extends BaseInputConnection {
    public SDLInputConnection(View view, boolean z) {
        super(view, z);
    }

    public static native void nativeCommitText(String str, int i2);

    public boolean commitText(CharSequence charSequence, int i2) {
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n' && SDLActivity.onNativeSoftReturnKey()) {
                return true;
            }
            nativeGenerateScancodeForUnichar(charAt);
        }
        nativeCommitText(charSequence.toString(), i2);
        return super.commitText(charSequence, i2);
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        if (i2 <= 0 || i3 != 0) {
            return super.deleteSurroundingText(i2, i3);
        }
        boolean z = true;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return z;
            }
            z = z && (sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67)));
            i2 = i4;
        }
    }

    public native void nativeGenerateScancodeForUnichar(char c2);

    public native void nativeSetComposingText(String str, int i2);

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 66 || !SDLActivity.onNativeSoftReturnKey()) {
            return super.sendKeyEvent(keyEvent);
        }
        return true;
    }

    public boolean setComposingText(CharSequence charSequence, int i2) {
        nativeSetComposingText(charSequence.toString(), i2);
        return super.setComposingText(charSequence, i2);
    }
}
