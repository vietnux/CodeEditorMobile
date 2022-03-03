package d.c;

import android.app.Activity;
import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f6952b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f6953c;

    public /* synthetic */ b(Activity activity, f fVar) {
        this.f6952b = activity;
        this.f6953c = fVar;
    }

    public final void onClick(View view) {
        f.a(this.f6952b, this.f6953c, view);
    }
}
