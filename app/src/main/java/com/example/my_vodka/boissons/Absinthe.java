package com.example.my_vodka.boissons;

public class Absinthe extends AlcoolAbstract {

    public Absinthe(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }



    // Absinthe
    private final String alcoolName = "Absinthe";
    private final String informations = "Garantie de voir la fée verte après seulement deux verres.";
    private final float alcoolPrice = 20;
    private final float alcoolMultiply = 2.5f;
    private final float bonusType = 5.0f;
    private final String speciality = "Débloque des visions artistiques";

}
