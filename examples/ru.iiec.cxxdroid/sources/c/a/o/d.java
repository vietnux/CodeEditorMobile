package c.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import c.a.i;

public class d extends ContextWrapper {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f1828b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f1829c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f1830d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f1831e;

    public d() {
        super(null);
    }

    public d(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1828b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f1831e == null) {
            Configuration configuration = this.f1830d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f1830d);
                this.f1831e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f1831e = resources;
        }
        return this.f1831e;
    }

    private void c() {
        boolean z = this.f1828b == null;
        if (z) {
            this.f1828b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1828b.setTo(theme);
            }
        }
        a(this.f1828b, this.a, z);
    }

    public int a() {
        return this.a;
    }

    public void a(Configuration configuration) {
        if (this.f1831e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1830d == null) {
            this.f1830d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void a(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1829c == null) {
            this.f1829c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1829c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1828b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.Theme_AppCompat_Light;
        }
        c();
        return this.f1828b;
    }

    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            c();
        }
    }
}
