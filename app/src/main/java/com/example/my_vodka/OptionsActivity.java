package com.example.my_vodka;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.settings_container, new MyPreferenceFragment())
                .commit();
    }

    public class MyPreferenceFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);

            // Son
            Preference soundPreference = findPreference("sound_preference");

            // Musique
            Preference musicPreference = findPreference("music_preference");

            // Langue (exemple)
            Preference languagePreference = findPreference("language_preference");

            // Niveau de difficulté
            Preference difficultyPreference = findPreference("difficulty_preference");

            // Notifications
            Preference notificationsPreference = findPreference("notifications_preference");

            // Graphismes
            Preference graphicsPreference = findPreference("graphics_preference");

            // Réinitialisation des progrès
            Preference resetProgressPreference = findPreference("reset_progress_preference");

            // Sauvegarde automatique
            Preference autoSavePreference = findPreference("auto_save_preference");

            // Réglages avancés (exemple)
            Preference advancedSettingsPreference = findPreference("advanced_settings_preference");

            // Écran tactile (exemple)
            Preference touchScreenPreference = findPreference("touch_screen_preference");

            // Réseau social (exemple)
            Preference socialNetworkPreference = findPreference("social_network_preference");
        }
    }
}

