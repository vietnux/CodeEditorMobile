package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.internal.ads.w60;
import com.google.android.gms.internal.ads.x60;
import java.util.Date;

public final class c {
    private final w60 a;

    public static final class a {
        private final x60 a = new x60();

        public a() {
            this.a.b("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final a a(int i2) {
            this.a.a(i2);
            return this;
        }

        public final a a(Location location) {
            this.a.a(location);
            return this;
        }

        public final a a(Class<? extends b> cls, Bundle bundle) {
            this.a.a(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.a.c("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final a a(String str) {
            this.a.a(str);
            return this;
        }

        public final a a(Date date) {
            this.a.a(date);
            return this;
        }

        public final a a(boolean z) {
            this.a.b(z);
            return this;
        }

        public final c a() {
            return new c(this);
        }

        public final a b(String str) {
            this.a.b(str);
            return this;
        }

        public final a b(boolean z) {
            this.a.a(z);
            return this;
        }
    }

    private c(a aVar) {
        this.a = new w60(aVar.a);
    }

    public final w60 a() {
        return this.a;
    }
}
