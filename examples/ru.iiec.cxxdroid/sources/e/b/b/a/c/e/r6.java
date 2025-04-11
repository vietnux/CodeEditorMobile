package e.b.b.a.c.e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class r6 {
    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f7550b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f7551c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f7552d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f7553e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f7554f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, Boolean> f7555g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, Integer> f7556h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Long> f7557i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, Float> f7558j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private static Object f7559k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f7560l;

    /* renamed from: m  reason: collision with root package name */
    private static String[] f7561m = new String[0];

    private static <T> T a(HashMap<String, T> hashMap, String str, T t) {
        synchronized (r6.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            T t2 = hashMap.get(str);
            if (t2 == null) {
                t2 = t;
            }
            return t2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r13.query(e.b.b.a.c.e.r6.a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r13 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r13.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r15 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r15.equals(null) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (r15 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a4, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.r6.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f7550b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void a(ContentResolver contentResolver) {
        if (f7554f == null) {
            f7553e.set(false);
            f7554f = new HashMap<>();
            f7559k = new Object();
            f7560l = false;
            contentResolver.registerContentObserver(a, true, new s6(null));
        } else if (f7553e.getAndSet(false)) {
            f7554f.clear();
            f7555g.clear();
            f7556h.clear();
            f7557i.clear();
            f7558j.clear();
            f7559k = new Object();
            f7560l = false;
        }
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (r6.class) {
            if (obj == f7559k) {
                f7554f.put(str, str2);
            }
        }
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object b2 = b(contentResolver);
        Boolean bool = (Boolean) a(f7555g, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null && !a2.equals("")) {
            if (f7551c.matcher(a2).matches()) {
                bool = true;
                z = true;
            } else if (f7552d.matcher(a2).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            }
        }
        HashMap<String, Boolean> hashMap = f7555g;
        synchronized (r6.class) {
            if (b2 == f7559k) {
                hashMap.put(str, bool);
                f7554f.remove(str);
            }
        }
        return z;
    }

    private static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (r6.class) {
            a(contentResolver);
            obj = f7559k;
        }
        return obj;
    }
}
