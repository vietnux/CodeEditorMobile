package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.up;
import com.google.android.gms.internal.ads.vp;

public abstract class vp<MessageType extends up<MessageType, BuilderType>, BuilderType extends vp<MessageType, BuilderType>> implements ts {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.vp<MessageType extends com.google.android.gms.internal.ads.up<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.vp<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ts
    public final /* synthetic */ ts a(ss ssVar) {
        if (a().getClass().isInstance(ssVar)) {
            a((up) ssVar);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);
}
