package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.ads.internal.x0;
import java.util.Map;

@k2
public final class sf implements e0<kf> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.ads.internal.gmsg.e0
    public final /* synthetic */ void zza(kf kfVar, Map map) {
        Throwable e2;
        kf kfVar2 = kfVar;
        if (((Boolean) a50.g().a(k80.t1)).booleanValue()) {
            bh s0 = kfVar2.s0();
            if (s0 == null) {
                try {
                    bh bhVar = new bh(kfVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    kfVar2.a(bhVar);
                    s0 = bhVar;
                } catch (NullPointerException e3) {
                    e2 = e3;
                    qc.b("Unable to parse videoMeta message.", e2);
                    x0.j().a(e2, "VideoMetaGmsgHandler.onGmsg");
                    return;
                } catch (NumberFormatException e4) {
                    e2 = e4;
                    qc.b("Unable to parse videoMeta message.", e2);
                    x0.j().a(e2, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (qc.a(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79);
                sb.append("Video Meta GMSG: isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(parseInt);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                qc.b(sb.toString());
            }
            s0.a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
