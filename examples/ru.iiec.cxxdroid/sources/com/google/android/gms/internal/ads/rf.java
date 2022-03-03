package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.e0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@k2
public final class rf implements e0<kf> {
    private boolean a;

    private static int a(Context context, Map<String, String> map, String str, int i2) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i2;
        }
        try {
            a50.b();
            return fc.a(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            qc.d(sb.toString());
            return i2;
        }
    }

    private static void a(we weVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                qc.d(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(kf kfVar, Map map) {
        int i2;
        int i3;
        int i4;
        kf kfVar2 = kfVar;
        String str = (String) map.get("action");
        if (str == null) {
            qc.d("Action missing from video GMSG.");
            return;
        }
        if (qc.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            qc.b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                qc.d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                kfVar2.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                qc.d("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    qc.d("No MIME types specified for decoder properties inspection.");
                    we.a(kfVar2, "missingMimeTypes");
                } else if (Build.VERSION.SDK_INT < 16) {
                    qc.d("Video decoder properties available on API versions >= 16.");
                    we.a(kfVar2, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    String[] split = str3.split(",");
                    for (String str4 : split) {
                        hashMap.put(str4, dc.a(str4.trim()));
                    }
                    we.a(kfVar2, hashMap);
                }
            } else {
                bf z0 = kfVar2.z0();
                if (z0 == null) {
                    qc.d("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = kfVar2.getContext();
                    int a2 = a(context, map, "x", 0);
                    int a3 = a(context, map, "y", 0);
                    int a4 = a(context, map, "w", -1);
                    int a5 = a(context, map, "h", -1);
                    if (((Boolean) a50.g().a(k80.e2)).booleanValue()) {
                        i3 = Math.min(a4, kfVar2.B0() - a2);
                        i2 = Math.min(a5, kfVar2.C0() - a3);
                    } else {
                        i3 = a4;
                        i2 = a5;
                    }
                    try {
                        i4 = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i4 = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || z0.c() != null) {
                        z0.a(a2, a3, i3, i2);
                        return;
                    }
                    z0.a(a2, a3, i3, i2, i4, parseBoolean, new jf((String) map.get("flags")));
                    we c2 = z0.c();
                    if (c2 != null) {
                        a(c2, map);
                        return;
                    }
                    return;
                }
                we c3 = z0.c();
                if (c3 == null) {
                    we.a(kfVar2);
                } else if ("click".equals(str)) {
                    Context context2 = kfVar2.getContext();
                    int a6 = a(context2, map, "x", 0);
                    int a7 = a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a6, (float) a7, 0);
                    c3.a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str5 = (String) map.get("time");
                    if (str5 == null) {
                        qc.d("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        c3.a((int) (Float.parseFloat(str5) * 1000.0f));
                    } catch (NumberFormatException unused3) {
                        String valueOf = String.valueOf(str5);
                        qc.d(valueOf.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf) : new String("Could not parse time parameter from currentTime video GMSG: "));
                    }
                } else if ("hide".equals(str)) {
                    c3.setVisibility(4);
                } else if ("load".equals(str)) {
                    c3.k();
                } else if ("loadControl".equals(str)) {
                    a(c3, map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        c3.l();
                    } else {
                        c3.m();
                    }
                } else if ("pause".equals(str)) {
                    c3.i();
                } else if ("play".equals(str)) {
                    c3.j();
                } else if ("show".equals(str)) {
                    c3.setVisibility(0);
                } else if ("src".equals(str)) {
                    c3.a((String) map.get("src"));
                } else if ("touchMove".equals(str)) {
                    Context context3 = kfVar2.getContext();
                    c3.a((float) a(context3, map, "dx", 0), (float) a(context3, map, "dy", 0));
                    if (!this.a) {
                        kfVar2.E0();
                        this.a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str6 = (String) map.get("volume");
                    if (str6 == null) {
                        qc.d("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        c3.setVolume(Float.parseFloat(str6));
                    } catch (NumberFormatException unused4) {
                        String valueOf2 = String.valueOf(str6);
                        qc.d(valueOf2.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf2) : new String("Could not parse volume parameter from volume video GMSG: "));
                    }
                } else if ("watermark".equals(str)) {
                    c3.n();
                } else {
                    String valueOf3 = String.valueOf(str);
                    qc.d(valueOf3.length() != 0 ? "Unknown video action: ".concat(valueOf3) : new String("Unknown video action: "));
                }
            }
        }
    }
}
