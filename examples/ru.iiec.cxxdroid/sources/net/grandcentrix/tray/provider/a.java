package net.grandcentrix.tray.provider;

import android.content.Context;
import h.b.a.c.g;
import h.b.a.c.h;
import h.b.a.c.i;
import h.b.a.c.j;
import java.util.List;
import java.util.WeakHashMap;
import net.grandcentrix.tray.provider.f;

public class a extends j {

    /* renamed from: c  reason: collision with root package name */
    private final Context f9554c;

    /* renamed from: d  reason: collision with root package name */
    private final e f9555d = new e(this.f9554c);

    /* renamed from: e  reason: collision with root package name */
    private final f f9556e = new f(this.f9554c);

    public a(Context context, String str, j.a aVar) {
        super(str, aVar);
        new WeakHashMap();
        this.f9554c = context.getApplicationContext();
    }

    @Override // h.b.a.c.d
    public g a(String str) {
        f.a a = this.f9556e.a();
        a.a(b());
        a.b(a());
        a.a(str);
        List<g> b2 = this.f9555d.b(a.a());
        int size = b2.size();
        if (size > 1) {
            h.c("found more than one item for key '" + str + "' in module " + a() + ". " + "This can be caused by using the same name for a device and user specific preference.");
            for (int i2 = 0; i2 < b2.size(); i2++) {
                h.a("item #" + i2 + " " + b2.get(i2));
            }
        }
        if (size > 0) {
            return b2.get(0);
        }
        return null;
    }

    @Override // h.b.a.c.d
    public boolean a(int i2) {
        if (b() != j.a.UNDEFINED) {
            f.a a = this.f9556e.a();
            a.a(true);
            a.a(b());
            a.b(a());
            a.a("version");
            return this.f9555d.a(a.a(), String.valueOf(i2));
        }
        throw new i("writing data into a storage with type UNDEFINED is forbidden. Only Read and delete is allowed.");
    }

    @Override // h.b.a.c.d
    public boolean a(String str, Object obj) {
        return a(str, null, obj);
    }

    public boolean a(String str, String str2, Object obj) {
        if (b() != j.a.UNDEFINED) {
            String valueOf = obj == null ? null : String.valueOf(obj);
            f.a a = this.f9556e.a();
            a.a(b());
            a.b(a());
            a.a(str);
            return this.f9555d.a(a.a(), valueOf, str2);
        }
        throw new i("writing data into a storage with type UNDEFINED is forbidden. Only Read and delete is allowed.");
    }

    @Override // h.b.a.c.d
    public int getVersion() {
        f.a a = this.f9556e.a();
        a.a(true);
        a.a(b());
        a.b(a());
        a.a("version");
        List<g> a2 = this.f9555d.a(a.a());
        if (a2.size() == 0) {
            return 0;
        }
        return Integer.valueOf(a2.get(0).a()).intValue();
    }
}
