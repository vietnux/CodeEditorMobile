package c.t;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c.t.m;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends m {
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    int M;
    boolean N = false;
    private int O = 0;

    class a extends n {
        final /* synthetic */ m a;

        a(q qVar, m mVar) {
            this.a = mVar;
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            this.a.r();
            mVar.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        @Override // c.t.n, c.t.m.f
        public void a(m mVar) {
            q qVar = this.a;
            if (!qVar.N) {
                qVar.s();
                this.a.N = true;
            }
        }

        @Override // c.t.m.f
        public void d(m mVar) {
            q qVar = this.a;
            qVar.M--;
            if (qVar.M == 0) {
                qVar.N = false;
                qVar.a();
            }
            mVar.b(this);
        }
    }

    private void u() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M = this.K.size();
    }

    public m a(int i2) {
        if (i2 < 0 || i2 >= this.K.size()) {
            return null;
        }
        return this.K.get(i2);
    }

    @Override // c.t.m
    public q a(long j2) {
        super.a(j2);
        if (this.f2594d >= 0) {
            int size = this.K.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.K.get(i2).a(j2);
            }
        }
        return this;
    }

    @Override // c.t.m
    public q a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.K.get(i2).a(timeInterpolator);
            }
        }
        super.a(timeInterpolator);
        return this;
    }

    @Override // c.t.m
    public q a(View view) {
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            this.K.get(i2).a(view);
        }
        super.a(view);
        return this;
    }

    @Override // c.t.m
    public q a(m.f fVar) {
        super.a(fVar);
        return this;
    }

    public q a(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
        long j2 = this.f2594d;
        if (j2 >= 0) {
            mVar.a(j2);
        }
        if ((this.O & 1) != 0) {
            mVar.a(d());
        }
        if ((this.O & 2) != 0) {
            mVar.a(g());
        }
        if ((this.O & 4) != 0) {
            mVar.a(f());
        }
        if ((this.O & 8) != 0) {
            mVar.a(c());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // c.t.m
    public String a(String str) {
        String a2 = super.a(str);
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.K.get(i2).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    @Override // c.t.m
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long h2 = h();
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.K.get(i2);
            if (h2 > 0 && (this.L || i2 == 0)) {
                long h3 = mVar.h();
                if (h3 > 0) {
                    mVar.b(h3 + h2);
                } else {
                    mVar.b(h2);
                }
            }
            mVar.a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // c.t.m
    public void a(g gVar) {
        super.a(gVar);
        this.O |= 4;
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            this.K.get(i2).a(gVar);
        }
    }

    @Override // c.t.m
    public void a(m.e eVar) {
        super.a(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).a(eVar);
        }
    }

    @Override // c.t.m
    public void a(p pVar) {
        super.a(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).a(pVar);
        }
    }

    @Override // c.t.m
    public void a(s sVar) {
        if (b(sVar.f2616b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f2616b)) {
                    next.a(sVar);
                    sVar.f2617c.add(next);
                }
            }
        }
    }

    public q b(int i2) {
        if (i2 == 0) {
            this.L = true;
        } else if (i2 == 1) {
            this.L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    @Override // c.t.m
    public q b(long j2) {
        super.b(j2);
        return this;
    }

    @Override // c.t.m
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // c.t.m
    public void b(s sVar) {
        super.b(sVar);
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).b(sVar);
        }
    }

    @Override // c.t.m
    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).c(view);
        }
    }

    @Override // c.t.m
    public void c(s sVar) {
        if (b(sVar.f2616b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f2616b)) {
                    next.c(sVar);
                    sVar.f2617c.add(next);
                }
            }
        }
    }

    @Override // c.t.m, c.t.m, java.lang.Object
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.a(this.K.get(i2).clone());
        }
        return qVar;
    }

    @Override // c.t.m
    public q d(View view) {
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            this.K.get(i2).d(view);
        }
        super.d(view);
        return this;
    }

    @Override // c.t.m
    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).e(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // c.t.m
    public void r() {
        if (this.K.isEmpty()) {
            s();
            a();
            return;
        }
        u();
        if (!this.L) {
            for (int i2 = 1; i2 < this.K.size(); i2++) {
                this.K.get(i2 - 1).a(new a(this, this.K.get(i2)));
            }
            m mVar = this.K.get(0);
            if (mVar != null) {
                mVar.r();
                return;
            }
            return;
        }
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public int t() {
        return this.K.size();
    }
}
