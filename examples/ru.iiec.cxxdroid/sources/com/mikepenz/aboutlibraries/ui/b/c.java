package com.mikepenz.aboutlibraries.ui.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.c.a.j;
import e.c.a.k;
import g.r.d.i;

public final class c extends e.c.b.s.a<a> {

    public static final class a extends RecyclerView.e0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            i.d(view, "headerView");
        }
    }

    @Override // e.c.b.l
    public int a() {
        return j.loader_item_id;
    }

    @Override // e.c.b.s.a
    public a a(View view) {
        i.d(view, "v");
        return new a(view);
    }

    @Override // e.c.b.l
    public int c() {
        return k.listloader_opensource;
    }
}
