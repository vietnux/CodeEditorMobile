package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {
    private final DataSetObservable a = new DataSetObservable();

    public abstract int a();

    public int a(Object obj) {
        return -1;
    }

    public abstract CharSequence a(int i2);

    public abstract Object a(ViewGroup viewGroup, int i2);

    public void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public abstract void a(Parcelable parcelable, ClassLoader classLoader);

    public abstract void a(ViewGroup viewGroup);

    public abstract void a(ViewGroup viewGroup, int i2, Object obj);

    public abstract boolean a(View view, Object obj);

    public float b(int i2) {
        return 1.0f;
    }

    public abstract Parcelable b();

    /* access modifiers changed from: package-private */
    public void b(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup, int i2, Object obj);

    public void c(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
