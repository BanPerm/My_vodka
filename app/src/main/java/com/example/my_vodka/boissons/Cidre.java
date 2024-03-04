package com.example.my_vodka.boissons;

public class Cidre extends AlcoolAbstract {
    public Cidre() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Cidre
    private static final String alcoolName = "Cidre";
    private static final String informations = "Idéal pour ceux qui aiment leurs pommes un peu fermentées.";
    private static final float alcoolPrice = 7;
    private static final float alcoolMultiply = 1.1f;
    private static final boolean bonusType = false;
    private static final String speciality = "";

}
