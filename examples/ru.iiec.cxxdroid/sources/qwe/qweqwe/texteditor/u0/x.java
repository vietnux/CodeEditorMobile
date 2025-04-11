package qwe.qweqwe.texteditor.u0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import iiec.androidterm.RunScript;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import qwe.qweqwe.texteditor.e0;
import qwe.qweqwe.texteditor.i0;

public class x {
    private static String a = "CommonUtils";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9761b = true;

    public interface a {
        void a(String str);

        void b(String str);
    }

    public static int a(Context context, String str, int i2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str, i2);
    }

    public static long a(Context context, String str, long j2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(str, j2);
    }

    public static SharedPreferences a(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static String a(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    public static String a(String str) {
        try {
            if (new File(str).exists()) {
                return qwe.qweqwe.texteditor.x0.a.a(str);
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    static /* synthetic */ void a(InputStream inputStream, a aVar) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (aVar != null) {
                        aVar.a(readLine);
                    }
                    if (f9761b) {
                        i0.a(a, readLine);
                    }
                } else {
                    inputStream.close();
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    public static void a(e0 e0Var, String str, String str2, Integer num) {
        a(e0Var, str, str2, qwe.qweqwe.texteditor.v0.a.f(e0Var), num);
    }

    public static void a(e0 e0Var, String str, String str2, String str3, Integer num) {
        Intent intent = new Intent(e0Var, RunScript.class);
        intent.setAction("iiec.androidterm.RUN_SCRIPT");
        intent.putExtra("pdb_mode_key", false);
        intent.putExtra("iiec.androidterm.iInitialCommand", "cd '" + str3 + "' ; " + str2 + " ; clear -r ; " + str + " ; exit");
        if (num == null) {
            e0Var.startActivity(intent);
        } else {
            e0Var.startActivityForResult(intent, num.intValue());
        }
    }

    public static boolean a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
    }

    public static boolean a(Context context, String str, File file) {
        return a(context, str, file, (a) null, true);
    }

    public static boolean a(Context context, String str, File file, a aVar) {
        return a(context, str, file, aVar, true);
    }

    public static boolean a(Context context, String str, File file, a aVar, boolean z) {
        return a(context, str, file, aVar, z, null);
    }

    public static boolean a(Context context, String str, File file, a aVar, boolean z, String[] strArr) {
        if (z && strArr != null) {
            int i2 = 1 / 0;
        }
        Process process = null;
        boolean z2 = true;
        if (z) {
            try {
                process = e.e.a.a.c(context).a(qwe.qweqwe.texteditor.v0.a.d(context) + " sh ", (String[]) null, file);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
                    bufferedWriter.write(str + " ; exit\n");
                    bufferedWriter.flush();
                    i0.a(a, "writed");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                z2 = false;
            }
        } else {
            process = e.e.a.a.c(context).a(new String[]{qwe.qweqwe.texteditor.v0.a.g(context), "-c", str}, strArr, file);
        }
        new Thread(new l(process.getInputStream(), aVar)).start();
        new Thread(new k(process.getErrorStream(), aVar)).start();
        try {
            if (f9761b) {
                i0.a(a, "waiting for...");
            }
            process.waitFor();
            if (f9761b) {
                i0.a(a, "waited");
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            Toast.makeText(context, e4.getMessage(), 0).show();
        }
        return z2;
    }

    public static boolean a(Context context, String str, boolean z) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str, z).commit();
    }

    public static int b(Context context, String str, File file, a aVar) {
        Process process = null;
        try {
            process = e.e.a.a.c(context).a(qwe.qweqwe.texteditor.v0.a.d(context) + " sh ", (String[]) null, file);
            try {
                String str2 = str + " ; exit\n";
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                i0.a(a, "writed");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new Thread(new m(process.getInputStream(), aVar)).start();
            new Thread(new n(process.getErrorStream(), aVar)).start();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            process.waitFor();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return process.exitValue();
    }

    public static String b(Context context, String str) {
        return a(context, str, (String) null);
    }

    static /* synthetic */ void b(InputStream inputStream, a aVar) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (aVar != null) {
                        aVar.b(readLine);
                    }
                    if (f9761b) {
                        i0.b(a, readLine);
                    }
                } else {
                    inputStream.close();
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    public static boolean b(Context context, String str, int i2) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str, i2).commit();
    }

    public static boolean b(Context context, String str, long j2) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(str, j2).commit();
    }

    public static boolean b(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, str2).commit();
    }

    static /* synthetic */ void c(InputStream inputStream, a aVar) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (aVar != null) {
                        aVar.a(readLine);
                    }
                    if (f9761b) {
                        i0.a(a, readLine);
                    }
                } else {
                    inputStream.close();
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }

    static /* synthetic */ void d(InputStream inputStream, a aVar) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (aVar != null) {
                        aVar.b(readLine);
                    }
                    if (f9761b) {
                        i0.b(a, readLine);
                    }
                } else {
                    inputStream.close();
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }
}
