package e.b.b.a.c.e;

import com.google.android.gms.common.internal.y;
import java.util.List;
import java.util.Map;

final class g1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final f1 f7269b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7270c;

    /* renamed from: d  reason: collision with root package name */
    private final Throwable f7271d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f7272e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7273f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, List<String>> f7274g;

    private g1(String str, f1 f1Var, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        y.a(f1Var);
        this.f7269b = f1Var;
        this.f7270c = i2;
        this.f7271d = th;
        this.f7272e = bArr;
        this.f7273f = str;
        this.f7274g = map;
    }

    public final void run() {
        this.f7269b.a(this.f7273f, this.f7270c, this.f7271d, this.f7272e, this.f7274g);
    }
}
