package org.liballeg.android;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public class KeyListener implements View.OnKeyListener {
    private AllegroActivity activity;
    private boolean captureVolume = false;
    private Context context;

    KeyListener(Context context2, AllegroActivity allegroActivity) {
        this.context = context2;
        this.activity = allegroActivity;
    }

    private int getCode(int i2, KeyEvent keyEvent, int i3) {
        if (i2 == 96) {
            return 0;
        }
        if (i2 == 97) {
            return 1;
        }
        if (i2 == 99) {
            return 2;
        }
        if (i2 == 100) {
            return 3;
        }
        if (i2 == 102) {
            return 4;
        }
        if (i2 == 103) {
            return 5;
        }
        if (i2 == 82) {
            return 10;
        }
        if (i2 == 21) {
            if (keyEvent.getAction() == 0) {
                nativeOnJoystickButton(i3, 6, true);
            } else {
                nativeOnJoystickButton(i3, 6, false);
            }
            return -2;
        } else if (i2 == 22) {
            if (keyEvent.getAction() == 0) {
                nativeOnJoystickButton(i3, 7, true);
            } else {
                nativeOnJoystickButton(i3, 7, false);
            }
            return -2;
        } else if (i2 == 19) {
            if (keyEvent.getAction() == 0) {
                nativeOnJoystickButton(i3, 8, true);
            } else {
                nativeOnJoystickButton(i3, 8, false);
            }
            return -2;
        } else if (i2 != 20) {
            return -1;
        } else {
            if (keyEvent.getAction() == 0) {
                nativeOnJoystickButton(i3, 9, true);
            } else {
                nativeOnJoystickButton(i3, 9, false);
            }
            return -2;
        }
    }

    private void volumeChange(int i2) {
        AudioManager audioManager = (AudioManager) this.context.getApplicationContext().getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int i3 = streamVolume + i2;
        if (i3 >= 0 && i3 <= streamMaxVolume) {
            audioManager.setStreamVolume(3, i3, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public native void nativeOnJoystickButton(int i2, int i3, boolean z);

    /* access modifiers changed from: package-private */
    public native void nativeOnKeyChar(int i2, int i3);

    /* access modifiers changed from: package-private */
    public native void nativeOnKeyDown(int i2);

    /* access modifiers changed from: package-private */
    public native void nativeOnKeyUp(int i2);

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 4 && this.activity.getIntent().getBooleanExtra("cxxdroid_gui_backclose", true)) {
            this.activity.postFinish();
            return true;
        } else if (i2 == 89 || i2 == 85 || i2 == 90) {
            return false;
        } else {
            if (!this.activity.joystickActive) {
                return onKeyboardKey(view, i2, keyEvent);
            }
            int indexOfJoystick = this.activity.indexOfJoystick(keyEvent.getDeviceId());
            int code = indexOfJoystick >= 0 ? getCode(i2, keyEvent, indexOfJoystick) : -1;
            if (code == -1) {
                return onKeyboardKey(view, i2, keyEvent);
            }
            if (code == -2) {
                return true;
            }
            if (keyEvent.getAction() != 0) {
                nativeOnJoystickButton(indexOfJoystick, code, false);
            } else if (keyEvent.getRepeatCount() == 0) {
                nativeOnJoystickButton(indexOfJoystick, code, true);
            }
            return true;
        }
    }

    public boolean onKeyboardKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (!this.captureVolume) {
                if (i2 == 24) {
                    volumeChange(1);
                    return true;
                } else if (i2 == 25) {
                    volumeChange(-1);
                    return true;
                }
            }
            int unicodeChar = Key.alKey(i2) == 63 ? 8 : Key.alKey(i2) == 67 ? 13 : keyEvent.getUnicodeChar();
            if (keyEvent.getRepeatCount() == 0) {
                nativeOnKeyDown(Key.alKey(i2));
            }
            nativeOnKeyChar(Key.alKey(i2), unicodeChar);
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            nativeOnKeyUp(Key.alKey(i2));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void setCaptureVolumeKeys(boolean z) {
        this.captureVolume = z;
    }
}
