package ru.iiec.cxxdroid.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.view.MenuItem;
import e.c.a.d;
import qwe.qweqwe.texteditor.settings.SettingsActivity;
import ru.iiec.cxxdroid.C0162R;
import ru.iiec.cxxdroid.u;
import ru.iiec.cxxdroid.v;
import ru.iiec.cxxdroid.z;

public class CXXSettingsActivity extends SettingsActivity {

    public static class CxxEditorPreferenceFragment extends SettingsActivity.d {
        public /* synthetic */ boolean a(Preference preference) {
            Activity activity = getActivity();
            activity.setResult(-1, new Intent().putExtra("extra_file_dir", u.q(activity)));
            activity.finish();
            return true;
        }

        @Override // qwe.qweqwe.texteditor.settings.SettingsActivity.d
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            findPreference("editor_new_file_template").setOnPreferenceClickListener(new a(this));
        }
    }

    public static class SystemPreferenceFragment extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C0162R.xml.pref_system);
            setHasOptionsMenu(true);
            SettingsActivity.a(findPreference("clang_compiler_argument"));
            SettingsActivity.a(findPreference("clangpp_compiler_argument"));
            SettingsActivity.a(findPreference("linker_compiler_argument"));
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            getActivity().finish();
            return true;
        }
    }

    private static boolean e(Context context) {
        return SettingsActivity.b(context).getBoolean("allow_void_main", true);
    }

    private static String g(Context context) {
        return e(context) ? " -fallow-void-main" : "";
    }

    private static boolean j(Context context) {
        return SettingsActivity.b(context).getBoolean("link_lib_static", false);
    }

    private static String k(Context context) {
        return j(context) ? " -static-libstdc++" : "";
    }

    public static boolean l(Context context) {
        return SettingsActivity.b(context).getBoolean("always_recompile_programs", false);
    }

    public static boolean m(Context context) {
        return SettingsActivity.b(context).getBoolean("allegro_backexit", true);
    }

    public static boolean n(Context context) {
        return SettingsActivity.b(context).getBoolean("sdl2_backexit", true);
    }

    public static boolean o(Context context) {
        return SettingsActivity.b(context).getBoolean("sfml_backexit", true);
    }

    public static String p(Context context) {
        return SettingsActivity.b(context).getString("clang_compiler_argument", context.getString(C0162R.string.clang_compiler_argument_default_value)) + g(context);
    }

    public static String q(Context context) {
        if (SettingsActivity.b(context).getInt("migrate_system_clangpp_args", 0) < 1) {
            SettingsActivity.b(context).edit().putInt("migrate_system_clangpp_args", 1).commit();
            if ("-Wall -std=c++14".equals(SettingsActivity.b(context).getString("clangpp_compiler_argument", context.getString(C0162R.string.clangpp_compiler_argument_default_value)))) {
                SettingsActivity.b(context).edit().putString("clangpp_compiler_argument", context.getString(C0162R.string.clangpp_compiler_argument_default_value)).commit();
            }
        }
        return SettingsActivity.b(context).getString("clangpp_compiler_argument", context.getString(C0162R.string.clangpp_compiler_argument_default_value)) + g(context);
    }

    public static boolean r(Context context) {
        return SettingsActivity.b(context).getBoolean("use_default_cpp", true);
    }

    public static String s(Context context) {
        return SettingsActivity.b(context).getString("linker_compiler_argument", context.getString(C0162R.string.linker_compiler_argument_default_value)) + k(context);
    }

    @Override // qwe.qweqwe.texteditor.settings.SettingsActivity
    public void b() {
        d dVar = new d();
        dVar.a(z.class.getFields());
        dVar.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.settings.SettingsActivity
    public boolean isValidFragment(String str) {
        return super.isValidFragment(str) || SystemPreferenceFragment.class.getName().equals(str) || CxxEditorPreferenceFragment.class.getName().equals(str);
    }

    /* access modifiers changed from: protected */
    @Override // qwe.qweqwe.texteditor.settings.c, qwe.qweqwe.texteditor.settings.SettingsActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v.f10008b = null;
    }
}
