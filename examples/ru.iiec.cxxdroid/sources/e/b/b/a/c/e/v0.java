package e.b.b.a.c.e;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;

public final class v0 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private final w0 f7620c = new w0(this, getContext(), "google_app_measurement_local.db");

    /* renamed from: d  reason: collision with root package name */
    private boolean f7621d;

    v0(d2 d2Var) {
        super(d2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c9, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:9:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00da A[SYNTHETIC, Splitter:B:54:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int r18, byte[] r19) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.v0.a(int, byte[]):boolean");
    }

    private final SQLiteDatabase z() {
        if (this.f7621d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f7620c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f7621d = true;
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:65|66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r10 = null;
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        a().y().a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        a().y().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        a().y().a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010d, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0114, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016f, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0102 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017f A[SYNTHETIC, Splitter:B:104:0x017f] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.f0.a> a(int r20) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.a.c.e.v0.a(int):java.util.List");
    }

    public final boolean a(n0 n0Var) {
        Parcel obtain = Parcel.obtain();
        n0Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(0, marshall);
        }
        a().B().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean a(p5 p5Var) {
        Parcel obtain = Parcel.obtain();
        p5Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(1, marshall);
        }
        a().B().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean a(w wVar) {
        o();
        byte[] a = s5.a((Parcelable) wVar);
        if (a.length <= 131072) {
            return a(2, a);
        }
        a().B().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }

    public final void y() {
        d();
        try {
            int delete = z().delete("messages", null, null) + 0;
            if (delete > 0) {
                a().F().a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            a().y().a("Error resetting local analytics data. error", e2);
        }
    }
}
