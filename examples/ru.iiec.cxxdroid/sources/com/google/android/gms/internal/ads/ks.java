package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ks implements rs {
    private rs[] a;

    ks(rs... rsVarArr) {
        this.a = rsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final boolean a(Class<?> cls) {
        for (rs rsVar : this.a) {
            if (rsVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rs
    public final qs b(Class<?> cls) {
        rs[] rsVarArr = this.a;
        for (rs rsVar : rsVarArr) {
            if (rsVar.a(cls)) {
                return rsVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
