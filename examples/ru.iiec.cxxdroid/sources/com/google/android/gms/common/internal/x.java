package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class x {

    public static final class a {
        private final List<String> a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f3701b;

        private a(Object obj) {
            y.a(obj);
            this.f3701b = obj;
            this.a = new ArrayList();
        }

        public final a a(String str, Object obj) {
            List<String> list = this.a;
            y.a((Object) str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3701b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
