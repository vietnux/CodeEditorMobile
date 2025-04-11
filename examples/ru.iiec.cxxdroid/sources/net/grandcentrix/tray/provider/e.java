package net.grandcentrix.tray.provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import h.b.a.c.f;
import h.b.a.c.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class e {
    private final Context a;

    public e(Context context) {
        this.a = context;
        new f(context);
    }

    static g a(Cursor cursor) {
        return new g(cursor.getString(cursor.getColumnIndexOrThrow("MODULE")), cursor.getString(cursor.getColumnIndexOrThrow("KEY")), cursor.getString(cursor.getColumnIndexOrThrow("MIGRATED_KEY")), cursor.getString(cursor.getColumnIndexOrThrow("VALUE")), new Date(cursor.getLong(cursor.getColumnIndexOrThrow("CREATED"))), new Date(cursor.getLong(cursor.getColumnIndexOrThrow("UPDATED"))));
    }

    public List<g> a(Uri uri) {
        try {
            Cursor query = this.a.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                ArrayList arrayList = new ArrayList();
                for (boolean moveToFirst = query.moveToFirst(); moveToFirst; moveToFirst = query.moveToNext()) {
                    arrayList.add(a(query));
                }
                query.close();
                return arrayList;
            }
            throw new f("could not access stored data with uri " + uri);
        } catch (Throwable th) {
            throw new f("Hard error accessing the ContentProvider", th);
        }
    }

    public boolean a(Uri uri, String str) {
        return a(uri, str, null);
    }

    public boolean a(Uri uri, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("VALUE", str);
        contentValues.put("MIGRATED_KEY", str2);
        try {
            return this.a.getContentResolver().insert(uri, contentValues) != null;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public List<g> b(Uri uri) {
        try {
            return a(uri);
        } catch (f unused) {
            return new ArrayList();
        }
    }
}
