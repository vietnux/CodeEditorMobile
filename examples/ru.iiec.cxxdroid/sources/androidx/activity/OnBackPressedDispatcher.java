package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f83b = new ArrayDeque<>();

    /* access modifiers changed from: private */
    public class LifecycleOnBackPressedCancellable implements g, a {
        private final f a;

        /* renamed from: b  reason: collision with root package name */
        private final b f84b;

        /* renamed from: c  reason: collision with root package name */
        private a f85c;

        LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.a = fVar;
            this.f84b = bVar;
            fVar.a(this);
        }

        @Override // androidx.lifecycle.g
        public void a(i iVar, f.b bVar) {
            if (bVar == f.b.ON_START) {
                this.f85c = OnBackPressedDispatcher.this.a(this.f84b);
            } else if (bVar == f.b.ON_STOP) {
                a aVar = this.f85c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == f.b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.b(this);
            this.f84b.b(this);
            a aVar = this.f85c;
            if (aVar != null) {
                aVar.cancel();
                this.f85c = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public class a implements a {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f83b.remove(this.a);
            this.a.b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    /* access modifiers changed from: package-private */
    public a a(b bVar) {
        this.f83b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f83b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.b()) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @SuppressLint({"LambdaLast"})
    public void a(i iVar, b bVar) {
        f a2 = iVar.a();
        if (a2.a() != f.c.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }
}
