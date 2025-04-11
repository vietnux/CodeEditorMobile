package f.a.a.a.n.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import f.a.a.a.l;
import f.a.a.a.n.f.d;

/* access modifiers changed from: package-private */
public class c {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.a.a.n.f.c f8377b;

    /* access modifiers changed from: package-private */
    public class a extends h {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f8378b;

        a(b bVar) {
            this.f8378b = bVar;
        }

        @Override // f.a.a.a.n.b.h
        public void a() {
            b e2 = c.this.e();
            if (!this.f8378b.equals(e2)) {
                f.a.a.a.c.g().e("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                c.this.c(e2);
            }
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
        this.f8377b = new d(context, "TwitterAdvertisingInfoPreferences");
    }

    private boolean a(b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.a);
    }

    private void b(b bVar) {
        new Thread(new a(bVar)).start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @SuppressLint({"CommitPrefEdits"})
    private void c(b bVar) {
        if (a(bVar)) {
            f.a.a.a.n.f.c cVar = this.f8377b;
            cVar.a(cVar.a().putString("advertising_id", bVar.a).putBoolean("limit_ad_tracking_enabled", bVar.f8376b));
            return;
        }
        f.a.a.a.n.f.c cVar2 = this.f8377b;
        cVar2.a(cVar2.a().remove("advertising_id").remove("limit_ad_tracking_enabled"));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private b e() {
        String str;
        l lVar;
        b a2 = c().a();
        if (!a(a2)) {
            a2 = d().a();
            if (!a(a2)) {
                lVar = f.a.a.a.c.g();
                str = "AdvertisingInfo not present";
            } else {
                lVar = f.a.a.a.c.g();
                str = "Using AdvertisingInfo from Service Provider";
            }
        } else {
            lVar = f.a.a.a.c.g();
            str = "Using AdvertisingInfo from Reflection Provider";
        }
        lVar.e("Fabric", str);
        return a2;
    }

    public b a() {
        b b2 = b();
        if (a(b2)) {
            f.a.a.a.c.g().e("Fabric", "Using AdvertisingInfo from Preference Store");
            b(b2);
            return b2;
        }
        b e2 = e();
        c(e2);
        return e2;
    }

    /* access modifiers changed from: protected */
    public b b() {
        return new b(this.f8377b.get().getString("advertising_id", ""), this.f8377b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    public f c() {
        return new d(this.a);
    }

    public f d() {
        return new e(this.a);
    }
}
