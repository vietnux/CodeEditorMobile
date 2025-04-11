package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.mr.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class mr<MessageType extends mr<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends up<MessageType, BuilderType> {
    private static Map<Object, mr<?, ?>> zzdtv = new ConcurrentHashMap();
    protected eu zzdtt = eu.d();
    private int zzdtu = -1;

    public static abstract class a<MessageType extends mr<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends vp<MessageType, BuilderType> {

        /* renamed from: b  reason: collision with root package name */
        private final MessageType f4974b;

        /* renamed from: c  reason: collision with root package name */
        protected MessageType f4975c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4976d = false;

        protected a(MessageType messagetype) {
            this.f4974b = messagetype;
            this.f4975c = (MessageType) ((mr) messagetype.a(e.f4979d, null, null));
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            et.a().a(messagetype).a(messagetype, messagetype2);
        }

        public final BuilderType a(MessageType messagetype) {
            g();
            a(this.f4975c, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.ads.us
        public final /* synthetic */ ss a() {
            return this.f4974b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.mr$a<MessageType extends com.google.android.gms.internal.ads.mr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.mr$a<MessageType, BuilderType>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.vp
        public final /* synthetic */ vp a(up upVar) {
            a((mr) upVar);
            return this;
        }

        @Override // java.lang.Object
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f4974b.a(e.f4980e, null, null);
            if (!this.f4976d) {
                MessageType messagetype = this.f4975c;
                et.a().a(messagetype).c(messagetype);
                this.f4976d = true;
            }
            aVar.a((mr) this.f4975c);
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final void g() {
            if (this.f4976d) {
                MessageType messagetype = (MessageType) ((mr) this.f4975c.a(e.f4979d, null, null));
                a(messagetype, this.f4975c);
                this.f4975c = messagetype;
                this.f4976d = false;
            }
        }

        public final MessageType h() {
            boolean z = true;
            if (!this.f4976d) {
                MessageType messagetype = this.f4975c;
                et.a().a(messagetype).c(messagetype);
                this.f4976d = true;
            }
            MessageType messagetype2 = this.f4975c;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.a(e.a, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = et.a().a(messagetype2).b(messagetype2);
                    if (booleanValue) {
                        messagetype2.a(e.f4977b, z ? messagetype2 : null, null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new cu(messagetype2);
        }

        @Override // com.google.android.gms.internal.ads.ts
        public final /* synthetic */ ss m() {
            if (this.f4976d) {
                return this.f4975c;
            }
            MessageType messagetype = this.f4975c;
            et.a().a(messagetype).c(messagetype);
            this.f4976d = true;
            return this.f4975c;
        }

        @Override // com.google.android.gms.internal.ads.ts
        public final /* synthetic */ ss n() {
            boolean z = true;
            if (!this.f4976d) {
                MessageType messagetype = this.f4975c;
                et.a().a(messagetype).c(messagetype);
                this.f4976d = true;
            }
            MessageType messagetype2 = this.f4975c;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype2.a(e.a, null, null)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = et.a().a(messagetype2).b(messagetype2);
                    if (booleanValue) {
                        messagetype2.a(e.f4977b, z ? messagetype2 : null, null);
                    }
                }
            }
            if (z) {
                return messagetype2;
            }
            throw new cu(messagetype2);
        }
    }

    public static class b<T extends mr<T, ?>> extends yp<T> {
        public b(T t) {
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends mr<MessageType, BuilderType> implements us {
        protected er<Object> zzdtz = er.i();
    }

    public static class d<ContainingType extends ss, Type> extends wq<ContainingType, Type> {
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class e {
        public static final int a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f4977b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f4978c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f4979d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f4980e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f4981f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f4982g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f4983h = {a, f4977b, f4978c, f4979d, f4980e, f4981f, f4982g};

        /* renamed from: i  reason: collision with root package name */
        public static final int f4984i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f4985j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f4986k = 1;

        /* renamed from: l  reason: collision with root package name */
        public static final int f4987l = 2;

        static {
            int[] iArr = {f4984i, f4985j};
            int[] iArr2 = {f4986k, f4987l};
        }

        public static int[] a() {
            return (int[]) f4983h.clone();
        }
    }

    protected static <T extends mr<T, ?>> T a(T t, fq fqVar) {
        boolean z;
        T t2 = (T) a(t, fqVar, zq.b());
        boolean z2 = false;
        if (t2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t2.a(e.a, null, null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = et.a().a(t2).b(t2);
                if (booleanValue) {
                    t2.a(e.f4977b, z ? t2 : null, null);
                }
            }
            if (!z) {
                sr b2 = new cu(t2).b();
                b2.a(t2);
                throw b2;
            }
        }
        if (t2 != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) t2.a(e.a, null, null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = et.a().a(t2).b(t2);
                if (booleanValue2) {
                    t2.a(e.f4977b, z2 ? t2 : null, null);
                }
            }
            if (!z2) {
                sr b3 = new cu(t2).b();
                b3.a(t2);
                throw b3;
            }
        }
        return t2;
    }

    private static <T extends mr<T, ?>> T a(T t, fq fqVar, zq zqVar) {
        try {
            oq e2 = fqVar.e();
            T t2 = (T) a(t, e2, zqVar);
            try {
                e2.a(0);
                return t2;
            } catch (sr e3) {
                e3.a(t2);
                throw e3;
            }
        } catch (sr e4) {
            throw e4;
        }
    }

    private static <T extends mr<T, ?>> T a(T t, oq oqVar, zq zqVar) {
        T t2 = (T) ((mr) t.a(e.f4979d, null, null));
        try {
            et.a().a(t2).a(t2, rq.a(oqVar), zqVar);
            et.a().a(t2).c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof sr) {
                throw ((sr) e2.getCause());
            }
            sr srVar = new sr(e2.getMessage());
            srVar.a(t2);
            throw srVar;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof sr) {
                throw ((sr) e3.getCause());
            }
            throw e3;
        }
    }

    private static <T extends mr<T, ?>> T a(T t, byte[] bArr) {
        T t2 = (T) ((mr) t.a(e.f4979d, null, null));
        try {
            et.a().a(t2).a(t2, bArr, 0, bArr.length, new cq());
            et.a().a(t2).c(t2);
            if (t2.zzdpf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof sr) {
                throw ((sr) e2.getCause());
            }
            sr srVar = new sr(e2.getMessage());
            srVar.a(t2);
            throw srVar;
        } catch (IndexOutOfBoundsException unused) {
            sr b2 = sr.b();
            b2.a(t2);
            throw b2;
        }
    }

    static <T extends mr<?, ?>> T a(Class<T> cls) {
        T t = (T) zzdtv.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzdtv.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
    }

    protected static Object a(ss ssVar, String str, Object[] objArr) {
        return new gt(ssVar, str, objArr);
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <T extends mr<?, ?>> void a(Class<T> cls, T t) {
        zzdtv.put(cls, t);
    }

    protected static <T extends mr<T, ?>> T b(T t, byte[] bArr) {
        T t2 = (T) a(t, bArr);
        if (t2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t2.a(e.a, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = et.a().a(t2).b(t2);
                    if (booleanValue) {
                        t2.a(e.f4977b, z ? t2 : null, null);
                    }
                }
            }
            if (!z) {
                sr b2 = new cu(t2).b();
                b2.a(t2);
                throw b2;
            }
        }
        return t2;
    }

    protected static <E> rr<E> h() {
        return ft.b();
    }

    @Override // com.google.android.gms.internal.ads.us
    public final /* synthetic */ ss a() {
        return (mr) a(e.f4981f, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i2, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.up
    public final void a(int i2) {
        this.zzdtu = i2;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void a(sq sqVar) {
        et.a().a((Class) getClass()).a((Object) this, (xu) uq.a(sqVar));
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int b() {
        if (this.zzdtu == -1) {
            this.zzdtu = et.a().a(this).a(this);
        }
        return this.zzdtu;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final /* synthetic */ ts c() {
        a aVar = (a) a(e.f4980e, (Object) null, (Object) null);
        aVar.a((mr) this);
        return aVar;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final /* synthetic */ ts d() {
        return (a) a(e.f4980e, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((mr) a(e.f4981f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return et.a().a(this).b(this, (mr) obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.up
    public final int g() {
        return this.zzdtu;
    }

    public int hashCode() {
        int i2 = this.zzdpf;
        if (i2 != 0) {
            return i2;
        }
        this.zzdpf = et.a().a(this).d(this);
        return this.zzdpf;
    }

    @Override // com.google.android.gms.internal.ads.us
    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) a(e.a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b2 = et.a().a(this).b(this);
        if (booleanValue) {
            a(e.f4977b, b2 ? this : null, (Object) null);
        }
        return b2;
    }

    public String toString() {
        return vs.a(this, super.toString());
    }
}
