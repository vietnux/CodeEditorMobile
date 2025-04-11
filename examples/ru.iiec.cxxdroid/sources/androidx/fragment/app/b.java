package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.y;
import androidx.lifecycle.f;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final int[] f1197b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f1198c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f1199d;

    /* renamed from: e  reason: collision with root package name */
    final int[] f1200e;

    /* renamed from: f  reason: collision with root package name */
    final int f1201f;

    /* renamed from: g  reason: collision with root package name */
    final String f1202g;

    /* renamed from: h  reason: collision with root package name */
    final int f1203h;

    /* renamed from: i  reason: collision with root package name */
    final int f1204i;

    /* renamed from: j  reason: collision with root package name */
    final CharSequence f1205j;

    /* renamed from: k  reason: collision with root package name */
    final int f1206k;

    /* renamed from: l  reason: collision with root package name */
    final CharSequence f1207l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f1208m;
    final ArrayList<String> n;
    final boolean o;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f1197b = parcel.createIntArray();
        this.f1198c = parcel.createStringArrayList();
        this.f1199d = parcel.createIntArray();
        this.f1200e = parcel.createIntArray();
        this.f1201f = parcel.readInt();
        this.f1202g = parcel.readString();
        this.f1203h = parcel.readInt();
        this.f1204i = parcel.readInt();
        this.f1205j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1206k = parcel.readInt();
        this.f1207l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1208m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.f1197b = new int[(size * 5)];
        if (aVar.f1382g) {
            this.f1198c = new ArrayList<>(size);
            this.f1199d = new int[size];
            this.f1200e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                y.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.f1197b[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f1198c;
                Fragment fragment = aVar2.f1389b;
                arrayList.add(fragment != null ? fragment.f1165g : null);
                int[] iArr = this.f1197b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1390c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1391d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1392e;
                iArr[i7] = aVar2.f1393f;
                this.f1199d[i2] = aVar2.f1394g.ordinal();
                this.f1200e[i2] = aVar2.f1395h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1201f = aVar.f1381f;
            this.f1202g = aVar.f1383h;
            this.f1203h = aVar.s;
            this.f1204i = aVar.f1384i;
            this.f1205j = aVar.f1385j;
            this.f1206k = aVar.f1386k;
            this.f1207l = aVar.f1387l;
            this.f1208m = aVar.f1388m;
            this.n = aVar.n;
            this.o = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(n nVar) {
        a aVar = new a(nVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1197b.length) {
            y.a aVar2 = new y.a();
            int i4 = i2 + 1;
            aVar2.a = this.f1197b[i2];
            if (n.d(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1197b[i4]);
            }
            String str = this.f1198c.get(i3);
            aVar2.f1389b = str != null ? nVar.b(str) : null;
            aVar2.f1394g = f.c.values()[this.f1199d[i3]];
            aVar2.f1395h = f.c.values()[this.f1200e[i3]];
            int[] iArr = this.f1197b;
            int i5 = i4 + 1;
            aVar2.f1390c = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f1391d = iArr[i5];
            int i7 = i6 + 1;
            aVar2.f1392e = iArr[i6];
            aVar2.f1393f = iArr[i7];
            aVar.f1377b = aVar2.f1390c;
            aVar.f1378c = aVar2.f1391d;
            aVar.f1379d = aVar2.f1392e;
            aVar.f1380e = aVar2.f1393f;
            aVar.a(aVar2);
            i3++;
            i2 = i7 + 1;
        }
        aVar.f1381f = this.f1201f;
        aVar.f1383h = this.f1202g;
        aVar.s = this.f1203h;
        aVar.f1382g = true;
        aVar.f1384i = this.f1204i;
        aVar.f1385j = this.f1205j;
        aVar.f1386k = this.f1206k;
        aVar.f1387l = this.f1207l;
        aVar.f1388m = this.f1208m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1197b);
        parcel.writeStringList(this.f1198c);
        parcel.writeIntArray(this.f1199d);
        parcel.writeIntArray(this.f1200e);
        parcel.writeInt(this.f1201f);
        parcel.writeString(this.f1202g);
        parcel.writeInt(this.f1203h);
        parcel.writeInt(this.f1204i);
        TextUtils.writeToParcel(this.f1205j, parcel, 0);
        parcel.writeInt(this.f1206k);
        TextUtils.writeToParcel(this.f1207l, parcel, 0);
        parcel.writeStringList(this.f1208m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
