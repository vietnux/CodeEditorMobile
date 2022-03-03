package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public class k {
    static int a(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.e() == 0 || b0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.l(view) - pVar.l(view2)) + 1;
        }
        return Math.min(iVar.g(), iVar.a(view2) - iVar.d(view));
    }

    static int a(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.e() == 0 || b0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (b0Var.a() - Math.max(pVar.l(view), pVar.l(view2))) - 1) : Math.max(0, Math.min(pVar.l(view), pVar.l(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(iVar.a(view2) - iVar.d(view))) / ((float) (Math.abs(pVar.l(view) - pVar.l(view2)) + 1)))) + ((float) (iVar.f() - iVar.d(view))));
    }

    static int b(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.e() == 0 || b0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.a();
        }
        return (int) ((((float) (iVar.a(view2) - iVar.d(view))) / ((float) (Math.abs(pVar.l(view) - pVar.l(view2)) + 1))) * ((float) b0Var.a()));
    }
}
