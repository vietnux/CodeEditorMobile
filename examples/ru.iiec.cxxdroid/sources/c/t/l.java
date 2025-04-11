package c.t;

import android.view.View;
import android.view.ViewGroup;

public class l {
    private ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f2591b;

    static l a(View view) {
        return (l) view.getTag(j.transition_current_scene);
    }

    static void a(View view, l lVar) {
        view.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (a(this.a) == this && (runnable = this.f2591b) != null) {
            runnable.run();
        }
    }
}
