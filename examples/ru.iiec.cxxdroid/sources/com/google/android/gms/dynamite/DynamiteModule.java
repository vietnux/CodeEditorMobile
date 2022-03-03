package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.a;
import com.google.android.gms.dynamite.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3733b;

    /* renamed from: c  reason: collision with root package name */
    private static a f3734c;

    /* renamed from: d  reason: collision with root package name */
    private static b f3735d;

    /* renamed from: e  reason: collision with root package name */
    private static String f3736e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<c> f3737f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    private static final b.a f3738g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final b f3739h = new d();

    /* renamed from: i  reason: collision with root package name */
    public static final b f3740i = new g();
    private final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, c cVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, c cVar) {
            this(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b  reason: collision with other inner class name */
        public static class C0083b {
            public int a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f3741b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f3742c = 0;
        }

        C0083b a(Context context, String str, a aVar);
    }

    /* access modifiers changed from: private */
    public static class c {
        public Cursor a;

        private c() {
        }

        /* synthetic */ c(c cVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public static class d implements b.a {
        private final int a;

        public d(int i2, int i3) {
            this.a = i2;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str) {
            return this.a;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    static {
        new e();
        new f();
        new h();
        new i();
    }

    private DynamiteModule(Context context) {
        y.a(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    private static Context a(Context context, String str, int i2, Cursor cursor, b bVar) {
        try {
            return (Context) e.b.b.a.b.b.y(bVar.a(e.b.b.a.b.b.a(context), str, i2, e.b.b.a.b.b.a(cursor)));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    public static Uri a(String str, boolean z) {
        String str2 = z ? "api_force_staging" : "api";
        StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
        sb.append("content://com.google.android.gms.chimera/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.b r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = f3733b;
        }
        if (bool != null) {
            return bool.booleanValue() ? c(context, str, i2) : b(context, str, i2);
        }
        throw new a("Failed to determine which loading route to use.", (c) null);
    }

    private static a a(Context context) {
        synchronized (DynamiteModule.class) {
            if (f3734c != null) {
                return f3734c;
            } else if (h.a().b(context) != 0) {
                return null;
            } else {
                try {
                    a a2 = a.AbstractBinderC0084a.a((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (a2 != null) {
                        f3734c = a2;
                        return a2;
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
                return null;
            }
        }
    }

    private static void a(ClassLoader classLoader) {
        try {
            f3735d = b.a.a((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, null);
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    public static Cursor b(Context context, String str, boolean z) {
        return context.getContentResolver().query(a(str, z), null, null, null, null);
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        a a2 = a(context);
        if (a2 != null) {
            try {
                e.b.b.a.b.a a3 = a2.a(e.b.b.a.b.b.a(context), str, i2);
                if (e.b.b.a.b.b.y(a3) != null) {
                    return new DynamiteModule((Context) e.b.b.a.b.b.y(a3));
                }
                throw new a("Failed to load remote module.", (c) null);
            } catch (RemoteException e2) {
                throw new a("Failed to load remote module.", e2, null);
            }
        } else {
            throw new a("Failed to create IDynamiteLoader.", (c) null);
        }
    }

    private static int c(Context context, String str, boolean z) {
        a a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            return a2.a(e.b.b.a.b.b.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule c(Context context, String str, int i2) {
        b bVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            bVar = f3735d;
        }
        if (bVar != null) {
            c cVar = f3737f.get();
            if (cVar == null || cVar.a == null) {
                throw new a("No result cursor", (c) null);
            }
            Context a2 = a(context.getApplicationContext(), str, i2, cVar.a, bVar);
            if (a2 != null) {
                return new DynamiteModule(a2);
            }
            throw new a("Failed to get module context", (c) null);
        }
        throw new a("DynamiteLoaderV2 was not cached.", (c) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0054 A[Catch:{ all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0055 A[Catch:{ all -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int d(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            android.database.Cursor r2 = b(r2, r3, r4)     // Catch:{ Exception -> 0x004e, all -> 0x004b }
            if (r2 == 0) goto L_0x003a
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x0049 }
            if (r3 == 0) goto L_0x003a
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x0049 }
            if (r3 <= 0) goto L_0x0034
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ Exception -> 0x0049 }
            r1 = 2
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0031 }
            com.google.android.gms.dynamite.DynamiteModule.f3736e = r1     // Catch:{ all -> 0x0031 }
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r4 = com.google.android.gms.dynamite.DynamiteModule.f3737f
            java.lang.Object r4 = r4.get()
            com.google.android.gms.dynamite.DynamiteModule$c r4 = (com.google.android.gms.dynamite.DynamiteModule.c) r4
            if (r4 == 0) goto L_0x0034
            android.database.Cursor r1 = r4.a
            if (r1 != 0) goto L_0x0034
            r4.a = r2
            r2 = r0
            goto L_0x0034
        L_0x0031:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L_0x0034:
            if (r2 == 0) goto L_0x0039
            r2.close()
        L_0x0039:
            return r3
        L_0x003a:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r4 = "Failed to retrieve remote module version."
            android.util.Log.w(r3, r4)
            com.google.android.gms.dynamite.DynamiteModule$a r3 = new com.google.android.gms.dynamite.DynamiteModule$a
            java.lang.String r4 = "Failed to connect to dynamite module ContentResolver."
            r3.<init>(r4, r0)
            throw r3
        L_0x0049:
            r3 = move-exception
            goto L_0x0050
        L_0x004b:
            r3 = move-exception
            r2 = r0
            goto L_0x005e
        L_0x004e:
            r3 = move-exception
            r2 = r0
        L_0x0050:
            boolean r4 = r3 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0055
            throw r3     // Catch:{ all -> 0x005d }
        L_0x0055:
            com.google.android.gms.dynamite.DynamiteModule$a r4 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "V2 version check failed"
            r4.<init>(r1, r3, r0)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.close()
        L_0x0063:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    public final Context a() {
        return this.a;
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}
