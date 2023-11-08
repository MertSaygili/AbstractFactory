package factory;

import enums.CupSize;
import enums.Drinks;
import enums.Meals;
import enums.SpecialType;
import interfaces.Food;
import models.drink.Cola;
import models.drink.Pepsi;
import models.food.Pasta;
import models.food.Pizza;
import models.special.Rositta;

public class ItalianRestaurantFactory extends AbstractFactory{

    @Override
    public Food getFood(Meals foodType, double price) {
        return switch (foodType) {
            case PIZZA -> new Pizza(price);
            case PASTA -> new Pasta(price);
            default -> null; // throw exception
        };
    }

    @Override
    public Food getSpecial(SpecialType specialType, double price) {
        return switch (specialType) {
            case CHEF_SPECIAL, CHEF_SPECIAL_2, CHEF_SPECIAL_1 -> new Rositta(price);
            default -> null; // throw exception
        };
    }

    @Override
    public Food getDrink(Drinks drinkType, double price, CupSize cupSize) {
        return switch (drinkType) {
            case COLA -> new Cola(price);
            case PEPSI -> new Pepsi(price);
            default -> null; // throw exception
        };
    }
}
