package com.example.my_vodka.boissons;

public class VinBlanc extends VinInterface {
    public VinBlanc() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // VinBlanc
    private static final String alcoolName = "VinBlanc";
    private static final String informations = "Parfait pour prétendre comprendre l'art de la vinification.";
    private static final float alcoolPrice = 10;
    private static final float alcoolMultiply = 1.2f;
    private static final boolean bonusType = false;
    private static final String speciality = "";
}

