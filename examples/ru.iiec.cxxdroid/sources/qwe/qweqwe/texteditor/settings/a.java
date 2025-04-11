package qwe.qweqwe.texteditor.settings;

import android.preference.Preference;
import com.google.ads.consent.ConsentInformation;
import qwe.qweqwe.texteditor.settings.SettingsActivity;

/* compiled from: lambda */
public final /* synthetic */ class a implements Preference.OnPreferenceChangeListener {
    private final /* synthetic */ ConsentInformation a;

    public /* synthetic */ a(ConsentInformation consentInformation) {
        this.a = consentInformation;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return SettingsActivity.AboutPreferenceFragment.a(this.a, preference, obj);
    }
}
