package com.example.my_vodka.boissons;

public class VinBlanc extends VinInterface {
    public VinBlanc(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // VinBlanc
    private final String alcoolName = "VinBlanc";
    private final String informations = "Parfait pour prétendre comprendre l'art de la vinification.";
    private final float alcoolPrice = 10;
    private final float alcoolMultiply = 1.2f;
    private final float bonusType = 2.0f;
    private final String speciality = "Améliore les compétences culinaires";
}

