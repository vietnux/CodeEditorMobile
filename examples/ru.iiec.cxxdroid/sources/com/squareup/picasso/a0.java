package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
public class a0 {
    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b  reason: collision with root package name */
    final d f6776b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f6777c;

    /* renamed from: d  reason: collision with root package name */
    long f6778d;

    /* renamed from: e  reason: collision with root package name */
    long f6779e;

    /* renamed from: f  reason: collision with root package name */
    long f6780f;

    /* renamed from: g  reason: collision with root package name */
    long f6781g;

    /* renamed from: h  reason: collision with root package name */
    long f6782h;

    /* renamed from: i  reason: collision with root package name */
    long f6783i;

    /* renamed from: j  reason: collision with root package name */
    long f6784j;

    /* renamed from: k  reason: collision with root package name */
    long f6785k;

    /* renamed from: l  reason: collision with root package name */
    int f6786l;

    /* renamed from: m  reason: collision with root package name */
    int f6787m;
    int n;

    private static class a extends Handler {
        private final a0 a;

        /* renamed from: com.squareup.picasso.a0$a$a  reason: collision with other inner class name */
        class RunnableC0097a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Message f6788b;

            RunnableC0097a(a aVar, Message message) {
                this.f6788b = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f6788b.what);
            }
        }

        a(Looper looper, a0 a0Var) {
            super(looper);
            this.a = a0Var;
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.a.d();
            } else if (i2 == 1) {
                this.a.e();
            } else if (i2 == 2) {
                this.a.b((long) message.arg1);
            } else if (i2 == 3) {
                this.a.c((long) message.arg1);
            } else if (i2 != 4) {
                t.p.post(new RunnableC0097a(this, message));
            } else {
                this.a.a((Long) message.obj);
            }
        }
    }

    a0(d dVar) {
        this.f6776b = dVar;
        this.a.start();
        d0.a(this.a.getLooper());
        this.f6777c = new a(this.a.getLooper(), this);
    }

    private static long a(int i2, long j2) {
        return j2 / ((long) i2);
    }

    private void a(Bitmap bitmap, int i2) {
        int a2 = d0.a(bitmap);
        Handler handler = this.f6777c;
        handler.sendMessage(handler.obtainMessage(i2, a2, 0));
    }

    /* access modifiers changed from: package-private */
    public b0 a() {
        return new b0(this.f6776b.a(), this.f6776b.size(), this.f6778d, this.f6779e, this.f6780f, this.f6781g, this.f6782h, this.f6783i, this.f6784j, this.f6785k, this.f6786l, this.f6787m, this.n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        Handler handler = this.f6777c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j2)));
    }

    /* access modifiers changed from: package-private */
    public void a(Bitmap bitmap) {
        a(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    public void a(Long l2) {
        this.f6786l++;
        this.f6780f += l2.longValue();
        this.f6783i = a(this.f6786l, this.f6780f);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f6777c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    public void b(long j2) {
        this.f6787m++;
        this.f6781g += j2;
        this.f6784j = a(this.f6787m, this.f6781g);
    }

    /* access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        a(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f6777c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    public void c(long j2) {
        this.n++;
        this.f6782h += j2;
        this.f6785k = a(this.f6787m, this.f6782h);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f6778d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f6779e++;
    }
}
