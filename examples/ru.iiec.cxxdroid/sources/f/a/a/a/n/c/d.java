package f.a.a.a.n.c;

import f.a.a.a.n.c.c;
import f.a.a.a.n.c.j;
import f.a.a.a.n.c.m;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class d<E extends c & m & j> extends PriorityBlockingQueue<E> {

    /* renamed from: b  reason: collision with root package name */
    final Queue<E> f8472b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f8473c = new ReentrantLock();

    /* access modifiers changed from: package-private */
    public E a(int i2, Long l2, TimeUnit timeUnit) {
        E b2;
        while (true) {
            b2 = b(i2, l2, timeUnit);
            if (b2 == null || a(b2)) {
                return b2;
            }
            a(i2, b2);
        }
        return b2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, E e2) {
        try {
            this.f8473c.lock();
            if (i2 == 1) {
                super.remove(e2);
            }
            return this.f8472b.offer(e2);
        } finally {
            this.f8473c.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(E e2) {
        return e2.b();
    }

    /* access modifiers changed from: package-private */
    public <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2));
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    /* access modifiers changed from: package-private */
    public E b(int i2, Long l2, TimeUnit timeUnit) {
        Object obj;
        if (i2 == 0) {
            obj = super.take();
        } else if (i2 == 1) {
            obj = super.peek();
        } else if (i2 == 2) {
            obj = super.poll();
        } else if (i2 != 3) {
            return null;
        } else {
            obj = super.poll(l2.longValue(), timeUnit);
        }
        return (E) ((c) obj);
    }

    public void b() {
        try {
            this.f8473c.lock();
            Iterator<E> it = this.f8472b.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (a(next)) {
                    super.offer(next);
                    it.remove();
                }
            }
        } finally {
            this.f8473c.unlock();
        }
    }

    public void clear() {
        try {
            this.f8473c.lock();
            this.f8472b.clear();
            super.clear();
        } finally {
            this.f8473c.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f8473c.lock();
            return super.contains(obj) || this.f8472b.contains(obj);
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.concurrent.PriorityBlockingQueue
    public int drainTo(Collection<? super E> collection) {
        try {
            this.f8473c.lock();
            int drainTo = super.drainTo(collection) + this.f8472b.size();
            while (!this.f8472b.isEmpty()) {
                collection.add(this.f8472b.poll());
            }
            return drainTo;
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.concurrent.PriorityBlockingQueue
    public int drainTo(Collection<? super E> collection, int i2) {
        try {
            this.f8473c.lock();
            int drainTo = super.drainTo(collection, i2);
            while (!this.f8472b.isEmpty() && drainTo <= i2) {
                collection.add(this.f8472b.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.Queue, java.util.concurrent.PriorityBlockingQueue
    public E peek() {
        try {
            return a(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    @Override // java.util.Queue, java.util.concurrent.PriorityBlockingQueue
    public E poll() {
        try {
            return a(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.concurrent.PriorityBlockingQueue
    public E poll(long j2, TimeUnit timeUnit) {
        return a(3, Long.valueOf(j2), timeUnit);
    }

    public boolean remove(Object obj) {
        try {
            this.f8473c.lock();
            return super.remove(obj) || this.f8472b.remove(obj);
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        try {
            this.f8473c.lock();
            return this.f8472b.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f8473c.unlock();
        }
    }

    public int size() {
        try {
            this.f8473c.lock();
            return this.f8472b.size() + super.size();
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.concurrent.PriorityBlockingQueue
    public E take() {
        return a(0, null, null);
    }

    public Object[] toArray() {
        try {
            this.f8473c.lock();
            return a(super.toArray(), this.f8472b.toArray());
        } finally {
            this.f8473c.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.PriorityBlockingQueue
    public <T> T[] toArray(T[] tArr) {
        try {
            this.f8473c.lock();
            return (T[]) a(super.toArray(tArr), this.f8472b.toArray(tArr));
        } finally {
            this.f8473c.unlock();
        }
    }
}
