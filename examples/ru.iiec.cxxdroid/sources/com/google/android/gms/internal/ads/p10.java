package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@k2
public final class p10 {
    private final int a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5208b;

    /* renamed from: c  reason: collision with root package name */
    private final o10 f5209c = new t10();

    public p10(int i2) {
        this.f5208b = i2;
        this.a = 6;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        r10 r10 = new r10();
        PriorityQueue priorityQueue = new PriorityQueue(this.f5208b, new q10(this));
        for (String str2 : split) {
            String[] a2 = s10.a(str2, false);
            if (a2.length != 0) {
                v10.a(a2, this.f5208b, this.a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                r10.a(this.f5209c.a(((w10) it.next()).f5868b));
            } catch (IOException e2) {
                qc.b("Error while writing hash to byteStream", e2);
            }
        }
        return r10.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList.get(i2);
            i2++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return a(sb.toString());
    }
}
