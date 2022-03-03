package c.p.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import c.e.h;
import c.p.b.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* access modifiers changed from: package-private */
public class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f2517c = false;
    private final i a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2518b;

    public static class a<D> extends n<D> implements a.AbstractC0058a<D> {

        /* renamed from: k  reason: collision with root package name */
        private final int f2519k;

        /* renamed from: l  reason: collision with root package name */
        private final Bundle f2520l;

        /* renamed from: m  reason: collision with root package name */
        private final c.p.b.a<D> f2521m;
        private i n;
        private C0057b<D> o;
        private c.p.b.a<D> p;

        /* access modifiers changed from: package-private */
        public c.p.b.a<D> a(boolean z) {
            if (b.f2517c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f2521m.a();
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void a() {
            if (b.f2517c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f2521m.c();
            throw null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.n
        public void a(D d2) {
            super.a((Object) d2);
            c.p.b.a<D> aVar = this.p;
            if (aVar != null) {
                aVar.b();
                throw null;
            }
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2519k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2520l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2521m);
            c.p.b.a<D> aVar = this.f2521m;
            aVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void b() {
            if (b.f2517c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f2521m.d();
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.o<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void b(o<? super D> oVar) {
            super.b(oVar);
            this.n = null;
            this.o = null;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            i iVar = this.n;
            C0057b<D> bVar = this.o;
            if (iVar != null && bVar != null) {
                super.b(bVar);
                a(iVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2519k);
            sb.append(" : ");
            c.h.k.b.a(this.f2521m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.p.a.b$b  reason: collision with other inner class name */
    public static class C0057b<D> implements o<D> {
    }

    static class c extends s {

        /* renamed from: c  reason: collision with root package name */
        private static final t.a f2522c = new a();

        /* renamed from: b  reason: collision with root package name */
        private h<a> f2523b = new h<>();

        static class a implements t.a {
            a() {
            }

            @Override // androidx.lifecycle.t.a
            public <T extends s> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c a(u uVar) {
            return (c) new t(uVar, f2522c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2523b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f2523b.b() > 0) {
                    a c2 = this.f2523b.c(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2523b.b(0));
                    printWriter.print(": ");
                    printWriter.println(c2.toString());
                    c2.a(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.s
        public void b() {
            super.b();
            if (this.f2523b.b() <= 0) {
                this.f2523b.a();
            } else {
                this.f2523b.c(0).a(true);
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            int b2 = this.f2523b.b();
            for (int i2 = 0; i2 < b2; i2++) {
                this.f2523b.c(i2).c();
            }
        }
    }

    b(i iVar, u uVar) {
        this.a = iVar;
        this.f2518b = c.a(uVar);
    }

    @Override // c.p.a.a
    public void a() {
        this.f2518b.c();
    }

    @Override // c.p.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2518b.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.h.k.b.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
