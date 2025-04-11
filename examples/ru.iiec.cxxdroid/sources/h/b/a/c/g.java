package h.b.a.c;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class g {
    private final Date a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8700b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8701c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8702d;

    /* renamed from: e  reason: collision with root package name */
    private final Date f8703e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8704f;

    public g(String str, String str2, String str3, String str4, Date date, Date date2) {
        this.a = date;
        this.f8700b = str2;
        this.f8702d = str;
        this.f8703e = date2;
        this.f8704f = str4;
        this.f8701c = str3;
    }

    public String a() {
        return this.f8704f;
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy", Locale.US);
        return "{" + "key: " + this.f8700b + ", value: " + this.f8704f + ", module: " + this.f8702d + ", created: " + simpleDateFormat.format(this.a) + ", updated: " + simpleDateFormat.format(this.f8703e) + ", migratedKey: " + this.f8701c + "}";
    }
}
