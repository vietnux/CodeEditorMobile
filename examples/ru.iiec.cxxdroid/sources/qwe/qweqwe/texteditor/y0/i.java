package qwe.qweqwe.texteditor.y0;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import qwe.qweqwe.texteditor.y0.r;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r f9871b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ m[] f9872c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ LinearLayout f9873d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ r.b f9874e;

    public /* synthetic */ i(r rVar, m[] mVarArr, LinearLayout linearLayout, r.b bVar) {
        this.f9871b = rVar;
        this.f9872c = mVarArr;
        this.f9873d = linearLayout;
        this.f9874e = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9871b.a(this.f9872c, this.f9873d, this.f9874e, dialogInterface, i2);
    }
}
