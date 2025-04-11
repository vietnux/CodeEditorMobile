package k.a.a.a.f;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class b extends a implements c, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f9525b;

    public b(List<g> list) {
        if (list == null) {
            this.f9525b = new ArrayList();
        } else {
            this.f9525b = new ArrayList(list);
        }
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file) {
        if (this.f9525b.isEmpty()) {
            return false;
        }
        for (g gVar : this.f9525b) {
            if (!gVar.accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file, String str) {
        if (this.f9525b.isEmpty()) {
            return false;
        }
        for (g gVar : this.f9525b) {
            if (!gVar.accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    @Override // k.a.a.a.f.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f9525b != null) {
            for (int i2 = 0; i2 < this.f9525b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                g gVar = this.f9525b.get(i2);
                sb.append(gVar == null ? "null" : gVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
