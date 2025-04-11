package e.b.b.a.c.e;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class t0 extends l6 implements r0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(s sVar, boolean z) {
        Parcel M = M();
        n6.a(M, sVar);
        n6.a(M, z);
        Parcel a = a(7, M);
        ArrayList createTypedArrayList = a.createTypedArrayList(p5.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // e.b.b.a.c.e.r0
    public final List<w> a(String str, String str2, s sVar) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        n6.a(M, sVar);
        Parcel a = a(16, M);
        ArrayList createTypedArrayList = a.createTypedArrayList(w.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(String str, String str2, String str3, boolean z) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        n6.a(M, z);
        Parcel a = a(15, M);
        ArrayList createTypedArrayList = a.createTypedArrayList(p5.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // e.b.b.a.c.e.r0
    public final List<p5> a(String str, String str2, boolean z, s sVar) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        n6.a(M, z);
        n6.a(M, sVar);
        Parcel a = a(14, M);
        ArrayList createTypedArrayList = a.createTypedArrayList(p5.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(long j2, String str, String str2, String str3) {
        Parcel M = M();
        M.writeLong(j2);
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        b(10, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(n0 n0Var, s sVar) {
        Parcel M = M();
        n6.a(M, n0Var);
        n6.a(M, sVar);
        b(1, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(n0 n0Var, String str, String str2) {
        Parcel M = M();
        n6.a(M, n0Var);
        M.writeString(str);
        M.writeString(str2);
        b(5, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(p5 p5Var, s sVar) {
        Parcel M = M();
        n6.a(M, p5Var);
        n6.a(M, sVar);
        b(2, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(s sVar) {
        Parcel M = M();
        n6.a(M, sVar);
        b(18, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(w wVar) {
        Parcel M = M();
        n6.a(M, wVar);
        b(13, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void a(w wVar, s sVar) {
        Parcel M = M();
        n6.a(M, wVar);
        n6.a(M, sVar);
        b(12, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final String b(s sVar) {
        Parcel M = M();
        n6.a(M, sVar);
        Parcel a = a(11, M);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // e.b.b.a.c.e.r0
    public final List<w> b(String str, String str2, String str3) {
        Parcel M = M();
        M.writeString(str);
        M.writeString(str2);
        M.writeString(str3);
        Parcel a = a(17, M);
        ArrayList createTypedArrayList = a.createTypedArrayList(w.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    @Override // e.b.b.a.c.e.r0
    public final void c(s sVar) {
        Parcel M = M();
        n6.a(M, sVar);
        b(6, M);
    }

    @Override // e.b.b.a.c.e.r0
    public final void d(s sVar) {
        Parcel M = M();
        n6.a(M, sVar);
        b(4, M);
    }
}
