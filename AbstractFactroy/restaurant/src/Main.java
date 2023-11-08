import enums.CupSize;
import enums.Drinks;
import enums.Meals;
import enums.SpecialType;
import factory.AbstractFactory;
import factory.ItalianRestaurantFactory;
import factory.TurkishRestaurantFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory turkishRestaurantFactory = new TurkishRestaurantFactory();
        AbstractFactory italianRestaurantFactory = new ItalianRestaurantFactory();

        // Turkish Restaurant
        System.out.println("Turkish Restaurant");
        System.out.println("Food: " + turkishRestaurantFactory.getFood(Meals.KEBAB, 20.0).getName());
        System.out.println("Food: " + turkishRestaurantFactory.getDrink(Drinks.AYRAN, 20.0, CupSize.LARGE).getName());
        System.out.println("Special: " + turkishRestaurantFactory.getSpecial(SpecialType.CHEF_SPECIAL, 30.0).getName());

        System.out.println("----------------------------------------------------------------------------------------");

        // Italian Restaurant
        System.out.println("Italian Restaurant");
        System.out.println("Food: " + italianRestaurantFactory.getFood(Meals.PIZZA, 30.0).getName());
    }
}