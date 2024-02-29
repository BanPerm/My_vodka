package com.example.my_vodka;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.DrawableRes;

import com.example.my_vodka.boissons.AlcoolAbstract;

import java.util.ArrayList;

public class Player extends Activity implements View.OnClickListener {
    private double alcoolLevel  = 0;
    private double clickBonus = 0;
    private double passiveBonus = 0;
    private double activeBonus = 0;
    private static ArrayList<AlcoolAbstract> passiveAlcoolList = new ArrayList<AlcoolAbstract>();
    private static ArrayList<AlcoolAbstract> activeAlcoolList = new ArrayList<AlcoolAbstract>();
    private int clickCount = 0;
    private int clickPower = 1;
    private int rebirth = 0;


    public Player(){
        ImageButton button = (ImageButton) findViewById(R.id.player);
        button.setOnClickListener(this);
    }

    // Implement the OnClickListener callback
    public void onClick(View v) {
        this.alcoolLevel  += (clickPower+clickBonus)*(rebirth*rebirth);
        this.clickCount++;
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

    public double calculPassiveBonus(){
        double bonus = 0;
        for(AlcoolAbstract a: passiveAlcoolList){
            bonus+=a.getPoints();
        }
        bonus *=Math.pow((rebirth+1),2);
        bonus *= passiveBonus;
        return bonus;
    }

    public double calculActiveBonus(){
        double bonus = 0;
        for(AlcoolAbstract a: activeAlcoolList){
            bonus+=a.getPoints();
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

    public int getClickCount(){
        return this.clickCount;
    }

    public double getAlcoolLevel (){
        return this.alcoolLevel ;
    }

}
