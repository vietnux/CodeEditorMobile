package e.b.b.a.c.e;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class t6 {

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentHashMap<Uri, t6> f7592h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f7593i = {"key", "value"};
    private final ContentResolver a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f7594b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f7595c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7596d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f7597e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f7598f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final List<v6> f7599g = new ArrayList();

    private t6(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.f7594b = uri;
        this.f7595c = new u6(this, null);
    }

    public static t6 a(ContentResolver contentResolver, Uri uri) {
        t6 t6Var = f7592h.get(uri);
        if (t6Var != null) {
            return t6Var;
        }
        t6 t6Var2 = new t6(contentResolver, uri);
        t6 putIfAbsent = f7592h.putIfAbsent(uri, t6Var2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        t6Var2.a.registerContentObserver(t6Var2.f7594b, false, t6Var2.f7595c);
        return t6Var2;
    }

    private final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        Cursor query = this.a.query(this.f7594b, f7593i, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } catch (SQLiteException | SecurityException unused) {
                    Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                    return null;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public final void d() {
        synchronized (this.f7598f) {
            for (v6 v6Var : this.f7599g) {
                v6Var.a();
            }
        }
    }

    public final Map<String, String> a() {
        Map<String, String> c2 = w6.a("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? c() : this.f7597e;
        if (c2 == null) {
            synchronized (this.f7596d) {
                c2 = this.f7597e;
                if (c2 == null) {
                    c2 = c();
                    this.f7597e = c2;
                }
            }
        }
        return c2 != null ? c2 : Collections.emptyMap();
    }

    public final void b() {
        synchronized (this.f7596d) {
            this.f7597e = null;
        }
    }
}
