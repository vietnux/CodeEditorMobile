package c.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import c.i.a.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    protected boolean f2462b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f2463c;

    /* renamed from: d  reason: collision with root package name */
    protected Cursor f2464d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f2465e;

    /* renamed from: f  reason: collision with root package name */
    protected int f2466f;

    /* renamed from: g  reason: collision with root package name */
    protected C0053a f2467g;

    /* renamed from: h  reason: collision with root package name */
    protected DataSetObserver f2468h;

    /* renamed from: i  reason: collision with root package name */
    protected b f2469i;

    /* access modifiers changed from: private */
    /* renamed from: c.i.a.a$a  reason: collision with other inner class name */
    public class C0053a extends ContentObserver {
        C0053a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.b();
        }
    }

    /* access modifiers changed from: private */
    public class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f2462b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2462b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    @Override // c.i.a.b.a
    public Cursor a() {
        return this.f2464d;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    public void a(Context context, Cursor cursor, int i2) {
        b bVar;
        boolean z = false;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2463c = true;
        } else {
            this.f2463c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2464d = cursor;
        this.f2462b = z;
        this.f2465e = context;
        this.f2466f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f2467g = new C0053a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2467g = null;
        }
        this.f2468h = bVar;
        if (z) {
            C0053a aVar = this.f2467g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2468h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // c.i.a.b.a
    public void a(Cursor cursor) {
        Cursor c2 = c(cursor);
        if (c2 != null) {
            c2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // c.i.a.b.a
    public abstract CharSequence b(Cursor cursor);

    /* access modifiers changed from: protected */
    public void b() {
        Cursor cursor;
        if (this.f2463c && (cursor = this.f2464d) != null && !cursor.isClosed()) {
            this.f2462b = this.f2464d.requery();
        }
    }

    public Cursor c(Cursor cursor) {
        Cursor cursor2 = this.f2464d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0053a aVar = this.f2467g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2468h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2464d = cursor;
        if (cursor != null) {
            C0053a aVar2 = this.f2467g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2468h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2466f = cursor.getColumnIndexOrThrow("_id");
            this.f2462b = true;
            notifyDataSetChanged();
        } else {
            this.f2466f = -1;
            this.f2462b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f2462b || (cursor = this.f2464d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2462b) {
            return null;
        }
        this.f2464d.moveToPosition(i2);
        if (view == null) {
            view = a(this.f2465e, this.f2464d, viewGroup);
        }
        a(view, this.f2465e, this.f2464d);
        return view;
    }

    public Filter getFilter() {
        if (this.f2469i == null) {
            this.f2469i = new b(this);
        }
        return this.f2469i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2462b || (cursor = this.f2464d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2464d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f2462b || (cursor = this.f2464d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f2464d.getLong(this.f2466f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f2462b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2464d.moveToPosition(i2)) {
            if (view == null) {
                view = b(this.f2465e, this.f2464d, viewGroup);
            }
            a(view, this.f2465e, this.f2464d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }
}
