package e.b.b.a.c.b;

import java.io.IOException;

public final class h0 extends IOException {
    public h0(String str) {
        super(str);
    }

    static h0 b() {
        return new h0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static h0 c() {
        return new h0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
