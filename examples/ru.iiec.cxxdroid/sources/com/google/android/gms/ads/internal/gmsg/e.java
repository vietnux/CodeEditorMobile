package com.google.android.gms.ads.internal.gmsg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.v1;
import com.google.android.gms.ads.internal.x0;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.d;
import com.google.android.gms.internal.ads.d40;
import com.google.android.gms.internal.ads.dx;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.sc;
import com.google.android.gms.internal.ads.sh;
import java.net.URISyntaxException;
import java.util.Map;

@k2
public final class e<T extends hh & ih & mh & ph & sh> implements e0<T> {
    private final v1 a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3165b;

    public e(Context context, sc scVar, cx cxVar, t tVar, d40 d40, k kVar, m mVar, n nVar, v1 v1Var, d dVar) {
        this.a = v1Var;
        this.f3165b = dVar;
    }

    static String a(Context context, cx cxVar, String str, View view, Activity activity) {
        if (cxVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (cxVar.b(parse)) {
                parse = cxVar.a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (dx unused) {
            return str;
        } catch (Exception e2) {
            x0.j().a(e2, "OpenGmsgHandler.maybeAddClickSignalsToUrl");
            return str;
        }
    }

    private final void a(boolean z) {
        d dVar = this.f3165b;
        if (dVar != null) {
            dVar.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return x0.h().b();
        }
        if ("l".equalsIgnoreCase(str)) {
            return x0.h().a();
        }
        if ("c".equalsIgnoreCase(str)) {
            return x0.h().c();
        }
        return -1;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(Object obj, Map map) {
        hh hhVar = (hh) obj;
        String a2 = k8.a((String) map.get("u"), hhVar.getContext());
        String str = (String) map.get("a");
        if (str == null) {
            qc.d("Action missing from an open GMSG.");
            return;
        }
        v1 v1Var = this.a;
        if (v1Var != null && !v1Var.b()) {
            this.a.a(a2);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((ih) hhVar).e0()) {
                qc.d("Cannot expand WebView that is already expanded.");
                return;
            }
            a(false);
            ((mh) hhVar).a(a(map), b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            a(false);
            mh mhVar = (mh) hhVar;
            boolean a3 = a(map);
            if (a2 != null) {
                mhVar.a(a3, b(map), a2);
            } else {
                mhVar.a(a3, b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            a(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str2);
                    qc.b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = a(hhVar.getContext(), ((ph) hhVar).l0(), uri, ((sh) hhVar).getView(), hhVar.b0());
                    } catch (Exception e3) {
                        qc.b("Error occurred while adding signals.", e3);
                        x0.j().a(e3, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Exception e4) {
                        String valueOf2 = String.valueOf(uri);
                        qc.b(valueOf2.length() != 0 ? "Error parsing the uri: ".concat(valueOf2) : new String("Error parsing the uri: "), e4);
                        x0.j().a(e4, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((mh) hhVar).a(new c(intent));
                return;
            }
            if (!TextUtils.isEmpty(a2)) {
                a2 = a(hhVar.getContext(), ((ph) hhVar).l0(), a2, ((sh) hhVar).getView(), hhVar.b0());
            }
            ((mh) hhVar).a(new c((String) map.get("i"), a2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            a(true);
            hhVar.getContext();
            if (TextUtils.isEmpty(a2)) {
                qc.d("Destination url cannot be empty.");
                return;
            }
            try {
                ((mh) hhVar).a(new c(new f(hhVar.getContext(), ((ph) hhVar).l0(), ((sh) hhVar).getView()).a(map)));
            } catch (ActivityNotFoundException e5) {
                qc.d(e5.getMessage());
            }
        }
    }
}
