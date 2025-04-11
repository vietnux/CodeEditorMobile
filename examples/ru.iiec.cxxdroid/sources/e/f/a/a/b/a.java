package e.f.a.a.b;

import android.view.View;
import android.widget.TextView;
import e.f.a.a.c.a;

public class a extends a.AbstractC0120a<Object> {
    @Override // e.f.a.a.c.a.AbstractC0120a
    public View createNodeView(e.f.a.a.c.a aVar, Object obj) {
        TextView textView = new TextView(this.context);
        textView.setText(String.valueOf(obj));
        return textView;
    }

    @Override // e.f.a.a.c.a.AbstractC0120a
    public void toggle(boolean z) {
    }
}
