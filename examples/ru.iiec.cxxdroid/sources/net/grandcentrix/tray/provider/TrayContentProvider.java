package net.grandcentrix.tray.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import h.b.a.c.h;
import java.util.Date;

public class TrayContentProvider extends ContentProvider {

    /* renamed from: d  reason: collision with root package name */
    private static UriMatcher f9551d;

    /* renamed from: b  reason: collision with root package name */
    d f9552b;

    /* renamed from: c  reason: collision with root package name */
    d f9553c;

    static void a(String str) {
        f9551d = new UriMatcher(-1);
        f9551d.addURI(str, "preferences", 30);
        f9551d.addURI(str, "preferences/*", 20);
        f9551d.addURI(str, "preferences/*/*", 10);
        f9551d.addURI(str, "internal_preferences", 130);
        f9551d.addURI(str, "internal_preferences/*", 120);
        f9551d.addURI(str, "internal_preferences/*/*", 110);
    }

    public int a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr, ContentValues contentValues, String[] strArr2) {
        return b.a(sQLiteDatabase, str, str2, strArr, contentValues, strArr2);
    }

    public SQLiteDatabase a(Uri uri) {
        return (d(uri) ? this.f9553c : this.f9552b).getReadableDatabase();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        a(providerInfo.authority);
        h.b("TrayContentProvider registered for authority: " + providerInfo.authority);
    }

    public String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        int match = f9551d.match(uri);
        return (match == 110 || match == 120 || match == 130) ? "TrayInternal" : "TrayPreferences";
    }

    public SQLiteDatabase c(Uri uri) {
        return (d(uri) ? this.f9553c : this.f9552b).getWritableDatabase();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Uri uri) {
        return !"false".equals(uri.getQueryParameter("backup"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int delete(android.net.Uri r6, java.lang.String r7, java.lang.String[] r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: net.grandcentrix.tray.provider.TrayContentProvider.delete(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String str;
        Date date = new Date();
        int match = f9551d.match(uri);
        if (match == 10 || match == 110) {
            contentValues.put("CREATED", Long.valueOf(date.getTime()));
            contentValues.put("UPDATED", Long.valueOf(date.getTime()));
            contentValues.put("MODULE", uri.getPathSegments().get(1));
            contentValues.put("KEY", uri.getPathSegments().get(2));
            int a = a(c(uri), b(uri), "MODULE = ?AND KEY = ?", new String[]{contentValues.getAsString("MODULE"), contentValues.getAsString("KEY")}, contentValues, new String[]{"CREATED"});
            if (a >= 0) {
                getContext().getContentResolver().notifyChange(uri, null);
                return uri;
            }
            if (a == -1) {
                str = "Couldn't update or insert data. Uri: " + uri;
            } else {
                str = "unknown SQLite error";
            }
            h.c(str);
            return null;
        }
        throw new IllegalArgumentException("Insert is not supported for Uri: " + uri);
    }

    public boolean onCreate() {
        this.f9553c = new d(getContext(), true);
        this.f9552b = new d(getContext(), false);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r15, java.lang.String[] r16, java.lang.String r17, java.lang.String[] r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: net.grandcentrix.tray.provider.TrayContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public void shutdown() {
        this.f9553c.close();
        this.f9552b.close();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("not implemented");
    }
}
