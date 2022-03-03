package h.b.a.c;

import android.text.TextUtils;
import h.b.a.c.d;

public abstract class e<T, S extends d<T>> implements c<T> {
    private boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    private S f8698b;

    /* renamed from: c  reason: collision with root package name */
    private int f8699c;

    public e(S s, int i2) {
        this.f8698b = s;
        this.f8699c = i2;
        b();
    }

    private boolean a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return a().a(str, obj);
        }
        throw new IllegalArgumentException("Preference key value cannot be empty.");
    }

    /* access modifiers changed from: protected */
    public S a() {
        return this.f8698b;
    }

    public T a(String str) {
        return (T) this.f8698b.a(str);
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(int i2) {
        if (i2 >= 1) {
            try {
                int version = a().getVersion();
                if (version != i2) {
                    if (version == 0) {
                        h.b("create " + this + " with initial version 0");
                        b(i2);
                        a().a(i2);
                    } else if (version > i2) {
                        h.b("downgrading " + this + "from " + version + " to " + i2);
                        a(version, i2);
                        throw null;
                    } else {
                        h.b("upgrading " + this + " from " + version + " to " + i2);
                        b(version, i2);
                        throw null;
                    }
                }
                this.a = true;
            } catch (f e2) {
                e2.printStackTrace();
                h.b("could not change the version, retrying with the next interaction");
            }
        } else {
            throw new IllegalArgumentException("Version must be >= 1, was " + i2);
        }
        return;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3) {
        throw new IllegalStateException("Can't downgrade " + this + " from version " + i2 + " to " + i3);
    }

    public boolean a(String str, int i2) {
        if (!b()) {
            return false;
        }
        h.b("put '" + str + "=" + i2 + "' into " + this);
        return a(str, Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public void b(int i2) {
    }

    /* access modifiers changed from: protected */
    public void b(int i2, int i3) {
        throw new IllegalStateException("Can't upgrade database from version " + i2 + " to " + i3 + ", not implemented.");
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (!this.a) {
            a(this.f8699c);
        }
        return this.a;
    }
}
