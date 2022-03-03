package iiec.androidterm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;
import iiec.androidterm.r.e;
import iiec.androidterm.r.m;
import iiec.androidterm.r.s;
import iiec.androidterm.t.c;
import java.util.Iterator;
import java.util.LinkedList;

public class TermViewFlipper extends ViewFlipper implements Iterable<View> {

    /* renamed from: b  reason: collision with root package name */
    private Context f9259b;

    /* renamed from: c  reason: collision with root package name */
    private LinkedList<s> f9260c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9261d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f9262e;

    /* renamed from: f  reason: collision with root package name */
    private int f9263f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f9264g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private Rect f9265h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private FrameLayout.LayoutParams f9266i = null;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9267j = false;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f9268k;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f9269l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f9270m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            TermViewFlipper.this.e();
            TermViewFlipper.this.f9269l.postDelayed(this, 1000);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Iterator<View> {

        /* renamed from: b  reason: collision with root package name */
        int f9272b = 0;

        b() {
        }

        public boolean hasNext() {
            return this.f9272b < TermViewFlipper.this.getChildCount();
        }

        @Override // java.util.Iterator
        public View next() {
            TermViewFlipper termViewFlipper = TermViewFlipper.this;
            int i2 = this.f9272b;
            this.f9272b = i2 + 1;
            return termViewFlipper.getChildAt(i2);
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public TermViewFlipper(Context context) {
        super(context);
        boolean z = false;
        this.f9268k = iiec.androidterm.compat.a.a < 8 ? true : z;
        this.f9269l = new Handler();
        this.f9270m = new a();
        a(context);
    }

    public TermViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f9268k = iiec.androidterm.compat.a.a < 8 ? true : z;
        this.f9269l = new Handler();
        this.f9270m = new a();
        a(context);
    }

    private void a(Context context) {
        this.f9259b = context;
        this.f9260c = new LinkedList<>();
        h();
        Rect rect = this.f9264g;
        this.f9266i = new FrameLayout.LayoutParams(rect.width(), rect.height(), 51);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        h();
        Rect rect = this.f9264g;
        int width = rect.width();
        int height = rect.height();
        if (this.f9262e != width || this.f9263f != height) {
            this.f9262e = width;
            this.f9263f = height;
            FrameLayout.LayoutParams layoutParams = this.f9266i;
            layoutParams.width = width;
            layoutParams.height = height;
            Iterator<View> it = iterator();
            while (it.hasNext()) {
                updateViewLayout(it.next(), layoutParams);
            }
            this.f9267j = true;
            e eVar = (e) getCurrentView();
            if (eVar != null) {
                eVar.a(false);
            }
        }
    }

    private void f() {
        Iterator<s> it = this.f9260c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void g() {
        e eVar;
        m termSession;
        if (getChildCount() != 0 && (eVar = (e) getCurrentView()) != null && (termSession = eVar.getTermSession()) != null) {
            String string = this.f9259b.getString(m.window_title, Integer.valueOf(getDisplayedChild() + 1));
            if (termSession instanceof d) {
                ((d) termSession).c(string);
            }
        }
    }

    private void h() {
        Rect rect = this.f9264g;
        Rect rect2 = this.f9265h;
        getGlobalVisibleRect(rect);
        getWindowVisibleDisplayFrame(rect2);
        if (!this.f9261d) {
            rect2.top = 0;
        }
        if (rect.width() == 0 && rect.height() == 0) {
            rect.left = rect2.left;
            rect.top = rect2.top;
        } else {
            int i2 = rect.left;
            int i3 = rect2.left;
            if (i2 < i3) {
                rect.left = i3;
            }
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                rect.top = i5;
            }
        }
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
    }

    public void a() {
        if (this.f9268k) {
            this.f9269l.removeCallbacks(this.f9270m);
        }
        c();
    }

    public void a(s sVar) {
        this.f9260c.remove(sVar);
    }

    public void a(c cVar) {
        boolean x = cVar.x();
        setBackgroundColor(cVar.i()[1]);
        this.f9261d = x;
    }

    public void addView(View view) {
        super.addView(view, this.f9266i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        super.addView(view, i2, this.f9266i);
    }

    public void b() {
        if (this.f9268k) {
            this.f9270m.run();
        }
        d();
    }

    public void c() {
        e eVar = (e) getCurrentView();
        if (eVar != null) {
            eVar.b();
        }
    }

    public void d() {
        e eVar = (e) getCurrentView();
        if (eVar != null) {
            eVar.c();
            eVar.requestFocus();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<View> iterator() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f9267j) {
            requestLayout();
            this.f9267j = false;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        e();
        super.onMeasure(i2, i3);
    }

    public void setDisplayedChild(int i2) {
        c();
        super.setDisplayedChild(i2);
        g();
        d();
        f();
    }

    public void showNext() {
        c();
        super.showNext();
        g();
        d();
        f();
    }

    public void showPrevious() {
        c();
        super.showPrevious();
        g();
        d();
        f();
    }
}
