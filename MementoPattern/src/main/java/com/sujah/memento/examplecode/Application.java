package com.sujah.memento.examplecode;

public class Application {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Cart cart = new Cart();

        cart.addItem(new Item("book"));
        cart.addItem(new Item("pen"));

        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("pencil"));
        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("phone"));
        careTaker.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("notebook"));
        careTaker.save(cart);
        System.out.println(cart);


        //Code for revert the cart state
        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);
        
    }
}
