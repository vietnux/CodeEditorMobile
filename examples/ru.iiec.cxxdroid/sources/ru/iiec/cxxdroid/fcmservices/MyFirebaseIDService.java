package ru.iiec.cxxdroid.fcmservices;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIDService extends FirebaseInstanceIdService {
    @Override // com.google.firebase.iid.FirebaseInstanceIdService
    public void a() {
        super.a();
        Log.d("FCM", "onTokenRefresh");
    }
}
