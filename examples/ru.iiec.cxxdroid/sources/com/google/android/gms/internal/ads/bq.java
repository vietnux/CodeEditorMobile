package com.google.android.gms.internal.ads;

final class bq {
    static int a(int i2, byte[] bArr, int i3, int i4, cq cqVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return b(bArr, i3, cqVar);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return a(bArr, i3, cqVar) + cqVar.a;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = a(bArr, i3, cqVar);
                    i7 = cqVar.a;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = a(i7, bArr, i3, i4, cqVar);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw sr.h();
            } else if (i5 == 5) {
                return i3 + 4;
            } else {
                throw sr.e();
            }
        } else {
            throw sr.e();
        }
    }

    static int a(int i2, byte[] bArr, int i3, int i4, eu euVar, cq cqVar) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int b2 = b(bArr, i3, cqVar);
                euVar.a(i2, Long.valueOf(cqVar.f4042b));
                return b2;
            } else if (i5 == 1) {
                euVar.a(i2, Long.valueOf(b(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int a = a(bArr, i3, cqVar);
                int i6 = cqVar.a;
                euVar.a(i2, i6 == 0 ? fq.f4347c : fq.a(bArr, a, i6));
                return a + i6;
            } else if (i5 == 3) {
                eu e2 = eu.e();
                int i7 = (i2 & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int a2 = a(bArr, i3, cqVar);
                    int i9 = cqVar.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = a2;
                        break;
                    }
                    int a3 = a(i8, bArr, a2, i4, e2, cqVar);
                    i8 = i9;
                    i3 = a3;
                }
                if (i3 > i4 || i8 != i7) {
                    throw sr.h();
                }
                euVar.a(i2, e2);
                return i3;
            } else if (i5 == 5) {
                euVar.a(i2, Integer.valueOf(a(bArr, i3)));
                return i3 + 4;
            } else {
                throw sr.e();
            }
        } else {
            throw sr.e();
        }
    }

    static int a(int i2, byte[] bArr, int i3, int i4, rr<?> rrVar, cq cqVar) {
        nr nrVar = (nr) rrVar;
        int a = a(bArr, i3, cqVar);
        while (true) {
            nrVar.d(cqVar.a);
            if (a >= i4) {
                break;
            }
            int a2 = a(bArr, a, cqVar);
            if (i2 != cqVar.a) {
                break;
            }
            a = a(bArr, a2, cqVar);
        }
        return a;
    }

    static int a(int i2, byte[] bArr, int i3, cq cqVar) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i5 = b2 << 7;
        } else {
            int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i4 = b3 << 14;
            } else {
                i6 = i8 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i5 = b4 << 21;
                } else {
                    i8 = i6 | ((b4 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i4 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                cqVar.a = i10;
                                return i11;
                            }
                            i9 = i11;
                        }
                    }
                }
            }
            cqVar.a = i8 | i4;
            return i9;
        }
        cqVar.a = i6 | i5;
        return i7;
    }

    static int a(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i2, cq cqVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return a(b2, bArr, i3, cqVar);
        }
        cqVar.a = b2;
        return i3;
    }

    static int a(byte[] bArr, int i2, rr<?> rrVar, cq cqVar) {
        nr nrVar = (nr) rrVar;
        int a = a(bArr, i2, cqVar);
        int i3 = cqVar.a + a;
        while (a < i3) {
            a = a(bArr, a, cqVar);
            nrVar.d(cqVar.a);
        }
        if (a == i3) {
            return a;
        }
        throw sr.b();
    }

    static int b(byte[] bArr, int i2, cq cqVar) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            cqVar.f4042b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
            b2 = b3;
            i4 = i6;
        }
        cqVar.f4042b = j3;
        return i4;
    }

    static long b(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i2) {
        return Double.longBitsToDouble(b(bArr, i2));
    }

    static int c(byte[] bArr, int i2, cq cqVar) {
        int a = a(bArr, i2, cqVar);
        int i3 = cqVar.a;
        if (i3 == 0) {
            cqVar.f4043c = "";
            return a;
        }
        cqVar.f4043c = new String(bArr, a, i3, or.a);
        return a + i3;
    }

    static float d(byte[] bArr, int i2) {
        return Float.intBitsToFloat(a(bArr, i2));
    }

    static int d(byte[] bArr, int i2, cq cqVar) {
        int a = a(bArr, i2, cqVar);
        int i3 = cqVar.a;
        if (i3 == 0) {
            cqVar.f4043c = "";
            return a;
        }
        int i4 = a + i3;
        if (lu.a(bArr, a, i4)) {
            cqVar.f4043c = new String(bArr, a, i3, or.a);
            return i4;
        }
        throw sr.i();
    }

    static int e(byte[] bArr, int i2, cq cqVar) {
        int a = a(bArr, i2, cqVar);
        int i3 = cqVar.a;
        if (i3 == 0) {
            cqVar.f4043c = fq.f4347c;
            return a;
        }
        cqVar.f4043c = fq.a(bArr, a, i3);
        return a + i3;
    }
}
