package com.example.my_vodka.boissons;

public class Vodka extends AlcoolAbstract {
    public Vodka(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Vodka
    private final String alcoolName = "Vodka";
    private final String informations = "Pour oublier le froid de l'extérieur... et de l'intérieur.";
    private final float alcoolPrice = 8;
    private final float alcoolMultiply = 2.2f;
    private final float bonusType = 4.5f;
    private final String speciality = "Procure une résistance au froid";


}

