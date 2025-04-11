package g.p;

import g.r.d.i;
import java.lang.reflect.Method;

public class a {

    /* access modifiers changed from: private */
    /* renamed from: g.p.a$a  reason: collision with other inner class name */
    public static final class C0131a {
        public static final Method a;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0043 A[LOOP:0: B:1:0x0013->B:10:0x0043, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[EDGE_INSN: B:17:0x0047->B:12:0x0047 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                g.p.a$a r0 = new g.p.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                g.r.d.i.b(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0013:
                java.lang.String r5 = "it"
                if (r4 >= r2) goto L_0x0046
                r6 = r1[r4]
                g.r.d.i.b(r6, r5)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = g.r.d.i.a(r7, r8)
                if (r7 == 0) goto L_0x003f
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                g.r.d.i.b(r7, r8)
                java.lang.Object r7 = g.o.a.d(r7)
                java.lang.Class r7 = (java.lang.Class) r7
                boolean r7 = g.r.d.i.a(r7, r0)
                if (r7 == 0) goto L_0x003f
                r7 = 1
                goto L_0x0040
            L_0x003f:
                r7 = 0
            L_0x0040:
                if (r7 == 0) goto L_0x0043
                goto L_0x0047
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0046:
                r6 = 0
            L_0x0047:
                g.p.a.C0131a.a = r6
                int r0 = r1.length
            L_0x004a:
                if (r3 >= r0) goto L_0x0061
                r2 = r1[r3]
                g.r.d.i.b(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = g.r.d.i.a(r2, r4)
                if (r2 == 0) goto L_0x005e
                goto L_0x0061
            L_0x005e:
                int r3 = r3 + 1
                goto L_0x004a
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.p.a.C0131a.<clinit>():void");
        }

        private C0131a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.c(th, "cause");
        i.c(th2, "exception");
        Method method = C0131a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
