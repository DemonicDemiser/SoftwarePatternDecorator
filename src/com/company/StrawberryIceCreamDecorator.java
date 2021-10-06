package com.company;

public class StrawberryIceCreamDecorator extends IceCreamDecorator{

    public StrawberryIceCreamDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String addStrawberry(){
        return " This Ice Cream Has Strawberry. ";
    }

    @Override
    public Integer cost() {
        return super.cost() + 3;
    }

    @Override
    public String description() {
        return super.description() + addStrawberry();
    }
}
