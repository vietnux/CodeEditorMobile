package g.s;

import g.o.v;
import java.util.NoSuchElementException;

public final class c extends v {

    /* renamed from: b  reason: collision with root package name */
    private final int f8632b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8633c;

    /* renamed from: d  reason: collision with root package name */
    private int f8634d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8635e;

    public c(int i2, int i3, int i4) {
        this.f8635e = i4;
        this.f8632b = i3;
        boolean z = true;
        if (this.f8635e <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f8633c = z;
        this.f8634d = !this.f8633c ? this.f8632b : i2;
    }

    @Override // g.o.v
    public int a() {
        int i2 = this.f8634d;
        if (i2 != this.f8632b) {
            this.f8634d = this.f8635e + i2;
        } else if (this.f8633c) {
            this.f8633c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.f8633c;
    }
}
