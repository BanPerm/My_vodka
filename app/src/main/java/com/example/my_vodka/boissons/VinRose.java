package com.example.my_vodka.boissons;

public class VinRose extends VinInterface {
    public VinRose(){
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // VinRose
    private static final String alcoolName = "VinRose";
    private static final String informations = "Parce que parfois, choisir entre le rouge et le blanc est trop compliqué.";
    private static final float alcoolPrice = 9;
    private static final float alcoolMultiply = 1.1f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}

