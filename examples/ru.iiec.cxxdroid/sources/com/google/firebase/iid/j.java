package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import c.e.a;
import e.b.b.a.e.g;
import e.b.b.a.e.h;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
public final class j {
    private final Map<Pair<String, String>, h<String>> a = new a();

    j() {
    }

    private static String a(m mVar, h<String> hVar) {
        try {
            String a2 = mVar.a();
            hVar.a(a2);
            return a2;
        } catch (IOException | RuntimeException e2) {
            hVar.a(e2);
            throw e2;
        }
    }

    /* access modifiers changed from: private */
    public static String a(h<String> hVar) {
        try {
            return (String) e.b.b.a.e.j.a((g) hVar.a());
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(cause);
            }
        } catch (InterruptedException e3) {
            throw new IOException(e3);
        }
    }

    private final synchronized m b(String str, String str2, m mVar) {
        Pair<String, String> pair = new Pair<>(str, str2);
        h<String> hVar = this.a.get(pair);
        if (hVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return new k(hVar);
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        h<String> hVar2 = new h<>();
        this.a.put(pair, hVar2);
        return new l(this, mVar, hVar2, pair);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a(m mVar, h hVar, Pair pair) {
        try {
            String a2 = a(mVar, hVar);
            synchronized (this) {
                this.a.remove(pair);
            }
            return a2;
        } catch (Throwable th) {
            synchronized (this) {
                this.a.remove(pair);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2, m mVar) {
        return b(str, str2, mVar).a();
    }
}
