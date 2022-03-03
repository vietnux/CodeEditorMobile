package e.b.b.b.n;

public final class a {
    public static float a(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static float a(float f2, float f3, float f4, float f5, float f6, float f7) {
        return b(a(f2, f3, f4, f5), a(f2, f3, f6, f5), a(f2, f3, f6, f7), a(f2, f3, f4, f7));
    }

    private static float b(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }
}
