package com.company;

public class ChocolateIceCream implements IceCream{

    @Override
    public Integer cost() {
        return 1;
    }

    @Override
    public String description() {
        return " This Chocolate Ice Cream. ";
    }
}
