package com.company;

public class Main {

    public static void main(String[] args) {
        IceCream iceCream = new StrawberryIceCreamDecorator(new CherryIceCreamDecorator(new CookieIceCreamDecorator(new VanillaIceCream())));

        //IceCream iceCream = new StrawberryIceCreamDecorator(new VanillaIceCream());

        System.out.println(iceCream.description());
    }
}
