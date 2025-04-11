package iiec.androidterm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import iiec.androidterm.r.m;
import java.util.Iterator;

public final class RunScript extends RemoteInterface {
    /* access modifiers changed from: protected */
    @Override // iiec.androidterm.RemoteInterface
    public void b() {
        String scheme;
        TermService a = a();
        if (a == null) {
            finish();
            return;
        }
        Intent intent = getIntent();
        Log.d("PDB", "loading globals");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            c.a = extras.getString("pdb_file_stdout_key");
            c.f9278b = extras.getString("pdb_file_stdin_key");
            c.f9279c = extras.getIntegerArrayList("pdb_bpointslist_key");
            c.f9280d = Boolean.valueOf(extras.getBoolean("pdb_mode_key"));
        }
        if (intent.getAction().equals("iiec.androidterm.RUN_SCRIPT")) {
            String stringExtra = intent.getStringExtra("iiec.androidterm.window_handle");
            String str = null;
            Uri data = intent.getData();
            if (!(data == null || (scheme = data.getScheme()) == null || !scheme.toLowerCase().equals("file"))) {
                str = data.getPath();
                if (str == null) {
                    str = "";
                }
                if (!str.equals("")) {
                    str = RemoteInterface.b(str);
                }
                String fragment = data.getFragment();
                if (fragment != null) {
                    str = str + " " + fragment;
                }
            }
            Iterator it = a.a().iterator();
            while (it.hasNext()) {
                ((m) it.next()).a();
            }
            if (str == null && (str = intent.getStringExtra("iiec.androidterm.iInitialCommand")) != null) {
                str = " " + str;
            }
            String a2 = stringExtra != null ? a(stringExtra, str) : a(str);
            Intent intent2 = new Intent();
            intent2.putExtra("iiec.androidterm.window_handle", a2);
            setResult(-1, intent2);
            finish();
            return;
        }
        super.b();
    }
}
