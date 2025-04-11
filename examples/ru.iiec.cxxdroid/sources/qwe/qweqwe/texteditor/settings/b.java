package qwe.qweqwe.texteditor.settings;

import android.preference.Preference;
import qwe.qweqwe.texteditor.settings.SettingsActivity;

/* compiled from: lambda */
public final /* synthetic */ class b implements Preference.OnPreferenceClickListener {
    private final /* synthetic */ SettingsActivity.AboutPreferenceFragment a;

    public /* synthetic */ b(SettingsActivity.AboutPreferenceFragment aboutPreferenceFragment) {
        this.a = aboutPreferenceFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        return this.a.a(preference);
    }
}
