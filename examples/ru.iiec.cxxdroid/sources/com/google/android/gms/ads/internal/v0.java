package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.k80;
import com.google.android.gms.internal.ads.qc;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class v0 extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ r0 a;

    private v0(r0 r0Var) {
        this.a = r0Var;
    }

    /* synthetic */ v0(r0 r0Var, s0 s0Var) {
        this(r0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.a.f3328i = (cx) this.a.f3323d.get(((Long) a50.g().a(k80.y2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            qc.c("", e2);
        }
        return this.a.f2();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        if (this.a.f3326g != null && str2 != null) {
            this.a.f3326g.loadUrl(str2);
        }
    }
}
