package com.example.my_vodka.upgrade;

public class CasqueABiere extends UpgradeAbstract{
    public CasqueABiere() {
        super(informations, upgradeName, upgradePrice, uprgradeMultiply, bonusType, speciality);
    }
    // Biere
    private static final String upgradeName = "Biere";
    private static final String informations = "Un coup à gauche, un coup à droite, un coup aux chiottes.";
    private static final float upgradePrice = 5;
    private static final float uprgradeMultiply = 1.2f;
    private static final boolean bonusType = false;
    private static final String speciality = "";

}
