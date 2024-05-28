package DesignPatternsProject.DefaultClasses;

public class Ingredient {

    private String name;

    private final double amount;

    private final Unit unit;

    public Ingredient(String name, double amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

}