package k.a.a.a.f;

import java.io.File;
import java.io.Serializable;

public class i extends a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final g f9532b;

    public i(g gVar) {
        if (gVar != null) {
            this.f9532b = gVar;
            return;
        }
        throw new IllegalArgumentException("The filter must not be null");
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file) {
        return !this.f9532b.accept(file);
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file, String str) {
        return !this.f9532b.accept(file, str);
    }

    @Override // k.a.a.a.f.a
    public String toString() {
        return super.toString() + "(" + this.f9532b.toString() + ")";
    }
}
