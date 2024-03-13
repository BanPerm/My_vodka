package com.example.my_vodka.preferences;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.my_vodka.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);

        // Gérer la préférence pour le son
        CheckBoxPreference soundPreference = findPreference("sound_preference");
        soundPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean isChecked = (Boolean) newValue;
                // Mettre en œuvre la logique en fonction de la préférence de son
                // Par exemple, activer ou désactiver le son
                return true; // retourner true si la préférence a été correctement gérée
            }
        });

        // Gérer la préférence pour la musique
        CheckBoxPreference musicPreference = findPreference("music_preference");
        musicPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean isChecked = (Boolean) newValue;
                // Mettre en œuvre la logique en fonction de la préférence de musique
                // Par exemple, démarrer ou arrêter la lecture de musique
                return true; // retourner true si la préférence a été correctement gérée
            }
        });

        // Gérer la préférence pour les notifications
        CheckBoxPreference notificationsPreference = findPreference("notifications_preference");
        notificationsPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                boolean isChecked = (Boolean) newValue;
                // Mettre en œuvre la logique en fonction de la préférence de notifications
                // Par exemple, activer ou désactiver les notifications
                return true; // retourner true si la préférence a été correctement gérée
            }
        });

        // Gérer la préférence pour le réseau social
        Preference socialNetworkPreference = findPreference("social_network_preference");
        socialNetworkPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                // Mettre en œuvre la logique pour se connecter au réseau social
                // Par exemple, ouvrir l'application de réseau social
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com"));
                startActivity(intent);
                return true;
            }
        });

        // Gérer la préférence pour réinitialiser le progrès
        Preference resetProgressPreference = findPreference("reset_progress_preference");
        resetProgressPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                // Mettre en œuvre la logique pour réinitialiser le progrès
                // Par exemple, réinitialiser les données de l'application
                return true;
            }
        });

        // Gérer la préférence pour les paramètres avancés
        Preference advancedSettingsPreference = findPreference("advanced_settings_preference");
        advancedSettingsPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                // Mettre en œuvre la logique pour accéder aux paramètres avancés
                // Par exemple, ouvrir une nouvelle activité pour les paramètres avancés
                return true;
            }
        });
    }
}
