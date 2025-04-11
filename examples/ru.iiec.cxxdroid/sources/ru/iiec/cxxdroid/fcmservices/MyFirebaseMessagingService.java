package ru.iiec.cxxdroid.fcmservices;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.c;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void a(c cVar) {
        super.a(cVar);
    }

    public void onCreate() {
        super.onCreate();
        Log.d("FCM", "onCreate");
    }
}
