package org.liballeg.android;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

class AllegroAPKStream {
    private static final String TAG = "AllegroAPKStream";
    private AllegroActivity activity;
    private boolean at_eof = false;
    private String fn;
    private long fsize = -1;
    private InputStream in;
    private long pos = 0;

    AllegroAPKStream(AllegroActivity allegroActivity, String str) {
        this.activity = allegroActivity;
        this.fn = Path.simplifyPath(str);
        if (!this.fn.equals(str)) {
            Log.d(TAG, str + " simplified to: " + this.fn);
        }
    }

    private boolean force_skip(long j2) {
        if (j2 <= 0) {
            return true;
        }
        byte[] bArr = new byte[((int) j2)];
        while (j2 > 0) {
            try {
                int read = this.in.read(bArr, 0, (int) j2);
                if (read <= 0) {
                    break;
                }
                long j3 = (long) read;
                this.pos += j3;
                j2 -= j3;
            } catch (IOException e2) {
                Log.d(TAG, "IOException: " + e2.toString());
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean close() {
        try {
            this.in.close();
            this.in = null;
            return true;
        } catch (IOException unused) {
            Log.d(TAG, "IOException in close");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean eof() {
        return this.at_eof;
    }

    /* access modifiers changed from: package-private */
    public boolean open() {
        try {
            AssetFileDescriptor openFd = this.activity.getResources().getAssets().openFd(this.fn);
            this.fsize = openFd.getLength();
            openFd.close();
        } catch (IOException e2) {
            Log.w(TAG, "could not get file size: " + e2.toString());
            this.fsize = -1;
        }
        return reopen();
    }

    /* access modifiers changed from: package-private */
    public int read(byte[] bArr) {
        try {
            int read = this.in.read(bArr);
            if (read > 0) {
                this.pos += (long) read;
            } else if (read == -1) {
                this.at_eof = true;
            }
            return read;
        } catch (IOException unused) {
            Log.d(TAG, "IOException in read");
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean reopen() {
        if (this.in != null) {
            close();
            this.in = null;
        }
        try {
            this.in = this.activity.getResources().getAssets().open(this.fn, 1);
            this.in.mark((int) Math.pow(2.0d, 31.0d));
            this.pos = 0;
            this.at_eof = false;
            return true;
        } catch (IOException unused) {
            Log.d(TAG, "Got IOException in reopen. fn='" + this.fn + "'");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean seek(long j2) {
        this.at_eof = false;
        long j3 = this.pos;
        if (j2 >= j3) {
            return force_skip(j2 - j3);
        }
        try {
            this.in.reset();
            this.pos = 0;
        } catch (IOException unused) {
            if (!reopen()) {
                return false;
            }
        }
        return force_skip(j2);
    }

    /* access modifiers changed from: package-private */
    public long size() {
        return this.fsize;
    }

    /* access modifiers changed from: package-private */
    public long tell() {
        return this.pos;
    }
}
