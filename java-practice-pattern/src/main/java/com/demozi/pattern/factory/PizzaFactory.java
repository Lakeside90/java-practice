package com.demozi.pattern.factory;

/**
 * 我们定义一个工厂类来创建不同类型的披萨：
 *
 * @author wujian  2023/3/27 20:20
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Italian")) {
            pizza = new ItalianPizza();
        } else if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        }

        return pizza;
    }
}
