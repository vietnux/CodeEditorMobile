package e.b.d;

import e.b.d.w.g;
import java.util.Map;
import java.util.Set;

public final class m extends j {
    private final g<String, j> a = new g<>();

    public void a(String str, j jVar) {
        if (jVar == null) {
            jVar = l.a;
        }
        this.a.put(str, jVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).a.equals(this.a));
    }

    public Set<Map.Entry<String, j>> h() {
        return this.a.entrySet();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
