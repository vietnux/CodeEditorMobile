package net.grandcentrix.tray.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import h.b.a.c.h;

public class d extends SQLiteOpenHelper {

    /* renamed from: b  reason: collision with root package name */
    private final int f9557b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9558c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, boolean z) {
        super(context, z ? "tray.db" : "tray_backup_excluded.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f9558c = z;
        this.f9557b = 2;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE TrayPreferences ( _id INTEGER PRIMARY KEY, KEY TEXT NOT NULL, VALUE TEXT, MODULE TEXT, CREATED INT DEFAULT 0, UPDATED INT DEFAULT 0, UNIQUE (MODULE, KEY));");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE TrayPreferences ADD COLUMN MIGRATED_KEY TEXT");
        sQLiteDatabase.execSQL("CREATE TABLE TrayInternal ( _id INTEGER PRIMARY KEY, KEY TEXT NOT NULL, VALUE TEXT, MODULE TEXT, CREATED INT DEFAULT 0, UPDATED INT DEFAULT 0, MIGRATED_KEY TEXT, UNIQUE (MODULE, KEY));");
    }

    private String l() {
        StringBuilder sb = new StringBuilder();
        sb.append("tray internal db (");
        sb.append(this.f9558c ? "backup" : "no backup");
        sb.append("): ");
        return sb.toString();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        h.b(l() + "onCreate with version " + this.f9557b);
        a(sQLiteDatabase);
        h.b(l() + "created database version 1");
        int i2 = this.f9557b;
        if (i2 > 1) {
            onUpgrade(sQLiteDatabase, 1, i2);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        h.b(l() + "upgrading Database from version " + i2 + " to version " + i3);
        if (i3 > 2) {
            throw new IllegalStateException("onUpgrade doesn't support the upgrade to version " + i3);
        } else if (i2 == 1) {
            b(sQLiteDatabase);
            h.b(l() + "upgraded Database to version 2");
        } else {
            throw new IllegalArgumentException("onUpgrade() with oldVersion <= 0 is useless");
        }
    }
}
