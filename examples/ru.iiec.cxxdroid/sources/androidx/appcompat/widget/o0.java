package androidx.appcompat.widget;

/* access modifiers changed from: package-private */
public class o0 {
    private int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f666b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f667c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f668d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f669e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f670f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f671g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f672h = false;

    o0() {
    }

    public int a() {
        return this.f671g ? this.a : this.f666b;
    }

    public void a(int i2, int i3) {
        this.f672h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f669e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f670f = i3;
            this.f666b = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f671g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f671g = r2
            boolean r0 = r1.f672h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f668d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f669e
        L_0x0016:
            r1.a = r2
            int r2 = r1.f667c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f667c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f669e
        L_0x0024:
            r1.a = r2
            int r2 = r1.f668d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f669e
            r1.a = r2
        L_0x002f:
            int r2 = r1.f670f
        L_0x0031:
            r1.f666b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.a(boolean):void");
    }

    public int b() {
        return this.a;
    }

    public void b(int i2, int i3) {
        this.f667c = i2;
        this.f668d = i3;
        this.f672h = true;
        if (this.f671g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f666b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f666b = i3;
        }
    }

    public int c() {
        return this.f666b;
    }

    public int d() {
        return this.f671g ? this.f666b : this.a;
    }
}
