package e.b.d;

import java.lang.reflect.Field;
import java.util.Locale;

public enum c implements d {
    IDENTITY {
        @Override // e.b.d.d
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        @Override // e.b.d.d
        public String a(Field field) {
            return c.a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        @Override // e.b.d.d
        public String a(Field field) {
            return c.a(c.a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        @Override // e.b.d.d
        public String a(Field field) {
            return c.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        @Override // e.b.d.d
        public String a(Field field) {
            return c.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        @Override // e.b.d.d
        public String a(Field field) {
            return c.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    private static String a(char c2, String str, int i2) {
        if (i2 >= str.length()) {
            return String.valueOf(c2);
        }
        return c2 + str.substring(i2);
    }

    static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i2 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i2++;
            charAt = str.charAt(i2);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(a(Character.toUpperCase(charAt), str, i2 + 1));
        return sb.toString();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
