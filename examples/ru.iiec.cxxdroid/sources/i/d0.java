package i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum d0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: b  reason: collision with root package name */
    final String f8801b;

    private d0(String str) {
        this.f8801b = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.d0 a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d0.a(java.lang.String):i.d0");
    }

    static List<d0> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String h() {
        return this.f8801b;
    }
}
