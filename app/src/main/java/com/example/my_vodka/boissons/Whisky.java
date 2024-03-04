package com.example.my_vodka.boissons;

public class Whisky extends AlcoolAbstract {
    public Whisky(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Whisky
    private final String alcoolName = "Whisky";
    private final String informations = "Pour se sentir comme un dur à cuire, même en pyjama.";
    private final float alcoolPrice = 25;
    private final float alcoolMultiply = 2.0f;
    private final float bonusType = 4.0f;
    private final String speciality = "Améliore les compétences en storytelling";
}

