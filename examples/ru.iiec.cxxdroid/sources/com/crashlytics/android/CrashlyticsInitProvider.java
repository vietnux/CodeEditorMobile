package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import f.a.a.a.c;
import f.a.a.a.n.b.o;

public class CrashlyticsInitProvider extends ContentProvider {

    /* access modifiers changed from: package-private */
    public interface a {
        boolean a(Context context);
    }

    /* access modifiers changed from: package-private */
    public boolean a(Context context, o oVar, a aVar) {
        return oVar.b(context) && aVar.a(context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (a(context, new o(), new b())) {
            try {
                c.a(context, new a());
                c.g().b("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                c.g().b("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
