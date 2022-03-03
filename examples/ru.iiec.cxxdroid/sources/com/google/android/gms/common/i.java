package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.dynamite.DynamiteModule;
import e.b.b.a.b.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class i {
    private static volatile v a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f3613b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Context f3614c;

    /* access modifiers changed from: package-private */
    public static abstract class a extends s.a {

        /* renamed from: b  reason: collision with root package name */
        private int f3615b;

        protected a(byte[] bArr) {
            y.a(bArr.length == 25);
            this.f3615b = Arrays.hashCode(bArr);
        }

        protected static byte[] a(String str) {
            try {
                return str.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.android.gms.common.internal.s
        public int E0() {
            return hashCode();
        }

        /* access modifiers changed from: package-private */
        public abstract byte[] M();

        public boolean equals(Object obj) {
            e.b.b.a.b.a l1;
            if (obj != null && (obj instanceof s)) {
                try {
                    s sVar = (s) obj;
                    if (sVar.E0() == hashCode() && (l1 = sVar.l1()) != null) {
                        return Arrays.equals(M(), (byte[]) b.y(l1));
                    }
                    return false;
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f3615b;
        }

        @Override // com.google.android.gms.common.internal.s
        public e.b.b.a.b.a l1() {
            return b.a(M());
        }
    }

    static z a(String str, a aVar, boolean z) {
        String str2;
        try {
            a();
            y.a(f3614c);
            try {
                if (a.a(new j(str, aVar, z), b.a(f3614c.getPackageManager()))) {
                    return z.c();
                }
                boolean z2 = true;
                if (z || !a(str, aVar, true).a) {
                    z2 = false;
                }
                return z.a(str, aVar, z, z2);
            } catch (RemoteException e2) {
                e = e2;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                str2 = "module call";
                return z.a(str2, e);
            }
        } catch (DynamiteModule.a e3) {
            e = e3;
            str2 = "module init";
            return z.a(str2, e);
        }
    }

    private static void a() {
        if (a == null) {
            y.a(f3614c);
            synchronized (f3613b) {
                if (a == null) {
                    a = v.a.a(DynamiteModule.a(f3614c, DynamiteModule.f3740i, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }

    static synchronized void a(Context context) {
        synchronized (i.class) {
            if (f3614c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f3614c = context.getApplicationContext();
            }
        }
    }
}
