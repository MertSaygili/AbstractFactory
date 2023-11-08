package models.special;

import enums.SpecialType;
import interfaces.Special;

public class TurkishCoffee implements Special {

    private double price;

    public TurkishCoffee(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return "Turkish Coffee";
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
        return "Turkish coffee is a method of preparing coffee using very finely ground coffee beans without filtering";
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
