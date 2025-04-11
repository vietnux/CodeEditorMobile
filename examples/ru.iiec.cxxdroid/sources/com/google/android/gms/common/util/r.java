package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class r {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }
}
