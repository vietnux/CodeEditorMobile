package i;

import java.io.IOException;

public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    

    /* renamed from: b  reason: collision with root package name */
    private final String f9213b;

    private w(String str) {
        this.f9213b = str;
    }

    public static w a(String str) {
        if (str.equals(HTTP_1_0.f9213b)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f9213b)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f9213b)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f9213b)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f9213b)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f9213b;
    }
}
