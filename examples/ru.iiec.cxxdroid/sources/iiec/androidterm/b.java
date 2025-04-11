package iiec.androidterm;

import android.annotation.TargetApi;
import android.os.ParcelFileDescriptor;

/* access modifiers changed from: package-private */
@TargetApi(12)
public class b {
    static int a(ParcelFileDescriptor parcelFileDescriptor) {
        return parcelFileDescriptor.getFd();
    }
}
