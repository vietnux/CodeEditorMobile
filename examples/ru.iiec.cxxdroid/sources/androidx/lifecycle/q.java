package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.f;

public class q extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    private a f1476b;

    /* access modifiers changed from: package-private */
    public interface a {
        void onResume();

        void u0();

        void v0();
    }

    /* access modifiers changed from: package-private */
    public static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            q.a(activity, f.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            q.a(activity, f.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            q.a(activity, f.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            q.a(activity, f.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            q.a(activity, f.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            q.a(activity, f.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    static void a(Activity activity, f.b bVar) {
        if (activity instanceof k) {
            ((k) activity).a().a(bVar);
        } else if (activity instanceof i) {
            f a2 = ((i) activity).a();
            if (a2 instanceof j) {
                ((j) a2).a(bVar);
            }
        }
    }

    private void a(f.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void a(a aVar) {
        if (aVar != null) {
            aVar.v0();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.u0();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f1476b);
        a(f.b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(f.b.ON_DESTROY);
        this.f1476b = null;
    }

    public void onPause() {
        super.onPause();
        a(f.b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        b(this.f1476b);
        a(f.b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        c(this.f1476b);
        a(f.b.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(f.b.ON_STOP);
    }
}
