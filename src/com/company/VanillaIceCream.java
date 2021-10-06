package com.company;

public class VanillaIceCream implements IceCream{

    @Override
    public Integer cost() {
        return 2;
    }

    @Override
    public String description() {
        return "This is Vanilla Ice Cream. ";
    }
}
