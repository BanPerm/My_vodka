package com.example.my_vodka;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.my_vodka.boissons.*;

import java.util.ArrayList;
import java.util.List;

public class MarketActivity extends AppCompatActivity {

    private static final String TAG = "MarketActivity";

    private ArrayList<AlcoolAbstract> alcoolList = new ArrayList<>();
    private ArrayList<String> alcoolNames = new ArrayList<>();

    private Spinner alcoolSpinner;

    public static Intent createIntent(Context context) {
        return new Intent(context, MarketActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        Log.d(TAG, "onCreate: Activity created");

        alcoolSpinner = findViewById(R.id.alcool_spinner);
        initializeData();
        updateUI();
    }

    private void initializeData() {
        Log.d(TAG, "initializeData: Initializing data");

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


        for (AlcoolAbstract alcool : alcoolList) {
            Log.d(TAG, "initializeData: " +alcool.getAlcoolName());
            alcoolNames.add(alcool.getAlcoolName());
        }

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, alcoolNames);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        alcoolSpinner.setAdapter(spinnerAdapter);
    }

    private void updateUI() {
        Log.d(TAG, "updateUI: Updating UI");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alcoolNames) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                // Personnalisation de l'apparence de l'élément de vue
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                textView.setTextColor(ContextCompat.getColor(getContext(), android.R.color.black));
                textView.setGravity(Gravity.CENTER_VERTICAL);

                // Ajout d'une image à gauche
                Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.logo);
                int imageSize = (int) (getResources().getDisplayMetrics().density * 24); // Taille de l'image en dp
                drawable.setBounds(0, 0, imageSize, imageSize); // Redimensionner l'image
                textView.setCompoundDrawables(drawable, null, null, null);
                textView.setCompoundDrawablePadding(50); // Ajustez l'espacement entre l'image et le texte

                return view;
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                // Utilisez la même personnalisation pour les éléments déroulants
                return getView(position, convertView, parent);
            }
        };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alcoolSpinner.setAdapter(adapter);
    }




}
