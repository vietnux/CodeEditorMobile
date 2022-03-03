package f.a.a.a.n.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import f.a.a.a.i;

public class d implements c {
    private final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8533b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8534c;

    public d(Context context, String str) {
        if (context != null) {
            this.f8534c = context;
            this.f8533b = str;
            this.a = this.f8534c.getSharedPreferences(this.f8533b, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public d(i iVar) {
        this(iVar.j(), iVar.getClass().getName());
    }

    @Override // f.a.a.a.n.f.c
    public SharedPreferences.Editor a() {
        return this.a.edit();
    }

    @Override // f.a.a.a.n.f.c
    @TargetApi(9)
    public boolean a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    @Override // f.a.a.a.n.f.c
    public SharedPreferences get() {
        return this.a;
    }
}
