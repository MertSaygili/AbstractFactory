package factory;

import enums.CupSize;
import enums.Drinks;
import enums.Meals;
import enums.SpecialType;
import interfaces.Food;

public abstract class AbstractFactory {
    public abstract Food getFood(Meals foodType, double price);
    public abstract Food getSpecial(SpecialType specialType, double price);
    public abstract Food getDrink(Drinks drinkType, double price, CupSize cupSize);
}
