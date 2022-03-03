package qwe.qweqwe.texteditor.w0.c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class j extends c {

    /* renamed from: g  reason: collision with root package name */
    private static final Set<Character> f9820g = new HashSet(Arrays.asList(')', '>'));

    /* renamed from: d  reason: collision with root package name */
    public String f9821d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f9822e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9823f = false;

    public j(String str, String str2) {
        super(str, str2);
    }

    public static Set<Character> b() {
        return f9820g;
    }

    public abstract int a();

    public j a(String str) {
        return this;
    }

    public j a(List<String> list) {
        this.f9822e = list;
        return this;
    }

    public j b(String str) {
        this.f9821d = str;
        return this;
    }

    public abstract String c(String str);
}
