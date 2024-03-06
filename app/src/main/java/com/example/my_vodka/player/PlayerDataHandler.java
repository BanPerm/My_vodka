package com.example.my_vodka.player;

import android.content.Context;
import android.content.SharedPreferences;

public class PlayerDataHandler implements DataHandler {
    private static final String PREFS_NAME = "PlayerPrefs";

    private static final String KEY_ALCOOL_LEVEL = "alcoolLevel";
    private static final String KEY_CLICK_COUNT = "clickCount";

    private Context context;

    public PlayerDataHandler(Context context) {
        this.context = context;
    }

    @Override
    public void savePlayerData(Player player) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(KEY_ALCOOL_LEVEL, player.getAlcoolLevel());
        editor.putFloat(KEY_CLICK_COUNT, player.getClickCount());
        editor.apply();
    }

    @Override
    public void loadPlayerData(Player player) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        player.setAlcoolLevelScore(prefs.getFloat(KEY_ALCOOL_LEVEL, 0));
        player.setAlcoolClickScore(prefs.getFloat(KEY_CLICK_COUNT, 0));
    }

    public static String getPrefsName() {
        return PREFS_NAME;
    }

    public static String getKeyAlcoolLevel() {
        return KEY_ALCOOL_LEVEL;
    }

    public static String getKeyClickCount(){
        return KEY_CLICK_COUNT;
    }
}
