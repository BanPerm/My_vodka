package com.example.my_vodka;

import android.view.View;
import android.widget.TextView;

import com.example.my_vodka.boissons.AlcoolAbstract;

import java.util.ArrayList;

public class Player implements View.OnClickListener {
    private float alcoolLevel  = 0;
    private float clickBonus = 0;
    private float passiveBonus = 1;
    private float activeBonus = 1;
    private static ArrayList<AlcoolAbstract> passiveAlcoolList = new ArrayList<>();
    private static ArrayList<AlcoolAbstract> activeAlcoolList = new ArrayList<>();
    private float clickCount = 0;
    private float clickPower = 1;
    private int rebirth = 0;
    private TextView score;

    private void updateScore() {
        if (score != null) {
            score.setText(String.valueOf(this.clickCount));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.player:
                onPlayerButtonClick();
                break;
            case R.id.marketButton:
                // Ne rien faire ici, géré par MainActivity
                break;
            case R.id.quitButton:
                // Ne rien faire ici, géré par MainActivity
                break;
        }
    }

    public void onPlayerButtonClick() {
        alcoolLevel += (clickPower + clickBonus) * (rebirth * rebirth);
        clickCount++;
        updateScore();
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
        if(!a.getBonusType()){
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
