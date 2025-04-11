package qwe.qweqwe.texteditor.y0;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import k.a.a.a.b;
import qwe.qweqwe.texteditor.i0;
import qwe.qweqwe.texteditor.v0.a;

public class o {
    private static final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private static String f9878b = "SaveInstanceStateHelper";

    private static String a(Context context) {
        return a.a(context) + "/" + "temp_editor_texts_folder" + "/temp_file_" + a.getAndIncrement();
    }

    public static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        try {
            File file = new File(bundle.getString("large_key_prefix_" + str));
            String str2 = f9878b;
            i0.a(str2, "reading file" + file);
            return b.g(file);
        } catch (Exception e2) {
            e2.printStackTrace();
            return string;
        }
    }

    public static void a(Context context, Bundle bundle, String str, String str2) {
        if (str2.length() > 15000) {
            String a2 = a(context);
            try {
                b.a(new File(a2), (CharSequence) str2);
                String str3 = f9878b;
                i0.a(str3, "created file " + a2);
                bundle.putString("large_key_prefix_" + str, a2);
            } catch (IOException e2) {
                String str4 = f9878b;
                i0.b(str4, "can't write file: " + a2);
                e2.printStackTrace();
                try {
                    bundle.putString(str, str2);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else {
            bundle.putString(str, str2);
        }
    }
}
