package c.t;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class s {
    public final Map<String, Object> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f2616b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<m> f2617c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2616b == sVar.f2616b && this.a.equals(sVar.a);
    }

    public int hashCode() {
        return (this.f2616b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2616b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
