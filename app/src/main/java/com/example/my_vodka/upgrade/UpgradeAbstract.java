package com.example.my_vodka.upgrade;

public abstract class UpgradeAbstract {
    protected String alcoolName;
    protected int alcoolCount;
    protected double alcoolPrice;
    protected double alcoolMultiply;
    protected boolean bonusType;
    protected String speciality;
    protected String informations;

    public UpgradeAbstract(String informations, String upgradeName, double upgradePrice, double uprgradeMultiply, boolean bonusType, String speciality) {
        this.informations = informations;
        this.alcoolName = upgradeName;
        this.alcoolPrice = upgradePrice;
        this.alcoolMultiply = uprgradeMultiply;
        this.bonusType = bonusType;
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

    public double getUpgradeMultiply() {
        return alcoolMultiply;
    }

    public boolean getUpgradeBonusType() {
        return bonusType;
    }

    public String getUpgradeSpeciality() {
        return speciality;
    }

    public String getUpgradeInformations() {
        return informations;
    }
}
