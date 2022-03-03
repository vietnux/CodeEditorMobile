package org.liballeg.android;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.InputStream;

class ImageLoader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ImageLoader";

    /* renamed from: org.liballeg.android.ImageLoader$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config = new int[Bitmap.Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.liballeg.android.ImageLoader.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config = r0
                int[] r0 = org.liballeg.android.ImageLoader.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = org.liballeg.android.ImageLoader.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = org.liballeg.android.ImageLoader.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = org.liballeg.android.ImageLoader.AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.liballeg.android.ImageLoader.AnonymousClass1.<clinit>():void");
        }
    }

    ImageLoader() {
    }

    static Bitmap decodeBitmapAsset(Activity activity, String str) {
        Bitmap bitmap;
        Log.d(TAG, "decodeBitmapAsset begin");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            InputStream open = activity.getResources().getAssets().open(Path.simplifyPath(str));
            bitmap = BitmapFactory.decodeStream(open, null, options);
            open.close();
            Log.d(TAG, "done waiting for decodeStream");
        } catch (Exception e2) {
            Log.e(TAG, "decodeBitmapAsset exception: " + e2.getMessage());
            bitmap = null;
        }
        Log.d(TAG, "decodeBitmapAsset end");
        return bitmap;
    }

    static Bitmap decodeBitmapStream(InputStream inputStream) {
        Bitmap bitmap;
        Log.d(TAG, "decodeBitmapStream begin");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            bitmap = BitmapFactory.decodeStream(inputStream, null, options);
            Log.d(TAG, "done waiting for decodeStream");
        } catch (Exception e2) {
            Log.e(TAG, "decodeBitmapStream exception: " + e2.getMessage());
            bitmap = null;
        }
        Log.d(TAG, "decodeBitmapStream end");
        return bitmap;
    }

    static int getBitmapFormat(Bitmap bitmap) {
        int i2 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[bitmap.getConfig().ordinal()];
        if (i2 == 1) {
            return 27;
        }
        if (i2 == 2) {
            return 26;
        }
        if (i2 != 3) {
            return i2 != 4 ? -1 : 20;
        }
        return 17;
    }

    static int[] getPixels(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }
}
