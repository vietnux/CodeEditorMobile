package c.h.l;

import android.view.View;
import android.view.ViewGroup;
import g.r.d.i;
import g.u.d;
import java.util.Iterator;

public final class e0 {

    public static final class a implements d<View> {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // g.u.d
        public Iterator<View> iterator() {
            return e0.b(this.a);
        }
    }

    public static final class b implements Iterator<View>, g.r.d.r.b {

        /* renamed from: b  reason: collision with root package name */
        private int f2400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2401c;

        b(ViewGroup viewGroup) {
            this.f2401c = viewGroup;
        }

        public boolean hasNext() {
            return this.f2400b < this.f2401c.getChildCount();
        }

        @Override // java.util.Iterator
        public View next() {
            ViewGroup viewGroup = this.f2401c;
            int i2 = this.f2400b;
            this.f2400b = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public void remove() {
            this.f2400b--;
            this.f2401c.removeViewAt(this.f2400b);
        }
    }

    public static final d<View> a(ViewGroup viewGroup) {
        i.c(viewGroup, "<this>");
        return new a(viewGroup);
    }

    public static final Iterator<View> b(ViewGroup viewGroup) {
        i.c(viewGroup, "<this>");
        return new b(viewGroup);
    }
}
