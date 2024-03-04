package com.example.my_vodka.boissons;

public class VinRouge extends VinInterface {
    public VinRouge() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }
    // VinRouge
    private static final String alcoolName = "VinRouge";
    private static final String informations = "Fait croire que vous avez un palais raffiné.";
    private static final float alcoolPrice = 11;
    private static final float alcoolMultiply = 1.3f;
    private static final boolean bonusType = false;
    private static final String speciality = "";


}

