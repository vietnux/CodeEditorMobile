package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.common.api.h;
import java.lang.ref.WeakReference;
import java.util.Map;

@k2
public abstract class wf implements h {

    /* renamed from: b  reason: collision with root package name */
    protected Context f5937b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<kf> f5938c;

    public wf(kf kfVar) {
        this.f5937b = kfVar.getContext();
        x0.f().a(this.f5937b, kfVar.p0().f5529b);
        this.f5938c = new WeakReference<>(kfVar);
    }

    /* access modifiers changed from: private */
    public final void a(String str, Map<String, String> map) {
        kf kfVar = this.f5938c.get();
        if (kfVar != null) {
            kfVar.a(str, map);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: private */
    public static String b(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return "internal";
            case 6:
            case 7:
                return "io";
            case '\b':
            case '\t':
                return "network";
            case '\n':
            case 11:
                return "policy";
        }
    }

    @Override // com.google.android.gms.common.api.h
    public void a() {
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i2) {
        fc.a.post(new yf(this, str, str2, i2));
    }

    public final void a(String str, String str2, String str3, String str4) {
        fc.a.post(new zf(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);

    public abstract void b();
}
