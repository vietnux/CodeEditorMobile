package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import c.h.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class j implements h {
    private final Notification.Builder a;

    /* renamed from: b  reason: collision with root package name */
    private final i.d f1046b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteViews f1047c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f1048d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f1049e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f1050f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private int f1051g;

    /* renamed from: h  reason: collision with root package name */
    private RemoteViews f1052h;

    j(i.d dVar) {
        Icon icon;
        List<String> a2;
        String str;
        Bundle bundle;
        this.f1046b = dVar;
        Context context = dVar.a;
        this.a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(context, dVar.K) : new Notification.Builder(context);
        Notification notification = dVar.S;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1038i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1034e).setContentText(dVar.f1035f).setContentInfo(dVar.f1040k).setContentIntent(dVar.f1036g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1037h, (notification.flags & 128) != 0).setLargeIcon(dVar.f1039j).setNumber(dVar.f1041l).setProgress(dVar.t, dVar.u, dVar.v);
        if (Build.VERSION.SDK_INT < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.a.setSubText(dVar.q).setUsesChronometer(dVar.o).setPriority(dVar.f1042m);
            Iterator<i.a> it = dVar.f1031b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = dVar.D;
            if (bundle2 != null) {
                this.f1050f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.z) {
                    this.f1050f.putBoolean("android.support.localOnly", true);
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f1050f.putString("android.support.groupKey", str2);
                    if (dVar.x) {
                        bundle = this.f1050f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1050f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = dVar.y;
                if (str3 != null) {
                    this.f1050f.putString("android.support.sortKey", str3);
                }
            }
            this.f1047c = dVar.H;
            this.f1048d = dVar.I;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.a.setShowWhen(dVar.n);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19 && i2 < 21 && (a2 = a(a(dVar.f1032c), dVar.V)) != null && !a2.isEmpty()) {
            this.f1050f.putStringArray("android.people", (String[]) a2.toArray(new String[a2.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.a.setLocalOnly(dVar.z).setGroup(dVar.w).setGroupSummary(dVar.x).setSortKey(dVar.y);
            this.f1051g = dVar.P;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.setCategory(dVar.C).setColor(dVar.E).setVisibility(dVar.F).setPublicVersion(dVar.G).setSound(notification.sound, notification.audioAttributes);
            List<String> a3 = Build.VERSION.SDK_INT < 28 ? a(a(dVar.f1032c), dVar.V) : dVar.V;
            if (a3 != null && !a3.isEmpty()) {
                for (String str4 : a3) {
                    this.a.addPerson(str4);
                }
            }
            this.f1052h = dVar.J;
            if (dVar.f1033d.size() > 0) {
                Bundle bundle3 = dVar.b().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < dVar.f1033d.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), k.a(dVar.f1033d.get(i3)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.b().putBundle("android.car.EXTENSIONS", bundle3);
                this.f1050f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && (icon = dVar.U) != null) {
            this.a.setSmallIcon(icon);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(dVar.D).setRemoteInputHistory(dVar.s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(dVar.L).setSettingsText(dVar.r).setShortcutId(dVar.M).setTimeoutAfter(dVar.O).setGroupAlertBehavior(dVar.P);
            if (dVar.B) {
                this.a.setColorized(dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<l> it2 = dVar.f1032c.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next().h());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(dVar.Q);
            this.a.setBubbleMetadata(i.c.a(dVar.R));
            b bVar = dVar.N;
            if (bVar != null) {
                bVar.a();
                throw null;
            }
        }
        if (dVar.T) {
            if (this.f1046b.x) {
                this.f1051g = 2;
            } else {
                this.f1051g = 1;
            }
            this.a.setVibrate(null);
            this.a.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.a.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f1046b.w)) {
                    this.a.setGroup("silent");
                }
                this.a.setGroupAlertBehavior(this.f1051g);
            }
        }
    }

    private static List<String> a(List<l> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (l lVar : list) {
            arrayList.add(lVar.g());
        }
        return arrayList;
    }

    private static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c.e.b bVar = new c.e.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void a(i.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            IconCompat e2 = aVar.e();
            Notification.Action.Builder builder = Build.VERSION.SDK_INT >= 23 ? new Notification.Action.Builder(e2 != null ? e2.e() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(e2 != null ? e2.a() : 0, aVar.i(), aVar.a());
            if (aVar.f() != null) {
                for (RemoteInput remoteInput : m.a(aVar.f())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.g());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        } else if (i2 >= 16) {
            this.f1049e.add(k.a(this.a, aVar));
        }
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.a;
    }

    public Notification b() {
        Bundle a2;
        RemoteViews d2;
        RemoteViews b2;
        i.e eVar = this.f1046b.p;
        if (eVar != null) {
            eVar.a(this);
        }
        RemoteViews c2 = eVar != null ? eVar.c(this) : null;
        Notification c3 = c();
        if (!(c2 == null && (c2 = this.f1046b.H) == null)) {
            c3.contentView = c2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (b2 = eVar.b(this)) == null)) {
            c3.bigContentView = b2;
        }
        if (!(Build.VERSION.SDK_INT < 21 || eVar == null || (d2 = this.f1046b.p.d(this)) == null)) {
            c3.headsUpContentView = d2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || eVar == null || (a2 = i.a(c3)) == null)) {
            eVar.a(a2);
        }
        return c3;
    }

    /* access modifiers changed from: protected */
    public Notification c() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.a.build();
        }
        if (i2 >= 24) {
            Notification build = this.a.build();
            if (this.f1051g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f1051g != 2)) {
                    a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1051g == 1) {
                    a(build);
                }
            }
            return build;
        } else if (i2 >= 21) {
            this.a.setExtras(this.f1050f);
            Notification build2 = this.a.build();
            RemoteViews remoteViews = this.f1047c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1048d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1052h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1051g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f1051g != 2)) {
                    a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1051g == 1) {
                    a(build2);
                }
            }
            return build2;
        } else if (i2 >= 20) {
            this.a.setExtras(this.f1050f);
            Notification build3 = this.a.build();
            RemoteViews remoteViews4 = this.f1047c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1048d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1051g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f1051g != 2)) {
                    a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1051g == 1) {
                    a(build3);
                }
            }
            return build3;
        } else if (i2 >= 19) {
            SparseArray<Bundle> a2 = k.a(this.f1049e);
            if (a2 != null) {
                this.f1050f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.a.setExtras(this.f1050f);
            Notification build4 = this.a.build();
            RemoteViews remoteViews6 = this.f1047c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1048d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i2 < 16) {
            return this.a.getNotification();
        } else {
            Notification build5 = this.a.build();
            Bundle a3 = i.a(build5);
            Bundle bundle = new Bundle(this.f1050f);
            for (String str : this.f1050f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = k.a(this.f1049e);
            if (a4 != null) {
                i.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f1047c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f1048d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
