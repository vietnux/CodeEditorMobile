package qwe.qweqwe.texteditor.ui.onboarding;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import g.r.d.i;
import qwe.qweqwe.texteditor.n0;
import qwe.qweqwe.texteditor.o0;
import qwe.qweqwe.texteditor.q0;

public final class m extends j {
    @Override // qwe.qweqwe.texteditor.ui.onboarding.j, androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        i.c(view, "view");
        super.a(view, bundle);
        ((TextView) view.findViewById(n0.title)).setText(a(q0.onboarding_welcome_title, a(q0.app_name)));
        ((TextView) view.findViewById(n0.message)).setText(a(q0.onboarding_welcome_message, a(q0.app_name)));
    }

    @Override // qwe.qweqwe.texteditor.ui.onboarding.j
    public int v0() {
        return o0.onboarding_welcome;
    }
}
