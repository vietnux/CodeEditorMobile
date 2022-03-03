package com.myopicmobile.textwarrior.android;

import android.view.KeyEvent;

public class b {
    public static char a(KeyEvent keyEvent, int i2) {
        if (c(keyEvent)) {
            return '\n';
        }
        if (a(keyEvent)) {
            return '\b';
        }
        if (e(keyEvent)) {
            return '\t';
        }
        if (d(keyEvent)) {
            return ' ';
        }
        if (keyEvent.isPrintingKey()) {
            return (char) keyEvent.getUnicodeChar(i2 & -28673);
        }
        return 0;
    }

    private static boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 67;
    }

    public static boolean b(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 20 || keyCode == 19 || keyCode == 22 || keyCode == 21 || keyCode == 93 || keyCode == 92 || keyCode == 122 || keyCode == 123;
    }

    private static boolean c(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 66;
    }

    private static boolean d(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 62;
    }

    private static boolean e(KeyEvent keyEvent) {
        return (keyEvent.isShiftPressed() && keyEvent.getKeyCode() == 62) || keyEvent.getKeyCode() == 61;
    }
}
