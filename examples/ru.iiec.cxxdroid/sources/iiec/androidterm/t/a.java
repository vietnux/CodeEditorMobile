package iiec.androidterm.t;

import iiec.androidterm.r.m;
import iiec.androidterm.r.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class a extends ArrayList<m> {

    /* renamed from: b  reason: collision with root package name */
    LinkedList<s> f9445b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    LinkedList<s> f9446c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    s f9447d = new C0149a();

    /* renamed from: iiec.androidterm.t.a$a  reason: collision with other inner class name */
    class C0149a implements s {
        C0149a() {
        }

        @Override // iiec.androidterm.r.s
        public void b() {
            a.this.c();
        }
    }

    private void b() {
        Iterator<s> it = this.f9445b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        Iterator<s> it = this.f9446c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* renamed from: a */
    public void add(int i2, m mVar) {
        super.add(i2, mVar);
        mVar.a(this.f9447d);
        b();
    }

    public void a(s sVar) {
        this.f9445b.add(sVar);
        sVar.b();
    }

    /* renamed from: a */
    public boolean add(m mVar) {
        boolean add = super.add(mVar);
        mVar.a(this.f9447d);
        b();
        return add;
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public boolean addAll(int i2, Collection<? extends m> collection) {
        boolean addAll = super.addAll(i2, collection);
        for (m mVar : collection) {
            mVar.a(this.f9447d);
        }
        b();
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.ArrayList
    public boolean addAll(Collection<? extends m> collection) {
        boolean addAll = super.addAll(collection);
        for (m mVar : collection) {
            mVar.a(this.f9447d);
        }
        b();
        return addAll;
    }

    /* renamed from: b */
    public m set(int i2, m mVar) {
        m mVar2 = (m) super.set(i2, mVar);
        mVar.a(this.f9447d);
        if (mVar2 != null) {
            mVar2.a((s) null);
        }
        b();
        return mVar2;
    }

    public void b(s sVar) {
        this.f9446c.add(sVar);
        sVar.b();
    }

    public boolean c(s sVar) {
        return this.f9445b.remove(sVar);
    }

    public void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((m) it.next()).a((s) null);
        }
        super.clear();
        b();
    }

    public boolean d(s sVar) {
        return this.f9446c.remove(sVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public m remove(int i2) {
        m mVar = (m) super.remove(i2);
        if (mVar != null) {
            mVar.a((s) null);
            b();
        }
        return mVar;
    }

    @Override // java.util.List, java.util.ArrayList
    public boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        if (remove && (obj instanceof m)) {
            ((m) obj).a((s) null);
            b();
        }
        return remove;
    }
}
