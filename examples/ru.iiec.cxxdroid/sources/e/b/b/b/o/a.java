package e.b.b.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public class a {
    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList b2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b2 = c.a.k.a.a.b(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : b2;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable c2;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (c2 = c.a.k.a.a.c(context, resourceId)) == null) ? typedArray.getDrawable(i2) : c2;
    }
}
