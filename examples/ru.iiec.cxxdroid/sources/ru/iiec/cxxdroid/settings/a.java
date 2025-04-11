package ru.iiec.cxxdroid.settings;

import android.preference.Preference;
import ru.iiec.cxxdroid.settings.CXXSettingsActivity;

/* compiled from: lambda */
public final /* synthetic */ class a implements Preference.OnPreferenceClickListener {
    private final /* synthetic */ CXXSettingsActivity.CxxEditorPreferenceFragment a;

    public /* synthetic */ a(CXXSettingsActivity.CxxEditorPreferenceFragment cxxEditorPreferenceFragment) {
        this.a = cxxEditorPreferenceFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        return this.a.a(preference);
    }
}
