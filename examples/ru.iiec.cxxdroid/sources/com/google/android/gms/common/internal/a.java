package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.r;

public class a extends r.a {
    public static Account a(r rVar) {
        if (rVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return rVar.f();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
