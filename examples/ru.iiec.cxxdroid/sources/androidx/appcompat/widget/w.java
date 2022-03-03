package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c.h.k.h;

/* access modifiers changed from: package-private */
public final class w {
    private TextView a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f746b;

    w(TextView textView) {
        h.a(textView);
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f746b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void a(TextClassifier textClassifier) {
        this.f746b = textClassifier;
    }
}
