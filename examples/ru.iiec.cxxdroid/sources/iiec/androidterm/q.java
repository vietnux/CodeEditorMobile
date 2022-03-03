package iiec.androidterm;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import iiec.androidterm.r.m;
import iiec.androidterm.r.s;

public class q extends BaseAdapter implements s {

    /* renamed from: b  reason: collision with root package name */
    private iiec.androidterm.t.a f9340b;

    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ iiec.androidterm.t.a f9341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9342c;

        a(iiec.androidterm.t.a aVar, int i2) {
            this.f9341b = aVar;
            this.f9342c = i2;
        }

        public void onClick(View view) {
            m remove = this.f9341b.remove(this.f9342c);
            if (remove != null) {
                remove.a();
                q.this.notifyDataSetChanged();
            }
        }
    }

    public q(iiec.androidterm.t.a aVar) {
        a(aVar);
    }

    private static Activity a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String a(int i2, String str) {
        m mVar = (m) this.f9340b.get(i2);
        return (mVar == null || !(mVar instanceof d)) ? str : ((d) mVar).c(str);
    }

    public void a(iiec.androidterm.t.a aVar) {
        this.f9340b = aVar;
        if (aVar != null) {
            aVar.a(this);
            aVar.b(this);
            return;
        }
        b();
    }

    @Override // iiec.androidterm.r.s
    public void b() {
        notifyDataSetChanged();
    }

    public int getCount() {
        iiec.androidterm.t.a aVar = this.f9340b;
        if (aVar != null) {
            return aVar.size();
        }
        return 0;
    }

    public Object getItem(int i2) {
        return this.f9340b.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        Activity a2 = a(viewGroup.getContext());
        View inflate = a2.getLayoutInflater().inflate(k.window_list_item, viewGroup, false);
        View findViewById = inflate.findViewById(i.window_list_close);
        ((TextView) inflate.findViewById(i.window_list_label)).setText(a(i2, a2.getString(m.window_title, new Object[]{Integer.valueOf(i2 + 1)})));
        findViewById.setOnClickListener(new a(this.f9340b, i2));
        return inflate;
    }
}
