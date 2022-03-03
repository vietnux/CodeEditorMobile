package c.f.b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
public class b {
    public static String a(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return "?" + i2;
        }
    }

    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String a(l lVar, int i2) {
        return a(lVar, i2, -1);
    }

    public static String a(l lVar, int i2, int i3) {
        int length;
        if (i2 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = lVar.getContext().getResources().getResourceEntryName(i2);
        if (i3 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i3) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i3 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        int length2 = (resourceEntryName.length() - i3) / length;
        return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace((char) 0, '.') + "_", "_");
    }
}
