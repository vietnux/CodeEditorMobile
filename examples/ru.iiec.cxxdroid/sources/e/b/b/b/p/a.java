package e.b.b.b.p;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

public class a {
    public static final boolean a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f7837b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f7838c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f7839d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f7840e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f7841f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f7842g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f7843h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f7844i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f7845j = {16842913};

    @TargetApi(21)
    private static int a(int i2) {
        return c.h.e.a.c(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? a(colorForState) : colorForState;
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{f7845j, StateSet.NOTHING}, new int[]{a(colorStateList, f7841f), a(colorStateList, f7837b)});
        }
        int[] iArr = f7841f;
        int[] iArr2 = f7842g;
        int[] iArr3 = f7843h;
        int[] iArr4 = f7844i;
        int[] iArr5 = f7837b;
        int[] iArr6 = f7838c;
        int[] iArr7 = f7839d;
        int[] iArr8 = f7840e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f7845j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{a(colorStateList, iArr), a(colorStateList, iArr2), a(colorStateList, iArr3), a(colorStateList, iArr4), 0, a(colorStateList, iArr5), a(colorStateList, iArr6), a(colorStateList, iArr7), a(colorStateList, iArr8), 0});
    }
}
