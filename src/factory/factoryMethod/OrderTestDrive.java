package factory.factoryMethod;

import factory.factoryMethod.pizza.Pizza;

public class OrderTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chStore.orderPizza("cheese");
        System.out.println("Jhon ordered a " + pizza.getName() + "\n");
    }
}
