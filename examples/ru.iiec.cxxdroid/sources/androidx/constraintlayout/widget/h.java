package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class h extends View {
    public h(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.a = i2;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f827b = i2;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f828c = f2;
        setLayoutParams(bVar);
    }

    public void setVisibility(int i2) {
    }
}
