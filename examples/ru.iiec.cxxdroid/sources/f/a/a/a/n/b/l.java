package f.a.a.a.n.b;

public enum l {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8403b;

    private l(int i2) {
        this.f8403b = i2;
    }

    public static l a(String str) {
        return "io.crash.air".equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    public int h() {
        return this.f8403b;
    }

    public String toString() {
        return Integer.toString(this.f8403b);
    }
}
