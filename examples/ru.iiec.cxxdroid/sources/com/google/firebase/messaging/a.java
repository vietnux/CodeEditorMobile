package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f6680b;
    private final FirebaseInstanceId a;

    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    private a(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f6680b == null) {
                f6680b = new a(FirebaseInstanceId.i());
            }
            aVar = f6680b;
        }
        return aVar;
    }

    public void a(boolean z) {
        this.a.b(z);
    }
}
