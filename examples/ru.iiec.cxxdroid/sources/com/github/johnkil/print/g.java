package com.github.johnkil.print;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public class g {
    private static final HashMap<String, Typeface> a = new HashMap<>();

    static Typeface a(AssetManager assetManager, String str) {
        Typeface typeface;
        synchronized (a) {
            if (a.containsKey(str)) {
                typeface = a.get(str);
            } else {
                typeface = Typeface.createFromAsset(assetManager, str);
                a.put(str, typeface);
            }
        }
        return typeface;
    }
}
