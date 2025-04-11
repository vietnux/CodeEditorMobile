package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@k2
final class ff implements SensorEventListener {

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f4312b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4313c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Display f4314d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f4315e = new float[9];

    /* renamed from: f  reason: collision with root package name */
    private final float[] f4316f = new float[9];

    /* renamed from: g  reason: collision with root package name */
    private float[] f4317g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f4318h;

    /* renamed from: i  reason: collision with root package name */
    private hf f4319i;

    ff(Context context) {
        this.f4312b = (SensorManager) context.getSystemService("sensor");
        this.f4314d = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i2, int i3) {
        float[] fArr = this.f4316f;
        float f2 = fArr[i2];
        fArr[i2] = fArr[i3];
        fArr[i3] = f2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f4318h == null) {
            Sensor defaultSensor = this.f4312b.getDefaultSensor(11);
            if (defaultSensor == null) {
                qc.a("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f4318h = new Handler(handlerThread.getLooper());
            if (!this.f4312b.registerListener(this, defaultSensor, 0, this.f4318h)) {
                qc.a("SensorManager.registerListener failed.");
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(hf hfVar) {
        this.f4319i = hfVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(float[] fArr) {
        synchronized (this.f4313c) {
            if (this.f4317g == null) {
                return false;
            }
            System.arraycopy(this.f4317g, 0, fArr, 0, this.f4317g.length);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.f4318h != null) {
            this.f4312b.unregisterListener(this);
            this.f4318h.post(new gf(this));
            this.f4318h = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f4313c) {
                if (this.f4317g == null) {
                    this.f4317g = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f4315e, fArr);
            int rotation = this.f4314d.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f4315e, 2, 129, this.f4316f);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f4315e, 129, 130, this.f4316f);
            } else if (rotation != 3) {
                System.arraycopy(this.f4315e, 0, this.f4316f, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f4315e, 130, 1, this.f4316f);
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.f4313c) {
                System.arraycopy(this.f4316f, 0, this.f4317g, 0, 9);
            }
            hf hfVar = this.f4319i;
            if (hfVar != null) {
                hfVar.a();
            }
        }
    }
}
