package c.c.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.a.a.b;

public abstract class d implements ServiceConnection {

    class a extends b {
        a(d dVar, b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(ComponentName componentName, b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, new a(this, b.a.a(iBinder), componentName));
    }
}
