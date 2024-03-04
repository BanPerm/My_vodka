package com.example.my_vodka.boissons;

public class EauDeVie extends AlcoolAbstract {
    public EauDeVie(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // EauDeVie
    private final String alcoolName = "EauDeVie";
    private final String informations = "Aussi proche que possible de boire le feu.";
    private final float alcoolPrice = 15;
    private final float alcoolMultiply = 3.0f;
    private final float bonusType = 6.0f;
    private final String speciality = "Rallonge la vie... ou pas.";


}
