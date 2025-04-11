package com.tglt.code.editor.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;

import com.tglt.code.editor.client.ClientInfo;

public class AppPreferences {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    public static final String prefClient = "prefClient";

    public AppPreferences(Context context) {
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.editor = sharedPreferences.edit();
        this.context = context;
    }

    public void clears() {
        editor.clear();
        editor.commit();
    }

    public Set<String> getClients() {
        return sharedPreferences.getStringSet(prefClient, new HashSet<String>());
    }

    public void setClients(Set<String> favoriteApps) {
        editor.remove(prefClient);
        editor.commit();
        editor.putStringSet(prefClient, favoriteApps);
        editor.commit();
    }

}
