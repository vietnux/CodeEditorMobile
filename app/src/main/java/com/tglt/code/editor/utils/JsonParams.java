package com.tglt.code.editor.utils;

import android.util.Log;

import com.tglt.code.editor.BuildConfig;

import org.json.JSONObject;

/**
 * Created by TranThanhTuan on 8/22/2016.
 */
public class JsonParams {
    private static final String TAG = "JsonParams";
    public static final boolean DEBUG = !BuildConfig.BUILD_TYPE.equals("release");
    public static JSONObject DATA = null;
    public static JSONObject getData(){ return JsonParams.DATA; }

    public static void setData(JSONObject d){ JsonParams.DATA = d; }

    public static String getParam( String param ){
        if( JsonParams.DATA == null ) {return null;}
        String[] params = param.split("\\.");
        //json.getString("owner.username")
//        Log.e(TAG, params.length + " " +JsonParams.DATA );
//        Log.e("Lỗi 1.1", JsonParams.DATA.getString("banner").toString() + " " );
        try {
            if (params.length == 1) {
                return JsonParams.DATA.getString(param);
            }
            int i = 0;
            JSONObject json = null;
            for (i = 0; i < params.length-1; i++) {
                json = json != null ? json.getJSONObject( params[i] ) : JsonParams.DATA.getJSONObject( params[i] );
//                JSONObject json = this.jsonTracks.getJSONObject(i);
//                Log.e("Lỗi 1."+i, params[i]);
            }
//            Log.e("Lỗi 1."+i, params[i] + " = "+json.getString(params[i]).toString() );
            return !json.getString(params[i]).isEmpty() ? json.getString(params[i]) : null;
        } catch (Exception e) {
            if (DEBUG) Log.e(TAG, "Failed to get param "+param, e);
            return null;
        }
    }
    public static int getParamInt( String param ){
        String[] params = param.split("\\.");
        //json.getString("owner.username")
//        Log.e("Lỗi 1", params.length + " " +param);
//        Log.e("Lỗi 1.1", JsonParams.DATA.getString("banner").toString() + " " );
        try {
            if (params.length == 1) {
                return Integer.parseInt(JsonParams.DATA.getString(param));
            }
            int i = 0;
            JSONObject json = null;
            for (i = 0; i < params.length-1; i++) {
                json = json != null ? json.getJSONObject( params[i] ) : JsonParams.DATA.getJSONObject( params[i] );
//                JSONObject json = this.jsonTracks.getJSONObject(i);
//                Log.e("Lỗi 1."+i, params[i]);
            }
//            Log.e("Lỗi 1."+i, params[i] + " = "+json.getString(params[i]).toString() );
            return !json.getString(params[i]).isEmpty() ? json.getInt(params[i]) : 0;
        } catch (Exception e) {
//            Log.e("Lỗi", "Failed to get param "+param, e);
            return 0;
        }
    }
}