package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c.e.a;
import java.lang.reflect.Method;

class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f1737d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f1738e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1739f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1740g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1741h;

    /* renamed from: i  reason: collision with root package name */
    private int f1742i;

    /* renamed from: j  reason: collision with root package name */
    private int f1743j;

    /* renamed from: k  reason: collision with root package name */
    private int f1744k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    private b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1737d = new SparseIntArray();
        this.f1742i = -1;
        this.f1743j = 0;
        this.f1744k = -1;
        this.f1738e = parcel;
        this.f1739f = i2;
        this.f1740g = i3;
        this.f1743j = this.f1739f;
        this.f1741h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f1742i;
        if (i2 >= 0) {
            int i3 = this.f1737d.get(i2);
            int dataPosition = this.f1738e.dataPosition();
            this.f1738e.setDataPosition(i3);
            this.f1738e.writeInt(dataPosition - i3);
            this.f1738e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void a(Parcelable parcelable) {
        this.f1738e.writeParcelable(parcelable, 0);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1738e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(String str) {
        this.f1738e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a(boolean z) {
        this.f1738e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void a(byte[] bArr) {
        if (bArr != null) {
            this.f1738e.writeInt(bArr.length);
            this.f1738e.writeByteArray(bArr);
            return;
        }
        this.f1738e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.a
    public boolean a(int i2) {
        while (this.f1743j < this.f1740g) {
            int i3 = this.f1744k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1738e.setDataPosition(this.f1743j);
            int readInt = this.f1738e.readInt();
            this.f1744k = this.f1738e.readInt();
            this.f1743j += readInt;
        }
        return this.f1744k == i2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public a b() {
        Parcel parcel = this.f1738e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1743j;
        if (i2 == this.f1739f) {
            i2 = this.f1740g;
        }
        return new b(parcel, dataPosition, i2, this.f1741h + "  ", this.a, this.f1735b, this.f1736c);
    }

    @Override // androidx.versionedparcelable.a
    public void b(int i2) {
        a();
        this.f1742i = i2;
        this.f1737d.put(i2, this.f1738e.dataPosition());
        c(0);
        c(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void c(int i2) {
        this.f1738e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public boolean d() {
        return this.f1738e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] e() {
        int readInt = this.f1738e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1738e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1738e);
    }

    @Override // androidx.versionedparcelable.a
    public int g() {
        return this.f1738e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T h() {
        return (T) this.f1738e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String i() {
        return this.f1738e.readString();
    }
}
