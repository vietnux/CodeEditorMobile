package org.libsdl.app;

import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.util.Log;

public class SDLAudioManager {
    protected static final String TAG = "SDLAudio";
    protected static AudioRecord mAudioRecord;
    protected static AudioTrack mAudioTrack;

    public static void audioClose() {
        AudioTrack audioTrack = mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            mAudioTrack.release();
            mAudioTrack = null;
        }
    }

    public static int[] audioOpen(int i2, int i3, int i4, int i5) {
        return open(false, i2, i3, i4, i5);
    }

    public static void audioSetThreadPriority(boolean z, int i2) {
        Thread currentThread;
        String str;
        if (z) {
            try {
                currentThread = Thread.currentThread();
                str = "SDLAudioC" + i2;
            } catch (Exception e2) {
                Log.v(TAG, "modify thread properties failed " + e2.toString());
                return;
            }
        } else {
            currentThread = Thread.currentThread();
            str = "SDLAudioP" + i2;
        }
        currentThread.setName(str);
        Process.setThreadPriority(-16);
    }

    public static void audioWriteByteBuffer(byte[] bArr) {
        if (mAudioTrack == null) {
            Log.e(TAG, "Attempted to make audio call with uninitialized audio!");
            return;
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            int write = mAudioTrack.write(bArr, i2, bArr.length - i2);
            if (write > 0) {
                i2 += write;
            } else if (write == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException unused) {
                }
            } else {
                Log.w(TAG, "SDL audio: error return from write(byte)");
                return;
            }
        }
    }

    public static void audioWriteFloatBuffer(float[] fArr) {
        if (mAudioTrack == null) {
            Log.e(TAG, "Attempted to make audio call with uninitialized audio!");
            return;
        }
        int i2 = 0;
        while (i2 < fArr.length) {
            int write = mAudioTrack.write(fArr, i2, fArr.length - i2, 0);
            if (write > 0) {
                i2 += write;
            } else if (write == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException unused) {
                }
            } else {
                Log.w(TAG, "SDL audio: error return from write(float)");
                return;
            }
        }
    }

    public static void audioWriteShortBuffer(short[] sArr) {
        if (mAudioTrack == null) {
            Log.e(TAG, "Attempted to make audio call with uninitialized audio!");
            return;
        }
        int i2 = 0;
        while (i2 < sArr.length) {
            int write = mAudioTrack.write(sArr, i2, sArr.length - i2);
            if (write > 0) {
                i2 += write;
            } else if (write == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException unused) {
                }
            } else {
                Log.w(TAG, "SDL audio: error return from write(short)");
                return;
            }
        }
    }

    public static void captureClose() {
        AudioRecord audioRecord = mAudioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            mAudioRecord.release();
            mAudioRecord = null;
        }
    }

    public static int[] captureOpen(int i2, int i3, int i4, int i5) {
        return open(true, i2, i3, i4, i5);
    }

    public static int captureReadByteBuffer(byte[] bArr, boolean z) {
        return Build.VERSION.SDK_INT < 23 ? mAudioRecord.read(bArr, 0, bArr.length) : mAudioRecord.read(bArr, 0, bArr.length, !z ? 1 : 0);
    }

    public static int captureReadFloatBuffer(float[] fArr, boolean z) {
        return mAudioRecord.read(fArr, 0, fArr.length, !z ? 1 : 0);
    }

    public static int captureReadShortBuffer(short[] sArr, boolean z) {
        return Build.VERSION.SDK_INT < 23 ? mAudioRecord.read(sArr, 0, sArr.length) : mAudioRecord.read(sArr, 0, sArr.length, !z ? 1 : 0);
    }

    protected static String getAudioFormatString(int i2) {
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? Integer.toString(i2) : "float" : "8-bit" : "16-bit";
    }

    public static void initialize() {
        mAudioTrack = null;
        mAudioRecord = null;
    }

    public static native int nativeSetupJNI();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int[] open(boolean r22, int r23, int r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDLAudioManager.open(boolean, int, int, int, int):int[]");
    }
}
