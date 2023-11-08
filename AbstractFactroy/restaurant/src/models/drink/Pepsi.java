package models.drink;

import enums.CupSize;
import interfaces.Drink;

public class Pepsi implements Drink {

    private double price;

    public Pepsi(double price) {
        this.price = price;
    }

    @Override
    public CupSize getCupSize() {
        return CupSize.MEDIUM;
    }

    @Override
    public String getName() {
        return "Pepsi";
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
        return "Pepsi is a carbonated soft drink manufactured by PepsiCo";
    }

    @Override
    public String getCalories() {
        return "150";
    }
}
