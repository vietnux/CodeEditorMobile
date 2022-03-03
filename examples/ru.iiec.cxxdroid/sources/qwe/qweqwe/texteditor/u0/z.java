package qwe.qweqwe.texteditor.u0;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class z implements RecyclerView.t {
    private GestureDetector a;

    /* renamed from: b  reason: collision with root package name */
    private b f9769b;

    class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f9770b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f9771c;

        a(z zVar, RecyclerView recyclerView, b bVar) {
            this.f9770b = recyclerView;
            this.f9771c = bVar;
        }

        public void onLongPress(MotionEvent motionEvent) {
            b bVar;
            View a = this.f9770b.a(motionEvent.getX(), motionEvent.getY());
            if (a != null && (bVar = this.f9771c) != null) {
                bVar.b(a, this.f9770b.f(a));
            }
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    public interface b {
        void a(View view, int i2);

        void b(View view, int i2);
    }

    public z(Context context, RecyclerView recyclerView, b bVar) {
        this.f9769b = bVar;
        this.a = new GestureDetector(context, new a(this, recyclerView, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a2 = recyclerView.a(motionEvent.getX(), motionEvent.getY());
        if (a2 == null || this.f9769b == null || !this.a.onTouchEvent(motionEvent)) {
            return false;
        }
        this.f9769b.a(a2, recyclerView.f(a2));
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
