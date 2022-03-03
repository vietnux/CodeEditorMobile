package ru.iiec.cxxdroid.gui;

import android.content.Intent;
import java.io.File;

public class Util {
    public static void a(String str, String str2) {
        System.loadLibrary("guiutil");
        setEnv(str, str2);
    }

    public static void a(String str, String str2, String[] strArr) {
        System.loadLibrary("guiutil");
        chdir(str);
        reopenStdout(str2);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            setEnv(strArr[i2], strArr[i2 + 1]);
        }
        captureCrashes();
        dobackcompat();
    }

    public static void a(String[] strArr) {
        System.loadLibrary("guiutil");
        setEnv("CXXDROID_GUI_ARGC", "" + (strArr.length + 1));
        setEnv("CXXDROID_GUI_ARGV0", "app_process");
        int i2 = 0;
        while (i2 < strArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("CXXDROID_GUI_ARGV");
            int i3 = i2 + 1;
            sb.append(i3);
            setEnv(sb.toString(), strArr[i2]);
            i2 = i3;
        }
    }

    public static boolean a(Intent intent) {
        return new File(intent.getStringExtra("cxxdroid_gui_stderrout")).exists();
    }

    private static native void captureCrashes();

    private static native void chdir(String str);

    private static native void dobackcompat();

    private static native void reopenStdout(String str);

    private static native void setEnv(String str, String str2);
}
