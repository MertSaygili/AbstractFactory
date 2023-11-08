package models;

import enums.Clothes;
import interfaces.IClothes;

public class AnkaraClothes implements IClothes {
    private String color;
    private String size;
    private Clothes type;

    public AnkaraClothes(String color, String size, Clothes type) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public Clothes getType() {
        return type;
    }
}
