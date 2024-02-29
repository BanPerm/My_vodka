package com.example.my_vodka.boissons;

abstract class AlcoolAbstract {
    protected String alcoolName;
    protected int alcoolCount;
    protected double alcoolPrice;
    protected double alcoolMultiply;
    protected String bonusType;
    protected String speciality;

    public AlcoolAbstract(String alcoolName, double alcoolPrice, double alcoolMultiply, String bonusType, String speciality) {
        this.alcoolName = alcoolName;
        this.alcoolPrice = alcoolPrice;
        this.alcoolMultiply = alcoolMultiply;
        this.bonusType = bonusType;
        this.speciality = speciality;
        this.alcoolCount = 0;
    }

    public abstract void addAlcool();

    public abstract void clickBouton();

    // Getters pour les attributs
    public String getalcoolName() {
        return alcoolName;
    }

    public int getalcoolCount() {
        return alcoolCount;
    }

    public double getalcoolPrice() {
        return alcoolPrice;
    }

    public double getalcoolMultiply() {
        return alcoolMultiply;
    }

    public String getbonusType() {
        return bonusType;
    }

    public String getspeciality() {
        return speciality;
    }
}
