package e.b.a;

public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: b  reason: collision with root package name */
    private final String f7002b;

    private a(String str) {
        this.f7002b = str;
    }

    public final String toString() {
        return this.f7002b;
    }
}
