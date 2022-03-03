package org.liballeg.android;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.List;

public class Sensors implements SensorEventListener {
    private static SensorManager sensorManager;
    private List<Sensor> sensors = sensorManager.getSensorList(1);

    Sensors(Context context) {
        sensorManager = (SensorManager) context.getSystemService("sensor");
    }

    /* access modifiers changed from: package-private */
    public void listen() {
        for (int i2 = 0; i2 < this.sensors.size(); i2++) {
            sensorManager.registerListener(this, this.sensors.get(i2), 1);
        }
    }

    public native void nativeOnAccel(int i2, float f2, float f3, float f4);

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int indexOf = this.sensors.indexOf(sensorEvent.sensor);
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            nativeOnAccel(indexOf, fArr[0], fArr[1], fArr[2]);
        }
    }

    /* access modifiers changed from: package-private */
    public void unlisten() {
        for (int i2 = 0; i2 < this.sensors.size(); i2++) {
            sensorManager.unregisterListener(this, this.sensors.get(i2));
        }
    }
}
