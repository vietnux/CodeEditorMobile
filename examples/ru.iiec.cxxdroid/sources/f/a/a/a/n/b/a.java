package f.a.a.a.n.b;

import f.a.a.a.i;
import f.a.a.a.n.e.c;
import f.a.a.a.n.e.d;
import f.a.a.a.n.e.e;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f8371f = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final e f8372b;

    /* renamed from: c  reason: collision with root package name */
    private final c f8373c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8374d;

    /* renamed from: e  reason: collision with root package name */
    protected final i f8375e;

    public a(i iVar, String str, String str2, e eVar, c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (eVar != null) {
            this.f8375e = iVar;
            this.f8374d = str;
            this.a = a(str2);
            this.f8372b = eVar;
            this.f8373c = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    private String a(String str) {
        return !i.b(this.f8374d) ? f8371f.matcher(str).replaceFirst(this.f8374d) : str;
    }

    /* access modifiers changed from: protected */
    public d a() {
        return a(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public d a(Map<String, String> map) {
        d a2 = this.f8372b.a(this.f8373c, b(), map);
        a2.a(false);
        a2.a(10000);
        a2.c("User-Agent", "Crashlytics Android SDK/" + this.f8375e.p());
        a2.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return a2;
    }

    /* access modifiers changed from: protected */
    public String b() {
        return this.a;
    }
}
