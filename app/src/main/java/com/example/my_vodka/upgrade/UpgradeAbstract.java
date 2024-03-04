package com.example.my_vodka.upgrade;
import com.example.my_vodka.Player;

public abstract class UpgradeAbstract {
    protected String alcoolName;
    protected int alcoolCount;
    protected double alcoolPrice;
    protected double alcoolMultiply;
    protected float passiveBonus;
    protected float activeBonus;
    protected String speciality;
    protected String informations;

    public UpgradeAbstract(String informations, String alcoolName, double alcoolPrice, double alcoolMultiply, float activeBonus, float passiveBonus, String speciality) {
        this.informations = informations;
        this.alcoolName = alcoolName;
        this.alcoolPrice = alcoolPrice;
        this.alcoolMultiply = alcoolMultiply;
        this.passiveBonus = passiveBonus;
        this.activeBonus = activeBonus;
        this.speciality = speciality;
        this.alcoolCount = 0;
    }

    public String getUpgradeName() {
        return alcoolName;
    }

    public int getUpgradeCount() {
        return alcoolCount;
    }

    public double getUpgradePrice() {
        return alcoolPrice;
    }

    public double getAlcoolMultiply() {
        return alcoolMultiply;
    }

    public float getPassiveBonus() {
        return passiveBonus;
    }

    public float getActiveBonus() {
        return activeBonus;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getInformations() {
        return informations;
    }
}
