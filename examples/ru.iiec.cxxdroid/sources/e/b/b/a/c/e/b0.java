package e.b.b.a.c.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class b0 extends i5 {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f7166f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f7167g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f7168h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f7169i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f7170j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f7171k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d  reason: collision with root package name */
    private final e0 f7172d = new e0(this, getContext(), "google_app_measurement.db");

    /* renamed from: e  reason: collision with root package name */
    private final e5 f7173e = new e5(b());

    b0(j5 j5Var) {
        super(j5Var);
    }

    private final boolean K() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j3;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            a().y().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            a().y().a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                a().y().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            a().y().a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        y.b(str);
        y.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    static void a(z0 z0Var, SQLiteDatabase sQLiteDatabase) {
        if (z0Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                z0Var.B().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                z0Var.B().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                z0Var.B().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                z0Var.B().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    static void a(z0 z0Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (z0Var != null) {
            if (!a(z0Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (z0Var != null) {
                try {
                    Set<String> a = a(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    for (String str4 : split) {
                        if (!a.remove(str4)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                            sb.append("Table ");
                            sb.append(str);
                            sb.append(" is missing required column: ");
                            sb.append(str4);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!a.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        z0Var.B().a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                    }
                } catch (SQLiteException e2) {
                    z0Var.y().a("Failed to verify columns on table that was just created", str);
                    throw e2;
                }
            } else {
                throw new IllegalArgumentException("Monitor must not be null");
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    private static boolean a(z0 z0Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (z0Var != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                if (cursor != null) {
                    cursor.close();
                }
                return moveToFirst;
            } catch (SQLiteException e2) {
                z0Var.B().a("Error querying for table", str, e2);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    private final boolean a(String str, int i2, w5 w5Var) {
        v();
        d();
        y.b(str);
        y.a(w5Var);
        if (TextUtils.isEmpty(w5Var.f7663d)) {
            a().B().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", z0.a(str), Integer.valueOf(i2), String.valueOf(w5Var.f7662c));
            return false;
        }
        try {
            byte[] bArr = new byte[w5Var.d()];
            b a = b.a(bArr, 0, bArr.length);
            w5Var.a(a);
            a.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", w5Var.f7662c);
            contentValues.put("event_name", w5Var.f7663d);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                a().y().a("Failed to insert event filter (got -1). appId", z0.a(str));
                return true;
            } catch (SQLiteException e2) {
                a().y().a("Error storing event filter. appId", z0.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            a().y().a("Configuration loss. Failed to serialize event filter. appId", z0.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, int i2, z5 z5Var) {
        v();
        d();
        y.b(str);
        y.a(z5Var);
        if (TextUtils.isEmpty(z5Var.f7745d)) {
            a().B().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", z0.a(str), Integer.valueOf(i2), String.valueOf(z5Var.f7744c));
            return false;
        }
        try {
            byte[] bArr = new byte[z5Var.d()];
            b a = b.a(bArr, 0, bArr.length);
            z5Var.a(a);
            a.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i2));
            contentValues.put("filter_id", z5Var.f7744c);
            contentValues.put("property_name", z5Var.f7745d);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                a().y().a("Failed to insert property filter (got -1). appId", z0.a(str));
                return false;
            } catch (SQLiteException e2) {
                a().y().a("Error storing property filter. appId", z0.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            a().y().a("Configuration loss. Failed to serialize property filter. appId", z0.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, List<Integer> list) {
        y.b(str);
        v();
        d();
        SQLiteDatabase A = A();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, r().b(str, p0.H)));
            if (b2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return A.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            a().y().a("Database error querying filters. appId", z0.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            a().y().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase A() {
        d();
        try {
            return this.f7172d.getWritableDatabase();
        } catch (SQLiteException e2) {
            a().B().a("Error opening database", e2);
            throw e2;
        }
    }

    public final void B() {
        v();
        A().setTransactionSuccessful();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            e.b.b.a.c.e.z0 r3 = r6.a()     // Catch:{ all -> 0x003e }
            e.b.b.a.c.e.b1 r3 = r3.y()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.C():java.lang.String");
    }

    public final boolean D() {
        return b("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        int delete;
        d();
        v();
        if (K()) {
            long a = q().f7378h.a();
            long b2 = b().b();
            if (Math.abs(b2 - a) > p0.A.a().longValue()) {
                q().f7378h.a(b2);
                d();
                v();
                if (K() && (delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(y.x())})) > 0) {
                    a().F().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long F() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long G() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final boolean H() {
        return b("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean I() {
        return b("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final long J() {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j2 = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j2;
        } catch (SQLiteException e2) {
            a().y().a("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long a(i6 i6Var) {
        long j2;
        d();
        v();
        y.a(i6Var);
        y.b(i6Var.q);
        try {
            byte[] bArr = new byte[i6Var.d()];
            b a = b.a(bArr, 0, bArr.length);
            i6Var.a(a);
            a.a();
            s5 o = o();
            y.a(bArr);
            o.d();
            MessageDigest g2 = s5.g("MD5");
            if (g2 == null) {
                o.a().y().a("Failed to get MD5");
                j2 = 0;
            } else {
                j2 = s5.c(g2.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i6Var.q);
            contentValues.put("metadata_fingerprint", Long.valueOf(j2));
            contentValues.put("metadata", bArr);
            try {
                A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return j2;
            } catch (SQLiteException e2) {
                a().y().a("Error storing raw event metadata. appId", z0.a(i6Var.q), e2);
                throw e2;
            }
        } catch (IOException e3) {
            a().y().a("Data loss. Failed to serialize event metadata. appId", z0.a(i6Var.q), e3);
            throw e3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<e.b.b.a.c.e.f6, java.lang.Long> a(java.lang.String r8, java.lang.Long r9) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final c0 a(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        y.b(str);
        d();
        v();
        String[] strArr = {str};
        c0 c0Var = new c0();
        Cursor cursor = null;
        try {
            SQLiteDatabase A = A();
            Cursor query = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            if (!query.moveToFirst()) {
                a().B().a("Not updating daily counts, app is not known. appId", z0.a(str));
                if (query != null) {
                    query.close();
                }
                return c0Var;
            }
            if (query.getLong(0) == j2) {
                c0Var.f7188b = query.getLong(1);
                c0Var.a = query.getLong(2);
                c0Var.f7189c = query.getLong(3);
                c0Var.f7190d = query.getLong(4);
                c0Var.f7191e = query.getLong(5);
            }
            if (z) {
                c0Var.f7188b++;
            }
            if (z2) {
                c0Var.a++;
            }
            if (z3) {
                c0Var.f7189c++;
            }
            if (z4) {
                c0Var.f7190d++;
            }
            if (z5) {
                c0Var.f7191e++;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(c0Var.a));
            contentValues.put("daily_events_count", Long.valueOf(c0Var.f7188b));
            contentValues.put("daily_conversions_count", Long.valueOf(c0Var.f7189c));
            contentValues.put("daily_error_events_count", Long.valueOf(c0Var.f7190d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(c0Var.f7191e));
            A.update("apps", contentValues, "app_id=?", strArr);
            if (query != null) {
                query.close();
            }
            return c0Var;
        } catch (SQLiteException e2) {
            a().y().a("Error updating daily counts. appId", z0.a(str), e2);
            if (0 != 0) {
                cursor.close();
            }
            return c0Var;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.d()
            r4.v()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.A()     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0043, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            e.b.b.a.c.e.z0 r6 = r4.a()     // Catch:{ SQLiteException -> 0x003e }
            e.b.b.a.c.e.b1 r6 = r6.F()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0045
        L_0x0040:
            r6 = move-exception
            r5 = r0
            goto L_0x0059
        L_0x0043:
            r6 = move-exception
            r5 = r0
        L_0x0045:
            e.b.b.a.c.e.z0 r1 = r4.a()     // Catch:{ all -> 0x0058 }
            e.b.b.a.c.e.b1 r1 = r1.y()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            r5.close()
        L_0x0057:
            return r0
        L_0x0058:
            r6 = move-exception
        L_0x0059:
            if (r5 == 0) goto L_0x005e
            r5.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<e.b.b.a.c.e.r5> a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3 A[LOOP:0: B:17:0x0054->B:38:0x00c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5 A[EDGE_INSN: B:52:0x00c5->B:39:0x00c5 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<e.b.b.a.c.e.i6, java.lang.Long>> a(java.lang.String r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<e.b.b.a.c.e.r5> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final List<w> a(String str, String[] strArr) {
        d();
        v();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    arrayList.add(new w(string, string2, new p5(string3, cursor.getLong(10), a, string2), j3, z, string4, (n0) o().a(cursor.getBlob(7), n0.CREATOR), j2, (n0) o().a(cursor.getBlob(9), n0.CREATOR), cursor.getLong(11), (n0) o().a(cursor.getBlob(12), n0.CREATOR)));
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    a().y().a("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            a().y().a("Error querying conditional user property value", e2);
            List<w> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a(j0 j0Var) {
        y.a(j0Var);
        d();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", j0Var.a);
        contentValues.put("name", j0Var.f7338b);
        contentValues.put("lifetime_count", Long.valueOf(j0Var.f7339c));
        contentValues.put("current_bundle_count", Long.valueOf(j0Var.f7340d));
        contentValues.put("last_fire_timestamp", Long.valueOf(j0Var.f7341e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(j0Var.f7342f));
        contentValues.put("last_sampled_complex_event_id", j0Var.f7343g);
        contentValues.put("last_sampling_rate", j0Var.f7344h);
        Boolean bool = j0Var.f7345i;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                a().y().a("Failed to insert/update event aggregates (got -1). appId", z0.a(j0Var.a));
            }
        } catch (SQLiteException e2) {
            a().y().a("Error storing event aggregates. appId", z0.a(j0Var.a), e2);
        }
    }

    public final void a(r rVar) {
        y.a(rVar);
        d();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.e());
        contentValues.put("app_instance_id", rVar.a());
        contentValues.put("gmp_app_id", rVar.b());
        contentValues.put("resettable_device_id_hash", rVar.g());
        contentValues.put("last_bundle_index", Long.valueOf(rVar.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(rVar.i()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(rVar.j()));
        contentValues.put("app_version", rVar.d());
        contentValues.put("app_store", rVar.l());
        contentValues.put("gmp_version", Long.valueOf(rVar.m()));
        contentValues.put("dev_cert_hash", Long.valueOf(rVar.n()));
        contentValues.put("measurement_enabled", Boolean.valueOf(rVar.c()));
        contentValues.put("day", Long.valueOf(rVar.s()));
        contentValues.put("daily_public_events_count", Long.valueOf(rVar.t()));
        contentValues.put("daily_events_count", Long.valueOf(rVar.u()));
        contentValues.put("daily_conversions_count", Long.valueOf(rVar.v()));
        contentValues.put("config_fetched_time", Long.valueOf(rVar.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(rVar.q()));
        contentValues.put("app_version_int", Long.valueOf(rVar.k()));
        contentValues.put("firebase_instance_id", rVar.h());
        contentValues.put("daily_error_events_count", Long.valueOf(rVar.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(rVar.w()));
        contentValues.put("health_monitor_sample", rVar.y());
        contentValues.put("android_id", Long.valueOf(rVar.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(rVar.B()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(rVar.C()));
        try {
            SQLiteDatabase A = A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{rVar.e()})) == 0 && A.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                a().y().a("Failed to insert/update app (got -1). appId", z0.a(rVar.e()));
            }
        } catch (SQLiteException e2) {
            a().y().a("Error storing app. appId", z0.a(rVar.e()), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
        r9.a(r12, r13, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r17, e.b.b.a.c.e.v5[] r18) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.a(java.lang.String, e.b.b.a.c.e.v5[]):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(List<Long> list) {
        d();
        v();
        y.a(list);
        y.a(list.size());
        if (K()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (b(sb3.toString(), (String[]) null) > 0) {
                a().B().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A = A();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                A.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                a().y().a("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean a(i0 i0Var, long j2, boolean z) {
        b1 y;
        Object a;
        String str;
        d();
        v();
        y.a(i0Var);
        y.b(i0Var.a);
        f6 f6Var = new f6();
        f6Var.f7262f = Long.valueOf(i0Var.f7311e);
        f6Var.f7259c = new g6[i0Var.f7312f.size()];
        Iterator<String> it = i0Var.f7312f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String next = it.next();
            g6 g6Var = new g6();
            int i3 = i2 + 1;
            f6Var.f7259c[i2] = g6Var;
            g6Var.f7282c = next;
            o().a(g6Var, i0Var.f7312f.b(next));
            i2 = i3;
        }
        try {
            byte[] bArr = new byte[f6Var.d()];
            b a2 = b.a(bArr, 0, bArr.length);
            f6Var.a(a2);
            a2.a();
            a().F().a("Saving event, name, data size", n().a(i0Var.f7308b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i0Var.a);
            contentValues.put("name", i0Var.f7308b);
            contentValues.put("timestamp", Long.valueOf(i0Var.f7310d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j2));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (A().insert("raw_events", null, contentValues) != -1) {
                    return true;
                }
                a().y().a("Failed to insert raw event (got -1). appId", z0.a(i0Var.a));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                y = a().y();
                a = z0.a(i0Var.a);
                str = "Error storing raw event. appId";
                y.a(str, a, e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            y = a().y();
            a = z0.a(i0Var.a);
            str = "Data loss. Failed to serialize event params/data. appId";
            y.a(str, a, e);
            return false;
        }
    }

    public final boolean a(i6 i6Var, boolean z) {
        b1 y;
        Object a;
        String str;
        d();
        v();
        y.a(i6Var);
        y.b(i6Var.q);
        y.a(i6Var.f7332h);
        E();
        long a2 = b().a();
        if (i6Var.f7332h.longValue() < a2 - y.x() || i6Var.f7332h.longValue() > y.x() + a2) {
            a().B().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", z0.a(i6Var.q), Long.valueOf(a2), i6Var.f7332h);
        }
        try {
            byte[] bArr = new byte[i6Var.d()];
            b a3 = b.a(bArr, 0, bArr.length);
            i6Var.a(a3);
            a3.a();
            byte[] a4 = o().a(bArr);
            a().F().a("Saving bundle, size", Integer.valueOf(a4.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i6Var.q);
            contentValues.put("bundle_end_timestamp", i6Var.f7332h);
            contentValues.put("data", a4);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            Integer num = i6Var.M;
            if (num != null) {
                contentValues.put("retry_count", num);
            }
            try {
                if (A().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                a().y().a("Failed to insert bundle (got -1). appId", z0.a(i6Var.q));
                return false;
            } catch (SQLiteException e2) {
                e = e2;
                y = a().y();
                a = z0.a(i6Var.q);
                str = "Error storing bundle. appId";
                y.a(str, a, e);
                return false;
            }
        } catch (IOException e3) {
            e = e3;
            y = a().y();
            a = z0.a(i6Var.q);
            str = "Data loss. Failed to serialize bundle. appId";
            y.a(str, a, e);
            return false;
        }
    }

    public final boolean a(r5 r5Var) {
        y.a(r5Var);
        d();
        v();
        if (d(r5Var.a, r5Var.f7547c) == null) {
            if (s5.h(r5Var.f7547c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{r5Var.a}) >= 25) {
                    return false;
                }
            } else {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r5Var.a, r5Var.f7546b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r5Var.a);
        contentValues.put("origin", r5Var.f7546b);
        contentValues.put("name", r5Var.f7547c);
        contentValues.put("set_timestamp", Long.valueOf(r5Var.f7548d));
        a(contentValues, "value", r5Var.f7549e);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                a().y().a("Failed to insert/update user property (got -1). appId", z0.a(r5Var.a));
            }
        } catch (SQLiteException e2) {
            a().y().a("Error storing user property. appId", z0.a(r5Var.a), e2);
        }
        return true;
    }

    public final boolean a(w wVar) {
        y.a(wVar);
        d();
        v();
        if (d(wVar.f7635b, wVar.f7637d.f7509c) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{wVar.f7635b}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", wVar.f7635b);
        contentValues.put("origin", wVar.f7636c);
        contentValues.put("name", wVar.f7637d.f7509c);
        a(contentValues, "value", wVar.f7637d.t());
        contentValues.put("active", Boolean.valueOf(wVar.f7639f));
        contentValues.put("trigger_event_name", wVar.f7640g);
        contentValues.put("trigger_timeout", Long.valueOf(wVar.f7642i));
        o();
        contentValues.put("timed_out_event", s5.a((Parcelable) wVar.f7641h));
        contentValues.put("creation_timestamp", Long.valueOf(wVar.f7638e));
        o();
        contentValues.put("triggered_event", s5.a((Parcelable) wVar.f7643j));
        contentValues.put("triggered_timestamp", Long.valueOf(wVar.f7637d.f7510d));
        contentValues.put("time_to_live", Long.valueOf(wVar.f7644k));
        o();
        contentValues.put("expired_event", s5.a((Parcelable) wVar.f7645l));
        try {
            if (A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                a().y().a("Failed to insert/update conditional user property (got -1)", z0.a(wVar.f7635b));
            }
        } catch (SQLiteException e2) {
            a().y().a("Error storing conditional user property", z0.a(wVar.f7635b), e2);
        }
        return true;
    }

    public final boolean a(String str, Long l2, long j2, f6 f6Var) {
        d();
        v();
        y.a(f6Var);
        y.b(str);
        y.a(l2);
        try {
            byte[] bArr = new byte[f6Var.d()];
            b a = b.a(bArr, 0, bArr.length);
            f6Var.a(a);
            a.a();
            a().F().a("Saving complex main event, appId, data size", n().a(str), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("event_id", l2);
            contentValues.put("children_to_process", Long.valueOf(j2));
            contentValues.put("main_event", bArr);
            try {
                if (A().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                    return true;
                }
                a().y().a("Failed to insert complex main event (got -1). appId", z0.a(str));
                return false;
            } catch (SQLiteException e2) {
                a().y().a("Error storing complex main event. appId", z0.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            a().y().a("Data loss. Failed to serialize event params/data. appId, eventId", z0.a(str), l2, e3);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.j0 b(java.lang.String r22, java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.b(java.lang.String, java.lang.String):e.b.b.a.c.e.j0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0113 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0117 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x014e A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x015d A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0172 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0186 A[Catch:{ SQLiteException -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.r b(java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.b(java.lang.String):e.b.b.a.c.e.r");
    }

    public final List<w> b(String str, String str2, String str3) {
        y.b(str);
        d();
        v();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final long c(String str) {
        y.b(str);
        d();
        v();
        try {
            return (long) A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, r().b(str, p0.r))))});
        } catch (SQLiteException e2) {
            a().y().a("Error deleting over the limit events. appId", z0.a(str), e2);
            return 0;
        }
    }

    public final void c(String str, String str2) {
        y.b(str);
        y.b(str2);
        d();
        v();
        try {
            a().F().a("Deleted user attribute rows", Integer.valueOf(A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            a().y().a("Error deleting user attribute. appId", z0.a(str), n().c(str2), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.r5 d(java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.d(java.lang.String, java.lang.String):e.b.b.a.c.e.r5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.d(java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.b.b.a.c.e.w e(java.lang.String r30, java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.e(java.lang.String, java.lang.String):e.b.b.a.c.e.w");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, e.b.b.a.c.e.j6> e(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.e(java.lang.String):java.util.Map");
    }

    public final int f(String str, String str2) {
        y.b(str);
        y.b(str2);
        d();
        v();
        try {
            return A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            a().y().a("Error deleting conditional property", z0.a(str), n().c(str2), e2);
            return 0;
        }
    }

    public final long f(String str) {
        y.b(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<e.b.b.a.c.e.w5>> g(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<e.b.b.a.c.e.z5>> h(java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.b0.h(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    public final long i(String str, String str2) {
        Throwable th;
        long j2;
        SQLiteException e2;
        y.b(str);
        y.b(str2);
        d();
        v();
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                j2 = a(sb.toString(), new String[]{str}, -1);
                if (j2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (A.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        a().y().a("Failed to insert column (got -1). appId", z0.a(str), str2);
                        A.endTransaction();
                        return -1;
                    }
                    j2 = 0;
                }
            } catch (SQLiteException e3) {
                e2 = e3;
                j2 = 0;
                try {
                    a().y().a("Error inserting column. appId", z0.a(str), str2, e2);
                    A.endTransaction();
                    return j2;
                } catch (Throwable th2) {
                    th = th2;
                    A.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + j2));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    a().y().a("Failed to update column (got 0). appId", z0.a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return j2;
            } catch (SQLiteException e4) {
                e2 = e4;
                a().y().a("Error inserting column. appId", z0.a(str), str2, e2);
                A.endTransaction();
                return j2;
            }
        } catch (SQLiteException e5) {
            e2 = e5;
            j2 = 0;
            a().y().a("Error inserting column. appId", z0.a(str), str2, e2);
            A.endTransaction();
            return j2;
        } catch (Throwable th3) {
            th = th3;
            A.endTransaction();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.i5
    public final boolean w() {
        return false;
    }

    public final void y() {
        v();
        A().beginTransaction();
    }

    public final void z() {
        v();
        A().endTransaction();
    }
}
