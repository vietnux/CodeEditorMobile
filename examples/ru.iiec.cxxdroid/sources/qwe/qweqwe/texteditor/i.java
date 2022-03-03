package qwe.qweqwe.texteditor;

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: lambda */
public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e0 f9653b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ EditText f9654c;

    public /* synthetic */ i(e0 e0Var, EditText editText) {
        this.f9653b = e0Var;
        this.f9654c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f9653b.a(this.f9654c, dialogInterface, i2);
    }
}
