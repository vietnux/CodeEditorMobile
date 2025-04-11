package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.f0.d;

public class d<T extends com.google.android.gms.common.internal.f0.d> extends a<T> {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f3603d = {"data"};

    /* renamed from: c  reason: collision with root package name */
    private final Parcelable.Creator<T> f3604c;

    public d(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f3604c = creator;
    }

    public static <T extends com.google.android.gms.common.internal.f0.d> void a(DataHolder.a aVar, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        aVar.a(contentValues);
        obtain.recycle();
    }

    public static DataHolder.a b() {
        return DataHolder.a(f3603d);
    }

    @Override // com.google.android.gms.common.data.b
    public T get(int i2) {
        DataHolder dataHolder = this.f3600b;
        byte[] a = dataHolder.a("data", i2, dataHolder.c(i2));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(a, 0, a.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f3604c.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
