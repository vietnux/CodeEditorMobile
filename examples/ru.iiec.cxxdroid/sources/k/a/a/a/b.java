package k.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import k.a.a.a.f.d;
import k.a.a.a.f.e;
import k.a.a.a.f.f;
import k.a.a.a.f.g;

public class b {
    public static final BigInteger a = BigInteger.valueOf(1024);

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f9517b;

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger f9518c = a.multiply(f9517b);

    /* renamed from: d  reason: collision with root package name */
    public static final BigInteger f9519d = a.multiply(f9518c);

    /* renamed from: e  reason: collision with root package name */
    public static final BigInteger f9520e = a.multiply(f9519d);

    /* renamed from: f  reason: collision with root package name */
    public static final BigInteger f9521f = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));

    static {
        BigInteger bigInteger = a;
        f9517b = bigInteger.multiply(bigInteger);
        a.multiply(f9520e);
        a.multiply(f9521f);
        Charset.forName("UTF-8");
    }

    public static FileOutputStream a(File file, boolean z) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, z);
    }

    public static String a(File file, Charset charset) {
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = e(file);
            try {
                String a2 = e.a(fileInputStream, a.a(charset));
                e.a((InputStream) fileInputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                e.a((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            e.a((InputStream) fileInputStream);
            throw th;
        }
    }

    public static Collection<File> a(File file, g gVar, g gVar2) {
        a(file, gVar);
        g b2 = b(gVar);
        g a2 = a(gVar2);
        LinkedList linkedList = new LinkedList();
        a((Collection<File>) linkedList, file, f.b(b2, a2), false);
        return linkedList;
    }

    private static g a(g gVar) {
        if (gVar == null) {
            return e.f9529c;
        }
        return f.a(gVar, d.f9527c);
    }

    public static void a(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e2 = null;
                for (File file2 : listFiles) {
                    try {
                        c(file2);
                    } catch (IOException e3) {
                        e2 = e3;
                    }
                }
                if (e2 != null) {
                    throw e2;
                }
                return;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static void a(File file, File file2) {
        a(file, file2, true);
    }

    public static void a(File file, File file2, boolean z) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                b(file, file2, z);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void a(File file, CharSequence charSequence) {
        a(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void a(File file, CharSequence charSequence, Charset charset, boolean z) {
        a(file, charSequence == null ? null : charSequence.toString(), charset, z);
    }

    public static void a(File file, String str) {
        a(file, str, Charset.defaultCharset(), false);
    }

    public static void a(File file, String str, Charset charset, boolean z) {
        Throwable th;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = a(file, z);
            try {
                e.a(str, fileOutputStream, charset);
                fileOutputStream.close();
                e.a((OutputStream) fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                e.a((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            e.a((OutputStream) fileOutputStream);
            throw th;
        }
    }

    private static void a(File file, g gVar) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory");
        } else if (gVar == null) {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        }
    }

    /* JADX INFO: finally extract failed */
    public static void a(InputStream inputStream, File file) {
        try {
            FileOutputStream f2 = f(file);
            try {
                e.a(inputStream, f2);
                f2.close();
                e.a((OutputStream) f2);
            } catch (Throwable th) {
                e.a((OutputStream) f2);
                throw th;
            }
        } finally {
            e.a(inputStream);
        }
    }

    private static void a(Collection<File> collection, File file, g gVar, boolean z) {
        File[] listFiles = file.listFiles((FileFilter) gVar);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    a(collection, file2, gVar, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    private static g b(g gVar) {
        return f.a(gVar, f.a(d.f9527c));
    }

    public static void b(File file) {
        if (file.exists()) {
            if (!d(file)) {
                a(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    private static void b(File file, File file2, boolean z) {
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        if (!file2.exists() || !file2.isDirectory()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    fileChannel = fileOutputStream;
                    e.a((Closeable) null);
                    e.a((OutputStream) fileOutputStream);
                    e.a((Closeable) fileChannel);
                    e.a((InputStream) fileInputStream);
                    throw th;
                }
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    try {
                        FileChannel channel2 = fileOutputStream.getChannel();
                        long size = channel.size();
                        long j2 = 0;
                        while (j2 < size) {
                            long j3 = size - j2;
                            j2 += channel2.transferFrom(channel, j2, j3 > 31457280 ? 31457280 : j3);
                        }
                        e.a(channel2);
                        e.a((OutputStream) fileOutputStream);
                        e.a(channel);
                        e.a((InputStream) fileInputStream);
                        if (file.length() != file2.length()) {
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                        } else if (z) {
                            file2.setLastModified(file.lastModified());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = channel;
                        e.a((Closeable) null);
                        e.a((OutputStream) fileOutputStream);
                        e.a((Closeable) fileChannel);
                        e.a((InputStream) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileChannel = null;
                    e.a((Closeable) null);
                    e.a((OutputStream) fileOutputStream);
                    e.a((Closeable) fileChannel);
                    e.a((InputStream) fileInputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                fileOutputStream = null;
                fileChannel = fileOutputStream;
                e.a((Closeable) null);
                e.a((OutputStream) fileOutputStream);
                e.a((Closeable) fileChannel);
                e.a((InputStream) fileInputStream);
                throw th;
            }
        } else {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
    }

    public static void c(File file) {
        if (file.isDirectory()) {
            b(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static boolean d(File file) {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        } else if (c.a()) {
            return false;
        } else {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
    }

    public static FileInputStream e(File file) {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static FileOutputStream f(File file) {
        return a(file, false);
    }

    public static String g(File file) {
        return a(file, Charset.defaultCharset());
    }
}
