package com.example.my_vodka.boissons;

public class Whisky extends AlcoolAbstract {
    public Whisky() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Whisky
    private static final String alcoolName = "Whisky";
    private static final String informations = "Pour se sentir comme un dur à cuire, même en pyjama. Améliore les compétences en storytelling.";
    private static final float alcoolPrice = 25;
    private static final float alcoolMultiply = 2.0f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}

