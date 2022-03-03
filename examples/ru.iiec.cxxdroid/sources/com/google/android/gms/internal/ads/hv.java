package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class hv extends IOException {
    public hv(String str) {
        super(str);
    }

    static hv b() {
        return new hv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static hv c() {
        return new hv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static hv d() {
        return new hv("CodedInputStream encountered a malformed varint.");
    }
}
