package factory.abstractFactory;

import factory.abstractFactory.pizza.Pizza;

public class OrderTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Michael ordered " + pizza);
    }
}
