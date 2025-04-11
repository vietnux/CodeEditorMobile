package iiec.androidterm;

import android.app.ActionBar;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.view.MenuItem;
import iiec.androidterm.compat.a;

public class TermPreferences extends PreferenceActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ActionBar actionBar;
        super.onCreate(bundle);
        addPreferencesFromResource(n.preferences);
        if (a.a < 11) {
            Preference findPreference = findPreference("actionbar");
            PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("screen");
            if (!(findPreference == null || preferenceCategory == null)) {
                preferenceCategory.removePreference(findPreference);
            }
        }
        if (a.f9281b && (actionBar = getActionBar()) != null) {
            actionBar.setDisplayOptions(4, 4);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
