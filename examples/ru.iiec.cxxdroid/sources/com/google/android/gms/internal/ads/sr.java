package com.google.android.gms.internal.ads;

import java.io.IOException;

public class sr extends IOException {
    public sr(String str) {
        super(str);
    }

    static sr b() {
        return new sr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static sr c() {
        return new sr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static sr d() {
        return new sr("CodedInputStream encountered a malformed varint.");
    }

    static sr e() {
        return new sr("Protocol message contained an invalid tag (zero).");
    }

    static sr f() {
        return new sr("Protocol message end-group tag did not match expected tag.");
    }

    static tr g() {
        return new tr("Protocol message tag had invalid wire type.");
    }

    static sr h() {
        return new sr("Failed to parse the message.");
    }

    static sr i() {
        return new sr("Protocol message had invalid UTF-8.");
    }

    public final sr a(ss ssVar) {
        return this;
    }
}
