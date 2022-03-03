package e.b.b.a.c.e;

import android.os.Bundle;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicReference;

public final class x0 extends z2 {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f7674c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f7675d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<String[]> f7676e = new AtomicReference<>();

    x0(d2 d2Var) {
        super(d2Var);
    }

    private final String a(k0 k0Var) {
        if (k0Var == null) {
            return null;
        }
        return !y() ? k0Var.toString() : a(k0Var.t());
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        y.a(strArr);
        y.a(strArr2);
        y.a(atomicReference);
        y.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (s5.d(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i2] == null) {
                        strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                    }
                    str2 = strArr3[i2];
                }
                return str2;
            }
        }
        return str;
    }

    private static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i2, x5 x5Var) {
        String str;
        if (x5Var != null) {
            a(sb, i2);
            sb.append("filter {\n");
            a(sb, i2, "complement", x5Var.f7692e);
            a(sb, i2, "param_name", b(x5Var.f7693f));
            int i3 = i2 + 1;
            a6 a6Var = x5Var.f7690c;
            if (a6Var != null) {
                a(sb, i3);
                sb.append("string_filter");
                sb.append(" {\n");
                Integer num = a6Var.f7162c;
                if (num != null) {
                    switch (num.intValue()) {
                        case 1:
                            str = "REGEXP";
                            break;
                        case 2:
                            str = "BEGINS_WITH";
                            break;
                        case 3:
                            str = "ENDS_WITH";
                            break;
                        case 4:
                            str = "PARTIAL";
                            break;
                        case 5:
                            str = "EXACT";
                            break;
                        case 6:
                            str = "IN_LIST";
                            break;
                        default:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                    }
                    a(sb, i3, "match_type", str);
                }
                a(sb, i3, "expression", a6Var.f7163d);
                a(sb, i3, "case_sensitive", a6Var.f7164e);
                if (a6Var.f7165f.length > 0) {
                    a(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    String[] strArr = a6Var.f7165f;
                    for (String str2 : strArr) {
                        a(sb, i3 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a(sb, i3);
                sb.append("}\n");
            }
            a(sb, i3, "number_filter", x5Var.f7691d);
            a(sb, i2);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i2, String str, j6 j6Var) {
        if (j6Var != null) {
            a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            int i3 = 0;
            if (j6Var.f7371d != null) {
                a(sb, 4);
                sb.append("results: ");
                long[] jArr = j6Var.f7371d;
                int length = jArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    Long valueOf = Long.valueOf(jArr[i4]);
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i4++;
                    i5 = i6;
                }
                sb.append('\n');
            }
            if (j6Var.f7370c != null) {
                a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = j6Var.f7370c;
                int length2 = jArr2.length;
                int i7 = 0;
                while (i3 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i3]);
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i3++;
                    i7 = i8;
                }
                sb.append('\n');
            }
            a(sb, 3);
            sb.append("}\n");
        }
    }

    private final void a(StringBuilder sb, int i2, String str, y5 y5Var) {
        if (y5Var != null) {
            a(sb, i2);
            sb.append(str);
            sb.append(" {\n");
            Integer num = y5Var.f7709c;
            if (num != null) {
                int intValue = num.intValue();
                a(sb, i2, "comparison_type", intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? "UNKNOWN_COMPARISON_TYPE" : "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
            }
            a(sb, i2, "match_as_float", y5Var.f7710d);
            a(sb, i2, "comparison_value", y5Var.f7711e);
            a(sb, i2, "min_comparison_value", y5Var.f7712f);
            a(sb, i2, "max_comparison_value", y5Var.f7713g);
            a(sb, i2);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            a(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    private final boolean y() {
        return this.a.a().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!y()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            sb.append(sb.length() != 0 ? ", " : "Bundle[{");
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(h6 h6Var) {
        int i2;
        i6[] i6VarArr;
        int i3;
        i6[] i6VarArr2;
        x0 x0Var = this;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        i6[] i6VarArr3 = h6Var.f7307c;
        if (i6VarArr3 != null) {
            int length = i6VarArr3.length;
            int i4 = 0;
            while (i4 < length) {
                i6 i6Var = i6VarArr3[i4];
                if (i6Var == null || i6Var == null) {
                    i6VarArr = i6VarArr3;
                    i2 = length;
                } else {
                    a(sb, 1);
                    sb.append("bundle {\n");
                    a(sb, 1, "protocol_version", i6Var.f7327c);
                    a(sb, 1, "platform", i6Var.f7335k);
                    a(sb, 1, "gmp_version", i6Var.s);
                    a(sb, 1, "uploading_gmp_version", i6Var.t);
                    a(sb, 1, "config_version", i6Var.I);
                    a(sb, 1, "gmp_app_id", i6Var.A);
                    a(sb, 1, "app_id", i6Var.q);
                    a(sb, 1, "app_version", i6Var.r);
                    a(sb, 1, "app_version_major", i6Var.E);
                    a(sb, 1, "firebase_instance_id", i6Var.D);
                    a(sb, 1, "dev_cert_hash", i6Var.x);
                    a(sb, 1, "app_store", i6Var.p);
                    a(sb, 1, "upload_timestamp_millis", i6Var.f7330f);
                    a(sb, 1, "start_timestamp_millis", i6Var.f7331g);
                    a(sb, 1, "end_timestamp_millis", i6Var.f7332h);
                    a(sb, 1, "previous_bundle_start_timestamp_millis", i6Var.f7333i);
                    a(sb, 1, "previous_bundle_end_timestamp_millis", i6Var.f7334j);
                    a(sb, 1, "app_instance_id", i6Var.w);
                    a(sb, 1, "resettable_device_id", i6Var.u);
                    a(sb, 1, "device_id", i6Var.H);
                    a(sb, 1, "limited_ad_tracking", i6Var.v);
                    a(sb, 1, "os_version", i6Var.f7336l);
                    a(sb, 1, "device_model", i6Var.f7337m);
                    a(sb, 1, "user_default_language", i6Var.n);
                    a(sb, 1, "time_zone_offset_minutes", i6Var.o);
                    a(sb, 1, "bundle_sequential_index", i6Var.y);
                    a(sb, 1, "service_upload", i6Var.B);
                    a(sb, 1, "health_monitor", i6Var.z);
                    Long l2 = i6Var.J;
                    if (!(l2 == null || l2.longValue() == 0)) {
                        a(sb, 1, "android_id", i6Var.J);
                    }
                    Integer num = i6Var.M;
                    if (num != null) {
                        a(sb, 1, "retry_counter", num);
                    }
                    k6[] k6VarArr = i6Var.f7329e;
                    int i5 = 2;
                    if (k6VarArr != null) {
                        int length2 = k6VarArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            k6 k6Var = k6VarArr[i6];
                            if (k6Var != null) {
                                a(sb, i5);
                                sb.append("user_property {\n");
                                i6VarArr2 = i6VarArr3;
                                i3 = length;
                                a(sb, 2, "set_timestamp_millis", k6Var.f7396c);
                                a(sb, 2, "name", x0Var.c(k6Var.f7397d));
                                a(sb, 2, "string_value", k6Var.f7398e);
                                a(sb, 2, "int_value", k6Var.f7399f);
                                a(sb, 2, "double_value", k6Var.f7401h);
                                a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i6VarArr2 = i6VarArr3;
                                i3 = length;
                            }
                            i6++;
                            i6VarArr3 = i6VarArr2;
                            length = i3;
                            i5 = 2;
                        }
                    }
                    i6VarArr = i6VarArr3;
                    i2 = length;
                    e6[] e6VarArr = i6Var.C;
                    if (e6VarArr != null) {
                        for (e6 e6Var : e6VarArr) {
                            if (e6Var != null) {
                                a(sb, 2);
                                sb.append("audience_membership {\n");
                                a(sb, 2, "audience_id", e6Var.f7236c);
                                a(sb, 2, "new_audience", e6Var.f7239f);
                                a(sb, 2, "current_data", e6Var.f7237d);
                                a(sb, 2, "previous_data", e6Var.f7238e);
                                a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    f6[] f6VarArr = i6Var.f7328d;
                    if (f6VarArr != null) {
                        int length3 = f6VarArr.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            f6 f6Var = f6VarArr[i7];
                            if (f6Var != null) {
                                a(sb, 2);
                                sb.append("event {\n");
                                a(sb, 2, "name", x0Var.a(f6Var.f7260d));
                                a(sb, 2, "timestamp_millis", f6Var.f7261e);
                                a(sb, 2, "previous_timestamp_millis", f6Var.f7262f);
                                a(sb, 2, "count", f6Var.f7263g);
                                g6[] g6VarArr = f6Var.f7259c;
                                if (g6VarArr != null) {
                                    int length4 = g6VarArr.length;
                                    int i8 = 0;
                                    while (i8 < length4) {
                                        g6 g6Var = g6VarArr[i8];
                                        if (g6Var != null) {
                                            a(sb, 3);
                                            sb.append("param {\n");
                                            a(sb, 3, "name", x0Var.b(g6Var.f7282c));
                                            a(sb, 3, "string_value", g6Var.f7283d);
                                            a(sb, 3, "int_value", g6Var.f7284e);
                                            a(sb, 3, "double_value", g6Var.f7286g);
                                            a(sb, 3);
                                            sb.append("}\n");
                                        }
                                        i8++;
                                        x0Var = this;
                                    }
                                }
                                a(sb, 2);
                                sb.append("}\n");
                            }
                            i7++;
                            x0Var = this;
                        }
                    }
                    a(sb, 1);
                    sb.append("}\n");
                }
                i4++;
                x0Var = this;
                i6VarArr3 = i6VarArr;
                length = i2;
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(i0 i0Var) {
        if (i0Var == null) {
            return null;
        }
        if (!y()) {
            return i0Var.toString();
        }
        return "Event{appId='" + i0Var.a + "', name='" + a(i0Var.f7308b) + "', params=" + a(i0Var.f7312f) + "}";
    }

    /* access modifiers changed from: protected */
    public final String a(n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        if (!y()) {
            return n0Var.toString();
        }
        return "origin=" + n0Var.f7450d + ",name=" + a(n0Var.f7448b) + ",params=" + a(n0Var.f7449c);
    }

    /* access modifiers changed from: protected */
    public final String a(w5 w5Var) {
        if (w5Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        a(sb, 0, "filter_id", w5Var.f7662c);
        a(sb, 0, "event_name", a(w5Var.f7663d));
        a(sb, 1, "event_count_filter", w5Var.f7666g);
        sb.append("  filters {\n");
        for (x5 x5Var : w5Var.f7664e) {
            a(sb, 2, x5Var);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(z5 z5Var) {
        if (z5Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        a(sb, 0, "filter_id", z5Var.f7744c);
        a(sb, 0, "property_name", c(z5Var.f7745d));
        a(sb, 1, z5Var.f7746e);
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !y() ? str : a(str, AppMeasurement.a.f6241b, AppMeasurement.a.a, f7674c);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !y() ? str : a(str, AppMeasurement.d.f6242b, AppMeasurement.d.a, f7675d);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, AppMeasurement.e.f6243b, AppMeasurement.e.a, f7676e);
        }
        return "experiment_id" + "(" + str + ")";
    }

    /* access modifiers changed from: protected */
    @Override // e.b.b.a.c.e.z2
    public final boolean u() {
        return false;
    }
}
