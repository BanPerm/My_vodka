package com.example.my_vodka.boissons;

public class Cidre extends AlcoolAbstract {
    public Cidre(String informations, String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        super(informations, nomAlcool, prix, multiplicateur, typeBonus, specialite);
    }

    // Cidre
    private final String alcoolName = "Cidre";
    private final String informations = "Idéal pour ceux qui aiment leurs pommes un peu fermentées.";
    private final float alcoolPrice = 7;
    private final float alcoolMultiply = 1.1f;
    private final float bonusType = 1.5f;
    private final String speciality = "Augmente la convivialité";


}
