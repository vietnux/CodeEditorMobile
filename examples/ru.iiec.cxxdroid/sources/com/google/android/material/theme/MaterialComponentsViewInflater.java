package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.j;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;

@Keep
public class MaterialComponentsViewInflater extends j {
    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.j
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
