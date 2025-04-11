package ru.iiec.cxxdroid.gui;

import h.a.a.d;
import java.io.File;

public class a {
    public static int a(String str) {
        try {
            d a = d.a(new File(str));
            for (int i2 = 0; i2 < a.f8661i; i2++) {
                String a2 = a.b(i2).a.a();
                if (a2 != null) {
                    if (a2.equals(".cxxdroid_gui_mode_sdl2")) {
                        return 1;
                    }
                    if (a2.equals(".cxxdroid_gui_mode_sfml")) {
                        return 2;
                    }
                    if (a2.equals(".cxxdroid_gui_mode_allegro")) {
                        return 3;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }
}
