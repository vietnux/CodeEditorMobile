package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.w0;
import c.a.a;
import c.a.f;
import c.a.g;
import c.a.j;
import c.h.l.b0;

public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    private j f278b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f279c;

    /* renamed from: d  reason: collision with root package name */
    private RadioButton f280d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f281e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f282f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f283g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f284h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f285i;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f286j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f287k;

    /* renamed from: l  reason: collision with root package name */
    private int f288l;

    /* renamed from: m  reason: collision with root package name */
    private Context f289m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        w0 a = w0.a(getContext(), attributeSet, j.MenuView, i2, 0);
        this.f287k = a.b(j.MenuView_android_itemBackground);
        this.f288l = a.g(j.MenuView_android_itemTextAppearance, -1);
        this.n = a.a(j.MenuView_preserveIconSpacing, false);
        this.f289m = context;
        this.o = a.b(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        a.b();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        a(view, -1);
    }

    private void a(View view, int i2) {
        LinearLayout linearLayout = this.f286j;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void b() {
        this.f282f = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        a(this.f282f);
    }

    private void c() {
        this.f279c = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup) this, false);
        a(this.f279c, 0);
    }

    private void d() {
        this.f280d = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup) this, false);
        a(this.f280d);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f284h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void a(j jVar, int i2) {
        this.f278b = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        setTitle(jVar.a(this));
        setCheckable(jVar.isCheckable());
        a(jVar.m(), jVar.d());
        setIcon(jVar.getIcon());
        setEnabled(jVar.isEnabled());
        setSubMenuArrowVisible(jVar.hasSubMenu());
        setContentDescription(jVar.getContentDescription());
    }

    public void a(boolean z, char c2) {
        int i2 = (!z || !this.f278b.m()) ? 8 : 0;
        if (i2 == 0) {
            this.f283g.setText(this.f278b.e());
        }
        if (this.f283g.getVisibility() != i2) {
            this.f283g.setVisibility(i2);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean a() {
        return false;
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f285i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f285i.getLayoutParams();
            rect.top += this.f285i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f278b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        b0.a(this, this.f287k);
        this.f281e = (TextView) findViewById(f.title);
        int i2 = this.f288l;
        if (i2 != -1) {
            this.f281e.setTextAppearance(this.f289m, i2);
        }
        this.f283g = (TextView) findViewById(f.shortcut);
        this.f284h = (ImageView) findViewById(f.submenuarrow);
        ImageView imageView = this.f284h;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.f285i = (ImageView) findViewById(f.group_divider);
        this.f286j = (LinearLayout) findViewById(f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.f279c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f279c.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f280d != null || this.f282f != null) {
            if (this.f278b.i()) {
                if (this.f280d == null) {
                    d();
                }
                compoundButton2 = this.f280d;
                compoundButton = this.f282f;
            } else {
                if (this.f282f == null) {
                    b();
                }
                compoundButton2 = this.f282f;
                compoundButton = this.f280d;
            }
            if (z) {
                compoundButton2.setChecked(this.f278b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f282f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f280d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f278b.i()) {
            if (this.f280d == null) {
                d();
            }
            compoundButton = this.f280d;
        } else {
            if (this.f282f == null) {
                b();
            }
            compoundButton = this.f282f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f285i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f278b.l() || this.r;
        if (!z && !this.n) {
            return;
        }
        if (this.f279c != null || drawable != null || this.n) {
            if (this.f279c == null) {
                c();
            }
            if (drawable != null || this.n) {
                ImageView imageView = this.f279c;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f279c.getVisibility() != 0) {
                    this.f279c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f279c.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f281e.setText(charSequence);
            if (this.f281e.getVisibility() != 0) {
                textView = this.f281e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f281e.getVisibility() != 8) {
                textView = this.f281e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
