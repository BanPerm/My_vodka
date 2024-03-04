package com.example.my_vodka.boissons;

public class VinRouge extends VinInterface {
    public VinRouge(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }
    // VinRouge
    private final String alcoolName = "VinRouge";
    private final String informations = "Fait croire que vous avez un palais raffiné.";
    private final float alcoolPrice = 11;
    private final float alcoolMultiply = 1.3f;
    private final float bonusType = 2.2f;
    private final String speciality = "Accroît la passion";
}

