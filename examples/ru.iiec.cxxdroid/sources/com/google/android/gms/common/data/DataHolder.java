package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@KeepName
public final class DataHolder extends com.google.android.gms.common.internal.f0.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f3587b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f3588c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f3589d;

    /* renamed from: e  reason: collision with root package name */
    private final CursorWindow[] f3590e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3591f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f3592g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f3593h;

    /* renamed from: i  reason: collision with root package name */
    private int f3594i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3595j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3596k;

    public static class a {
        private final String[] a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<HashMap<String, Object>> f3597b;

        /* renamed from: c  reason: collision with root package name */
        private final String f3598c;

        /* renamed from: d  reason: collision with root package name */
        private final HashMap<Object, Integer> f3599d;

        private a(String[] strArr, String str) {
            y.a(strArr);
            this.a = strArr;
            this.f3597b = new ArrayList<>();
            this.f3598c = str;
            this.f3599d = new HashMap<>();
        }

        /* synthetic */ a(String[] strArr, String str, f fVar) {
            this(strArr, str);
        }

        public a a(ContentValues contentValues) {
            c.a(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return a(hashMap);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.data.DataHolder.a a(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                com.google.android.gms.common.internal.c.a(r5)
                java.lang.String r0 = r4.f3598c
                r1 = -1
                if (r0 != 0) goto L_0x000a
            L_0x0008:
                r0 = -1
                goto L_0x002f
            L_0x000a:
                java.lang.Object r0 = r5.get(r0)
                if (r0 != 0) goto L_0x0011
                goto L_0x0008
            L_0x0011:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f3599d
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto L_0x002b
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.f3599d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.f3597b
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
                goto L_0x0008
            L_0x002b:
                int r0 = r2.intValue()
            L_0x002f:
                if (r0 != r1) goto L_0x0037
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.f3597b
                r0.add(r5)
                goto L_0x0041
            L_0x0037:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.f3597b
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.f3597b
                r1.add(r0, r5)
            L_0x0041:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.a.a(java.util.HashMap):com.google.android.gms.common.data.DataHolder$a");
        }

        public DataHolder a(int i2) {
            return new DataHolder(this, i2, (Bundle) null, (f) null);
        }
    }

    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    static {
        new f(new String[0], null);
    }

    DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.f3595j = false;
        this.f3596k = true;
        this.f3587b = i2;
        this.f3588c = strArr;
        this.f3590e = cursorWindowArr;
        this.f3591f = i3;
        this.f3592g = bundle;
    }

    private DataHolder(a aVar, int i2, Bundle bundle) {
        this(aVar.a, a(aVar, -1), i2, bundle);
    }

    /* synthetic */ DataHolder(a aVar, int i2, Bundle bundle, f fVar) {
        this(aVar, i2, null);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f3595j = false;
        this.f3596k = true;
        this.f3587b = 1;
        y.a(strArr);
        this.f3588c = strArr;
        y.a(cursorWindowArr);
        this.f3590e = cursorWindowArr;
        this.f3591f = i2;
        this.f3592g = bundle;
        w();
    }

    public static a a(String[] strArr) {
        return new a(strArr, null, null);
    }

    private final void a(String str, int i2) {
        Bundle bundle = this.f3589d;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (v()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i2 < 0 || i2 >= this.f3594i) {
            throw new CursorIndexOutOfBoundsException(i2, this.f3594i);
        }
    }

    private static CursorWindow[] a(a aVar, int i2) {
        long j2;
        if (aVar.a.length == 0) {
            return new CursorWindow[0];
        }
        List subList = (i2 < 0 || i2 >= aVar.f3597b.size()) ? aVar.f3597b : aVar.f3597b.subList(0, i2);
        int size = subList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.a.length);
        CursorWindow cursorWindow2 = cursorWindow;
        int i3 = 0;
        boolean z = false;
        while (i3 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i3);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(aVar.a.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) subList.get(i3);
                boolean z2 = true;
                for (int i4 = 0; i4 < aVar.a.length && z2; i4++) {
                    String str = aVar.a[i4];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow2.putNull(i3, i4);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow2.putString((String) obj, i3, i4);
                    } else {
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i3, i4);
                        } else if (obj instanceof Boolean) {
                            j2 = ((Boolean) obj).booleanValue() ? 1 : 0;
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow2.putBlob((byte[]) obj, i3, i4);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i3, i4);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow2.putDouble((double) ((Float) obj).floatValue(), i3, i4);
                        } else {
                            String valueOf = String.valueOf(obj);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                            sb2.append("Unsupported object for column ");
                            sb2.append(str);
                            sb2.append(": ");
                            sb2.append(valueOf);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        z2 = cursorWindow2.putLong(j2, i3, i4);
                    }
                }
                if (z2) {
                    z = false;
                } else if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i3);
                    sb3.append(" - allocating new window.");
                    Log.d("DataHolder", sb3.toString());
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(aVar.a.length);
                    arrayList.add(cursorWindow2);
                    i3--;
                    z = true;
                } else {
                    throw new b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                i3++;
            } catch (RuntimeException e2) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList.get(i5)).close();
                }
                throw e2;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    public final byte[] a(String str, int i2, int i3) {
        a(str, i2);
        return this.f3590e[i3].getBlob(i2, this.f3589d.getInt(str));
    }

    public final int c(int i2) {
        int i3 = 0;
        y.b(i2 >= 0 && i2 < this.f3594i);
        while (true) {
            int[] iArr = this.f3593h;
            if (i3 >= iArr.length) {
                break;
            } else if (i2 < iArr[i3]) {
                i3--;
                break;
            } else {
                i3++;
            }
        }
        return i3 == this.f3593h.length ? i3 - 1 : i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f3595j) {
                this.f3595j = true;
                for (int i2 = 0; i2 < this.f3590e.length; i2++) {
                    this.f3590e[i2].close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            if (this.f3596k && this.f3590e.length > 0 && !v()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public final int getCount() {
        return this.f3594i;
    }

    public final Bundle t() {
        return this.f3592g;
    }

    public final int u() {
        return this.f3591f;
    }

    public final boolean v() {
        boolean z;
        synchronized (this) {
            z = this.f3595j;
        }
        return z;
    }

    public final void w() {
        this.f3589d = new Bundle();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = this.f3588c;
            if (i3 >= strArr.length) {
                break;
            }
            this.f3589d.putInt(strArr[i3], i3);
            i3++;
        }
        this.f3593h = new int[this.f3590e.length];
        int i4 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f3590e;
            if (i2 < cursorWindowArr.length) {
                this.f3593h[i2] = i4;
                i4 += this.f3590e[i2].getNumRows() - (i4 - cursorWindowArr[i2].getStartPosition());
                i2++;
            } else {
                this.f3594i = i4;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = com.google.android.gms.common.internal.f0.c.a(parcel);
        com.google.android.gms.common.internal.f0.c.a(parcel, 1, this.f3588c, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 2, (Parcelable[]) this.f3590e, i2, false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 3, u());
        com.google.android.gms.common.internal.f0.c.a(parcel, 4, t(), false);
        com.google.android.gms.common.internal.f0.c.a(parcel, 1000, this.f3587b);
        com.google.android.gms.common.internal.f0.c.a(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
