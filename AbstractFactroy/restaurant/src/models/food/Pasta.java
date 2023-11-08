package models.food;

import interfaces.Meal;

import java.util.List;

public class Pasta implements Meal {

    private double price;

    public Pasta(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return "Pasta";
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
        return "Pasta is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking";
    }

    @Override
    public String getCalories() {
        return "300";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Pasta", "Tomato", "Onion", "Lettuce", "Pita Bread");
    }
}
