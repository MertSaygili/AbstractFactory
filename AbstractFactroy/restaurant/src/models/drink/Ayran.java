package models.drink;

import enums.CupSize;
import interfaces.Drink;

public class Ayran implements Drink {

    private double price;
    private final CupSize cupSize;

    public Ayran(double price, CupSize cupSize) {
        this.price = price;
        this.cupSize = cupSize;
    }

    @Override
    public CupSize getCupSize() {
        return this.cupSize;
    }

    @Override
    public String getName() {
        return "Ayran";
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
        return "Ayran is a cold yogurt beverage mixed with salt. It is a popular drink in Turkey.";
    }

    @Override
    public String getCalories() {
        return switch (this.cupSize) {
            case SMALL -> "50";
            case MEDIUM -> "75";
            case LARGE -> "100";
        };

    }
}
