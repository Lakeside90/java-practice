package com.demozi.pattern.factory;

/**
 * TODO
 *
 * @author wujian  2023/3/27 20:19
 */
public class ItalianPizza extends Pizza {
    public ItalianPizza() {
        name = "Italian Pizza";
        dough = "Thin crust";
        sauce = "Marinara sauce";
        toppings.add("Mozzarella cheese");
        toppings.add("Fresh basil");
    }

}
