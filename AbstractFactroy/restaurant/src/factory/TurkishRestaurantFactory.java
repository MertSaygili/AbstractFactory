package factory;

import enums.CupSize;
import enums.Drinks;
import enums.Meals;
import enums.SpecialType;
import interfaces.Food;
import models.drink.Ayran;
import models.drink.Salgam;
import models.food.Doner;
import models.food.Kebab;
import models.special.TurkishCoffee;

public class TurkishRestaurantFactory extends AbstractFactory{

    @Override
    public Food getFood(Meals foodType, double price) {
        return switch (foodType) {
            case KEBAB -> new Kebab(price);
            case DONER -> new Doner(price);
            default -> null; // throw exception
        };
    }

    @Override
    public Food getSpecial(SpecialType specialType, double price) {
        return switch (specialType) {
            case CHEF_SPECIAL, CHEF_SPECIAL_2, CHEF_SPECIAL_1 -> new TurkishCoffee(price);
        };
    }

    @Override
    public Food getDrink(Drinks drinkType, double price, CupSize cupSize) {
        return switch (drinkType) {
            case AYRAN -> new Ayran(price, cupSize);
            case SALGAM -> new Salgam(price, cupSize);
            default -> null; // throw exception
        };
    }
}
