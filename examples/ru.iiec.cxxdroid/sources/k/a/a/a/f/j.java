package k.a.a.a.f;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class j extends a implements c, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f9533b;

    public j(List<g> list) {
        if (list == null) {
            this.f9533b = new ArrayList();
        } else {
            this.f9533b = new ArrayList(list);
        }
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file) {
        for (g gVar : this.f9533b) {
            if (gVar.accept(file)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file, String str) {
        for (g gVar : this.f9533b) {
            if (gVar.accept(file, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.a.a.a.f.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f9533b != null) {
            for (int i2 = 0; i2 < this.f9533b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                g gVar = this.f9533b.get(i2);
                sb.append(gVar == null ? "null" : gVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
