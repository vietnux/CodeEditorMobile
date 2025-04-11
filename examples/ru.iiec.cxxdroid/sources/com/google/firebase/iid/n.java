package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import c.e.g;
import com.google.firebase.iid.b0;
import e.b.b.a.e.h;
import e.b.b.a.e.j;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class n {

    /* renamed from: g  reason: collision with root package name */
    private static int f6632g;

    /* renamed from: h  reason: collision with root package name */
    private static PendingIntent f6633h;
    private final g<String, h<Bundle>> a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private final Context f6634b;

    /* renamed from: c  reason: collision with root package name */
    private final g f6635c;

    /* renamed from: d  reason: collision with root package name */
    private Messenger f6636d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f6637e;

    /* renamed from: f  reason: collision with root package name */
    private b0 f6638f;

    public n(Context context, g gVar) {
        this.f6634b = context;
        this.f6635c = gVar;
        this.f6636d = new Messenger(new o(this, Looper.getMainLooper()));
    }

    private static synchronized String a() {
        String num;
        synchronized (n.class) {
            int i2 = f6632g;
            f6632g = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (n.class) {
            if (f6633h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6633h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f6633h);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Message message) {
        String concat;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new b0.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof b0) {
                        this.f6638f = (b0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f6637e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            concat = sb.toString();
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf2 = String.valueOf(stringExtra2);
                                Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                            }
                            if (stringExtra2.startsWith("|")) {
                                String[] split = stringExtra2.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    String valueOf3 = String.valueOf(stringExtra2);
                                    concat = valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response ");
                                } else {
                                    String str = split[2];
                                    String str2 = split[3];
                                    if (str2.startsWith(":")) {
                                        str2 = str2.substring(1);
                                    }
                                    a(str, intent2.putExtra("error", str2).getExtras());
                                    return;
                                }
                            } else {
                                synchronized (this.a) {
                                    for (int i2 = 0; i2 < this.a.size(); i2++) {
                                        a(this.a.b(i2), intent2.getExtras());
                                    }
                                }
                                return;
                            }
                        }
                        Log.w("FirebaseInstanceId", concat);
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        a(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.a) {
            h<Bundle> remove = this.a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.a(bundle);
        }
    }

    private final Bundle b(Bundle bundle) {
        Bundle c2 = c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey("google.messenger")) {
            return c3;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle c(android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n.c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        if (this.f6635c.a() < 12000000) {
            return b(bundle);
        }
        try {
            return (Bundle) j.a((e.b.b.a.e.g) l0.a(this.f6634b).b(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e2.getCause() instanceof e) || ((e) e2.getCause()).b() != 4) {
                return null;
            }
            return b(bundle);
        }
    }
}
