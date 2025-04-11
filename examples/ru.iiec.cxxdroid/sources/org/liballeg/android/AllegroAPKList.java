package org.liballeg.android;

import android.util.Log;
import java.io.IOException;

class AllegroAPKList {
    AllegroAPKList() {
    }

    static String list(AllegroActivity allegroActivity, String str) {
        int i2;
        while (str.startsWith("/")) {
            str = str.substring(1);
        }
        while (true) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            } else {
                try {
                    break;
                } catch (IOException e2) {
                    Log.d("APK", e2.toString());
                    return "";
                }
            }
        }
        String[] list = allegroActivity.getResources().getAssets().list(str);
        String str2 = "";
        for (String str3 : list) {
            if (!str2.isEmpty()) {
                str2 = str2 + ";";
            }
            str2 = str2 + str3;
            try {
                String str4 = str + "/" + str3;
                while (str4.startsWith("/")) {
                    str4 = str4.substring(1);
                }
                allegroActivity.getResources().getAssets().open(str4).close();
            } catch (IOException unused) {
                str2 = str2 + "/";
            }
        }
        return str2;
    }
}
