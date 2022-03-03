package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public class i {

    public static class a {
        final Bundle a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1020b;

        /* renamed from: c  reason: collision with root package name */
        private final m[] f1021c;

        /* renamed from: d  reason: collision with root package name */
        private final m[] f1022d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1023e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1024f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1025g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1026h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f1027i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1028j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1029k;

        public PendingIntent a() {
            return this.f1029k;
        }

        public boolean b() {
            return this.f1023e;
        }

        public m[] c() {
            return this.f1022d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i2;
            if (this.f1020b == null && (i2 = this.f1027i) != 0) {
                this.f1020b = IconCompat.a(null, "", i2);
            }
            return this.f1020b;
        }

        public m[] f() {
            return this.f1021c;
        }

        public int g() {
            return this.f1025g;
        }

        public boolean h() {
            return this.f1024f;
        }

        public CharSequence i() {
            return this.f1028j;
        }

        public boolean j() {
            return this.f1026h;
        }
    }

    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1030e;

        public b a(CharSequence charSequence) {
            this.f1030e = d.d(charSequence);
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.core.app.i.e
        public String a() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.i.e
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f1030e);
            }
        }

        @Override // androidx.core.app.i.e
        public void a(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f1043b).bigText(this.f1030e);
                if (this.f1045d) {
                    bigText.setSummaryText(this.f1044c);
                }
            }
        }
    }

    public static final class c {

        /* access modifiers changed from: private */
        public static class a {
            static Notification.BubbleMetadata a(c cVar) {
                if (cVar == null) {
                    return null;
                }
                cVar.a();
                throw null;
            }
        }

        /* access modifiers changed from: private */
        public static class b {
            static Notification.BubbleMetadata a(c cVar) {
                if (cVar == null) {
                    return null;
                }
                cVar.b();
                throw null;
            }
        }

        public static Notification.BubbleMetadata a(c cVar) {
            if (cVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(cVar);
            }
            if (i2 == 29) {
                return a.a(cVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent a() {
            throw null;
        }

        public String b() {
            throw null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        c.h.d.b N;
        long O;
        int P;
        boolean Q;
        c R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;
        public Context a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1031b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<l> f1032c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1033d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1034e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1035f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1036g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1037h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f1038i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f1039j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f1040k;

        /* renamed from: l  reason: collision with root package name */
        int f1041l;

        /* renamed from: m  reason: collision with root package name */
        int f1042m;
        boolean n;
        boolean o;
        e p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f1031b = new ArrayList<>();
            this.f1032c = new ArrayList<>();
            this.f1033d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.S = new Notification();
            this.a = context;
            this.K = str;
            this.S.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f1042m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        private void a(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.S;
                i3 = i2 | notification.flags;
            } else {
                notification = this.S;
                i3 = (~i2) & notification.flags;
            }
            notification.flags = i3;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            return new j(this).b();
        }

        public d a(int i2) {
            this.E = i2;
            return this;
        }

        public d a(long j2) {
            this.S.when = j2;
            return this;
        }

        public d a(PendingIntent pendingIntent) {
            this.f1036g = pendingIntent;
            return this;
        }

        public d a(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public d a(e eVar) {
            if (this.p != eVar) {
                this.p = eVar;
                e eVar2 = this.p;
                if (eVar2 != null) {
                    eVar2.a(this);
                }
            }
            return this;
        }

        public d a(CharSequence charSequence) {
            this.f1035f = d(charSequence);
            return this;
        }

        public d a(String str) {
            this.K = str;
            return this;
        }

        public d a(boolean z2) {
            a(16, z2);
            return this;
        }

        public Bundle b() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d b(int i2) {
            this.S.icon = i2;
            return this;
        }

        public d b(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.f1034e = d(charSequence);
            return this;
        }

        public d b(boolean z2) {
            this.z = z2;
            return this;
        }

        public d c(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }
    }

    public static abstract class e {
        protected d a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1043b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1044c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1045d = false;

        /* access modifiers changed from: protected */
        public abstract String a();

        public void a(Bundle bundle) {
            if (this.f1045d) {
                bundle.putCharSequence("android.summaryText", this.f1044c);
            }
            CharSequence charSequence = this.f1043b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String a2 = a();
            if (a2 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", a2);
            }
        }

        public abstract void a(h hVar);

        public void a(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                d dVar2 = this.a;
                if (dVar2 != null) {
                    dVar2.a(this);
                }
            }
        }

        public RemoteViews b(h hVar) {
            return null;
        }

        public RemoteViews c(h hVar) {
            return null;
        }

        public RemoteViews d(h hVar) {
            return null;
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return k.a(notification);
        }
        return null;
    }
}
