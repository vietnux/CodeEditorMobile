package e.d.a.a;

import java.util.HashMap;
import k.a.a.a.c;
import qwe.qweqwe.texteditor.m0;

public abstract class m {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f8233c = {'(', ')', '{', '}', '.', ',', ';', '=', '+', '-', '/', '*', '&', '!', '|', ':', '[', ']', '<', '>', '?', '~', '%', '^'};
    protected HashMap<String, Integer> a = new HashMap<>(0);

    /* renamed from: b  reason: collision with root package name */
    protected HashMap<Character, Integer> f8234b = b(f8233c);

    public static m a(String str, m mVar) {
        if (str == null) {
            return mVar;
        }
        String b2 = c.b(str);
        String a2 = c.a(str);
        m[] mVarArr = t.a;
        for (m mVar2 : mVarArr) {
            if (mVar2.a(b2, a2.toLowerCase())) {
                return mVar2;
            }
        }
        return mVar;
    }

    public static m b(String str) {
        m[] mVarArr = t.a;
        for (m mVar : mVarArr) {
            if (str.equals(mVar.getClass().getName())) {
                return mVar;
            }
        }
        return y.e();
    }

    private HashMap<Character, Integer> b(char[] cArr) {
        HashMap<Character, Integer> hashMap = new HashMap<>(cArr.length);
        for (char c2 : cArr) {
            hashMap.put(Character.valueOf(c2), 2);
        }
        return hashMap;
    }

    public Character a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(char[] cArr) {
        this.f8234b = b(cArr);
    }

    /* access modifiers changed from: protected */
    public void a(String[] strArr) {
        this.a = new HashMap<>(strArr.length);
        for (String str : strArr) {
            this.a.put(str, 1);
        }
    }

    public boolean a(char c2) {
        return c2 == '\"';
    }

    public boolean a(char c2, char c3) {
        return c2 == '/' && c3 == '/';
    }

    public boolean a(char c2, char c3, char c4) {
        return false;
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public boolean a(String str, String str2) {
        return false;
    }

    public int b() {
        return m0.ic_comment_slash;
    }

    public boolean b(char c2) {
        return c2 == '\'';
    }

    public boolean b(char c2, char c3) {
        return c2 == '*' && c3 == '/';
    }

    public boolean b(char c2, char c3, char c4) {
        return false;
    }

    public String c() {
        return null;
    }

    public boolean c(char c2) {
        return c2 == '\\';
    }

    public boolean c(char c2, char c3) {
        return c2 == '/' && c3 == '*';
    }

    public boolean d() {
        return true;
    }

    public boolean d(char c2) {
        return c2 == '#';
    }

    public boolean e(char c2) {
        return false;
    }

    public final boolean f(char c2) {
        return this.f8234b.containsKey(Character.valueOf(c2));
    }

    public boolean g(char c2) {
        return c2 == ' ' || c2 == '\n' || c2 == '\t' || c2 == '\r' || c2 == '\f' || c2 == 65535;
    }

    public boolean h(char c2) {
        return false;
    }
}
