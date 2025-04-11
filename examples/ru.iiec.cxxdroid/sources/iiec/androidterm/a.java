package iiec.androidterm;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import iiec.androidterm.t.c;

class a extends d {
    private final String D;
    private boolean E;

    a(ParcelFileDescriptor parcelFileDescriptor, c cVar, String str) {
        super(parcelFileDescriptor, cVar, true);
        this.D = str;
        a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        a(new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor));
    }

    @Override // iiec.androidterm.d, iiec.androidterm.r.m
    public void a(int i2, int i3) {
        super.a(i2, i3);
        this.E = true;
    }

    @Override // iiec.androidterm.r.m
    public String c() {
        String c2 = super.c();
        if (TextUtils.isEmpty(c2)) {
            return this.D;
        }
        return this.D + " — " + c2;
    }

    /* access modifiers changed from: package-private */
    @Override // iiec.androidterm.d
    public boolean k() {
        return !this.E;
    }
}
