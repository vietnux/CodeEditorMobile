package e.b.b.a.c.c;

import java.io.IOException;

public abstract class j {
    public static final <T extends j> T a(T t, byte[] bArr, int i2, int i3) {
        try {
            a a = a.a(bArr, 0, i3);
            t.a(a);
            a.a(0);
            return t;
        } catch (i e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e3);
        }
    }

    /* renamed from: a */
    public j clone() {
        return (j) super.clone();
    }

    public abstract j a(a aVar);

    public String toString() {
        return k.a(this);
    }
}
