package c.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* access modifiers changed from: package-private */
public final class b implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final File f2526b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2527c;

    /* renamed from: d  reason: collision with root package name */
    private final File f2528d;

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f2529e;

    /* renamed from: f  reason: collision with root package name */
    private final FileChannel f2530f;

    /* renamed from: g  reason: collision with root package name */
    private final FileLock f2531g;

    /* access modifiers changed from: package-private */
    public class a implements FileFilter {
        a(b bVar) {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.q.b$b  reason: collision with other inner class name */
    public static class C0061b extends File {

        /* renamed from: b  reason: collision with root package name */
        public long f2532b = -1;

        public C0061b(File file, String str) {
            super(file, str);
        }
    }

    b(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f2526b = file;
        this.f2528d = file2;
        this.f2527c = b(file);
        File file3 = new File(file2, "MultiDex.lock");
        this.f2529e = new RandomAccessFile(file3, "rw");
        try {
            this.f2530f = this.f2529e.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f2531g = this.f2530f.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException | Error | RuntimeException e2) {
                a(this.f2530f);
                throw e2;
            }
        } catch (IOException | Error | RuntimeException e3) {
            a(this.f2529e);
            throw e3;
        }
    }

    private static long a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private List<C0061b> a(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f2526b.getName() + ".classes";
        SharedPreferences a2 = a(context);
        int i2 = a2.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + -1);
        int i3 = 2;
        while (i3 <= i2) {
            C0061b bVar = new C0061b(this.f2528d, str2 + i3 + ".zip");
            if (bVar.isFile()) {
                bVar.f2532b = b(bVar);
                long j2 = a2.getLong(str + "dex.crc." + i3, -1);
                long j3 = a2.getLong(str + "dex.time." + i3, -1);
                long lastModified = bVar.lastModified();
                if (j3 == lastModified && j2 == bVar.f2532b) {
                    arrayList.add(bVar);
                    i3++;
                    a2 = a2;
                    str2 = str2;
                } else {
                    throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + bVar.f2532b);
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
        }
        return arrayList;
    }

    private static void a(Context context, String str, long j2, long j3, List<C0061b> list) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(str + "crc", j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (C0061b bVar : list) {
            edit.putLong(str + "dex.crc." + i2, bVar.f2532b);
            edit.putLong(str + "dex.time." + i2, bVar.lastModified());
            i2++;
        }
        edit.commit();
    }

    private static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    /* JADX INFO: finally extract failed */
    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (createTempFile.setReadOnly()) {
                    Log.i("MultiDex", "Renaming to " + file.getPath());
                    if (!createTempFile.renameTo(file)) {
                        throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                    }
                    return;
                }
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            a(inputStream);
            createTempFile.delete();
        }
    }

    private static boolean a(Context context, File file, long j2, String str) {
        SharedPreferences a2 = a(context);
        if (a2.getLong(str + "timestamp", -1) == a(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return a2.getLong(sb.toString(), -1) != j2;
        }
    }

    private static long b(File file) {
        long a2 = c.a(file);
        return a2 == -1 ? a2 - 1 : a2;
    }

    private void l() {
        File[] listFiles = this.f2528d.listFiles(new a(this));
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f2528d.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    private List<C0061b> m() {
        boolean z;
        String str = this.f2526b.getName() + ".classes";
        l();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f2526b);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i2 = 2;
            while (entry != null) {
                C0061b bVar = new C0061b(this.f2528d, str + i2 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i3 = 0;
                boolean z2 = false;
                while (i3 < 3 && !z2) {
                    int i4 = i3 + 1;
                    a(zipFile, entry, bVar, str);
                    try {
                        bVar.f2532b = b(bVar);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f2532b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i3 = i4;
                }
                if (z2) {
                    i2++;
                    entry = zipFile.getEntry("classes" + i2 + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e4) {
                Log.w("MultiDex", "Failed to close resource", e4);
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public List<? extends File> a(Context context, String str, boolean z) {
        List<C0061b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f2526b.getPath() + ", " + z + ", " + str + ")");
        if (this.f2531g.isValid()) {
            if (z || a(context, this.f2526b, this.f2527c, str)) {
                Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
            } else {
                try {
                    list = a(context, str);
                } catch (IOException e2) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = m();
            a(context, str, a(this.f2526b), this.f2527c, list);
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2531g.release();
        this.f2530f.close();
        this.f2529e.close();
    }
}
