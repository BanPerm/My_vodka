package com.example.my_vodka.boissons;

public class Biere extends AlcoolAbstract {
    public Biere(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Biere
    private final String alcoolName = "Biere";
    private final String informations = "Parfait pour discuter philosophie ou regarder le foot.";
    private final float alcoolPrice = 5;
    private final float alcoolMultiply = 1.2f;
    private final float bonusType = 2.0f;
    private final String speciality = "Améliore les compétences en chant de karaoké";



}
