package models.drink;

import enums.CupSize;
import interfaces.Drink;

public class Cola implements Drink {

    private double price;

    public Cola(double price) {
        this.price = price;
    }

    @Override
    public CupSize getCupSize() {
        return CupSize.MEDIUM;
    }

    @Override
    public String getName() {
        return "Cola";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double setPrice(double price) {
        this.price = price;
        return this.price;
    }

    @Override
    public String getDescription() {
        return "Cola is a carbonated soft drink manufactured by The Coca-Cola Company";
    }

    @Override
    public String getCalories() {
        return "200";
    }
}
