package com.example.my_vodka;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.my_vodka.boissons.AlcoolAbstract;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Player player;
    private PlayerDataHandler playerDataHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new Player();
        playerDataHandler = new PlayerDataHandler(getApplicationContext());

        // Logs de débogage pour la sauvegarde des données du joueur
        Log.d("PlayerDataHandler", "Saving player data: Alcool Level = " + player.getAlcoolLevel() + ", Click Count = " + player.getClickCount());

        // Logs de débogage pour le chargement des données du joueur
        playerDataHandler.loadPlayerData(player);
        SharedPreferences prefs = getSharedPreferences(PlayerDataHandler.getPrefsName(), Context.MODE_PRIVATE);
        Log.d("PlayerDataHandler", "Loading player data: Alcool Level = " + prefs.getFloat(PlayerDataHandler.getKeyAlcoolLevel(), 0) + ", Click Count = " + prefs.getFloat(PlayerDataHandler.getKeyClickCount(), 0));

        ImageButton button = findViewById(R.id.player);
        TextView score = findViewById(R.id.score);

        // Mettez à jour le score avec la valeur correcte
        score.setText(String.valueOf(player.getClickCount()));

        // Injectez la dépendance Player dans l'écouteur de clic
        button.setOnClickListener(player);
        player.setScoreTextView(score);
    }

    @Override
    protected void onPause() {
        super.onPause();
        playerDataHandler.savePlayerData(player);
    }

    @Override
    protected void onStop() {
        super.onStop();
        playerDataHandler.savePlayerData(player);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        playerDataHandler.savePlayerData(player);
    }


}

