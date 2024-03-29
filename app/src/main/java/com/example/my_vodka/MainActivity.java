package com.example.my_vodka;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.my_vodka.boissons.Absinthe;
import com.example.my_vodka.boissons.AlcoolAbstract;
import com.example.my_vodka.boissons.Biere;
import com.example.my_vodka.boissons.Cidre;
import com.example.my_vodka.boissons.Cocoroco;
import com.example.my_vodka.boissons.Cognac;
import com.example.my_vodka.boissons.EauDeVie;
import com.example.my_vodka.boissons.Panache;
import com.example.my_vodka.boissons.Pastis;
import com.example.my_vodka.boissons.Rhum;
import com.example.my_vodka.boissons.Sake;
import com.example.my_vodka.boissons.Tequila;
import com.example.my_vodka.boissons.VinBlanc;
import com.example.my_vodka.boissons.VinRose;
import com.example.my_vodka.boissons.VinRouge;
import com.example.my_vodka.boissons.Vodka;
import com.example.my_vodka.boissons.Whisky;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.my_vodka.player.Player;
import com.example.my_vodka.player.PlayerDataHandler;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Player player;
    private PlayerDataHandler playerDataHandler;
    private boolean isMenuOpen = true;
    private TextView score;
    private ImageView arrowButton;
    private ConstraintLayout menuLayout;
    private ArrayList<AlcoolAbstract> list_alcohol = new ArrayList<>();

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
        Button marketButton = findViewById(R.id.marketButton);
        Button preferences = findViewById(R.id.preferences);
        Button quitButton = findViewById(R.id.quitButton);

        score = findViewById(R.id.score);

        score.setText(String.valueOf(player.getClickCount()));

        scoreButton.setOnClickListener(this);
        marketButton.setOnClickListener(this);
        preferences.setOnClickListener(this);
        quitButton.setOnClickListener(this);
        player.setScoreTextView(score);

        //Création menu toggle
        arrowButton = findViewById(R.id.arrowButton);
        menuLayout = findViewById(R.id.menu);
        createListAlcohol();
        afficherAlcohol();
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
                Log.d("MainActivity", "Player button clicked.");
                break;
            case R.id.marketButton:
                Log.d("MainActivity", "Market button clicked. Starting MarketActivity...");
                Intent marketIntent = MarketActivity.createIntent(this);
                startActivity(marketIntent);
                break;
            case R.id.preferences:
                Intent preferences = OptionsActivity.createIntent(this);
                startActivity(preferences);
                break;
            case R.id.quitButton:
                onDestroy();
                break;
        }
    }


    private void createListAlcohol(){
        list_alcohol.add(new Biere());//5
        list_alcohol.add(new Panache());//6
        list_alcohol.add(new Cidre());//7
        list_alcohol.add(new Vodka());//8
        list_alcohol.add(new VinRose());//9
        list_alcohol.add(new Pastis());//10
        list_alcohol.add(new VinBlanc());//10
        list_alcohol.add(new VinRouge());//11
        list_alcohol.add(new Rhum());//12
        list_alcohol.add(new EauDeVie());//15
        list_alcohol.add(new Tequila());//15
        list_alcohol.add(new Sake());//18
        list_alcohol.add(new Absinthe());//20
        list_alcohol.add(new Cocoroco());//25
        list_alcohol.add(new Whisky());//25
        list_alcohol.add(new Cognac());//30
    }


    private void afficherAlcohol() {
        LinearLayout menu = findViewById(R.id.menuLayout);
        LayoutInflater inflater = LayoutInflater.from(this);

        for (AlcoolAbstract a: list_alcohol) {
            View itemView = inflater.inflate(R.layout.item_buymenu, menu, false);
            ImageView imageView = itemView.findViewById(R.id.imageView);
            TextView text = itemView.findViewById(R.id.textView);
            Button button = itemView.findViewById(R.id.button);
            text.setText(""+a.getAlcoolName());
            button.setText(""+a.getAlcoolPrice());


            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.setMargins(0, 0, 0, 50);
            itemView.setLayoutParams(params);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (player.getAlcoolLevel()>a.getAlcoolPrice()){
                        player.setAlcoolLevelScore((float) (player.getAlcoolLevel()-a.getAlcoolPrice()));
                        score.setText(""+player.getAlcoolLevel());
                        double newPrice = a.setNewPriceAfterBuy();

                        String formattedPrice;
                        if (Math.abs(newPrice) >= 1.0e10 || Math.abs(newPrice) < 0.01) {
                            formattedPrice = String.format(Locale.US, "%.2e", newPrice);
                        } else {
                            formattedPrice = String.format(Locale.US, "%.2f", newPrice);
                        }
                        button.setText(formattedPrice);
                        //Calcul bonus player
                    }

                }
            });

            menu.addView(itemView);
        }
    }

    public void toggleMenu(View view) {
        if (isMenuOpen) {
            closeMenu(view);
        } else {
            openMenu(view);
        }
        isMenuOpen = !isMenuOpen;
    }

    private void openMenu(View view) {
        //menuLayout.setVisibility(View.VISIBLE);
        arrowButton.setRotation(180);
        menuLayout.setTranslationY(0);
    }

    private void closeMenu(View view) {
        //menuLayout.setVisibility(View.GONE);
        arrowButton.setRotation(0);
        menuLayout.setTranslationY(250*view.getResources().getDisplayMetrics().density);
    }
}

