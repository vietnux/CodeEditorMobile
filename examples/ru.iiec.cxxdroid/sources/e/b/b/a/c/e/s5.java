package e.b.b.a.c.e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.t.c;
import com.google.android.gms.common.util.f;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public final class s5 extends z2 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f7580g = {"firebase_", "google_", "ga_"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f7581c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f7582d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    private int f7583e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f7584f = null;

    s5(d2 d2Var) {
        super(d2Var);
    }

    public static g6 a(f6 f6Var, String str) {
        g6[] g6VarArr = f6Var.f7259c;
        for (g6 g6Var : g6VarArr) {
            if (g6Var.f7282c.equals(str)) {
                return g6Var;
            }
        }
        return null;
    }

    private static Object a(int i2, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i2, z);
            }
            return null;
        }
    }

    public static String a(String str, int i2, boolean z) {
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public static String a(String str, String[] strArr, String[] strArr2) {
        y.a(strArr);
        y.a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            if (d(str, strArr[i2])) {
                return strArr2[i2];
            }
        }
        return null;
    }

    private static void a(Bundle bundle, Object obj) {
        y.a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    private static boolean a(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    static boolean a(n0 n0Var, s sVar) {
        y.a(n0Var);
        y.a(sVar);
        return !TextUtils.isEmpty(sVar.f7563c);
    }

    private final boolean a(String str, String str2, int i2, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                    a().B().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (Parcelable parcelable : parcelableArr) {
                        if (!(parcelable instanceof Bundle)) {
                            a().B().a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (!(obj2 instanceof Bundle)) {
                            a().B().a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean a(long[] jArr, int i2) {
        if (i2 >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i2 % 64)) & jArr[i2 / 64]) != 0;
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static long[] a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    jArr[i2] = jArr[i2] | (1 << i3);
                }
            }
        }
        return jArr;
    }

    public static Bundle[] a(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    static g6[] a(g6[] g6VarArr, String str, Object obj) {
        for (g6 g6Var : g6VarArr) {
            if (str.equals(g6Var.f7282c)) {
                g6Var.f7284e = null;
                g6Var.f7283d = null;
                g6Var.f7286g = null;
                if (obj instanceof Long) {
                    g6Var.f7284e = (Long) obj;
                } else if (obj instanceof String) {
                    g6Var.f7283d = (String) obj;
                } else if (obj instanceof Double) {
                    g6Var.f7286g = (Double) obj;
                }
                return g6VarArr;
            }
        }
        g6[] g6VarArr2 = new g6[(g6VarArr.length + 1)];
        System.arraycopy(g6VarArr, 0, g6VarArr2, 0, g6VarArr.length);
        g6 g6Var2 = new g6();
        g6Var2.f7282c = str;
        if (obj instanceof Long) {
            g6Var2.f7284e = (Long) obj;
        } else if (obj instanceof String) {
            g6Var2.f7283d = (String) obj;
        } else if (obj instanceof Double) {
            g6Var2.f7286g = (Double) obj;
        }
        g6VarArr2[g6VarArr.length] = g6Var2;
        return g6VarArr2;
    }

    public static Object b(f6 f6Var, String str) {
        g6 a = a(f6Var, str);
        if (a == null) {
            return null;
        }
        String str2 = a.f7283d;
        if (str2 != null) {
            return str2;
        }
        Long l2 = a.f7284e;
        if (l2 != null) {
            return l2;
        }
        Double d2 = a.f7286g;
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            r4 = r0
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r4 = r0
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.s5.b(java.lang.Object):java.lang.Object");
    }

    public static boolean b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    static long c(byte[] bArr) {
        y.a(bArr);
        int i2 = 0;
        y.b(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
            length--;
        }
        return j2;
    }

    private final boolean c(Context context, String str) {
        b1 b1Var;
        Object e2;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = c.b(context).b(str, 64);
            if (b2 == null || b2.signatures == null || b2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e3) {
            e2 = e3;
            b1Var = a().y();
            str2 = "Error obtaining certificate";
            b1Var.a(str2, e2);
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            e2 = e4;
            b1Var = a().y();
            str2 = "Package name not found";
            b1Var.a(str2, e2);
            return true;
        }
    }

    private final boolean c(String str, String str2) {
        if (str2 == null) {
            a().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            a().y().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        a().y().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            a().y().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    public static boolean d(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static MessageDigest g(String str) {
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    static boolean h(String str) {
        y.b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static int i(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? 256 : 36;
    }

    public static boolean j(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean k(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean l(java.lang.String r5) {
        /*
            com.google.android.gms.common.internal.y.b(r5)
            int r0 = r5.hashCode()
            r1 = 94660(0x171c4, float:1.32647E-40)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002e
            r1 = 95025(0x17331, float:1.33158E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 95027(0x17333, float:1.33161E-40)
            if (r0 == r1) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r0 = "_ui"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0024:
            java.lang.String r0 = "_ug"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 2
            goto L_0x0039
        L_0x002e:
            java.lang.String r0 = "_in"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = -1
        L_0x0039:
            if (r5 == 0) goto L_0x0040
            if (r5 == r4) goto L_0x0040
            if (r5 == r3) goto L_0x0040
            return r2
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.s5.l(java.lang.String):boolean");
    }

    public final int A() {
        if (this.f7584f == null) {
            this.f7584f = Integer.valueOf(h.a().a(getContext()) / 1000);
        }
        return this.f7584f.intValue();
    }

    public final int a(String str) {
        if (!c("event", str)) {
            return 2;
        }
        if (!a("event", AppMeasurement.a.a, str)) {
            return 13;
        }
        return !a("event", 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: package-private */
    public final long a(Context context, String str) {
        d();
        y.a(context);
        y.b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest g2 = g("MD5");
        if (g2 == null) {
            a().y().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b2 = c.b(context).b(getContext().getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return c(g2.digest(b2.signatures[0].toByteArray()));
                    }
                    a().B().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                a().y().a("Package name not found", e2);
            }
        }
        return 0;
    }

    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            a().B().a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = a(str, bundle.get(str));
                if (a == null) {
                    a().B().a("Param value can't be null", n().b(str));
                } else {
                    a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (a("event param", 40, r14) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (a("event param", 40, r14) == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.s5.a(java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        a().y().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            e.b.b.a.c.e.z0 r5 = r4.a()     // Catch:{ all -> 0x001a }
            e.b.b.a.c.e.b1 r5 = r5.y()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.s5.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final n0 a(String str, Bundle bundle, String str2, long j2, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a(str) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            return new n0(str, new k0(a(a(str, bundle2, f.a("_o"), false, false))), str2, j2);
        }
        a().y().a("Invalid conditional property event name", n().c(str));
        throw new IllegalArgumentException();
    }

    public final Object a(String str, Object obj) {
        boolean z;
        int i2 = 256;
        if ("_ev".equals(str)) {
            z = true;
        } else {
            if (!j(str)) {
                i2 = 100;
            }
            z = false;
        }
        return a(i2, obj, z);
    }

    public final void a(int i2, String str, String str2, int i3) {
        a((String) null, i2, str, str2, i3);
    }

    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                a().C().a("Not putting event parameter. Invalid value type. name, type", n().b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void a(g6 g6Var, Object obj) {
        y.a(obj);
        g6Var.f7283d = null;
        g6Var.f7284e = null;
        g6Var.f7286g = null;
        if (obj instanceof String) {
            g6Var.f7283d = (String) obj;
        } else if (obj instanceof Long) {
            g6Var.f7284e = (Long) obj;
        } else if (obj instanceof Double) {
            g6Var.f7286g = (Double) obj;
        } else {
            a().y().a("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void a(k6 k6Var, Object obj) {
        y.a(obj);
        k6Var.f7398e = null;
        k6Var.f7399f = null;
        k6Var.f7401h = null;
        if (obj instanceof String) {
            k6Var.f7398e = (String) obj;
        } else if (obj instanceof Long) {
            k6Var.f7399f = (Long) obj;
        } else if (obj instanceof Double) {
            k6Var.f7401h = (Double) obj;
        } else {
            a().y().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void a(String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        a(bundle, i2);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        this.a.u().b("auto", "_err", bundle);
    }

    public final boolean a(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(b().a() - j2) > j3;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, int i2, String str2) {
        if (str2 == null) {
            a().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            a().y().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            a().y().a("Name is required and can't be null. Type", str);
            return false;
        }
        y.a((Object) str2);
        int i2 = 0;
        while (true) {
            String[] strArr2 = f7580g;
            if (i2 >= strArr2.length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            a().y().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            y.a(strArr);
            int i3 = 0;
            while (true) {
                if (i3 >= strArr.length) {
                    z2 = false;
                    break;
                } else if (d(str2, strArr[i3])) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (z2) {
                a().y().a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public final byte[] a(h6 h6Var) {
        try {
            byte[] bArr = new byte[h6Var.d()];
            b a = b.a(bArr, 0, bArr.length);
            h6Var.a(a);
            a.a();
            return bArr;
        } catch (IOException e2) {
            a().y().a("Data loss. Failed to serialize batch", e2);
            return null;
        }
    }

    public final byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            a().y().a("Failed to gzip content", e2);
            throw e2;
        }
    }

    public final int b(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", AppMeasurement.e.a, str)) {
            return 15;
        }
        return !a("user property", 24, str) ? 6 : 0;
    }

    public final int b(String str, Object obj) {
        return "_ldl".equals(str) ? a("user property referrer", str, i(str), obj, false) : a("user property", str, i(str), obj, false) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            a().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            a().y().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                a().y().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    a().y().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            a().y().a("Failed to ungzip content", e2);
            throw e2;
        }
    }

    public final int c(String str) {
        if (!c("user property", str)) {
            return 6;
        }
        if (!a("user property", AppMeasurement.e.a, str)) {
            return 15;
        }
        return !a("user property", 24, str) ? 6 : 0;
    }

    public final Object c(String str, Object obj) {
        return a(i(str), obj, "_ldl".equals(str));
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            a().y().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        y.a((Object) str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        a().y().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return r().u().equals(str);
    }

    public final boolean f(String str) {
        d();
        if (c.b(getContext()).a(str) == 0) {
            return true;
        }
        a().E().a("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final void v() {
        d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                a().B().a("Utils falling back to Random for random id");
            }
        }
        this.f7582d.set(nextLong);
    }

    public final long y() {
        int i2 = (this.f7582d.get() > 0 ? 1 : (this.f7582d.get() == 0 ? 0 : -1));
        synchronized (this.f7582d) {
            if (i2 == 0) {
                long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
                int i3 = this.f7583e + 1;
                this.f7583e = i3;
                return nextLong + ((long) i3);
            }
            this.f7582d.compareAndSet(-1, 1);
            return this.f7582d.getAndIncrement();
        }
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom z() {
        d();
        if (this.f7581c == null) {
            this.f7581c = new SecureRandom();
        }
        return this.f7581c;
    }
}
