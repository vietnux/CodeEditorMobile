package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

public interface aa0 {
    void D();

    void E1();

    void F1();

    void G1();

    boolean H1();

    View I1();

    boolean J1();

    void K1();

    void L1();

    View a(View.OnClickListener onClickListener, boolean z);

    void a(MotionEvent motionEvent);

    void a(View view);

    void a(View view, y90 y90);

    void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2);

    void a(View view, Map<String, WeakReference<View>> map);

    void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2);

    void a(qc0 qc0);

    void b(View view);

    void b(View view, Map<String, WeakReference<View>> map);

    boolean b(Bundle bundle);

    void c(Bundle bundle);

    void c(View view);

    void c(View view, Map<String, WeakReference<View>> map);

    void d(Bundle bundle);

    Context getContext();
}
