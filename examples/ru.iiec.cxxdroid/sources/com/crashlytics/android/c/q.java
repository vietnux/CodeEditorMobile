package com.crashlytics.android.c;

import android.os.Bundle;
import com.crashlytics.android.c.a0;
import f.a.a.a.c;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class q {
    private static final Set<String> a = new HashSet(Arrays.asList("app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"));

    private Double a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    private String a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_" + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r11.equals("purchase") != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.c.q.a(java.lang.String, boolean):java.lang.String");
    }

    private void a(Bundle bundle, String str, Double d2) {
        Double a2 = a(d2);
        if (a2 != null) {
            bundle.putDouble(str, a2.doubleValue());
        }
    }

    private void a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    private void a(Bundle bundle, String str, Long l2) {
        if (l2 != null) {
            bundle.putLong(str, l2.longValue());
        }
    }

    private void a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private void a(Bundle bundle, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String a2 = a(entry.getKey());
            if (value instanceof String) {
                bundle.putString(a2, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(a2, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(a2, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(a2, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    private Bundle b(a0 a0Var) {
        String str;
        String str2;
        Object obj;
        Bundle bundle = new Bundle();
        if ("purchase".equals(a0Var.f2792g)) {
            a(bundle, "item_id", (String) a0Var.f2793h.get("itemId"));
            a(bundle, "item_name", (String) a0Var.f2793h.get("itemName"));
            a(bundle, "item_category", (String) a0Var.f2793h.get("itemType"));
            obj = a0Var.f2793h.get("itemPrice");
        } else {
            if ("addToCart".equals(a0Var.f2792g)) {
                a(bundle, "item_id", (String) a0Var.f2793h.get("itemId"));
                a(bundle, "item_name", (String) a0Var.f2793h.get("itemName"));
                a(bundle, "item_category", (String) a0Var.f2793h.get("itemType"));
                a(bundle, "price", b(a0Var.f2793h.get("itemPrice")));
                a(bundle, "value", b(a0Var.f2793h.get("itemPrice")));
                a(bundle, "currency", (String) a0Var.f2793h.get("currency"));
                bundle.putLong("quantity", 1);
            } else if ("startCheckout".equals(a0Var.f2792g)) {
                a(bundle, "quantity", Long.valueOf((long) ((Integer) a0Var.f2793h.get("itemCount")).intValue()));
                obj = a0Var.f2793h.get("totalPrice");
            } else {
                if (!"contentView".equals(a0Var.f2792g)) {
                    if ("search".equals(a0Var.f2792g)) {
                        str = (String) a0Var.f2793h.get("query");
                        str2 = "search_term";
                    } else if ("share".equals(a0Var.f2792g)) {
                        a(bundle, "method", (String) a0Var.f2793h.get("method"));
                    } else if ("rating".equals(a0Var.f2792g)) {
                        a(bundle, "rating", String.valueOf(a0Var.f2793h.get("rating")));
                    } else if ("signUp".equals(a0Var.f2792g) || "login".equals(a0Var.f2792g) || "invite".equals(a0Var.f2792g)) {
                        a(bundle, "method", (String) a0Var.f2793h.get("method"));
                    } else if ("levelStart".equals(a0Var.f2792g)) {
                        str = (String) a0Var.f2793h.get("levelName");
                        str2 = "level_name";
                    } else if ("levelEnd".equals(a0Var.f2792g)) {
                        a(bundle, "score", a(a0Var.f2793h.get("score")));
                        a(bundle, "level_name", (String) a0Var.f2793h.get("levelName"));
                        a(bundle, "success", b((String) a0Var.f2793h.get("success")));
                    }
                    a(bundle, str2, str);
                }
                a(bundle, "content_type", (String) a0Var.f2793h.get("contentType"));
                a(bundle, "item_id", (String) a0Var.f2793h.get("contentId"));
                a(bundle, "item_name", (String) a0Var.f2793h.get("contentName"));
            }
            a(bundle, a0Var.f2791f);
            return bundle;
        }
        a(bundle, "value", b(obj));
        a(bundle, "currency", (String) a0Var.f2793h.get("currency"));
        a(bundle, a0Var.f2791f);
        return bundle;
    }

    private Double b(Object obj) {
        Long l2 = (Long) obj;
        if (l2 == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l2.longValue()).divide(a.a).doubleValue());
    }

    private Integer b(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    private String c(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        if (a.contains(str)) {
            return "fabric_" + str;
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            replaceAll = "fabric_" + replaceAll;
        }
        return replaceAll.length() > 40 ? replaceAll.substring(0, 40) : replaceAll;
    }

    public p a(a0 a0Var) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = a0.c.CUSTOM.equals(a0Var.f2788c) && a0Var.f2790e != null;
        boolean z3 = a0.c.PREDEFINED.equals(a0Var.f2788c) && a0Var.f2792g != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = b(a0Var);
        } else {
            bundle = new Bundle();
            Map<String, Object> map = a0Var.f2791f;
            if (map != null) {
                a(bundle, map);
            }
        }
        if (z3) {
            String str2 = (String) a0Var.f2793h.get("success");
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = a(a0Var.f2792g, z);
        } else {
            str = c(a0Var.f2790e);
        }
        c.g().e("Answers", "Logging event into firebase...");
        return new p(str, bundle);
    }
}
