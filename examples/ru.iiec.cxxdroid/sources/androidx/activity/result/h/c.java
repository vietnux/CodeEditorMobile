package androidx.activity.result.h;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.a;

public final class c extends a<Intent, a> {
    public Intent a(Context context, Intent intent) {
        return intent;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, java.lang.Object] */
    @Override // androidx.activity.result.h.a
    public /* bridge */ /* synthetic */ Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        a(context, intent2);
        return intent2;
    }

    @Override // androidx.activity.result.h.a
    public a a(int i2, Intent intent) {
        return new a(i2, intent);
    }
}
