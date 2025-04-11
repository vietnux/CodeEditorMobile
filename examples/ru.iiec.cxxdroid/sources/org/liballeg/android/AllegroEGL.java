package org.liballeg.android;

import android.util.Log;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* access modifiers changed from: package-private */
public class AllegroEGL {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int EGL_OPENGL_ES_BIT = 1;
    private static final String TAG = "AllegroEGL";
    private static HashMap<Integer, String> eglErrors;
    private HashMap<Integer, Integer> attribMap;
    private EGLConfig chosenConfig;
    private EGLContext egl_Context;
    private EGLDisplay egl_Display;
    private EGLSurface egl_Surface;
    private EGLConfig[] matchingConfigs;

    AllegroEGL() {
    }

    private final int[] attribMapping(EGL10 egl10) {
        return new int[]{12324, 0, 12323, 1, 12322, 2, 12321, 3, 12320, 14, 12325, 15, 12326, 16, 12338, 17, 12337, 18};
    }

    private static void checkEglError(String str, EGL10 egl10) {
        if (eglErrors == null) {
            eglErrors = new HashMap<>();
            eglErrors.put(12296, "EGL_BAD_DISPLAY");
            eglErrors.put(12289, "EGL_NOT_INITIALIZED");
            eglErrors.put(12301, "EGL_BAD_SURFACE");
            eglErrors.put(12294, "EGL_BAD_CONTEXT");
            eglErrors.put(12297, "EGL_BAD_MATCH");
            eglErrors.put(12290, "EGL_BAD_ACCESS");
            eglErrors.put(12298, "EGL_BAD_NATIVE_PIXMAP");
            eglErrors.put(12299, "EGL_BAD_NATIVE_WINDOW");
            eglErrors.put(12295, "EGL_BAD_CURRENT_SURFACE");
            eglErrors.put(12291, "EGL_BAD_ALLOC");
            eglErrors.put(12293, "EGL_BAD_CONFIG");
            eglErrors.put(12292, "EGL_BAD_ATTRIBUTE");
            eglErrors.put(12302, "EGL_CONTEXT_LOST");
        }
        while (true) {
            int eglGetError = egl10.eglGetError();
            if (eglGetError != 12288) {
                Log.e("Allegro", String.format("%s: EGL error: %s", str, eglErrors.get(Integer.valueOf(eglGetError))));
            } else {
                return;
            }
        }
    }

    private int eglAttrib(int i2) {
        int[] attribMapping = attribMapping((EGL10) EGLContext.getEGL());
        for (int i3 = 0; i3 < attribMapping.length; i3 += 2) {
            if (i2 == attribMapping[i3 + 1]) {
                return attribMapping[i3];
            }
        }
        return -1;
    }

    private void egl_destroyContext() {
        Log.d(TAG, "destroying egl_Context");
        ((EGL10) EGLContext.getEGL()).eglDestroyContext(this.egl_Display, this.egl_Context);
        this.egl_Context = EGL10.EGL_NO_CONTEXT;
    }

    private void egl_destroySurface() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplay = this.egl_Display;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            Log.d(TAG, "could not clear current context");
        }
        Log.d(TAG, "destroying egl_Surface");
        egl10.eglDestroySurface(this.egl_Display, this.egl_Surface);
        this.egl_Surface = EGL10.EGL_NO_SURFACE;
    }

    private int[] requiredAttribsArray() {
        int[] iArr = new int[((this.attribMap.size() * 2) + 1)];
        int i2 = 0;
        for (Integer num : this.attribMap.keySet()) {
            int intValue = num.intValue();
            int i3 = i2 + 1;
            iArr[i2] = intValue;
            i2 = i3 + 1;
            iArr[i3] = this.attribMap.get(Integer.valueOf(intValue)).intValue();
        }
        iArr[i2] = 12344;
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public boolean egl_Init() {
        Log.d(TAG, "egl_Init");
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        int[] iArr = {0, 0};
        if (!egl10.eglInitialize(eglGetDisplay, iArr)) {
            Log.d(TAG, "egl_Init fail");
            return false;
        }
        this.egl_Display = eglGetDisplay;
        Log.d(TAG, "egl_Init OpenGL ES " + iArr[0] + "." + iArr[1]);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void egl_SwapBuffers() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            egl10.eglSwapBuffers(this.egl_Display, this.egl_Surface);
            checkEglError("eglSwapBuffers", egl10);
        } catch (Exception e2) {
            Log.d(TAG, "inner exception: " + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void egl_Terminate() {
        egl_makeCurrent();
        egl_destroySurface();
        egl_destroyContext();
        ((EGL10) EGLContext.getEGL()).eglTerminate(this.egl_Display);
        this.egl_Display = null;
    }

    /* access modifiers changed from: package-private */
    public int egl_chooseConfig(boolean z) {
        HashMap<Integer, Integer> hashMap;
        int i2;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (z) {
            hashMap = this.attribMap;
            i2 = 4;
        } else {
            hashMap = this.attribMap;
            i2 = 1;
        }
        hashMap.put(12352, i2);
        this.matchingConfigs = new EGLConfig[20];
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.egl_Display;
        int[] requiredAttribsArray = requiredAttribsArray();
        EGLConfig[] eGLConfigArr = this.matchingConfigs;
        if (!egl10.eglChooseConfig(eGLDisplay, requiredAttribsArray, eGLConfigArr, eGLConfigArr.length, iArr) || iArr[0] < 1) {
            Log.e(TAG, "No matching config");
            return 0;
        }
        Log.d(TAG, "eglChooseConfig returned " + iArr[0] + " configurations.");
        return iArr[0];
    }

    /* access modifiers changed from: package-private */
    public void egl_clearCurrent() {
        Log.d(TAG, "egl_clearCurrent");
        EGLDisplay eGLDisplay = this.egl_Display;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (!((EGL10) EGLContext.getEGL()).eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            Log.d(TAG, "could not clear current context");
        }
        Log.d(TAG, "egl_clearCurrent done");
    }

    /* access modifiers changed from: package-private */
    public int egl_createContext(int i2, boolean z) {
        Log.d(TAG, "egl_createContext");
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.chosenConfig = this.matchingConfigs[i2];
        this.matchingConfigs = null;
        this.attribMap = null;
        int i3 = z ? 2 : 1;
        EGLContext eglCreateContext = egl10.eglCreateContext(this.egl_Display, this.chosenConfig, EGL10.EGL_NO_CONTEXT, new int[]{EGL_CONTEXT_CLIENT_VERSION, i3, 12344});
        if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            checkEglError("eglCreateContext", egl10);
            Log.d(TAG, "egl_createContext no context");
            return 0;
        }
        Log.d(TAG, "EGL context (OpenGL ES " + i3 + ") created");
        this.egl_Context = eglCreateContext;
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean egl_createSurface(AllegroSurface allegroSurface) {
        String str;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(this.egl_Display, this.chosenConfig, allegroSurface, null);
        if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
            str = "egl_createSurface can't create surface: " + egl10.eglGetError();
        } else if (!egl10.eglMakeCurrent(this.egl_Display, eglCreateWindowSurface, eglCreateWindowSurface, this.egl_Context)) {
            egl10.eglDestroySurface(this.egl_Display, eglCreateWindowSurface);
            str = "egl_createSurface can't make current";
        } else {
            this.egl_Surface = eglCreateWindowSurface;
            Log.d(TAG, "created new surface: " + eglCreateWindowSurface);
            return true;
        }
        Log.d(TAG, str);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void egl_getConfigAttribs(int i2, int[] iArr) {
        Log.d(TAG, "Getting attribs for config at index " + i2);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = 0;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLConfig eGLConfig = this.matchingConfigs[i2];
        int[] attribMapping = attribMapping(egl10);
        int[] iArr2 = new int[1];
        for (int i4 = 0; i4 < attribMapping.length; i4 += 2) {
            int i5 = attribMapping[i4];
            int i6 = attribMapping[i4 + 1];
            if (egl10.eglGetConfigAttrib(this.egl_Display, eGLConfig, i5, iArr2)) {
                iArr[i6] = iArr2[0];
            } else {
                Log.e(TAG, "eglGetConfigAttrib(" + i5 + ") failed\n");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void egl_initRequiredAttribs() {
        this.attribMap = new HashMap<>();
    }

    /* access modifiers changed from: package-private */
    public void egl_makeCurrent() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplay = this.egl_Display;
        EGLSurface eGLSurface = this.egl_Surface;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.egl_Context)) {
            Log.d(TAG, "can't make thread current: ");
            checkEglError("eglMakeCurrent", egl10);
        }
    }

    /* access modifiers changed from: package-private */
    public void egl_setRequiredAttrib(int i2, int i3) {
        int eglAttrib = eglAttrib(i2);
        if (eglAttrib >= 0) {
            this.attribMap.put(Integer.valueOf(eglAttrib), Integer.valueOf(i3));
        }
    }
}
