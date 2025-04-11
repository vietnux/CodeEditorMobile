package e.b.c.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import e.b.b.a.c.c.i;
import e.b.b.a.c.c.j;
import e.b.b.a.c.c.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class a {
    private AppMeasurement a;

    /* renamed from: b  reason: collision with root package name */
    private String f7877b;

    /* renamed from: c  reason: collision with root package name */
    private int f7878c;

    /* renamed from: d  reason: collision with root package name */
    private long f7879d;

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f7880e;

    /* renamed from: f  reason: collision with root package name */
    private String f7881f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f7882g = null;

    public a(Context context, String str, int i2) {
        this.a = AppMeasurement.getInstance(context);
        this.f7877b = str;
        this.f7878c = i2;
        this.f7880e = context.getSharedPreferences("com.google.firebase.abt", 0);
        this.f7881f = String.format("%s_lastKnownExperimentStartTime", str);
        this.f7879d = this.f7880e.getLong(this.f7881f, 0);
    }

    private static o a(byte[] bArr) {
        try {
            o oVar = new o();
            j.a(oVar, bArr, 0, bArr.length);
            return oVar;
        } catch (i e2) {
            Log.e("FirebaseABTesting", "Payload was not defined or could not be deserialized.", e2);
            return null;
        }
    }

    private final void a(String str) {
        this.a.clearConditionalUserProperty(str, null, null);
    }

    private final void a(Collection<AppMeasurement.ConditionalUserProperty> collection) {
        for (AppMeasurement.ConditionalUserProperty conditionalUserProperty : collection) {
            a(conditionalUserProperty.mName);
        }
    }

    private final boolean a(o oVar) {
        int i2 = oVar.f7134h;
        int i3 = this.f7878c;
        if (i2 == 0) {
            i2 = i3 != 0 ? i3 : 1;
        }
        if (i2 == 1) {
            return true;
        }
        if (Log.isLoggable("FirebaseABTesting", 3)) {
            Log.d("FirebaseABTesting", String.format("Experiment won't be set due to the overflow policy: [%s, %s]", oVar.f7128b, oVar.f7129c));
        }
        return false;
    }

    private final AppMeasurement.ConditionalUserProperty b(o oVar) {
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mOrigin = this.f7877b;
        conditionalUserProperty.mCreationTimestamp = oVar.f7130d;
        conditionalUserProperty.mName = oVar.f7128b;
        conditionalUserProperty.mValue = oVar.f7129c;
        conditionalUserProperty.mTriggerEventName = TextUtils.isEmpty(oVar.f7131e) ? null : oVar.f7131e;
        conditionalUserProperty.mTriggerTimeout = oVar.f7132f;
        conditionalUserProperty.mTimeToLive = oVar.f7133g;
        return conditionalUserProperty;
    }

    private final void b() {
        if (this.f7880e.getLong(this.f7881f, 0) != this.f7879d) {
            SharedPreferences.Editor edit = this.f7880e.edit();
            edit.putLong(this.f7881f, this.f7879d);
            edit.apply();
        }
    }

    private final List<AppMeasurement.ConditionalUserProperty> c() {
        return this.a.getConditionalUserProperties(this.f7877b, "");
    }

    private final int d() {
        if (this.f7882g == null) {
            this.f7882g = Integer.valueOf(this.a.getMaxUserProperties(this.f7877b));
        }
        return this.f7882g.intValue();
    }

    public void a() {
        a(c());
    }

    public void a(List<byte[]> list) {
        String str;
        if (list == null) {
            str = "Cannot replace experiments because experimentPayloads is null.";
        } else if (list.isEmpty()) {
            a();
            return;
        } else {
            ArrayList arrayList = new ArrayList();
            for (byte[] bArr : list) {
                o a2 = a(bArr);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.isEmpty()) {
                str = "All payloads are either not defined or cannot not be deserialized.";
            } else {
                HashSet hashSet = new HashSet();
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    hashSet.add(((o) obj).f7128b);
                }
                List<AppMeasurement.ConditionalUserProperty> c2 = c();
                HashSet hashSet2 = new HashSet();
                for (AppMeasurement.ConditionalUserProperty conditionalUserProperty : c2) {
                    hashSet2.add(conditionalUserProperty.mName);
                }
                ArrayList arrayList2 = new ArrayList();
                for (AppMeasurement.ConditionalUserProperty conditionalUserProperty2 : c2) {
                    if (!hashSet.contains(conditionalUserProperty2.mName)) {
                        arrayList2.add(conditionalUserProperty2);
                    }
                }
                a((Collection<AppMeasurement.ConditionalUserProperty>) arrayList2);
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    o oVar = (o) obj2;
                    if (!hashSet2.contains(oVar.f7128b)) {
                        boolean z = true;
                        if (oVar.f7130d <= this.f7879d) {
                            if (Log.isLoggable("FirebaseABTesting", 3)) {
                                Log.d("FirebaseABTesting", String.format("The experiment [%s, %s, %d] is not new since its startTime is before lastKnownStartTime: %d", oVar.f7128b, oVar.f7129c, Long.valueOf(oVar.f7130d), Long.valueOf(this.f7879d)));
                            }
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(oVar);
                        }
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(c());
                int d2 = d();
                int size3 = arrayList3.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList3.get(i5);
                    i5++;
                    o oVar2 = (o) obj3;
                    if (arrayDeque.size() >= d2) {
                        if (a(oVar2)) {
                            while (arrayDeque.size() >= d2) {
                                a(((AppMeasurement.ConditionalUserProperty) arrayDeque.pollFirst()).mName);
                            }
                        }
                    }
                    AppMeasurement.ConditionalUserProperty b2 = b(oVar2);
                    this.a.setConditionalUserProperty(b2);
                    arrayDeque.offer(b2);
                }
                int size4 = arrayList.size();
                while (i2 < size4) {
                    Object obj4 = arrayList.get(i2);
                    i2++;
                    this.f7879d = Math.max(this.f7879d, ((o) obj4).f7130d);
                }
                b();
                return;
            }
        }
        Log.e("FirebaseABTesting", str);
    }
}
