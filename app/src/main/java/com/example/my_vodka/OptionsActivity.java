package com.example.my_vodka;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "OptionsActivity";

    public static Intent createIntent(Context context) {
        return new Intent(context, OptionsActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        Log.d(TAG, "onCreate: Activity created");// Trouver les boutons dans le layout

        Button soundButton = findViewById(R.id.sound_preference);
        Button musicButton = findViewById(R.id.music_preference);
        Button notificationsButton = findViewById(R.id.notifications_preference);
        Button resetProgressButton = findViewById(R.id.reset_progress_preference);
        Button advancedSettingsButton = findViewById(R.id.advanced_settings_preference);
        Button socialNetworkButton = findViewById(R.id.social_network_preference);

        // Ajouter un OnClickListener à chaque bouton
        soundButton.setOnClickListener(this);
        musicButton.setOnClickListener(this);
        notificationsButton.setOnClickListener(this);
        resetProgressButton.setOnClickListener(this);
        advancedSettingsButton.setOnClickListener(this);
        socialNetworkButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sound_preference:
                // Action à effectuer lorsque le bouton sound est cliqué
                break;
            case R.id.music_preference:
                // Action à effectuer lorsque le bouton music est cliqué
                break;
            case R.id.notifications_preference:
                // Action à effectuer lorsque le bouton notifications est cliqué
                break;
            case R.id.reset_progress_preference:
                // Action à effectuer lorsque le bouton reset progress est cliqué
                break;
            case R.id.advanced_settings_preference:
                // Action à effectuer lorsque le bouton advanced settings est cliqué
                break;
            case R.id.social_network_preference:
                // Action à effectuer lorsque le bouton social network est cliqué
                break;
        }
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
