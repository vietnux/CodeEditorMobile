package e.f.a.a.d;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import e.f.a.a.a;

public class b extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f8313b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f8314c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8315d;

    public b(Context context, int i2) {
        super(context);
        this.f8315d = i2;
        a();
    }

    private void a() {
        setOrientation(1);
        this.f8314c = new RelativeLayout(getContext());
        this.f8314c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8314c.setId(a.node_header);
        this.f8313b = new LinearLayout(new ContextThemeWrapper(getContext(), this.f8315d), null, this.f8315d);
        this.f8313b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f8313b.setId(a.node_items);
        this.f8313b.setOrientation(1);
        this.f8313b.setVisibility(8);
        addView(this.f8314c);
        addView(this.f8313b);
    }

    public void a(View view) {
        this.f8314c.addView(view);
    }

    public ViewGroup getNodeContainer() {
        return this.f8314c;
    }
}
