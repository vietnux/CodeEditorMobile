package iiec.androidterm.r;

/* access modifiers changed from: package-private */
public final class p {
    static final int a = a(256, 257, 0);

    static int a(int i2) {
        return i2 & 511;
    }

    static int a(int i2, int i3, int i4) {
        return ((i2 & 511) << 9) | ((i4 & 63) << 18) | (i3 & 511);
    }

    static int b(int i2) {
        return (i2 >> 18) & 63;
    }

    static int c(int i2) {
        return (i2 >> 9) & 511;
    }
}
