package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public class l implements LayoutInflater.Factory2 {

    /* renamed from: b  reason: collision with root package name */
    final n f1307b;

    /* access modifiers changed from: package-private */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f1308b;

        a(w wVar) {
            this.f1308b = wVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k2 = this.f1308b.k();
            this.f1308b.l();
            e0.a((ViewGroup) k2.I.getParent(), l.this.f1307b).b();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    l(n nVar) {
        this.f1307b = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
