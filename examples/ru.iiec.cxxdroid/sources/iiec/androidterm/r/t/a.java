package iiec.androidterm.r.t;

import android.text.AndroidCharacter;

public class a {

    /* access modifiers changed from: private */
    /* renamed from: iiec.androidterm.r.t.a$a  reason: collision with other inner class name */
    public static class C0147a {
        public static int a(char c2) {
            return AndroidCharacter.getEastAsianWidth(c2);
        }
    }

    public static int a(char c2) {
        if (b.a >= 8) {
            return C0147a.a(c2);
        }
        return 4;
    }
}
