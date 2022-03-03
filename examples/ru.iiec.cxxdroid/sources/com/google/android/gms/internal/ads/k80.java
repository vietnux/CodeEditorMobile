package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@k2
public final class k80 {
    public static final a80<Long> A = a80.a(1, "gads:video:spinner:jank_threshold_ms", 50L);
    public static final a80<Boolean> A0 = a80.a(0, "gads:webview:permission:disabled", (Boolean) false);
    public static final a80<Long> A1 = a80.a(0, "gads:rendering:timeout_ms", 60000L);
    public static final a80<Boolean> A2 = a80.a(0, "gads:safe_browsing:debug", (Boolean) false);
    public static final a80<Boolean> B = a80.a(1, "gads:video:aggressive_media_codec_release", (Boolean) false);
    public static final a80<Boolean> B0 = a80.a(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);
    public static final a80<Boolean> B1 = a80.a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);
    public static final a80<Boolean> B2 = a80.a(0, "gads:webview_cookie:enabled", (Boolean) true);
    public static final a80<Boolean> C = a80.a(1, "gads:memory_bundle:debug_info", (Boolean) false);
    public static final a80<Long> C0 = a80.a(1, "gads:rewarded:adapter_timeout_ms", 20000L);
    public static final a80<Long> C1 = a80.a(1, "gads:gestures:task_timeout", 2000L);
    public static final a80<Boolean> C2 = a80.a(1, "gads:cache:bind_on_foreground", (Boolean) false);
    public static final a80<Boolean> D = a80.a(1, "gads:memory_bundle:runtime_info", (Boolean) true);
    public static final a80<Boolean> D0 = a80.a(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);
    public static final a80<Boolean> D1 = a80.a(1, "gads:gestures:asig:enabled", (Boolean) false);
    public static final a80<Boolean> D2 = a80.a(1, "gads:cache:bind_on_init", (Boolean) false);
    public static final a80<String> E = a80.a(1, "gads:video:codec_query_mime_types", "");
    public static final a80<Boolean> E0 = a80.a(1, "gads:app_activity_tracker:enabled", (Boolean) true);
    public static final a80<Boolean> E1 = a80.a(1, "gads:gestures:ans:enabled", (Boolean) false);
    public static final a80<Boolean> E2 = a80.a(1, "gads:cache:bind_on_request", (Boolean) false);
    public static final a80<Integer> F = a80.a(1, "gads:video:codec_query_minimum_version", 16);
    public static final a80<Long> F0 = a80.a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
    public static final a80<Boolean> F1 = a80.a(1, "gads:gestures:tos:enabled", (Boolean) false);
    public static final a80<Long> F2 = a80.a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final a80<Boolean> G = a80.a(0, "gads:looper_for_gms_client:enabled", (Boolean) true);
    public static final a80<Long> G0 = a80.a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final a80<Boolean> G1 = a80.a(1, "gads:signal:app_permissions:disabled", (Boolean) false);
    public static final a80<Boolean> G2 = a80.a(1, "gads:cache:use_cache_data_source", (Boolean) false);
    public static final a80<Boolean> H = a80.a(0, "gads:sw_ad_request_service:enabled", (Boolean) true);
    public static final a80<Boolean> H0 = a80.a(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);
    public static final a80<Boolean> H1 = a80.a(1, "gads:gestures:inthex:enabled", (Boolean) false);
    public static final a80<Boolean> H2 = a80.a(1, "gads:http_assets_cache:enabled", (Boolean) false);
    public static final a80<String> I = a80.a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    public static final a80<Long> I0 = a80.a(1, "gads:adid_values_in_adrequest:timeout", 2000L);
    public static final a80<Boolean> I1 = a80.a(1, "gads:gestures:hpk:enabled", (Boolean) true);
    public static final a80<String> I2 = a80.a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final a80<String> J = a80.a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    public static final a80<Boolean> J0 = a80.a(1, "gads:disable_adid_values_in_ms", (Boolean) false);
    public static final a80<String> J1 = a80.a(1, "gads:gestures:pk", "");
    public static final a80<Integer> J2 = a80.a(1, "gads:http_assets_cache:time_out", 100);
    public static final a80<String> K = a80.a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    public static final a80<Boolean> K0 = a80.a(1, "gads:enable_ad_loader_manager", (Boolean) true);
    public static final a80<Boolean> K1 = a80.a(1, "gads:gestures:bs:enabled", (Boolean) true);
    public static final a80<Boolean> K2 = a80.a(1, "gads:chrome_custom_tabs:enabled", (Boolean) true);
    public static final a80<String> L = a80.a(1, "gad:mraid:version", "2.0");
    public static final a80<Boolean> L0 = a80.a(1, "gads:ad_manager_enforce_arp_invariant:enabled", (Boolean) true);
    public static final a80<Boolean> L1 = a80.a(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);
    public static final a80<Boolean> L2 = a80.a(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);
    public static final a80<Boolean> M = a80.a(1, "gads:mraid:unload", (Boolean) false);
    public static final a80<Boolean> M0 = a80.a(1, "gads:ad_manager:admob_extra:new_bundle", (Boolean) true);
    public static final a80<Boolean> M1 = a80.a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);
    public static final a80<Boolean> M2 = a80.a(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);
    public static final a80<Boolean> N = a80.a(0, "gads:enabled_sdk_csi", (Boolean) false);
    public static final a80<Long> N0 = a80.a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
    public static final a80<Boolean> N1 = a80.a(0, "gass:enabled", (Boolean) true);
    public static final a80<Boolean> N2 = a80.a(1, "gads:drx_in_app_preview:enabled", (Boolean) true);
    public static final a80<String> O = a80.a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    public static final a80<Boolean> O0 = a80.a(1, "gads:interstitial_ad_immersive_mode", (Boolean) true);
    public static final a80<Boolean> O1 = a80.a(0, "gass:enable_int_signal", (Boolean) true);
    public static final a80<Boolean> O2 = a80.a(1, "gads:drx_debug_signals:enabled", (Boolean) true);
    public static final a80<Boolean> P = a80.a(0, "gads:sdk_csi_write_to_file", (Boolean) false);
    public static final a80<Boolean> P0 = a80.a(1, "gads:custom_close_blocking:enabled", (Boolean) false);
    public static final a80<Boolean> P1 = a80.a(0, "gass:enable_ad_attestation_signal", (Boolean) true);
    public static final a80<Boolean> P2 = a80.a(1, "gads:debug_hold_gesture:enabled", (Boolean) false);
    public static final a80<Boolean> Q = a80.a(0, "gads:enable_content_fetching", (Boolean) true);
    public static final a80<Boolean> Q0 = a80.a(1, "gads:disabling_closable_area:enabled", (Boolean) false);
    public static final a80<Boolean> Q1 = a80.a(0, "gads:support_screen_shot", (Boolean) true);
    public static final a80<Long> Q2 = a80.a(1, "gads:debug_hold_gesture:time_millis", 2000L);
    public static final a80<Integer> R = a80.a(0, "gads:content_length_weight", 1);
    public static final a80<Boolean> R0 = a80.a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
    public static final a80<Boolean> R1 = a80.a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", (Boolean) true);
    public static final a80<String> R2 = a80.a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final a80<Integer> S = a80.a(0, "gads:content_age_weight", 1);
    public static final a80<Boolean> S0 = a80.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);
    public static final a80<String> S1 = a80.a(1, "gads:sdk_core_constants:caps", "");
    public static final a80<String> S2 = a80.a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final a80<Integer> T = a80.a(0, "gads:min_content_len", 11);
    public static final a80<String> T0 = a80.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final a80<Long> T1 = a80.a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final a80<String> T2 = a80.a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final a80<Integer> U = a80.a(0, "gads:fingerprint_number", 10);
    public static final a80<String> U0 = a80.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final a80<Boolean> U1 = a80.a(0, "gads:js_flags:mf", (Boolean) false);
    public static final a80<String> U2 = a80.a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final a80<Integer> V = a80.a(0, "gads:sleep_sec", 10);
    public static final a80<Integer> V0 = a80.a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final a80<Boolean> V1 = a80.a(0, "gads:custom_render:ping_on_ad_rendered", (Boolean) false);
    public static final a80<Integer> V2 = a80.a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final a80<Boolean> W = a80.a(1, "gads:enable_content_url_hash", (Boolean) true);
    public static final a80<Integer> W0 = a80.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final a80<String> W1 = a80.a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final a80<Integer> W2 = a80.a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final a80<Integer> X = a80.a(1, "gads:content_vertical_fingerprint_number", 100);
    public static final a80<Integer> X0 = a80.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final a80<String> X1 = a80.a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final a80<Boolean> X2 = a80.a(1, "gad:interstitial_for_multi_window", (Boolean) false);
    public static final a80<Boolean> Y = a80.a(1, "gads:enable_content_vertical_hash", (Boolean) true);
    public static final a80<String> Y0 = a80.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final a80<Boolean> Y1 = a80.a(1, "gads:enable_untrack_view_native", (Boolean) true);
    public static final a80<Boolean> Y2 = a80.a(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);
    public static final a80<Integer> Z = a80.a(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final a80<Integer> Z0 = a80.a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final a80<Boolean> Z1 = a80.a(1, "gads:ignore_untrack_view_google_native", (Boolean) true);
    public static final a80<Integer> Z2 = a80.a(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final a80<String> a = a80.a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final a80<Integer> a0 = a80.a(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final a80<Integer> a1 = a80.a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final a80<Boolean> a2 = a80.a(1, "gads:reset_listeners_preparead_native", (Boolean) true);
    public static final a80<Boolean> a3 = a80.a(1, "gads:clearcut_logging:enabled", (Boolean) false);

    /* renamed from: b  reason: collision with root package name */
    public static final a80<Boolean> f4788b = a80.a(0, "gads:sdk_crash_report_enabled", (Boolean) false);
    public static final a80<String> b0 = a80.a(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final a80<Long> b1 = a80.a(1, "gads:interstitial_ad_pool:discard_thresholds", 0L);
    public static final a80<Integer> b2 = a80.a(1, "gads:native_video_load_timeout", 10);
    public static final a80<Boolean> b3 = a80.a(1, "gads:clearcut_logging:write_to_file", (Boolean) false);

    /* renamed from: c  reason: collision with root package name */
    public static final a80<Boolean> f4789c = a80.a(0, "gads:report_dynamite_crash_in_background_thread", (Boolean) false);
    public static final a80<String> c0 = a80.a(1, "gads:content_fetch_exclude_view_tag", "none");
    public static final a80<Long> c1 = a80.a(1, "gads:interstitial_ad_pool:miss_thresholds", 0L);
    public static final a80<Integer> c2 = a80.a(1, "gads:omid:native_webview_load_timeout", 2000);
    public static final a80<Boolean> c3 = a80.a(0, "gad:force_local_ad_request_service:enabled", (Boolean) false);

    /* renamed from: d  reason: collision with root package name */
    public static final a80<Boolean> f4790d = a80.a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);
    public static final a80<Boolean> d0 = a80.a(0, "gad:app_index_enabled", (Boolean) true);
    public static final a80<Float> d1 = a80.a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    public static final a80<String> d2 = a80.a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final a80<Boolean> d3 = a80.a(0, "gad:force_dynamite_loading_enabled", (Boolean) false);

    /* renamed from: e  reason: collision with root package name */
    public static final a80<String> f4791e = a80.a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    public static final a80<Boolean> e0 = a80.a(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);
    public static final a80<Float> e1 = a80.a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final a80<Boolean> e2 = a80.a(1, "gads:clamp_native_video_player_dimensions", (Boolean) true);
    public static final a80<Integer> e3 = a80.a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final a80<Float> f4792f = a80.a(1, "gads:trapped_exception_sample_rate", 0.01f);
    public static final a80<Boolean> f0 = a80.a(0, "gads:kitkat_interstitial_workaround:enabled", (Boolean) true);
    public static final a80<Boolean> f1 = a80.a(0, "gads:debug_logging_feature:enable", (Boolean) false);
    public static final a80<Boolean> f2 = a80.a(1, "gads:enable_store_active_view_state", (Boolean) false);
    public static final a80<Boolean> f3 = a80.a(1, "gads:omid:enabled", (Boolean) false);

    /* renamed from: g  reason: collision with root package name */
    public static final a80<Boolean> f4793g = a80.a(0, "gads:block_autoclicks", (Boolean) false);
    public static final a80<Boolean> g0 = a80.a(0, "gads:interstitial_follow_url", (Boolean) true);
    public static final a80<Boolean> g1 = a80.a(0, "gads:debug_logging_feature:intercept_web_view", (Boolean) false);
    public static final a80<Boolean> g2 = a80.a(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);
    public static final a80<Boolean> g3 = a80.a(1, "gads:nonagon:banner:check_dp_size", (Boolean) false);

    /* renamed from: h  reason: collision with root package name */
    public static final a80<String> f4794h = a80.a(1, "gads:video_exo_player:version", "1");
    public static final a80<Boolean> h0 = a80.a(0, "gads:interstitial_follow_url:register_click", (Boolean) true);
    private static final a80<Integer> h1 = a80.a(1, "gads:heap_wastage:bytes", 0);
    public static final a80<Boolean> h2 = a80.a(1, "gads:native:overlay_new_fix:enabled", (Boolean) true);
    public static final a80<Long> h3 = a80.a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);

    /* renamed from: i  reason: collision with root package name */
    public static final a80<Integer> f4795i = a80.a(1, "gads:video_exo_player:connect_timeout", 8000);
    public static final a80<Boolean> i0 = a80.a(0, "gads:ad_key_enabled", (Boolean) false);
    public static final a80<String> i1 = a80.a(1, "gads:spherical_video:vertex_shader", "");
    public static final a80<Boolean> i2 = a80.a(1, "gads:native:count_impression_for_assets", (Boolean) false);
    public static final a80<String> i3 = a80.a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: j  reason: collision with root package name */
    public static final a80<Integer> f4796j = a80.a(1, "gads:video_exo_player:read_timeout", 8000);
    public static final a80<Boolean> j0 = a80.a(1, "gads:sai:enabled", (Boolean) true);
    public static final a80<String> j1 = a80.a(1, "gads:spherical_video:fragment_shader", "");
    public static final a80<Boolean> j2 = a80.a(1, "gads:native:custom_one_point_five_click:enable", (Boolean) true);
    public static final a80<Boolean> j3 = a80.a(1, "gads:real_test_request:enabled", (Boolean) true);

    /* renamed from: k  reason: collision with root package name */
    public static final a80<Integer> f4797k = a80.a(1, "gads:video_exo_player:loading_check_interval", 1048576);
    public static final a80<Boolean> k0 = a80.a(1, "gads:sai:banner_ad_enabled", (Boolean) true);
    public static final a80<Boolean> k1 = a80.a(0, "gads:log:verbose_enabled", (Boolean) false);
    public static final a80<Boolean> k2 = a80.a(1, "gads:unified_native_ad:enable", (Boolean) true);
    public static final a80<Boolean> k3 = a80.a(1, "gads:real_test_request:render_webview_label", (Boolean) true);

    /* renamed from: l  reason: collision with root package name */
    public static final a80<Integer> f4798l = a80.a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
    public static final a80<Boolean> l0 = a80.a(1, "gads:sai:native_ad_enabled", (Boolean) true);
    public static final a80<Boolean> l1 = a80.a(1, "gads:include_local_global_rectangles", (Boolean) false);
    public static final a80<Boolean> l2 = a80.a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);
    public static final a80<Boolean> l3 = a80.a(1, "gads:real_test_request:render_native_label", (Boolean) true);

    /* renamed from: m  reason: collision with root package name */
    public static final a80<Integer> f4799m = a80.a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
    public static final a80<Boolean> m0 = a80.a(1, "gads:sai:interstitial_ad_enabled", (Boolean) true);
    public static final a80<Long> m1 = a80.a(1, "gads:position_watcher:throttle_ms", 200L);
    public static final a80<Boolean> m2 = a80.a(0, "gads:method_tracing:enabled", (Boolean) false);
    public static final a80<Integer> m3 = a80.a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final a80<Integer> n = a80.a(1, "gads:video_stream_cache:limit_count", 5);
    public static final a80<Boolean> n0 = a80.a(1, "gads:sai:rewardedvideo_ad_enabled", (Boolean) true);
    public static final a80<Boolean> n1 = a80.a(1, "gads:include_lock_screen_apps_for_visibility", (Boolean) true);
    public static final a80<Long> n2 = a80.a(0, "gads:method_tracing:duration_ms", 30000L);
    public static final a80<Integer> n3 = a80.a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 27);
    public static final a80<Integer> o = a80.a(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final a80<String> o0 = a80.a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final a80<Boolean> o1 = a80.a(0, "gads:device_info_caching:enabled", (Boolean) true);
    public static final a80<Integer> o2 = a80.a(0, "gads:method_tracing:count", 5);
    public static final a80<Integer> o3 = a80.a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);
    public static final a80<Integer> p = a80.a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final a80<String> p0 = a80.a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");
    public static final a80<Long> p1 = a80.a(0, "gads:device_info_caching_expiry_ms:expiry", 300000L);
    public static final a80<Integer> p2 = a80.a(0, "gads:method_tracing:filesize", 134217728);
    public static final a80<Integer> p3 = a80.a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);
    public static final a80<Long> q = a80.a(1, "gads:video_stream_cache:limit_time_sec", 300L);
    public static final a80<Boolean> q0 = a80.a(1, "gads:sai:click_gmsg_enabled", (Boolean) true);
    public static final a80<Boolean> q1 = a80.a(1, "gads:gen204_signals:enabled", (Boolean) false);
    public static final a80<Long> q2 = a80.a(1, "gads:auto_location_timeout", 2000L);
    private static byte[] q3;
    public static final a80<Long> r = a80.a(1, "gads:video_stream_cache:notify_interval_millis", 125L);
    public static final a80<Boolean> r0 = a80.a(1, "gads:sai:using_macro:enabled", (Boolean) false);
    public static final a80<Boolean> r1 = a80.a(0, "gads:webview:error_reporting_enabled", (Boolean) false);
    public static final a80<Boolean> r2 = a80.a(1, "gads:fetch_app_settings_using_cld:enabled", (Boolean) false);
    public static final a80<Integer> s = a80.a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final a80<String> s0 = a80.a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final a80<Boolean> s1 = a80.a(1, "gads:gmsg:disable_back_button:enabled", (Boolean) true);
    public static final a80<Long> s2 = a80.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
    public static final a80<Boolean> t = a80.a(0, "gads:video:metric_reporting_enabled", (Boolean) false);
    public static final a80<Long> t0 = a80.a(1, "gads:sai:timeout_ms", -1L);
    public static final a80<Boolean> t1 = a80.a(0, "gads:gmsg:video_meta:enabled", (Boolean) true);
    public static final a80<String> t2 = a80.a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final a80<String> u = a80.a(1, "gads:video:metric_frame_hash_times", "");
    public static final a80<Integer> u0 = a80.a(1, "gads:sai:scion_thread_pool_size", 5);
    public static final a80<Long> u1 = a80.a(1, "gads:network:network_prediction_timeout_ms", 2000L);
    public static final a80<String> u2 = a80.a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final a80<Long> v = a80.a(1, "gads:video:metric_frame_hash_time_leniency", 500L);
    public static final a80<Boolean> v0 = a80.a(1, "gads:x_seconds_rewarded:enable", (Boolean) false);
    public static final a80<Boolean> v1 = a80.a(0, "gads:mediation:dynamite_first:admobadapter", (Boolean) true);
    public static final a80<String> v2 = a80.a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final a80<Boolean> w = a80.a(1, "gads:video:force_watermark", (Boolean) false);
    public static final a80<Boolean> w0 = a80.a(1, "gads:webview:ignore_over_scroll", (Boolean) true);
    public static final a80<Boolean> w1 = a80.a(0, "gads:mediation:dynamite_first:adurladapter", (Boolean) true);
    public static final a80<String> w2 = a80.a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final a80<Long> x = a80.a(1, "gads:video:surface_update_min_spacing_ms", 1000L);
    public static final a80<Boolean> x0 = a80.a(0, "gads:corewebview:adwebview_factory:enable", (Boolean) false);
    public static final a80<Boolean> x1 = a80.a(1, "gads:bypass_adrequest_service_for_inlined_mediation", (Boolean) true);
    public static final a80<String> x2 = a80.a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final a80<Boolean> y = a80.a(1, "gads:video:spinner:enabled", (Boolean) false);
    public static final a80<Boolean> y0 = a80.a(0, "gads:corewebview:javascript_engine", (Boolean) false);
    public static final a80<Long> y1 = a80.a(0, "gads:resolve_future:default_timeout_ms", 30000L);
    public static final a80<Long> y2 = a80.a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000L);
    public static final a80<Integer> z = a80.a(1, "gads:video:spinner:scale", 4);
    public static final a80<Boolean> z0 = a80.a(1, "gad:webview:inject_scripts", (Boolean) false);
    public static final a80<Long> z1 = a80.a(0, "gads:ad_loader:timeout_ms", 60000L);
    public static final a80<Long> z2 = a80.a(1, "gads:parental_controls:timeout", 2000L);

    static {
        a80.a(0, "gads:sdk_core_experiment_id");
        a80.a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");
        a80.a(0, "gads:request_builder:singleton_webview", (Boolean) false);
        a80.a(0, "gads:request_builder:singleton_webview_experiment_id");
        a80.a(0, "gads:sdk_use_dynamic_module", (Boolean) true);
        a80.a(0, "gads:sdk_use_dynamic_module_experiment_id");
        a80.a(0, "gads:block_autoclicks_experiment_id");
        a80.a(0, "gads:spam_app_context:experiment_id");
        a80.a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        a80.a(0, "gads:video_stream_cache:experiment_id");
        a80.a(0, "gads:ad_id_app_context:enabled", (Boolean) false);
        a80.a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
        a80.a(0, "gads:ad_id_app_context:experiment_id");
        a80.a(0, "gads:ad_id_use_shared_preference:experiment_id");
        a80.a(0, "gads:ad_id_use_shared_preference:enabled", (Boolean) false);
        a80.a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
        a80.a(0, "gads:ad_id_use_persistent_service:enabled", (Boolean) false);
        a80.a(0, "gads:ad_id:use_ipc:enabled", (Boolean) false);
        a80.b(0, "gads:looper_for_gms_client:experiment_id");
        a80.a(0, "gads:sw_dynamite:enabled", (Boolean) true);
        a80.a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);
        a80.a(0, "gads:app_index:timeout_ms", 1000L);
        a80.a(0, "gads:app_index:experiment_id");
        a80.a(0, "gads:kitkat_interstitial_workaround:experiment_id");
        a80.a(0, "gads:interstitial_follow_url:experiment_id");
        a80.a(0, "gads:analytics_enabled", (Boolean) true);
        a80.a(0, "gads:webview_cache_version", 0);
        a80.b(0, "gads:pan:experiment_id");
        a80.a(0, "gads:ad_serving:enabled", (Boolean) true);
        a80.a(1, "gads:impression_optimization_enabled", (Boolean) false);
        a80.a(1, "gads:banner_ad_pool:schema", "customTargeting");
        a80.a(1, "gads:banner_ad_pool:max_queues", 3);
        a80.a(1, "gads:banner_ad_pool:max_pools", 3);
        a80.a(0, "gads:adid_reporting:enabled", (Boolean) false);
        a80.a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);
        a80.a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);
        a80.a(0, "gads:request_pkg:enabled", (Boolean) true);
        a80.a(0, "gads:gmsg:video_meta:experiment_id");
        a80.a(1, "gads:network:cache_prediction_duration_s", 300L);
        a80.a(1, "gads:rtb_signal_timeout_ms", 1000L);
        a80.a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);
        a80.a(0, "gads:edu_device_helper:enabled", (Boolean) true);
        a80.a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
        a80.a(1, "gads:sdk_core_constants:experiment_id");
        a80.a(1, "gads:js_flags:disable_phenotype", (Boolean) false);
        a80.a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
        a80.a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        a80.a(1, "gads:singleton_webview_native:experiment_id");
        a80.a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);
        a80.b(1, "gads:auto_location_for_coarse_permission:experiment_id");
        a80.b(1, "gads:auto_location_timeout:experiment_id");
        a80.a(1, "gads:auto_location_interval", -1L);
        a80.b(1, "gads:auto_location_interval:experiment_id");
        a80.a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
        a80.a(0, "gads:afs:csa:experiment_id");
        a80.a(0, "gads:afs:csa_ad_manager_enabled", (Boolean) true);
        a80.a(1, "gads:parental_controls:send_from_client", (Boolean) true);
        a80.a(1, "gads:parental_controls:cache_results", (Boolean) true);
        a80.a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
        a80.a(0, "gads:safe_browsing:safety_net:delay_ms", 2000L);
        a80.a(1, "gads:cache:ad_request_timeout_millis", 250);
        a80.a(1, "gads:cache:max_concurrent_downloads", 10);
        a80.a(1, "gads:cache:javascript_timeout_millis", 5000L);
        a80.a(1, "gads:cache:connection_per_read", (Boolean) false);
        a80.a(1, "gads:cache:connection_timeout", 5000L);
        a80.a(1, "gads:cache:read_only_connection_timeout", 5000L);
        a80.a(0, "gads:nonagon:red_button", (Boolean) false);
        a80.a(1, "gads:nonagon:banner:enabled", (Boolean) false);
        a80.a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        a80.a(1, "gads:nonagon:interstitial:enabled", (Boolean) false);
        a80.a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        a80.a(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);
        a80.a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);
        a80.a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
        a80.a(1, "gads:nonagon:nativead:enabled", (Boolean) false);
        a80.a(1, "gads:nonagon:nativead:app_name", "(?!)");
        a80.a(1, "gads:nonagon:service:enabled", (Boolean) false);
        a80.a(1, "gads:signals:ad_id_info:enabled", (Boolean) false);
        a80.a(1, "gads:signals:app_index:enabled", (Boolean) false);
        a80.a(1, "gads:signals:cache:enabled", (Boolean) false);
        a80.a(1, "gads:signals:doritos:enabled", (Boolean) false);
        a80.a(1, "gads:signals:location:enabled", (Boolean) false);
        a80.a(1, "gads:signals:network_prediction:enabled", (Boolean) false);
        a80.a(1, "gads:signals:parental_control:enabled", (Boolean) false);
    }

    public static List<String> a() {
        return a50.f().a();
    }

    public static void a(Context context) {
        wb.a(context, new l80(context));
        int intValue = ((Integer) a50.g().a(h1)).intValue();
        if (intValue > 0 && q3 == null) {
            q3 = new byte[intValue];
        }
    }

    public static void a(Context context, int i4, JSONObject jSONObject) {
        a50.e();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        a50.f().a(edit, 1, jSONObject);
        a50.e();
        edit.commit();
    }

    public static List<String> b() {
        return a50.f().b();
    }
}
