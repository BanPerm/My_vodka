package com.example.my_vodka.boissons;

public class Panache extends AlcoolAbstract {

    public Panache() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Panache
    private static final String alcoolName = "Panache";
    private static final String informations = "Pour ceux qui ne peuvent pas se décider entre une bière et un limonade quand il fait 45C°.";
    private static final float alcoolPrice = 6;
    private static final float alcoolMultiply = 1.5f;
    private static final boolean bonusType = false;
    private static final String speciality = "+1cps par Panache acheté";

}
