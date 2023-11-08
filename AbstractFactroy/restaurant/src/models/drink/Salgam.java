package models.drink;

import enums.CupSize;
import interfaces.Drink;

public class Salgam implements Drink {

    private double price;
    private CupSize cupSize;

    public Salgam(double price, CupSize cupSize) {
        this.price = price;
        this.cupSize = cupSize;
    }
    @Override
    public CupSize getCupSize() {
        return this.cupSize;
    }

    @Override
    public String getName() {
        return "Salgam";
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
        return "Salgam special Turkish drink";
    }

    @Override
    public String getCalories() {
        return switch (this.cupSize) {
            case SMALL -> "100";
            case MEDIUM -> "200";
            case LARGE -> "300";
        };
    }
}
