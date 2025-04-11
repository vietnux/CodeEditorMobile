package i;

import i.f0.c;
import j.d;

public abstract class z {

    /* access modifiers changed from: package-private */
    public class a extends z {
        final /* synthetic */ u a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f9232c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f9233d;

        a(u uVar, int i2, byte[] bArr, int i3) {
            this.a = uVar;
            this.f9231b = i2;
            this.f9232c = bArr;
            this.f9233d = i3;
        }

        @Override // i.z
        public long a() {
            return (long) this.f9231b;
        }

        @Override // i.z
        public void a(d dVar) {
            dVar.write(this.f9232c, this.f9233d, this.f9231b);
        }

        @Override // i.z
        public u b() {
            return this.a;
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public static z a(u uVar, byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            c.a((long) bArr.length, (long) i2, (long) i3);
            return new a(uVar, i3, bArr, i2);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract void a(d dVar);

    public abstract u b();
}
