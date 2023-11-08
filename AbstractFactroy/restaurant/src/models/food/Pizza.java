package models.food;

import interfaces.Meal;

import java.util.List;

public class Pizza implements Meal {

    private double price;

    public Pizza(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return "Pizza";
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
        return "Pizza is a savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients";
    }

    @Override
    public String getCalories() {
        return "1000";
    }

    @Override
    public List<String> getIngredients() {
        return List.of("Dough", "Tomato", "Cheese", "Onion", "Mushrooms", "Olives", "Pepperoni", "Bacon", "Sausage", "Pineapple", "Ham", "Chicken", "Beef", "Pork", "Salami", "Peppers", "Spinach", "Garlic", "Eggplant", "Basil", "Oregano", "Parsley", "Chili", "Barbecue Sauce", "Buffalo Sauce", "Ranch Sauce", "Blue Cheese Sauce", "Alfredo Sauce");
    }
}
