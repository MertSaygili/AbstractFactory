package interfaces;

import enums.Clothes;
import enums.Shoes;

//* Clothes Abstract Factory
public interface IAbstractFactory {
    public IClothes productClothes(String color, String size, Clothes type);
    public IShoes productShoes(String color, String size, Shoes type);
}
