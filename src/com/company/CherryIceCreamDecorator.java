package com.company;

public class CherryIceCreamDecorator extends IceCreamDecorator{

    public CherryIceCreamDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String addCherry(){
        return "Ice Cream with Cherry. ";
    }

    @Override
    public String description() {
        return super.description() + addCherry();
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}
