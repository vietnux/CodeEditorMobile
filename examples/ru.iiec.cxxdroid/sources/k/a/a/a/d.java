package k.a.a.a;

import java.io.Serializable;

public final class d implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final d f9522d = new d("Sensitive", true);

    /* renamed from: b  reason: collision with root package name */
    private final String f9523b;

    /* renamed from: c  reason: collision with root package name */
    private final transient boolean f9524c;

    static {
        new d("Insensitive", false);
        new d("System", true ^ c.a());
    }

    private d(String str, boolean z) {
        this.f9523b = str;
        this.f9524c = z;
    }

    public boolean a(String str, String str2) {
        if (str != null && str2 != null) {
            return this.f9524c ? str.equals(str2) : str.equalsIgnoreCase(str2);
        }
        throw new NullPointerException("The strings must not be null");
    }

    public String toString() {
        return this.f9523b;
    }
}
