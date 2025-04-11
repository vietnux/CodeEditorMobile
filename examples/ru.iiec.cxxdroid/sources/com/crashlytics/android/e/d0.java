package com.crashlytics.android.e;

class d0 implements t0 {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final t0[] f2908b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f2909c;

    public d0(int i2, t0... t0VarArr) {
        this.a = i2;
        this.f2908b = t0VarArr;
        this.f2909c = new e0(i2);
    }

    @Override // com.crashlytics.android.e.t0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        t0[] t0VarArr = this.f2908b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (t0 t0Var : t0VarArr) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = t0Var.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.a ? this.f2909c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
