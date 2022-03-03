package c.p.a;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends i & v> a a(T t) {
        return new b(t, t.e());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
