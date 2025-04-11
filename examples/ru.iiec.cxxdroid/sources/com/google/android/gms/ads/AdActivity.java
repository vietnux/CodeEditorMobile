package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.r;
import e.b.b.a.b.b;

public class AdActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    private r f3100b;

    private final void a() {
        r rVar = this.f3100b;
        if (rVar != null) {
            try {
                rVar.S0();
            } catch (RemoteException e2) {
                qc.d("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        try {
            this.f3100b.a(i2, i3, intent);
        } catch (Exception e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f3100b != null) {
                z = this.f3100b.G0();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f3100b.i(b.a(configuration));
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3100b = a50.c().a(this);
        r rVar = this.f3100b;
        if (rVar == null) {
            e = null;
        } else {
            try {
                rVar.i(bundle);
                return;
            } catch (RemoteException e2) {
                e = e2;
            }
        }
        qc.d("#007 Could not call remote method.", e);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f3100b != null) {
                this.f3100b.onDestroy();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f3100b != null) {
                this.f3100b.onPause();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f3100b != null) {
                this.f3100b.e1();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f3100b != null) {
                this.f3100b.onResume();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f3100b != null) {
                this.f3100b.h(bundle);
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f3100b != null) {
                this.f3100b.u0();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f3100b != null) {
                this.f3100b.V0();
            }
        } catch (RemoteException e2) {
            qc.d("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        super.setContentView(i2);
        a();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
