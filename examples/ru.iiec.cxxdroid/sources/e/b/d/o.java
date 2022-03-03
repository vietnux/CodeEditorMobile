package e.b.d;

import e.b.d.w.a;
import e.b.d.w.f;
import java.math.BigInteger;

public final class o extends j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f7910b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object a;

    public o(Boolean bool) {
        a(bool);
    }

    public o(Number number) {
        a(number);
    }

    public o(String str) {
        a(str);
    }

    private static boolean a(o oVar) {
        Object obj = oVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    private static boolean b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f7910b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            a.a((obj instanceof Number) || b(obj));
        }
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a == null) {
            return oVar.a == null;
        }
        if (a(this) && a(oVar)) {
            return m().longValue() == oVar.m().longValue();
        }
        if (!(this.a instanceof Number) || !(oVar.a instanceof Number)) {
            return this.a.equals(oVar.a);
        }
        double doubleValue = m().doubleValue();
        double doubleValue2 = oVar.m().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public boolean h() {
        return o() ? i().booleanValue() : Boolean.parseBoolean(n());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = m().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* access modifiers changed from: package-private */
    public Boolean i() {
        return (Boolean) this.a;
    }

    public double j() {
        return t() ? m().doubleValue() : Double.parseDouble(n());
    }

    public int k() {
        return t() ? m().intValue() : Integer.parseInt(n());
    }

    public long l() {
        return t() ? m().longValue() : Long.parseLong(n());
    }

    public Number m() {
        Object obj = this.a;
        return obj instanceof String ? new f((String) obj) : (Number) obj;
    }

    public String n() {
        return t() ? m().toString() : o() ? i().toString() : (String) this.a;
    }

    public boolean o() {
        return this.a instanceof Boolean;
    }

    public boolean t() {
        return this.a instanceof Number;
    }

    public boolean u() {
        return this.a instanceof String;
    }
}
