package e.b.b.a.d.d;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.b.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.n;
import e.b.b.a.d.b;
import e.b.b.a.d.c;
import e.b.b.a.d.d.e;

public class f extends l<e> implements b {
    private final Bundle A;
    private Integer B;
    private final boolean y;
    private final e z;

    public f(Context context, Looper looper, boolean z2, e eVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.y = z2;
        this.z = eVar;
        this.A = bundle;
        this.B = eVar.d();
    }

    public f(Context context, Looper looper, boolean z2, e eVar, c cVar, f.a aVar, f.b bVar) {
        this(context, looper, z2, eVar, a(eVar), aVar, bVar);
    }

    public static Bundle a(e eVar) {
        c h2 = eVar.h();
        Integer d2 = eVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (d2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d2.intValue());
        }
        if (h2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h2.g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h2.f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h2.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h2.e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h2.b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h2.h());
            if (h2.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h2.a().longValue());
            }
            if (h2.c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h2.c().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public e a(IBinder iBinder) {
        return e.a.a(iBinder);
    }

    @Override // e.b.b.a.d.b
    public void a(d dVar) {
        y.a(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b2 = this.z.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b2.name)) {
                googleSignInAccount = a.a(p()).a();
            }
            ((e) v()).a(new g(new z(b2, this.B.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new i(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.l, com.google.android.gms.common.internal.d
    public int c() {
        return n.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // e.b.b.a.d.b
    public void h() {
        a(new d.g());
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.d
    public boolean i() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public Bundle q() {
        if (!p().getPackageName().equals(this.z.f())) {
            this.A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.z.f());
        }
        return this.A;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public String x() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public String y() {
        return "com.google.android.gms.signin.service.START";
    }
}
