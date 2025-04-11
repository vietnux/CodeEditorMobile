package e.d.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.Vector;

public abstract class k extends Thread implements j0 {

    /* renamed from: b  reason: collision with root package name */
    protected String f8227b;

    /* renamed from: c  reason: collision with root package name */
    protected String f8228c;

    /* renamed from: d  reason: collision with root package name */
    protected l f8229d;

    /* renamed from: e  reason: collision with root package name */
    protected Vector<i0> f8230e;

    /* renamed from: f  reason: collision with root package name */
    protected a f8231f = new a();

    public k(File file, String str, String str2) {
        this.f8227b = str;
        this.f8228c = str2;
        this.f8229d = new l();
        this.f8230e = new Vector<>();
    }

    /* access modifiers changed from: protected */
    public synchronized void a(int i2) {
        Iterator<i0> it = this.f8230e.iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void a(int i2, int i3, String str) {
        Iterator<i0> it = this.f8230e.iterator();
        while (it.hasNext()) {
            it.next().a(i2, i3, str);
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void b(int i2) {
        Iterator<i0> it = this.f8230e.iterator();
        while (it.hasNext()) {
            it.next().a(i2, null);
        }
    }
}
