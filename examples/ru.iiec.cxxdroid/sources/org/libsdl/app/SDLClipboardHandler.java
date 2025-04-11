package org.libsdl.app;

/* access modifiers changed from: package-private */
public interface SDLClipboardHandler {
    String clipboardGetText();

    boolean clipboardHasText();

    void clipboardSetText(String str);
}
