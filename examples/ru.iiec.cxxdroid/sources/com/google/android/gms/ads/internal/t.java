package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.e0;
import com.google.android.gms.internal.ads.ai0;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.k2;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.q8;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r90;
import com.google.android.gms.internal.ads.ya0;
import com.google.android.gms.internal.ads.za0;
import e.b.b.a.b.a;
import e.b.b.a.b.b;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@k2
public final class t {
    public static View a(q8 q8Var) {
        lg lgVar;
        if (q8Var == null) {
            qc.a("AdState is null");
            return null;
        } else if (b(q8Var) && (lgVar = q8Var.f5319b) != null) {
            return lgVar.getView();
        } else {
            try {
                a view = q8Var.p != null ? q8Var.p.getView() : null;
                if (view != null) {
                    return (View) b.y(view);
                }
                qc.d("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e2) {
                qc.c("Could not get View from mediation adapter.", e2);
                return null;
            }
        }
    }

    static e0<lg> a(dj0 dj0, hj0 hj0, d dVar) {
        return new y(dj0, dVar, hj0);
    }

    private static ya0 a(Object obj) {
        if (obj instanceof IBinder) {
            return za0.a((IBinder) obj);
        }
        return null;
    }

    private static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            qc.d("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String a(ya0 ya0) {
        if (ya0 == null) {
            qc.d("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri t1 = ya0.t1();
            if (t1 != null) {
                return t1.toString();
            }
        } catch (RemoteException unused) {
            qc.d("Unable to get image uri. Trying data uri next");
        }
        return b(ya0);
    }

    private static JSONObject a(Bundle bundle, String str) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (bundle.containsKey(next)) {
                    if ("image".equals(jSONObject2.getString(next))) {
                        Object obj = bundle.get(next);
                        if (obj instanceof Bitmap) {
                            str2 = a((Bitmap) obj);
                            jSONObject.put(next, str2);
                        } else {
                            str3 = "Invalid type. An image type extra should return a bitmap";
                        }
                    } else if (bundle.get(next) instanceof Bitmap) {
                        str3 = "Invalid asset type. Bitmap should be returned only for image type";
                    } else {
                        str2 = String.valueOf(bundle.get(next));
                        jSONObject.put(next, str2);
                    }
                    qc.d(str3);
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void a(lg lgVar) {
        View.OnClickListener onClickListener = lgVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(lgVar.getView());
        }
    }

    static final /* synthetic */ void a(p90 p90, String str, lg lgVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", p90.g());
            jSONObject.put("body", p90.h());
            jSONObject.put("call_to_action", p90.j());
            jSONObject.put("price", p90.x());
            jSONObject.put("star_rating", String.valueOf(p90.t()));
            jSONObject.put("store", p90.A());
            jSONObject.put("icon", a(p90.B()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = p90.b();
            if (b2 != null) {
                for (Object obj : b2) {
                    jSONArray.put(a(a(obj)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", a(p90.m(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            lgVar.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e2) {
            qc.c("Exception occurred when loading assets", e2);
        }
    }

    static final /* synthetic */ void a(r90 r90, String str, lg lgVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", r90.g());
            jSONObject.put("body", r90.h());
            jSONObject.put("call_to_action", r90.j());
            jSONObject.put("advertiser", r90.z());
            jSONObject.put("logo", a(r90.z0()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b2 = r90.b();
            if (b2 != null) {
                for (Object obj : b2) {
                    jSONArray.put(a(a(obj)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", a(r90.m(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            lgVar.b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e2) {
            qc.c("Exception occurred when loading assets", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.internal.ads.lg r25, com.google.android.gms.internal.ads.ii0 r26, java.util.concurrent.CountDownLatch r27) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.t.a(com.google.android.gms.internal.ads.lg, com.google.android.gms.internal.ads.ii0, java.util.concurrent.CountDownLatch):boolean");
    }

    private static String b(ya0 ya0) {
        String str;
        try {
            a j1 = ya0.j1();
            if (j1 == null) {
                qc.d("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) b.y(j1);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            str = "Drawable is not an instance of BitmapDrawable. Returning empty string";
            qc.d(str);
            return "";
        } catch (RemoteException unused) {
            str = "Unable to get drawable. Returning empty string";
        }
    }

    public static boolean b(q8 q8Var) {
        ai0 ai0;
        return (q8Var == null || !q8Var.n || (ai0 = q8Var.o) == null || ai0.o == null) ? false : true;
    }
}
