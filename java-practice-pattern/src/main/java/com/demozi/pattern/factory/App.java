package com.demozi.pattern.factory;

/**
 * 工厂模式是一种常用的设计模式，它可以将对象的创建和使用进行分离，从而提高代码的可维护性和可扩展性。
 *
 *  下面是一个简单的Java工厂模式的例子：
 *
 *  假设我们有一个披萨店，它可以制作不同类型的披萨，比如意大利披萨、芝士披萨等等。我们可以使用工厂模式来创建这些不同类型的披萨。
 *
 * @author wujian  2023/3/27 20:23
 */
public class App {

    public static void main(String[] args) {
        Pizza italianPizza = PizzaFactory.createPizza("Italian");

        italianPizza.prepare();
        italianPizza.bake();
        italianPizza.cut();
        italianPizza.box();
    }

}
