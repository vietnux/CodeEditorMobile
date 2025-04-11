package com.crashlytics.android.e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ScrollView;
import android.widget.TextView;
import f.a.a.a.n.g.p;
import java.util.concurrent.CountDownLatch;

class i {
    private final e a;

    /* renamed from: b  reason: collision with root package name */
    private final AlertDialog.Builder f2920b;

    static class a implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f2921b;

        a(e eVar) {
            this.f2921b = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f2921b.a(true);
            dialogInterface.dismiss();
        }
    }

    static class b implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f2922b;

        b(e eVar) {
            this.f2922b = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f2922b.a(false);
            dialogInterface.dismiss();
        }
    }

    static class c implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f2923b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f2924c;

        c(d dVar, e eVar) {
            this.f2923b = dVar;
            this.f2924c = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            this.f2923b.a(true);
            this.f2924c.a(true);
            dialogInterface.dismiss();
        }
    }

    interface d {
        void a(boolean z);
    }

    private static class e {
        private boolean a;

        /* renamed from: b  reason: collision with root package name */
        private final CountDownLatch f2925b;

        private e() {
            this.a = false;
            this.f2925b = new CountDownLatch(1);
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f2925b.await();
            } catch (InterruptedException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.a = z;
            this.f2925b.countDown();
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.a;
        }
    }

    private i(AlertDialog.Builder builder, e eVar) {
        this.a = eVar;
        this.f2920b = builder;
    }

    private static int a(float f2, int i2) {
        return (int) (f2 * ((float) i2));
    }

    private static ScrollView a(Activity activity, String str) {
        float f2 = activity.getResources().getDisplayMetrics().density;
        int a2 = a(f2, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a2, a2, a2, a2);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(a(f2, 14), a(f2, 2), a(f2, 10), a(f2, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    public static i a(Activity activity, p pVar, d dVar) {
        e eVar = new e(null);
        x xVar = new x(activity, pVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView a2 = a(activity, xVar.c());
        builder.setView(a2).setTitle(xVar.e()).setCancelable(false).setNeutralButton(xVar.d(), new a(eVar));
        if (pVar.f8573d) {
            builder.setNegativeButton(xVar.b(), new b(eVar));
        }
        if (pVar.f8575f) {
            builder.setPositiveButton(xVar.a(), new c(dVar, eVar));
        }
        return new i(builder, eVar);
    }

    public void a() {
        this.a.a();
    }

    public boolean b() {
        return this.a.b();
    }

    public void c() {
        this.f2920b.show();
    }
}
