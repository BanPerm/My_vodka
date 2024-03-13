package com.example.my_vodka.boissons;

import com.example.my_vodka.player.Player;

public abstract class AlcoolAbstract {
    protected String alcoolName;
    protected int alcoolCount;
    protected double alcoolPrice;
    protected double alcoolMultiply;
    protected boolean bonusType;
    protected String speciality;
    protected String informations;

    public AlcoolAbstract(String informations, String alcoolName, double alcoolPrice, double alcoolMultiply, boolean bonusType, String speciality) {
        this.informations = informations;
        this.alcoolName = alcoolName;
        this.alcoolPrice = alcoolPrice;
        this.alcoolMultiply = alcoolMultiply;
        this.bonusType = bonusType;
        this.speciality = speciality;
        this.alcoolCount = 0;
    }

    public void addAlcool() {
        Player.addAlcool(this);
        alcoolCount++;
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

    public boolean getBonusType() {
        return bonusType;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getInformations() {
        return informations;
    }

    public double setNewPriceAfterBuy(){
        return this.alcoolPrice = this.alcoolPrice * this.alcoolMultiply;
    }
}
