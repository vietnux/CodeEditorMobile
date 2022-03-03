package com.google.ads.consent;

import e.b.d.v.c;
import java.util.HashSet;

/* access modifiers changed from: package-private */
public class ConsentData {
    private static final String SDK_PLATFORM = "android";
    private static final String SDK_VERSION = "1.0.7";
    @c("providers")
    private HashSet<AdProvider> adProviders = new HashSet<>();
    @c("consent_source")
    private String consentSource;
    @c("consent_state")
    private ConsentStatus consentStatus = ConsentStatus.UNKNOWN;
    @c("consented_providers")
    private HashSet<AdProvider> consentedAdProviders = new HashSet<>();
    @c("has_any_npa_pub_id")
    private boolean hasNonPersonalizedPublisherId = false;
    @c("is_request_in_eea_or_unknown")
    private boolean isRequestLocationInEeaOrUnknown = false;
    @c("pub_ids")
    private HashSet<String> publisherIds = new HashSet<>();
    @c("raw_response")
    private String rawResponse = "";
    @c("plat")
    private final String sdkPlatformString = SDK_PLATFORM;
    @c("version")
    private final String sdkVersionString = SDK_VERSION;
    @c("tag_for_under_age_of_consent")
    private Boolean underAgeOfConsent = false;

    ConsentData() {
    }

    /* access modifiers changed from: package-private */
    public HashSet<AdProvider> a() {
        return this.adProviders;
    }

    /* access modifiers changed from: package-private */
    public void a(ConsentStatus consentStatus2) {
        this.consentStatus = consentStatus2;
    }

    public void a(String str) {
        this.consentSource = str;
    }

    /* access modifiers changed from: package-private */
    public void a(HashSet<AdProvider> hashSet) {
        this.adProviders = hashSet;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.hasNonPersonalizedPublisherId = z;
    }

    /* access modifiers changed from: package-private */
    public ConsentStatus b() {
        return this.consentStatus;
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.rawResponse = str;
    }

    /* access modifiers changed from: package-private */
    public void b(HashSet<AdProvider> hashSet) {
        this.consentedAdProviders = hashSet;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        this.isRequestLocationInEeaOrUnknown = z;
    }

    /* access modifiers changed from: package-private */
    public HashSet<AdProvider> c() {
        return this.consentedAdProviders;
    }

    /* access modifiers changed from: package-private */
    public void c(HashSet<String> hashSet) {
        this.publisherIds = hashSet;
    }

    public String d() {
        return this.sdkPlatformString;
    }

    public String e() {
        return this.sdkVersionString;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.hasNonPersonalizedPublisherId;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.isRequestLocationInEeaOrUnknown;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.underAgeOfConsent.booleanValue();
    }
}
