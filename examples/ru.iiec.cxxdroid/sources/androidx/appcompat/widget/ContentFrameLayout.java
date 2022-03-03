package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import c.h.l.b0;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private TypedValue f458b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f459c;

    /* renamed from: d  reason: collision with root package name */
    private TypedValue f460d;

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f461e;

    /* renamed from: f  reason: collision with root package name */
    private TypedValue f462f;

    /* renamed from: g  reason: collision with root package name */
    private TypedValue f463g;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f464h;

    /* renamed from: i  reason: collision with root package name */
    private a f465i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f464h = new Rect();
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f464h.set(i2, i3, i4, i5);
        if (b0.I(this)) {
            requestLayout();
        }
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f462f == null) {
            this.f462f = new TypedValue();
        }
        return this.f462f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f463g == null) {
            this.f463g = new TypedValue();
        }
        return this.f463g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f460d == null) {
            this.f460d = new TypedValue();
        }
        return this.f460d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f461e == null) {
            this.f461e = new TypedValue();
        }
        return this.f461e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f458b == null) {
            this.f458b = new TypedValue();
        }
        return this.f458b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f459c == null) {
            this.f459c = new TypedValue();
        }
        return this.f459c;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f465i;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f465i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f465i = aVar;
    }
}
