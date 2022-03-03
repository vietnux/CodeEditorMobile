package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.f0.a;
import com.google.android.gms.common.internal.f0.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
    public static e o = h.d();

    /* renamed from: b  reason: collision with root package name */
    private final int f3441b;

    /* renamed from: c  reason: collision with root package name */
    private String f3442c;

    /* renamed from: d  reason: collision with root package name */
    private String f3443d;

    /* renamed from: e  reason: collision with root package name */
    private String f3444e;

    /* renamed from: f  reason: collision with root package name */
    private String f3445f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f3446g;

    /* renamed from: h  reason: collision with root package name */
    private String f3447h;

    /* renamed from: i  reason: collision with root package name */
    private long f3448i;

    /* renamed from: j  reason: collision with root package name */
    private String f3449j;

    /* renamed from: k  reason: collision with root package name */
    private List<Scope> f3450k;

    /* renamed from: l  reason: collision with root package name */
    private String f3451l;

    /* renamed from: m  reason: collision with root package name */
    private String f3452m;
    private Set<Scope> n = new HashSet();

    GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f3441b = i2;
        this.f3442c = str;
        this.f3443d = str2;
        this.f3444e = str3;
        this.f3445f = str4;
        this.f3446g = uri;
        this.f3447h = str5;
        this.f3448i = j2;
        this.f3449j = str6;
        this.f3450k = list;
        this.f3451l = str7;
        this.f3452m = str8;
    }

    public static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, String str7, Set<Scope> set) {
        long longValue = (l2 == null ? Long.valueOf(o.a() / 1000) : l2).longValue();
        y.b(str7);
        y.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount a = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.b(jSONObject.optString("serverAuthCode", null));
        return a;
    }

    public String A() {
        return this.f3443d;
    }

    public String B() {
        return this.f3449j;
    }

    public Uri C() {
        return this.f3446g;
    }

    public Set<Scope> D() {
        HashSet hashSet = new HashSet(this.f3450k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public String E() {
        return this.f3447h;
    }

    public GoogleSignInAccount b(String str) {
        this.f3447h = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.B().equals(B()) && googleSignInAccount.D().equals(D());
    }

    public int hashCode() {
        return ((B().hashCode() + 527) * 31) + D().hashCode();
    }

    public Account t() {
        String str = this.f3444e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String u() {
        return this.f3445f;
    }

    public String v() {
        return this.f3444e;
    }

    public long w() {
        return this.f3448i;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.a(parcel, 1, this.f3441b);
        c.a(parcel, 2, z(), false);
        c.a(parcel, 3, A(), false);
        c.a(parcel, 4, v(), false);
        c.a(parcel, 5, u(), false);
        c.a(parcel, 6, (Parcelable) C(), i2, false);
        c.a(parcel, 7, E(), false);
        c.a(parcel, 8, w());
        c.a(parcel, 9, B(), false);
        c.c(parcel, 10, this.f3450k, false);
        c.a(parcel, 11, y(), false);
        c.a(parcel, 12, x(), false);
        c.a(parcel, a);
    }

    public String x() {
        return this.f3452m;
    }

    public String y() {
        return this.f3451l;
    }

    public String z() {
        return this.f3442c;
    }
}
