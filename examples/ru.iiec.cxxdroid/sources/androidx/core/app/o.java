package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class o implements Iterable<Intent> {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Intent> f1060b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Context f1061c;

    public interface a {
        Intent h();
    }

    private o(Context context) {
        this.f1061c = context;
    }

    public static o a(Context context) {
        return new o(context);
    }

    public o a(Activity activity) {
        Intent h2 = activity instanceof a ? ((a) activity).h() : null;
        if (h2 == null) {
            h2 = g.a(activity);
        }
        if (h2 != null) {
            ComponentName component = h2.getComponent();
            if (component == null) {
                component = h2.resolveActivity(this.f1061c.getPackageManager());
            }
            a(component);
            a(h2);
        }
        return this;
    }

    public o a(ComponentName componentName) {
        int size = this.f1060b.size();
        try {
            Context context = this.f1061c;
            while (true) {
                Intent a2 = g.a(context, componentName);
                if (a2 == null) {
                    return this;
                }
                this.f1060b.add(size, a2);
                context = this.f1061c;
                componentName = a2.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public o a(Intent intent) {
        this.f1060b.add(intent);
        return this;
    }

    public void a() {
        a((Bundle) null);
    }

    public void a(Bundle bundle) {
        if (!this.f1060b.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1060b;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!c.h.d.a.a(this.f1061c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1061c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1060b.iterator();
    }
}
