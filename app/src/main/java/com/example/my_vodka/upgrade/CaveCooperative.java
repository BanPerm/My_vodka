package com.example.my_vodka.upgrade;

public class CaveCooperative extends UpgradeAbstract{
    public CaveCooperative() {
        super(informations, upgradeName, upgradePrice, uprgradeMultiply, bonusType, speciality);
    }

    // Biere
    private static final String upgradeName = "Biere";
    private static final String informations = "L'alcool ? C'est toute me vie !";
    private static final float upgradePrice = 5;
    private static final float uprgradeMultiply = 1.2f;
    private static final boolean bonusType = false;
    private static final String speciality = "";
}
