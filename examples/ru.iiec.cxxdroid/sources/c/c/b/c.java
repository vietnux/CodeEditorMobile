package c.c.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.e;
import java.util.ArrayList;

public final class c {
    public final Intent a;

    public static final class a {
        private final Intent a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<Bundle> f1906b;

        /* renamed from: c  reason: collision with root package name */
        private Bundle f1907c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<Bundle> f1908d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1909e;

        public a() {
            this(null);
        }

        public a(e eVar) {
            this.a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f1906b = null;
            this.f1907c = null;
            this.f1908d = null;
            this.f1909e = true;
            if (eVar != null) {
                this.a.setPackage(eVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            e.a(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.a() : iBinder);
            this.a.putExtras(bundle);
        }

        public c a() {
            ArrayList<Bundle> arrayList = this.f1906b;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1908d;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1909e);
            return new c(this.a, this.f1907c);
        }
    }

    c(Intent intent, Bundle bundle) {
        this.a = intent;
    }
}
