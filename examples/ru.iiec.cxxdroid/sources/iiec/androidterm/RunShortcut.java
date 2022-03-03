package iiec.androidterm;

import android.content.Intent;
import android.util.Log;
import iiec.androidterm.t.b;
import java.security.GeneralSecurityException;

public final class RunShortcut extends RemoteInterface {
    /* access modifiers changed from: protected */
    @Override // iiec.androidterm.RemoteInterface
    public void b() {
        String str;
        if (a() == null) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent.getAction().equals("iiec.androidterm.RUN_SHORTCUT")) {
            String stringExtra = intent.getStringExtra("iiec.androidterm.iShortcutCommand");
            if (stringExtra == null) {
                str = "No command provided in shortcut!";
            } else {
                b.a a = b.a(this);
                if (a == null) {
                    str = "No shortcut encryption keys found!";
                } else {
                    try {
                        String a2 = b.a(stringExtra, a);
                        String stringExtra2 = intent.getStringExtra("iiec.androidterm.window_handle");
                        String a3 = stringExtra2 != null ? a(stringExtra2, a2) : a(a2);
                        Intent intent2 = new Intent();
                        intent2.putExtra("iiec.androidterm.window_handle", a3);
                        setResult(-1, intent2);
                    } catch (GeneralSecurityException e2) {
                        str = "Invalid shortcut: " + e2.toString();
                    }
                }
            }
            Log.e("Term", str);
            finish();
            return;
        }
        finish();
    }
}
