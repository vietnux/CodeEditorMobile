package org.liballeg.android;

import android.text.TextUtils;
import java.util.ArrayList;

final class Path {
    Path() {
    }

    static String simplifyPath(String str) {
        String[] split = str.split("/");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!str2.equals("") && !str2.equals(".")) {
                if (!str2.equals("..")) {
                    arrayList.add(str2);
                } else if (arrayList.size() > 0) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return TextUtils.join("/", arrayList);
    }
}
