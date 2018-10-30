package factory.simpleFactory;

import factory.simpleFactory.pizza.Pizza;

public class OrderTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza1, pizza2;
        pizza1 = store.orderPizza("Cheese");
        System.out.println(pizza1.getName() + " is ready\n");
        pizza2 = store.orderPizza("Margarita");
        System.out.println(pizza2.getName() + " is ready\n");
    }
}
