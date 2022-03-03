package h.a.a;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;

public final class d {
    public final byte a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f8654b;

    /* renamed from: c  reason: collision with root package name */
    public final byte f8655c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8656d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8657e;

    /* renamed from: f  reason: collision with root package name */
    public final short f8658f;

    /* renamed from: g  reason: collision with root package name */
    public final short f8659g;

    /* renamed from: h  reason: collision with root package name */
    public final short f8660h;

    /* renamed from: i  reason: collision with root package name */
    public final short f8661i;

    /* renamed from: j  reason: collision with root package name */
    private short f8662j;

    /* renamed from: k  reason: collision with root package name */
    private p<j>[] f8663k;

    /* renamed from: l  reason: collision with root package name */
    private p<l>[] f8664l;

    class a extends p<j> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f8665c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8666d;

        a(d dVar, h hVar, long j2) {
            this.f8665c = hVar;
            this.f8666d = j2;
        }

        @Override // h.a.a.p
        public j a() {
            k kVar = new k(this.f8665c, this.f8666d);
            int i2 = kVar.f8678b;
            if (i2 != 11) {
                if (i2 == 1879048182) {
                    return new e(this.f8665c, kVar);
                }
                switch (i2) {
                    case 2:
                        break;
                    case 3:
                        return new m(this.f8665c, kVar.f8679c, (int) kVar.f8680d, kVar);
                    case 4:
                        return new i(this.f8665c, kVar);
                    case 5:
                        return new f(this.f8665c, kVar);
                    case 6:
                        return new b(this.f8665c, kVar);
                    case 7:
                        return new g(this.f8665c, kVar);
                    default:
                        return new j(kVar);
                }
            }
            return new o(this.f8665c, kVar);
        }
    }

    class b extends p<l> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f8667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8668d;

        b(d dVar, h hVar, long j2) {
            this.f8667c = hVar;
            this.f8668d = j2;
        }

        @Override // h.a.a.p
        public l a() {
            return new l(this.f8667c, this.f8668d);
        }
    }

    private d(a aVar) {
        h hVar = new h(this, aVar);
        byte[] bArr = new byte[16];
        int a2 = hVar.a(bArr);
        if (a2 == bArr.length) {
            if (Byte.MAX_VALUE == bArr[0] && 69 == bArr[1] && 76 == bArr[2] && 70 == bArr[3]) {
                this.a = bArr[4];
                byte b2 = this.a;
                if (b2 == 1 || b2 == 2) {
                    this.f8654b = bArr[5];
                    byte b3 = this.f8654b;
                    if (b3 == 1 || b3 == 2) {
                        this.f8655c = bArr[6];
                        if (this.f8655c == 1) {
                            byte b4 = bArr[7];
                            byte b5 = bArr[8];
                            hVar.d();
                            hVar.d();
                            hVar.a();
                            hVar.b();
                            this.f8656d = hVar.b();
                            this.f8657e = hVar.b();
                            hVar.a();
                            hVar.d();
                            this.f8658f = hVar.d();
                            this.f8659g = hVar.d();
                            this.f8660h = hVar.d();
                            this.f8661i = hVar.d();
                            if (this.f8661i != 0) {
                                this.f8662j = hVar.d();
                                if (this.f8662j != 65535) {
                                    this.f8663k = p.a(this.f8661i);
                                    for (int i2 = 0; i2 < this.f8661i; i2++) {
                                        this.f8663k[i2] = new a(this, hVar, this.f8657e + ((long) (this.f8660h * i2)));
                                    }
                                    this.f8664l = p.a(this.f8659g);
                                    for (int i3 = 0; i3 < this.f8659g; i3++) {
                                        this.f8664l[i3] = new b(this, hVar, this.f8656d + ((long) (this.f8658f * i3)));
                                    }
                                    return;
                                }
                                throw new c("e_shstrndx is SHN_XINDEX(0xffff), which is not supported yet (the actual index of the section name string table section is contained in the sh_link field of the section header at index 0)");
                            }
                            throw new c("e_shnum is SHN_UNDEF(0), which is not supported yet (the actual number of section header table entries is contained in the sh_size field of the section header at index 0)");
                        }
                        throw new c("Invalid elf version: " + ((int) this.f8655c));
                    }
                    throw new c("Invalid encoding: " + ((int) this.f8654b));
                }
                throw new c("Invalid object size class: " + ((int) this.a));
            }
            throw new c("Bad magic number for file");
        }
        throw new c("Error reading elf header (read " + a2 + "bytes - expected to read " + bArr.length + "bytes)");
    }

    public static d a(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i2 = 0;
        while (i2 < bArr.length) {
            try {
                int read = fileInputStream.read(bArr, i2, bArr.length - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new c("Premature end of file");
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        fileInputStream.close();
        return a(bArr);
        throw th;
    }

    public static d a(byte[] bArr) {
        return new d(new a(new ByteArrayInputStream(bArr)));
    }

    private m b(String str) {
        return (m) a(str);
    }

    public j a(String str) {
        for (int i2 = 1; i2 < this.f8661i; i2++) {
            j b2 = b(i2);
            if (str.equals(b2.a.a())) {
                return b2;
            }
        }
        return null;
    }

    public l a(int i2) {
        return this.f8664l[i2].b();
    }

    public m a() {
        return b(".dynstr");
    }

    public j b(int i2) {
        return this.f8663k[i2].b();
    }

    public m b() {
        return (m) b(this.f8662j);
    }

    public m c() {
        return b(".strtab");
    }
}
