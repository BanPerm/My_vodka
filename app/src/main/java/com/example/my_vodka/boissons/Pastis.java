package com.example.my_vodka.boissons;

public class Pastis extends AlcoolAbstract {
    public Pastis() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Pastis
    private static final String alcoolName = "Pastis";
    private static final String informations = "Transforme instantanément n'importe quel endroit en Provence.";
    private static final float alcoolPrice = 10;
    private static final float alcoolMultiply = 1.3f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}
