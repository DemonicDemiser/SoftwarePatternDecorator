package com.company;

public class IceCreamDecorator implements IceCream{

    //aggregation
    private IceCream iceCream;

    //dependency injection
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public Integer cost() {
        return iceCream.cost() + 2;
    }

    @Override
    public String description() {
        return iceCream.description();
    }
}
