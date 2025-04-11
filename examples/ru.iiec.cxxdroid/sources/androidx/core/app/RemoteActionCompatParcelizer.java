package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aVar.a(remoteActionCompat.a, 1);
        remoteActionCompat.f988b = aVar.a(remoteActionCompat.f988b, 2);
        remoteActionCompat.f989c = aVar.a(remoteActionCompat.f989c, 3);
        remoteActionCompat.f990d = (PendingIntent) aVar.a(remoteActionCompat.f990d, 4);
        remoteActionCompat.f991e = aVar.a(remoteActionCompat.f991e, 5);
        remoteActionCompat.f992f = aVar.a(remoteActionCompat.f992f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.a(false, false);
        aVar.b(remoteActionCompat.a, 1);
        aVar.b(remoteActionCompat.f988b, 2);
        aVar.b(remoteActionCompat.f989c, 3);
        aVar.b(remoteActionCompat.f990d, 4);
        aVar.b(remoteActionCompat.f991e, 5);
        aVar.b(remoteActionCompat.f992f, 6);
    }
}
