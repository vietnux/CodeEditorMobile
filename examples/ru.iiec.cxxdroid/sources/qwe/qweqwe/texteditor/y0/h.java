package qwe.qweqwe.texteditor.y0;

import android.view.View;
import android.widget.EditText;
import qwe.qweqwe.texteditor.y0.r;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnFocusChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r.e.d f9869b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ EditText f9870c;

    public /* synthetic */ h(r.e.d dVar, EditText editText) {
        this.f9869b = dVar;
        this.f9870c = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        r.a(this.f9869b, this.f9870c, view, z);
    }
}
