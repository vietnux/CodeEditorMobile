package qwe.qweqwe.texteditor;

import java.io.File;
import qwe.qweqwe.texteditor.y0.p;

public abstract class y {
    public static void a(File file, e0 e0Var) {
        String absolutePath = file.getAbsolutePath();
        for (p pVar : e0Var.N().b()) {
            String C0 = pVar.C0();
            if (pVar.O0() && C0 != null && C0.startsWith(absolutePath)) {
                e0Var.d(pVar);
            }
        }
    }

    public abstract void a();

    public abstract void a(String str);
}
