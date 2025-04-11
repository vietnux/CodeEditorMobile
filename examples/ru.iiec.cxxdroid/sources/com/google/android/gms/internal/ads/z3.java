package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.f0.d;
import com.google.android.gms.common.util.l;
import java.io.DataInputStream;
import java.io.IOException;

@k2
public final class z3 extends a {
    public static final Parcelable.Creator<z3> CREATOR = new b4();

    /* renamed from: b  reason: collision with root package name */
    private ParcelFileDescriptor f6177b;

    /* renamed from: c  reason: collision with root package name */
    private Parcelable f6178c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6179d;

    public z3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6177b = parcelFileDescriptor;
        this.f6178c = null;
        this.f6179d = true;
    }

    public z3(d dVar) {
        this.f6177b = null;
        this.f6178c = dVar;
        this.f6179d = false;
    }

    private final <T> ParcelFileDescriptor a(byte[] bArr) {
        IOException e2;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new a4(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e3) {
                e2 = e3;
                qc.b("Error transporting the ad response", e2);
                x0.j().a(e2, "LargeParcelTeleporter.pipeData.2");
                l.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e4) {
            e2 = e4;
            autoCloseOutputStream = null;
            qc.b("Error transporting the ad response", e2);
            x0.j().a(e2, "LargeParcelTeleporter.pipeData.2");
            l.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor t() {
        if (this.f6177b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f6178c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f6177b = a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f6177b;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends d> T a(Parcelable.Creator<T> creator) {
        if (this.f6179d) {
            ParcelFileDescriptor parcelFileDescriptor = this.f6177b;
            if (parcelFileDescriptor == null) {
                qc.a("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                l.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f6178c = creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f6179d = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e2) {
                qc.b("Could not read from parcel file descriptor", e2);
                l.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                l.a(dataInputStream);
                throw th2;
            }
        }
        return (T) ((d) this.f6178c);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        t();
        int a = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f6177b, i2, false);
        c.a(parcel, a);
    }
}
