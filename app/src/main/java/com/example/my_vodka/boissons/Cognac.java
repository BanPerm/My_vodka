package com.example.my_vodka.boissons;

public class Cognac extends AlcoolAbstract {
    public Cognac(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Cognac
    private final String alcoolName = "Cognac";
    private final String informations = "Pour les soirées où vous voulez vous sentir important.";
    private final float alcoolPrice = 30;
    private final float alcoolMultiply = 1.5f;
    private final float bonusType = 3.0f;
    private final String speciality = "Augmente le charisme";

}
