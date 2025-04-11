package i;

import i.f0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class r {
    private final String[] a;

    public static final class a {
        final List<String> a = new ArrayList(20);

        private void d(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt2 = str2.charAt(i3);
                        if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                            throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str, str2));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value for name " + str + " == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        public a a(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                b("", str.substring(1));
                return this;
            } else {
                b("", str);
                return this;
            }
        }

        public a a(String str, String str2) {
            d(str, str2);
            b(str, str2);
            return this;
        }

        public r a() {
            return new r(this);
        }

        /* access modifiers changed from: package-private */
        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public String b(String str) {
            for (int size = this.a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.a.get(size))) {
                    return this.a.get(size + 1);
                }
            }
            return null;
        }

        public a c(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public a c(String str, String str2) {
            d(str, str2);
            c(str);
            b(str, str2);
            return this;
        }
    }

    r(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public String a(int i2) {
        return this.a[i2 * 2];
    }

    public String a(String str) {
        return a(this.a, str);
    }

    public int b() {
        return this.a.length / 2;
    }

    public String b(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public List<String> b(String str) {
        int b2 = b();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < b2; i2++) {
            if (str.equalsIgnoreCase(a(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i2));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(a(i2));
            sb.append(": ");
            sb.append(b(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
