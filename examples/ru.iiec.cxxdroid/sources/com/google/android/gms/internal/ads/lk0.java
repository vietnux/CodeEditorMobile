package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.s;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class lk0 extends hk0 {

    /* renamed from: b  reason: collision with root package name */
    private final yi f4903b;

    public lk0(yi yiVar) {
        this.f4903b = yiVar;
    }

    private static Bundle o(String str) {
        String valueOf = String.valueOf(str);
        qc.d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            qc.b("", e2);
            throw new RemoteException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: com.google.android.gms.internal.ads.yi */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.bj, com.google.android.gms.internal.ads.ok0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.google.android.gms.internal.ads.gk0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(e.b.b.a.b.a r8, java.lang.String r9, android.os.Bundle r10, com.google.android.gms.internal.ads.ik0 r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lk0.a(e.b.b.a.b.a, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final void a(byte[] bArr, String str, Bundle bundle, a aVar, ck0 ck0, xi0 xi0, n40 n40) {
        try {
            mk0 mk0 = new mk0(this, ck0, xi0);
            yi yiVar = this.f4903b;
            new xi((Context) b.y(aVar), bArr, o(str), bundle);
            s.a(n40.f5050f, n40.f5047c, n40.f5046b);
            mk0.a(String.valueOf(yiVar.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            qc.b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final void a(byte[] bArr, String str, Bundle bundle, a aVar, ek0 ek0, xi0 xi0) {
        try {
            nk0 nk0 = new nk0(this, ek0, xi0);
            yi yiVar = this.f4903b;
            new xi((Context) b.y(aVar), bArr, o(str), bundle);
            nk0.a(String.valueOf(yiVar.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            qc.b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final o60 getVideoController() {
        yi yiVar = this.f4903b;
        if (!(yiVar instanceof n)) {
            return null;
        }
        try {
            return ((n) yiVar).getVideoController();
        } catch (Throwable th) {
            qc.b("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final pk0 o1() {
        return pk0.a(this.f4903b.a());
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final void showInterstitial() {
        wi wiVar = null;
        try {
            wiVar.a();
        } catch (Throwable th) {
            qc.b("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.gk0
    public final pk0 w1() {
        return pk0.a(this.f4903b.b());
    }
}
