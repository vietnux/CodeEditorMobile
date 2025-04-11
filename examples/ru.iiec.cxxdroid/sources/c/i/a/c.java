package c.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: j  reason: collision with root package name */
    private int f2470j;

    /* renamed from: k  reason: collision with root package name */
    private int f2471k;

    /* renamed from: l  reason: collision with root package name */
    private LayoutInflater f2472l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2471k = i2;
        this.f2470j = i2;
        this.f2472l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // c.i.a.a
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2472l.inflate(this.f2471k, viewGroup, false);
    }

    @Override // c.i.a.a
    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2472l.inflate(this.f2470j, viewGroup, false);
    }
}
