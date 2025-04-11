package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class u {
    private final HashMap<String, s> a = new HashMap<>();

    /* access modifiers changed from: package-private */
    public final s a(String str) {
        return this.a.get(str);
    }

    public final void a() {
        for (s sVar : this.a.values()) {
            sVar.a();
        }
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, s sVar) {
        s put = this.a.put(str, sVar);
        if (put != null) {
            put.b();
        }
    }

    /* access modifiers changed from: package-private */
    public Set<String> b() {
        return new HashSet(this.a.keySet());
    }
}
