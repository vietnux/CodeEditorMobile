package e.d.a.a;

import java.util.ArrayList;

public class i extends m0 {

    /* renamed from: k  reason: collision with root package name */
    private boolean f8223k = true;

    /* renamed from: l  reason: collision with root package name */
    private a f8224l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f8225m;

    public interface a {
        int a(char c2);

        int getRowWidth();
    }

    public i(a aVar) {
        this.f8224l = aVar;
        s();
    }

    private void a(int i2, int i3, int i4) {
        if (this.f8223k) {
            if (!r()) {
                o0.a("Not enough space to do word wrap");
                return;
            }
            ArrayList arrayList = new ArrayList();
            int k2 = k(i3);
            int k3 = k(i4);
            int rowWidth = this.f8224l.getRowWidth();
            int i5 = i3;
            int i6 = rowWidth;
            int i7 = 0;
            while (k2 < k3) {
                if (k2 == this.f8235b) {
                    k2 = this.f8236c;
                }
                char c2 = this.a[k2];
                i7 += this.f8224l.a(c2);
                if (c2 == ' ' || c2 == '\t' || c2 == '\n' || c2 == 65535 || c2 == '.' || c2 == ',' || c2 == ';' || c2 == '+' || c2 == '-' || c2 == '/' || c2 == '*') {
                    if (i7 <= i6) {
                        i6 -= i7;
                    } else if (i7 > rowWidth) {
                        int k4 = k(i5);
                        if (i5 != i3 && (arrayList.isEmpty() || i5 != ((Integer) arrayList.get(arrayList.size() - 1)).intValue())) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                        int i8 = rowWidth;
                        while (k4 <= k2) {
                            if (k4 == this.f8235b) {
                                k4 = this.f8236c;
                            }
                            int a2 = this.f8224l.a(this.a[k4]);
                            if (a2 > i8) {
                                arrayList.add(Integer.valueOf(l(k4)));
                                i8 = rowWidth - a2;
                            } else {
                                i8 -= a2;
                            }
                            k4++;
                        }
                        i6 = i8;
                    } else {
                        arrayList.add(Integer.valueOf(i5));
                        i6 = rowWidth - i7;
                    }
                    i5 = l(k2) + 1;
                    i7 = 0;
                }
                if (c2 == '\n') {
                    arrayList.add(Integer.valueOf(i5));
                    i6 = rowWidth;
                }
                k2++;
            }
            this.f8225m.addAll(i2, arrayList);
        }
    }

    private void b(int i2, int i3) {
        while (i2 < this.f8225m.size()) {
            ArrayList<Integer> arrayList = this.f8225m;
            arrayList.set(i2, Integer.valueOf(arrayList.get(i2).intValue() + i3));
            i2++;
        }
    }

    private void b(int i2, int i3, int i4) {
        if (i2 > 0) {
            i2--;
        }
        int intValue = this.f8225m.get(i2).intValue();
        int i5 = i2 + 1;
        c(i5, i3 - i4);
        b(i5, i4);
        a(i5, intValue, i3);
    }

    private void c(int i2, int i3) {
        while (i2 < this.f8225m.size() && this.f8225m.get(i2).intValue() <= i3) {
            this.f8225m.remove(i2);
        }
    }

    private boolean r() {
        return this.f8224l.getRowWidth() >= this.f8224l.a('M') * 2;
    }

    private void s() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        this.f8225m = arrayList;
    }

    private int v(int i2) {
        int k2 = k(i2);
        while (k2 < this.a.length) {
            if (k2 == this.f8235b) {
                k2 = this.f8236c;
            }
            char[] cArr = this.a;
            if (cArr[k2] == '\n' || cArr[k2] == 65535) {
                break;
            }
            k2++;
        }
        return l(k2) + 1;
    }

    @Override // e.d.a.a.m0
    public synchronized void a(int i2, int i3, long j2, boolean z) {
        super.a(i2, i3, j2, z);
        if (this.f8223k) {
            b(q(i2), v(i2), -i3);
        }
    }

    public void a(boolean z) {
        if (z && !this.f8223k) {
            this.f8223k = true;
            o();
        } else if (!z && this.f8223k) {
            this.f8223k = false;
            this.f8225m = null;
        }
    }

    @Override // e.d.a.a.m0
    public synchronized void a(char[] cArr, int i2, long j2, boolean z) {
        super.a(cArr, i2, j2, z);
        if (this.f8223k) {
            b(q(i2), v(i2 + cArr.length), cArr.length);
        }
    }

    public void o() {
        if (this.f8223k) {
            s();
            if (r()) {
                a(1, 0, k());
            } else if (this.f8224l.getRowWidth() > 0) {
                o0.a("Text field has non-zero width but still too small for word wrap");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // e.d.a.a.m0
    public synchronized void o(int i2) {
        super.o(i2);
        if (this.f8223k) {
            if (i2 != 0) {
                b(q(i2 > 0 ? this.f8235b - i2 : this.f8235b), v(this.f8235b), i2);
            }
        }
    }

    public int p() {
        return !this.f8223k ? super.i() : this.f8225m.size();
    }

    public int q(int i2) {
        if (!this.f8223k) {
            return super.b(i2);
        }
        if (!j(i2)) {
            return -1;
        }
        int size = this.f8225m.size() - 1;
        int i3 = 0;
        while (size >= i3) {
            int i4 = (i3 + size) / 2;
            int i5 = i4 + 1;
            int intValue = i5 < this.f8225m.size() ? this.f8225m.get(i5).intValue() : k();
            if (i2 >= this.f8225m.get(i4).intValue() && i2 < intValue) {
                return i4;
            }
            if (i2 >= intValue) {
                i3 = i5;
            } else {
                size = i4 - 1;
            }
        }
        return -1;
    }

    public boolean q() {
        return this.f8223k;
    }

    public String r(int i2) {
        if (!this.f8223k) {
            return super.d(i2);
        }
        int t = t(i2);
        return t == 0 ? new String() : new String(a(this.f8225m.get(i2).intValue(), t));
    }

    public int s(int i2) {
        if (!this.f8223k) {
            return super.e(i2);
        }
        if (u(i2)) {
            return -1;
        }
        return this.f8225m.get(i2).intValue();
    }

    public int t(int i2) {
        if (!this.f8223k) {
            return super.f(i2);
        }
        if (u(i2)) {
            return 0;
        }
        return (i2 != this.f8225m.size() + -1 ? this.f8225m.get(i2 + 1).intValue() : k()) - this.f8225m.get(i2).intValue();
    }

    /* access modifiers changed from: protected */
    public boolean u(int i2) {
        return i2 < 0 || i2 >= this.f8225m.size();
    }
}
