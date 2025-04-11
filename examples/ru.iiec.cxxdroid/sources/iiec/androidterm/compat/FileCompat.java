package iiec.androidterm.compat;

import java.io.File;

public class FileCompat {

    /* access modifiers changed from: private */
    public static class Api8OrEarlier {
        static {
            System.loadLibrary("iiec-androidterm5");
        }

        public static boolean a(File file) {
            return testExecute(file.getAbsolutePath());
        }

        private static native boolean testExecute(String str);
    }

    /* access modifiers changed from: private */
    public static class a {
        public static boolean a(File file) {
            return file.canExecute();
        }
    }

    public static boolean a(File file) {
        return a.a < 9 ? Api8OrEarlier.a(file) : a.a(file);
    }
}
