package factory;

import enums.Clothes;
import enums.Shoes;
import interfaces.IAbstractFactory;
import interfaces.IClothes;
import interfaces.IShoes;
import models.IstanbulClothes;
import models.IstanbulShoes;

public class IstanbulFactory implements IAbstractFactory {
    @Override
    public IClothes productClothes(String color, String size, Clothes type) {
        return new IstanbulClothes(color, size, type);
    }
    @Override
    public IShoes productShoes(String color, String size, Shoes type) {
        return new IstanbulShoes(color, size, type);
    }
}
