package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f1062k = PorterDuff.Mode.SRC_IN;
    public int a = -1;

    /* renamed from: b  reason: collision with root package name */
    Object f1063b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1064c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1065d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1066e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1067f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1068g = null;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f1069h = f1062k;

    /* renamed from: i  reason: collision with root package name */
    public String f1070i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f1071j;

    public IconCompat() {
    }

    private IconCompat(int i2) {
        this.a = i2;
    }

    private static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat a(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1066e = i2;
            if (resources != null) {
                try {
                    iconCompat.f1063b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1063b = str;
            }
            iconCompat.f1071j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static String a(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static Uri c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public int a() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.f1063b);
        }
        if (this.a == 2) {
            return this.f1066e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public InputStream a(Context context) {
        Throwable e2;
        String str;
        StringBuilder sb;
        Uri c2 = c();
        String scheme = c2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(c2);
            } catch (Exception e3) {
                e2 = e3;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(c2);
                Log.w("IconCompat", sb.toString(), e2);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1063b));
            } catch (FileNotFoundException e4) {
                e2 = e4;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(c2);
                Log.w("IconCompat", sb.toString(), e2);
                return null;
            }
        }
    }

    public void a(boolean z) {
        this.f1070i = this.f1069h.name();
        switch (this.a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1063b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1064c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1064c = ((String) this.f1063b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1064c = (byte[]) this.f1063b;
                return;
            case 4:
            case 6:
                this.f1064c = this.f1063b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1065d = (Parcelable) this.f1063b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 >= 26) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon b(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.b(android.content.Context):android.graphics.drawable.Icon");
    }

    public String b() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return b((Icon) this.f1063b);
        }
        if (this.a == 2) {
            return TextUtils.isEmpty(this.f1071j) ? ((String) this.f1063b).split(":", -1)[0] : this.f1071j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Uri c() {
        if (this.a == -1 && Build.VERSION.SDK_INT >= 23) {
            return c((Icon) this.f1063b);
        }
        int i2 = this.a;
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f1063b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public void d() {
        Parcelable parcelable;
        this.f1069h = PorterDuff.Mode.valueOf(this.f1070i);
        switch (this.a) {
            case -1:
                parcelable = this.f1065d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1065d;
                if (parcelable == null) {
                    byte[] bArr = this.f1064c;
                    this.f1063b = bArr;
                    this.a = 3;
                    this.f1066e = 0;
                    this.f1067f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f1063b = new String(this.f1064c, Charset.forName("UTF-16"));
                if (this.a == 2 && this.f1071j == null) {
                    this.f1071j = ((String) this.f1063b).split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1063b = this.f1064c;
                return;
        }
        this.f1063b = parcelable;
    }

    @Deprecated
    public Icon e() {
        return b((Context) null);
    }

    public String toString() {
        int i2;
        if (this.a == -1) {
            return String.valueOf(this.f1063b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(a(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1063b).getWidth());
                sb.append("x");
                i2 = ((Bitmap) this.f1063b).getHeight();
                sb.append(i2);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1071j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1066e);
                if (this.f1067f != 0) {
                    sb.append(" off=");
                    i2 = this.f1067f;
                    sb.append(i2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1063b);
                break;
        }
        if (this.f1068g != null) {
            sb.append(" tint=");
            sb.append(this.f1068g);
        }
        if (this.f1069h != f1062k) {
            sb.append(" mode=");
            sb.append(this.f1069h);
        }
        sb.append(")");
        return sb.toString();
    }
}
