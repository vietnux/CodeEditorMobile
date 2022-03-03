package k.a.a.a.g;

import java.io.Serializable;
import java.io.Writer;

public class a extends Writer implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f9534b;

    public a() {
        this.f9534b = new StringBuilder();
    }

    public a(int i2) {
        this.f9534b = new StringBuilder(i2);
    }

    @Override // java.lang.Appendable, java.io.Writer, java.io.Writer
    public Writer append(char c2) {
        this.f9534b.append(c2);
        return this;
    }

    @Override // java.lang.Appendable, java.io.Writer, java.io.Writer
    public Writer append(CharSequence charSequence) {
        this.f9534b.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable, java.io.Writer, java.io.Writer
    public Writer append(CharSequence charSequence, int i2, int i3) {
        this.f9534b.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f9534b.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f9534b.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.f9534b.append(cArr, i2, i3);
        }
    }
}
