package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class g {
    public abstract View a(int i2);

    @Deprecated
    public Fragment a(Context context, String str, Bundle bundle) {
        return Fragment.a(context, str, bundle);
    }

    public abstract boolean b();
}
