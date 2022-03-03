package qwe.qweqwe.texteditor;

import android.content.Context;
import com.google.ads.consent.ConsentForm;
import com.google.ads.consent.ConsentFormListener;
import com.google.ads.consent.ConsentInfoUpdateListener;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import java.net.MalformedURLException;
import java.net.URL;

public class d0 {

    /* renamed from: c  reason: collision with root package name */
    public static String f9613c = "ConsentManager";
    private final e0 a;

    /* renamed from: b  reason: collision with root package name */
    private ConsentForm f9614b;

    /* access modifiers changed from: package-private */
    public class a implements ConsentInfoUpdateListener {
        final /* synthetic */ ConsentInformation a;

        a(ConsentInformation consentInformation) {
            this.a = consentInformation;
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public void a(ConsentStatus consentStatus) {
            String str = d0.f9613c;
            i0.c(str, "onConsentInfoUpdated: " + consentStatus.name());
            boolean D = d0.this.a.D();
            boolean d2 = this.a.d();
            String str2 = d0.f9613c;
            i0.c(str2, "isRequestLocationInEeaOrUnknown: " + d2);
            if (d2) {
                if (consentStatus == ConsentStatus.UNKNOWN && !D) {
                    d0 d0Var = d0.this;
                    d0Var.a((d0) d0Var.a);
                }
            } else if (consentStatus == ConsentStatus.UNKNOWN) {
                this.a.a(ConsentStatus.PERSONALIZED);
            }
            if (consentStatus == ConsentStatus.PERSONALIZED) {
                d0.this.a.b(true);
            }
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public void a(String str) {
            String str2 = d0.f9613c;
            i0.b(str2, "onFailedToUpdateConsentInfo: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ConsentFormListener {
        final /* synthetic */ e0 a;

        b(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public void a() {
            i0.a(d0.f9613c, "onConsentFormLoaded");
            if (d0.this.f9614b != null) {
                d0.this.f9614b.b();
            }
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public void a(ConsentStatus consentStatus, Boolean bool) {
            i0.a(d0.f9613c, "onConsentFormClosed");
            if (bool.booleanValue()) {
                this.a.g("from_consent");
            } else if (consentStatus == ConsentStatus.PERSONALIZED) {
                this.a.b(true);
            }
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public void a(String str) {
            i0.b(d0.f9613c, str);
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public void b() {
            i0.a(d0.f9613c, "onConsentFormOpened");
        }
    }

    public d0(e0 e0Var) {
        this.a = e0Var;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(e0 e0Var) {
        URL url;
        try {
            url = new URL(e0Var.E());
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            url = null;
        }
        this.f9614b = new ConsentForm.Builder(e0Var, url).a(new b(e0Var)).d().c().b().a();
        this.f9614b.a();
    }

    public static boolean a(Context context) {
        ConsentInformation a2 = ConsentInformation.a(context);
        ConsentStatus a3 = a2.a();
        if (ConsentStatus.PERSONALIZED == a3) {
            return true;
        }
        if (ConsentStatus.NON_PERSONALIZED == a3) {
            return false;
        }
        return !a2.d();
    }

    public void a() {
        i0.c(f9613c, "onCreate");
        ConsentInformation a2 = ConsentInformation.a(this.a);
        a2.a(new String[]{this.a.getString(q0.admob_publisher_id)}, new a(a2));
    }
}
