package com.example.my_vodka.boissons;

public class Tequila extends AlcoolAbstract {
    public Tequila(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Tequila
    private final String alcoolName = "Tequila";
    private final String informations = "Peut transformer une soirée ennuyeuse en une aventure inoubliable.";
    private final float alcoolPrice = 15;
    private final float alcoolMultiply = 2.0f;
    private final float bonusType = 4.0f;
    private final String speciality = "Débloque des mouvements de danse audacieux";


}

