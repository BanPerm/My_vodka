package com.example.my_vodka.boissons;

public class Sake extends AlcoolAbstract {
    public Sake(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Sake
    private final String alcoolName = "Sake";
    private final String informations = "Pour ceux qui veulent leur alcool cuit à la vapeur.";
    private final float alcoolPrice = 18;
    private final float alcoolMultiply = 1.4f;
    private final float bonusType = 2.8f;
    private final String speciality = "Augmente la sagesse";


}

