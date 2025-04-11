package c.h.j;

import java.util.Locale;

public final class d {
    public static final c a = new e(b.a, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f2364b = new e(b.a, true);

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f2365b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // c.h.j.d.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int a2 = d.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i2++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // c.h.j.d.c
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                i5 = d.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return i5;
        }
    }

    /* access modifiers changed from: private */
    public interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* renamed from: c.h.j.d$d  reason: collision with other inner class name */
    private static abstract class AbstractC0048d implements c {
        private final c a;

        AbstractC0048d(c cVar) {
            this.a = cVar;
        }

        private boolean b(CharSequence charSequence, int i2, int i3) {
            int a2 = this.a.a(charSequence, i2, i3);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract boolean a();

        @Override // c.h.j.c
        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence != null && i2 >= 0 && i3 >= 0 && charSequence.length() - i3 >= i2) {
                return this.a == null ? a() : b(charSequence, i2, i3);
            }
            throw new IllegalArgumentException();
        }
    }

    private static class e extends AbstractC0048d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f2366b;

        e(c cVar, boolean z) {
            super(cVar);
            this.f2366b = z;
        }

        /* access modifiers changed from: protected */
        @Override // c.h.j.d.AbstractC0048d
        public boolean a() {
            return this.f2366b;
        }
    }

    private static class f extends AbstractC0048d {

        /* renamed from: b  reason: collision with root package name */
        static final f f2367b = new f();

        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        @Override // c.h.j.d.AbstractC0048d
        public boolean a() {
            return e.b(Locale.getDefault()) == 1;
        }
    }

    static {
        new e(null, false);
        new e(null, true);
        new e(a.f2365b, false);
        f fVar = f.f2367b;
    }

    static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
