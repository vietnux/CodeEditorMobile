package c.q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class a {
    private static final Set<File> a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f2524b = a(System.getProperty("java.vm.version"));

    /* access modifiers changed from: private */
    /* renamed from: c.q.a$a  reason: collision with other inner class name */
    public static final class C0059a {

        /* renamed from: b  reason: collision with root package name */
        private static final int f2525b = 4;
        private final AbstractC0060a a;

        /* access modifiers changed from: private */
        /* renamed from: c.q.a$a$a  reason: collision with other inner class name */
        public interface AbstractC0060a {
            Object a(File file, DexFile dexFile);
        }

        /* renamed from: c.q.a$a$b */
        private static class b implements AbstractC0060a {
            private final Constructor<?> a;

            b(Class<?> cls) {
                this.a = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.a.setAccessible(true);
            }

            @Override // c.q.a.C0059a.AbstractC0060a
            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* renamed from: c.q.a$a$c */
        private static class c implements AbstractC0060a {
            private final Constructor<?> a;

            c(Class<?> cls) {
                this.a = cls.getConstructor(File.class, File.class, DexFile.class);
                this.a.setAccessible(true);
            }

            @Override // c.q.a.C0059a.AbstractC0060a
            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, file, dexFile);
            }
        }

        /* renamed from: c.q.a$a$d */
        private static class d implements AbstractC0060a {
            private final Constructor<?> a;

            d(Class<?> cls) {
                this.a = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.a.setAccessible(true);
            }

            @Override // c.q.a.C0059a.AbstractC0060a
            public Object a(File file, DexFile dexFile) {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0059a() {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                c.q.a$a$b r1 = new c.q.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                c.q.a$a$c r1 = new c.q.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                c.q.a$a$d r1 = new c.q.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.q.a.C0059a.<init>():void");
        }

        private static String a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f2525b) + ".dex").getPath();
        }

        static void a(ClassLoader classLoader, List<? extends File> list) {
            Object obj = a.b(classLoader, "pathList").get(classLoader);
            Object[] a2 = new C0059a().a(list);
            try {
                a.b(obj, "dexElements", a2);
            } catch (NoSuchFieldException e2) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e2);
                a.b(obj, "pathElements", a2);
            }
        }

        private Object[] a(List<? extends File> list) {
            Object[] objArr = new Object[list.size()];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                File file = (File) list.get(i2);
                objArr[i2] = this.a.a(file, DexFile.loadDex(file.getPath(), a(file), 0));
            }
            return objArr;
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        static void a(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = a.b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.b(obj, "dexElements", a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field b2 = a.b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) b2.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                b2.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) a.b(obj, "makeDexElements", new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* access modifiers changed from: private */
    public static final class c {
        static void a(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field b2 = a.b(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) b2.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            b2.set(classLoader, sb.toString());
            a.b(classLoader, "mPaths", strArr);
            a.b(classLoader, "mFiles", fileArr);
            a.b(classLoader, "mZips", zipFileArr);
            a.b(classLoader, "mDexs", dexFileArr);
        }
    }

    private static File a(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            a(file2);
        }
        File file3 = new File(file2, str);
        a(file3);
        return file3;
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    private static void a(Context context, File file, File file2, String str, String str2, boolean z) {
        synchronized (a) {
            if (!a.contains(file)) {
                a.add(file);
                if (Build.VERSION.SDK_INT > 20) {
                    Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than " + 20 + " should be backed by " + "runtime with built-in multidex capabilty but it's not the " + "case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        a(context);
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File a2 = a(context, file2, str);
                    b bVar = new b(file, a2);
                    IOException e2 = null;
                    try {
                        try {
                            a(classLoader, a2, bVar.a(context, str2, false));
                        } catch (IOException e3) {
                            if (z) {
                                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e3);
                                a(classLoader, a2, bVar.a(context, str2, true));
                            } else {
                                throw e3;
                            }
                        }
                        try {
                        } catch (IOException e4) {
                            e2 = e4;
                        }
                        if (e2 != null) {
                            throw e2;
                        }
                    } finally {
                        try {
                            bVar.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (RuntimeException e5) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e5);
                }
            }
        }
    }

    private static void a(File file) {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            Log.e("MultiDex", str);
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    private static void a(ClassLoader classLoader, File file, List<? extends File> list) {
        if (!list.isEmpty()) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                b.a(classLoader, list, file);
            } else if (i2 >= 14) {
                C0059a.a(classLoader, list);
            } else {
                c.a(classLoader, list);
            }
        }
    }

    static boolean a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    private static ApplicationInfo b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e2) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static Field b(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static Method b(Object obj, String str, Class<?>... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static void b(Object obj, String str, Object[] objArr) {
        Field b2 = b(obj, str);
        Object[] objArr2 = (Object[]) b2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b2.set(obj, objArr3);
    }

    public static void c(Context context) {
        String str;
        Log.i("MultiDex", "Installing application");
        if (f2524b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo b2 = b(context);
                if (b2 == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                } else {
                    a(context, new File(b2.sourceDir), new File(b2.dataDir), "secondary-dexes", "", true);
                    str = "install done";
                }
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
        }
        Log.i("MultiDex", str);
    }
}
