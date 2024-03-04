package com.example.my_vodka.boissons;

public class Panache extends AlcoolAbstract {

    public Panache(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Panache
    private final String alcoolName = "Panache";
    private final String informations = "Pour ceux qui ne peuvent pas se décider entre une bière et un limonade.";
    private final float alcoolPrice = 6;
    private final float alcoolMultiply = 1.0f;
    private final float bonusType = 1.0f;
    private final String speciality = "Rafraîchit pendant les chaudes journées d'été";
}
