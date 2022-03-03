package f.a.a.a.n.d;

import android.content.Context;
import f.a.a.a.n.b.i;
import f.a.a.a.n.b.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b<T> {
    protected final Context a;

    /* renamed from: b  reason: collision with root package name */
    protected final a<T> f8490b;

    /* renamed from: c  reason: collision with root package name */
    protected final k f8491c;

    /* renamed from: d  reason: collision with root package name */
    protected final c f8492d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8493e;

    /* renamed from: f  reason: collision with root package name */
    protected final List<d> f8494f = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    public class a implements Comparator<C0129b> {
        a(b bVar) {
        }

        /* renamed from: a */
        public int compare(C0129b bVar, C0129b bVar2) {
            return (int) (bVar.f8495b - bVar2.f8495b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f.a.a.a.n.d.b$b  reason: collision with other inner class name */
    public static class C0129b {
        final File a;

        /* renamed from: b  reason: collision with root package name */
        final long f8495b;

        public C0129b(File file, long j2) {
            this.a = file;
            this.f8495b = j2;
        }
    }

    public b(Context context, a<T> aVar, k kVar, c cVar, int i2) {
        this.a = context.getApplicationContext();
        this.f8490b = aVar;
        this.f8492d = cVar;
        this.f8491c = kVar;
        this.f8491c.a();
        this.f8493e = i2;
    }

    private void a(int i2) {
        if (!this.f8492d.a(i2, e())) {
            i.a(this.a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", Integer.valueOf(this.f8492d.a()), Integer.valueOf(i2), Integer.valueOf(e())));
            g();
        }
    }

    private void b(String str) {
        for (d dVar : this.f8494f) {
            try {
                dVar.a(str);
            } catch (Exception e2) {
                i.a(this.a, "One of the roll over listeners threw an exception", e2);
            }
        }
    }

    public long a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public void a() {
        c cVar = this.f8492d;
        cVar.a(cVar.c());
        this.f8492d.d();
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f8494f.add(dVar);
        }
    }

    public void a(T t) {
        byte[] a2 = this.f8490b.a(t);
        a(a2.length);
        this.f8492d.a(a2);
    }

    public void a(List<File> list) {
        this.f8492d.a(list);
    }

    public void b() {
        List<File> c2 = this.f8492d.c();
        int f2 = f();
        if (c2.size() > f2) {
            int size = c2.size() - f2;
            i.c(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", Integer.valueOf(c2.size()), Integer.valueOf(f2), Integer.valueOf(size)));
            TreeSet treeSet = new TreeSet(new a(this));
            for (File file : c2) {
                treeSet.add(new C0129b(file, a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0129b) it.next()).a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f8492d.a(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public List<File> d() {
        return this.f8492d.a(1);
    }

    /* access modifiers changed from: protected */
    public int e() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return this.f8493e;
    }

    public boolean g() {
        String str;
        boolean z = true;
        if (!this.f8492d.b()) {
            str = c();
            this.f8492d.a(str);
            i.a(this.a, 4, "Fabric", String.format(Locale.US, "generated new file %s", str));
            this.f8491c.a();
        } else {
            str = null;
            z = false;
        }
        b(str);
        return z;
    }
}
