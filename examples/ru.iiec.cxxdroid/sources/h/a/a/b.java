package h.a.a;

import java.util.ArrayList;
import java.util.List;

public class b extends j {

    /* renamed from: b  reason: collision with root package name */
    public int f8648b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C0132b> f8649c = new ArrayList();

    class a extends p<m> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f8650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f8651d;

        a(h hVar, long j2) {
            this.f8650c = hVar;
            this.f8651d = j2;
        }

        /* access modifiers changed from: protected */
        @Override // h.a.a.p
        public m a() {
            return new m(this.f8650c, this.f8650c.c(this.f8651d), b.this.f8648b, null);
        }
    }

    /* renamed from: h.a.a.b$b  reason: collision with other inner class name */
    public static class C0132b {
        public final long a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8653b;

        public C0132b(long j2, long j3) {
            this.a = j2;
            this.f8653b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0132b.class != obj.getClass()) {
                return false;
            }
            C0132b bVar = (C0132b) obj;
            return this.a == bVar.a && this.f8653b == bVar.f8653b;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.f8653b;
            return ((((int) (j2 ^ (j2 >>> 32))) + 31) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            return "ElfDynamicSectionEntry{tag=" + this.a + ", d_val_or_ptr=" + this.f8653b + "}";
        }
    }

    public b(h hVar, k kVar) {
        super(kVar);
        hVar.b(kVar.f8679c);
        int i2 = (int) (kVar.f8680d / 8);
        for (int i3 = 0; i3 < i2; i3++) {
            long b2 = hVar.b();
            long b3 = hVar.b();
            this.f8649c.add(new C0132b(b2, b3));
            int i4 = (int) b2;
            if (i4 != 0) {
                if (i4 == 5) {
                    new a(hVar, b3);
                } else if (i4 != 10) {
                    continue;
                } else if (b3 <= 2147483647L) {
                    this.f8648b = (int) b3;
                } else {
                    throw new c("Too large DT_STRSZ: " + b3);
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        return "ElfDynamicStructure{entries=" + this.f8649c + "}";
    }
}
