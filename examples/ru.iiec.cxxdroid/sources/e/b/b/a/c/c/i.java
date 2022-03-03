package e.b.b.a.c.c;

import java.io.IOException;

public final class i extends IOException {
    public i(String str) {
        super(str);
    }

    static i b() {
        return new i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static i c() {
        return new i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static i d() {
        return new i("CodedInputStream encountered a malformed varint.");
    }
}
