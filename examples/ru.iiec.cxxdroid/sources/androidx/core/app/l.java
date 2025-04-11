package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

public class l {
    CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    IconCompat f1055b;

    /* renamed from: c  reason: collision with root package name */
    String f1056c;

    /* renamed from: d  reason: collision with root package name */
    String f1057d;

    /* renamed from: e  reason: collision with root package name */
    boolean f1058e;

    /* renamed from: f  reason: collision with root package name */
    boolean f1059f;

    public IconCompat a() {
        return this.f1055b;
    }

    public String b() {
        return this.f1057d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.f1056c;
    }

    public boolean e() {
        return this.f1058e;
    }

    public boolean f() {
        return this.f1059f;
    }

    public String g() {
        String str = this.f1056c;
        if (str != null) {
            return str;
        }
        if (this.a == null) {
            return "";
        }
        return "name:" + ((Object) this.a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().e() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
