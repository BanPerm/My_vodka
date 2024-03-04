package com.example.my_vodka.boissons;

public class Rhum extends AlcoolAbstract {
    public Rhum() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Rhum
    private static final String alcoolName = "Rhum";
    private static final String informations = "Débloque des histoires incroyables. Idéal pour se sentir pirate, même en pleine ville.";
    private static final float alcoolPrice = 12;
    private static final float alcoolMultiply = 1.8f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}
