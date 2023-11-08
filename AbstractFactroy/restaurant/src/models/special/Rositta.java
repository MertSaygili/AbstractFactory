package models.special;

import enums.SpecialType;
import interfaces.Special;

public class Rositta implements Special {

    private double price;

    public Rositta(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return "Rositta";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double setPrice(double price) {
        return this.price = price;
    }

    @Override
    public String getDescription() {
        return "Rositta is a special drink made by the restaurant";
    }

    @Override
    public String getCalories() {
        return "100";
    }

    @Override
    public SpecialType getSpecial() {
        return SpecialType.CHEF_SPECIAL;
    }
}
