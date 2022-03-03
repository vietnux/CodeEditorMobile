package qwe.qweqwe.texteditor.x0;

import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import k.a.a.a.e;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.y0.p;

public class a {
    private static String a(InputStream inputStream) {
        return e.b(inputStream);
    }

    public static String a(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String a = a(fileInputStream);
        fileInputStream.close();
        return a;
    }

    public static void a(String str, e0 e0Var) {
        String message;
        try {
            message = a(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            message = e2.getMessage();
            Toast.makeText(e0Var, e0Var.getString(q0.open_file_problem), 0).show();
        }
        e0Var.u.a(new File(str).getName(), message, str, 0, 0, true);
        if (e0Var.i0()) {
            File b2 = e0Var.b(str);
            e0Var.f(b2 == null ? null : b2.getParent());
        }
        e0Var.a0();
    }

    public static void b(String str, e0 e0Var) {
        int tabCount = e0Var.u.f9881c.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            p a = e0Var.u.a(i2);
            if (a != null && str.equals(a.C0())) {
                e0Var.u.b(i2);
                return;
            }
        }
        a(str, e0Var);
    }
}
