package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface b {

    public static class a {
        private int a;

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.a);
            return bundle;
        }

        public final a a(int i2) {
            this.a = 1;
            return this;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
