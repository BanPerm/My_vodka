package com.example.my_vodka;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.DrawableRes;

import com.example.my_vodka.boissons.AlcoolAbstract;

import java.util.ArrayList;

public class Player extends Activity implements View.OnClickListener {
    private double tauxAlcoolemie = 0;
    private double bonusClick = 0;
    private double bonusPassif = 0;
    private double bonusActif = 0;
    private ArrayList<AlcoolAbstract> list_alcool_passif = new ArrayList<AlcoolAbstract>();
    private ArrayList<AlcoolAbstract> list_alcool_actif = new ArrayList<AlcoolAbstract>();
    private int nbClick = 0;
    private int puissanceClick = 1;
    private int rebirth = 0;


    public Player(){
        Button button = (Button)findViewById(R.id.player);
        button.setOnClickListener(this);
    }

    // Implement the OnClickListener callback
    public void onClick(View v) {
        clickPlayer();
    }

    private void clickPlayer(){
        this.tauxAlcoolemie += (puissanceClick+bonusClick)*(rebirth*rebirth);
        this.nbClick++;
    }

    private void augmentePuissance(int b){
        puissanceClick += b;
    }

    public void addBonusActif(double b){
        this.bonusActif += b;
    }

    public void addBonusPassif(double b){
        this.bonusPassif += b;
    }

    public double calculBonusPassif(){
        double bonus = 0;
        for(AlcoolAbstract a: list_alcool_passif){
            bonus+=a.getPoints();
        }
        bonus *=Math.pow((rebirth+1),2);
        bonus *= bonusPassif;
        return bonus;
    }

    public double calculBonusActif(){
        double bonus = 0;
        for(AlcoolAbstract a: list_alcool_actif){
            bonus+=a.getPoints();
        }
        bonus += puissanceClick;
        bonus *=(rebirth*rebirth);
        bonus *= bonusActif;
        return bonus;
    }

    public void decuve(){
        this.puissanceClick = 1;
        this.bonusClick = 0;
        this.bonusPassif = 0;
        this.tauxAlcoolemie = 0;
        this.rebirth++;
    }

    public void addAlcool(AlcoolAbstract a){
        if(a.type.equals("passif")){
            list_alcool_passif.add(a);
        }
        else{
            list_alcool_actif.add(a);
        }
    }

    public int getNbClick(){
        return this.nbClick;
    }

    public double getTauxAlcoolemie(){
        return this.tauxAlcoolemie;
    }

}
