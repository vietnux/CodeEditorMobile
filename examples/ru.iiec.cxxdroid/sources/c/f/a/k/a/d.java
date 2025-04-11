package c.f.a.k.a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class d {
    private a a;

    /* renamed from: b  reason: collision with root package name */
    private String f2079b;

    /* renamed from: c  reason: collision with root package name */
    private int f2080c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f2081d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2082e = 0;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<b> f2083f = new ArrayList<>();

    static class a {
        public double a(float f2) {
            throw null;
        }
    }

    static class b {
        int a;

        /* renamed from: b  reason: collision with root package name */
        float f2084b;
    }

    public float a(float f2) {
        return (float) this.a.a(f2);
    }

    public String toString() {
        String str = this.f2079b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f2083f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            str = str + "[" + next.a + " , " + decimalFormat.format((double) next.f2084b) + "] ";
        }
        return str;
    }
}
