package iiec.androidterm;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;

public class TermExec {
    private static Field a;

    static {
        System.loadLibrary("iiec-termexec2");
    }

    static int a(ParcelFileDescriptor parcelFileDescriptor, String str, String[] strArr, String[] strArr2) {
        int i2;
        if (Build.VERSION.SDK_INT >= 12) {
            i2 = b.a(parcelFileDescriptor);
        } else {
            try {
                if (a == null) {
                    a = FileDescriptor.class.getDeclaredField("descriptor");
                    a.setAccessible(true);
                }
                i2 = a.getInt(parcelFileDescriptor.getFileDescriptor());
            } catch (Exception e2) {
                throw new IOException("Unable to obtain file descriptor on this OS version: " + e2.getMessage());
            }
        }
        return createSubprocessInternal(str, strArr, strArr2, i2);
    }

    private static native int createSubprocessInternal(String str, String[] strArr, String[] strArr2, int i2);

    public static native void sendSignal(int i2, int i3);

    public static native int waitFor(int i2);
}
