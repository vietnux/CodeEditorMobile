package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class e {
    private Random a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f95b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f96c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, c> f97d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f98e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, b<?>> f99f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f100g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f101h = new Bundle();

    /* access modifiers changed from: package-private */
    public class a extends d<I> {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.h.a f103c;

        a(String str, int i2, androidx.activity.result.h.a aVar) {
            this.a = str;
            this.f102b = i2;
            this.f103c = aVar;
        }

        @Override // androidx.activity.result.d
        public void a() {
            e.this.a(this.a);
        }

        @Override // androidx.activity.result.d
        public void a(I i2, androidx.core.app.b bVar) {
            e.this.f98e.add(this.a);
            Integer num = e.this.f96c.get(this.a);
            e.this.a(num != null ? num.intValue() : this.f102b, this.f103c, i2, bVar);
        }
    }

    /* access modifiers changed from: private */
    public static class b<O> {
        final b<O> a;

        /* renamed from: b  reason: collision with root package name */
        final androidx.activity.result.h.a<?, O> f105b;

        b(b<O> bVar, androidx.activity.result.h.a<?, O> aVar) {
            this.a = bVar;
            this.f105b = aVar;
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        final f a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<g> f106b;

        /* access modifiers changed from: package-private */
        public void a() {
            Iterator<g> it = this.f106b.iterator();
            while (it.hasNext()) {
                this.a.b(it.next());
            }
            this.f106b.clear();
        }
    }

    private int a() {
        int nextInt = this.a.nextInt(2147418112);
        while (true) {
            int i2 = nextInt + 65536;
            if (!this.f95b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            nextInt = this.a.nextInt(2147418112);
        }
    }

    private void a(int i2, String str) {
        this.f95b.put(Integer.valueOf(i2), str);
        this.f96c.put(str, Integer.valueOf(i2));
    }

    private <O> void a(String str, int i2, Intent intent, b<O> bVar) {
        b<O> bVar2;
        if (bVar == null || (bVar2 = bVar.a) == null) {
            this.f100g.remove(str);
            this.f101h.putParcelable(str, new a(i2, intent));
            return;
        }
        bVar2.a(bVar.f105b.a(i2, intent));
    }

    private int b(String str) {
        Integer num = this.f96c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int a2 = a();
        a(a2, str);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: androidx.activity.result.b<O> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> d<I> a(String str, androidx.activity.result.h.a<I, O> aVar, b<O> bVar) {
        int b2 = b(str);
        this.f99f.put(str, new b<>(bVar, aVar));
        if (this.f100g.containsKey(str)) {
            Object obj = this.f100g.get(str);
            this.f100g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f101h.getParcelable(str);
        if (aVar2 != null) {
            this.f101h.remove(str);
            bVar.a(aVar.a(aVar2.b(), aVar2.a()));
        }
        return new a(str, b2, aVar);
    }

    public abstract <I, O> void a(int i2, androidx.activity.result.h.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i3, androidx.core.app.b bVar);

    public final void a(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                this.f98e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f101h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                    String str = stringArrayList.get(i2);
                    if (this.f96c.containsKey(str)) {
                        Integer remove = this.f96c.remove(str);
                        if (!this.f101h.containsKey(str)) {
                            this.f95b.remove(remove);
                        }
                    }
                    a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        Integer remove;
        if (!this.f98e.contains(str) && (remove = this.f96c.remove(str)) != null) {
            this.f95b.remove(remove);
        }
        this.f99f.remove(str);
        if (this.f100g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f100g.get(str));
            this.f100g.remove(str);
        }
        if (this.f101h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f101h.getParcelable(str));
            this.f101h.remove(str);
        }
        c cVar = this.f97d.get(str);
        if (cVar != null) {
            cVar.a();
            this.f97d.remove(str);
        }
    }

    public final boolean a(int i2, int i3, Intent intent) {
        String str = this.f95b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f98e.remove(str);
        a(str, i3, intent, this.f99f.get(str));
        return true;
    }

    public final <O> boolean a(int i2, @SuppressLint({"UnknownNullness"}) O o) {
        b<O> bVar;
        String str = this.f95b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f98e.remove(str);
        b<?> bVar2 = this.f99f.get(str);
        if (bVar2 == null || (bVar = bVar2.a) == null) {
            this.f101h.remove(str);
            this.f100g.put(str, o);
            return true;
        }
        bVar.a(o);
        return true;
    }

    public final void b(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f96c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f96c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f98e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f101h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.a);
    }
}
