package com.example.my_vodka.boissons;

public class Sake extends AlcoolAbstract {
    public Sake() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Sake
    private static final String alcoolName = "Sake";
    private static final String informations = "Marre du raisin ? Passez au riz !";
    private static final float alcoolPrice = 18;
    private static final float alcoolMultiply = 1.4f;
    private static final boolean bonusType = false;
    private static final String speciality = "";
}

