package com.example.my_vodka.boissons;

public class EauDeVie extends AlcoolAbstract {
    public EauDeVie() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // EauDeVie
    private static final String alcoolName = "EauDeVie";
    private static final String informations = "Aussi proche que possible de boire le feu. Rallonge la vie... ou pas.";
    private static final float alcoolPrice = 15;
    private static final float alcoolMultiply = 3.0f;
    private static final boolean bonusType = true;
    private static final String speciality = "";
}
