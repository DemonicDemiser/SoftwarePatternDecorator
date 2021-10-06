package com.company;

public class CookieIceCreamDecorator extends IceCreamDecorator{

    public CookieIceCreamDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String addCookie(){
        return "Ice Cream With Cookie. ";
    }

    @Override
    public Integer cost() {
        return super.cost() + 2;
    }

    @Override
    public String description() {
        return super.description() + addCookie();
    }
}
