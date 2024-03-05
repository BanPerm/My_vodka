package com.example.my_vodka;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import com.example.my_vodka.boissons.*;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    private ArrayList<AlcoolAbstract> alcoolList = new ArrayList<>();
    private Spinner alcoolSpinner;

    public static Intent createIntent(Context context) {
        return new Intent(context, MarketActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        alcoolSpinner = findViewById(R.id.alcool_spinner);
        initializeData();
        updateUI();
    }

    private void initializeData() {
        alcoolList.add(new Absinthe());
        alcoolList.add(new Biere());
        alcoolList.add(new Cidre());
        alcoolList.add(new Cocoroco());
        alcoolList.add(new Cognac());
        alcoolList.add(new EauDeVie());
        alcoolList.add(new Panache());
        alcoolList.add(new Pastis());
        alcoolList.add(new Rhum());
        alcoolList.add(new Sake());
        alcoolList.add(new Tequila());
        alcoolList.add(new VinBlanc());
        alcoolList.add(new VinRose());
        alcoolList.add(new VinRouge());
        alcoolList.add(new Vodka());
        alcoolList.add(new Whisky());
    }

    private void updateUI() {
        ArrayAdapter<AlcoolAbstract> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, alcoolList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alcoolSpinner.setAdapter(adapter);
    }
}
