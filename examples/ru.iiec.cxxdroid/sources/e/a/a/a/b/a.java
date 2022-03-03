package e.a.a.a.b;

import e.a.a.a.e.b;

public class a implements e.a.a.a.a {
    private final String a;

    public a(String str) {
        this.a = str;
    }

    @Override // e.a.a.a.a
    public b<String> a(e.a.a.a.d.a aVar) {
        return a(aVar, null);
    }

    public b<String> a(e.a.a.a.d.a aVar, String str) {
        e.a.a.a.c.a.a c2 = e.a.a.a.c.a.a.c();
        c2.a("api_option", "paste");
        c2.a("api_dev_key", this.a);
        c2.a("api_paste_code", aVar.a().get());
        c2.a("api_paste_name", aVar.getTitle());
        c2.a("api_paste_format", aVar.b());
        c2.a("api_paste_private", String.valueOf(aVar.c().h()));
        c2.a("api_paste_expire_date", aVar.d().h());
        if (str != null) {
            c2.a("api_user_key", str);
        }
        return c2.b();
    }
}
