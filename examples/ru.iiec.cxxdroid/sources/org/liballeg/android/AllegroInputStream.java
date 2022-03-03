package org.liballeg.android;

import android.util.Log;
import java.io.InputStream;

public class AllegroInputStream extends InputStream {
    private static final String TAG = "AllegroInputStream";
    private long handle;

    public AllegroInputStream(long j2) {
        this.handle = j2;
        Log.d(TAG, "ctor handle:" + j2);
    }

    @Override // java.io.InputStream
    public int available() {
        Log.d(TAG, "available");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        Log.d(TAG, "close");
        nativeClose(this.handle);
    }

    public void mark(int i2) {
        Log.d(TAG, "mark " + i2);
    }

    public boolean markSupported() {
        Log.d(TAG, "markSupported");
        return false;
    }

    public native void nativeClose(long j2);

    public native int nativeRead(long j2, byte[] bArr, int i2, int i3);

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, bArr.length) != -1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        Log.d(TAG, "read handle: " + this.handle + ", offset: " + i2 + ", length: " + i3);
        int nativeRead = nativeRead(this.handle, bArr, i2, i3);
        StringBuilder sb = new StringBuilder();
        sb.append("read end: ret = ");
        sb.append(nativeRead);
        Log.d(TAG, sb.toString());
        return nativeRead;
    }
}
