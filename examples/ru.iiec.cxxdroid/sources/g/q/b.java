package g.q;

import g.r.d.i;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public final class b {
    public static final long a(Reader reader, Writer writer, int i2) {
        i.c(reader, "$this$copyTo");
        i.c(writer, "out");
        char[] cArr = new char[i2];
        int read = reader.read(cArr);
        long j2 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j2 += (long) read;
            read = reader.read(cArr);
        }
        return j2;
    }

    public static /* synthetic */ long a(Reader reader, Writer writer, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 8192;
        }
        return a(reader, writer, i2);
    }

    public static final String a(Reader reader) {
        i.c(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        a(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        i.b(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
