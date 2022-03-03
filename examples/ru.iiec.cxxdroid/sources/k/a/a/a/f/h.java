package k.a.a.a.f;

import java.io.File;
import java.io.Serializable;
import k.a.a.a.d;

public class h extends a implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final String[] f9530b;

    /* renamed from: c  reason: collision with root package name */
    private final d f9531c;

    public h(String str) {
        this(str, null);
    }

    public h(String str, d dVar) {
        if (str != null) {
            this.f9530b = new String[]{str};
            this.f9531c = dVar == null ? d.f9522d : dVar;
            return;
        }
        throw new IllegalArgumentException("The wildcard must not be null");
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f9530b) {
            if (this.f9531c.a(name, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.a.a.a.f.g, k.a.a.a.f.a
    public boolean accept(File file, String str) {
        for (String str2 : this.f9530b) {
            if (this.f9531c.a(str, str2)) {
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
        if (this.f9530b != null) {
            for (int i2 = 0; i2 < this.f9530b.length; i2++) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(this.f9530b[i2]);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
