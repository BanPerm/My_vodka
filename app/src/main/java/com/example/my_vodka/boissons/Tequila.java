package com.example.my_vodka.boissons;

public class Tequila extends AlcoolAbstract {
    public Tequila() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Tequila
    private static final String alcoolName = "Tequila";
    private static final String informations = "Débloque des mouvements de danse audacieux... et mamie n'a plus d'arthrose !";
    private static final float alcoolPrice = 15;
    private static final float alcoolMultiply = 2.0f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}

