package org.liballeg.android;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* access modifiers changed from: package-private */
public final class Reflect {
    static final String TAG = "Reflect";

    Reflect() {
    }

    static <T> T callMethod(Object obj, String str, Class[] clsArr, Object... objArr) {
        StringBuilder sb;
        String str2;
        try {
            return (T) obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (NoSuchMethodException unused) {
            sb = new StringBuilder();
            sb.append("method ");
            sb.append(str);
            sb.append(" does not exist in class ");
            sb.append(obj.getClass().getCanonicalName());
            str2 = sb.toString();
            Log.v(TAG, str2);
            return null;
        } catch (NullPointerException unused2) {
            str2 = "can't invoke null method name";
            Log.v(TAG, str2);
            return null;
        } catch (SecurityException unused3) {
            sb = new StringBuilder();
            sb.append("method ");
            sb.append(str);
            sb.append(" is inaccessible in class ");
            sb.append(obj.getClass().getCanonicalName());
            str2 = sb.toString();
            Log.v(TAG, str2);
            return null;
        } catch (IllegalAccessException unused4) {
            sb = new StringBuilder();
            sb.append("method ");
            sb.append(str);
            sb.append(" is inaccessible in class ");
            sb.append(obj.getClass().getCanonicalName());
            str2 = sb.toString();
            Log.v(TAG, str2);
            return null;
        } catch (InvocationTargetException unused5) {
            str2 = "method " + str + " threw an exception";
            Log.v(TAG, str2);
            return null;
        }
    }

    static boolean fieldExists(Object obj, String str) {
        try {
            obj.getClass().getField(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static <T> T getField(Object obj, String str) {
        StringBuilder sb;
        String str2;
        String str3;
        try {
            return (T) obj.getClass().getField(str).get(obj);
        } catch (NoSuchFieldException unused) {
            sb = new StringBuilder();
            sb.append("field ");
            sb.append(str);
            str2 = " not found in class ";
            sb.append(str2);
            sb.append(obj.getClass().getCanonicalName());
            str3 = sb.toString();
            Log.v(TAG, str3);
            return null;
        } catch (IllegalArgumentException unused2) {
            str3 = "IllegalArgumentException when getting field " + str + " from class " + obj.getClass().getCanonicalName();
            Log.v(TAG, str3);
            return null;
        } catch (IllegalAccessException unused3) {
            sb = new StringBuilder();
            sb.append("field ");
            sb.append(str);
            str2 = " is not accessible in class ";
            sb.append(str2);
            sb.append(obj.getClass().getCanonicalName());
            str3 = sb.toString();
            Log.v(TAG, str3);
            return null;
        }
    }

    static boolean methodExists(Object obj, String str) {
        try {
            obj.getClass().getMethod(str, new Class[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
