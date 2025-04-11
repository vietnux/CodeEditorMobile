package g.r.d;

import java.io.Serializable;

public abstract class j<R> implements h<R>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final int f8626b;

    public j(int i2) {
        this.f8626b = i2;
    }

    @Override // g.r.d.h
    public int d() {
        return this.f8626b;
    }

    public String toString() {
        String a = o.a(this);
        i.b(a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
