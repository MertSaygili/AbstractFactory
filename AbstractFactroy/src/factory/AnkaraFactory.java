package factory;

import enums.Clothes;
import enums.Shoes;
import interfaces.IAbstractFactory;
import interfaces.IClothes;
import interfaces.IShoes;
import models.AnkaraClothes;
import models.AnkaraShoes;

public class AnkaraFactory implements IAbstractFactory {
    @Override
    public IClothes productClothes(String color, String size, Clothes type) {
        return new AnkaraClothes(color, size, type);
    }

    @Override
    public IShoes productShoes(String color, String size, Shoes type) {
        return new AnkaraShoes(color, size, type);
    }
}
