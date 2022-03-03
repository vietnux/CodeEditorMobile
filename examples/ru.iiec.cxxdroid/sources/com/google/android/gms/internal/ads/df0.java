package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.internal.f0.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* access modifiers changed from: package-private */
@k2
public final class df0 {
    final j40 a;

    /* renamed from: b  reason: collision with root package name */
    final String f4103b;

    /* renamed from: c  reason: collision with root package name */
    final int f4104c;

    private df0(j40 j40, String str, int i2) {
        this.a = j40;
        this.f4103b = str;
        this.f4104c = i2;
    }

    df0(ye0 ye0) {
        this(ye0.d(), ye0.a(), ye0.b());
    }

    static df0 a(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                df0 df0 = new df0(j40.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return df0;
            } catch (b.a | IllegalArgumentException | IllegalStateException e2) {
                x0.j().a(e2, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e2);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final String a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f4103b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f4104c);
            this.a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            qc.a("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
