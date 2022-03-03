package d.c;

import android.content.DialogInterface;
import qwe.qweqwe.texteditor.samples.SamplesActivity;

/* compiled from: lambda */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f f6954b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ SamplesActivity f6955c;

    public /* synthetic */ c(f fVar, SamplesActivity samplesActivity) {
        this.f6954b = fVar;
        this.f6955c = samplesActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f6954b.a(this.f6955c, dialogInterface, i2);
    }
}
