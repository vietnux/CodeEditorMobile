package iiec.androidterm.r.t;

import android.content.Context;
import android.text.ClipboardManager;

public class g implements d {
    private final ClipboardManager a;

    public g(Context context) {
        this.a = (ClipboardManager) context.getApplicationContext().getSystemService("clipboard");
    }

    @Override // iiec.androidterm.r.t.d
    public void a(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // iiec.androidterm.r.t.d
    public boolean a() {
        return this.a.hasText();
    }

    @Override // iiec.androidterm.r.t.d
    public CharSequence v() {
        return this.a.getText();
    }
}
