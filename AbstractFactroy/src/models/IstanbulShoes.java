package models;

import enums.Shoes;
import interfaces.IShoes;

public class IstanbulShoes implements IShoes {

    private String color;
    private String size;
    private Shoes type;

    public IstanbulShoes(String color, String size, Shoes type) {
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
    public Shoes getType() {
        return type;
    }
}
