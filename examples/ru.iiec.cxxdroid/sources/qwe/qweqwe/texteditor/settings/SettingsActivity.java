package qwe.qweqwe.texteditor.settings;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.RingtonePreference;
import android.preference.SwitchPreference;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import java.util.List;
import qwe.qweqwe.texteditor.b0;
import qwe.qweqwe.texteditor.q0;
import qwe.qweqwe.texteditor.s0;
import qwe.qweqwe.texteditor.u0.u;

public abstract class SettingsActivity extends c {

    /* renamed from: c  reason: collision with root package name */
    private static String f9681c = "show_autocomplete_toggle_info";

    /* renamed from: d  reason: collision with root package name */
    public static String f9682d = "ru.iiec.pydroid";

    /* renamed from: e  reason: collision with root package name */
    public static String f9683e = "";

    /* renamed from: f  reason: collision with root package name */
    private static Preference.OnPreferenceChangeListener f9684f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static String f9685g = "pastebin_never_again";

    @TargetApi(11)
    public static class AboutPreferenceFragment extends PreferenceFragment {

        class a implements Preference.OnPreferenceClickListener {
            a() {
            }

            public boolean onPreferenceClick(Preference preference) {
                try {
                    u.b(AboutPreferenceFragment.this.getActivity(), SettingsActivity.f9682d);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
        }

        class b implements Preference.OnPreferenceClickListener {
            b() {
            }

            public boolean onPreferenceClick(Preference preference) {
                try {
                    ((SettingsActivity) AboutPreferenceFragment.this.getActivity()).b();
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return true;
                }
            }
        }

        static /* synthetic */ boolean a(ConsentInformation consentInformation, Preference preference, Object obj) {
            consentInformation.a(((Boolean) obj).booleanValue() ? ConsentStatus.PERSONALIZED : ConsentStatus.NON_PERSONALIZED);
            return true;
        }

        public /* synthetic */ boolean a(Preference preference) {
            try {
                startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "iiecdev+" + b0.a() + "_14ce01520acd@gmail.com", null)), "Send email"));
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return true;
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_about);
            if (b0.d()) {
                addPreferencesFromResource(s0.pref_about_for_pro);
                findPreference("pref_pro_support").setOnPreferenceClickListener(new b(this));
            }
            setHasOptionsMenu(true);
            Preference findPreference = findPreference("pref_version");
            findPreference.setSummary(SettingsActivity.f9683e);
            findPreference.setOnPreferenceClickListener(new a());
            findPreference("pref_licenses").setOnPreferenceClickListener(new b());
            ConsentInformation a2 = ConsentInformation.a(getActivity());
            SwitchPreference switchPreference = (SwitchPreference) findPreference("pref_consent");
            if (a2.a() == ConsentStatus.PERSONALIZED) {
                switchPreference.setChecked(true);
            } else {
                ConsentStatus consentStatus = ConsentStatus.NON_PERSONALIZED;
                switchPreference.setChecked(false);
            }
            switchPreference.setOnPreferenceChangeListener(new a(a2));
            if (SettingsActivity.b(getActivity()) == 2) {
                getPreferenceScreen().removePreference(switchPreference);
            }
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class AppearancePreferenceFragment extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_appearance);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("appearance_editor_theme"));
            SettingsActivity.a(findPreference("appearance_editor_theme_dark"));
            SettingsActivity.a(findPreference("editor_font"));
            SettingsActivity.a(findPreference("editor_font_size"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    class a implements Preference.OnPreferenceChangeListener {
        a() {
        }

        public boolean onPreferenceChange(Preference preference, Object obj) {
            String obj2 = obj.toString();
            CharSequence charSequence = null;
            if (preference instanceof ListPreference) {
                ListPreference listPreference = (ListPreference) preference;
                int findIndexOfValue = listPreference.findIndexOfValue(obj2);
                if (findIndexOfValue >= 0) {
                    charSequence = listPreference.getEntries()[findIndexOfValue];
                }
            } else {
                if (preference instanceof RingtonePreference) {
                    if (TextUtils.isEmpty(obj2)) {
                        preference.setSummary(q0.pref_ringtone_silent);
                        return true;
                    }
                    Ringtone ringtone = RingtoneManager.getRingtone(preference.getContext(), Uri.parse(obj2));
                    if (ringtone != null) {
                        obj2 = ringtone.getTitle(preference.getContext());
                    }
                }
                preference.setSummary(obj2);
                return true;
            }
            preference.setSummary(charSequence);
            return true;
        }
    }

    @TargetApi(11)
    public static class b extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_code_analysis);
            setHasOptionsMenu(true);
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class c extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_data_sync);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("sync_frequency"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class d extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_editor);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("editor_tab_length"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class e extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_general);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("example_text"));
            SettingsActivity.a(findPreference("example_list"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class f extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_notification);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("notifications_new_message_ringtone"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    @TargetApi(11)
    public static class g extends PreferenceFragment {

        class a implements Preference.OnPreferenceClickListener {
            a() {
            }

            public boolean onPreferenceClick(Preference preference) {
                g.this.a();
                return true;
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void a() {
            SettingsActivity.a(getActivity(), "ru.iiec.pydroidpermissionsplugin");
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(s0.pref_system);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("tkinter_dpi"));
            findPreference("additional_permissions_key").setOnPreferenceClickListener(new a());
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    public static void a(Context context, String str) {
        try {
            if (u.a("ru.iiec.pydroidpermissionsplugin", context.getPackageManager())) {
                context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", "ru.iiec.pydroidpermissionsplugin", null)));
            } else {
                u.b(context, str);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, boolean z) {
        b(context).edit().putBoolean("dark_theme", z).apply();
    }

    /* access modifiers changed from: protected */
    public static void a(Preference preference) {
        preference.setOnPreferenceChangeListener(f9684f);
        f9684f.onPreferenceChange(preference, PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
    }

    public static boolean a(Context context) {
        return b(context).getBoolean("dark_theme", false);
    }

    /* access modifiers changed from: private */
    public static int b(Activity activity) {
        try {
            return activity.getIntent().getIntExtra("extra_premium", 1);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    protected static SharedPreferences b(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void b(Context context, boolean z) {
        b(context).edit().putBoolean("editor_tab_insert_spaces", z).apply();
    }

    private void c() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            f9683e = packageInfo.versionName;
            f9682d = packageInfo.packageName;
        } catch (Exception unused) {
        }
    }

    public static void c(Context context, boolean z) {
        b(context).edit().putBoolean(f9685g, z).apply();
    }

    public static boolean c(Context context) {
        return b(context).getBoolean("editor_tab_insert_spaces", false);
    }

    private void d() {
        androidx.appcompat.app.a a2 = a();
        if (a2 != null) {
            a2.d(true);
        }
    }

    public static void d(Context context, boolean z) {
        b(context).edit().putBoolean("editor_open_last_files", z).apply();
    }

    public static boolean d(Context context) {
        return b(context).getBoolean(f9685g, false);
    }

    private static long e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1048576;
        } catch (NullPointerException e2) {
            e2.printStackTrace();
            return 1024;
        }
    }

    public static void e(Context context, boolean z) {
        b(context).edit().putBoolean(f9681c, z).apply();
    }

    public static boolean f(Context context) {
        return b(context).getBoolean(f9681c, false);
    }

    private static boolean g(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 4;
    }

    public static String h(Context context) {
        if (b(context).getString("pref_omp_num_threads", null) == null) {
            SharedPreferences.Editor edit = b(context).edit();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(e(context) > 2000 ? Runtime.getRuntime().availableProcessors() : 1);
            edit.putString("pref_omp_num_threads", sb.toString()).commit();
        }
        return b(context).getString("pref_omp_num_threads", null);
    }

    public static boolean i(Context context) {
        return b(context).getBoolean("editor_open_last_files", false);
    }

    public abstract void b();

    /* access modifiers changed from: protected */
    public boolean isValidFragment(String str) {
        return PreferenceFragment.class.getName().equals(str) || e.class.getName().equals(str) || c.class.getName().equals(str) || f.class.getName().equals(str) || g.class.getName().equals(str) || d.class.getName().equals(str) || AboutPreferenceFragment.class.getName().equals(str) || AppearancePreferenceFragment.class.getName().equals(str) || b.class.getName().equals(str);
    }

    @Override // android.preference.PreferenceActivity
    @TargetApi(11)
    public void onBuildHeaders(List<PreferenceActivity.Header> list) {
        loadHeadersFromResource(s0.pref_headers, list);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.settings.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h(this);
        d();
        c();
    }

    public boolean onIsMultiPane() {
        return g(this);
    }
}
