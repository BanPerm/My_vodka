package com.example.my_vodka.boissons;

public class Vodka extends AlcoolAbstract {
    public Vodka() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Vodka
    private static final String alcoolName = "Vodka";
    private static final String informations = "Pour oublier le froid de l'extérieur... et de l'intérieur. Au moins, vous avez vos amis les ours pour vous réchauffer !";
    private static final float alcoolPrice = 8;
    private static final float alcoolMultiply = 2.2f;
    private static final boolean bonusType = true;
    private static final String speciality = "";




}

