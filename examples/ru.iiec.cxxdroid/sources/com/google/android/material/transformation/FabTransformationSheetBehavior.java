package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import com.google.android.material.transformation.FabTransformationBehavior;
import e.b.b.b.a;
import e.b.b.b.k.h;
import e.b.b.b.k.j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    private Map<View, Integer> f6567g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(View view, boolean z) {
        int i2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f6567g = new HashMap(childCount);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f6567g;
                        if (map != null && map.containsKey(childAt)) {
                            i2 = this.f6567g.get(childAt).intValue();
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f6567g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        i2 = 4;
                    }
                    b0.h(childAt, i2);
                }
            }
            if (!z) {
                this.f6567g = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.e a(Context context, boolean z) {
        int i2 = z ? a.mtrl_fab_transformation_sheet_expand_spec : a.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.a = h.a(context, i2);
        eVar.f6563b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior, com.google.android.material.transformation.ExpandableTransformationBehavior
    public boolean a(View view, View view2, boolean z, boolean z2) {
        a(view2, z);
        return super.a(view, view2, z, z2);
    }
}
