package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
import c.a.c;
import c.a.d;
import c.a.e;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final PorterDuff.Mode f614b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static i f615c;
    private m0 a;

    /* access modifiers changed from: package-private */
    public class a implements m0.f {
        private final int[] a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        private final int[] f616b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        private final int[] f617c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl, e.abc_text_select_handle_middle_mtrl, e.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f618d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f619e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f620f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        a() {
        }

        private ColorStateList a(Context context) {
            return b(context, 0);
        }

        private void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (d0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f614b;
            }
            drawable.setColorFilter(i.a(i2, mode));
        }

        private boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context) {
            return b(context, r0.b(context, c.a.a.colorAccent));
        }

        private ColorStateList b(Context context, int i2) {
            int b2 = r0.b(context, c.a.a.colorControlHighlight);
            int a2 = r0.a(context, c.a.a.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.f703b, r0.f705d, r0.f704c, r0.f707f}, new int[]{a2, c.h.e.a.b(b2, i2), c.h.e.a.b(b2, i2), i2});
        }

        private LayerDrawable b(m0 m0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable a2 = m0Var.a(context, e.abc_star_black_48dp);
            Drawable a3 = m0Var.a(context, e.abc_star_half_black_48dp);
            if ((a2 instanceof BitmapDrawable) && a2.getIntrinsicWidth() == dimensionPixelSize && a2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) a2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                a2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                a2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((a3 instanceof BitmapDrawable) && a3.getIntrinsicWidth() == dimensionPixelSize && a3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) a3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                a3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                a3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private ColorStateList c(Context context) {
            return b(context, r0.b(context, c.a.a.colorButtonNormal));
        }

        private ColorStateList d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c2 = r0.c(context, c.a.a.colorSwitchThumbNormal);
            if (c2 == null || !c2.isStateful()) {
                iArr[0] = r0.f703b;
                iArr2[0] = r0.a(context, c.a.a.colorSwitchThumbNormal);
                iArr[1] = r0.f706e;
                iArr2[1] = r0.b(context, c.a.a.colorControlActivated);
                iArr[2] = r0.f707f;
                iArr2[2] = r0.b(context, c.a.a.colorSwitchThumbNormal);
            } else {
                iArr[0] = r0.f703b;
                iArr2[0] = c2.getColorForState(iArr[0], 0);
                iArr[1] = r0.f706e;
                iArr2[1] = r0.b(context, c.a.a.colorControlActivated);
                iArr[2] = r0.f707f;
                iArr2[2] = c2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.m0.f
        public ColorStateList a(Context context, int i2) {
            if (i2 == e.abc_edit_text_material) {
                return c.a.k.a.a.b(context, c.abc_tint_edittext);
            }
            if (i2 == e.abc_switch_track_mtrl_alpha) {
                return c.a.k.a.a.b(context, c.abc_tint_switch_track);
            }
            if (i2 == e.abc_switch_thumb_material) {
                return d(context);
            }
            if (i2 == e.abc_btn_default_mtrl_shape) {
                return c(context);
            }
            if (i2 == e.abc_btn_borderless_material) {
                return a(context);
            }
            if (i2 == e.abc_btn_colored_material) {
                return b(context);
            }
            if (i2 == e.abc_spinner_mtrl_am_alpha || i2 == e.abc_spinner_textfield_background_material) {
                return c.a.k.a.a.b(context, c.abc_tint_spinner);
            }
            if (a(this.f616b, i2)) {
                return r0.c(context, c.a.a.colorControlNormal);
            }
            if (a(this.f619e, i2)) {
                return c.a.k.a.a.b(context, c.abc_tint_default);
            }
            if (a(this.f620f, i2)) {
                return c.a.k.a.a.b(context, c.abc_tint_btn_checkable);
            }
            if (i2 == e.abc_seekbar_thumb_material) {
                return c.a.k.a.a.b(context, c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.f
        public PorterDuff.Mode a(int i2) {
            if (i2 == e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.m0.f
        public Drawable a(m0 m0Var, Context context, int i2) {
            int i3;
            if (i2 == e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.a(context, e.abc_cab_background_internal_bg), m0Var.a(context, e.abc_cab_background_top_mtrl_alpha)});
            }
            if (i2 == e.abc_ratingbar_material) {
                i3 = d.abc_star_big;
            } else if (i2 == e.abc_ratingbar_indicator_material) {
                i3 = d.abc_star_medium;
            } else if (i2 != e.abc_ratingbar_small_material) {
                return null;
            } else {
                i3 = d.abc_star_small;
            }
            return b(m0Var, context, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
        @Override // androidx.appcompat.widget.m0.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.m0.f
        public boolean b(Context context, int i2, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable findDrawableByLayerId;
            int i3;
            if (i2 == e.abc_seekbar_track_material) {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.b(context, c.a.a.colorControlNormal), i.f614b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i3 = c.a.a.colorControlNormal;
            } else if (i2 != e.abc_ratingbar_material && i2 != e.abc_ratingbar_indicator_material && i2 != e.abc_ratingbar_small_material) {
                return false;
            } else {
                layerDrawable = (LayerDrawable) drawable;
                a(layerDrawable.findDrawableByLayerId(16908288), r0.a(context, c.a.a.colorControlNormal), i.f614b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
                i3 = c.a.a.colorControlActivated;
            }
            a(findDrawableByLayerId, r0.b(context, i3), i.f614b);
            a(layerDrawable.findDrawableByLayerId(16908301), r0.b(context, c.a.a.colorControlActivated), i.f614b);
            return true;
        }
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (i.class) {
            a2 = m0.a(i2, mode);
        }
        return a2;
    }

    static void a(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.a(drawable, u0Var, iArr);
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            if (f615c == null) {
                c();
            }
            iVar = f615c;
        }
        return iVar;
    }

    public static synchronized void c() {
        synchronized (i.class) {
            if (f615c == null) {
                f615c = new i();
                f615c.a = m0.a();
                f615c.a.a(new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i2) {
        return this.a.a(context, i2);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i2, boolean z) {
        return this.a.a(context, i2, z);
    }

    public synchronized void a(Context context) {
        this.a.a(context);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int i2) {
        return this.a.b(context, i2);
    }
}
