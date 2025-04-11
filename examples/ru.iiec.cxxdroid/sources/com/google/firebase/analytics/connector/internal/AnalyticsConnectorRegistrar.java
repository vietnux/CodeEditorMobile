package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import java.util.Collections;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements e {
    @Override // com.google.firebase.components.e
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<a<?>> getComponents() {
        a.C0092a a = a.a(com.google.firebase.analytics.a.a.class);
        a.a(f.a(e.b.c.a.class));
        a.a(f.a(Context.class));
        a.a(a.a);
        return Collections.singletonList(a.b());
    }
}
