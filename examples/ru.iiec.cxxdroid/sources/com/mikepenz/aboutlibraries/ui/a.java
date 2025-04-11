package com.mikepenz.aboutlibraries.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import e.c.a.f;
import g.r.d.i;
import java.util.HashMap;

public class a extends Fragment {
    private final f Z = new f();
    private HashMap a0;

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.d(layoutInflater, "inflater");
        f fVar = this.Z;
        Context context = layoutInflater.getContext();
        i.a((Object) context, "inflater.context");
        return fVar.a(context, layoutInflater, viewGroup, bundle, k());
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        i.d(view, "view");
        super.a(view, bundle);
        this.Z.a(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void a0() {
        this.Z.a();
        super.a0();
        v0();
    }

    public void v0() {
        HashMap hashMap = this.a0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
