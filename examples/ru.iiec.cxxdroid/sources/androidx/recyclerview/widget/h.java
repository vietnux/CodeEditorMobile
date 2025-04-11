package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* access modifiers changed from: package-private */
public class h {
    final a a;

    /* access modifiers changed from: package-private */
    public interface a {
        a.b a(int i2, int i3, int i4, Object obj);

        void a(a.b bVar);
    }

    h(a aVar) {
        this.a = aVar;
    }

    private void a(List<a.b> list, int i2, int i3) {
        a.b bVar = list.get(i2);
        a.b bVar2 = list.get(i3);
        int i4 = bVar2.a;
        if (i4 == 1) {
            c(list, i2, bVar, i3, bVar2);
        } else if (i4 == 2) {
            a(list, i2, bVar, i3, bVar2);
        } else if (i4 == 4) {
            b(list, i2, bVar, i3, bVar2);
        }
    }

    private int b(List<a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i2, a.b bVar, int i3, a.b bVar2) {
        int i4 = bVar.f1636d < bVar2.f1634b ? -1 : 0;
        if (bVar.f1634b < bVar2.f1634b) {
            i4++;
        }
        int i5 = bVar2.f1634b;
        int i6 = bVar.f1634b;
        if (i5 <= i6) {
            bVar.f1634b = i6 + bVar2.f1636d;
        }
        int i7 = bVar2.f1634b;
        int i8 = bVar.f1636d;
        if (i7 <= i8) {
            bVar.f1636d = i8 + bVar2.f1636d;
        }
        bVar2.f1634b += i4;
        list.set(i2, bVar2);
        list.set(i3, bVar);
    }

    /* access modifiers changed from: package-private */
    public void a(List<a.b> list) {
        while (true) {
            int b2 = b(list);
            if (b2 != -1) {
                a(list, b2, b2 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r0 > r14.f1634b) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        if (r0 >= r14.f1634b) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f1636d
            int r1 = r13.f1634b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f1634b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f1636d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f1636d = r5
            androidx.recyclerview.widget.h$a r0 = r8.a
            int r1 = r11.f1634b
            java.lang.Object r5 = r13.f1635c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f1634b
            int r5 = r13.f1634b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f1634b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f1636d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r3 = r8.a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f1635c
            androidx.recyclerview.widget.a$b r3 = r3.a(r2, r1, r5, r4)
            int r1 = r13.f1636d
            int r1 = r1 - r5
            r13.f1636d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f1636d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
