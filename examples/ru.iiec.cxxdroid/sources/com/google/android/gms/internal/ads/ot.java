package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class ot extends nt<FieldDescriptorType, Object> {
    ot(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.nt
    public final void b() {
        if (!a()) {
            for (int i2 = 0; i2 < c(); i2++) {
                Map.Entry a = a(i2);
                if (((gr) a.getKey()).d()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((gr) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.b();
    }
}
