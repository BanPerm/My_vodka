package com.example.my_vodka.boissons;

public class Biere extends AlcoolAbstract {
    public Biere() {
        super(informations, alcoolName, alcoolPrice, alcoolMultiply, bonusType, speciality);
    }

    // Biere
    private static final String alcoolName = "Biere";
    private static final String informations = "Une, deux, trois, TORNADOOOOO ! Parfait pour discuter philosophie ou regarder le foot.";
    private static final float alcoolPrice = 5;
    private static final float alcoolMultiply = 1.2f;
    private static final boolean bonusType = false;
    private static final String speciality = "";

}
