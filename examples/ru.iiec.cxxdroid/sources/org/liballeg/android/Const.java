package org.liballeg.android;

/* access modifiers changed from: package-private */
public final class Const {
    static final int ALLEGRO_ALPHA_SIZE = 3;
    static final int ALLEGRO_BLUE_SIZE = 2;
    static final int ALLEGRO_COLOR_SIZE = 14;
    static final int ALLEGRO_DEPTH_SIZE = 15;
    static final int ALLEGRO_DISPLAY_ORIENTATION_0_DEGREES = 1;
    static final int ALLEGRO_DISPLAY_ORIENTATION_180_DEGREES = 4;
    static final int ALLEGRO_DISPLAY_ORIENTATION_270_DEGREES = 8;
    static final int ALLEGRO_DISPLAY_ORIENTATION_90_DEGREES = 2;
    static final int ALLEGRO_DISPLAY_ORIENTATION_ALL = 15;
    static final int ALLEGRO_DISPLAY_ORIENTATION_FACE_DOWN = 32;
    static final int ALLEGRO_DISPLAY_ORIENTATION_FACE_UP = 16;
    static final int ALLEGRO_DISPLAY_ORIENTATION_LANDSCAPE = 10;
    static final int ALLEGRO_DISPLAY_ORIENTATION_PORTRAIT = 5;
    static final int ALLEGRO_DISPLAY_ORIENTATION_UNKNOWN = 0;
    static final int ALLEGRO_EVENT_TOUCH_BEGIN = 50;
    static final int ALLEGRO_EVENT_TOUCH_CANCEL = 53;
    static final int ALLEGRO_EVENT_TOUCH_END = 51;
    static final int ALLEGRO_EVENT_TOUCH_MOVE = 52;
    static final int ALLEGRO_GREEN_SIZE = 1;
    static final int ALLEGRO_PIXEL_FORMAT_ABGR_8888 = 17;
    static final int ALLEGRO_PIXEL_FORMAT_BGR_565 = 20;
    static final int ALLEGRO_PIXEL_FORMAT_RGBA_4444 = 26;
    static final int ALLEGRO_PIXEL_FORMAT_SINGLE_CHANNEL_8 = 27;
    static final int ALLEGRO_RED_SIZE = 0;
    static final int ALLEGRO_SAMPLES = 18;
    static final int ALLEGRO_SAMPLE_BUFFERS = 17;
    static final int ALLEGRO_STENCIL_SIZE = 16;

    Const() {
    }

    static int toAllegroOrientation(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 8;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 4;
    }

    static int toAndroidOrientation(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 8;
        }
        if (i2 == 4) {
            return 9;
        }
        if (i2 == 5) {
            return 7;
        }
        if (i2 == 8) {
            return 0;
        }
        if (i2 != 10) {
            return i2 != 15 ? -1 : 4;
        }
        return 6;
    }
}
