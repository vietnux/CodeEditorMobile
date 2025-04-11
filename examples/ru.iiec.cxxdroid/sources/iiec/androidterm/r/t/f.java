package iiec.androidterm.r.t;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

@SuppressLint({"NewApi"})
public class f implements d {
    private final ClipboardManager a;

    public f(Context context) {
        this.a = (ClipboardManager) context.getApplicationContext().getSystemService("clipboard");
    }

    @Override // iiec.androidterm.r.t.d
    public void a(CharSequence charSequence) {
        this.a.setPrimaryClip(ClipData.newPlainText("simple text", charSequence));
    }

    @Override // iiec.androidterm.r.t.d
    public boolean a() {
        return this.a.hasPrimaryClip() && this.a.getPrimaryClipDescription().hasMimeType("text/plain");
    }

    @Override // iiec.androidterm.r.t.d
    public CharSequence v() {
        return this.a.getPrimaryClip().getItemAt(0).getText();
    }
}
