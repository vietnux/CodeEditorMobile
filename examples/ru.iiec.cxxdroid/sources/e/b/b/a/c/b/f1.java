package e.b.b.a.c.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.n;

public final class f1 extends l<i> {
    public f1(Context context, Looper looper, e eVar, f.a aVar, f.b bVar) {
        super(context, looper, 64, eVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.config.internal.IConfigService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new j(iBinder);
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.l, com.google.android.gms.common.internal.d
    public final int c() {
        return n.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String x() {
        return "com.google.android.gms.config.internal.IConfigService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.d
    public final String y() {
        return "com.google.android.gms.config.START";
    }
}
