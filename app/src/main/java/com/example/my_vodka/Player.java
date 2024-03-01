package com.example.my_vodka;

import android.view.View;
import android.widget.TextView;

import com.example.my_vodka.boissons.AlcoolAbstract;

import java.util.ArrayList;

public class Player implements View.OnClickListener {
    private float alcoolLevel  = 0;
    private float clickBonus = 0;
    private float passiveBonus = 0;
    private float activeBonus = 0;
    private static ArrayList<AlcoolAbstract> passiveAlcoolList = new ArrayList<>();
    private static ArrayList<AlcoolAbstract> activeAlcoolList = new ArrayList<>();
    private float clickCount = 0;
    private float clickPower = 1;
    private int rebirth = 0;
    private TextView score;

    @Override
    public void onClick(View v) {
        // Action à effectuer lors du clic sur le bouton
        this.alcoolLevel += (clickPower + clickBonus) * (rebirth * rebirth);
        this.clickCount++;
        score.setText(String.valueOf(this.clickCount));
    }

    // Méthode pour injecter le TextView pour le score
    public void setAlcoolLevelScore(float score) {
        this.alcoolLevel = score;
    }

    public void setAlcoolClickScore(float score) {
        this.clickCount = score;
        if (score > 0 && score != this.clickCount && this.score != null) {
            this.score.setText(String.valueOf(score));
        }
    }


    private void powerUpgrade(int b){
        clickPower += b;
    }

    public void addActiveBonus(double b){
        this.activeBonus += b;
    }

    public void addPassiveBonus(double b){
        this.passiveBonus += b;
    }

    public float calculPassiveBonus(){
        float bonus = 0;
        for(AlcoolAbstract a: passiveAlcoolList){
            //bonus+=a.getPoints();
        }
        bonus *=Math.pow((rebirth+1),2);
        bonus *= passiveBonus;
        return bonus;
    }

    public float calculActiveBonus(){
        float bonus = 0;
        for(AlcoolAbstract a: activeAlcoolList){
            //bonus+=a.getPoints();
        }
        bonus += clickPower;
        bonus *=(rebirth*rebirth);
        bonus *= activeBonus;
        return bonus;
    }

    public void discover(){
        this.clickPower = 1;
        this.clickBonus = 0;
        this.passiveBonus = 0;
        this.alcoolLevel  = 0;
        this.rebirth++;
    }

    public static void addAlcool(AlcoolAbstract a){
        if(a.getBonusType().equals("passive")){
            passiveAlcoolList.add(a);
        }
        else{
            activeAlcoolList.add(a);
        }
    }

    public float getClickCount(){
        return this.clickCount;
    }

    public float getAlcoolLevel (){
        return this.alcoolLevel ;
    }

    public void setScoreTextView(TextView score) {
        this.score=score;
    }
}
