package com.tglt.code.editor.ads;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tglt.code.editor.BuildConfig;
import com.tglt.code.editor.R;
import com.tglt.code.editor.app.MainActivity;
import com.tglt.code.editor.utils.JsonParams;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AdmobLib implements Application.ActivityLifecycleCallbacks {
    private static String TAG = "AdmobLibActivity";
    public static final boolean DEBUG = !BuildConfig.BUILD_TYPE.equals("release");

    private static AdmobLib INSTANCE = null;

    public static JsonParams jparam = new JsonParams();
    static Activity activity;
    ProgressDialog pDialog;

    private InterstitialAd mInterstitialAd;
    AdRequest adRequest;
    private NativeAd nativeAd;

    public static AdmobLib getInstance( Activity activity ) {
        if (INSTANCE == null) {
            INSTANCE = new AdmobLib( activity );
        }
        return(INSTANCE);
    }

//    public AdmobLib( Activity activity, ProgressDialog pDialog ) {
//        this.pDialog = pDialog;
//        this.activity = activity;
//        init();
//    }
    public AdmobLib( Activity activity ) {
        AdmobLib.activity = activity;
        init();
    }
    private void init() {
        TAG = activity.getClass().getSimpleName();
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        if (DEBUG) {
            List<String> testDeviceIds = Arrays.asList("91A65ED1BD26BD6DB92FAE29B6463A6C");
            RequestConfiguration configuration = new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }

        MobileAds.initialize(activity, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
//                if (DEBUG) Log.e(TAG, "The rewarded ok loaded yet.");
//                rewardedLoad();
            }
        });
        adRequest = new AdRequest.Builder().build();
    }

    public void interstitial(final boolean show, ProgressDialog pDl ) {
        if(  ( JsonParams.DATA == null || !JsonParams.getParam("interstitial").equals("admob") || JsonParams.getParam("admobid.android.interstitial") == null ) ) {
            if( pDl != null ) pDl.dismiss();
            if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
            }
            return;
        } else {
            if( pDl != null ) {
                pDialog = pDl;
            } else {
                pDialog = ProgressDialog.show(activity, "Loading...", "Please wait...", true, false);
            }
        }
        if( mInterstitialAd == null ) { //init
//            if (DEBUG) Log.e(TAG, "1. The interstitial ok dang load trước.");
//            mInterstitialAd = new InterstitialAd(activity);
//            mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//            mInterstitialAd.setAdUnitId( JsonParams.getParam("admobid.android.interstitial") );
//            adRequest = new AdRequest.Builder().build();
//            InterstitialAd.load(activity, "ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            InterstitialAd.load(activity, JsonParams.getParam("admobid.android.interstitial"), adRequest, new InterstitialAdLoadCallback() {
                @Override
                public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                    mInterstitialAd = interstitialAd;
                    if (DEBUG) Log.e(TAG, "2. The interstitial ok đã load trước. "+show);
                    if( show ) {
                        if (DEBUG) Log.e(TAG, "The interstitial ok loaded yet.");
                        interstitialShow();
                    }
                    if( pDialog != null && pDialog.isShowing() ) {
                        pDialog.dismiss();
                    }
                }

                @Override
                public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                    // Handle the error
//                    Log.i(TAG, loadAdError.getMessage());
                    mInterstitialAd = null;
                    if( pDialog != null && pDialog.isShowing() ) {
                        pDialog.dismiss();
                    }
                    if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                        Intent intent = new Intent(activity, MainActivity.class);
                        activity.startActivity(intent);
                    }
                    if (DEBUG) Log.e(TAG, "The interstitial onAdFailedToLoad error. "+loadAdError.toString());
                }
            });
        } else if( show ) {
            if (DEBUG) Log.e(TAG, "The interstitial ok da load trước.");
            interstitialShow();

            if( pDialog != null && pDialog.isShowing() ) {
                pDialog.dismiss();
            }
        }
    }
    public void interstitialShow() {
        if (mInterstitialAd != null) {
//            pDialog = ProgressDialog.show(activity, "Loading...", "Please wait...", true, false);
            mInterstitialAd.show( activity );
            // Load the next interstitial.
//            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setFullScreenContentCallback(
                new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        pDialog.dismiss();
                        interstitial(false, null);
                        if (DEBUG) Log.e(TAG, "The ad was dismissed.");

                        if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                            Intent intent = new Intent(activity, MainActivity.class);
                            activity.overridePendingTransition(R.anim.fade_forward, R.anim.slide_out_right);
                            activity.startActivity(intent);
                        }
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        if (DEBUG) Log.e(TAG, "The ad failed to show.");
                        pDialog.dismiss();

                        if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                            Intent intent = new Intent(activity, MainActivity.class);
                            activity.startActivity(intent);
                        }
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        if (DEBUG) Log.e(TAG, "The ad was shown.");

                    }
                }
            );

        } else {
            if (DEBUG) Log.e(TAG, "The interstitial wasn't loaded yet.");
//            interstitial(true, null);
            if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
            } else {
                interstitial(true, null);
            }
        }
    }

    public void adsInterstitialRandom( ) {
        int random = new Random().nextInt(3 ); //int n = rand.nextInt(20); // Gives n such that 0 <= n < 20
        if ( random == 1) {
            interstitialShow( );
        }
    }

    public void nativeads(final int native_id) {
        if(  ( JsonParams.DATA == null || !JsonParams.getParam("native").equals("admob") || JsonParams.getParam("admobid.android.native") == null ) ) {
            AdmobLib.activity.findViewById( native_id ).setVisibility(View.GONE);
            return;
        }
//        Log.e(TAG, " ==== ");
//        MobileAds.initialize( activity, activity.getResources().getString( R.string.admob_id ) );
//        MobileAds.initialize( this.activity, "ca-app-pub-3940256099942544~3347511713" );
//        AdLoader adLoader = new AdLoader.Builder(this.activity, "ca-app-pub-3940256099942544/2247696110" )

        AdLoader.Builder builder = new AdLoader.Builder(this.activity, JsonParams.getParam("admobid.android.native"))
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd NativeAd) {
                        if (nativeAd != null) {
                            nativeAd.destroy();
                        }
                        nativeAd = NativeAd;
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().withMainBackgroundColor(new ColorDrawable(Integer.decode("#FFFFFF"))).build();

                        TemplateView template = AdmobLib.activity.findViewById( native_id );
                        template.setStyles(styles);
                        template.setNativeAd(NativeAd);
                        AdmobLib.activity.findViewById( native_id ).setVisibility(View.VISIBLE);

                        VideoController vc = nativeAd.getMediaContent().getVideoController();

                        // Updates the UI to say whether or not this ad has a video asset.
                        if (vc.hasVideoContent()) {
                            if (DEBUG) Log.e(TAG,"Video status: Ad contains a %.2f:1 video asset." +vc.getVideoLifecycleCallbacks() );

                            // Create a new VideoLifecycleCallbacks object and pass it to the VideoController. The
                            // VideoController will call methods on this object when events occur in the video
                            // lifecycle.
                            vc.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() {
                                @Override
                                public void onVideoEnd() {
                                    // Publishers should allow native ads to complete video playback before
                                    // refreshing or replacing them with another ad in the same UI location.
                                    if (DEBUG) Log.e(TAG,"Video status: Video playback has ended.");
                                    super.onVideoEnd();
                                }
                            });
                        } else {
                            if (DEBUG) Log.e(TAG,"Video status: Ad does not contain a video asset.");
                        }
                    }
                });
//                .withAdListener(new AdListener() {
//                    @Override
//                    public void onAdFailedToLoad(int errorCode) {
//                        // Handle the failure by logging, altering the UI, and so on.
//                    }
//                    @Override
//                    public void onAdClicked() {
//                        // Log the click event or other custom behavior.
//                    }
//                });


        VideoOptions videoOptions =
                new VideoOptions.Builder().setStartMuted(false).build();

        NativeAdOptions adOptions =
                new NativeAdOptions.Builder().setVideoOptions(videoOptions).build();


        builder.withNativeAdOptions(adOptions);

        AdLoader adLoader = builder .withAdListener(
                                new AdListener() {
                                    @Override
                                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                                        String error =
                                                String.format(
                                                        "domain: %s, code: %d, message: %s",
                                                        loadAdError.getDomain(),
                                                        loadAdError.getCode(),
                                                        loadAdError.getMessage());
                                        Log.e( TAG, "Failed to load native ad with error " + error);
                                    }
                                })
                        .build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }


    //ads open app
    private AppOpenAd appOpenAd = null;

    private AppOpenAd.AppOpenAdLoadCallback loadCallback;

    private static boolean isShowingAd = false;

    /** Shows the ad if one isn't already showing. */
    public  void showAdIfAvailable ( ) {
        // Only show ad if there is not already an app open ad currently showing
        // and an ad is available.
        if (!isShowingAd && isAdAvailable()) {
            if (DEBUG) Log.e(TAG, "openapp Will show ad.");

            FullScreenContentCallback fullScreenContentCallback =
                    new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            // Set the reference to null so isAdAvailable() returns false.
                            appOpenAd = null;
                            isShowingAd = false;
                            pDialog.dismiss();
//                            fetchAd(pDialog);
                            if (DEBUG) Log.e(TAG, "openapp onAdDismissedFullScreenContent");
                            Intent intent = new Intent(activity, MainActivity.class);
                            activity.startActivity(intent);
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            pDialog.dismiss();
                            Intent intent = new Intent(activity, MainActivity.class);
                            activity.startActivity(intent);
                        }

                        @Override
                        public void onAdShowedFullScreenContent() {
                            isShowingAd = true;
//                            pDialog.dismiss();
                        }
                    };

            appOpenAd.setFullScreenContentCallback(fullScreenContentCallback);
            appOpenAd.show(activity);

        } else {
            if (DEBUG) Log.e(TAG, "openapp Can not show ad.");
//            if(pDialog!=null) pDialog.dismiss();
            fetchAd(pDialog);

        }
    }

    /** Request an ad */
    public void fetchAd( ProgressDialog ppDialog ) {
        pDialog = ppDialog;
        // Have unused ad, no need to fetch another.
        if (isAdAvailable()) {
//            Log.e(TAG, " isAdAvailable() = " +isAdAvailable() );
            if (pDialog != null) pDialog.dismiss();
            if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
            }
            return;
        }

        if( pDialog == null ) {
            pDialog = ProgressDialog.show(activity, "Loading...", "Please wait...", true, false);
        }

        loadCallback =
                new AppOpenAd.AppOpenAdLoadCallback() {
                    /**
                     * Called when an app open ad has loaded.
                     *
                     * @param ad the loaded app open ad.
                     */
                    @Override
                    public void onAdLoaded(AppOpenAd ad) {
                        appOpenAd = ad;
                        pDialog.dismiss();
//                        Log.e(TAG, " onAdLoaded() = " + activity.getClass().getSimpleName() );
                        showAdIfAvailable ( );
                    }

                    /**
                     * Called when an app open ad has failed to load.
                     *
                     * @param loadAdError the error.
                     */
                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        // Handle the error.
                        pDialog.dismiss();
                        if( activity.getClass().getSimpleName().equals("SplashScreen")) {
                            Intent intent = new Intent(activity, MainActivity.class);
                            activity.startActivity(intent);
                        }
                    }

                };

//        String AD_UNIT_ID = "ca-app-pub-1656614863517753/2103865415";
        String AD_UNIT_ID = JsonParams.getParam("admobid.android.openapp");

        AppOpenAd.load( activity, AD_UNIT_ID, adRequest,
                AppOpenAd.APP_OPEN_AD_ORIENTATION_PORTRAIT, loadCallback);
    }


    /** Utility method that checks if ad exists and can be shown. */
    public boolean isAdAvailable() {
        return appOpenAd != null;
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }
//    public openapp( ) {
//        appOpenManager = new AppOpenManager(this);
//
//    }



}
