package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

@k2
public final class v10 {
    private static long a(long j2, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return j2;
        }
        return (i2 % 2 == 0 ? a((j2 * j2) % 1073807359, i2 / 2) : j2 * (a((j2 * j2) % 1073807359, i2 / 2) % 1073807359)) % 1073807359;
    }

    private static String a(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            qc.a("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 < i5) {
                sb.append(strArr[i2]);
                sb.append(' ');
                i2++;
            } else {
                sb.append(strArr[i5]);
                return sb.toString();
            }
        }
    }

    private static void a(int i2, long j2, String str, int i3, PriorityQueue<w10> priorityQueue) {
        w10 w10 = new w10(j2, str, i3);
        if ((priorityQueue.size() != i2 || (priorityQueue.peek().f5869c <= w10.f5869c && priorityQueue.peek().a <= w10.a)) && !priorityQueue.contains(w10)) {
            priorityQueue.add(w10);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i2, int i3, PriorityQueue<w10> priorityQueue) {
        if (strArr.length < i3) {
            a(i2, b(strArr, 0, strArr.length), a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long b2 = b(strArr, 0, i3);
        a(i2, b2, a(strArr, 0, i3), i3, priorityQueue);
        long a = a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr.length - i3) + 1; i4++) {
            long j2 = b2 + 1073807359;
            b2 = (((((j2 - ((((((long) s10.a(strArr[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) s10.a(strArr[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            a(i2, b2, a(strArr, i4, i3), strArr.length, priorityQueue);
        }
    }

    private static long b(String[] strArr, int i2, int i3) {
        long a = (((long) s10.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            a = (((a * 16785407) % 1073807359) + ((((long) s10.a(strArr[i4])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
