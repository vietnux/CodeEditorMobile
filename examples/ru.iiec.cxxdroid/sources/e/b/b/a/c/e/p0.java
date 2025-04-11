package e.b.b.a.c.e;

import android.net.Uri;

public final class p0 {
    public static q0<Long> A = q0.a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L);
    public static q0<Long> B = q0.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L);
    public static q0<Long> C = q0.a("measurement.upload.initial_upload_delay_time", 15000L, 15000L);
    public static q0<Long> D = q0.a("measurement.upload.retry_time", 1800000L, 1800000L);
    public static q0<Integer> E = q0.a("measurement.upload.retry_count", 6, 6);
    public static q0<Long> F = q0.a("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
    public static q0<Integer> G = q0.a("measurement.lifetimevalue.max_currency_tracked", 4, 4);
    public static q0<Integer> H = q0.a("measurement.audience.filter_result_max_count", 200, 200);
    public static q0<Long> I = q0.a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L);
    public static q0<Boolean> J = q0.a("measurement.test.boolean_flag", false, false);
    public static q0<String> K = q0.a("measurement.test.string_flag", "---", "---");
    public static q0<Long> L = q0.a("measurement.test.long_flag", -1L, -1L);
    public static q0<Integer> M = q0.a("measurement.test.int_flag", -2, -2);
    public static q0<Double> N = q0.a("measurement.test.double_flag", -3.0d, -3.0d);
    public static q0<Boolean> O = q0.a("measurement.lifetimevalue.user_engagement_tracking_enabled", false, false);
    public static q0<Boolean> P = q0.a("measurement.audience.complex_param_evaluation", false, false);
    public static q0<Boolean> Q = q0.a("measurement.validation.internal_limits_internal_event_params", false, false);
    public static q0<Boolean> R = q0.a("measurement.quality.unsuccessful_update_retry_counter", false, false);
    public static q0<Boolean> S = q0.a("measurement.iid.disable_on_collection_disabled", true, true);
    public static q0<Boolean> T = q0.a("measurement.app_launch.call_only_when_enabled", true, true);
    public static q0<Boolean> U = q0.a("measurement.run_on_worker_inline", true, false);
    public static q0<Boolean> V = q0.a("measurement.reset_analytics.persist_time", false, false);
    private static final g7 a;

    /* renamed from: b  reason: collision with root package name */
    public static q0<Boolean> f7487b = q0.a("measurement.upload_dsid_enabled", false, false);

    /* renamed from: c  reason: collision with root package name */
    public static q0<String> f7488c = q0.a("measurement.log_tag", "FA", "FA-SVC");

    /* renamed from: d  reason: collision with root package name */
    public static q0<Long> f7489d = q0.a("measurement.ad_id_cache_time", 10000L, 10000L);

    /* renamed from: e  reason: collision with root package name */
    public static q0<Long> f7490e = q0.a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L);

    /* renamed from: f  reason: collision with root package name */
    public static q0<Long> f7491f = q0.a("measurement.config.cache_time", 86400000L, 3600000L);

    /* renamed from: g  reason: collision with root package name */
    public static q0<String> f7492g = q0.a("measurement.config.url_scheme", "https", "https");

    /* renamed from: h  reason: collision with root package name */
    public static q0<String> f7493h = q0.a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");

    /* renamed from: i  reason: collision with root package name */
    public static q0<Integer> f7494i = q0.a("measurement.upload.max_bundles", 100, 100);

    /* renamed from: j  reason: collision with root package name */
    public static q0<Integer> f7495j = q0.a("measurement.upload.max_batch_size", 65536, 65536);

    /* renamed from: k  reason: collision with root package name */
    public static q0<Integer> f7496k = q0.a("measurement.upload.max_bundle_size", 65536, 65536);

    /* renamed from: l  reason: collision with root package name */
    public static q0<Integer> f7497l = q0.a("measurement.upload.max_events_per_bundle", 1000, 1000);

    /* renamed from: m  reason: collision with root package name */
    public static q0<Integer> f7498m = q0.a("measurement.upload.max_events_per_day", 100000, 100000);
    public static q0<Integer> n = q0.a("measurement.upload.max_error_events_per_day", 1000, 1000);
    public static q0<Integer> o = q0.a("measurement.upload.max_public_events_per_day", 50000, 50000);
    public static q0<Integer> p = q0.a("measurement.upload.max_conversions_per_day", 500, 500);
    public static q0<Integer> q = q0.a("measurement.upload.max_realtime_events_per_day", 10, 10);
    public static q0<Integer> r = q0.a("measurement.store.max_stored_events_per_app", 100000, 100000);
    public static q0<String> s = q0.a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
    public static q0<Long> t = q0.a("measurement.upload.backoff_period", 43200000L, 43200000L);
    public static q0<Long> u = q0.a("measurement.upload.window_interval", 3600000L, 3600000L);
    public static q0<Long> v = q0.a("measurement.upload.interval", 3600000L, 3600000L);
    public static q0<Long> w = q0.a("measurement.upload.realtime_upload_interval", 10000L, 10000L);
    public static q0<Long> x = q0.a("measurement.upload.debug_upload_interval", 1000L, 1000L);
    public static q0<Long> y = q0.a("measurement.upload.minimum_delay", 500L, 500L);
    public static q0<Long> z = q0.a("measurement.alarm_manager.minimum_interval", 60000L, 60000L);

    static {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
        a = new g7(Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/")));
        q0.a("measurement.log_third_party_store_events_enabled", false, false);
        q0.a("measurement.log_installs_enabled", false, false);
        q0.a("measurement.log_upgrades_enabled", false, false);
        q0.a("measurement.log_androidId_enabled", false, false);
        q0.a("measurement.audience.dynamic_filters", false, false);
    }
}
