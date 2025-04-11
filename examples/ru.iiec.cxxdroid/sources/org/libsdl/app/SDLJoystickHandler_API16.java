package org.libsdl.app;

import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* access modifiers changed from: package-private */
public class SDLJoystickHandler_API16 extends SDLJoystickHandler {
    private ArrayList<SDLJoystick> mJoysticks = new ArrayList<>();

    static class RangeComparator implements Comparator<InputDevice.MotionRange> {
        RangeComparator() {
        }

        public int compare(InputDevice.MotionRange motionRange, InputDevice.MotionRange motionRange2) {
            int axis = motionRange.getAxis();
            int axis2 = motionRange2.getAxis();
            if (axis == 22) {
                axis = 23;
            } else if (axis == 23) {
                axis = 22;
            }
            if (axis2 == 22) {
                axis2 = 23;
            } else if (axis2 == 23) {
                axis2 = 22;
            }
            return axis - axis2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class SDLJoystick {
        public ArrayList<InputDevice.MotionRange> axes;
        public String desc;
        public int device_id;
        public ArrayList<InputDevice.MotionRange> hats;
        public String name;

        SDLJoystick() {
        }
    }

    public int getButtonMask(InputDevice inputDevice) {
        return -1;
    }

    /* access modifiers changed from: protected */
    public SDLJoystick getJoystick(int i2) {
        for (int i3 = 0; i3 < this.mJoysticks.size(); i3++) {
            if (this.mJoysticks.get(i3).device_id == i2) {
                return this.mJoysticks.get(i3);
            }
        }
        return null;
    }

    public String getJoystickDescriptor(InputDevice inputDevice) {
        String descriptor = inputDevice.getDescriptor();
        return (descriptor == null || descriptor.isEmpty()) ? inputDevice.getName() : descriptor;
    }

    public int getProductId(InputDevice inputDevice) {
        return 0;
    }

    public int getVendorId(InputDevice inputDevice) {
        return 0;
    }

    @Override // org.libsdl.app.SDLJoystickHandler
    public boolean handleMotionEvent(MotionEvent motionEvent) {
        SDLJoystick joystick;
        if ((motionEvent.getSource() & 16777232) == 0) {
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getActionMasked() != 2 || (joystick = getJoystick(motionEvent.getDeviceId())) == null) {
            return true;
        }
        for (int i2 = 0; i2 < joystick.axes.size(); i2++) {
            InputDevice.MotionRange motionRange = joystick.axes.get(i2);
            SDLControllerManager.onNativeJoy(joystick.device_id, i2, (((motionEvent.getAxisValue(motionRange.getAxis(), actionIndex) - motionRange.getMin()) / motionRange.getRange()) * 2.0f) - 1.0f);
        }
        for (int i3 = 0; i3 < joystick.hats.size(); i3 += 2) {
            SDLControllerManager.onNativeHat(joystick.device_id, i3 / 2, Math.round(motionEvent.getAxisValue(joystick.hats.get(i3).getAxis(), actionIndex)), Math.round(motionEvent.getAxisValue(joystick.hats.get(i3 + 1).getAxis(), actionIndex)));
        }
        return true;
    }

    @Override // org.libsdl.app.SDLJoystickHandler
    public void pollInputDevices() {
        int[] deviceIds = InputDevice.getDeviceIds();
        for (int i2 = 0; i2 < deviceIds.length; i2++) {
            if (getJoystick(deviceIds[i2]) == null) {
                SDLJoystick sDLJoystick = new SDLJoystick();
                InputDevice device = InputDevice.getDevice(deviceIds[i2]);
                if (SDLControllerManager.isDeviceSDLJoystick(deviceIds[i2])) {
                    sDLJoystick.device_id = deviceIds[i2];
                    sDLJoystick.name = device.getName();
                    sDLJoystick.desc = getJoystickDescriptor(device);
                    sDLJoystick.axes = new ArrayList<>();
                    sDLJoystick.hats = new ArrayList<>();
                    List<InputDevice.MotionRange> motionRanges = device.getMotionRanges();
                    Collections.sort(motionRanges, new RangeComparator());
                    for (InputDevice.MotionRange motionRange : motionRanges) {
                        if ((motionRange.getSource() & 16) != 0) {
                            ((motionRange.getAxis() == 15 || motionRange.getAxis() == 16) ? sDLJoystick.hats : sDLJoystick.axes).add(motionRange);
                        }
                    }
                    this.mJoysticks.add(sDLJoystick);
                    SDLControllerManager.nativeAddJoystick(sDLJoystick.device_id, sDLJoystick.name, sDLJoystick.desc, getVendorId(device), getProductId(device), false, getButtonMask(device), sDLJoystick.axes.size(), sDLJoystick.hats.size() / 2, 0);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.mJoysticks.size(); i3++) {
            int i4 = this.mJoysticks.get(i3).device_id;
            int i5 = 0;
            while (i5 < deviceIds.length && i4 != deviceIds[i5]) {
                i5++;
            }
            if (i5 == deviceIds.length) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            int intValue = ((Integer) arrayList.get(i6)).intValue();
            SDLControllerManager.nativeRemoveJoystick(intValue);
            int i7 = 0;
            while (true) {
                if (i7 >= this.mJoysticks.size()) {
                    break;
                } else if (this.mJoysticks.get(i7).device_id == intValue) {
                    this.mJoysticks.remove(i7);
                    break;
                } else {
                    i7++;
                }
            }
        }
    }
}
