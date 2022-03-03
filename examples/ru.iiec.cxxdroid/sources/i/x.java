package i;

import i.f0.b;
import i.f0.g.g;
import i.f0.g.j;
import i.f0.k.f;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class x implements e {

    /* renamed from: b  reason: collision with root package name */
    final v f9214b;

    /* renamed from: c  reason: collision with root package name */
    final j f9215c;

    /* renamed from: d  reason: collision with root package name */
    private p f9216d;

    /* renamed from: e  reason: collision with root package name */
    final y f9217e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f9218f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9219g;

    /* access modifiers changed from: package-private */
    public final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        private final f f9220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x f9221d;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[SYNTHETIC, Splitter:B:13:0x003d] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005d A[Catch:{ all -> 0x0036 }] */
        @Override // i.f0.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b() {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: i.x.a.b():void");
        }

        /* access modifiers changed from: package-private */
        public x c() {
            return this.f9221d;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return this.f9221d.f9217e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z) {
        this.f9214b = vVar;
        this.f9217e = yVar;
        this.f9218f = z;
        this.f9215c = new j(vVar, z);
    }

    static x a(v vVar, y yVar, boolean z) {
        x xVar = new x(vVar, yVar, z);
        xVar.f9216d = vVar.j().a(xVar);
        return xVar;
    }

    private void e() {
        this.f9215c.a(f.d().a("response.body().close()"));
    }

    /* access modifiers changed from: package-private */
    public a0 a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9214b.r());
        arrayList.add(this.f9215c);
        arrayList.add(new i.f0.g.a(this.f9214b.g()));
        arrayList.add(new i.f0.e.a(this.f9214b.s()));
        arrayList.add(new i.f0.f.a(this.f9214b));
        if (!this.f9218f) {
            arrayList.addAll(this.f9214b.t());
        }
        arrayList.add(new i.f0.g.b(this.f9218f));
        return new g(arrayList, null, null, null, 0, this.f9217e, this, this.f9216d, this.f9214b.d(), this.f9214b.z(), this.f9214b.D()).a(this.f9217e);
    }

    public boolean b() {
        return this.f9215c.a();
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f9217e.g().l();
    }

    @Override // java.lang.Object
    public x clone() {
        return a(this.f9214b, this.f9217e, this.f9218f);
    }

    /* access modifiers changed from: package-private */
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() ? "canceled " : "");
        sb.append(this.f9218f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    @Override // i.e
    public a0 o() {
        synchronized (this) {
            if (!this.f9219g) {
                this.f9219g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        e();
        this.f9216d.b(this);
        try {
            this.f9214b.h().a(this);
            a0 a2 = a();
            if (a2 != null) {
                this.f9214b.h().b(this);
                return a2;
            }
            throw new IOException("Canceled");
        } catch (IOException e2) {
            this.f9216d.a(this, e2);
            throw e2;
        } catch (Throwable th) {
            this.f9214b.h().b(this);
            throw th;
        }
    }
}
