package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@k2
public final class jc {

    /* renamed from: b  reason: collision with root package name */
    private static Object f4698b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f4699c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f4700d = false;

    /* renamed from: e  reason: collision with root package name */
    private static e f4701e = h.d();

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f4702f = new HashSet(Arrays.asList(new String[0]));
    private final List<String> a;

    public jc() {
        this(null);
    }

    public jc(String str) {
        List<String> list;
        if (!a()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? "ad_request_".concat(valueOf2) : new String("ad_request_");
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? "network_request_".concat(valueOf3) : new String("network_request_");
                list = Arrays.asList(strArr2);
            }
        }
        this.a = list;
    }

    static final /* synthetic */ void a(int i2, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i2);
        jsonWriter.endObject();
        a(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, ?> next = it.next();
                String key = next.getKey();
                if (!f4702f.contains(key)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            qc.a("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(key);
                            jsonWriter.name("value").value(str);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    static final /* synthetic */ void a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void a(String str, pc pcVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f4701e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.a) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            pcVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            qc.b("unable to log", e2);
        }
        c(stringWriter.toString());
    }

    static final /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(c.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static void a(boolean z) {
        synchronized (f4698b) {
            f4699c = true;
            f4700d = z;
        }
    }

    static final /* synthetic */ void a(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = c.a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a2 = fc.a(a2);
            if (a2 != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a2);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public static boolean a() {
        boolean z;
        synchronized (f4698b) {
            z = f4699c && f4700d;
        }
        return z;
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) a50.g().a(k80.f1)).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            qc.c("Fail to determine debug setting.", e2);
            return false;
        }
    }

    public static void b() {
        synchronized (f4698b) {
            f4699c = false;
            f4700d = false;
            qc.d("Ad debug logging enablement is out of date.");
        }
    }

    private final void b(String str) {
        a("onNetworkRequestError", new oc(str));
    }

    private final void b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        a("onNetworkRequest", new kc(str, str2, map, bArr));
    }

    private final void b(Map<String, ?> map, int i2) {
        a("onNetworkResponse", new mc(i2, map));
    }

    private static synchronized void c(String str) {
        synchronized (jc.class) {
            qc.c("GMA Debug BEGIN");
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 4000;
                String valueOf = String.valueOf(str.substring(i2, Math.min(i3, str.length())));
                qc.c(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i2 = i3;
            }
            qc.c("GMA Debug FINISH");
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (f4698b) {
            z = f4699c;
        }
        return z;
    }

    public final void a(String str) {
        if (a() && str != null) {
            a(str.getBytes());
        }
    }

    public final void a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (a()) {
            b(str, str2, map, bArr);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, int i2) {
        if (a()) {
            String str = null;
            b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    qc.d(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                b(str);
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (a()) {
            b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void a(Map<String, ?> map, int i2) {
        if (a()) {
            b(map, i2);
            if (i2 < 200 || i2 >= 300) {
                b(null);
            }
        }
    }

    public final void a(byte[] bArr) {
        a("onNetworkResponseBody", new nc(bArr));
    }
}
