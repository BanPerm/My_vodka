package com.example.my_vodka.boissons;

public class Cocoroco extends AlcoolAbstract {
    public Cocoroco() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Cocoroco
    private static final String alcoolName = "Cocoroco";
    private static final String informations = "Si fort qu'il pourrait faire démarrer un porte-conteneur.";
    private static final float alcoolPrice = 25;
    private static final float alcoolMultiply = 4.0f;
    private static final boolean bonusType = true;
    private static final String speciality = "";


}
