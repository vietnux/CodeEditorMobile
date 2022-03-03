package i.f0.i;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: b  reason: collision with root package name */
    public final int f8947b;

    private b(int i2) {
        this.f8947b = i2;
    }

    public static b a(int i2) {
        b[] values = values();
        for (b bVar : values) {
            if (bVar.f8947b == i2) {
                return bVar;
            }
        }
        return null;
    }
}
