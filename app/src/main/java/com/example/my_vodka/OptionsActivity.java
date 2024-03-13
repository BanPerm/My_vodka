package com.example.my_vodka;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.settings_container, new MyPreferenceFragment())
                .commit();
    }

    public static class MyPreferenceFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);

            // Son
            Preference soundPreference = findPreference("sound_preference");

            // Musique
            Preference musicPreference = findPreference("music_preference");

            // Notifications
            Preference notificationsPreference = findPreference("notifications_preference");

            // Réinitialisation des progrès
            Preference resetProgressPreference = findPreference("reset_progress_preference");

            // Sauvegarde automatique
            Preference autoSavePreference = findPreference("auto_save_preference");

            // Réglages avancés
            Preference advancedSettingsPreference = findPreference("advanced_settings_preference");

            // Réseau social
            Preference socialNetworkPreference = findPreference("social_network_preference");
        }
    }
}
