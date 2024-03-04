package com.example.my_vodka.boissons;

public class Cocoroco extends AlcoolAbstract {
    public Cocoroco(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Cocoroco
    private final String alcoolName = "Cocoroco";
    private final String informations = "Si fort qu'il pourrait faire démarrer un camion.";
    private final float alcoolPrice = 25;
    private final float alcoolMultiply = 4.0f;
    private final float bonusType = 8.0f;
    private final String speciality = "Fournit une immunité temporaire au froid";
}
