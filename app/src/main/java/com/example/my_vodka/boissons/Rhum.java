package com.example.my_vodka.boissons;

public class Rhum extends AlcoolAbstract {
    public Rhum(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Rhum
    private final String alcoolName = "Rhum";
    private final String informations = "Idéal pour se sentir pirate, même en pleine ville.";
    private final float alcoolPrice = 12;
    private final float alcoolMultiply = 1.8f;
    private final float bonusType = 3.5f;
    private final String speciality = "Débloque des histoires incroyables";
}
