package com.demozi.pattern.factory;

/**
 * TODO
 *
 * @author wujian  2023/3/27 20:21
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Thin crust";
        sauce = "Marinara sauce";
        toppings.add("Mozzarella cheese");
        toppings.add("Fresh basil");
    }
}
