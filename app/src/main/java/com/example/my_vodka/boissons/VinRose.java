package com.example.my_vodka.boissons;

public class VinRose extends VinInterface {
    public VinRose(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // VinRose
    private final String alcoolName = "VinRose";
    private final String informations = "Parce que parfois, choisir entre le rouge et le blanc est trop compliqué.";
    private final float alcoolPrice = 9;
    private final float alcoolMultiply = 1.1f;
    private final float bonusType = 1.8f;
    private final String speciality = "Rend les pique-niques inoubliables";
}

