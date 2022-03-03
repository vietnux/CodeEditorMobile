package iiec.androidterm;

public class Exec {
    static {
        System.loadLibrary("iiec-androidterm5");
    }

    static native void setPtyUTF8ModeInternal(int i2, boolean z);

    static native void setPtyWindowSizeInternal(int i2, int i3, int i4, int i5, int i6);
}
