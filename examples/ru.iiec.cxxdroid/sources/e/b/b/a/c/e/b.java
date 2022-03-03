package e.b.b.a.c.e;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class b {
    private final ByteBuffer a;

    private b(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private b(byte[] bArr, int i2, int i3) {
        this(ByteBuffer.wrap(bArr, i2, i3));
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return e(a2) + a2;
    }

    public static b a(byte[] bArr, int i2, int i3) {
        return new b(bArr, 0, i3);
    }

    private final void a(long j2) {
        while ((-128 & j2) != 0) {
            c((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        c((int) j2);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i5 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i6 = remaining + arrayOffset;
                    while (i5 < length) {
                        int i7 = i5 + arrayOffset;
                        if (i7 >= i6 || (charAt = charSequence.charAt(i5)) >= 128) {
                            break;
                        }
                        array[i7] = (byte) charAt;
                        i5++;
                    }
                    if (i5 == length) {
                        i3 = arrayOffset + length;
                    } else {
                        i3 = arrayOffset + i5;
                        while (i5 < length) {
                            char charAt2 = charSequence.charAt(i5);
                            if (charAt2 < 128 && i3 < i6) {
                                i4 = i3 + 1;
                                array[i3] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i3 <= i6 - 2) {
                                int i8 = i3 + 1;
                                array[i3] = (byte) ((charAt2 >>> 6) | 960);
                                i3 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                                i5++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i3 <= i6 - 3) {
                                int i9 = i3 + 1;
                                array[i3] = (byte) ((charAt2 >>> '\f') | 480);
                                int i10 = i9 + 1;
                                array[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i4 = i10 + 1;
                                array[i10] = (byte) ((charAt2 & '?') | 128);
                            } else if (i3 <= i6 - 4) {
                                int i11 = i5 + 1;
                                if (i11 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i12 = i3 + 1;
                                        array[i3] = (byte) ((codePoint >>> 18) | 240);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i14 = i13 + 1;
                                        array[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i3 = i14 + 1;
                                        array[i14] = (byte) ((codePoint & 63) | 128);
                                        i5 = i11;
                                        i5++;
                                    } else {
                                        i5 = i11;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i5 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i3);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i3 = i4;
                            i5++;
                        }
                    }
                    byteBuffer.position(i3 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e2) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e2);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i5 < length2) {
                    char charAt4 = charSequence.charAt(i5);
                    char c2 = charAt4;
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i2 = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> '\f') | 480));
                            i2 = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i15 = i5 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i5 = i15;
                                    i5++;
                                } else {
                                    i5 = i15;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i5 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i2);
                        c2 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put(c2 == 1 ? (byte) 1 : 0);
                    i5++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int b(int i2) {
        if (i2 >= 0) {
            return e(i2);
        }
        return 10;
    }

    public static int b(int i2, j jVar) {
        int d2 = d(i2);
        int d3 = jVar.d();
        return d2 + e(d3) + d3;
    }

    public static int b(int i2, String str) {
        return d(i2) + a(str);
    }

    public static int b(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static b b(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static int c(int i2, int i3) {
        return d(i2) + b(i3);
    }

    public static int c(int i2, long j2) {
        return d(i2) + b(j2);
    }

    private final void c(int i2) {
        byte b2 = (byte) i2;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public static int d(int i2) {
        return e(i2 << 3);
    }

    public static int e(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public final void a() {
        if (this.a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.a.remaining())));
        }
    }

    public final void a(int i2) {
        while ((i2 & -128) != 0) {
            c((i2 & 127) | 128);
            i2 >>>= 7;
        }
        c(i2);
    }

    public final void a(int i2, double d2) {
        b(i2, 1);
        long doubleToLongBits = Double.doubleToLongBits(d2);
        if (this.a.remaining() >= 8) {
            this.a.putLong(doubleToLongBits);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public final void a(int i2, float f2) {
        b(i2, 5);
        int floatToIntBits = Float.floatToIntBits(f2);
        if (this.a.remaining() >= 4) {
            this.a.putInt(floatToIntBits);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public final void a(int i2, int i3) {
        b(i2, 0);
        if (i3 >= 0) {
            a(i3);
        } else {
            a((long) i3);
        }
    }

    public final void a(int i2, long j2) {
        b(i2, 0);
        a(j2);
    }

    public final void a(int i2, j jVar) {
        b(i2, 2);
        a(jVar);
    }

    public final void a(int i2, String str) {
        b(i2, 2);
        try {
            int e2 = e(str.length());
            if (e2 == e(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= e2) {
                    this.a.position(position + e2);
                    a(str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    a((position2 - position) - e2);
                    this.a.position(position2);
                    return;
                }
                throw new c(position + e2, this.a.limit());
            }
            a(a((CharSequence) str));
            a(str, this.a);
        } catch (BufferOverflowException e3) {
            c cVar = new c(this.a.position(), this.a.limit());
            cVar.initCause(e3);
            throw cVar;
        }
    }

    public final void a(int i2, boolean z) {
        b(i2, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public final void a(j jVar) {
        a(jVar.c());
        jVar.a(this);
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new c(this.a.position(), this.a.limit());
    }

    public final void b(int i2, int i3) {
        a((i2 << 3) | i3);
    }

    public final void b(int i2, long j2) {
        b(i2, 0);
        a(j2);
    }
}
