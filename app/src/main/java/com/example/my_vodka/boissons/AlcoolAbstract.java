package com.example.my_vodka.boissons;

abstract class AlcoolAbstract {
    protected String nomAlcool;
    protected int compteurAlcool;
    protected double prix;
    protected double multiplicateur;
    protected String typeBonus;
    protected String specialite;

    public AlcoolAbstract(String nomAlcool, double prix, double multiplicateur, String typeBonus, String specialite) {
        this.nomAlcool = nomAlcool;
        this.prix = prix;
        this.multiplicateur = multiplicateur;
        this.typeBonus = typeBonus;
        this.specialite = specialite;
        this.compteurAlcool = 0;
    }

    public abstract void addAlcool();

    public abstract void clickBouton();

    // Getters pour les attributs
    public String getNomAlcool() {
        return nomAlcool;
    }

    public int getCompteurAlcool() {
        return compteurAlcool;
    }

    public double getPrix() {
        return prix;
    }

    public double getMultiplicateur() {
        return multiplicateur;
    }

    public String getTypeBonus() {
        return typeBonus;
    }

    public String getSpecialite() {
        return specialite;
    }
}
