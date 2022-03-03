package com.github.johnkil.print;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PrintView extends ImageView implements b {
    public PrintView(Context context) {
        super(context);
        a(context, null);
    }

    public PrintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PrintView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public PrintView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setImageDrawable(e.a(context, attributeSet, isInEditMode()));
    }

    public d getIcon() {
        return (d) getDrawable();
    }

    public final ColorStateList getIconColor() {
        return getIcon().a();
    }

    public Typeface getIconFont() {
        return getIcon().b();
    }

    public int getIconSize() {
        return getIcon().c();
    }

    public CharSequence getIconText() {
        return getIcon().d();
    }

    public void setIconColor(int i2) {
        getIcon().a(i2);
    }

    public void setIconColor(ColorStateList colorStateList) {
        getIcon().a(colorStateList);
    }

    public void setIconFont(Typeface typeface) {
        getIcon().a(typeface);
    }

    public void setIconFont(String str) {
        getIcon().a(str);
    }

    public void setIconSize(int i2) {
        getIcon().b(i2);
        setSelected(isSelected());
    }

    public void setIconText(int i2) {
        getIcon().c(i2);
    }

    public void setIconText(CharSequence charSequence) {
        getIcon().a(charSequence);
    }
}
