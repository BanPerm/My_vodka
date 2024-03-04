package com.example.my_vodka.boissons;

public class Cognac extends AlcoolAbstract {
    public Cognac() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Cognac
    private static final String alcoolName = "Cognac";
    private static final String informations = "Pour les soirées où vous voulez vous sentir important. Augmente le charisme... et le taux d'alcool dans le sang aussi.";
    private static final float alcoolPrice = 30;
    private static final float alcoolMultiply = 1.5f;
    private static final boolean bonusType = false;
    private static final String speciality = "";

}
