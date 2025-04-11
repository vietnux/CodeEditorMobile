package e.b.b.a.b;

import android.os.IBinder;
import android.os.IInterface;
import e.b.b.a.c.g.b;

public interface a extends IInterface {

    /* renamed from: e.b.b.a.b.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0100a extends b implements a {

        /* renamed from: e.b.b.a.b.a$a$a  reason: collision with other inner class name */
        public static class C0101a extends e.b.b.a.c.g.a implements a {
            C0101a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0100a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0101a(iBinder);
        }
    }
}
