package h.b.a.c;

import h.b.a.c.j;

public abstract class a<T extends j> extends e<g, T> {
    protected a(T t, int i2) {
        super(t, i2);
    }

    private void a(String str, Class<?> cls, String str2) {
        if (str == null) {
            throw new k("The value for key <" + str2 + "> is null. " + "You obviously saved this value as String and try to access it with type " + cls.getSimpleName() + " which cannot be null. " + " Always use getString(key, defaultValue) when accessing data you saved with put(String).");
        }
    }

    public int b(String str) {
        String c2 = c(str);
        a(c2, Integer.class, str);
        try {
            return Integer.parseInt(c2);
        } catch (NumberFormatException e2) {
            throw new k(e2);
        }
    }

    public int b(String str, int i2) {
        try {
            return b(str);
        } catch (b unused) {
            return i2;
        }
    }

    public String c() {
        return ((j) a()).a();
    }

    public String c(String str) {
        g gVar = (g) a(str);
        if (gVar != null) {
            return gVar.a();
        }
        throw new b("Value for Key <%s> not found", str);
    }

    public String toString() {
        return getClass().getSimpleName() + "(@" + Integer.toHexString(hashCode()) + "){" + "name=" + c() + "}";
    }
}
