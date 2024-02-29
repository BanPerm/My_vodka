package com.example.my_vodka.boissons;
import com.example.my_vodka.Player;
public abstract class AlcoolAbstract {
    protected String alcoolName;
    protected int alcoolCount;
    protected double alcoolPrice;
    protected double alcoolMultiply;
    protected String bonusType;
    protected String speciality;

    public AlcoolAbstract(String alcoolName, double alcoolPrice, double alcoolMultiply, String bonusType, String speciality) {
        this.alcoolName = alcoolName;
        this.alcoolPrice = alcoolPrice;
        this.alcoolMultiply = alcoolMultiply;
        this.bonusType = bonusType;
        this.speciality = speciality;
        this.alcoolCount = 0;
    }

    public void addAlcool(){
        Player.addAlcool(this);
        alcoolCount++;
    }

    public void clickButton(){

    }

    public String getAlcoolName() {
        return alcoolName;
    }

    public int getAlcoolCount() {
        return alcoolCount;
    }

    public double getAlcoolPrice() {
        return alcoolPrice;
    }

    public double getAlcoolMultiply() {
        return alcoolMultiply;
    }

    public String getBonusType() {
        return bonusType;
    }

    public String getSpeciality() {
        return speciality;
    }
}
