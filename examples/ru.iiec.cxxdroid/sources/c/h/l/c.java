package c.h.l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c.h.b;
import c.h.l.l0.d;
import c.h.l.l0.e;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f2390c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f2391b;

    /* access modifiers changed from: package-private */
    public static final class a extends View.AccessibilityDelegate {
        final c a;

        a(c cVar) {
            this.a = cVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e a2 = this.a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            d a2 = d.a(accessibilityNodeInfo);
            a2.i(b0.L(view));
            a2.h(b0.G(view));
            a2.d(b0.g(view));
            a2.e(b0.z(view));
            this.a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List<d.a> b2 = c.b(view);
            for (int i2 = 0; i2 < b2.size(); i2++) {
                a2.a(b2.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.a(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.a.a(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.d(view, accessibilityEvent);
        }
    }

    public c() {
        this(f2390c);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.f2391b = new a(this);
    }

    private boolean a(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] f2 = d.f(view.createAccessibilityNodeInfo().getText());
            int i2 = 0;
            while (f2 != null && i2 < f2.length) {
                if (clickableSpan.equals(f2[i2])) {
                    return true;
                }
                i2++;
            }
        }
        return false;
    }

    static List<d.a> b(View view) {
        List<d.a> list = (List) view.getTag(b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f2391b;
    }

    public e a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new e(accessibilityNodeProvider);
    }

    public void a(View view, int i2) {
        this.a.sendAccessibilityEvent(view, i2);
    }

    public void a(View view, d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.v());
    }

    public boolean a(View view, int i2, Bundle bundle) {
        List<d.a> b2 = b(view);
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 >= b2.size()) {
                break;
            }
            d.a aVar = b2.get(i3);
            if (aVar.a() == i2) {
                z = aVar.a(view, bundle);
                break;
            }
            i3++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.a.performAccessibilityAction(view, i2, bundle);
        }
        return (z || i2 != b.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
