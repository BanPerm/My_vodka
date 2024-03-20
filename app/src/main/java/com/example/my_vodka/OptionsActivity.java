package com.example.my_vodka;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "OptionsActivity";
    private static final String PREFS_NAME = "MyPrefs";
    private static final String SOUND_PREF_KEY = "sound_preference";
    private static final String MUSIC_PREF_KEY = "music_preference";
    private static final String NOTIFICATIONS_PREF_KEY = "notifications_preference";

    private boolean soundEnabled;
    private boolean musicEnabled;
    private boolean notificationsEnabled;

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

        soundButton.setOnClickListener(this);
        musicButton.setOnClickListener(this);
        notificationsButton.setOnClickListener(this);

        // Charger les préférences
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        soundEnabled = prefs.getBoolean(SOUND_PREF_KEY, true);
        musicEnabled = prefs.getBoolean(MUSIC_PREF_KEY, true);
        notificationsEnabled = prefs.getBoolean(NOTIFICATIONS_PREF_KEY, true);

        updateButtonUI(soundButton, soundEnabled);
        updateButtonUI(musicButton, musicEnabled);
        updateButtonUI(notificationsButton, notificationsEnabled);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sound_preference:
                soundEnabled = !soundEnabled;
                updatePreference(SOUND_PREF_KEY, soundEnabled);
                break;
            case R.id.music_preference:
                musicEnabled = !musicEnabled;
                updatePreference(MUSIC_PREF_KEY, musicEnabled);
                break;
            case R.id.notifications_preference:
                notificationsEnabled = !notificationsEnabled;
                updatePreference(NOTIFICATIONS_PREF_KEY, notificationsEnabled);
                break;

                /* TODO
            case R.id.reset_progress_preference:
                // Action à effectuer lorsque le bouton reset progress est cliqué
                // Par exemple, réinitialiser les données de l'application
                resetProgressPreference();
                break;
            case R.id.advanced_settings_preference:
                // Action à effectuer lorsque le bouton advanced settings est cliqué
                // Par exemple, ouvrir une nouvelle activité pour les paramètres avancés
                openAdvancedSettings();
                break;
            case R.id.social_network_preference:
                // Action à effectuer lorsque le bouton social network est cliqué
                // Par exemple, ouvrir l'application de réseau social
                openSocialNetwork();
                break;*/
        }
    }

    private void updateButtonUI(Button button, boolean isEnabled) {
        if (isEnabled) {
            button.setText("Desactivé");
        } else {
            button.setText("Activé");
        }
    }

    private void updatePreference(String key, boolean value) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.apply();
        // Mettre à jour l'UI du bouton
        Button buttonToUpdate;
        switch (key) {
            case SOUND_PREF_KEY:
                buttonToUpdate = findViewById(R.id.sound_preference);
                break;
            case MUSIC_PREF_KEY:
                buttonToUpdate = findViewById(R.id.music_preference);
                break;
            case NOTIFICATIONS_PREF_KEY:
                buttonToUpdate = findViewById(R.id.notifications_preference);
                break;
            default:
                return;
        }
        updateButtonUI(buttonToUpdate, value);
    }
}
