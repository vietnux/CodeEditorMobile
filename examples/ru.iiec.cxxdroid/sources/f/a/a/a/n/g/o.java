package f.a.a.a.n.g;

import android.content.Context;
import android.graphics.BitmapFactory;
import f.a.a.a.c;
import f.a.a.a.l;
import f.a.a.a.n.b.i;

public class o {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8568b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8569c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8570d;

    public o(String str, int i2, int i3, int i4) {
        this.a = str;
        this.f8568b = i2;
        this.f8569c = i3;
        this.f8570d = i4;
    }

    public static o a(Context context, String str) {
        if (str != null) {
            try {
                int d2 = i.d(context);
                l g2 = c.g();
                g2.e("Fabric", "App icon resource ID is " + d2);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), d2, options);
                return new o(str, d2, options.outWidth, options.outHeight);
            } catch (Exception e2) {
                c.g().c("Fabric", "Failed to load icon", e2);
            }
        }
        return null;
    }
}
