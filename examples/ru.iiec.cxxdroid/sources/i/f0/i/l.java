package i.f0.i;

import j.e;
import java.util.List;

public interface l {
    public static final l a = new a();

    class a implements l {
        a() {
        }

        @Override // i.f0.i.l
        public void a(int i2, b bVar) {
        }

        @Override // i.f0.i.l
        public boolean a(int i2, e eVar, int i3, boolean z) {
            eVar.skip((long) i3);
            return true;
        }

        @Override // i.f0.i.l
        public boolean a(int i2, List<c> list) {
            return true;
        }

        @Override // i.f0.i.l
        public boolean a(int i2, List<c> list, boolean z) {
            return true;
        }
    }

    void a(int i2, b bVar);

    boolean a(int i2, e eVar, int i3, boolean z);

    boolean a(int i2, List<c> list);

    boolean a(int i2, List<c> list, boolean z);
}
