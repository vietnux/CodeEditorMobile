package d.c;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: lambda */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f6949b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6950c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Activity f6951d;

    public /* synthetic */ a(f fVar, String str, Activity activity) {
        this.f6949b = fVar;
        this.f6950c = str;
        this.f6951d = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f.a(this.f6949b, this.f6950c, this.f6951d, dialogInterface, i2);
    }
}
