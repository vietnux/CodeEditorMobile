package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.a;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(aVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, aVar);
    }
}
