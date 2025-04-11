package com.google.ads.consent;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import e.b.d.e;
import e.b.d.v.c;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConsentInformation {
    private static final String CONSENT_DATA_KEY = "consent_string";
    private static final String MOBILE_ADS_SERVER_URL = "https://adservice.google.com/getconfig/pubvendors";
    private static final String PREFERENCES_FILE_KEY = "mobileads_consent";
    private static final String TAG = "ConsentInformation";
    private static ConsentInformation instance;
    private final Context context;
    private DebugGeography debugGeography = DebugGeography.DEBUG_GEOGRAPHY_DISABLED;
    private String hashedDeviceId = c();
    private List<String> testDevices = new ArrayList();

    /* access modifiers changed from: private */
    public static class AdNetworkLookupResponse {
        @c("company_ids")
        private List<String> companyIds;
        @c("ad_network_id")
        private String id;
        @c("is_npa")
        private boolean isNPA;
        @c("lookup_failed")
        private boolean lookupFailed;
        @c("not_found")
        private boolean notFound;

        private AdNetworkLookupResponse() {
        }
    }

    /* access modifiers changed from: private */
    public static class ConsentInfoUpdateResponse {
        String responseInfo;
        boolean success;

        ConsentInfoUpdateResponse(boolean z, String str) {
            this.success = z;
            this.responseInfo = str;
        }
    }

    /* access modifiers changed from: private */
    public static class ConsentInfoUpdateTask extends AsyncTask<Void, Void, ConsentInfoUpdateResponse> {
        private static final String UPDATE_SUCCESS = "Consent update successful.";
        private final ConsentInformation consentInformation;
        private final ConsentInfoUpdateListener listener;
        private final List<String> publisherIds;
        private final String url;

        ConsentInfoUpdateTask(String str, ConsentInformation consentInformation2, List<String> list, ConsentInfoUpdateListener consentInfoUpdateListener) {
            this.url = str;
            this.listener = consentInfoUpdateListener;
            this.publisherIds = list;
            this.consentInformation = consentInformation2;
        }

        private ConsentInfoUpdateResponse a(String str) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                if (httpURLConnection.getResponseCode() != 200) {
                    return new ConsentInfoUpdateResponse(false, httpURLConnection.getResponseMessage());
                }
                String a = a(httpURLConnection.getInputStream());
                httpURLConnection.disconnect();
                this.consentInformation.a((ConsentInformation) a, (String) this.publisherIds);
                return new ConsentInfoUpdateResponse(true, UPDATE_SUCCESS);
            } catch (Exception e2) {
                return new ConsentInfoUpdateResponse(false, e2.getLocalizedMessage());
            }
        }

        private String a(InputStream inputStream) {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        sb.append(new String(bArr, 0, read));
                    } else {
                        try {
                            break;
                        } catch (IOException e2) {
                            Log.e(ConsentInformation.TAG, e2.getLocalizedMessage());
                        }
                    }
                } catch (IOException e3) {
                    Log.e(ConsentInformation.TAG, e3.getLocalizedMessage());
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        Log.e(ConsentInformation.TAG, e4.getLocalizedMessage());
                    }
                    return null;
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e5) {
                        Log.e(ConsentInformation.TAG, e5.getLocalizedMessage());
                    }
                    throw th;
                }
            }
            bufferedInputStream.close();
            return sb.toString();
        }

        /* renamed from: a */
        public ConsentInfoUpdateResponse doInBackground(Void... voidArr) {
            String join = TextUtils.join(",", this.publisherIds);
            ConsentData g2 = this.consentInformation.g();
            Uri.Builder appendQueryParameter = Uri.parse(this.url).buildUpon().appendQueryParameter("pubs", join).appendQueryParameter("es", "2").appendQueryParameter("plat", g2.d()).appendQueryParameter("v", g2.e());
            if (this.consentInformation.f() && this.consentInformation.b() != DebugGeography.DEBUG_GEOGRAPHY_DISABLED) {
                appendQueryParameter = appendQueryParameter.appendQueryParameter("debug_geo", this.consentInformation.b().h().toString());
            }
            return a(appendQueryParameter.build().toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(ConsentInfoUpdateResponse consentInfoUpdateResponse) {
            if (consentInfoUpdateResponse.success) {
                this.listener.a(this.consentInformation.a());
            } else {
                this.listener.a(consentInfoUpdateResponse.responseInfo);
            }
        }
    }

    /* access modifiers changed from: protected */
    public static class ServerResponse {
        @c("ad_network_ids")
        List<AdNetworkLookupResponse> adNetworkLookupResponses;
        List<AdProvider> companies;
        @c("is_request_in_eea_or_unknown")
        Boolean isRequestLocationInEeaOrUnknown;

        protected ServerResponse() {
        }
    }

    private ConsentInformation(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public static synchronized ConsentInformation a(Context context2) {
        ConsentInformation consentInformation;
        synchronized (ConsentInformation.class) {
            if (instance == null) {
                instance = new ConsentInformation(context2);
            }
            consentInformation = instance;
        }
        return consentInformation;
    }

    private String a(String str) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                MessageDigest instance2 = MessageDigest.getInstance("MD5");
                instance2.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, instance2.digest()));
            } catch (NoSuchAlgorithmException unused) {
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    private HashSet<AdProvider> a(List<AdProvider> list, HashSet<String> hashSet) {
        ArrayList arrayList = new ArrayList();
        for (AdProvider adProvider : list) {
            if (hashSet.contains(adProvider.a())) {
                arrayList.add(adProvider);
            }
        }
        return new HashSet<>(arrayList);
    }

    private void a(ConsentData consentData) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        edit.putString(CONSENT_DATA_KEY, new e().a(consentData));
        edit.apply();
    }

    private void a(ServerResponse serverResponse) {
        Boolean bool = serverResponse.isRequestLocationInEeaOrUnknown;
        if (bool == null) {
            throw new Exception("Could not parse Event FE preflight response.");
        } else if (serverResponse.companies == null && bool.booleanValue()) {
            throw new Exception("Could not parse Event FE preflight response.");
        } else if (serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.lookupFailed) {
                    hashSet.add(adNetworkLookupResponse.id);
                }
                if (adNetworkLookupResponse.notFound) {
                    hashSet2.add(adNetworkLookupResponse.id);
                }
            }
            if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder("Response error.");
                if (!hashSet.isEmpty()) {
                    sb.append(String.format(" Lookup failure for: %s.", TextUtils.join(",", hashSet)));
                }
                if (!hashSet2.isEmpty()) {
                    sb.append(String.format(" Publisher Ids not found: %s", TextUtils.join(",", hashSet2)));
                }
                throw new Exception(sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void a(String str, List<String> list) {
        boolean z;
        ServerResponse serverResponse = (ServerResponse) new e().a(str, ServerResponse.class);
        a(serverResponse);
        HashSet<String> hashSet = new HashSet<>();
        boolean z2 = true;
        if (serverResponse.adNetworkLookupResponses != null) {
            z = false;
            for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.isNPA) {
                    List list2 = adNetworkLookupResponse.companyIds;
                    if (list2 != null) {
                        hashSet.addAll(list2);
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        HashSet<AdProvider> hashSet2 = serverResponse.companies == null ? new HashSet<>() : z ? a(serverResponse.companies, hashSet) : new HashSet<>(serverResponse.companies);
        ConsentData g2 = g();
        if (g2.f() == z) {
            z2 = false;
        }
        g2.a(z);
        g2.b(str);
        g2.c(new HashSet<>(list));
        g2.a(hashSet2);
        g2.b(serverResponse.isRequestLocationInEeaOrUnknown.booleanValue());
        if (!serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            a(g2);
            return;
        }
        if (!g2.a().equals(g2.c()) || z2) {
            g2.a("sdk");
            g2.a(ConsentStatus.UNKNOWN);
            g2.b(new HashSet<>());
        }
        a(g2);
    }

    private boolean h() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    public synchronized ConsentStatus a() {
        return g().b();
    }

    public void a(ConsentStatus consentStatus) {
        a(consentStatus, "programmatic");
    }

    /* access modifiers changed from: protected */
    public synchronized void a(ConsentStatus consentStatus, String str) {
        ConsentData g2 = g();
        g2.b(consentStatus == ConsentStatus.UNKNOWN ? new HashSet<>() : g2.a());
        g2.a(str);
        g2.a(consentStatus);
        a(g2);
    }

    public void a(String[] strArr, ConsentInfoUpdateListener consentInfoUpdateListener) {
        a(strArr, MOBILE_ADS_SERVER_URL, consentInfoUpdateListener);
    }

    /* access modifiers changed from: protected */
    public void a(String[] strArr, String str, ConsentInfoUpdateListener consentInfoUpdateListener) {
        String str2;
        if (f()) {
            str2 = "This request is sent from a test device.";
        } else {
            String c2 = c();
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 93);
            sb.append("Use ConsentInformation.getInstance(context).addTestDevice(\"");
            sb.append(c2);
            sb.append("\") to get test ads on this device.");
            str2 = sb.toString();
        }
        Log.i(TAG, str2);
        new ConsentInfoUpdateTask(str, this, Arrays.asList(strArr), consentInfoUpdateListener).execute(new Void[0]);
    }

    public DebugGeography b() {
        return this.debugGeography;
    }

    /* access modifiers changed from: protected */
    public String c() {
        ContentResolver contentResolver = this.context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || h()) {
            string = "emulator";
        }
        return a(string);
    }

    public boolean d() {
        return g().g();
    }

    public synchronized boolean e() {
        return g().h();
    }

    public boolean f() {
        return h() || this.testDevices.contains(this.hashedDeviceId);
    }

    /* access modifiers changed from: protected */
    public ConsentData g() {
        String string = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).getString(CONSENT_DATA_KEY, "");
        return TextUtils.isEmpty(string) ? new ConsentData() : (ConsentData) new e().a(string, ConsentData.class);
    }
}
