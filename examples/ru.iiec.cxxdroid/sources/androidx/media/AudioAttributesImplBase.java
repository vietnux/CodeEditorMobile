package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {
    int a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f1480b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f1481c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f1482d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f1480b;
    }

    public int b() {
        int i2 = this.f1481c;
        int c2 = c();
        if (c2 == 6) {
            i2 |= 4;
        } else if (c2 == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f1482d;
        return i2 != -1 ? i2 : AudioAttributesCompat.a(false, this.f1481c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f1480b == audioAttributesImplBase.a() && this.f1481c == audioAttributesImplBase.b() && this.a == audioAttributesImplBase.d() && this.f1482d == audioAttributesImplBase.f1482d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1480b), Integer.valueOf(this.f1481c), Integer.valueOf(this.a), Integer.valueOf(this.f1482d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1482d != -1) {
            sb.append(" stream=");
            sb.append(this.f1482d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.f1480b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1481c).toUpperCase());
        return sb.toString();
    }
}
