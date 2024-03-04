package com.example.my_vodka.boissons;

public class Pastis extends AlcoolAbstract {
    public Pastis(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Pastis
    private final String alcoolName = "Pastis";
    private final String informations = "Transforme instantanément n'importe quel endroit en Provence.";
    private final float alcoolPrice = 10;
    private final float alcoolMultiply = 1.3f;
    private final float bonusType = 2.5f;
    private final String speciality = "Augmente la sociabilité";
}
