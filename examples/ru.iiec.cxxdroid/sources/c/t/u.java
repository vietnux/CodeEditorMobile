package c.t;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public class u extends a0 implements w {
    u(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    static u a(ViewGroup viewGroup) {
        return (u) a0.c(viewGroup);
    }

    @Override // c.t.w
    public void a(View view) {
        this.a.a(view);
    }

    @Override // c.t.w
    public void b(View view) {
        this.a.b(view);
    }
}
