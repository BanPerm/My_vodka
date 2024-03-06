package com.example.my_vodka;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Player player;
    private PlayerDataHandler playerDataHandler;
    private boolean isMenuOpen = true;
    private ImageView arrowButton;
    private ScrollView menuLayout;

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

        ImageButton scoreButton = findViewById(R.id.player);
        ImageButton marketButton = findViewById(R.id.marketButton);
        ImageButton quitButton = findViewById(R.id.quitButton);

        TextView score = findViewById(R.id.score);

        score.setText(String.valueOf(player.getClickCount()));

        scoreButton.setOnClickListener(player);
        marketButton.setOnClickListener(player);
        quitButton.setOnClickListener(player);
        player.setScoreTextView(score);

        //Création menu toggle
        arrowButton = findViewById(R.id.arrowButton);
        menuLayout = findViewById(R.id.menuScrollView);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.player:
                player.onPlayerButtonClick();
                Log.d("MainActivity", "Market button clicked. Starting MarketActivity...");

                break;
            case R.id.marketButton:
                Log.d("MainActivity", "Market button clicked. Starting MarketActivity...");
                startActivity(MarketActivity.createIntent(this));
                break;
            case R.id.quitButton:
                // Faire quelque chose lorsque le bouton "quit" est cliqué
                break;
        }
    }


    public void toggleMenu(View view) {
        if (isMenuOpen) {
            Log.i("test","clicked open");
            menuLayout.setVisibility(View.GONE);
            arrowButton.setRotation(0);
            arrowButton.setTranslationY(150*view.getResources().getDisplayMetrics().density);
        } else {
            Log.i("test","clicked closed");
            menuLayout.setVisibility(View.VISIBLE);
            arrowButton.setRotation(180);
            arrowButton.setTranslationY(0);
        }
        isMenuOpen = !isMenuOpen;
    }

    private void openMenu() {
        menuLayout.setVisibility(View.VISIBLE);
        arrowButton.setImageResource(R.drawable.arrowtest);
    }

    private void closeMenu() {
        menuLayout.setVisibility(View.GONE);
        arrowButton.setImageResource(R.drawable.arrowtest);
    }
}

