package g.r.d;

import g.t.b;
import g.t.e;
import java.io.Serializable;

public abstract class c implements b, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f8613h = a.f8620b;

    /* renamed from: b  reason: collision with root package name */
    private transient b f8614b;

    /* renamed from: c  reason: collision with root package name */
    protected final Object f8615c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f8616d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8617e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8618f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8619g;

    private static class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        private static final a f8620b = new a();

        private a() {
        }
    }

    public c() {
        this(f8613h);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z) {
        this.f8615c = obj;
        this.f8616d = cls;
        this.f8617e = str;
        this.f8618f = str2;
        this.f8619g = z;
    }

    public b c() {
        b bVar = this.f8614b;
        if (bVar != null) {
            return bVar;
        }
        d();
        this.f8614b = this;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract b d();

    public Object e() {
        return this.f8615c;
    }

    public String f() {
        return this.f8617e;
    }

    public e g() {
        Class cls = this.f8616d;
        if (cls == null) {
            return null;
        }
        return this.f8619g ? o.b(cls) : o.a(cls);
    }

    /* access modifiers changed from: protected */
    public b h() {
        b c2 = c();
        if (c2 != this) {
            return c2;
        }
        throw new g.r.b();
    }

    public String i() {
        return this.f8618f;
    }
}
