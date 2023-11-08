package models.food;

import interfaces.Meal;

import java.util.List;

public class Kebab implements Meal {

    private double price;

    public Kebab(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return "Kebab";
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
        return "Kebab is a Turkish dish made of meat cooked on a vertical rotisserie";
    }

    @Override
    public String getCalories() {
        return "500";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Meat", "Tomato", "Onion", "Lettuce", "Pita Bread");
    }
}
